/*
 * XML Type:  bnSearchRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnSearchRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnSearchRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnSearchRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnSearchRequestType
{
    
    public BnSearchRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCH$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "search");
    private static final javax.xml.namespace.QName FILTER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "filter");
    private static final javax.xml.namespace.QName MAXRESULT$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "maxResult");
    
    
    /**
     * Gets the "search" element
     */
    public au.gov.asic.types.bn.BnSearchRequestType.Search getSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnSearchRequestType.Search target = null;
            target = (au.gov.asic.types.bn.BnSearchRequestType.Search)get_store().find_element_user(SEARCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "search" element
     */
    public void setSearch(au.gov.asic.types.bn.BnSearchRequestType.Search search)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnSearchRequestType.Search target = null;
            target = (au.gov.asic.types.bn.BnSearchRequestType.Search)get_store().find_element_user(SEARCH$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnSearchRequestType.Search)get_store().add_element_user(SEARCH$0);
            }
            target.set(search);
        }
    }
    
    /**
     * Appends and returns a new empty "search" element
     */
    public au.gov.asic.types.bn.BnSearchRequestType.Search addNewSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnSearchRequestType.Search target = null;
            target = (au.gov.asic.types.bn.BnSearchRequestType.Search)get_store().add_element_user(SEARCH$0);
            return target;
        }
    }
    
    /**
     * Gets the "filter" element
     */
    public au.gov.asic.types.bn.BnSearchRequestType.Filter getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnSearchRequestType.Filter target = null;
            target = (au.gov.asic.types.bn.BnSearchRequestType.Filter)get_store().find_element_user(FILTER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filter" element
     */
    public boolean isSetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$2) != 0;
        }
    }
    
    /**
     * Sets the "filter" element
     */
    public void setFilter(au.gov.asic.types.bn.BnSearchRequestType.Filter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnSearchRequestType.Filter target = null;
            target = (au.gov.asic.types.bn.BnSearchRequestType.Filter)get_store().find_element_user(FILTER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnSearchRequestType.Filter)get_store().add_element_user(FILTER$2);
            }
            target.set(filter);
        }
    }
    
    /**
     * Appends and returns a new empty "filter" element
     */
    public au.gov.asic.types.bn.BnSearchRequestType.Filter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnSearchRequestType.Filter target = null;
            target = (au.gov.asic.types.bn.BnSearchRequestType.Filter)get_store().add_element_user(FILTER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "filter" element
     */
    public void unsetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULT$4, 0);
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
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXRESULT$4, 0);
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
            return get_store().count_elements(MAXRESULT$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRESULT$4);
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
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXRESULT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MAXRESULT$4);
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
            get_store().remove_element(MAXRESULT$4, 0);
        }
    }
    /**
     * An XML search(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class SearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnSearchRequestType.Search
    {
        
        public SearchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ABN$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "abn");
        private static final javax.xml.namespace.QName ORGNUMBER$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "orgNumber");
        private static final javax.xml.namespace.QName NNINUMBER$4 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "nniNumber");
        private static final javax.xml.namespace.QName ORGANISATION$6 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "organisation");
        private static final javax.xml.namespace.QName PREVIOUSSTATEORTERRITORY$8 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "previousStateOrTerritory");
        private static final javax.xml.namespace.QName BNREFERENCENUMBER$10 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "bnReferenceNumber");
        
        
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
         * Gets the "orgNumber" element
         */
        public java.lang.String getOrgNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGNUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "orgNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetOrgNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGNUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "orgNumber" element
         */
        public boolean isSetOrgNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGNUMBER$2) != 0;
            }
        }
        
        /**
         * Sets the "orgNumber" element
         */
        public void setOrgNumber(java.lang.String orgNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGNUMBER$2);
                }
                target.setStringValue(orgNumber);
            }
        }
        
        /**
         * Sets (as xml) the "orgNumber" element
         */
        public void xsetOrgNumber(org.apache.xmlbeans.XmlString orgNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGNUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGNUMBER$2);
                }
                target.set(orgNumber);
            }
        }
        
        /**
         * Unsets the "orgNumber" element
         */
        public void unsetOrgNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGNUMBER$2, 0);
            }
        }
        
        /**
         * Gets the "nniNumber" element
         */
        public java.lang.String getNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nniNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NNINUMBER$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "nniNumber" element
         */
        public boolean isSetNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NNINUMBER$4) != 0;
            }
        }
        
        /**
         * Sets the "nniNumber" element
         */
        public void setNniNumber(java.lang.String nniNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$4);
                }
                target.setStringValue(nniNumber);
            }
        }
        
        /**
         * Sets (as xml) the "nniNumber" element
         */
        public void xsetNniNumber(org.apache.xmlbeans.XmlString nniNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NNINUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NNINUMBER$4);
                }
                target.set(nniNumber);
            }
        }
        
        /**
         * Unsets the "nniNumber" element
         */
        public void unsetNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NNINUMBER$4, 0);
            }
        }
        
        /**
         * Gets the "organisation" element
         */
        public au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation getOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation target = null;
                target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation)get_store().find_element_user(ORGANISATION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "organisation" element
         */
        public boolean isSetOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATION$6) != 0;
            }
        }
        
        /**
         * Sets the "organisation" element
         */
        public void setOrganisation(au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation organisation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation target = null;
                target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation)get_store().find_element_user(ORGANISATION$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation)get_store().add_element_user(ORGANISATION$6);
                }
                target.set(organisation);
            }
        }
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        public au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation addNewOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation target = null;
                target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation)get_store().add_element_user(ORGANISATION$6);
                return target;
            }
        }
        
        /**
         * Unsets the "organisation" element
         */
        public void unsetOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATION$6, 0);
            }
        }
        
        /**
         * Gets the "previousStateOrTerritory" element
         */
        public au.gov.asic.types.bn.PreviousStateTerritoryType getPreviousStateOrTerritory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATEORTERRITORY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "previousStateOrTerritory" element
         */
        public boolean isSetPreviousStateOrTerritory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREVIOUSSTATEORTERRITORY$8) != 0;
            }
        }
        
        /**
         * Sets the "previousStateOrTerritory" element
         */
        public void setPreviousStateOrTerritory(au.gov.asic.types.bn.PreviousStateTerritoryType previousStateOrTerritory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATEORTERRITORY$8, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATEORTERRITORY$8);
                }
                target.set(previousStateOrTerritory);
            }
        }
        
        /**
         * Appends and returns a new empty "previousStateOrTerritory" element
         */
        public au.gov.asic.types.bn.PreviousStateTerritoryType addNewPreviousStateOrTerritory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATEORTERRITORY$8);
                return target;
            }
        }
        
        /**
         * Unsets the "previousStateOrTerritory" element
         */
        public void unsetPreviousStateOrTerritory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREVIOUSSTATEORTERRITORY$8, 0);
            }
        }
        
        /**
         * Gets the "bnReferenceNumber" element
         */
        public java.lang.String getBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bnReferenceNumber" element
         */
        public au.gov.asic.types.BnReferenceNumberType xgetBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.BnReferenceNumberType target = null;
                target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "bnReferenceNumber" element
         */
        public boolean isSetBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BNREFERENCENUMBER$10) != 0;
            }
        }
        
        /**
         * Sets the "bnReferenceNumber" element
         */
        public void setBnReferenceNumber(java.lang.String bnReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNREFERENCENUMBER$10);
                }
                target.setStringValue(bnReferenceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "bnReferenceNumber" element
         */
        public void xsetBnReferenceNumber(au.gov.asic.types.BnReferenceNumberType bnReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.BnReferenceNumberType target = null;
                target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$10, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.BnReferenceNumberType)get_store().add_element_user(BNREFERENCENUMBER$10);
                }
                target.set(bnReferenceNumber);
            }
        }
        
        /**
         * Unsets the "bnReferenceNumber" element
         */
        public void unsetBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BNREFERENCENUMBER$10, 0);
            }
        }
        /**
         * An XML organisation(@uri:bn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class OrganisationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation
        {
            
            public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
            
            
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
            public au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name target = null;
                    target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name)get_store().find_element_user(NAME$0, 0);
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
            public void xsetName(au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name target = null;
                    target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name)get_store().add_element_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            /**
             * An XML name(@uri:bn.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnSearchRequestType$Search$Organisation$Name.
             */
            public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name
            {
                
                public NameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
    /**
     * An XML filter(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class FilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnSearchRequestType.Filter
    {
        
        public FilterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROLECATEGORY$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "roleCategory");
        private static final javax.xml.namespace.QName STATUSCODE$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "statusCode");
        private static final javax.xml.namespace.QName PRINCIPALPLACEOFBUSINESS$4 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "principalPlaceOfBusiness");
        
        
        /**
         * Gets the "roleCategory" element
         */
        public au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory.Enum getRoleCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLECATEGORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "roleCategory" element
         */
        public au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory xgetRoleCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory target = null;
                target = (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory)get_store().find_element_user(ROLECATEGORY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "roleCategory" element
         */
        public boolean isSetRoleCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLECATEGORY$0) != 0;
            }
        }
        
        /**
         * Sets the "roleCategory" element
         */
        public void setRoleCategory(au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory.Enum roleCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLECATEGORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLECATEGORY$0);
                }
                target.setEnumValue(roleCategory);
            }
        }
        
        /**
         * Sets (as xml) the "roleCategory" element
         */
        public void xsetRoleCategory(au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory roleCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory target = null;
                target = (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory)get_store().find_element_user(ROLECATEGORY$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory)get_store().add_element_user(ROLECATEGORY$0);
                }
                target.set(roleCategory);
            }
        }
        
        /**
         * Unsets the "roleCategory" element
         */
        public void unsetRoleCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLECATEGORY$0, 0);
            }
        }
        
        /**
         * Gets array of all "statusCode" elements
         */
        public au.gov.asic.types.bn.BnSearchStatusCodeType.Enum[] getStatusCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUSCODE$2, targetList);
                au.gov.asic.types.bn.BnSearchStatusCodeType.Enum[] result = new au.gov.asic.types.bn.BnSearchStatusCodeType.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (au.gov.asic.types.bn.BnSearchStatusCodeType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "statusCode" element
         */
        public au.gov.asic.types.bn.BnSearchStatusCodeType.Enum getStatusCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (au.gov.asic.types.bn.BnSearchStatusCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "statusCode" elements
         */
        public au.gov.asic.types.bn.BnSearchStatusCodeType[] xgetStatusCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUSCODE$2, targetList);
                au.gov.asic.types.bn.BnSearchStatusCodeType[] result = new au.gov.asic.types.bn.BnSearchStatusCodeType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "statusCode" element
         */
        public au.gov.asic.types.bn.BnSearchStatusCodeType xgetStatusCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchStatusCodeType target = null;
                target = (au.gov.asic.types.bn.BnSearchStatusCodeType)get_store().find_element_user(STATUSCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (au.gov.asic.types.bn.BnSearchStatusCodeType)target;
            }
        }
        
        /**
         * Returns number of "statusCode" element
         */
        public int sizeOfStatusCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSCODE$2);
            }
        }
        
        /**
         * Sets array of all "statusCode" element
         */
        public void setStatusCodeArray(au.gov.asic.types.bn.BnSearchStatusCodeType.Enum[] statusCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusCodeArray, STATUSCODE$2);
            }
        }
        
        /**
         * Sets ith "statusCode" element
         */
        public void setStatusCodeArray(int i, au.gov.asic.types.bn.BnSearchStatusCodeType.Enum statusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(statusCode);
            }
        }
        
        /**
         * Sets (as xml) array of all "statusCode" element
         */
        public void xsetStatusCodeArray(au.gov.asic.types.bn.BnSearchStatusCodeType[]statusCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusCodeArray, STATUSCODE$2);
            }
        }
        
        /**
         * Sets (as xml) ith "statusCode" element
         */
        public void xsetStatusCodeArray(int i, au.gov.asic.types.bn.BnSearchStatusCodeType statusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchStatusCodeType target = null;
                target = (au.gov.asic.types.bn.BnSearchStatusCodeType)get_store().find_element_user(STATUSCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(statusCode);
            }
        }
        
        /**
         * Inserts the value as the ith "statusCode" element
         */
        public void insertStatusCode(int i, au.gov.asic.types.bn.BnSearchStatusCodeType.Enum statusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATUSCODE$2, i);
                target.setEnumValue(statusCode);
            }
        }
        
        /**
         * Appends the value as the last "statusCode" element
         */
        public void addStatusCode(au.gov.asic.types.bn.BnSearchStatusCodeType.Enum statusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODE$2);
                target.setEnumValue(statusCode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "statusCode" element
         */
        public au.gov.asic.types.bn.BnSearchStatusCodeType insertNewStatusCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchStatusCodeType target = null;
                target = (au.gov.asic.types.bn.BnSearchStatusCodeType)get_store().insert_element_user(STATUSCODE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "statusCode" element
         */
        public au.gov.asic.types.bn.BnSearchStatusCodeType addNewStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnSearchStatusCodeType target = null;
                target = (au.gov.asic.types.bn.BnSearchStatusCodeType)get_store().add_element_user(STATUSCODE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "statusCode" element
         */
        public void removeStatusCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSCODE$2, i);
            }
        }
        
        /**
         * Gets the "principalPlaceOfBusiness" element
         */
        public au.gov.asic.types.bn.LocationType getPrincipalPlaceOfBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.LocationType target = null;
                target = (au.gov.asic.types.bn.LocationType)get_store().find_element_user(PRINCIPALPLACEOFBUSINESS$4, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(PRINCIPALPLACEOFBUSINESS$4) != 0;
            }
        }
        
        /**
         * Sets the "principalPlaceOfBusiness" element
         */
        public void setPrincipalPlaceOfBusiness(au.gov.asic.types.bn.LocationType principalPlaceOfBusiness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.LocationType target = null;
                target = (au.gov.asic.types.bn.LocationType)get_store().find_element_user(PRINCIPALPLACEOFBUSINESS$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.LocationType)get_store().add_element_user(PRINCIPALPLACEOFBUSINESS$4);
                }
                target.set(principalPlaceOfBusiness);
            }
        }
        
        /**
         * Appends and returns a new empty "principalPlaceOfBusiness" element
         */
        public au.gov.asic.types.bn.LocationType addNewPrincipalPlaceOfBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.LocationType target = null;
                target = (au.gov.asic.types.bn.LocationType)get_store().add_element_user(PRINCIPALPLACEOFBUSINESS$4);
                return target;
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
                get_store().remove_element(PRINCIPALPLACEOFBUSINESS$4, 0);
            }
        }
        /**
         * An XML roleCategory(@uri:bn.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnSearchRequestType$Filter$RoleCategory.
         */
        public static class RoleCategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory
        {
            
            public RoleCategoryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RoleCategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
