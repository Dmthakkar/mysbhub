/*
 * XML Type:  rejectedType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.RejectedType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML rejectedType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RejectedTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.RejectedType
{
    
    public RejectedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REJECTED$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "rejected");
    
    
    /**
     * Gets the "rejected" element
     */
    public boolean getRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rejected" element
     */
    public au.gov.asic.types.TrueType xgetRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REJECTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rejected" element
     */
    public void setRejected(boolean rejected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REJECTED$0);
            }
            target.setBooleanValue(rejected);
        }
    }
    
    /**
     * Sets (as xml) the "rejected" element
     */
    public void xsetRejected(au.gov.asic.types.TrueType rejected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REJECTED$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(REJECTED$0);
            }
            target.set(rejected);
        }
    }
}
