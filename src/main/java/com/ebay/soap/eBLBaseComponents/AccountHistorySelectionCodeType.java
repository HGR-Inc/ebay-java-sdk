
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountHistorySelectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountHistorySelectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LastInvoice"/>
 *     &lt;enumeration value="SpecifiedInvoice"/>
 *     &lt;enumeration value="BetweenSpecifiedDates"/>
 *     &lt;enumeration value="OrderId"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountHistorySelectionCodeType")
@XmlEnum
public enum AccountHistorySelectionCodeType {


    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries posted to the last invoice that was sent to the user by eBay. If this value is used, the <b>InvoiceDate</b>, <b>BeginDate</b>, and <b>EndDate</b> fields of the <b>GetAccount</b> request are no longer applicable and will be ignored if they are included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("LastInvoice")
    LAST_INVOICE("LastInvoice"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries for a specific invoice that was sent to the user by eBay. If this value is used, the specific invoice is identified by including the  <b>InvoiceDate</b> field and setting its value to the actual invoice date. If this value is used, the <b>BeginDate</b>, and <b>EndDate</b> fields of the <b>GetAccount</b> request are no longer applicable and will be ignored if they are included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("SpecifiedInvoice")
    SPECIFIED_INVOICE("SpecifiedInvoice"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see account entries for a customized date range that can overlap multiple formal eBay invoices. If this value is used, then you also must specify <b>BeginDate</b> and <b>EndDate</b> to set the date range for which to retrieve account entries. If this value is used, then <b>InvoiceDate</b> is no longer applicable and will be ignored if it is included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("BetweenSpecifiedDates")
    BETWEEN_SPECIFIED_DATES("BetweenSpecifiedDates"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries related to a specific eBay order. If this value is used, the user must also include the <b>OrderID</b> field and sets its value to the identifier of the order for which they wish to retrieve account entries.
     * 						<br><br>
     * 						<span class="tablenote"><b>Note: </b> In June 2019, eBay introduced a new order ID format to both legacy (including Trading API) and REST-based APIs. At this time, both old and new format order IDs will be accepted in legacy API request payloads to identify orders. In legacy API response payloads, order IDs will appear in the new format if the user is using a Trading WSDL version of '1113' (or newer), or if the user sets the <code>X-EBAY-API-COMPATIBILITY-LEVEL</code> HTTP header to a value of '1113' (or newer). If the Trading WSDL version or compatibility level is less/older than '1113', old format order IDs will be returned in legacy API response payloads. Beginning as soon as March 2020, only new format order IDs will be returned regardless of version number.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("OrderId")
    ORDER_ID("OrderId"),

    /**
     * 
     * 						 (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccountHistorySelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountHistorySelectionCodeType fromValue(String v) {
        for (AccountHistorySelectionCodeType c: AccountHistorySelectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
