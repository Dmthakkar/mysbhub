/*
 * XML Type:  nameResultType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML nameResultType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.NameResultType
{
    
    public NameResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEAVAILABLE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "nameAvailable");
    private static final javax.xml.namespace.QName NAMEUNAVAILABLE$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "nameUnavailable");
    private static final javax.xml.namespace.QName NAMESUBJECTTONAMESDETERMINATION$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "nameSubjectToNamesDetermination");
    
    
    /**
     * Gets the "nameAvailable" element
     */
    public boolean getNameAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEAVAILABLE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nameAvailable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNameAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAMEAVAILABLE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "nameAvailable" element
     */
    public boolean isSetNameAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEAVAILABLE$0) != 0;
        }
    }
    
    /**
     * Sets the "nameAvailable" element
     */
    public void setNameAvailable(boolean nameAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEAVAILABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMEAVAILABLE$0);
            }
            target.setBooleanValue(nameAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "nameAvailable" element
     */
    public void xsetNameAvailable(org.apache.xmlbeans.XmlBoolean nameAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAMEAVAILABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NAMEAVAILABLE$0);
            }
            target.set(nameAvailable);
        }
    }
    
    /**
     * Unsets the "nameAvailable" element
     */
    public void unsetNameAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEAVAILABLE$0, 0);
        }
    }
    
    /**
     * Gets the "nameUnavailable" element
     */
    public boolean getNameUnavailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEUNAVAILABLE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nameUnavailable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNameUnavailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAMEUNAVAILABLE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nameUnavailable" element
     */
    public boolean isSetNameUnavailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEUNAVAILABLE$2) != 0;
        }
    }
    
    /**
     * Sets the "nameUnavailable" element
     */
    public void setNameUnavailable(boolean nameUnavailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEUNAVAILABLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMEUNAVAILABLE$2);
            }
            target.setBooleanValue(nameUnavailable);
        }
    }
    
    /**
     * Sets (as xml) the "nameUnavailable" element
     */
    public void xsetNameUnavailable(org.apache.xmlbeans.XmlBoolean nameUnavailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAMEUNAVAILABLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NAMEUNAVAILABLE$2);
            }
            target.set(nameUnavailable);
        }
    }
    
    /**
     * Unsets the "nameUnavailable" element
     */
    public void unsetNameUnavailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEUNAVAILABLE$2, 0);
        }
    }
    
    /**
     * Gets the "nameSubjectToNamesDetermination" element
     */
    public boolean getNameSubjectToNamesDetermination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESUBJECTTONAMESDETERMINATION$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nameSubjectToNamesDetermination" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNameSubjectToNamesDetermination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAMESUBJECTTONAMESDETERMINATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nameSubjectToNamesDetermination" element
     */
    public boolean isSetNameSubjectToNamesDetermination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESUBJECTTONAMESDETERMINATION$4) != 0;
        }
    }
    
    /**
     * Sets the "nameSubjectToNamesDetermination" element
     */
    public void setNameSubjectToNamesDetermination(boolean nameSubjectToNamesDetermination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESUBJECTTONAMESDETERMINATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMESUBJECTTONAMESDETERMINATION$4);
            }
            target.setBooleanValue(nameSubjectToNamesDetermination);
        }
    }
    
    /**
     * Sets (as xml) the "nameSubjectToNamesDetermination" element
     */
    public void xsetNameSubjectToNamesDetermination(org.apache.xmlbeans.XmlBoolean nameSubjectToNamesDetermination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NAMESUBJECTTONAMESDETERMINATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NAMESUBJECTTONAMESDETERMINATION$4);
            }
            target.set(nameSubjectToNamesDetermination);
        }
    }
    
    /**
     * Unsets the "nameSubjectToNamesDetermination" element
     */
    public void unsetNameSubjectToNamesDetermination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESUBJECTTONAMESDETERMINATION$4, 0);
        }
    }
}
