
package com.mobivat.mobivat_is.cyclos_payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chargebackStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chargebackStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="TRANSFER_NOT_FOUND"/>
 *     &lt;enumeration value="TRANSFER_ALREADY_CHARGEDBACK"/>
 *     &lt;enumeration value="INVALID_PARAMETERS"/>
 *     &lt;enumeration value="TRANSFER_CANNOT_BE_CHARGEDBACK"/>
 *     &lt;enumeration value="NOT_PERFORMED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chargebackStatus")
@XmlEnum
public enum ChargebackStatus {

    SUCCESS,
    TRANSFER_NOT_FOUND,
    TRANSFER_ALREADY_CHARGEDBACK,
    INVALID_PARAMETERS,
    TRANSFER_CANNOT_BE_CHARGEDBACK,
    NOT_PERFORMED;

    public String value() {
        return name();
    }

    public static ChargebackStatus fromValue(String v) {
        return valueOf(v);
    }

}
