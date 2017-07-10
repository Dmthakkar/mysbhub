/*
 * XML Type:  roleTypeType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.RoleTypeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML roleTypeType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RoleTypeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.RoleTypeType
{
    
    public RoleTypeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "description");
    
    
    /**
     * Gets the "code" element
     */
    public au.gov.asic.types.bn.RoleCodeType.Enum getCode()
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
            return (au.gov.asic.types.bn.RoleCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.bn.RoleCodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RoleCodeType target = null;
            target = (au.gov.asic.types.bn.RoleCodeType)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(au.gov.asic.types.bn.RoleCodeType.Enum code)
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
            target.setEnumValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(au.gov.asic.types.bn.RoleCodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RoleCodeType target = null;
            target = (au.gov.asic.types.bn.RoleCodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.RoleCodeType)get_store().add_element_user(CODE$0);
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
    public au.gov.asic.types.bn.RoleTypeType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RoleTypeType.Description target = null;
            target = (au.gov.asic.types.bn.RoleTypeType.Description)get_store().find_element_user(DESCRIPTION$2, 0);
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
    public void xsetDescription(au.gov.asic.types.bn.RoleTypeType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RoleTypeType.Description target = null;
            target = (au.gov.asic.types.bn.RoleTypeType.Description)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.RoleTypeType.Description)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    /**
     * An XML description(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.RoleTypeType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.RoleTypeType.Description
    {
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
