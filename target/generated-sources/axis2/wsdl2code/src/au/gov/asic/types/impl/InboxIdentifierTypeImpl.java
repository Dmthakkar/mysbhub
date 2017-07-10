/*
 * XML Type:  inboxIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.InboxIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML inboxIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class InboxIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.InboxIdentifierType
{
    
    public InboxIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCENUMBER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "referenceNumber");
    private static final javax.xml.namespace.QName EXTERNALREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "externalReferenceNumber");
    private static final javax.xml.namespace.QName INBOXNUMBER$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "inboxNumber");
    
    
    /**
     * Gets the "referenceNumber" element
     */
    public long getReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceNumber" element
     */
    public au.gov.asic.types.ReferenceNoType xgetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(REFERENCENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "referenceNumber" element
     */
    public boolean isSetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCENUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "referenceNumber" element
     */
    public void setReferenceNumber(long referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCENUMBER$0);
            }
            target.setLongValue(referenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "referenceNumber" element
     */
    public void xsetReferenceNumber(au.gov.asic.types.ReferenceNoType referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(REFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ReferenceNoType)get_store().add_element_user(REFERENCENUMBER$0);
            }
            target.set(referenceNumber);
        }
    }
    
    /**
     * Unsets the "referenceNumber" element
     */
    public void unsetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCENUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "externalReferenceNumber" element
     */
    public java.lang.String getExternalReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "externalReferenceNumber" element
     */
    public au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber xgetExternalReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber target = null;
            target = (au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber)get_store().find_element_user(EXTERNALREFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "externalReferenceNumber" element
     */
    public boolean isSetExternalReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALREFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "externalReferenceNumber" element
     */
    public void setExternalReferenceNumber(java.lang.String externalReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALREFERENCENUMBER$2);
            }
            target.setStringValue(externalReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "externalReferenceNumber" element
     */
    public void xsetExternalReferenceNumber(au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber externalReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber target = null;
            target = (au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber)get_store().find_element_user(EXTERNALREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber)get_store().add_element_user(EXTERNALREFERENCENUMBER$2);
            }
            target.set(externalReferenceNumber);
        }
    }
    
    /**
     * Unsets the "externalReferenceNumber" element
     */
    public void unsetExternalReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALREFERENCENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "inboxNumber" element
     */
    public long getInboxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOXNUMBER$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "inboxNumber" element
     */
    public au.gov.asic.types.ReferenceNoType xgetInboxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(INBOXNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "inboxNumber" element
     */
    public boolean isSetInboxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INBOXNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "inboxNumber" element
     */
    public void setInboxNumber(long inboxNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOXNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INBOXNUMBER$4);
            }
            target.setLongValue(inboxNumber);
        }
    }
    
    /**
     * Sets (as xml) the "inboxNumber" element
     */
    public void xsetInboxNumber(au.gov.asic.types.ReferenceNoType inboxNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(INBOXNUMBER$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ReferenceNoType)get_store().add_element_user(INBOXNUMBER$4);
            }
            target.set(inboxNumber);
        }
    }
    
    /**
     * Unsets the "inboxNumber" element
     */
    public void unsetInboxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INBOXNUMBER$4, 0);
        }
    }
    /**
     * An XML externalReferenceNumber(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.InboxIdentifierType$ExternalReferenceNumber.
     */
    public static class ExternalReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.InboxIdentifierType.ExternalReferenceNumber
    {
        
        public ExternalReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ExternalReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
