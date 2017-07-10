/*
 * XML Type:  personNameWithRoleType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.PersonNameWithRoleType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML personNameWithRoleType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonNameWithRoleTypeImpl extends au.gov.asic.types.impl.PersonNameTypeImpl implements au.gov.asic.types.PersonNameWithRoleType
{
    
    public PersonNameWithRoleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "role");
    
    
    /**
     * Gets the "role" element
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" element
     */
    public au.gov.asic.types.PersonNameWithRoleType.Role xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameWithRoleType.Role target = null;
            target = (au.gov.asic.types.PersonNameWithRoleType.Role)get_store().find_element_user(ROLE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "role" element
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$0) != 0;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$0);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" element
     */
    public void xsetRole(au.gov.asic.types.PersonNameWithRoleType.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameWithRoleType.Role target = null;
            target = (au.gov.asic.types.PersonNameWithRoleType.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameWithRoleType.Role)get_store().add_element_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" element
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$0, 0);
        }
    }
    /**
     * An XML role(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameWithRoleType$Role.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.PersonNameWithRoleType.Role
    {
        
        public RoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RoleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
