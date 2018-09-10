
package com.mobivat.mobivat_is.cyclos_payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basePaymentVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basePaymentVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://payments.webservices.cyclos.strohalm.nl/}basePaymentDataVO">
 *       &lt;sequence>
 *         &lt;element name="transferType" type="{http://payments.webservices.cyclos.strohalm.nl/}transferType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromMember" type="{http://payments.webservices.cyclos.strohalm.nl/}member" minOccurs="0"/>
 *         &lt;element name="member" type="{http://payments.webservices.cyclos.strohalm.nl/}member" minOccurs="0"/>
 *         &lt;element name="fromSystemAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://payments.webservices.cyclos.strohalm.nl/}fieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basePaymentVO", propOrder = {
    "transferType",
    "description",
    "fromMember",
    "member",
    "fromSystemAccountName",
    "systemAccountName",
    "fields"
})
@XmlSeeAlso({
    Transfer.class
})
public abstract class BasePaymentVO
    extends BasePaymentDataVO
{

    protected TransferType transferType;
    protected String description;
    protected Member fromMember;
    protected Member member;
    protected String fromSystemAccountName;
    protected String systemAccountName;
    @XmlElement(nillable = true)
    protected List<FieldValue> fields;

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferType }
     *     
     */
    public TransferType getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferType }
     *     
     */
    public void setTransferType(TransferType value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fromMember property.
     * 
     * @return
     *     possible object is
     *     {@link Member }
     *     
     */
    public Member getFromMember() {
        return fromMember;
    }

    /**
     * Sets the value of the fromMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member }
     *     
     */
    public void setFromMember(Member value) {
        this.fromMember = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link Member }
     *     
     */
    public Member getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member }
     *     
     */
    public void setMember(Member value) {
        this.member = value;
    }

    /**
     * Gets the value of the fromSystemAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSystemAccountName() {
        return fromSystemAccountName;
    }

    /**
     * Sets the value of the fromSystemAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSystemAccountName(String value) {
        this.fromSystemAccountName = value;
    }

    /**
     * Gets the value of the systemAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemAccountName() {
        return systemAccountName;
    }

    /**
     * Sets the value of the systemAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemAccountName(String value) {
        this.systemAccountName = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValue }
     * 
     * 
     */
    public List<FieldValue> getFields() {
        if (fields == null) {
            fields = new ArrayList<FieldValue>();
        }
        return this.fields;
    }

}
