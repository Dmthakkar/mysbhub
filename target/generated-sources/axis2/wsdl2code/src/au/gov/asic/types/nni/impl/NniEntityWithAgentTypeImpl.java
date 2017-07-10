/*
 * XML Type:  nniEntityWithAgentType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NniEntityWithAgentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML nniEntityWithAgentType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NniEntityWithAgentTypeImpl extends au.gov.asic.types.nni.impl.NameIndexEntityTypeImpl implements au.gov.asic.types.nni.NniEntityWithAgentType
{
    
    public NniEntityWithAgentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENT$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agent");
    private static final javax.xml.namespace.QName BUSINESSNAMES$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "businessNames");
    
    
    /**
     * Gets the "agent" element
     */
    public au.gov.asic.types.nni.NniEntityWithAgentType.Agent getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniEntityWithAgentType.Agent target = null;
            target = (au.gov.asic.types.nni.NniEntityWithAgentType.Agent)get_store().find_element_user(AGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "agent" element
     */
    public boolean isSetAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENT$0) != 0;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(au.gov.asic.types.nni.NniEntityWithAgentType.Agent agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniEntityWithAgentType.Agent target = null;
            target = (au.gov.asic.types.nni.NniEntityWithAgentType.Agent)get_store().find_element_user(AGENT$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.NniEntityWithAgentType.Agent)get_store().add_element_user(AGENT$0);
            }
            target.set(agent);
        }
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public au.gov.asic.types.nni.NniEntityWithAgentType.Agent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniEntityWithAgentType.Agent target = null;
            target = (au.gov.asic.types.nni.NniEntityWithAgentType.Agent)get_store().add_element_user(AGENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "agent" element
     */
    public void unsetAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENT$0, 0);
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
            get_store().find_all_element_users(BUSINESSNAMES$2, targetList);
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
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAMES$2, i);
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
            return get_store().count_elements(BUSINESSNAMES$2);
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
            arraySetterHelper(businessNamesArray, BUSINESSNAMES$2);
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
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAMES$2, i);
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
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().insert_element_user(BUSINESSNAMES$2, i);
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
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAMES$2);
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
            get_store().remove_element(BUSINESSNAMES$2, i);
        }
    }
    /**
     * An XML agent(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class AgentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.NniEntityWithAgentType.Agent
    {
        
        public AgentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AGENTNO$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agentNo");
        private static final javax.xml.namespace.QName AGENTNAME$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agentName");
        
        
        /**
         * Gets the "agentNo" element
         */
        public int getAgentNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNO$0, 0);
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
                target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(AGENTNO$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTNO$0);
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
                target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(AGENTNO$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(AGENTNO$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNAME$2, 0);
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
        public au.gov.asic.types.NniNameType xgetAgentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNameType target = null;
                target = (au.gov.asic.types.NniNameType)get_store().find_element_user(AGENTNAME$2, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTNAME$2);
                }
                target.setStringValue(agentName);
            }
        }
        
        /**
         * Sets (as xml) the "agentName" element
         */
        public void xsetAgentName(au.gov.asic.types.NniNameType agentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNameType target = null;
                target = (au.gov.asic.types.NniNameType)get_store().find_element_user(AGENTNAME$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.NniNameType)get_store().add_element_user(AGENTNAME$2);
                }
                target.set(agentName);
            }
        }
    }
}
