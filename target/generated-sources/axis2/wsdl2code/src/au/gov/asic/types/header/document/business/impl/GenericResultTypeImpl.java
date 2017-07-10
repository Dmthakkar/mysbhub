/*
 * XML Type:  genericResultType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.GenericResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML genericResultType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class GenericResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.GenericResultType
{
    
    public GenericResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCEPTED$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "accepted");
    private static final javax.xml.namespace.QName REJECTED$2 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "rejected");
    private static final javax.xml.namespace.QName DELAYED$4 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "delayed");
    private static final javax.xml.namespace.QName FAULT$6 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "fault");
    
    
    /**
     * Gets the "accepted" element
     */
    public boolean getAccepted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "accepted" element
     */
    public au.gov.asic.types.TrueType xgetAccepted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(ACCEPTED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "accepted" element
     */
    public boolean isSetAccepted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCEPTED$0) != 0;
        }
    }
    
    /**
     * Sets the "accepted" element
     */
    public void setAccepted(boolean accepted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCEPTED$0);
            }
            target.setBooleanValue(accepted);
        }
    }
    
    /**
     * Sets (as xml) the "accepted" element
     */
    public void xsetAccepted(au.gov.asic.types.TrueType accepted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(ACCEPTED$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(ACCEPTED$0);
            }
            target.set(accepted);
        }
    }
    
    /**
     * Unsets the "accepted" element
     */
    public void unsetAccepted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCEPTED$0, 0);
        }
    }
    
    /**
     * Gets the "rejected" element
     */
    public boolean getRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTED$2, 0);
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
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REJECTED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "rejected" element
     */
    public boolean isSetRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REJECTED$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REJECTED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REJECTED$2);
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
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REJECTED$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(REJECTED$2);
            }
            target.set(rejected);
        }
    }
    
    /**
     * Unsets the "rejected" element
     */
    public void unsetRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REJECTED$2, 0);
        }
    }
    
    /**
     * Gets the "delayed" element
     */
    public boolean getDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELAYED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "delayed" element
     */
    public au.gov.asic.types.TrueType xgetDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(DELAYED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "delayed" element
     */
    public boolean isSetDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELAYED$4) != 0;
        }
    }
    
    /**
     * Sets the "delayed" element
     */
    public void setDelayed(boolean delayed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELAYED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELAYED$4);
            }
            target.setBooleanValue(delayed);
        }
    }
    
    /**
     * Sets (as xml) the "delayed" element
     */
    public void xsetDelayed(au.gov.asic.types.TrueType delayed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(DELAYED$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(DELAYED$4);
            }
            target.set(delayed);
        }
    }
    
    /**
     * Unsets the "delayed" element
     */
    public void unsetDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELAYED$4, 0);
        }
    }
    
    /**
     * Gets the "fault" element
     */
    public boolean getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fault" element
     */
    public au.gov.asic.types.TrueType xgetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(FAULT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "fault" element
     */
    public boolean isSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULT$6) != 0;
        }
    }
    
    /**
     * Sets the "fault" element
     */
    public void setFault(boolean fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULT$6);
            }
            target.setBooleanValue(fault);
        }
    }
    
    /**
     * Sets (as xml) the "fault" element
     */
    public void xsetFault(au.gov.asic.types.TrueType fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(FAULT$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(FAULT$6);
            }
            target.set(fault);
        }
    }
    
    /**
     * Unsets the "fault" element
     */
    public void unsetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULT$6, 0);
        }
    }
}
