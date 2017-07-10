/*
 * XML Type:  agentType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AgentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML agentType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AgentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AgentType
{
    
    public AgentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "number");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    
    
    /**
     * Gets the "number" element
     */
    public int getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" element
     */
    public au.gov.asic.types.AsicNumericIdType xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(NUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(int number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
            }
            target.setIntValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" element
     */
    public void xsetNumber(au.gov.asic.types.AsicNumericIdType number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
    public au.gov.asic.types.AgentNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentNameType target = null;
            target = (au.gov.asic.types.AgentNameType)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.AgentNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentNameType target = null;
            target = (au.gov.asic.types.AgentNameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AgentNameType)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
}
