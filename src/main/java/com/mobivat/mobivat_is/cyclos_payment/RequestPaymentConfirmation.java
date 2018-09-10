
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestPaymentConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestPaymentConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://payments.webservices.cyclos.strohalm.nl/}requestPaymentParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestPaymentConfirmation", propOrder = {
    "params"
})
public class RequestPaymentConfirmation {

    protected RequestPaymentParameters params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPaymentParameters }
     *     
     */
    public RequestPaymentParameters getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPaymentParameters }
     *     
     */
    public void setParams(RequestPaymentParameters value) {
        this.params = value;
    }

}
