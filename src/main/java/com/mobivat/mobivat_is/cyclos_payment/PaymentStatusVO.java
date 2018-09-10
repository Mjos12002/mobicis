
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentStatusVO.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentStatusVO">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="PROCESSED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="SCHEDULED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="BLOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentStatusVO")
@XmlEnum
public enum PaymentStatusVO {

    PENDING,
    PROCESSED,
    DENIED,
    CANCELED,
    SCHEDULED,
    FAILED,
    BLOCKED;

    public String value() {
        return name();
    }

    public static PaymentStatusVO fromValue(String v) {
        return valueOf(v);
    }

}
