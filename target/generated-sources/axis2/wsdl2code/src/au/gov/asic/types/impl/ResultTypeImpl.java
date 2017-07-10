/*
 * XML Type:  resultType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML resultType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ResultType
{
    
    public ResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTFULFILLED$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestFulfilled");
    private static final javax.xml.namespace.QName REQUESTREJECTED$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestRejected");
    private static final javax.xml.namespace.QName REQUESTDELAYED$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestDelayed");
    private static final javax.xml.namespace.QName REQUESTFAILED$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestFailed");
    
    
    /**
     * Gets the "requestFulfilled" element
     */
    public boolean getRequestFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFULFILLED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestFulfilled" element
     */
    public au.gov.asic.types.TrueType xgetRequestFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFULFILLED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestFulfilled" element
     */
    public boolean isSetRequestFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTFULFILLED$0) != 0;
        }
    }
    
    /**
     * Sets the "requestFulfilled" element
     */
    public void setRequestFulfilled(boolean requestFulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFULFILLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTFULFILLED$0);
            }
            target.setBooleanValue(requestFulfilled);
        }
    }
    
    /**
     * Sets (as xml) the "requestFulfilled" element
     */
    public void xsetRequestFulfilled(au.gov.asic.types.TrueType requestFulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFULFILLED$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTFULFILLED$0);
            }
            target.set(requestFulfilled);
        }
    }
    
    /**
     * Unsets the "requestFulfilled" element
     */
    public void unsetRequestFulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTFULFILLED$0, 0);
        }
    }
    
    /**
     * Gets the "requestRejected" element
     */
    public boolean getRequestRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTREJECTED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestRejected" element
     */
    public au.gov.asic.types.TrueType xgetRequestRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTREJECTED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestRejected" element
     */
    public boolean isSetRequestRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTREJECTED$2) != 0;
        }
    }
    
    /**
     * Sets the "requestRejected" element
     */
    public void setRequestRejected(boolean requestRejected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTREJECTED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTREJECTED$2);
            }
            target.setBooleanValue(requestRejected);
        }
    }
    
    /**
     * Sets (as xml) the "requestRejected" element
     */
    public void xsetRequestRejected(au.gov.asic.types.TrueType requestRejected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTREJECTED$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTREJECTED$2);
            }
            target.set(requestRejected);
        }
    }
    
    /**
     * Unsets the "requestRejected" element
     */
    public void unsetRequestRejected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTREJECTED$2, 0);
        }
    }
    
    /**
     * Gets the "requestDelayed" element
     */
    public boolean getRequestDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDELAYED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestDelayed" element
     */
    public au.gov.asic.types.TrueType xgetRequestDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTDELAYED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestDelayed" element
     */
    public boolean isSetRequestDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTDELAYED$4) != 0;
        }
    }
    
    /**
     * Sets the "requestDelayed" element
     */
    public void setRequestDelayed(boolean requestDelayed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDELAYED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTDELAYED$4);
            }
            target.setBooleanValue(requestDelayed);
        }
    }
    
    /**
     * Sets (as xml) the "requestDelayed" element
     */
    public void xsetRequestDelayed(au.gov.asic.types.TrueType requestDelayed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTDELAYED$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTDELAYED$4);
            }
            target.set(requestDelayed);
        }
    }
    
    /**
     * Unsets the "requestDelayed" element
     */
    public void unsetRequestDelayed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTDELAYED$4, 0);
        }
    }
    
    /**
     * Gets the "requestFailed" element
     */
    public boolean getRequestFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFAILED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestFailed" element
     */
    public au.gov.asic.types.TrueType xgetRequestFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFAILED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestFailed" element
     */
    public boolean isSetRequestFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTFAILED$6) != 0;
        }
    }
    
    /**
     * Sets the "requestFailed" element
     */
    public void setRequestFailed(boolean requestFailed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFAILED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTFAILED$6);
            }
            target.setBooleanValue(requestFailed);
        }
    }
    
    /**
     * Sets (as xml) the "requestFailed" element
     */
    public void xsetRequestFailed(au.gov.asic.types.TrueType requestFailed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFAILED$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTFAILED$6);
            }
            target.set(requestFailed);
        }
    }
    
    /**
     * Unsets the "requestFailed" element
     */
    public void unsetRequestFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTFAILED$6, 0);
        }
    }
}
