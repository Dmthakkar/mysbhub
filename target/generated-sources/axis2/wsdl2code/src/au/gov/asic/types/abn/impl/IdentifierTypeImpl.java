/*
 * XML Type:  identifierType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.IdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML identifierType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class IdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.IdentifierType
{
    
    public IdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERVALUE$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "identifierValue");
    private static final javax.xml.namespace.QName IDENTIFIERSTATUSCODE$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "identifierStatusCode");
    private static final javax.xml.namespace.QName ISSUINGPARTYCODE$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "issuingPartyCode");
    private static final javax.xml.namespace.QName REPLACEDINDICATOR$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "replacedIndicator");
    private static final javax.xml.namespace.QName EFFECTIVEFROM$8 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
    private static final javax.xml.namespace.QName EFFECTIVETO$10 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
    private static final javax.xml.namespace.QName DELETEINDICATOR$12 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "deleteIndicator");
    
    
    /**
     * Gets the "identifierValue" element
     */
    public java.lang.String getIdentifierValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifierValue" element
     */
    public au.gov.asic.types.abn.IdentifierValueType xgetIdentifierValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierValueType target = null;
            target = (au.gov.asic.types.abn.IdentifierValueType)get_store().find_element_user(IDENTIFIERVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identifierValue" element
     */
    public void setIdentifierValue(java.lang.String identifierValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERVALUE$0);
            }
            target.setStringValue(identifierValue);
        }
    }
    
    /**
     * Sets (as xml) the "identifierValue" element
     */
    public void xsetIdentifierValue(au.gov.asic.types.abn.IdentifierValueType identifierValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierValueType target = null;
            target = (au.gov.asic.types.abn.IdentifierValueType)get_store().find_element_user(IDENTIFIERVALUE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IdentifierValueType)get_store().add_element_user(IDENTIFIERVALUE$0);
            }
            target.set(identifierValue);
        }
    }
    
    /**
     * Gets the "identifierStatusCode" element
     */
    public java.lang.String getIdentifierStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERSTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifierStatusCode" element
     */
    public au.gov.asic.types.abn.IdentifierStatusCodeType xgetIdentifierStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierStatusCodeType target = null;
            target = (au.gov.asic.types.abn.IdentifierStatusCodeType)get_store().find_element_user(IDENTIFIERSTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "identifierStatusCode" element
     */
    public boolean isSetIdentifierStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERSTATUSCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "identifierStatusCode" element
     */
    public void setIdentifierStatusCode(java.lang.String identifierStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERSTATUSCODE$2);
            }
            target.setStringValue(identifierStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "identifierStatusCode" element
     */
    public void xsetIdentifierStatusCode(au.gov.asic.types.abn.IdentifierStatusCodeType identifierStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierStatusCodeType target = null;
            target = (au.gov.asic.types.abn.IdentifierStatusCodeType)get_store().find_element_user(IDENTIFIERSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IdentifierStatusCodeType)get_store().add_element_user(IDENTIFIERSTATUSCODE$2);
            }
            target.set(identifierStatusCode);
        }
    }
    
    /**
     * Unsets the "identifierStatusCode" element
     */
    public void unsetIdentifierStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERSTATUSCODE$2, 0);
        }
    }
    
    /**
     * Gets the "issuingPartyCode" element
     */
    public java.lang.String getIssuingPartyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGPARTYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "issuingPartyCode" element
     */
    public au.gov.asic.types.abn.IssuingPartyCodeType xgetIssuingPartyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IssuingPartyCodeType target = null;
            target = (au.gov.asic.types.abn.IssuingPartyCodeType)get_store().find_element_user(ISSUINGPARTYCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "issuingPartyCode" element
     */
    public boolean isSetIssuingPartyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUINGPARTYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "issuingPartyCode" element
     */
    public void setIssuingPartyCode(java.lang.String issuingPartyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGPARTYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUINGPARTYCODE$4);
            }
            target.setStringValue(issuingPartyCode);
        }
    }
    
    /**
     * Sets (as xml) the "issuingPartyCode" element
     */
    public void xsetIssuingPartyCode(au.gov.asic.types.abn.IssuingPartyCodeType issuingPartyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IssuingPartyCodeType target = null;
            target = (au.gov.asic.types.abn.IssuingPartyCodeType)get_store().find_element_user(ISSUINGPARTYCODE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IssuingPartyCodeType)get_store().add_element_user(ISSUINGPARTYCODE$4);
            }
            target.set(issuingPartyCode);
        }
    }
    
    /**
     * Unsets the "issuingPartyCode" element
     */
    public void unsetIssuingPartyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUINGPARTYCODE$4, 0);
        }
    }
    
    /**
     * Gets the "replacedIndicator" element
     */
    public au.gov.asic.types.abn.IndicatorType.Enum getReplacedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEDINDICATOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.abn.IndicatorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "replacedIndicator" element
     */
    public au.gov.asic.types.abn.IndicatorType xgetReplacedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(REPLACEDINDICATOR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "replacedIndicator" element
     */
    public boolean isSetReplacedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLACEDINDICATOR$6) != 0;
        }
    }
    
    /**
     * Sets the "replacedIndicator" element
     */
    public void setReplacedIndicator(au.gov.asic.types.abn.IndicatorType.Enum replacedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEDINDICATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLACEDINDICATOR$6);
            }
            target.setEnumValue(replacedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "replacedIndicator" element
     */
    public void xsetReplacedIndicator(au.gov.asic.types.abn.IndicatorType replacedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(REPLACEDINDICATOR$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(REPLACEDINDICATOR$6);
            }
            target.set(replacedIndicator);
        }
    }
    
    /**
     * Unsets the "replacedIndicator" element
     */
    public void unsetReplacedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLACEDINDICATOR$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$8, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$8, 0);
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
            return get_store().count_elements(EFFECTIVEFROM$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$8);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$8);
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
            get_store().remove_element(EFFECTIVEFROM$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$10, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$10, 0);
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
            return get_store().count_elements(EFFECTIVETO$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$10);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$10);
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
            get_store().remove_element(EFFECTIVETO$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$12, 0);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$12, 0);
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
            return get_store().count_elements(DELETEINDICATOR$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEINDICATOR$12);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(DELETEINDICATOR$12);
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
            get_store().remove_element(DELETEINDICATOR$12, 0);
        }
    }
}
