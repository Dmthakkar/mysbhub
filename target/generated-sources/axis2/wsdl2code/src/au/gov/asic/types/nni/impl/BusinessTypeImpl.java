/*
 * XML Type:  businessType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.BusinessType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML businessType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BusinessTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.BusinessType
{
    
    public BusinessTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABRENTITY$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "abrEntity");
    private static final javax.xml.namespace.QName ORGANISATION$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "organisation");
    private static final javax.xml.namespace.QName INDIVIDUAL$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "individual");
    private static final javax.xml.namespace.QName BUSINESSNAME$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "businessName");
    private static final javax.xml.namespace.QName AGENT$8 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agent");
    
    
    /**
     * Gets the "abrEntity" element
     */
    public au.gov.asic.types.abn.AbrEntityType getAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().find_element_user(ABRENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abrEntity" element
     */
    public boolean isSetAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABRENTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "abrEntity" element
     */
    public void setAbrEntity(au.gov.asic.types.abn.AbrEntityType abrEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().find_element_user(ABRENTITY$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbrEntityType)get_store().add_element_user(ABRENTITY$0);
            }
            target.set(abrEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "abrEntity" element
     */
    public au.gov.asic.types.abn.AbrEntityType addNewAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().add_element_user(ABRENTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "abrEntity" element
     */
    public void unsetAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABRENTITY$0, 0);
        }
    }
    
    /**
     * Gets the "organisation" element
     */
    public au.gov.asic.types.nni.BaseNniEntityType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType)get_store().find_element_user(ORGANISATION$2, 0);
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
            return get_store().count_elements(ORGANISATION$2) != 0;
        }
    }
    
    /**
     * Sets the "organisation" element
     */
    public void setOrganisation(au.gov.asic.types.nni.BaseNniEntityType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType)get_store().find_element_user(ORGANISATION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.BaseNniEntityType)get_store().add_element_user(ORGANISATION$2);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    public au.gov.asic.types.nni.BaseNniEntityType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType)get_store().add_element_user(ORGANISATION$2);
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
            get_store().remove_element(ORGANISATION$2, 0);
        }
    }
    
    /**
     * Gets the "individual" element
     */
    public au.gov.asic.types.bn.IndividualType getIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(INDIVIDUAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "individual" element
     */
    public boolean isSetIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIVIDUAL$4) != 0;
        }
    }
    
    /**
     * Sets the "individual" element
     */
    public void setIndividual(au.gov.asic.types.bn.IndividualType individual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(INDIVIDUAL$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(INDIVIDUAL$4);
            }
            target.set(individual);
        }
    }
    
    /**
     * Appends and returns a new empty "individual" element
     */
    public au.gov.asic.types.bn.IndividualType addNewIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(INDIVIDUAL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "individual" element
     */
    public void unsetIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIVIDUAL$4, 0);
        }
    }
    
    /**
     * Gets array of all "businessName" elements
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType[] getBusinessNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSNAME$6, targetList);
            au.gov.asic.types.bn.OutboundBusinessNameType[] result = new au.gov.asic.types.bn.OutboundBusinessNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType getBusinessNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "businessName" element
     */
    public int sizeOfBusinessNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSNAME$6);
        }
    }
    
    /**
     * Sets array of all "businessName" element
     */
    public void setBusinessNameArray(au.gov.asic.types.bn.OutboundBusinessNameType[] businessNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(businessNameArray, BUSINESSNAME$6);
        }
    }
    
    /**
     * Sets ith "businessName" element
     */
    public void setBusinessNameArray(int i, au.gov.asic.types.bn.OutboundBusinessNameType businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType insertNewBusinessName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().insert_element_user(BUSINESSNAME$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAME$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "businessName" element
     */
    public void removeBusinessName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSNAME$6, i);
        }
    }
    
    /**
     * Gets the "agent" element
     */
    public au.gov.asic.types.AgentType getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentType target = null;
            target = (au.gov.asic.types.AgentType)get_store().find_element_user(AGENT$8, 0);
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
            return get_store().count_elements(AGENT$8) != 0;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(au.gov.asic.types.AgentType agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentType target = null;
            target = (au.gov.asic.types.AgentType)get_store().find_element_user(AGENT$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AgentType)get_store().add_element_user(AGENT$8);
            }
            target.set(agent);
        }
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public au.gov.asic.types.AgentType addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentType target = null;
            target = (au.gov.asic.types.AgentType)get_store().add_element_user(AGENT$8);
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
            get_store().remove_element(AGENT$8, 0);
        }
    }
}
