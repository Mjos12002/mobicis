
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mobivat.mobivat_is.cyclos_payment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SimulatePayment_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "simulatePayment");
    private final static QName _DoPaymentResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doPaymentResponse");
    private final static QName _DoBulkReverse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doBulkReverse");
    private final static QName _ExpireTicketResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "expireTicketResponse");
    private final static QName _ReverseResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "reverseResponse");
    private final static QName _Chargeback_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "chargeback");
    private final static QName _DoBulkReverseResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doBulkReverseResponse");
    private final static QName _ConfirmPayment_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "confirmPayment");
    private final static QName _ConfirmPaymentResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "confirmPaymentResponse");
    private final static QName _SimulatePaymentResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "simulatePaymentResponse");
    private final static QName _ChargebackResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "chargebackResponse");
    private final static QName _DoBulkChargeback_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doBulkChargeback");
    private final static QName _Reverse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "reverse");
    private final static QName _ExpireTicket_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "expireTicket");
    private final static QName _RequestPaymentConfirmationResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "requestPaymentConfirmationResponse");
    private final static QName _DoBulkChargebackResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doBulkChargebackResponse");
    private final static QName _DoPayment_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doPayment");
    private final static QName _DoBulkPaymentResponse_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doBulkPaymentResponse");
    private final static QName _DoBulkPayment_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "doBulkPayment");
    private final static QName _RequestPaymentConfirmation_QNAME = new QName("http://payments.webservices.cyclos.strohalm.nl/", "requestPaymentConfirmation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mobivat.mobivat_is.cyclos_payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestPaymentConfirmation }
     * 
     */
    public RequestPaymentConfirmation createRequestPaymentConfirmation() {
        return new RequestPaymentConfirmation();
    }

    /**
     * Create an instance of {@link DoBulkPayment }
     * 
     */
    public DoBulkPayment createDoBulkPayment() {
        return new DoBulkPayment();
    }

    /**
     * Create an instance of {@link DoBulkPaymentResponse }
     * 
     */
    public DoBulkPaymentResponse createDoBulkPaymentResponse() {
        return new DoBulkPaymentResponse();
    }

    /**
     * Create an instance of {@link DoBulkChargebackResponse }
     * 
     */
    public DoBulkChargebackResponse createDoBulkChargebackResponse() {
        return new DoBulkChargebackResponse();
    }

    /**
     * Create an instance of {@link DoPayment }
     * 
     */
    public DoPayment createDoPayment() {
        return new DoPayment();
    }

    /**
     * Create an instance of {@link ChargebackResponse }
     * 
     */
    public ChargebackResponse createChargebackResponse() {
        return new ChargebackResponse();
    }

    /**
     * Create an instance of {@link DoBulkChargeback }
     * 
     */
    public DoBulkChargeback createDoBulkChargeback() {
        return new DoBulkChargeback();
    }

    /**
     * Create an instance of {@link Reverse }
     * 
     */
    public Reverse createReverse() {
        return new Reverse();
    }

    /**
     * Create an instance of {@link SimulatePaymentResponse }
     * 
     */
    public SimulatePaymentResponse createSimulatePaymentResponse() {
        return new SimulatePaymentResponse();
    }

    /**
     * Create an instance of {@link ExpireTicket }
     * 
     */
    public ExpireTicket createExpireTicket() {
        return new ExpireTicket();
    }

    /**
     * Create an instance of {@link RequestPaymentConfirmationResponse }
     * 
     */
    public RequestPaymentConfirmationResponse createRequestPaymentConfirmationResponse() {
        return new RequestPaymentConfirmationResponse();
    }

    /**
     * Create an instance of {@link ConfirmPayment }
     * 
     */
    public ConfirmPayment createConfirmPayment() {
        return new ConfirmPayment();
    }

    /**
     * Create an instance of {@link ConfirmPaymentResponse }
     * 
     */
    public ConfirmPaymentResponse createConfirmPaymentResponse() {
        return new ConfirmPaymentResponse();
    }

    /**
     * Create an instance of {@link ReverseResponse }
     * 
     */
    public ReverseResponse createReverseResponse() {
        return new ReverseResponse();
    }

    /**
     * Create an instance of {@link Chargeback }
     * 
     */
    public Chargeback createChargeback() {
        return new Chargeback();
    }

    /**
     * Create an instance of {@link DoBulkReverseResponse }
     * 
     */
    public DoBulkReverseResponse createDoBulkReverseResponse() {
        return new DoBulkReverseResponse();
    }

    /**
     * Create an instance of {@link DoBulkReverse }
     * 
     */
    public DoBulkReverse createDoBulkReverse() {
        return new DoBulkReverse();
    }

    /**
     * Create an instance of {@link ExpireTicketResponse }
     * 
     */
    public ExpireTicketResponse createExpireTicketResponse() {
        return new ExpireTicketResponse();
    }

    /**
     * Create an instance of {@link SimulatePayment }
     * 
     */
    public SimulatePayment createSimulatePayment() {
        return new SimulatePayment();
    }

    /**
     * Create an instance of {@link DoPaymentResponse }
     * 
     */
    public DoPaymentResponse createDoPaymentResponse() {
        return new DoPaymentResponse();
    }

    /**
     * Create an instance of {@link ConfirmPaymentParameters }
     * 
     */
    public ConfirmPaymentParameters createConfirmPaymentParameters() {
        return new ConfirmPaymentParameters();
    }

    /**
     * Create an instance of {@link RequestPaymentParameters }
     * 
     */
    public RequestPaymentParameters createRequestPaymentParameters() {
        return new RequestPaymentParameters();
    }

    /**
     * Create an instance of {@link PaymentResult }
     * 
     */
    public PaymentResult createPaymentResult() {
        return new PaymentResult();
    }

    /**
     * Create an instance of {@link FieldValue }
     * 
     */
    public FieldValue createFieldValue() {
        return new FieldValue();
    }

    /**
     * Create an instance of {@link AccountStatus }
     * 
     */
    public AccountStatus createAccountStatus() {
        return new AccountStatus();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link PaymentParameters }
     * 
     */
    public PaymentParameters createPaymentParameters() {
        return new PaymentParameters();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link RequestPaymentResult }
     * 
     */
    public RequestPaymentResult createRequestPaymentResult() {
        return new RequestPaymentResult();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link ChargebackResult }
     * 
     */
    public ChargebackResult createChargebackResult() {
        return new ChargebackResult();
    }

    /**
     * Create an instance of {@link TransferType }
     * 
     */
    public TransferType createTransferType() {
        return new TransferType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimulatePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "simulatePayment")
    public JAXBElement<SimulatePayment> createSimulatePayment(SimulatePayment value) {
        return new JAXBElement<SimulatePayment>(_SimulatePayment_QNAME, SimulatePayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doPaymentResponse")
    public JAXBElement<DoPaymentResponse> createDoPaymentResponse(DoPaymentResponse value) {
        return new JAXBElement<DoPaymentResponse>(_DoPaymentResponse_QNAME, DoPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBulkReverse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doBulkReverse")
    public JAXBElement<DoBulkReverse> createDoBulkReverse(DoBulkReverse value) {
        return new JAXBElement<DoBulkReverse>(_DoBulkReverse_QNAME, DoBulkReverse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpireTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "expireTicketResponse")
    public JAXBElement<ExpireTicketResponse> createExpireTicketResponse(ExpireTicketResponse value) {
        return new JAXBElement<ExpireTicketResponse>(_ExpireTicketResponse_QNAME, ExpireTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "reverseResponse")
    public JAXBElement<ReverseResponse> createReverseResponse(ReverseResponse value) {
        return new JAXBElement<ReverseResponse>(_ReverseResponse_QNAME, ReverseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Chargeback }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "chargeback")
    public JAXBElement<Chargeback> createChargeback(Chargeback value) {
        return new JAXBElement<Chargeback>(_Chargeback_QNAME, Chargeback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBulkReverseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doBulkReverseResponse")
    public JAXBElement<DoBulkReverseResponse> createDoBulkReverseResponse(DoBulkReverseResponse value) {
        return new JAXBElement<DoBulkReverseResponse>(_DoBulkReverseResponse_QNAME, DoBulkReverseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "confirmPayment")
    public JAXBElement<ConfirmPayment> createConfirmPayment(ConfirmPayment value) {
        return new JAXBElement<ConfirmPayment>(_ConfirmPayment_QNAME, ConfirmPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "confirmPaymentResponse")
    public JAXBElement<ConfirmPaymentResponse> createConfirmPaymentResponse(ConfirmPaymentResponse value) {
        return new JAXBElement<ConfirmPaymentResponse>(_ConfirmPaymentResponse_QNAME, ConfirmPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimulatePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "simulatePaymentResponse")
    public JAXBElement<SimulatePaymentResponse> createSimulatePaymentResponse(SimulatePaymentResponse value) {
        return new JAXBElement<SimulatePaymentResponse>(_SimulatePaymentResponse_QNAME, SimulatePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargebackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "chargebackResponse")
    public JAXBElement<ChargebackResponse> createChargebackResponse(ChargebackResponse value) {
        return new JAXBElement<ChargebackResponse>(_ChargebackResponse_QNAME, ChargebackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBulkChargeback }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doBulkChargeback")
    public JAXBElement<DoBulkChargeback> createDoBulkChargeback(DoBulkChargeback value) {
        return new JAXBElement<DoBulkChargeback>(_DoBulkChargeback_QNAME, DoBulkChargeback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reverse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "reverse")
    public JAXBElement<Reverse> createReverse(Reverse value) {
        return new JAXBElement<Reverse>(_Reverse_QNAME, Reverse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpireTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "expireTicket")
    public JAXBElement<ExpireTicket> createExpireTicket(ExpireTicket value) {
        return new JAXBElement<ExpireTicket>(_ExpireTicket_QNAME, ExpireTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPaymentConfirmationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "requestPaymentConfirmationResponse")
    public JAXBElement<RequestPaymentConfirmationResponse> createRequestPaymentConfirmationResponse(RequestPaymentConfirmationResponse value) {
        return new JAXBElement<RequestPaymentConfirmationResponse>(_RequestPaymentConfirmationResponse_QNAME, RequestPaymentConfirmationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBulkChargebackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doBulkChargebackResponse")
    public JAXBElement<DoBulkChargebackResponse> createDoBulkChargebackResponse(DoBulkChargebackResponse value) {
        return new JAXBElement<DoBulkChargebackResponse>(_DoBulkChargebackResponse_QNAME, DoBulkChargebackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doPayment")
    public JAXBElement<DoPayment> createDoPayment(DoPayment value) {
        return new JAXBElement<DoPayment>(_DoPayment_QNAME, DoPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBulkPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doBulkPaymentResponse")
    public JAXBElement<DoBulkPaymentResponse> createDoBulkPaymentResponse(DoBulkPaymentResponse value) {
        return new JAXBElement<DoBulkPaymentResponse>(_DoBulkPaymentResponse_QNAME, DoBulkPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoBulkPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "doBulkPayment")
    public JAXBElement<DoBulkPayment> createDoBulkPayment(DoBulkPayment value) {
        return new JAXBElement<DoBulkPayment>(_DoBulkPayment_QNAME, DoBulkPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPaymentConfirmation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payments.webservices.cyclos.strohalm.nl/", name = "requestPaymentConfirmation")
    public JAXBElement<RequestPaymentConfirmation> createRequestPaymentConfirmation(RequestPaymentConfirmation value) {
        return new JAXBElement<RequestPaymentConfirmation>(_RequestPaymentConfirmation_QNAME, RequestPaymentConfirmation.class, null, value);
    }

}
