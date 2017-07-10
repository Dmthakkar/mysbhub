/*
 * XML Type:  browserIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.BrowserIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML browserIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BrowserIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.BrowserIdentifierType
{
    
    public BrowserIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONNO$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "transactionNo");
    
    
    /**
     * Gets the "transactionNo" element
     */
    public java.lang.String getTransactionNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transactionNo" element
     */
    public au.gov.asic.types.BrowserIdentifierType.TransactionNo xgetTransactionNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BrowserIdentifierType.TransactionNo target = null;
            target = (au.gov.asic.types.BrowserIdentifierType.TransactionNo)get_store().find_element_user(TRANSACTIONNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "transactionNo" element
     */
    public void setTransactionNo(java.lang.String transactionNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONNO$0);
            }
            target.setStringValue(transactionNo);
        }
    }
    
    /**
     * Sets (as xml) the "transactionNo" element
     */
    public void xsetTransactionNo(au.gov.asic.types.BrowserIdentifierType.TransactionNo transactionNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BrowserIdentifierType.TransactionNo target = null;
            target = (au.gov.asic.types.BrowserIdentifierType.TransactionNo)get_store().find_element_user(TRANSACTIONNO$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BrowserIdentifierType.TransactionNo)get_store().add_element_user(TRANSACTIONNO$0);
            }
            target.set(transactionNo);
        }
    }
    /**
     * An XML transactionNo(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BrowserIdentifierType$TransactionNo.
     */
    public static class TransactionNoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.BrowserIdentifierType.TransactionNo
    {
        
        public TransactionNoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TransactionNoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
