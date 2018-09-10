
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestPaymentParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestPaymentParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://payments.webservices.cyclos.strohalm.nl/}abstractPaymentParameters">
 *       &lt;sequence>
 *         &lt;element name="destinationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestPaymentParameters", propOrder = {
    "destinationChannel"
})
public class RequestPaymentParameters
    extends AbstractPaymentParameters
{

    protected String destinationChannel;

    /**
     * Gets the value of the destinationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationChannel() {
        return destinationChannel;
    }

    /**
     * Sets the value of the destinationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationChannel(String value) {
        this.destinationChannel = value;
    }

}
