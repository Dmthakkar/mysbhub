/*
 * XML Type:  renewalResultType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.RenewalResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML renewalResultType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RenewalResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.RenewalResultType
{
    
    public RenewalResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENEWALTO$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "renewalTo");
    private static final javax.xml.namespace.QName RENEWALFAILED$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "renewalFailed");
    
    
    /**
     * Gets the "renewalTo" element
     */
    public java.util.Calendar getRenewalTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENEWALTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "renewalTo" element
     */
    public org.apache.xmlbeans.XmlDate xgetRenewalTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RENEWALTO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "renewalTo" element
     */
    public boolean isSetRenewalTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENEWALTO$0) != 0;
        }
    }
    
    /**
     * Sets the "renewalTo" element
     */
    public void setRenewalTo(java.util.Calendar renewalTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENEWALTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENEWALTO$0);
            }
            target.setCalendarValue(renewalTo);
        }
    }
    
    /**
     * Sets (as xml) the "renewalTo" element
     */
    public void xsetRenewalTo(org.apache.xmlbeans.XmlDate renewalTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RENEWALTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(RENEWALTO$0);
            }
            target.set(renewalTo);
        }
    }
    
    /**
     * Unsets the "renewalTo" element
     */
    public void unsetRenewalTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENEWALTO$0, 0);
        }
    }
    
    /**
     * Gets the "renewalFailed" element
     */
    public boolean getRenewalFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENEWALFAILED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "renewalFailed" element
     */
    public au.gov.asic.types.TrueType xgetRenewalFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(RENEWALFAILED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "renewalFailed" element
     */
    public boolean isSetRenewalFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENEWALFAILED$2) != 0;
        }
    }
    
    /**
     * Sets the "renewalFailed" element
     */
    public void setRenewalFailed(boolean renewalFailed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENEWALFAILED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENEWALFAILED$2);
            }
            target.setBooleanValue(renewalFailed);
        }
    }
    
    /**
     * Sets (as xml) the "renewalFailed" element
     */
    public void xsetRenewalFailed(au.gov.asic.types.TrueType renewalFailed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(RENEWALFAILED$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(RENEWALFAILED$2);
            }
            target.set(renewalFailed);
        }
    }
    
    /**
     * Unsets the "renewalFailed" element
     */
    public void unsetRenewalFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENEWALFAILED$2, 0);
        }
    }
}
