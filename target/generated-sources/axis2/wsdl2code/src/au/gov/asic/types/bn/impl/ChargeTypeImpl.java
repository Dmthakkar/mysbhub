/*
 * XML Type:  chargeType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.ChargeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML chargeType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ChargeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.ChargeType
{
    
    public ChargeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName HISTORICAL$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "historical");
    private static final javax.xml.namespace.QName LARGE$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "large");
    
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.CodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CodeType target = null;
            target = (au.gov.asic.types.CodeType)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(au.gov.asic.types.CodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CodeType target = null;
            target = (au.gov.asic.types.CodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.CodeType)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public au.gov.asic.types.DescriptionType xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DescriptionType target = null;
            target = (au.gov.asic.types.DescriptionType)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(au.gov.asic.types.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DescriptionType target = null;
            target = (au.gov.asic.types.DescriptionType)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DescriptionType)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "historical" element
     */
    public boolean getHistorical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORICAL$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "historical" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHistorical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HISTORICAL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "historical" element
     */
    public boolean isSetHistorical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HISTORICAL$4) != 0;
        }
    }
    
    /**
     * Sets the "historical" element
     */
    public void setHistorical(boolean historical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORICAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HISTORICAL$4);
            }
            target.setBooleanValue(historical);
        }
    }
    
    /**
     * Sets (as xml) the "historical" element
     */
    public void xsetHistorical(org.apache.xmlbeans.XmlBoolean historical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HISTORICAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HISTORICAL$4);
            }
            target.set(historical);
        }
    }
    
    /**
     * Unsets the "historical" element
     */
    public void unsetHistorical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HISTORICAL$4, 0);
        }
    }
    
    /**
     * Gets the "large" element
     */
    public boolean getLarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LARGE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "large" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LARGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "large" element
     */
    public boolean isSetLarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LARGE$6) != 0;
        }
    }
    
    /**
     * Sets the "large" element
     */
    public void setLarge(boolean large)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LARGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LARGE$6);
            }
            target.setBooleanValue(large);
        }
    }
    
    /**
     * Sets (as xml) the "large" element
     */
    public void xsetLarge(org.apache.xmlbeans.XmlBoolean large)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LARGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LARGE$6);
            }
            target.set(large);
        }
    }
    
    /**
     * Unsets the "large" element
     */
    public void unsetLarge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LARGE$6, 0);
        }
    }
}
