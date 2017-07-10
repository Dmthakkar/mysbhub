/*
 * XML Type:  documentType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.DocumentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML documentType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class DocumentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.DocumentType
{
    
    public DocumentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTNUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "documentNumber");
    private static final javax.xml.namespace.QName DATERECEIVED$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateReceived");
    private static final javax.xml.namespace.QName FORMCODE$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "formCode");
    private static final javax.xml.namespace.QName NUMBEROFPAGES$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "numberOfPages");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName ADDITIONALDESCRIPTION$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "additionalDescription");
    
    
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
    
    /**
     * Gets the "dateReceived" element
     */
    public java.util.Calendar getDateReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERECEIVED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateReceived" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERECEIVED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateReceived" element
     */
    public void setDateReceived(java.util.Calendar dateReceived)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERECEIVED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERECEIVED$2);
            }
            target.setCalendarValue(dateReceived);
        }
    }
    
    /**
     * Sets (as xml) the "dateReceived" element
     */
    public void xsetDateReceived(org.apache.xmlbeans.XmlDate dateReceived)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERECEIVED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERECEIVED$2);
            }
            target.set(dateReceived);
        }
    }
    
    /**
     * Gets the "formCode" element
     */
    public java.lang.String getFormCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formCode" element
     */
    public au.gov.asic.types.CodeType xgetFormCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CodeType target = null;
            target = (au.gov.asic.types.CodeType)get_store().find_element_user(FORMCODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "formCode" element
     */
    public void setFormCode(java.lang.String formCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMCODE$4);
            }
            target.setStringValue(formCode);
        }
    }
    
    /**
     * Sets (as xml) the "formCode" element
     */
    public void xsetFormCode(au.gov.asic.types.CodeType formCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CodeType target = null;
            target = (au.gov.asic.types.CodeType)get_store().find_element_user(FORMCODE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.CodeType)get_store().add_element_user(FORMCODE$4);
            }
            target.set(formCode);
        }
    }
    
    /**
     * Gets the "numberOfPages" element
     */
    public java.math.BigInteger getNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfPages" element
     */
    public au.gov.asic.types.bn.DocumentType.NumberOfPages xgetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType.NumberOfPages target = null;
            target = (au.gov.asic.types.bn.DocumentType.NumberOfPages)get_store().find_element_user(NUMBEROFPAGES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberOfPages" element
     */
    public boolean isSetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFPAGES$6) != 0;
        }
    }
    
    /**
     * Sets the "numberOfPages" element
     */
    public void setNumberOfPages(java.math.BigInteger numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPAGES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPAGES$6);
            }
            target.setBigIntegerValue(numberOfPages);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfPages" element
     */
    public void xsetNumberOfPages(au.gov.asic.types.bn.DocumentType.NumberOfPages numberOfPages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType.NumberOfPages target = null;
            target = (au.gov.asic.types.bn.DocumentType.NumberOfPages)get_store().find_element_user(NUMBEROFPAGES$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.DocumentType.NumberOfPages)get_store().add_element_user(NUMBEROFPAGES$6);
            }
            target.set(numberOfPages);
        }
    }
    
    /**
     * Unsets the "numberOfPages" element
     */
    public void unsetNumberOfPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFPAGES$6, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public au.gov.asic.types.DescriptionType xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DescriptionType target = null;
            target = (au.gov.asic.types.DescriptionType)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(au.gov.asic.types.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DescriptionType target = null;
            target = (au.gov.asic.types.DescriptionType)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DescriptionType)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets array of all "additionalDescription" elements
     */
    public au.gov.asic.types.bn.DocumentType.AdditionalDescription[] getAdditionalDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALDESCRIPTION$10, targetList);
            au.gov.asic.types.bn.DocumentType.AdditionalDescription[] result = new au.gov.asic.types.bn.DocumentType.AdditionalDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalDescription" element
     */
    public au.gov.asic.types.bn.DocumentType.AdditionalDescription getAdditionalDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType.AdditionalDescription target = null;
            target = (au.gov.asic.types.bn.DocumentType.AdditionalDescription)get_store().find_element_user(ADDITIONALDESCRIPTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalDescription" element
     */
    public int sizeOfAdditionalDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALDESCRIPTION$10);
        }
    }
    
    /**
     * Sets array of all "additionalDescription" element
     */
    public void setAdditionalDescriptionArray(au.gov.asic.types.bn.DocumentType.AdditionalDescription[] additionalDescriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(additionalDescriptionArray, ADDITIONALDESCRIPTION$10);
        }
    }
    
    /**
     * Sets ith "additionalDescription" element
     */
    public void setAdditionalDescriptionArray(int i, au.gov.asic.types.bn.DocumentType.AdditionalDescription additionalDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType.AdditionalDescription target = null;
            target = (au.gov.asic.types.bn.DocumentType.AdditionalDescription)get_store().find_element_user(ADDITIONALDESCRIPTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalDescription" element
     */
    public au.gov.asic.types.bn.DocumentType.AdditionalDescription insertNewAdditionalDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType.AdditionalDescription target = null;
            target = (au.gov.asic.types.bn.DocumentType.AdditionalDescription)get_store().insert_element_user(ADDITIONALDESCRIPTION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalDescription" element
     */
    public au.gov.asic.types.bn.DocumentType.AdditionalDescription addNewAdditionalDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType.AdditionalDescription target = null;
            target = (au.gov.asic.types.bn.DocumentType.AdditionalDescription)get_store().add_element_user(ADDITIONALDESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalDescription" element
     */
    public void removeAdditionalDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALDESCRIPTION$10, i);
        }
    }
    /**
     * An XML numberOfPages(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.DocumentType$NumberOfPages.
     */
    public static class NumberOfPagesImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements au.gov.asic.types.bn.DocumentType.NumberOfPages
    {
        
        public NumberOfPagesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NumberOfPagesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML additionalDescription(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class AdditionalDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.DocumentType.AdditionalDescription
    {
        
        public AdditionalDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBFORMCODE$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "subformCode");
        private static final javax.xml.namespace.QName SUBFORMDESCRIPTION$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "subformDescription");
        
        
        /**
         * Gets the "subformCode" element
         */
        public java.lang.String getSubformCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBFORMCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subformCode" element
         */
        public au.gov.asic.types.CodeType xgetSubformCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.CodeType target = null;
                target = (au.gov.asic.types.CodeType)get_store().find_element_user(SUBFORMCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "subformCode" element
         */
        public boolean isSetSubformCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBFORMCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "subformCode" element
         */
        public void setSubformCode(java.lang.String subformCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBFORMCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBFORMCODE$0);
                }
                target.setStringValue(subformCode);
            }
        }
        
        /**
         * Sets (as xml) the "subformCode" element
         */
        public void xsetSubformCode(au.gov.asic.types.CodeType subformCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.CodeType target = null;
                target = (au.gov.asic.types.CodeType)get_store().find_element_user(SUBFORMCODE$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.CodeType)get_store().add_element_user(SUBFORMCODE$0);
                }
                target.set(subformCode);
            }
        }
        
        /**
         * Unsets the "subformCode" element
         */
        public void unsetSubformCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBFORMCODE$0, 0);
            }
        }
        
        /**
         * Gets the "subformDescription" element
         */
        public java.lang.String getSubformDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBFORMDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subformDescription" element
         */
        public au.gov.asic.types.DescriptionType xgetSubformDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.DescriptionType target = null;
                target = (au.gov.asic.types.DescriptionType)get_store().find_element_user(SUBFORMDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subformDescription" element
         */
        public void setSubformDescription(java.lang.String subformDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBFORMDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBFORMDESCRIPTION$2);
                }
                target.setStringValue(subformDescription);
            }
        }
        
        /**
         * Sets (as xml) the "subformDescription" element
         */
        public void xsetSubformDescription(au.gov.asic.types.DescriptionType subformDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.DescriptionType target = null;
                target = (au.gov.asic.types.DescriptionType)get_store().find_element_user(SUBFORMDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.DescriptionType)get_store().add_element_user(SUBFORMDESCRIPTION$2);
                }
                target.set(subformDescription);
            }
        }
    }
}
