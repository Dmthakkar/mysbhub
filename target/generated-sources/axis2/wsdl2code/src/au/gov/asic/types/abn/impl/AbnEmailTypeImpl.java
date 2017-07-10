/*
 * XML Type:  abnEmailType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbnEmailType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML abnEmailType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AbnEmailTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnEmailType
{
    
    public AbnEmailTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFECTIVEFROM$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
    private static final javax.xml.namespace.QName EFFECTIVETO$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
    private static final javax.xml.namespace.QName DELETEINDICATOR$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "deleteIndicator");
    private static final javax.xml.namespace.QName EMAILADDRESS$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "emailAddress");
    
    
    /**
     * Gets the "effectiveFrom" element
     */
    public java.util.Calendar getEffectiveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveFrom" element
     */
    public au.gov.asic.types.abn.DateType xgetEffectiveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "effectiveFrom" element
     */
    public void setEffectiveFrom(java.util.Calendar effectiveFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$0);
            }
            target.setCalendarValue(effectiveFrom);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveFrom" element
     */
    public void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$0);
            }
            target.set(effectiveFrom);
        }
    }
    
    /**
     * Gets the "effectiveTo" element
     */
    public java.util.Calendar getEffectiveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveTo" element
     */
    public au.gov.asic.types.abn.DateType xgetEffectiveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "effectiveTo" element
     */
    public void setEffectiveTo(java.util.Calendar effectiveTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$2);
            }
            target.setCalendarValue(effectiveTo);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveTo" element
     */
    public void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$2);
            }
            target.set(effectiveTo);
        }
    }
    
    /**
     * Gets the "deleteIndicator" element
     */
    public au.gov.asic.types.abn.IndicatorType.Enum getDeleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.abn.IndicatorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleteIndicator" element
     */
    public au.gov.asic.types.abn.IndicatorType xgetDeleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "deleteIndicator" element
     */
    public void setDeleteIndicator(au.gov.asic.types.abn.IndicatorType.Enum deleteIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEINDICATOR$4);
            }
            target.setEnumValue(deleteIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "deleteIndicator" element
     */
    public void xsetDeleteIndicator(au.gov.asic.types.abn.IndicatorType deleteIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(DELETEINDICATOR$4);
            }
            target.set(deleteIndicator);
        }
    }
    
    /**
     * Gets the "emailAddress" element
     */
    public java.lang.String getEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    public au.gov.asic.types.EmailType xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "emailAddress" element
     */
    public void setEmailAddress(java.lang.String emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$6);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    public void xsetEmailAddress(au.gov.asic.types.EmailType emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$6);
            }
            target.set(emailAddress);
        }
    }
}
