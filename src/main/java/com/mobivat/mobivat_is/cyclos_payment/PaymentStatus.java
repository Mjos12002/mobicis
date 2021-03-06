
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCESSED"/>
 *     &lt;enumeration value="PENDING_AUTHORIZATION"/>
 *     &lt;enumeration value="INVALID_CREDENTIALS"/>
 *     &lt;enumeration value="BLOCKED_CREDENTIALS"/>
 *     &lt;enumeration value="INVALID_CHANNEL"/>
 *     &lt;enumeration value="INVALID_PARAMETERS"/>
 *     &lt;enumeration value="FROM_NOT_FOUND"/>
 *     &lt;enumeration value="TO_NOT_FOUND"/>
 *     &lt;enumeration value="NOT_ENOUGH_CREDITS"/>
 *     &lt;enumeration value="MAX_DAILY_AMOUNT_EXCEEDED"/>
 *     &lt;enumeration value="RECEIVER_UPPER_CREDIT_LIMIT_REACHED"/>
 *     &lt;enumeration value="NOT_PERFORMED"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentStatus")
@XmlEnum
public enum PaymentStatus {

    PROCESSED,
    PENDING_AUTHORIZATION,
    INVALID_CREDENTIALS,
    BLOCKED_CREDENTIALS,
    INVALID_CHANNEL,
    INVALID_PARAMETERS,
    FROM_NOT_FOUND,
    TO_NOT_FOUND,
    NOT_ENOUGH_CREDITS,
    MAX_DAILY_AMOUNT_EXCEEDED,
    RECEIVER_UPPER_CREDIT_LIMIT_REACHED,
    NOT_PERFORMED,
    UNKNOWN_ERROR;

    public String value() {
        return name();
    }

    public static PaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
