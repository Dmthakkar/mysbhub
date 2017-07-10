/*
 * XML Type:  requestFailedType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.RequestFailedType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML requestFailedType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RequestFailedTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.RequestFailedType
{
    
    public RequestFailedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSIENT$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "transient");
    private static final javax.xml.namespace.QName PERMANENT$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "permanent");
    
    
    /**
     * Gets the "transient" element
     */
    public boolean getTransient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSIENT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transient" element
     */
    public au.gov.asic.types.TrueType xgetTransient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(TRANSIENT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "transient" element
     */
    public boolean isSetTransient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSIENT$0) != 0;
        }
    }
    
    /**
     * Sets the "transient" element
     */
    public void setTransient(boolean xtransient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSIENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSIENT$0);
            }
            target.setBooleanValue(xtransient);
        }
    }
    
    /**
     * Sets (as xml) the "transient" element
     */
    public void xsetTransient(au.gov.asic.types.TrueType xtransient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(TRANSIENT$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(TRANSIENT$0);
            }
            target.set(xtransient);
        }
    }
    
    /**
     * Unsets the "transient" element
     */
    public void unsetTransient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSIENT$0, 0);
        }
    }
    
    /**
     * Gets the "permanent" element
     */
    public boolean getPermanent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMANENT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "permanent" element
     */
    public au.gov.asic.types.TrueType xgetPermanent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(PERMANENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "permanent" element
     */
    public boolean isSetPermanent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMANENT$2) != 0;
        }
    }
    
    /**
     * Sets the "permanent" element
     */
    public void setPermanent(boolean permanent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERMANENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERMANENT$2);
            }
            target.setBooleanValue(permanent);
        }
    }
    
    /**
     * Sets (as xml) the "permanent" element
     */
    public void xsetPermanent(au.gov.asic.types.TrueType permanent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(PERMANENT$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(PERMANENT$2);
            }
            target.set(permanent);
        }
    }
    
    /**
     * Unsets the "permanent" element
     */
    public void unsetPermanent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMANENT$2, 0);
        }
    }
}
