
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndOfAuctionLogoTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndOfAuctionLogoTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="WinningBidderNotice"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="Customized"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndOfAuctionLogoTypeCodeType")
@XmlEnum
public enum EndOfAuctionLogoTypeCodeType {


    /**
     * 
     * 					 This enumeration value indicates that the PayPal Winning Bidder Notice logo will be used in the end of auction email to winning bidder.
     * 					
     * 
     */
    @XmlEnumValue("WinningBidderNotice")
    WINNING_BIDDER_NOTICE("WinningBidderNotice"),

    /**
     * 
     * 					 This enumeration value indicates that the eBay seller's Store logo will be used in the end of auction email to winning bidder.
     * 					
     * 
     */
    @XmlEnumValue("Store")
    STORE("Store"),

    /**
     * 
     * 					 This enumeration value indicates that a custom logo will be used in the end of auction email to winning bidder. The location (URL) of this custom logo is specified in the <b>LogoURL</b> field.
     * 					
     * 
     */
    @XmlEnumValue("Customized")
    CUSTOMIZED("Customized"),

    /**
     * 
     * 					  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value indicates that no logo will be used in the end of auction email to winning bidder.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    EndOfAuctionLogoTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndOfAuctionLogoTypeCodeType fromValue(String v) {
        for (EndOfAuctionLogoTypeCodeType c: EndOfAuctionLogoTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
