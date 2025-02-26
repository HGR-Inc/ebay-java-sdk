
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeFilterTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeFilterTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AllInvolvedDisputes"/>
 *     &lt;enumeration value="DisputesAwaitingMyResponse"/>
 *     &lt;enumeration value="DisputesAwaitingOtherPartyResponse"/>
 *     &lt;enumeration value="AllInvolvedClosedDisputes"/>
 *     &lt;enumeration value="EligibleForCredit"/>
 *     &lt;enumeration value="UnpaidItemDisputes"/>
 *     &lt;enumeration value="ItemNotReceivedDisputes"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeFilterTypeCodeType")
@XmlEnum
public enum DisputeFilterTypeCodeType {


    /**
     * 
     * 						If used, this filter returns all open and closed disputes that involve the caller as a buyer
     * 						or seller.
     * 					
     * 
     */
    @XmlEnumValue("AllInvolvedDisputes")
    ALL_INVOLVED_DISPUTES("AllInvolvedDisputes"),

    /**
     * 
     * 						If used, this filter returns all open disputes that involve the caller as a buyer
     * 						or seller and are awaiting a response from the caller. This is the default <b>DisputeFilterType</b> value. In other words, if no <b>DisputeFilterType</b> is specified in the request, only those disputes where the caller's response is due are returned.
     * 					
     * 
     */
    @XmlEnumValue("DisputesAwaitingMyResponse")
    DISPUTES_AWAITING_MY_RESPONSE("DisputesAwaitingMyResponse"),

    /**
     * 
     * 						If used, this filter returns all open disputes that involve the caller as a buyer or seller and
     * 						are awaiting a response from the other party.
     * 					
     * 
     */
    @XmlEnumValue("DisputesAwaitingOtherPartyResponse")
    DISPUTES_AWAITING_OTHER_PARTY_RESPONSE("DisputesAwaitingOtherPartyResponse"),

    /**
     * 
     * 						If used, this filter returns all closed disputes that involve the caller as a buyer
     * 						or seller.
     * 					
     * 
     */
    @XmlEnumValue("AllInvolvedClosedDisputes")
    ALL_INVOLVED_CLOSED_DISPUTES("AllInvolvedClosedDisputes"),

    /**
     * 
     * 						If used, this filter returns all disputes that involve the caller as a buyer
     * 						or seller and are eligible for a Final Value Fee credit, regardless of
     * 						whether or not the credit has been granted.
     * 					
     * 
     */
    @XmlEnumValue("EligibleForCredit")
    ELIGIBLE_FOR_CREDIT("EligibleForCredit"),

    /**
     * 
     * 						If used, this filter returns all open and closed <i>Unpaid Item</i> disputes that
     * 						involve the caller as a buyer or seller.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemDisputes")
    UNPAID_ITEM_DISPUTES("UnpaidItemDisputes"),

    /**
     * 
     * 						If used, this filter returns all open and closed <i>Item Not Received</i> disputes that involve the caller as a buyer or seller.
     * 						<br/><br/>
     * 						<span class="tablenote"><strong>Note:</strong>
     * 							This filter is only used to retrieve any 'Item Not Received' or 'Significantly Not As Described' disputes that a buyer initiated through their PayPal account. As noted above, the <b>GetUserDisputes</b> call will not return any eBay Money Back Guarantee cases.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceivedDisputes")
    ITEM_NOT_RECEIVED_DISPUTES("ItemNotReceivedDisputes"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeFilterTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeFilterTypeCodeType fromValue(String v) {
        for (DisputeFilterTypeCodeType c: DisputeFilterTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
