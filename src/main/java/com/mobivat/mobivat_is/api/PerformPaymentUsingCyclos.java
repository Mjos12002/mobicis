package com.mobivat.mobivat_is.api;

import com.mobivat.mobivat_is.cyclos_payment.Payment;
import com.mobivat.mobivat_is.cyclos_payment.PaymentParameters;
import com.mobivat.mobivat_is.cyclos_payment.PaymentResult;
import com.mobivat.mobivat_is.cyclos_payment.PaymentWebService;
import com.mobivat.mobivat_is.entity.CyclosPaymentEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api")
public class PerformPaymentUsingCyclos {
    @RequestMapping(value = "/dopayment", method = RequestMethod.POST)
    public String doPayment(@ModelAttribute CyclosPaymentEntity cyclosPaymentEntity, Model model){

        Payment payment = new Payment();
        PaymentWebService paymentWebService = payment.getPaymentPort();
        PaymentParameters paymentParameters = new PaymentParameters();
        paymentParameters.setFromSystem(true);
        paymentParameters.setToMemberPrincipalType("USER");
        paymentParameters.setToMember(cyclosPaymentEntity.getTo());
        paymentParameters.setTransferTypeId(cyclosPaymentEntity.getTransferTypeID());
        paymentParameters.setAmount(new BigDecimal(cyclosPaymentEntity.getAmount()));
        paymentParameters.setDescription(cyclosPaymentEntity.getDescription());
        PaymentResult paymentResult = paymentWebService.doPayment(paymentParameters);
        float taxDue = (cyclosPaymentEntity.getAmount() * 18) / 100;
        float netTransactionAmount = cyclosPaymentEntity.getAmount() - taxDue;
        String rraPayment = this.memberToSystemPayment(cyclosPaymentEntity.getTo(), taxDue, new Long(37), cyclosPaymentEntity.getDescription());
        String netTransaction = this.memberToSystemPayment(cyclosPaymentEntity.getTo(), netTransactionAmount, new Long(49), cyclosPaymentEntity.getDescription());
        return paymentResult.getStatus().value() + " // " + rraPayment + " // " + netTransaction;
    }

    public String memberToSystemPayment(String from, float amount, Long transferTypeID, String description){
        Payment payment = new Payment();
        PaymentWebService paymentWebService = payment.getPaymentPort();
        PaymentParameters paymentParameters = new PaymentParameters();
        paymentParameters.setToSystem(true);
        paymentParameters.setFromMemberPrincipalType("USER");
        paymentParameters.setFromMember(from);
        paymentParameters.setAmount(new BigDecimal(amount));
        paymentParameters.setTransferTypeId(transferTypeID);
        paymentParameters.setDescription(description);
        PaymentResult paymentResult = paymentWebService.doPayment(paymentParameters);
        return paymentResult.getStatus().value();
    }



}
