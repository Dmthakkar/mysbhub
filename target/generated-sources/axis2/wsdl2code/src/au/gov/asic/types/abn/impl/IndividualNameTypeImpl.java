/*
 * XML Type:  individualNameType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.IndividualNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML individualNameType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class IndividualNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.IndividualNameType
{
    
    public IndividualNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLETYPECODE$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "titleTypeCode");
    private static final javax.xml.namespace.QName GIVENNAME$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "givenName");
    private static final javax.xml.namespace.QName OTHERGIVENNAME$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "otherGivenName");
    private static final javax.xml.namespace.QName FAMILYNAME$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "familyName");
    private static final javax.xml.namespace.QName SUFFIXTYPECODE$8 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "suffixTypeCode");
    private static final javax.xml.namespace.QName EFFECTIVEFROM$10 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
    private static final javax.xml.namespace.QName EFFECTIVETO$12 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
    private static final javax.xml.namespace.QName DELETEINDICATOR$14 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "deleteIndicator");
    
    
    /**
     * Gets the "titleTypeCode" element
     */
    public java.lang.String getTitleTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLETYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "titleTypeCode" element
     */
    public au.gov.asic.types.abn.TitleTypeCodeType xgetTitleTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.TitleTypeCodeType target = null;
            target = (au.gov.asic.types.abn.TitleTypeCodeType)get_store().find_element_user(TITLETYPECODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "titleTypeCode" element
     */
    public boolean isSetTitleTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLETYPECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "titleTypeCode" element
     */
    public void setTitleTypeCode(java.lang.String titleTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLETYPECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLETYPECODE$0);
            }
            target.setStringValue(titleTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "titleTypeCode" element
     */
    public void xsetTitleTypeCode(au.gov.asic.types.abn.TitleTypeCodeType titleTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.TitleTypeCodeType target = null;
            target = (au.gov.asic.types.abn.TitleTypeCodeType)get_store().find_element_user(TITLETYPECODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.TitleTypeCodeType)get_store().add_element_user(TITLETYPECODE$0);
            }
            target.set(titleTypeCode);
        }
    }
    
    /**
     * Unsets the "titleTypeCode" element
     */
    public void unsetTitleTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLETYPECODE$0, 0);
        }
    }
    
    /**
     * Gets the "givenName" element
     */
    public java.lang.String getGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "givenName" element
     */
    public au.gov.asic.types.abn.GivenNameType xgetGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GivenNameType target = null;
            target = (au.gov.asic.types.abn.GivenNameType)get_store().find_element_user(GIVENNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "givenName" element
     */
    public void setGivenName(java.lang.String givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIVENNAME$2);
            }
            target.setStringValue(givenName);
        }
    }
    
    /**
     * Sets (as xml) the "givenName" element
     */
    public void xsetGivenName(au.gov.asic.types.abn.GivenNameType givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GivenNameType target = null;
            target = (au.gov.asic.types.abn.GivenNameType)get_store().find_element_user(GIVENNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.GivenNameType)get_store().add_element_user(GIVENNAME$2);
            }
            target.set(givenName);
        }
    }
    
    /**
     * Gets the "otherGivenName" element
     */
    public java.lang.String getOtherGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERGIVENNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "otherGivenName" element
     */
    public au.gov.asic.types.abn.OtherGivenNameType xgetOtherGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.OtherGivenNameType target = null;
            target = (au.gov.asic.types.abn.OtherGivenNameType)get_store().find_element_user(OTHERGIVENNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "otherGivenName" element
     */
    public boolean isSetOtherGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERGIVENNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "otherGivenName" element
     */
    public void setOtherGivenName(java.lang.String otherGivenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERGIVENNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERGIVENNAME$4);
            }
            target.setStringValue(otherGivenName);
        }
    }
    
    /**
     * Sets (as xml) the "otherGivenName" element
     */
    public void xsetOtherGivenName(au.gov.asic.types.abn.OtherGivenNameType otherGivenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.OtherGivenNameType target = null;
            target = (au.gov.asic.types.abn.OtherGivenNameType)get_store().find_element_user(OTHERGIVENNAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.OtherGivenNameType)get_store().add_element_user(OTHERGIVENNAME$4);
            }
            target.set(otherGivenName);
        }
    }
    
    /**
     * Unsets the "otherGivenName" element
     */
    public void unsetOtherGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERGIVENNAME$4, 0);
        }
    }
    
    /**
     * Gets the "familyName" element
     */
    public java.lang.String getFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILYNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "familyName" element
     */
    public au.gov.asic.types.abn.FamilyNameType xgetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.FamilyNameType target = null;
            target = (au.gov.asic.types.abn.FamilyNameType)get_store().find_element_user(FAMILYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "familyName" element
     */
    public void setFamilyName(java.lang.String familyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAMILYNAME$6);
            }
            target.setStringValue(familyName);
        }
    }
    
    /**
     * Sets (as xml) the "familyName" element
     */
    public void xsetFamilyName(au.gov.asic.types.abn.FamilyNameType familyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.FamilyNameType target = null;
            target = (au.gov.asic.types.abn.FamilyNameType)get_store().find_element_user(FAMILYNAME$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.FamilyNameType)get_store().add_element_user(FAMILYNAME$6);
            }
            target.set(familyName);
        }
    }
    
    /**
     * Gets the "suffixTypeCode" element
     */
    public java.lang.String getSuffixTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIXTYPECODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suffixTypeCode" element
     */
    public au.gov.asic.types.abn.SuffixTypeCodeType xgetSuffixTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.SuffixTypeCodeType target = null;
            target = (au.gov.asic.types.abn.SuffixTypeCodeType)get_store().find_element_user(SUFFIXTYPECODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "suffixTypeCode" element
     */
    public boolean isSetSuffixTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIXTYPECODE$8) != 0;
        }
    }
    
    /**
     * Sets the "suffixTypeCode" element
     */
    public void setSuffixTypeCode(java.lang.String suffixTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIXTYPECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUFFIXTYPECODE$8);
            }
            target.setStringValue(suffixTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "suffixTypeCode" element
     */
    public void xsetSuffixTypeCode(au.gov.asic.types.abn.SuffixTypeCodeType suffixTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.SuffixTypeCodeType target = null;
            target = (au.gov.asic.types.abn.SuffixTypeCodeType)get_store().find_element_user(SUFFIXTYPECODE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.SuffixTypeCodeType)get_store().add_element_user(SUFFIXTYPECODE$8);
            }
            target.set(suffixTypeCode);
        }
    }
    
    /**
     * Unsets the "suffixTypeCode" element
     */
    public void unsetSuffixTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIXTYPECODE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$10, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "effectiveFrom" element
     */
    public boolean isSetEffectiveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVEFROM$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$10);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$10);
            }
            target.set(effectiveFrom);
        }
    }
    
    /**
     * Unsets the "effectiveFrom" element
     */
    public void unsetEffectiveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVEFROM$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$12, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$12, 0);
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
            return get_store().count_elements(EFFECTIVETO$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$12);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$12);
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
            get_store().remove_element(EFFECTIVETO$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$14, 0);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "deleteIndicator" element
     */
    public boolean isSetDeleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEINDICATOR$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEINDICATOR$14);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(DELETEINDICATOR$14);
            }
            target.set(deleteIndicator);
        }
    }
    
    /**
     * Unsets the "deleteIndicator" element
     */
    public void unsetDeleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEINDICATOR$14, 0);
        }
    }
}
