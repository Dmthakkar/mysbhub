/*
 * XML Type:  documentIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.DocumentIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML documentIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class DocumentIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.DocumentIdentifierType
{
    
    public DocumentIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EBUSINESS$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "ebusiness");
    private static final javax.xml.namespace.QName ASCOT$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "ascot");
    
    
    /**
     * Gets the "ebusiness" element
     */
    public au.gov.asic.types.DocumentIdentifierType.Ebusiness getEbusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType.Ebusiness target = null;
            target = (au.gov.asic.types.DocumentIdentifierType.Ebusiness)get_store().find_element_user(EBUSINESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ebusiness" element
     */
    public boolean isSetEbusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EBUSINESS$0) != 0;
        }
    }
    
    /**
     * Sets the "ebusiness" element
     */
    public void setEbusiness(au.gov.asic.types.DocumentIdentifierType.Ebusiness ebusiness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType.Ebusiness target = null;
            target = (au.gov.asic.types.DocumentIdentifierType.Ebusiness)get_store().find_element_user(EBUSINESS$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DocumentIdentifierType.Ebusiness)get_store().add_element_user(EBUSINESS$0);
            }
            target.set(ebusiness);
        }
    }
    
    /**
     * Appends and returns a new empty "ebusiness" element
     */
    public au.gov.asic.types.DocumentIdentifierType.Ebusiness addNewEbusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType.Ebusiness target = null;
            target = (au.gov.asic.types.DocumentIdentifierType.Ebusiness)get_store().add_element_user(EBUSINESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ebusiness" element
     */
    public void unsetEbusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EBUSINESS$0, 0);
        }
    }
    
    /**
     * Gets the "ascot" element
     */
    public au.gov.asic.types.DocumentIdentifierType.Ascot getAscot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType.Ascot target = null;
            target = (au.gov.asic.types.DocumentIdentifierType.Ascot)get_store().find_element_user(ASCOT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ascot" element
     */
    public boolean isSetAscot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASCOT$2) != 0;
        }
    }
    
    /**
     * Sets the "ascot" element
     */
    public void setAscot(au.gov.asic.types.DocumentIdentifierType.Ascot ascot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType.Ascot target = null;
            target = (au.gov.asic.types.DocumentIdentifierType.Ascot)get_store().find_element_user(ASCOT$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DocumentIdentifierType.Ascot)get_store().add_element_user(ASCOT$2);
            }
            target.set(ascot);
        }
    }
    
    /**
     * Appends and returns a new empty "ascot" element
     */
    public au.gov.asic.types.DocumentIdentifierType.Ascot addNewAscot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType.Ascot target = null;
            target = (au.gov.asic.types.DocumentIdentifierType.Ascot)get_store().add_element_user(ASCOT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ascot" element
     */
    public void unsetAscot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASCOT$2, 0);
        }
    }
    /**
     * An XML ebusiness(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class EbusinessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.DocumentIdentifierType.Ebusiness
    {
        
        public EbusinessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFERENCENUMBER$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "referenceNumber");
        
        
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
    }
    /**
     * An XML ascot(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class AscotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.DocumentIdentifierType.Ascot
    {
        
        public AscotImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENTNUMBER$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "documentNumber");
        
        
        /**
         * Gets the "documentNumber" element
         */
        public java.lang.String getDocumentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "documentNumber" element
         */
        public au.gov.asic.types.DocumentNoType xgetDocumentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.DocumentNoType target = null;
                target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "documentNumber" element
         */
        public void setDocumentNumber(java.lang.String documentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$0);
                }
                target.setStringValue(documentNumber);
            }
        }
        
        /**
         * Sets (as xml) the "documentNumber" element
         */
        public void xsetDocumentNumber(au.gov.asic.types.DocumentNoType documentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.DocumentNoType target = null;
                target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(DOCUMENTNUMBER$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.DocumentNoType)get_store().add_element_user(DOCUMENTNUMBER$0);
                }
                target.set(documentNumber);
            }
        }
    }
}
