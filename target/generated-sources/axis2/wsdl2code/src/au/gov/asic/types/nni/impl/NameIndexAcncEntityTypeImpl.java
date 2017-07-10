/*
 * XML Type:  nameIndexAcncEntityType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NameIndexAcncEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML nameIndexAcncEntityType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameIndexAcncEntityTypeImpl extends au.gov.asic.types.nni.impl.NameIndexEntityTypeImpl implements au.gov.asic.types.nni.NameIndexAcncEntityType
{
    
    public NameIndexAcncEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACNCFLAG$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "acncFlag");
    
    
    /**
     * Gets the "acncFlag" element
     */
    public boolean getAcncFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACNCFLAG$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "acncFlag" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAcncFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACNCFLAG$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "acncFlag" element
     */
    public boolean isSetAcncFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACNCFLAG$0) != 0;
        }
    }
    
    /**
     * Sets the "acncFlag" element
     */
    public void setAcncFlag(boolean acncFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACNCFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACNCFLAG$0);
            }
            target.setBooleanValue(acncFlag);
        }
    }
    
    /**
     * Sets (as xml) the "acncFlag" element
     */
    public void xsetAcncFlag(org.apache.xmlbeans.XmlBoolean acncFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACNCFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACNCFLAG$0);
            }
            target.set(acncFlag);
        }
    }
    
    /**
     * Unsets the "acncFlag" element
     */
    public void unsetAcncFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACNCFLAG$0, 0);
        }
    }
}
