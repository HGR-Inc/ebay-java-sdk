
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaidStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaidStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotPaid"/>
 *     &lt;enumeration value="BuyerHasNotCompletedCheckout"/>
 *     &lt;enumeration value="PaymentPendingWithPayPal"/>
 *     &lt;enumeration value="PaidWithPayPal"/>
 *     &lt;enumeration value="MarkedAsPaid"/>
 *     &lt;enumeration value="PaymentPendingWithEscrow"/>
 *     &lt;enumeration value="PaidWithEscrow"/>
 *     &lt;enumeration value="EscrowPaymentCancelled"/>
 *     &lt;enumeration value="PaymentPendingWithPaisaPay"/>
 *     &lt;enumeration value="PaidWithPaisaPay"/>
 *     &lt;enumeration value="PaymentPending"/>
 *     &lt;enumeration value="PaymentPendingWithPaisaPayEscrow"/>
 *     &lt;enumeration value="PaidWithPaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayNotPaid"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="WaitingForCODPayment"/>
 *     &lt;enumeration value="PaidCOD"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaidStatusCodeType")
@XmlEnum
public enum PaidStatusCodeType {


    /**
     * 
     * 						The buyer has completed checkout, but eBay has not recognized that the buyer has paid for the order. It is possible that the buyer has paid with an 'offline' payment method, but the order has not been marked as paid.
     * 					
     * 
     */
    @XmlEnumValue("NotPaid")
    NOT_PAID("NotPaid"),

    /**
     * 
     * 						The buyer has not completed the checkout process and so has not made payment.
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotCompletedCheckout")
    BUYER_HAS_NOT_COMPLETED_CHECKOUT("BuyerHasNotCompletedCheckout"),

    /**
     * 
     * 						The buyer has made a PayPal payment, but the seller has not yet received it.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPayPal")
    PAYMENT_PENDING_WITH_PAY_PAL("PaymentPendingWithPayPal"),

    /**
     * 
     * 						The buyer has made a PayPal payment, and the payment is complete.
     * 						But please also see the documentation for PaymentHoldStatus and its applicable values.
     * 						PaymentHoldStatus contains the current status of a hold on a PayPal payment.
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPayPal")
    PAID_WITH_PAY_PAL("PaidWithPayPal"),

    /**
     * 
     * 						The order is marked as paid by either the buyer or seller.
     * 					
     * 
     */
    @XmlEnumValue("MarkedAsPaid")
    MARKED_AS_PAID("MarkedAsPaid"),

    /**
     * 
     * 						No longer an applicable value.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithEscrow")
    PAYMENT_PENDING_WITH_ESCROW("PaymentPendingWithEscrow"),

    /**
     * 
     * 						No longer an applicable value.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaidWithEscrow")
    PAID_WITH_ESCROW("PaidWithEscrow"),

    /**
     * 
     * 						No longer an applicable value.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("EscrowPaymentCancelled")
    ESCROW_PAYMENT_CANCELLED("EscrowPaymentCancelled"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPaisaPay")
    PAYMENT_PENDING_WITH_PAISA_PAY("PaymentPendingWithPaisaPay"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPaisaPay")
    PAID_WITH_PAISA_PAY("PaidWithPaisaPay"),

    /**
     * 
     * 						The buyer has made a payment other than PayPal, but the
     * 						payment is still being processed.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPending")
    PAYMENT_PENDING("PaymentPending"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPaisaPayEscrow")
    PAYMENT_PENDING_WITH_PAISA_PAY_ESCROW("PaymentPendingWithPaisaPayEscrow"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPaisaPayEscrow")
    PAID_WITH_PAISA_PAY_ESCROW("PaidWithPaisaPayEscrow"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayNotPaid")
    PAISA_PAY_NOT_PAID("PaisaPayNotPaid"),

    /**
     * 
     * 						The buyer's payment was refunded.
     * 					
     * 
     */
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),

    /**
     * 
     * 						The selected payment method is COD and the buyer will make the payment upon delivery.
     * 					
     * 
     */
    @XmlEnumValue("WaitingForCODPayment")
    WAITING_FOR_COD_PAYMENT("WaitingForCODPayment"),

    /**
     * 
     * 						The buyer has paid for the order with the COD payment method.
     * 					
     * 
     */
    @XmlEnumValue("PaidCOD")
    PAID_COD("PaidCOD"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						The order has been paid for.
     * 					
     * 
     */
    @XmlEnumValue("Paid")
    PAID("Paid"),

    /**
     * 
     * 						This value indicates that the buyer was offered the 'Pay Upon Invoice' option. The 'Pay Upon Invoice' option is only available to eligible German buyers as part of Progressive Checkout on the German site. If a German buyer is offered the 'Pay Upon Invoice' option, that buyer is not required to pay for the order until after receiving an order invoice from the seller.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice");
    private final String value;

    PaidStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidStatusCodeType fromValue(String v) {
        for (PaidStatusCodeType c: PaidStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
