
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentHoldReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentHoldReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NewSeller"/>
 *     &lt;enumeration value="BelowStandardSeller"/>
 *     &lt;enumeration value="EbpCaseOpen"/>
 *     &lt;enumeration value="ReinstatementAfterSuspension"/>
 *     &lt;enumeration value="CasualSeller"/>
 *     &lt;enumeration value="NewPaypalAccountAdded"/>
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="SellerIsOnBlackList"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentHoldReasonCodeType")
@XmlEnum
public enum PaymentHoldReasonCodeType {


    /**
     * 
     * 						This value indicates that the buyer's payment for the order is being held
     * 						by PayPal because the seller is new to selling on eBay. Sellers are
     * 						considered "new" until they have met all three criteria below:
     * 						<ul>
     * 						<li>More than 90 days have passed since first successful sale</li>
     * 						<li>More than 25 domestic sales</li>
     * 						<li>More than $250.00 in total sales</li>
     * 						</ul>
     * 					
     * 
     */
    @XmlEnumValue("NewSeller")
    NEW_SELLER("NewSeller"),

    /**
     * 
     * 						This value indicates that the buyer's payment for the order is being held
     * 						by PayPal because the seller has been classified as a Below Standard
     * 						seller.
     * 					
     * 
     */
    @XmlEnumValue("BelowStandardSeller")
    BELOW_STANDARD_SELLER("BelowStandardSeller"),

    /**
     * 
     * 						This value indicates that the buyer's payment for the order is being held
     * 						by PayPal because an eBay Money Back Guarantee case has been filed against
     * 						the order. If this value is returned, the seller can expedite the release
     * 						of PayPal funds into their account by resolving the eBay Money Back Guarantee
     * 						case, as indicated by a value of 'ResolveeBPCase' returned in a
     * 						<b>PaymentHoldDetails.RequiredSellerActionArray.RequiredSellerAction</b>
     * 						field.
     * 					
     * 
     */
    @XmlEnumValue("EbpCaseOpen")
    EBP_CASE_OPEN("EbpCaseOpen"),

    /**
     * 
     * 						This value indicates that the buyer's payment for the order is being held
     * 						by PayPal because the seller has recently been reinstated as an active eBay
     * 						seller after their account went through a suspension/restricted period.
     * 						<br/><br/>
     * 						After a seller's account is suspended and then reinstated, that seller is
     * 						treated as a new seller, and must meet the same requirements that a new
     * 						seller must meet to get beyong the "New Seller" status.
     * 					
     * 
     */
    @XmlEnumValue("ReinstatementAfterSuspension")
    REINSTATEMENT_AFTER_SUSPENSION("ReinstatementAfterSuspension"),

    /**
     * 
     * 						This value indicates that the buyer's payment for the order is being held
     * 						by PayPal because the seller is classified as a casual seller on eBay.
     * 					
     * 
     */
    @XmlEnumValue("CasualSeller")
    CASUAL_SELLER("CasualSeller"),

    /**
     * 
     * 						This value indicates that the buyer's payment for the order is being held
     * 						by PayPal because the seller's PayPal account (identified in
     * 						<b>Transaction.PayPalEmailAddress</b>) is new and is not
     * 						fully set up to receive funds.
     * 					
     * 
     */
    @XmlEnumValue("NewPaypalAccountAdded")
    NEW_PAYPAL_ACCOUNT_ADDED("NewPaypalAccountAdded"),

    /**
     * 
     * 						This value indicates that the reason for the buyer's payment for the order
     * 						being held by PayPal is not known.
     * 					
     * 
     */
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("SellerIsOnBlackList")
    SELLER_IS_ON_BLACK_LIST("SellerIsOnBlackList"),

    /**
     * 
     * 						This value is returned if the reason for the buyer's payment for the order
     * 						being held by PayPal cannot be classified by any of the other enumeration
     * 						values.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentHoldReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentHoldReasonCodeType fromValue(String v) {
        for (PaymentHoldReasonCodeType c: PaymentHoldReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
