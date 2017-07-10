/*
 * XML Type:  personExtractRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PersonExtractRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML personExtractRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonExtractRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.PersonExtractRequestType
{
    
    public PersonExtractRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHID$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "searchId");
    private static final javax.xml.namespace.QName PERSONIDS$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "personIds");
    private static final javax.xml.namespace.QName SHOWHISTORY$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "showHistory");
    
    
    /**
     * Gets the "searchId" element
     */
    public int getSearchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "searchId" element
     */
    public au.gov.asic.types.AsicNumericIdType xgetSearchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(SEARCHID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "searchId" element
     */
    public boolean isSetSearchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHID$0) != 0;
        }
    }
    
    /**
     * Sets the "searchId" element
     */
    public void setSearchId(int searchId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHID$0);
            }
            target.setIntValue(searchId);
        }
    }
    
    /**
     * Sets (as xml) the "searchId" element
     */
    public void xsetSearchId(au.gov.asic.types.AsicNumericIdType searchId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(SEARCHID$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(SEARCHID$0);
            }
            target.set(searchId);
        }
    }
    
    /**
     * Unsets the "searchId" element
     */
    public void unsetSearchId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHID$0, 0);
        }
    }
    
    /**
     * Gets the "personIds" element
     */
    public au.gov.asic.types.bn.PersonExtractRequestType.PersonIds getPersonIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonExtractRequestType.PersonIds target = null;
            target = (au.gov.asic.types.bn.PersonExtractRequestType.PersonIds)get_store().find_element_user(PERSONIDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "personIds" element
     */
    public void setPersonIds(au.gov.asic.types.bn.PersonExtractRequestType.PersonIds personIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonExtractRequestType.PersonIds target = null;
            target = (au.gov.asic.types.bn.PersonExtractRequestType.PersonIds)get_store().find_element_user(PERSONIDS$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PersonExtractRequestType.PersonIds)get_store().add_element_user(PERSONIDS$2);
            }
            target.set(personIds);
        }
    }
    
    /**
     * Appends and returns a new empty "personIds" element
     */
    public au.gov.asic.types.bn.PersonExtractRequestType.PersonIds addNewPersonIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonExtractRequestType.PersonIds target = null;
            target = (au.gov.asic.types.bn.PersonExtractRequestType.PersonIds)get_store().add_element_user(PERSONIDS$2);
            return target;
        }
    }
    
    /**
     * Gets the "showHistory" element
     */
    public boolean getShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWHISTORY$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showHistory" element
     */
    public au.gov.asic.types.TrueType xgetShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(SHOWHISTORY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "showHistory" element
     */
    public boolean isSetShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWHISTORY$4) != 0;
        }
    }
    
    /**
     * Sets the "showHistory" element
     */
    public void setShowHistory(boolean showHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWHISTORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOWHISTORY$4);
            }
            target.setBooleanValue(showHistory);
        }
    }
    
    /**
     * Sets (as xml) the "showHistory" element
     */
    public void xsetShowHistory(au.gov.asic.types.TrueType showHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(SHOWHISTORY$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(SHOWHISTORY$4);
            }
            target.set(showHistory);
        }
    }
    
    /**
     * Unsets the "showHistory" element
     */
    public void unsetShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWHISTORY$4, 0);
        }
    }
    /**
     * An XML personIds(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class PersonIdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.PersonExtractRequestType.PersonIds
    {
        
        public PersonIdsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERSONID$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "personId");
        
        
        /**
         * Gets array of all "personId" elements
         */
        public java.lang.String[] getPersonIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERSONID$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "personId" element
         */
        public java.lang.String getPersonIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "personId" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetPersonIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERSONID$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "personId" element
         */
        public org.apache.xmlbeans.XmlString xgetPersonIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "personId" element
         */
        public int sizeOfPersonIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONID$0);
            }
        }
        
        /**
         * Sets array of all "personId" element
         */
        public void setPersonIdArray(java.lang.String[] personIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(personIdArray, PERSONID$0);
            }
        }
        
        /**
         * Sets ith "personId" element
         */
        public void setPersonIdArray(int i, java.lang.String personId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(personId);
            }
        }
        
        /**
         * Sets (as xml) array of all "personId" element
         */
        public void xsetPersonIdArray(org.apache.xmlbeans.XmlString[]personIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(personIdArray, PERSONID$0);
            }
        }
        
        /**
         * Sets (as xml) ith "personId" element
         */
        public void xsetPersonIdArray(int i, org.apache.xmlbeans.XmlString personId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(personId);
            }
        }
        
        /**
         * Inserts the value as the ith "personId" element
         */
        public void insertPersonId(int i, java.lang.String personId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PERSONID$0, i);
                target.setStringValue(personId);
            }
        }
        
        /**
         * Appends the value as the last "personId" element
         */
        public void addPersonId(java.lang.String personId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONID$0);
                target.setStringValue(personId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "personId" element
         */
        public org.apache.xmlbeans.XmlString insertNewPersonId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PERSONID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "personId" element
         */
        public org.apache.xmlbeans.XmlString addNewPersonId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSONID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "personId" element
         */
        public void removePersonId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONID$0, i);
            }
        }
    }
}
