
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  This call is uses to rename and/or move a Selling Manager Inventory folder.
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call. The user must have a Selling Manager Pro subscription to use this call.
 * 			
 * 
 * <p>Java class for ReviseSellingManagerInventoryFolderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseSellingManagerInventoryFolderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseSellingManagerInventoryFolderRequestType", propOrder = {
    "folder"
})
public class ReviseSellingManagerInventoryFolderRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Folder")
    protected SellingManagerFolderDetailsType folder;

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public SellingManagerFolderDetailsType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public void setFolder(SellingManagerFolderDetailsType value) {
        this.folder = value;
    }

}
