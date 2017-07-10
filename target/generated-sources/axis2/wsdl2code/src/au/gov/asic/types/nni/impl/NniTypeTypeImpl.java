/*
 * XML Type:  nniTypeType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NniTypeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML nniTypeType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NniTypeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.NniTypeType
{
    
    public NniTypeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "description");
    
    
    /**
     * Gets the "code" element
     */
    public au.gov.asic.types.nni.NniTypeCodeType.Enum getCode()
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
            return (au.gov.asic.types.nni.NniTypeCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.nni.NniTypeCodeType xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniTypeCodeType target = null;
            target = (au.gov.asic.types.nni.NniTypeCodeType)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(au.gov.asic.types.nni.NniTypeCodeType.Enum code)
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
    public void xsetCode(au.gov.asic.types.nni.NniTypeCodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniTypeCodeType target = null;
            target = (au.gov.asic.types.nni.NniTypeCodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.NniTypeCodeType)get_store().add_element_user(CODE$0);
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
}
