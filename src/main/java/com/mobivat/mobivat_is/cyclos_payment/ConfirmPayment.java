
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confirmPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://payments.webservices.cyclos.strohalm.nl/}confirmPaymentParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmPayment", propOrder = {
    "params"
})
public class ConfirmPayment {

    protected ConfirmPaymentParameters params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmPaymentParameters }
     *     
     */
    public ConfirmPaymentParameters getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmPaymentParameters }
     *     
     */
    public void setParams(ConfirmPaymentParameters value) {
        this.params = value;
    }

}
