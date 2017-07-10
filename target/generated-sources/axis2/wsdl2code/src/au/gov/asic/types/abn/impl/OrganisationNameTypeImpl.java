/*
 * XML Type:  organisationNameType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.OrganisationNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML organisationNameType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OrganisationNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.OrganisationNameType
{
    
    public OrganisationNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSHORTNAME1$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisationShortName1");
    private static final javax.xml.namespace.QName ORGANISATIONSHORTNAME2$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisationShortName2");
    private static final javax.xml.namespace.QName EFFECTIVEFROM$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
    private static final javax.xml.namespace.QName EFFECTIVETO$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
    private static final javax.xml.namespace.QName DELETEINDICATOR$8 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "deleteIndicator");
    private static final javax.xml.namespace.QName ORGANISATIONNAME$10 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisationName");
    
    
    /**
     * Gets the "organisationShortName1" element
     */
    public java.lang.String getOrganisationShortName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSHORTNAME1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organisationShortName1" element
     */
    public au.gov.asic.types.NniNameType xgetOrganisationShortName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONSHORTNAME1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "organisationShortName1" element
     */
    public void setOrganisationShortName1(java.lang.String organisationShortName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSHORTNAME1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSHORTNAME1$0);
            }
            target.setStringValue(organisationShortName1);
        }
    }
    
    /**
     * Sets (as xml) the "organisationShortName1" element
     */
    public void xsetOrganisationShortName1(au.gov.asic.types.NniNameType organisationShortName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONSHORTNAME1$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ORGANISATIONSHORTNAME1$0);
            }
            target.set(organisationShortName1);
        }
    }
    
    /**
     * Gets the "organisationShortName2" element
     */
    public java.lang.String getOrganisationShortName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSHORTNAME2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organisationShortName2" element
     */
    public au.gov.asic.types.NniNameType xgetOrganisationShortName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONSHORTNAME2$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "organisationShortName2" element
     */
    public void setOrganisationShortName2(java.lang.String organisationShortName2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSHORTNAME2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSHORTNAME2$2);
            }
            target.setStringValue(organisationShortName2);
        }
    }
    
    /**
     * Sets (as xml) the "organisationShortName2" element
     */
    public void xsetOrganisationShortName2(au.gov.asic.types.NniNameType organisationShortName2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONSHORTNAME2$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ORGANISATIONSHORTNAME2$2);
            }
            target.set(organisationShortName2);
        }
    }
    
    /**
     * Gets the "effectiveFrom" element
     */
    public java.util.Calendar getEffectiveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$4, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$4);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$6, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "effectiveTo" element
     */
    public boolean isSetEffectiveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVETO$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$6);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$6);
            }
            target.set(effectiveTo);
        }
    }
    
    /**
     * Unsets the "effectiveTo" element
     */
    public void unsetEffectiveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVETO$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$8, 0);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEINDICATOR$8);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(DELETEINDICATOR$8);
            }
            target.set(deleteIndicator);
        }
    }
    
    /**
     * Gets the "organisationName" element
     */
    public java.lang.String getOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organisationName" element
     */
    public au.gov.asic.types.NniNameType xgetOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONNAME$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "organisationName" element
     */
    public void setOrganisationName(java.lang.String organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONNAME$10);
            }
            target.setStringValue(organisationName);
        }
    }
    
    /**
     * Sets (as xml) the "organisationName" element
     */
    public void xsetOrganisationName(au.gov.asic.types.NniNameType organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONNAME$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ORGANISATIONNAME$10);
            }
            target.set(organisationName);
        }
    }
}
