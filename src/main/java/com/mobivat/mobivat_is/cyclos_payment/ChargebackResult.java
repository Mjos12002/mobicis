
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chargebackResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargebackResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://payments.webservices.cyclos.strohalm.nl/}chargebackStatus" minOccurs="0"/>
 *         &lt;element name="originalTransfer" type="{http://payments.webservices.cyclos.strohalm.nl/}transfer" minOccurs="0"/>
 *         &lt;element name="chargebackTransfer" type="{http://payments.webservices.cyclos.strohalm.nl/}transfer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargebackResult", propOrder = {
    "status",
    "originalTransfer",
    "chargebackTransfer"
})
public class ChargebackResult {

    @XmlSchemaType(name = "string")
    protected ChargebackStatus status;
    protected Transfer originalTransfer;
    protected Transfer chargebackTransfer;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ChargebackStatus }
     *     
     */
    public ChargebackStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargebackStatus }
     *     
     */
    public void setStatus(ChargebackStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the originalTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer }
     *     
     */
    public Transfer getOriginalTransfer() {
        return originalTransfer;
    }

    /**
     * Sets the value of the originalTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer }
     *     
     */
    public void setOriginalTransfer(Transfer value) {
        this.originalTransfer = value;
    }

    /**
     * Gets the value of the chargebackTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer }
     *     
     */
    public Transfer getChargebackTransfer() {
        return chargebackTransfer;
    }

    /**
     * Sets the value of the chargebackTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer }
     *     
     */
    public void setChargebackTransfer(Transfer value) {
        this.chargebackTransfer = value;
    }

}
