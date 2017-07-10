/*
 * XML Type:  distinguishedNameType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.DistinguishedNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML distinguishedNameType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class DistinguishedNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.DistinguishedNameType
{
    
    public DistinguishedNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName DISTINGUISHEDWORD$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "distinguishedWord");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
    public au.gov.asic.types.NniNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.NniNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "distinguishedWord" element
     */
    public java.lang.String getDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "distinguishedWord" element
     */
    public au.gov.asic.types.DistinguishedWordType xgetDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedWordType target = null;
            target = (au.gov.asic.types.DistinguishedWordType)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "distinguishedWord" element
     */
    public boolean isSetDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTINGUISHEDWORD$2) != 0;
        }
    }
    
    /**
     * Sets the "distinguishedWord" element
     */
    public void setDistinguishedWord(java.lang.String distinguishedWord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTINGUISHEDWORD$2);
            }
            target.setStringValue(distinguishedWord);
        }
    }
    
    /**
     * Sets (as xml) the "distinguishedWord" element
     */
    public void xsetDistinguishedWord(au.gov.asic.types.DistinguishedWordType distinguishedWord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedWordType target = null;
            target = (au.gov.asic.types.DistinguishedWordType)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedWordType)get_store().add_element_user(DISTINGUISHEDWORD$2);
            }
            target.set(distinguishedWord);
        }
    }
    
    /**
     * Unsets the "distinguishedWord" element
     */
    public void unsetDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTINGUISHEDWORD$2, 0);
        }
    }
}
