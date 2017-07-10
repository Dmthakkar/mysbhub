/*
 * XML Type:  companyExtractRequestType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.CompanyExtractRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML companyExtractRequestType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class CompanyExtractRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.CompanyExtractRequestType
{
    
    public CompanyExtractRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName ACN$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "acn");
    private static final javax.xml.namespace.QName COMPANY$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "company");
    private static final javax.xml.namespace.QName FORMERNAMES$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "formerNames");
    private static final javax.xml.namespace.QName BUSINESSNAMES$8 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "businessNames");
    private static final javax.xml.namespace.QName DOCUMENT$10 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "document");
    
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abn" element
     */
    public au.gov.asic.types.AbnType xgetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "abn" element
     */
    public boolean isSetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$0) != 0;
        }
    }
    
    /**
     * Sets the "abn" element
     */
    public void setAbn(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$0);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "abn" element
     */
    public void xsetAbn(au.gov.asic.types.AbnType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$0);
            }
            target.set(abn);
        }
    }
    
    /**
     * Unsets the "abn" element
     */
    public void unsetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$0, 0);
        }
    }
    
    /**
     * Gets the "acn" element
     */
    public int getAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACN$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "acn" element
     */
    public au.gov.asic.types.NniNumberType xgetAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(ACN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "acn" element
     */
    public boolean isSetAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACN$2) != 0;
        }
    }
    
    /**
     * Sets the "acn" element
     */
    public void setAcn(int acn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACN$2);
            }
            target.setIntValue(acn);
        }
    }
    
    /**
     * Sets (as xml) the "acn" element
     */
    public void xsetAcn(au.gov.asic.types.NniNumberType acn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(ACN$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(ACN$2);
            }
            target.set(acn);
        }
    }
    
    /**
     * Unsets the "acn" element
     */
    public void unsetAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACN$2, 0);
        }
    }
    
    /**
     * Gets the "company" element
     */
    public au.gov.asic.types.nni.CompanyExtractRequestType.Company getCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyExtractRequestType.Company target = null;
            target = (au.gov.asic.types.nni.CompanyExtractRequestType.Company)get_store().find_element_user(COMPANY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "company" element
     */
    public boolean isSetCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANY$4) != 0;
        }
    }
    
    /**
     * Sets the "company" element
     */
    public void setCompany(au.gov.asic.types.nni.CompanyExtractRequestType.Company company)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyExtractRequestType.Company target = null;
            target = (au.gov.asic.types.nni.CompanyExtractRequestType.Company)get_store().find_element_user(COMPANY$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.CompanyExtractRequestType.Company)get_store().add_element_user(COMPANY$4);
            }
            target.set(company);
        }
    }
    
    /**
     * Appends and returns a new empty "company" element
     */
    public au.gov.asic.types.nni.CompanyExtractRequestType.Company addNewCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyExtractRequestType.Company target = null;
            target = (au.gov.asic.types.nni.CompanyExtractRequestType.Company)get_store().add_element_user(COMPANY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "company" element
     */
    public void unsetCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANY$4, 0);
        }
    }
    
    /**
     * Gets the "formerNames" element
     */
    public boolean getFormerNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMERNAMES$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "formerNames" element
     */
    public au.gov.asic.types.TrueType xgetFormerNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(FORMERNAMES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "formerNames" element
     */
    public boolean isSetFormerNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMERNAMES$6) != 0;
        }
    }
    
    /**
     * Sets the "formerNames" element
     */
    public void setFormerNames(boolean formerNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMERNAMES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMERNAMES$6);
            }
            target.setBooleanValue(formerNames);
        }
    }
    
    /**
     * Sets (as xml) the "formerNames" element
     */
    public void xsetFormerNames(au.gov.asic.types.TrueType formerNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(FORMERNAMES$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(FORMERNAMES$6);
            }
            target.set(formerNames);
        }
    }
    
    /**
     * Unsets the "formerNames" element
     */
    public void unsetFormerNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMERNAMES$6, 0);
        }
    }
    
    /**
     * Gets the "businessNames" element
     */
    public boolean getBusinessNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNAMES$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "businessNames" element
     */
    public au.gov.asic.types.TrueType xgetBusinessNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(BUSINESSNAMES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "businessNames" element
     */
    public boolean isSetBusinessNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSNAMES$8) != 0;
        }
    }
    
    /**
     * Sets the "businessNames" element
     */
    public void setBusinessNames(boolean businessNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNAMES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSNAMES$8);
            }
            target.setBooleanValue(businessNames);
        }
    }
    
    /**
     * Sets (as xml) the "businessNames" element
     */
    public void xsetBusinessNames(au.gov.asic.types.TrueType businessNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(BUSINESSNAMES$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(BUSINESSNAMES$8);
            }
            target.set(businessNames);
        }
    }
    
    /**
     * Unsets the "businessNames" element
     */
    public void unsetBusinessNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSNAMES$8, 0);
        }
    }
    
    /**
     * Gets the "document" element
     */
    public au.gov.asic.types.nni.CompanyExtractRequestType.Document getDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyExtractRequestType.Document target = null;
            target = (au.gov.asic.types.nni.CompanyExtractRequestType.Document)get_store().find_element_user(DOCUMENT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "document" element
     */
    public boolean isSetDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENT$10) != 0;
        }
    }
    
    /**
     * Sets the "document" element
     */
    public void setDocument(au.gov.asic.types.nni.CompanyExtractRequestType.Document document)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyExtractRequestType.Document target = null;
            target = (au.gov.asic.types.nni.CompanyExtractRequestType.Document)get_store().find_element_user(DOCUMENT$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.CompanyExtractRequestType.Document)get_store().add_element_user(DOCUMENT$10);
            }
            target.set(document);
        }
    }
    
    /**
     * Appends and returns a new empty "document" element
     */
    public au.gov.asic.types.nni.CompanyExtractRequestType.Document addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyExtractRequestType.Document target = null;
            target = (au.gov.asic.types.nni.CompanyExtractRequestType.Document)get_store().add_element_user(DOCUMENT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "document" element
     */
    public void unsetDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENT$10, 0);
        }
    }
    /**
     * An XML company(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class CompanyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.CompanyExtractRequestType.Company
    {
        
        public CompanyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REGISTEREDOFFICE$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "registeredOffice");
        private static final javax.xml.namespace.QName PRINCIPALPLACEOFBUSINESS$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "principalPlaceOfBusiness");
        private static final javax.xml.namespace.QName OFFICEHOLDERS$4 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "officeholders");
        private static final javax.xml.namespace.QName SHAREHOLDERS$6 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "shareHolders");
        
        
        /**
         * Gets the "registeredOffice" element
         */
        public boolean getRegisteredOffice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTEREDOFFICE$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "registeredOffice" element
         */
        public au.gov.asic.types.TrueType xgetRegisteredOffice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REGISTEREDOFFICE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "registeredOffice" element
         */
        public boolean isSetRegisteredOffice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGISTEREDOFFICE$0) != 0;
            }
        }
        
        /**
         * Sets the "registeredOffice" element
         */
        public void setRegisteredOffice(boolean registeredOffice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTEREDOFFICE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTEREDOFFICE$0);
                }
                target.setBooleanValue(registeredOffice);
            }
        }
        
        /**
         * Sets (as xml) the "registeredOffice" element
         */
        public void xsetRegisteredOffice(au.gov.asic.types.TrueType registeredOffice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REGISTEREDOFFICE$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(REGISTEREDOFFICE$0);
                }
                target.set(registeredOffice);
            }
        }
        
        /**
         * Unsets the "registeredOffice" element
         */
        public void unsetRegisteredOffice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGISTEREDOFFICE$0, 0);
            }
        }
        
        /**
         * Gets the "principalPlaceOfBusiness" element
         */
        public boolean getPrincipalPlaceOfBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALPLACEOFBUSINESS$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "principalPlaceOfBusiness" element
         */
        public au.gov.asic.types.TrueType xgetPrincipalPlaceOfBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(PRINCIPALPLACEOFBUSINESS$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "principalPlaceOfBusiness" element
         */
        public boolean isSetPrincipalPlaceOfBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRINCIPALPLACEOFBUSINESS$2) != 0;
            }
        }
        
        /**
         * Sets the "principalPlaceOfBusiness" element
         */
        public void setPrincipalPlaceOfBusiness(boolean principalPlaceOfBusiness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALPLACEOFBUSINESS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRINCIPALPLACEOFBUSINESS$2);
                }
                target.setBooleanValue(principalPlaceOfBusiness);
            }
        }
        
        /**
         * Sets (as xml) the "principalPlaceOfBusiness" element
         */
        public void xsetPrincipalPlaceOfBusiness(au.gov.asic.types.TrueType principalPlaceOfBusiness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(PRINCIPALPLACEOFBUSINESS$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(PRINCIPALPLACEOFBUSINESS$2);
                }
                target.set(principalPlaceOfBusiness);
            }
        }
        
        /**
         * Unsets the "principalPlaceOfBusiness" element
         */
        public void unsetPrincipalPlaceOfBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRINCIPALPLACEOFBUSINESS$2, 0);
            }
        }
        
        /**
         * Gets the "officeholders" element
         */
        public boolean getOfficeholders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICEHOLDERS$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "officeholders" element
         */
        public au.gov.asic.types.TrueType xgetOfficeholders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(OFFICEHOLDERS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "officeholders" element
         */
        public boolean isSetOfficeholders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFICEHOLDERS$4) != 0;
            }
        }
        
        /**
         * Sets the "officeholders" element
         */
        public void setOfficeholders(boolean officeholders)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICEHOLDERS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFICEHOLDERS$4);
                }
                target.setBooleanValue(officeholders);
            }
        }
        
        /**
         * Sets (as xml) the "officeholders" element
         */
        public void xsetOfficeholders(au.gov.asic.types.TrueType officeholders)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(OFFICEHOLDERS$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(OFFICEHOLDERS$4);
                }
                target.set(officeholders);
            }
        }
        
        /**
         * Unsets the "officeholders" element
         */
        public void unsetOfficeholders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFICEHOLDERS$4, 0);
            }
        }
        
        /**
         * Gets the "shareHolders" element
         */
        public boolean getShareHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREHOLDERS$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "shareHolders" element
         */
        public au.gov.asic.types.TrueType xgetShareHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(SHAREHOLDERS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "shareHolders" element
         */
        public boolean isSetShareHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHAREHOLDERS$6) != 0;
            }
        }
        
        /**
         * Sets the "shareHolders" element
         */
        public void setShareHolders(boolean shareHolders)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREHOLDERS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREHOLDERS$6);
                }
                target.setBooleanValue(shareHolders);
            }
        }
        
        /**
         * Sets (as xml) the "shareHolders" element
         */
        public void xsetShareHolders(au.gov.asic.types.TrueType shareHolders)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(SHAREHOLDERS$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(SHAREHOLDERS$6);
                }
                target.set(shareHolders);
            }
        }
        
        /**
         * Unsets the "shareHolders" element
         */
        public void unsetShareHolders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHAREHOLDERS$6, 0);
            }
        }
    }
    /**
     * An XML document(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.CompanyExtractRequestType.Document
    {
        
        public DocumentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATELISTSTART$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateListStart");
        private static final javax.xml.namespace.QName DATELISTEND$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateListEnd");
        private static final javax.xml.namespace.QName MAXDOCUMENTS$4 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "maxDocuments");
        
        
        /**
         * Gets the "dateListStart" element
         */
        public java.util.Calendar getDateListStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATELISTSTART$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "dateListStart" element
         */
        public org.apache.xmlbeans.XmlDate xgetDateListStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATELISTSTART$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "dateListStart" element
         */
        public boolean isSetDateListStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATELISTSTART$0) != 0;
            }
        }
        
        /**
         * Sets the "dateListStart" element
         */
        public void setDateListStart(java.util.Calendar dateListStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATELISTSTART$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATELISTSTART$0);
                }
                target.setCalendarValue(dateListStart);
            }
        }
        
        /**
         * Sets (as xml) the "dateListStart" element
         */
        public void xsetDateListStart(org.apache.xmlbeans.XmlDate dateListStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATELISTSTART$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATELISTSTART$0);
                }
                target.set(dateListStart);
            }
        }
        
        /**
         * Unsets the "dateListStart" element
         */
        public void unsetDateListStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATELISTSTART$0, 0);
            }
        }
        
        /**
         * Gets the "dateListEnd" element
         */
        public java.util.Calendar getDateListEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATELISTEND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "dateListEnd" element
         */
        public org.apache.xmlbeans.XmlDate xgetDateListEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATELISTEND$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "dateListEnd" element
         */
        public boolean isSetDateListEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATELISTEND$2) != 0;
            }
        }
        
        /**
         * Sets the "dateListEnd" element
         */
        public void setDateListEnd(java.util.Calendar dateListEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATELISTEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATELISTEND$2);
                }
                target.setCalendarValue(dateListEnd);
            }
        }
        
        /**
         * Sets (as xml) the "dateListEnd" element
         */
        public void xsetDateListEnd(org.apache.xmlbeans.XmlDate dateListEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATELISTEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATELISTEND$2);
                }
                target.set(dateListEnd);
            }
        }
        
        /**
         * Unsets the "dateListEnd" element
         */
        public void unsetDateListEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATELISTEND$2, 0);
            }
        }
        
        /**
         * Gets the "maxDocuments" element
         */
        public java.math.BigInteger getMaxDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOCUMENTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxDocuments" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetMaxDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXDOCUMENTS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxDocuments" element
         */
        public boolean isSetMaxDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXDOCUMENTS$4) != 0;
            }
        }
        
        /**
         * Sets the "maxDocuments" element
         */
        public void setMaxDocuments(java.math.BigInteger maxDocuments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOCUMENTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDOCUMENTS$4);
                }
                target.setBigIntegerValue(maxDocuments);
            }
        }
        
        /**
         * Sets (as xml) the "maxDocuments" element
         */
        public void xsetMaxDocuments(org.apache.xmlbeans.XmlPositiveInteger maxDocuments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXDOCUMENTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MAXDOCUMENTS$4);
                }
                target.set(maxDocuments);
            }
        }
        
        /**
         * Unsets the "maxDocuments" element
         */
        public void unsetMaxDocuments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXDOCUMENTS$4, 0);
            }
        }
    }
}
