/*
 * XML Type:  businessNameExtractType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BusinessNameExtractType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML businessNameExtractType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BusinessNameExtractTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BusinessNameExtractType
{
    
    public BusinessNameExtractTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESS$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "business");
    private static final javax.xml.namespace.QName BUSINESSNAME$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessName");
    
    
    /**
     * Gets array of all "business" elements
     */
    public au.gov.asic.types.bn.BusinessNameExtractType.Business[] getBusinessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESS$0, targetList);
            au.gov.asic.types.bn.BusinessNameExtractType.Business[] result = new au.gov.asic.types.bn.BusinessNameExtractType.Business[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "business" element
     */
    public au.gov.asic.types.bn.BusinessNameExtractType.Business getBusinessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessNameExtractType.Business target = null;
            target = (au.gov.asic.types.bn.BusinessNameExtractType.Business)get_store().find_element_user(BUSINESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "business" element
     */
    public int sizeOfBusinessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESS$0);
        }
    }
    
    /**
     * Sets array of all "business" element
     */
    public void setBusinessArray(au.gov.asic.types.bn.BusinessNameExtractType.Business[] businessArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(businessArray, BUSINESS$0);
        }
    }
    
    /**
     * Sets ith "business" element
     */
    public void setBusinessArray(int i, au.gov.asic.types.bn.BusinessNameExtractType.Business business)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessNameExtractType.Business target = null;
            target = (au.gov.asic.types.bn.BusinessNameExtractType.Business)get_store().find_element_user(BUSINESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(business);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "business" element
     */
    public au.gov.asic.types.bn.BusinessNameExtractType.Business insertNewBusiness(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessNameExtractType.Business target = null;
            target = (au.gov.asic.types.bn.BusinessNameExtractType.Business)get_store().insert_element_user(BUSINESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "business" element
     */
    public au.gov.asic.types.bn.BusinessNameExtractType.Business addNewBusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessNameExtractType.Business target = null;
            target = (au.gov.asic.types.bn.BusinessNameExtractType.Business)get_store().add_element_user(BUSINESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "business" element
     */
    public void removeBusiness(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESS$0, i);
        }
    }
    
    /**
     * Gets the "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType getBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessName" element
     */
    public void setBusinessName(au.gov.asic.types.bn.OutboundBusinessNameType businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAME$2);
            }
            target.set(businessName);
        }
    }
    
    /**
     * Appends and returns a new empty "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAME$2);
            return target;
        }
    }
    /**
     * An XML business(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class BusinessImpl extends au.gov.asic.types.bn.impl.BusinessEntityTypeImpl implements au.gov.asic.types.bn.BusinessNameExtractType.Business
    {
        
        public BusinessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTDATE$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "endDate");
        private static final javax.xml.namespace.QName AGENTAPPOINTED$4 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "agentAppointed");
        
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "startDate" element
         */
        public boolean isSetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATE$0) != 0;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$0);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Unsets the "startDate" element
         */
        public void unsetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATE$0, 0);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "endDate" element
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$2);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$2);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Unsets the "endDate" element
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$2, 0);
            }
        }
        
        /**
         * Gets the "agentAppointed" element
         */
        public boolean getAgentAppointed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTAPPOINTED$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "agentAppointed" element
         */
        public au.gov.asic.types.TrueType xgetAgentAppointed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(AGENTAPPOINTED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "agentAppointed" element
         */
        public boolean isSetAgentAppointed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENTAPPOINTED$4) != 0;
            }
        }
        
        /**
         * Sets the "agentAppointed" element
         */
        public void setAgentAppointed(boolean agentAppointed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTAPPOINTED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTAPPOINTED$4);
                }
                target.setBooleanValue(agentAppointed);
            }
        }
        
        /**
         * Sets (as xml) the "agentAppointed" element
         */
        public void xsetAgentAppointed(au.gov.asic.types.TrueType agentAppointed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(AGENTAPPOINTED$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(AGENTAPPOINTED$4);
                }
                target.set(agentAppointed);
            }
        }
        
        /**
         * Unsets the "agentAppointed" element
         */
        public void unsetAgentAppointed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENTAPPOINTED$4, 0);
            }
        }
    }
}
