/*
 * XML Type:  geographicType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.GeographicType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML geographicType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class GeographicTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.GeographicType
{
    
    public GeographicTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSLINE1$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "addressLine1");
    private static final javax.xml.namespace.QName ADDRESSLINE2$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "addressLine2");
    private static final javax.xml.namespace.QName SUBURB$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "suburb");
    private static final javax.xml.namespace.QName POSTCODE$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "postcode");
    private static final javax.xml.namespace.QName STATECODE$8 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "stateCode");
    private static final javax.xml.namespace.QName COUNTRYCODE$10 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "countryCode");
    private static final javax.xml.namespace.QName DPID$12 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "DPID");
    private static final javax.xml.namespace.QName DPIDSTATUSCODE$14 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "DPIDStatusCode");
    private static final javax.xml.namespace.QName LASTCONFIRMEDDATE$16 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "lastConfirmedDate");
    private static final javax.xml.namespace.QName RELIABILITYINDICATORCODE$18 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "reliabilityIndicatorCode");
    private static final javax.xml.namespace.QName RELIABILITYINDICATORDATE$20 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "reliabilityIndicatorDate");
    private static final javax.xml.namespace.QName EFFECTIVEFROM$22 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
    private static final javax.xml.namespace.QName EFFECTIVETO$24 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
    private static final javax.xml.namespace.QName DELETEINDICATOR$26 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "deleteIndicator");
    
    
    /**
     * Gets the "addressLine1" element
     */
    public java.lang.String getAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressLine1" element
     */
    public au.gov.asic.types.abn.AddressLine1Type xgetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AddressLine1Type target = null;
            target = (au.gov.asic.types.abn.AddressLine1Type)get_store().find_element_user(ADDRESSLINE1$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "addressLine1" element
     */
    public boolean isSetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE1$0) != 0;
        }
    }
    
    /**
     * Sets the "addressLine1" element
     */
    public void setAddressLine1(java.lang.String addressLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE1$0);
            }
            target.setStringValue(addressLine1);
        }
    }
    
    /**
     * Sets (as xml) the "addressLine1" element
     */
    public void xsetAddressLine1(au.gov.asic.types.abn.AddressLine1Type addressLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AddressLine1Type target = null;
            target = (au.gov.asic.types.abn.AddressLine1Type)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AddressLine1Type)get_store().add_element_user(ADDRESSLINE1$0);
            }
            target.set(addressLine1);
        }
    }
    
    /**
     * Unsets the "addressLine1" element
     */
    public void unsetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE1$0, 0);
        }
    }
    
    /**
     * Gets the "addressLine2" element
     */
    public java.lang.String getAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressLine2" element
     */
    public au.gov.asic.types.abn.AddressLine2Type xgetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AddressLine2Type target = null;
            target = (au.gov.asic.types.abn.AddressLine2Type)get_store().find_element_user(ADDRESSLINE2$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "addressLine2" element
     */
    public boolean isSetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE2$2) != 0;
        }
    }
    
    /**
     * Sets the "addressLine2" element
     */
    public void setAddressLine2(java.lang.String addressLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE2$2);
            }
            target.setStringValue(addressLine2);
        }
    }
    
    /**
     * Sets (as xml) the "addressLine2" element
     */
    public void xsetAddressLine2(au.gov.asic.types.abn.AddressLine2Type addressLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AddressLine2Type target = null;
            target = (au.gov.asic.types.abn.AddressLine2Type)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AddressLine2Type)get_store().add_element_user(ADDRESSLINE2$2);
            }
            target.set(addressLine2);
        }
    }
    
    /**
     * Unsets the "addressLine2" element
     */
    public void unsetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE2$2, 0);
        }
    }
    
    /**
     * Gets the "suburb" element
     */
    public java.lang.String getSuburb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBURB$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suburb" element
     */
    public au.gov.asic.types.abn.SuburbType xgetSuburb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.SuburbType target = null;
            target = (au.gov.asic.types.abn.SuburbType)get_store().find_element_user(SUBURB$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "suburb" element
     */
    public boolean isSetSuburb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBURB$4) != 0;
        }
    }
    
    /**
     * Sets the "suburb" element
     */
    public void setSuburb(java.lang.String suburb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBURB$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBURB$4);
            }
            target.setStringValue(suburb);
        }
    }
    
    /**
     * Sets (as xml) the "suburb" element
     */
    public void xsetSuburb(au.gov.asic.types.abn.SuburbType suburb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.SuburbType target = null;
            target = (au.gov.asic.types.abn.SuburbType)get_store().find_element_user(SUBURB$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.SuburbType)get_store().add_element_user(SUBURB$4);
            }
            target.set(suburb);
        }
    }
    
    /**
     * Unsets the "suburb" element
     */
    public void unsetSuburb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBURB$4, 0);
        }
    }
    
    /**
     * Gets the "postcode" element
     */
    public java.lang.String getPostcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "postcode" element
     */
    public au.gov.asic.types.abn.PostcodeType xgetPostcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.PostcodeType target = null;
            target = (au.gov.asic.types.abn.PostcodeType)get_store().find_element_user(POSTCODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "postcode" element
     */
    public void setPostcode(java.lang.String postcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$6);
            }
            target.setStringValue(postcode);
        }
    }
    
    /**
     * Sets (as xml) the "postcode" element
     */
    public void xsetPostcode(au.gov.asic.types.abn.PostcodeType postcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.PostcodeType target = null;
            target = (au.gov.asic.types.abn.PostcodeType)get_store().find_element_user(POSTCODE$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.PostcodeType)get_store().add_element_user(POSTCODE$6);
            }
            target.set(postcode);
        }
    }
    
    /**
     * Gets the "stateCode" element
     */
    public java.lang.String getStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATECODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stateCode" element
     */
    public au.gov.asic.types.abn.StateCodeType xgetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.StateCodeType target = null;
            target = (au.gov.asic.types.abn.StateCodeType)get_store().find_element_user(STATECODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "stateCode" element
     */
    public boolean isSetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATECODE$8) != 0;
        }
    }
    
    /**
     * Sets the "stateCode" element
     */
    public void setStateCode(java.lang.String stateCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATECODE$8);
            }
            target.setStringValue(stateCode);
        }
    }
    
    /**
     * Sets (as xml) the "stateCode" element
     */
    public void xsetStateCode(au.gov.asic.types.abn.StateCodeType stateCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.StateCodeType target = null;
            target = (au.gov.asic.types.abn.StateCodeType)get_store().find_element_user(STATECODE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.StateCodeType)get_store().add_element_user(STATECODE$8);
            }
            target.set(stateCode);
        }
    }
    
    /**
     * Unsets the "stateCode" element
     */
    public void unsetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATECODE$8, 0);
        }
    }
    
    /**
     * Gets the "countryCode" element
     */
    public java.lang.String getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryCode" element
     */
    public au.gov.asic.types.abn.CountryCodeType xgetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.CountryCodeType target = null;
            target = (au.gov.asic.types.abn.CountryCodeType)get_store().find_element_user(COUNTRYCODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "countryCode" element
     */
    public boolean isSetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "countryCode" element
     */
    public void setCountryCode(java.lang.String countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$10);
            }
            target.setStringValue(countryCode);
        }
    }
    
    /**
     * Sets (as xml) the "countryCode" element
     */
    public void xsetCountryCode(au.gov.asic.types.abn.CountryCodeType countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.CountryCodeType target = null;
            target = (au.gov.asic.types.abn.CountryCodeType)get_store().find_element_user(COUNTRYCODE$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.CountryCodeType)get_store().add_element_user(COUNTRYCODE$10);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Unsets the "countryCode" element
     */
    public void unsetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYCODE$10, 0);
        }
    }
    
    /**
     * Gets the "DPID" element
     */
    public java.math.BigInteger getDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "DPID" element
     */
    public au.gov.asic.types.abn.DPIDType xgetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DPIDType target = null;
            target = (au.gov.asic.types.abn.DPIDType)get_store().find_element_user(DPID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DPID" element
     */
    public boolean isSetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DPID$12) != 0;
        }
    }
    
    /**
     * Sets the "DPID" element
     */
    public void setDPID(java.math.BigInteger dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DPID$12);
            }
            target.setBigIntegerValue(dpid);
        }
    }
    
    /**
     * Sets (as xml) the "DPID" element
     */
    public void xsetDPID(au.gov.asic.types.abn.DPIDType dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DPIDType target = null;
            target = (au.gov.asic.types.abn.DPIDType)get_store().find_element_user(DPID$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DPIDType)get_store().add_element_user(DPID$12);
            }
            target.set(dpid);
        }
    }
    
    /**
     * Unsets the "DPID" element
     */
    public void unsetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DPID$12, 0);
        }
    }
    
    /**
     * Gets the "DPIDStatusCode" element
     */
    public java.lang.String getDPIDStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPIDSTATUSCODE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DPIDStatusCode" element
     */
    public au.gov.asic.types.abn.DPIDStatusCodeType xgetDPIDStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DPIDStatusCodeType target = null;
            target = (au.gov.asic.types.abn.DPIDStatusCodeType)get_store().find_element_user(DPIDSTATUSCODE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DPIDStatusCode" element
     */
    public boolean isSetDPIDStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DPIDSTATUSCODE$14) != 0;
        }
    }
    
    /**
     * Sets the "DPIDStatusCode" element
     */
    public void setDPIDStatusCode(java.lang.String dpidStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPIDSTATUSCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DPIDSTATUSCODE$14);
            }
            target.setStringValue(dpidStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "DPIDStatusCode" element
     */
    public void xsetDPIDStatusCode(au.gov.asic.types.abn.DPIDStatusCodeType dpidStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DPIDStatusCodeType target = null;
            target = (au.gov.asic.types.abn.DPIDStatusCodeType)get_store().find_element_user(DPIDSTATUSCODE$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DPIDStatusCodeType)get_store().add_element_user(DPIDSTATUSCODE$14);
            }
            target.set(dpidStatusCode);
        }
    }
    
    /**
     * Unsets the "DPIDStatusCode" element
     */
    public void unsetDPIDStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DPIDSTATUSCODE$14, 0);
        }
    }
    
    /**
     * Gets the "lastConfirmedDate" element
     */
    public java.util.Calendar getLastConfirmedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCONFIRMEDDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastConfirmedDate" element
     */
    public au.gov.asic.types.abn.DateType xgetLastConfirmedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(LASTCONFIRMEDDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "lastConfirmedDate" element
     */
    public boolean isSetLastConfirmedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCONFIRMEDDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "lastConfirmedDate" element
     */
    public void setLastConfirmedDate(java.util.Calendar lastConfirmedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCONFIRMEDDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCONFIRMEDDATE$16);
            }
            target.setCalendarValue(lastConfirmedDate);
        }
    }
    
    /**
     * Sets (as xml) the "lastConfirmedDate" element
     */
    public void xsetLastConfirmedDate(au.gov.asic.types.abn.DateType lastConfirmedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(LASTCONFIRMEDDATE$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(LASTCONFIRMEDDATE$16);
            }
            target.set(lastConfirmedDate);
        }
    }
    
    /**
     * Unsets the "lastConfirmedDate" element
     */
    public void unsetLastConfirmedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCONFIRMEDDATE$16, 0);
        }
    }
    
    /**
     * Gets the "reliabilityIndicatorCode" element
     */
    public au.gov.asic.types.abn.IndicatorType.Enum getReliabilityIndicatorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITYINDICATORCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.abn.IndicatorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reliabilityIndicatorCode" element
     */
    public au.gov.asic.types.abn.IndicatorType xgetReliabilityIndicatorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(RELIABILITYINDICATORCODE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "reliabilityIndicatorCode" element
     */
    public boolean isSetReliabilityIndicatorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELIABILITYINDICATORCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "reliabilityIndicatorCode" element
     */
    public void setReliabilityIndicatorCode(au.gov.asic.types.abn.IndicatorType.Enum reliabilityIndicatorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITYINDICATORCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELIABILITYINDICATORCODE$18);
            }
            target.setEnumValue(reliabilityIndicatorCode);
        }
    }
    
    /**
     * Sets (as xml) the "reliabilityIndicatorCode" element
     */
    public void xsetReliabilityIndicatorCode(au.gov.asic.types.abn.IndicatorType reliabilityIndicatorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(RELIABILITYINDICATORCODE$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(RELIABILITYINDICATORCODE$18);
            }
            target.set(reliabilityIndicatorCode);
        }
    }
    
    /**
     * Unsets the "reliabilityIndicatorCode" element
     */
    public void unsetReliabilityIndicatorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELIABILITYINDICATORCODE$18, 0);
        }
    }
    
    /**
     * Gets the "reliabilityIndicatorDate" element
     */
    public java.util.Calendar getReliabilityIndicatorDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITYINDICATORDATE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "reliabilityIndicatorDate" element
     */
    public au.gov.asic.types.abn.DateType xgetReliabilityIndicatorDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(RELIABILITYINDICATORDATE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "reliabilityIndicatorDate" element
     */
    public boolean isSetReliabilityIndicatorDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELIABILITYINDICATORDATE$20) != 0;
        }
    }
    
    /**
     * Sets the "reliabilityIndicatorDate" element
     */
    public void setReliabilityIndicatorDate(java.util.Calendar reliabilityIndicatorDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITYINDICATORDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELIABILITYINDICATORDATE$20);
            }
            target.setCalendarValue(reliabilityIndicatorDate);
        }
    }
    
    /**
     * Sets (as xml) the "reliabilityIndicatorDate" element
     */
    public void xsetReliabilityIndicatorDate(au.gov.asic.types.abn.DateType reliabilityIndicatorDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(RELIABILITYINDICATORDATE$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(RELIABILITYINDICATORDATE$20);
            }
            target.set(reliabilityIndicatorDate);
        }
    }
    
    /**
     * Unsets the "reliabilityIndicatorDate" element
     */
    public void unsetReliabilityIndicatorDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELIABILITYINDICATORDATE$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$22, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$22, 0);
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
            return get_store().count_elements(EFFECTIVEFROM$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$22);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$22);
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
            get_store().remove_element(EFFECTIVEFROM$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$24, 0);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$24, 0);
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
            return get_store().count_elements(EFFECTIVETO$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$24);
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
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$24, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$24);
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
            get_store().remove_element(EFFECTIVETO$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$26, 0);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$26, 0);
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
            return get_store().count_elements(DELETEINDICATOR$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEINDICATOR$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEINDICATOR$26);
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
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(DELETEINDICATOR$26, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(DELETEINDICATOR$26);
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
            get_store().remove_element(DELETEINDICATOR$26, 0);
        }
    }
}
