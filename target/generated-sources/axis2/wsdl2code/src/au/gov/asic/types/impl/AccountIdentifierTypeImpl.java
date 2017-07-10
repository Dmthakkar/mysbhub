/*
 * XML Type:  accountIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AccountIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML accountIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AccountIdentifierTypeImpl extends au.gov.asic.types.impl.RealmIdentifierTypeImpl implements au.gov.asic.types.AccountIdentifierType
{
    
    public AccountIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTIDENTIFIER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "accountIdentifier");
    
    
    /**
     * Gets the "accountIdentifier" element
     */
    public java.lang.String getAccountIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accountIdentifier" element
     */
    public au.gov.asic.types.AccountIdentifierType.AccountIdentifier xgetAccountIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AccountIdentifierType.AccountIdentifier target = null;
            target = (au.gov.asic.types.AccountIdentifierType.AccountIdentifier)get_store().find_element_user(ACCOUNTIDENTIFIER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accountIdentifier" element
     */
    public void setAccountIdentifier(java.lang.String accountIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTIDENTIFIER$0);
            }
            target.setStringValue(accountIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "accountIdentifier" element
     */
    public void xsetAccountIdentifier(au.gov.asic.types.AccountIdentifierType.AccountIdentifier accountIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AccountIdentifierType.AccountIdentifier target = null;
            target = (au.gov.asic.types.AccountIdentifierType.AccountIdentifier)get_store().find_element_user(ACCOUNTIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AccountIdentifierType.AccountIdentifier)get_store().add_element_user(ACCOUNTIDENTIFIER$0);
            }
            target.set(accountIdentifier);
        }
    }
    /**
     * An XML accountIdentifier(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AccountIdentifierType$AccountIdentifier.
     */
    public static class AccountIdentifierImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AccountIdentifierType.AccountIdentifier
    {
        
        public AccountIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AccountIdentifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
