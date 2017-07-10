/*
 * XML Type:  companyType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.CompanyType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML companyType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class CompanyTypeImpl extends au.gov.asic.types.nni.impl.NameIndexEntityTypeImpl implements au.gov.asic.types.nni.CompanyType
{
    
    public CompanyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFICEHOLDERS$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "officeholders");
    private static final javax.xml.namespace.QName SHAREHOLDERS$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "shareholders");
    private static final javax.xml.namespace.QName BUSINESSNAMES$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "businessNames");
    
    
    /**
     * Gets the "officeholders" element
     */
    public au.gov.asic.types.nni.CompanyType.Officeholders getOfficeholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyType.Officeholders target = null;
            target = (au.gov.asic.types.nni.CompanyType.Officeholders)get_store().find_element_user(OFFICEHOLDERS$0, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(OFFICEHOLDERS$0) != 0;
        }
    }
    
    /**
     * Sets the "officeholders" element
     */
    public void setOfficeholders(au.gov.asic.types.nni.CompanyType.Officeholders officeholders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyType.Officeholders target = null;
            target = (au.gov.asic.types.nni.CompanyType.Officeholders)get_store().find_element_user(OFFICEHOLDERS$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.CompanyType.Officeholders)get_store().add_element_user(OFFICEHOLDERS$0);
            }
            target.set(officeholders);
        }
    }
    
    /**
     * Appends and returns a new empty "officeholders" element
     */
    public au.gov.asic.types.nni.CompanyType.Officeholders addNewOfficeholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyType.Officeholders target = null;
            target = (au.gov.asic.types.nni.CompanyType.Officeholders)get_store().add_element_user(OFFICEHOLDERS$0);
            return target;
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
            get_store().remove_element(OFFICEHOLDERS$0, 0);
        }
    }
    
    /**
     * Gets the "shareholders" element
     */
    public au.gov.asic.types.nni.CompanyType.Shareholders getShareholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyType.Shareholders target = null;
            target = (au.gov.asic.types.nni.CompanyType.Shareholders)get_store().find_element_user(SHAREHOLDERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shareholders" element
     */
    public boolean isSetShareholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREHOLDERS$2) != 0;
        }
    }
    
    /**
     * Sets the "shareholders" element
     */
    public void setShareholders(au.gov.asic.types.nni.CompanyType.Shareholders shareholders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyType.Shareholders target = null;
            target = (au.gov.asic.types.nni.CompanyType.Shareholders)get_store().find_element_user(SHAREHOLDERS$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.CompanyType.Shareholders)get_store().add_element_user(SHAREHOLDERS$2);
            }
            target.set(shareholders);
        }
    }
    
    /**
     * Appends and returns a new empty "shareholders" element
     */
    public au.gov.asic.types.nni.CompanyType.Shareholders addNewShareholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.CompanyType.Shareholders target = null;
            target = (au.gov.asic.types.nni.CompanyType.Shareholders)get_store().add_element_user(SHAREHOLDERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "shareholders" element
     */
    public void unsetShareholders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREHOLDERS$2, 0);
        }
    }
    
    /**
     * Gets array of all "businessNames" elements
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType[] getBusinessNamesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSNAMES$4, targetList);
            au.gov.asic.types.bn.OutboundBusinessNameType[] result = new au.gov.asic.types.bn.OutboundBusinessNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "businessNames" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType getBusinessNamesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAMES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "businessNames" element
     */
    public int sizeOfBusinessNamesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSNAMES$4);
        }
    }
    
    /**
     * Sets array of all "businessNames" element
     */
    public void setBusinessNamesArray(au.gov.asic.types.bn.OutboundBusinessNameType[] businessNamesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(businessNamesArray, BUSINESSNAMES$4);
        }
    }
    
    /**
     * Sets ith "businessNames" element
     */
    public void setBusinessNamesArray(int i, au.gov.asic.types.bn.OutboundBusinessNameType businessNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAMES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessNames);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "businessNames" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType insertNewBusinessNames(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().insert_element_user(BUSINESSNAMES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "businessNames" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAMES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "businessNames" element
     */
    public void removeBusinessNames(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSNAMES$4, i);
        }
    }
    /**
     * An XML officeholders(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class OfficeholdersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.CompanyType.Officeholders
    {
        
        public OfficeholdersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFICEHOLDER$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "officeholder");
        
        
        /**
         * Gets array of all "officeholder" elements
         */
        public au.gov.asic.types.nni.OfficeholderType[] getOfficeholderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OFFICEHOLDER$0, targetList);
                au.gov.asic.types.nni.OfficeholderType[] result = new au.gov.asic.types.nni.OfficeholderType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "officeholder" element
         */
        public au.gov.asic.types.nni.OfficeholderType getOfficeholderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.OfficeholderType target = null;
                target = (au.gov.asic.types.nni.OfficeholderType)get_store().find_element_user(OFFICEHOLDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "officeholder" element
         */
        public int sizeOfOfficeholderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFICEHOLDER$0);
            }
        }
        
        /**
         * Sets array of all "officeholder" element
         */
        public void setOfficeholderArray(au.gov.asic.types.nni.OfficeholderType[] officeholderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(officeholderArray, OFFICEHOLDER$0);
            }
        }
        
        /**
         * Sets ith "officeholder" element
         */
        public void setOfficeholderArray(int i, au.gov.asic.types.nni.OfficeholderType officeholder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.OfficeholderType target = null;
                target = (au.gov.asic.types.nni.OfficeholderType)get_store().find_element_user(OFFICEHOLDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(officeholder);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "officeholder" element
         */
        public au.gov.asic.types.nni.OfficeholderType insertNewOfficeholder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.OfficeholderType target = null;
                target = (au.gov.asic.types.nni.OfficeholderType)get_store().insert_element_user(OFFICEHOLDER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "officeholder" element
         */
        public au.gov.asic.types.nni.OfficeholderType addNewOfficeholder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.OfficeholderType target = null;
                target = (au.gov.asic.types.nni.OfficeholderType)get_store().add_element_user(OFFICEHOLDER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "officeholder" element
         */
        public void removeOfficeholder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFICEHOLDER$0, i);
            }
        }
    }
    /**
     * An XML shareholders(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class ShareholdersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.CompanyType.Shareholders
    {
        
        public ShareholdersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SHAREHOLDER$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "shareholder");
        
        
        /**
         * Gets array of all "shareholder" elements
         */
        public au.gov.asic.types.nni.ShareholderType[] getShareholderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SHAREHOLDER$0, targetList);
                au.gov.asic.types.nni.ShareholderType[] result = new au.gov.asic.types.nni.ShareholderType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "shareholder" element
         */
        public au.gov.asic.types.nni.ShareholderType getShareholderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.ShareholderType target = null;
                target = (au.gov.asic.types.nni.ShareholderType)get_store().find_element_user(SHAREHOLDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "shareholder" element
         */
        public int sizeOfShareholderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHAREHOLDER$0);
            }
        }
        
        /**
         * Sets array of all "shareholder" element
         */
        public void setShareholderArray(au.gov.asic.types.nni.ShareholderType[] shareholderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(shareholderArray, SHAREHOLDER$0);
            }
        }
        
        /**
         * Sets ith "shareholder" element
         */
        public void setShareholderArray(int i, au.gov.asic.types.nni.ShareholderType shareholder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.ShareholderType target = null;
                target = (au.gov.asic.types.nni.ShareholderType)get_store().find_element_user(SHAREHOLDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(shareholder);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shareholder" element
         */
        public au.gov.asic.types.nni.ShareholderType insertNewShareholder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.ShareholderType target = null;
                target = (au.gov.asic.types.nni.ShareholderType)get_store().insert_element_user(SHAREHOLDER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shareholder" element
         */
        public au.gov.asic.types.nni.ShareholderType addNewShareholder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.ShareholderType target = null;
                target = (au.gov.asic.types.nni.ShareholderType)get_store().add_element_user(SHAREHOLDER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "shareholder" element
         */
        public void removeShareholder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHAREHOLDER$0, i);
            }
        }
    }
}
