
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayPayNowButtonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayPayNowButtonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ShowPayNowButtonForAllPaymentMethods"/>
 *     &lt;enumeration value="ShowPayNowButtonForPayPalOnly"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayPayNowButtonCodeType")
@XmlEnum
public enum DisplayPayNowButtonCodeType {


    /**
     * 
     * 						This enumeration value indicates that the "Pay Now" button will be displayed no matter what payment method the buyer uses.
     * 					
     * 
     */
    @XmlEnumValue("ShowPayNowButtonForAllPaymentMethods")
    SHOW_PAY_NOW_BUTTON_FOR_ALL_PAYMENT_METHODS("ShowPayNowButtonForAllPaymentMethods"),

    /**
     * 
     * 						This enumeration value indicates that the "Pay Now" button will only be displayed if the buyer is using PayPal as the payment method.
     * 					
     * 
     */
    @XmlEnumValue("ShowPayNowButtonForPayPalOnly")
    SHOW_PAY_NOW_BUTTON_FOR_PAY_PAL_ONLY("ShowPayNowButtonForPayPalOnly"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisplayPayNowButtonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayPayNowButtonCodeType fromValue(String v) {
        for (DisplayPayNowButtonCodeType c: DisplayPayNowButtonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
