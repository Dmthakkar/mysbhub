/*
 * XML Type:  searchNniRequestType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.SearchNniRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML searchNniRequestType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class SearchNniRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.SearchNniRequestType
{
    
    public SearchNniRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHTYPE$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "searchType");
    private static final javax.xml.namespace.QName SEARCHSCOPE$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "searchScope");
    private static final javax.xml.namespace.QName ORGANISATION$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "organisation");
    private static final javax.xml.namespace.QName MAXRESULT$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "maxResult");
    
    
    /**
     * Gets the "searchType" element
     */
    public au.gov.asic.types.nni.SearchNniRequestType.SearchType.Enum getSearchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.nni.SearchNniRequestType.SearchType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "searchType" element
     */
    public au.gov.asic.types.nni.SearchNniRequestType.SearchType xgetSearchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.SearchType target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.SearchType)get_store().find_element_user(SEARCHTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "searchType" element
     */
    public void setSearchType(au.gov.asic.types.nni.SearchNniRequestType.SearchType.Enum searchType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHTYPE$0);
            }
            target.setEnumValue(searchType);
        }
    }
    
    /**
     * Sets (as xml) the "searchType" element
     */
    public void xsetSearchType(au.gov.asic.types.nni.SearchNniRequestType.SearchType searchType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.SearchType target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.SearchType)get_store().find_element_user(SEARCHTYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.SearchNniRequestType.SearchType)get_store().add_element_user(SEARCHTYPE$0);
            }
            target.set(searchType);
        }
    }
    
    /**
     * Gets the "searchScope" element
     */
    public java.lang.String getSearchScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHSCOPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "searchScope" element
     */
    public au.gov.asic.types.nni.SearchNniRequestType.SearchScope xgetSearchScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.SearchScope target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.SearchScope)get_store().find_element_user(SEARCHSCOPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "searchScope" element
     */
    public void setSearchScope(java.lang.String searchScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHSCOPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHSCOPE$2);
            }
            target.setStringValue(searchScope);
        }
    }
    
    /**
     * Sets (as xml) the "searchScope" element
     */
    public void xsetSearchScope(au.gov.asic.types.nni.SearchNniRequestType.SearchScope searchScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.SearchScope target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.SearchScope)get_store().find_element_user(SEARCHSCOPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.SearchNniRequestType.SearchScope)get_store().add_element_user(SEARCHSCOPE$2);
            }
            target.set(searchScope);
        }
    }
    
    /**
     * Gets the "organisation" element
     */
    public au.gov.asic.types.nni.SearchNniRequestType.Organisation getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.Organisation target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.Organisation)get_store().find_element_user(ORGANISATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organisation" element
     */
    public void setOrganisation(au.gov.asic.types.nni.SearchNniRequestType.Organisation organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.Organisation target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.Organisation)get_store().find_element_user(ORGANISATION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.SearchNniRequestType.Organisation)get_store().add_element_user(ORGANISATION$4);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    public au.gov.asic.types.nni.SearchNniRequestType.Organisation addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.SearchNniRequestType.Organisation target = null;
            target = (au.gov.asic.types.nni.SearchNniRequestType.Organisation)get_store().add_element_user(ORGANISATION$4);
            return target;
        }
    }
    
    /**
     * Gets the "maxResult" element
     */
    public java.math.BigInteger getMaxResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxResult" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaxResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXRESULT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "maxResult" element
     */
    public boolean isSetMaxResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXRESULT$6) != 0;
        }
    }
    
    /**
     * Sets the "maxResult" element
     */
    public void setMaxResult(java.math.BigInteger maxResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRESULT$6);
            }
            target.setBigIntegerValue(maxResult);
        }
    }
    
    /**
     * Sets (as xml) the "maxResult" element
     */
    public void xsetMaxResult(org.apache.xmlbeans.XmlPositiveInteger maxResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXRESULT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MAXRESULT$6);
            }
            target.set(maxResult);
        }
    }
    
    /**
     * Unsets the "maxResult" element
     */
    public void unsetMaxResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXRESULT$6, 0);
        }
    }
    /**
     * An XML searchType(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.SearchNniRequestType$SearchType.
     */
    public static class SearchTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.nni.SearchNniRequestType.SearchType
    {
        
        public SearchTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SearchTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML searchScope(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.SearchNniRequestType$SearchScope.
     */
    public static class SearchScopeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.nni.SearchNniRequestType.SearchScope
    {
        
        public SearchScopeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SearchScopeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML organisation(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class OrganisationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.SearchNniRequestType.Organisation
    {
        
        public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "name");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "type");
        private static final javax.xml.namespace.QName STATUS$4 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "status");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public au.gov.asic.types.NniNameType xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNameType target = null;
                target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(au.gov.asic.types.NniNameType name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNameType target = null;
                target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public au.gov.asic.types.nni.NniTypeCodeType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.nni.NniTypeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public au.gov.asic.types.nni.NniTypeCodeType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.NniTypeCodeType target = null;
                target = (au.gov.asic.types.nni.NniTypeCodeType)get_store().find_element_user(TYPE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "type" element
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(au.gov.asic.types.nni.NniTypeCodeType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(au.gov.asic.types.nni.NniTypeCodeType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.NniTypeCodeType target = null;
                target = (au.gov.asic.types.nni.NniTypeCodeType)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.nni.NniTypeCodeType)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" element
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$2, 0);
            }
        }
        
        /**
         * Gets the "status" element
         */
        public au.gov.asic.types.nni.SearchStatusType.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.nni.SearchStatusType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" element
         */
        public au.gov.asic.types.nni.SearchStatusType xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.SearchStatusType target = null;
                target = (au.gov.asic.types.nni.SearchStatusType)get_store().find_element_user(STATUS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$4) != 0;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(au.gov.asic.types.nni.SearchStatusType.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$4);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" element
         */
        public void xsetStatus(au.gov.asic.types.nni.SearchStatusType status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.SearchStatusType target = null;
                target = (au.gov.asic.types.nni.SearchStatusType)get_store().find_element_user(STATUS$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.nni.SearchStatusType)get_store().add_element_user(STATUS$4);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$4, 0);
            }
        }
    }
}
