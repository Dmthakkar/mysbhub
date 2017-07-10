/*
 * XML Type:  outboundAgentType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.OutboundAgentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML outboundAgentType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OutboundAgentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.OutboundAgentType
{
    
    public OutboundAgentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTABN$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agentAbn");
    private static final javax.xml.namespace.QName AGENTNO$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agentNo");
    private static final javax.xml.namespace.QName AGENTNAME$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agentName");
    private static final javax.xml.namespace.QName ORGANISATION$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "organisation");
    private static final javax.xml.namespace.QName PERSON$8 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "person");
    private static final javax.xml.namespace.QName BUSINESS$10 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "business");
    
    
    /**
     * Gets the "agentAbn" element
     */
    public java.lang.String getAgentAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTABN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agentAbn" element
     */
    public au.gov.asic.types.AbnType xgetAgentAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(AGENTABN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "agentAbn" element
     */
    public boolean isSetAgentAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENTABN$0) != 0;
        }
    }
    
    /**
     * Sets the "agentAbn" element
     */
    public void setAgentAbn(java.lang.String agentAbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTABN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTABN$0);
            }
            target.setStringValue(agentAbn);
        }
    }
    
    /**
     * Sets (as xml) the "agentAbn" element
     */
    public void xsetAgentAbn(au.gov.asic.types.AbnType agentAbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(AGENTABN$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(AGENTABN$0);
            }
            target.set(agentAbn);
        }
    }
    
    /**
     * Unsets the "agentAbn" element
     */
    public void unsetAgentAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENTABN$0, 0);
        }
    }
    
    /**
     * Gets the "agentNo" element
     */
    public int getAgentNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNO$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "agentNo" element
     */
    public au.gov.asic.types.AsicNumericIdType xgetAgentNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(AGENTNO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "agentNo" element
     */
    public void setAgentNo(int agentNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTNO$2);
            }
            target.setIntValue(agentNo);
        }
    }
    
    /**
     * Sets (as xml) the "agentNo" element
     */
    public void xsetAgentNo(au.gov.asic.types.AsicNumericIdType agentNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(AGENTNO$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(AGENTNO$2);
            }
            target.set(agentNo);
        }
    }
    
    /**
     * Gets the "agentName" element
     */
    public java.lang.String getAgentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agentName" element
     */
    public au.gov.asic.types.AgentNameType xgetAgentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentNameType target = null;
            target = (au.gov.asic.types.AgentNameType)get_store().find_element_user(AGENTNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "agentName" element
     */
    public boolean isSetAgentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENTNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "agentName" element
     */
    public void setAgentName(java.lang.String agentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTNAME$4);
            }
            target.setStringValue(agentName);
        }
    }
    
    /**
     * Sets (as xml) the "agentName" element
     */
    public void xsetAgentName(au.gov.asic.types.AgentNameType agentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentNameType target = null;
            target = (au.gov.asic.types.AgentNameType)get_store().find_element_user(AGENTNAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AgentNameType)get_store().add_element_user(AGENTNAME$4);
            }
            target.set(agentName);
        }
    }
    
    /**
     * Unsets the "agentName" element
     */
    public void unsetAgentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENTNAME$4, 0);
        }
    }
    
    /**
     * Gets the "organisation" element
     */
    public au.gov.asic.types.nni.NameIndexEntityType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NameIndexEntityType target = null;
            target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().find_element_user(ORGANISATION$6, 0);
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
    public void setOrganisation(au.gov.asic.types.nni.NameIndexEntityType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NameIndexEntityType target = null;
            target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().find_element_user(ORGANISATION$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().add_element_user(ORGANISATION$6);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    public au.gov.asic.types.nni.NameIndexEntityType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NameIndexEntityType target = null;
            target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().add_element_user(ORGANISATION$6);
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
     * Gets the "person" element
     */
    public au.gov.asic.types.bn.IndividualType getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(PERSON$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "person" element
     */
    public boolean isSetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$8) != 0;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(au.gov.asic.types.bn.IndividualType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(PERSON$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(PERSON$8);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "person" element
     */
    public au.gov.asic.types.bn.IndividualType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(PERSON$8);
            return target;
        }
    }
    
    /**
     * Unsets the "person" element
     */
    public void unsetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$8, 0);
        }
    }
    
    /**
     * Gets array of all "business" elements
     */
    public au.gov.asic.types.nni.OutboundAgentType.Business[] getBusinessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESS$10, targetList);
            au.gov.asic.types.nni.OutboundAgentType.Business[] result = new au.gov.asic.types.nni.OutboundAgentType.Business[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "business" element
     */
    public au.gov.asic.types.nni.OutboundAgentType.Business getBusinessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.OutboundAgentType.Business target = null;
            target = (au.gov.asic.types.nni.OutboundAgentType.Business)get_store().find_element_user(BUSINESS$10, i);
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
            return get_store().count_elements(BUSINESS$10);
        }
    }
    
    /**
     * Sets array of all "business" element
     */
    public void setBusinessArray(au.gov.asic.types.nni.OutboundAgentType.Business[] businessArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(businessArray, BUSINESS$10);
        }
    }
    
    /**
     * Sets ith "business" element
     */
    public void setBusinessArray(int i, au.gov.asic.types.nni.OutboundAgentType.Business business)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.OutboundAgentType.Business target = null;
            target = (au.gov.asic.types.nni.OutboundAgentType.Business)get_store().find_element_user(BUSINESS$10, i);
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
    public au.gov.asic.types.nni.OutboundAgentType.Business insertNewBusiness(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.OutboundAgentType.Business target = null;
            target = (au.gov.asic.types.nni.OutboundAgentType.Business)get_store().insert_element_user(BUSINESS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "business" element
     */
    public au.gov.asic.types.nni.OutboundAgentType.Business addNewBusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.OutboundAgentType.Business target = null;
            target = (au.gov.asic.types.nni.OutboundAgentType.Business)get_store().add_element_user(BUSINESS$10);
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
            get_store().remove_element(BUSINESS$10, i);
        }
    }
    /**
     * An XML business(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class BusinessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.OutboundAgentType.Business
    {
        
        public BusinessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATION$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "organisation");
        private static final javax.xml.namespace.QName PERSON$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "person");
        
        
        /**
         * Gets the "organisation" element
         */
        public au.gov.asic.types.nni.NameIndexEntityType getOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.NameIndexEntityType target = null;
                target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().find_element_user(ORGANISATION$0, 0);
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
                return get_store().count_elements(ORGANISATION$0) != 0;
            }
        }
        
        /**
         * Sets the "organisation" element
         */
        public void setOrganisation(au.gov.asic.types.nni.NameIndexEntityType organisation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.NameIndexEntityType target = null;
                target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().add_element_user(ORGANISATION$0);
                }
                target.set(organisation);
            }
        }
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        public au.gov.asic.types.nni.NameIndexEntityType addNewOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.nni.NameIndexEntityType target = null;
                target = (au.gov.asic.types.nni.NameIndexEntityType)get_store().add_element_user(ORGANISATION$0);
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
                get_store().remove_element(ORGANISATION$0, 0);
            }
        }
        
        /**
         * Gets the "person" element
         */
        public au.gov.asic.types.bn.IndividualType getPerson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.IndividualType target = null;
                target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(PERSON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "person" element
         */
        public boolean isSetPerson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSON$2) != 0;
            }
        }
        
        /**
         * Sets the "person" element
         */
        public void setPerson(au.gov.asic.types.bn.IndividualType person)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.IndividualType target = null;
                target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(PERSON$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(PERSON$2);
                }
                target.set(person);
            }
        }
        
        /**
         * Appends and returns a new empty "person" element
         */
        public au.gov.asic.types.bn.IndividualType addNewPerson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.IndividualType target = null;
                target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(PERSON$2);
                return target;
            }
        }
        
        /**
         * Unsets the "person" element
         */
        public void unsetPerson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSON$2, 0);
            }
        }
    }
}
