
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GranularityLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GranularityLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Coarse"/>
 *     &lt;enumeration value="Fine"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GranularityLevelCodeType")
@XmlEnum
public enum GranularityLevelCodeType {


    /**
     * 
     * 						(in) For each record in the response, retrieves less data than Medium.
     * 						See the <a href="http://developer.ebay.com/DevZone/guides/features-guide/default.html#basics/eBay-SelectingFields.html">eBay Features Guide</a> for a list of the output fields
     * 						that are returned when this level is specified.
     * 					
     * 
     */
    @XmlEnumValue("Coarse")
    COARSE("Coarse"),

    /**
     * 
     * 						For each record in the response, retrieves more data than Medium.
     * 						See the <a href="http://developer.ebay.com/DevZone/guides/features-guide/default.html#basics/eBay-SelectingFields.html">eBay Features Guide</a> for a list of the output fields
     * 						that are returned when this level is specified.
     * 					
     * 
     */
    @XmlEnumValue("Fine")
    FINE("Fine"),

    /**
     * 
     * 						For each record in the response, retrieves more data than Coarse and less data
     * 						than Fine. See the <a href="http://developer.ebay.com/DevZone/guides/features-guide/default.html#basics/eBay-SelectingFields.html">eBay Features Guide</a> for a list of the output fields
     * 						that are returned when this level is specified.
     * 					
     * 
     */
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GranularityLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GranularityLevelCodeType fromValue(String v) {
        for (GranularityLevelCodeType c: GranularityLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
