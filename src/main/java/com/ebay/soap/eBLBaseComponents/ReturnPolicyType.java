
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Type used to express the details of the return policy for an item.
 * 				<br><br>
 * 				To get the metadata on the values you can use for specific marketplaces, call <b>GeteBayDetails</b> with <b>DetailName</b> set to <code>ReturnPolicyDetails</code>, and then review the <b>ReturnPolicyDetails</b> fields in the response.
 * 				<br><br>
 * 				<span class="tablenote"><b>Note:</b> Historically, the <b>GeteBayDetails</b> call has been used to retrieve return policy metadata. However, the <b>GetCategoryFeatures</b> call now returns category-level metadata for both domestic and international return policies, and developers should make plans to use that call for this metadata.</span>
 * 			
 * 
 * <p>Java class for ReturnPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Refund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnsWithinOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ReturnsWithin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnsAcceptedOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ReturnsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyOfferedOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="WarrantyOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyTypeOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyDurationOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="WarrantyDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCostPaidByOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingCostPaidBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestockingFeeValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="RestockingFeeValueOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ExtendedHolidayReturns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalRefundOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsAcceptedOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsWithinOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="InternationalShippingCostPaidByOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnPolicyType", propOrder = {
    "refundOption",
    "refund",
    "returnsWithinOption",
    "returnsWithin",
    "returnsAcceptedOption",
    "returnsAccepted",
    "description",
    "warrantyOfferedOption",
    "warrantyOffered",
    "warrantyTypeOption",
    "warrantyType",
    "warrantyDurationOption",
    "warrantyDuration",
    "shippingCostPaidByOption",
    "shippingCostPaidBy",
    "restockingFeeValue",
    "restockingFeeValueOption",
    "extendedHolidayReturns",
    "internationalRefundOption",
    "internationalReturnsAcceptedOption",
    "internationalReturnsWithinOption",
    "internationalShippingCostPaidByOption",
    "any"
})
public class ReturnPolicyType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String refundOption;
    @XmlElement(name = "Refund")
    protected String refund;
    @XmlElement(name = "ReturnsWithinOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String returnsWithinOption;
    @XmlElement(name = "ReturnsWithin")
    protected String returnsWithin;
    @XmlElement(name = "ReturnsAcceptedOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String returnsAcceptedOption;
    @XmlElement(name = "ReturnsAccepted")
    protected String returnsAccepted;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "WarrantyOfferedOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String warrantyOfferedOption;
    @XmlElement(name = "WarrantyOffered")
    protected String warrantyOffered;
    @XmlElement(name = "WarrantyTypeOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String warrantyTypeOption;
    @XmlElement(name = "WarrantyType")
    protected String warrantyType;
    @XmlElement(name = "WarrantyDurationOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String warrantyDurationOption;
    @XmlElement(name = "WarrantyDuration")
    protected String warrantyDuration;
    @XmlElement(name = "ShippingCostPaidByOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingCostPaidByOption;
    @XmlElement(name = "ShippingCostPaidBy")
    protected String shippingCostPaidBy;
    @XmlElement(name = "RestockingFeeValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValue;
    @XmlElement(name = "RestockingFeeValueOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValueOption;
    @XmlElement(name = "ExtendedHolidayReturns")
    protected Boolean extendedHolidayReturns;
    @XmlElement(name = "InternationalRefundOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internationalRefundOption;
    @XmlElement(name = "InternationalReturnsAcceptedOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internationalReturnsAcceptedOption;
    @XmlElement(name = "InternationalReturnsWithinOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internationalReturnsWithinOption;
    @XmlElement(name = "InternationalShippingCostPaidByOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internationalShippingCostPaidByOption;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the refundOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundOption() {
        return refundOption;
    }

    /**
     * Sets the value of the refundOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundOption(String value) {
        this.refundOption = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefund(String value) {
        this.refund = value;
    }

    /**
     * Gets the value of the returnsWithinOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsWithinOption() {
        return returnsWithinOption;
    }

    /**
     * Sets the value of the returnsWithinOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsWithinOption(String value) {
        this.returnsWithinOption = value;
    }

    /**
     * Gets the value of the returnsWithin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsWithin() {
        return returnsWithin;
    }

    /**
     * Sets the value of the returnsWithin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsWithin(String value) {
        this.returnsWithin = value;
    }

    /**
     * Gets the value of the returnsAcceptedOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAcceptedOption() {
        return returnsAcceptedOption;
    }

    /**
     * Sets the value of the returnsAcceptedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAcceptedOption(String value) {
        this.returnsAcceptedOption = value;
    }

    /**
     * Gets the value of the returnsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * Sets the value of the returnsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAccepted(String value) {
        this.returnsAccepted = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the warrantyOfferedOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyOfferedOption() {
        return warrantyOfferedOption;
    }

    /**
     * Sets the value of the warrantyOfferedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyOfferedOption(String value) {
        this.warrantyOfferedOption = value;
    }

    /**
     * Gets the value of the warrantyOffered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyOffered() {
        return warrantyOffered;
    }

    /**
     * Sets the value of the warrantyOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyOffered(String value) {
        this.warrantyOffered = value;
    }

    /**
     * Gets the value of the warrantyTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyTypeOption() {
        return warrantyTypeOption;
    }

    /**
     * Sets the value of the warrantyTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyTypeOption(String value) {
        this.warrantyTypeOption = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * Gets the value of the warrantyDurationOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDurationOption() {
        return warrantyDurationOption;
    }

    /**
     * Sets the value of the warrantyDurationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDurationOption(String value) {
        this.warrantyDurationOption = value;
    }

    /**
     * Gets the value of the warrantyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDuration() {
        return warrantyDuration;
    }

    /**
     * Sets the value of the warrantyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDuration(String value) {
        this.warrantyDuration = value;
    }

    /**
     * Gets the value of the shippingCostPaidByOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCostPaidByOption() {
        return shippingCostPaidByOption;
    }

    /**
     * Sets the value of the shippingCostPaidByOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCostPaidByOption(String value) {
        this.shippingCostPaidByOption = value;
    }

    /**
     * Gets the value of the shippingCostPaidBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCostPaidBy() {
        return shippingCostPaidBy;
    }

    /**
     * Sets the value of the shippingCostPaidBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCostPaidBy(String value) {
        this.shippingCostPaidBy = value;
    }

    /**
     * Gets the value of the restockingFeeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValue() {
        return restockingFeeValue;
    }

    /**
     * Sets the value of the restockingFeeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValue(String value) {
        this.restockingFeeValue = value;
    }

    /**
     * Gets the value of the restockingFeeValueOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValueOption() {
        return restockingFeeValueOption;
    }

    /**
     * Sets the value of the restockingFeeValueOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValueOption(String value) {
        this.restockingFeeValueOption = value;
    }

    /**
     * Gets the value of the extendedHolidayReturns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedHolidayReturns() {
        return extendedHolidayReturns;
    }

    /**
     * Sets the value of the extendedHolidayReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedHolidayReturns(Boolean value) {
        this.extendedHolidayReturns = value;
    }

    /**
     * Gets the value of the internationalRefundOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRefundOption() {
        return internationalRefundOption;
    }

    /**
     * Sets the value of the internationalRefundOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRefundOption(String value) {
        this.internationalRefundOption = value;
    }

    /**
     * Gets the value of the internationalReturnsAcceptedOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalReturnsAcceptedOption() {
        return internationalReturnsAcceptedOption;
    }

    /**
     * Sets the value of the internationalReturnsAcceptedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalReturnsAcceptedOption(String value) {
        this.internationalReturnsAcceptedOption = value;
    }

    /**
     * Gets the value of the internationalReturnsWithinOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalReturnsWithinOption() {
        return internationalReturnsWithinOption;
    }

    /**
     * Sets the value of the internationalReturnsWithinOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalReturnsWithinOption(String value) {
        this.internationalReturnsWithinOption = value;
    }

    /**
     * Gets the value of the internationalShippingCostPaidByOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalShippingCostPaidByOption() {
        return internationalShippingCostPaidByOption;
    }

    /**
     * Sets the value of the internationalShippingCostPaidByOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalShippingCostPaidByOption(String value) {
        this.internationalShippingCostPaidByOption = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
