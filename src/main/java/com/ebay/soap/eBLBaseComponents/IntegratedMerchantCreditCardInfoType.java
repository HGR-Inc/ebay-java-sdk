
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				<span class="tablenote"><b>Note: </b>
 * 				As of May 1, 2019,  eBay no longer support electronic payments through Integrated Merchant Credit Card accounts. To accept online credit card payments from buyers, a seller must use specify PayPal as an accepted payment method, or opt in to eBay Managed Payments program (if the program is available to that seller).
 * 				</span>
 * 				<br/>
 * 				This type is used by the <b>IntegratedMerchantCreditCardInfo</b> container that is returned in the <b>GetUser</b> response if the seller has a payment gateway account on one or more eBay marketplaces.
 * 			
 * 
 * <p>Java class for IntegratedMerchantCreditCardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegratedMerchantCreditCardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportedSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "IntegratedMerchantCreditCardInfoType", propOrder = {
    "supportedSite",
    "any"
})
public class IntegratedMerchantCreditCardInfoType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SupportedSite")
    protected List<SiteCodeType> supportedSite;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType[] getSupportedSite() {
        if (this.supportedSite == null) {
            return new SiteCodeType[ 0 ] ;
        }
        return ((SiteCodeType[]) this.supportedSite.toArray(new SiteCodeType[this.supportedSite.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSupportedSite(int idx) {
        if (this.supportedSite == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.supportedSite.get(idx);
    }

    public int getSupportedSiteLength() {
        if (this.supportedSite == null) {
            return  0;
        }
        return this.supportedSite.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SiteCodeType }
     *     
     */
    public void setSupportedSite(SiteCodeType[] values) {
        this._getSupportedSite().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.supportedSite.add(values[i]);
        }
    }

    protected List<SiteCodeType> _getSupportedSite() {
        if (supportedSite == null) {
            supportedSite = new ArrayList<SiteCodeType>();
        }
        return supportedSite;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType setSupportedSite(int idx, SiteCodeType value) {
        return this.supportedSite.set(idx, value);
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
