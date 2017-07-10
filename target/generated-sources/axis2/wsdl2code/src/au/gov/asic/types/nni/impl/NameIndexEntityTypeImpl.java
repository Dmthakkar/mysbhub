/*
 * XML Type:  nameIndexEntityType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NameIndexEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML nameIndexEntityType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameIndexEntityTypeImpl extends au.gov.asic.types.nni.impl.BaseNniEntityTypeImpl implements au.gov.asic.types.nni.NameIndexEntityType
{
    
    public NameIndexEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABRENTITY$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "abrEntity");
    private static final javax.xml.namespace.QName AGENTAPPOINTED$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "agentAppointed");
    
    
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
     * Gets the "agentAppointed" element
     */
    public boolean getAgentAppointed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTAPPOINTED$2, 0);
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
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(AGENTAPPOINTED$2, 0);
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
            return get_store().count_elements(AGENTAPPOINTED$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTAPPOINTED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTAPPOINTED$2);
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
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(AGENTAPPOINTED$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(AGENTAPPOINTED$2);
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
            get_store().remove_element(AGENTAPPOINTED$2, 0);
        }
    }
}
