
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST_RECEIVED"/>
 *     &lt;enumeration value="FROM_INVALID_CHANNEL"/>
 *     &lt;enumeration value="TO_INVALID_CHANNEL"/>
 *     &lt;enumeration value="INVALID_PARAMETERS"/>
 *     &lt;enumeration value="FROM_NOT_FOUND"/>
 *     &lt;enumeration value="TO_NOT_FOUND"/>
 *     &lt;enumeration value="NOT_ENOUGH_CREDITS"/>
 *     &lt;enumeration value="MAX_DAILY_AMOUNT_EXCEEDED"/>
 *     &lt;enumeration value="RECEIVER_UPPER_CREDIT_LIMIT_REACHED"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentRequestStatus")
@XmlEnum
public enum PaymentRequestStatus {

    REQUEST_RECEIVED,
    FROM_INVALID_CHANNEL,
    TO_INVALID_CHANNEL,
    INVALID_PARAMETERS,
    FROM_NOT_FOUND,
    TO_NOT_FOUND,
    NOT_ENOUGH_CREDITS,
    MAX_DAILY_AMOUNT_EXCEEDED,
    RECEIVER_UPPER_CREDIT_LIMIT_REACHED,
    UNKNOWN_ERROR;

    public String value() {
        return name();
    }

    public static PaymentRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}
