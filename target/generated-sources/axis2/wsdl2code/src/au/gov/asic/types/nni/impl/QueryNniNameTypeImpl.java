/*
 * XML Type:  queryNniNameType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.QueryNniNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML queryNniNameType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class QueryNniNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.QueryNniNameType
{
    
    public QueryNniNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPOSEDNAME$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "proposedName");
    private static final javax.xml.namespace.QName COMPANYNAMEAVAILABILITYCHECK$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "companyNameAvailabilityCheck");
    private static final javax.xml.namespace.QName BNNAMEAVAILABILITYCHECK$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "bnNameAvailabilityCheck");
    private static final javax.xml.namespace.QName PROPRIETOR$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "proprietor");
    
    
    /**
     * Gets the "proposedName" element
     */
    public java.lang.String getProposedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPOSEDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "proposedName" element
     */
    public au.gov.asic.types.NniNameType xgetProposedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(PROPOSEDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "proposedName" element
     */
    public void setProposedName(java.lang.String proposedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPOSEDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPOSEDNAME$0);
            }
            target.setStringValue(proposedName);
        }
    }
    
    /**
     * Sets (as xml) the "proposedName" element
     */
    public void xsetProposedName(au.gov.asic.types.NniNameType proposedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(PROPOSEDNAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(PROPOSEDNAME$0);
            }
            target.set(proposedName);
        }
    }
    
    /**
     * Gets the "companyNameAvailabilityCheck" element
     */
    public boolean getCompanyNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAMEAVAILABILITYCHECK$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "companyNameAvailabilityCheck" element
     */
    public au.gov.asic.types.TrueType xgetCompanyNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(COMPANYNAMEAVAILABILITYCHECK$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "companyNameAvailabilityCheck" element
     */
    public boolean isSetCompanyNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYNAMEAVAILABILITYCHECK$2) != 0;
        }
    }
    
    /**
     * Sets the "companyNameAvailabilityCheck" element
     */
    public void setCompanyNameAvailabilityCheck(boolean companyNameAvailabilityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAMEAVAILABILITYCHECK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAMEAVAILABILITYCHECK$2);
            }
            target.setBooleanValue(companyNameAvailabilityCheck);
        }
    }
    
    /**
     * Sets (as xml) the "companyNameAvailabilityCheck" element
     */
    public void xsetCompanyNameAvailabilityCheck(au.gov.asic.types.TrueType companyNameAvailabilityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(COMPANYNAMEAVAILABILITYCHECK$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(COMPANYNAMEAVAILABILITYCHECK$2);
            }
            target.set(companyNameAvailabilityCheck);
        }
    }
    
    /**
     * Unsets the "companyNameAvailabilityCheck" element
     */
    public void unsetCompanyNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYNAMEAVAILABILITYCHECK$2, 0);
        }
    }
    
    /**
     * Gets the "bnNameAvailabilityCheck" element
     */
    public boolean getBnNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNNAMEAVAILABILITYCHECK$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bnNameAvailabilityCheck" element
     */
    public au.gov.asic.types.TrueType xgetBnNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(BNNAMEAVAILABILITYCHECK$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "bnNameAvailabilityCheck" element
     */
    public boolean isSetBnNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BNNAMEAVAILABILITYCHECK$4) != 0;
        }
    }
    
    /**
     * Sets the "bnNameAvailabilityCheck" element
     */
    public void setBnNameAvailabilityCheck(boolean bnNameAvailabilityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNNAMEAVAILABILITYCHECK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNNAMEAVAILABILITYCHECK$4);
            }
            target.setBooleanValue(bnNameAvailabilityCheck);
        }
    }
    
    /**
     * Sets (as xml) the "bnNameAvailabilityCheck" element
     */
    public void xsetBnNameAvailabilityCheck(au.gov.asic.types.TrueType bnNameAvailabilityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(BNNAMEAVAILABILITYCHECK$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(BNNAMEAVAILABILITYCHECK$4);
            }
            target.set(bnNameAvailabilityCheck);
        }
    }
    
    /**
     * Unsets the "bnNameAvailabilityCheck" element
     */
    public void unsetBnNameAvailabilityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BNNAMEAVAILABILITYCHECK$4, 0);
        }
    }
    
    /**
     * Gets the "proprietor" element
     */
    public au.gov.asic.types.nni.QueryNniNameType.Proprietor getProprietor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.QueryNniNameType.Proprietor target = null;
            target = (au.gov.asic.types.nni.QueryNniNameType.Proprietor)get_store().find_element_user(PROPRIETOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "proprietor" element
     */
    public boolean isSetProprietor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPRIETOR$6) != 0;
        }
    }
    
    /**
     * Sets the "proprietor" element
     */
    public void setProprietor(au.gov.asic.types.nni.QueryNniNameType.Proprietor proprietor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.QueryNniNameType.Proprietor target = null;
            target = (au.gov.asic.types.nni.QueryNniNameType.Proprietor)get_store().find_element_user(PROPRIETOR$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.QueryNniNameType.Proprietor)get_store().add_element_user(PROPRIETOR$6);
            }
            target.set(proprietor);
        }
    }
    
    /**
     * Appends and returns a new empty "proprietor" element
     */
    public au.gov.asic.types.nni.QueryNniNameType.Proprietor addNewProprietor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.QueryNniNameType.Proprietor target = null;
            target = (au.gov.asic.types.nni.QueryNniNameType.Proprietor)get_store().add_element_user(PROPRIETOR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "proprietor" element
     */
    public void unsetProprietor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPRIETOR$6, 0);
        }
    }
    /**
     * An XML proprietor(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class ProprietorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.QueryNniNameType.Proprietor
    {
        
        public ProprietorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPRIETORACN$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "proprietorAcn");
        private static final javax.xml.namespace.QName PROPRIETORABN$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "proprietorAbn");
        
        
        /**
         * Gets the "proprietorAcn" element
         */
        public int getProprietorAcn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPRIETORACN$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "proprietorAcn" element
         */
        public au.gov.asic.types.NniNumberType xgetProprietorAcn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNumberType target = null;
                target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(PROPRIETORACN$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "proprietorAcn" element
         */
        public boolean isSetProprietorAcn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPRIETORACN$0) != 0;
            }
        }
        
        /**
         * Sets the "proprietorAcn" element
         */
        public void setProprietorAcn(int proprietorAcn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPRIETORACN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPRIETORACN$0);
                }
                target.setIntValue(proprietorAcn);
            }
        }
        
        /**
         * Sets (as xml) the "proprietorAcn" element
         */
        public void xsetProprietorAcn(au.gov.asic.types.NniNumberType proprietorAcn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNumberType target = null;
                target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(PROPRIETORACN$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(PROPRIETORACN$0);
                }
                target.set(proprietorAcn);
            }
        }
        
        /**
         * Unsets the "proprietorAcn" element
         */
        public void unsetProprietorAcn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPRIETORACN$0, 0);
            }
        }
        
        /**
         * Gets the "proprietorAbn" element
         */
        public java.lang.String getProprietorAbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPRIETORABN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "proprietorAbn" element
         */
        public au.gov.asic.types.AbnType xgetProprietorAbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AbnType target = null;
                target = (au.gov.asic.types.AbnType)get_store().find_element_user(PROPRIETORABN$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "proprietorAbn" element
         */
        public boolean isSetProprietorAbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPRIETORABN$2) != 0;
            }
        }
        
        /**
         * Sets the "proprietorAbn" element
         */
        public void setProprietorAbn(java.lang.String proprietorAbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPRIETORABN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPRIETORABN$2);
                }
                target.setStringValue(proprietorAbn);
            }
        }
        
        /**
         * Sets (as xml) the "proprietorAbn" element
         */
        public void xsetProprietorAbn(au.gov.asic.types.AbnType proprietorAbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AbnType target = null;
                target = (au.gov.asic.types.AbnType)get_store().find_element_user(PROPRIETORABN$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AbnType)get_store().add_element_user(PROPRIETORABN$2);
                }
                target.set(proprietorAbn);
            }
        }
        
        /**
         * Unsets the "proprietorAbn" element
         */
        public void unsetProprietorAbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPRIETORABN$2, 0);
            }
        }
    }
}
