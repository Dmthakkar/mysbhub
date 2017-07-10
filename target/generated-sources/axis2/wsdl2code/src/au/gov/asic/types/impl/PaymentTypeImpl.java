/*
 * XML Type:  paymentType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.PaymentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML paymentType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PaymentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.PaymentType
{
    
    public PaymentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTDEBIT$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "directDebit");
    private static final javax.xml.namespace.QName CREDITCARD$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "creditCard");
    
    
    /**
     * Gets the "directDebit" element
     */
    public boolean getDirectDebit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTDEBIT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "directDebit" element
     */
    public au.gov.asic.types.TrueType xgetDirectDebit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(DIRECTDEBIT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "directDebit" element
     */
    public boolean isSetDirectDebit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTDEBIT$0) != 0;
        }
    }
    
    /**
     * Sets the "directDebit" element
     */
    public void setDirectDebit(boolean directDebit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTDEBIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTDEBIT$0);
            }
            target.setBooleanValue(directDebit);
        }
    }
    
    /**
     * Sets (as xml) the "directDebit" element
     */
    public void xsetDirectDebit(au.gov.asic.types.TrueType directDebit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(DIRECTDEBIT$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(DIRECTDEBIT$0);
            }
            target.set(directDebit);
        }
    }
    
    /**
     * Unsets the "directDebit" element
     */
    public void unsetDirectDebit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTDEBIT$0, 0);
        }
    }
    
    /**
     * Gets the "creditCard" element
     */
    public au.gov.asic.types.CreditCardType getCreditCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType target = null;
            target = (au.gov.asic.types.CreditCardType)get_store().find_element_user(CREDITCARD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "creditCard" element
     */
    public boolean isSetCreditCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITCARD$2) != 0;
        }
    }
    
    /**
     * Sets the "creditCard" element
     */
    public void setCreditCard(au.gov.asic.types.CreditCardType creditCard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType target = null;
            target = (au.gov.asic.types.CreditCardType)get_store().find_element_user(CREDITCARD$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.CreditCardType)get_store().add_element_user(CREDITCARD$2);
            }
            target.set(creditCard);
        }
    }
    
    /**
     * Appends and returns a new empty "creditCard" element
     */
    public au.gov.asic.types.CreditCardType addNewCreditCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType target = null;
            target = (au.gov.asic.types.CreditCardType)get_store().add_element_user(CREDITCARD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "creditCard" element
     */
    public void unsetCreditCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITCARD$2, 0);
        }
    }
}
