
package com.mobivat.mobivat_is.cyclos_payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://payments.webservices.cyclos.strohalm.nl/}abstractPaymentParameters">
 *       &lt;sequence>
 *         &lt;element name="transferTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fromSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="toSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="credentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customValues" type="{http://payments.webservices.cyclos.strohalm.nl/}fieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromMemberFieldsToReturn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toMemberFieldsToReturn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentParameters", propOrder = {
    "transferTypeId",
    "fromSystem",
    "toSystem",
    "credentials",
    "customValues",
    "fromMemberFieldsToReturn",
    "toMemberFieldsToReturn",
    "returnStatus"
})
public class PaymentParameters
    extends AbstractPaymentParameters
{

    protected Long transferTypeId;
    protected Boolean fromSystem;
    protected Boolean toSystem;
    protected String credentials;
    @XmlElement(nillable = true)
    protected List<FieldValue> customValues;
    @XmlElement(nillable = true)
    protected List<String> fromMemberFieldsToReturn;
    @XmlElement(nillable = true)
    protected List<String> toMemberFieldsToReturn;
    protected Boolean returnStatus;

    /**
     * Gets the value of the transferTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferTypeId() {
        return transferTypeId;
    }

    /**
     * Sets the value of the transferTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferTypeId(Long value) {
        this.transferTypeId = value;
    }

    /**
     * Gets the value of the fromSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromSystem() {
        return fromSystem;
    }

    /**
     * Sets the value of the fromSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromSystem(Boolean value) {
        this.fromSystem = value;
    }

    /**
     * Gets the value of the toSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToSystem() {
        return toSystem;
    }

    /**
     * Sets the value of the toSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToSystem(Boolean value) {
        this.toSystem = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentials(String value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the customValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValue }
     * 
     * 
     */
    public List<FieldValue> getCustomValues() {
        if (customValues == null) {
            customValues = new ArrayList<FieldValue>();
        }
        return this.customValues;
    }

    /**
     * Gets the value of the fromMemberFieldsToReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromMemberFieldsToReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromMemberFieldsToReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFromMemberFieldsToReturn() {
        if (fromMemberFieldsToReturn == null) {
            fromMemberFieldsToReturn = new ArrayList<String>();
        }
        return this.fromMemberFieldsToReturn;
    }

    /**
     * Gets the value of the toMemberFieldsToReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toMemberFieldsToReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToMemberFieldsToReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getToMemberFieldsToReturn() {
        if (toMemberFieldsToReturn == null) {
            toMemberFieldsToReturn = new ArrayList<String>();
        }
        return this.toMemberFieldsToReturn;
    }

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnStatus(Boolean value) {
        this.returnStatus = value;
    }

}
