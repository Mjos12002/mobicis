
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://payments.webservices.cyclos.strohalm.nl/}paymentStatus" minOccurs="0"/>
 *         &lt;element name="transfer" type="{http://payments.webservices.cyclos.strohalm.nl/}transfer" minOccurs="0"/>
 *         &lt;element name="fromAccountStatus" type="{http://payments.webservices.cyclos.strohalm.nl/}accountStatus" minOccurs="0"/>
 *         &lt;element name="toAccountStatus" type="{http://payments.webservices.cyclos.strohalm.nl/}accountStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentResult", propOrder = {
    "status",
    "transfer",
    "fromAccountStatus",
    "toAccountStatus"
})
public class PaymentResult {

    @XmlSchemaType(name = "string")
    protected PaymentStatus status;
    protected Transfer transfer;
    protected AccountStatus fromAccountStatus;
    protected AccountStatus toAccountStatus;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus }
     *     
     */
    public PaymentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus }
     *     
     */
    public void setStatus(PaymentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer }
     *     
     */
    public Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer }
     *     
     */
    public void setTransfer(Transfer value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the fromAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getFromAccountStatus() {
        return fromAccountStatus;
    }

    /**
     * Sets the value of the fromAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setFromAccountStatus(AccountStatus value) {
        this.fromAccountStatus = value;
    }

    /**
     * Gets the value of the toAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getToAccountStatus() {
        return toAccountStatus;
    }

    /**
     * Sets the value of the toAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setToAccountStatus(AccountStatus value) {
        this.toAccountStatus = value;
    }

}
