
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					The base response for the <b>AddSellingManagerProduct</b> call.
 * 				
 * 
 * <p>Java class for AddSellingManagerProductResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSellingManagerProductResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSellingManagerProductResponseType", propOrder = {
    "sellingManagerProductDetails"
})
public class AddSellingManagerProductResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerProductDetails")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;

    /**
     * Gets the value of the sellingManagerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public SellingManagerProductDetailsType getSellingManagerProductDetails() {
        return sellingManagerProductDetails;
    }

    /**
     * Sets the value of the sellingManagerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerProductDetailsType }
     *     
     */
    public void setSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.sellingManagerProductDetails = value;
    }

}
