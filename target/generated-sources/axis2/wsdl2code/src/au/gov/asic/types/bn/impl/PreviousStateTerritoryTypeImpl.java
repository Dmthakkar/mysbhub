/*
 * XML Type:  previousStateTerritoryType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PreviousStateTerritoryType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML previousStateTerritoryType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PreviousStateTerritoryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.PreviousStateTerritoryType
{
    
    public PreviousStateTerritoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "number");
    private static final javax.xml.namespace.QName STATETERRITORYCODE$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "stateTerritoryCode");
    
    
    /**
     * Gets the "number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" element
     */
    public au.gov.asic.types.bn.PreviousStateTerritoryType.Number xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType.Number target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType.Number)get_store().find_element_user(NUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(java.lang.String number)
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
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" element
     */
    public void xsetNumber(au.gov.asic.types.bn.PreviousStateTerritoryType.Number number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType.Number target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType.Number)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType.Number)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "stateTerritoryCode" element
     */
    public au.gov.asic.types.StateTerritoryCodeType.Enum getStateTerritoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATETERRITORYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "stateTerritoryCode" element
     */
    public au.gov.asic.types.StateTerritoryCodeType xgetStateTerritoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATETERRITORYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stateTerritoryCode" element
     */
    public void setStateTerritoryCode(au.gov.asic.types.StateTerritoryCodeType.Enum stateTerritoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATETERRITORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATETERRITORYCODE$2);
            }
            target.setEnumValue(stateTerritoryCode);
        }
    }
    
    /**
     * Sets (as xml) the "stateTerritoryCode" element
     */
    public void xsetStateTerritoryCode(au.gov.asic.types.StateTerritoryCodeType stateTerritoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATETERRITORYCODE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATETERRITORYCODE$2);
            }
            target.set(stateTerritoryCode);
        }
    }
    /**
     * An XML number(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.PreviousStateTerritoryType$Number.
     */
    public static class NumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.PreviousStateTerritoryType.Number
    {
        
        public NumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
