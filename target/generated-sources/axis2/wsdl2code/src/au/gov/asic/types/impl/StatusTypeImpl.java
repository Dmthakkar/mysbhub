/*
 * XML Type:  statusType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.StatusType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML statusType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class StatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.StatusType
{
    
    public StatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName ISREGISTERED$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "isRegistered");
    
    
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
    public au.gov.asic.types.StatusType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType.Code target = null;
            target = (au.gov.asic.types.StatusType.Code)get_store().find_element_user(CODE$0, 0);
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
    public void xsetCode(au.gov.asic.types.StatusType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType.Code target = null;
            target = (au.gov.asic.types.StatusType.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StatusType.Code)get_store().add_element_user(CODE$0);
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
    public au.gov.asic.types.StatusType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType.Description target = null;
            target = (au.gov.asic.types.StatusType.Description)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
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
    public void xsetDescription(au.gov.asic.types.StatusType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType.Description target = null;
            target = (au.gov.asic.types.StatusType.Description)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StatusType.Description)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "isRegistered" element
     */
    public boolean getIsRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREGISTERED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isRegistered" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREGISTERED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isRegistered" element
     */
    public void setIsRegistered(boolean isRegistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREGISTERED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREGISTERED$4);
            }
            target.setBooleanValue(isRegistered);
        }
    }
    
    /**
     * Sets (as xml) the "isRegistered" element
     */
    public void xsetIsRegistered(org.apache.xmlbeans.XmlBoolean isRegistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISREGISTERED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISREGISTERED$4);
            }
            target.set(isRegistered);
        }
    }
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StatusType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StatusType.Code
    {
        
        public CodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML description(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StatusType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StatusType.Description
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
