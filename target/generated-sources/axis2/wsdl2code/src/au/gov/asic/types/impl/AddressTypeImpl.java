/*
 * XML Type:  addressType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AddressType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML addressType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AddressType
{
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName CAREOF$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "careOf");
    private static final javax.xml.namespace.QName ADDRESSLINE$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine");
    private static final javax.xml.namespace.QName ISO3166COUNTRYCODE$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "iso3166CountryCode");
    private static final javax.xml.namespace.QName COUNTRY$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "country");
    private static final javax.xml.namespace.QName DPID$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "DPID");
    private static final javax.xml.namespace.QName ASCOTID$12 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "ascotId");
    private static final javax.xml.namespace.QName ISFOREIGN$14 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "isForeign");
    private static final javax.xml.namespace.QName ISPOBOX$16 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "isPoBox");
    private static final javax.xml.namespace.QName STREET$18 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "street");
    private static final javax.xml.namespace.QName LOCALITY$20 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "locality");
    private static final javax.xml.namespace.QName POSTCODE$22 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "postCode");
    private static final javax.xml.namespace.QName STATE$24 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "state");
    private static final javax.xml.namespace.QName SEQUENCE$26 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "sequence");
    private static final javax.xml.namespace.QName OVERRIDE$28 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "override");
    private static final javax.xml.namespace.QName ACTION$30 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "action");
    private static final javax.xml.namespace.QName STARTDATE$32 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$34 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "endDate");
    private static final javax.xml.namespace.QName DOCUMENTNUMBER$36 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "documentNumber");
    
    
    /**
     * Gets the "type" element
     */
    public au.gov.asic.types.AddressTypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.AddressTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public au.gov.asic.types.AddressTypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressTypeType target = null;
            target = (au.gov.asic.types.AddressTypeType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(au.gov.asic.types.AddressTypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(au.gov.asic.types.AddressTypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressTypeType target = null;
            target = (au.gov.asic.types.AddressTypeType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressTypeType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "careOf" element
     */
    public java.lang.String getCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "careOf" element
     */
    public au.gov.asic.types.AddressType.CareOf xgetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.CareOf target = null;
            target = (au.gov.asic.types.AddressType.CareOf)get_store().find_element_user(CAREOF$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "careOf" element
     */
    public boolean isSetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREOF$2) != 0;
        }
    }
    
    /**
     * Sets the "careOf" element
     */
    public void setCareOf(java.lang.String careOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREOF$2);
            }
            target.setStringValue(careOf);
        }
    }
    
    /**
     * Sets (as xml) the "careOf" element
     */
    public void xsetCareOf(au.gov.asic.types.AddressType.CareOf careOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.CareOf target = null;
            target = (au.gov.asic.types.AddressType.CareOf)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.CareOf)get_store().add_element_user(CAREOF$2);
            }
            target.set(careOf);
        }
    }
    
    /**
     * Unsets the "careOf" element
     */
    public void unsetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREOF$2, 0);
        }
    }
    
    /**
     * Gets array of all "addressLine" elements
     */
    public java.lang.String[] getAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSLINE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "addressLine" element
     */
    public java.lang.String getAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "addressLine" elements
     */
    public au.gov.asic.types.AddressType.AddressLine[] xgetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSLINE$4, targetList);
            au.gov.asic.types.AddressType.AddressLine[] result = new au.gov.asic.types.AddressType.AddressLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "addressLine" element
     */
    public au.gov.asic.types.AddressType.AddressLine xgetAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.AddressLine target = null;
            target = (au.gov.asic.types.AddressType.AddressLine)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.AddressType.AddressLine)target;
        }
    }
    
    /**
     * Returns number of "addressLine" element
     */
    public int sizeOfAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE$4);
        }
    }
    
    /**
     * Sets array of all "addressLine" element
     */
    public void setAddressLineArray(java.lang.String[] addressLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressLineArray, ADDRESSLINE$4);
        }
    }
    
    /**
     * Sets ith "addressLine" element
     */
    public void setAddressLineArray(int i, java.lang.String addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(addressLine);
        }
    }
    
    /**
     * Sets (as xml) array of all "addressLine" element
     */
    public void xsetAddressLineArray(au.gov.asic.types.AddressType.AddressLine[]addressLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressLineArray, ADDRESSLINE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "addressLine" element
     */
    public void xsetAddressLineArray(int i, au.gov.asic.types.AddressType.AddressLine addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.AddressLine target = null;
            target = (au.gov.asic.types.AddressType.AddressLine)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressLine);
        }
    }
    
    /**
     * Inserts the value as the ith "addressLine" element
     */
    public void insertAddressLine(int i, java.lang.String addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ADDRESSLINE$4, i);
            target.setStringValue(addressLine);
        }
    }
    
    /**
     * Appends the value as the last "addressLine" element
     */
    public void addAddressLine(java.lang.String addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE$4);
            target.setStringValue(addressLine);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addressLine" element
     */
    public au.gov.asic.types.AddressType.AddressLine insertNewAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.AddressLine target = null;
            target = (au.gov.asic.types.AddressType.AddressLine)get_store().insert_element_user(ADDRESSLINE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addressLine" element
     */
    public au.gov.asic.types.AddressType.AddressLine addNewAddressLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.AddressLine target = null;
            target = (au.gov.asic.types.AddressType.AddressLine)get_store().add_element_user(ADDRESSLINE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "addressLine" element
     */
    public void removeAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE$4, i);
        }
    }
    
    /**
     * Gets the "iso3166CountryCode" element
     */
    public java.lang.String getIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISO3166COUNTRYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iso3166CountryCode" element
     */
    public au.gov.asic.types.AddressType.Iso3166CountryCode xgetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Iso3166CountryCode target = null;
            target = (au.gov.asic.types.AddressType.Iso3166CountryCode)get_store().find_element_user(ISO3166COUNTRYCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "iso3166CountryCode" element
     */
    public boolean isSetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISO3166COUNTRYCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "iso3166CountryCode" element
     */
    public void setIso3166CountryCode(java.lang.String iso3166CountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISO3166COUNTRYCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISO3166COUNTRYCODE$6);
            }
            target.setStringValue(iso3166CountryCode);
        }
    }
    
    /**
     * Sets (as xml) the "iso3166CountryCode" element
     */
    public void xsetIso3166CountryCode(au.gov.asic.types.AddressType.Iso3166CountryCode iso3166CountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Iso3166CountryCode target = null;
            target = (au.gov.asic.types.AddressType.Iso3166CountryCode)get_store().find_element_user(ISO3166COUNTRYCODE$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.Iso3166CountryCode)get_store().add_element_user(ISO3166COUNTRYCODE$6);
            }
            target.set(iso3166CountryCode);
        }
    }
    
    /**
     * Unsets the "iso3166CountryCode" element
     */
    public void unsetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISO3166COUNTRYCODE$6, 0);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public au.gov.asic.types.AddressType.Country xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Country target = null;
            target = (au.gov.asic.types.AddressType.Country)get_store().find_element_user(COUNTRY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$8) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$8);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(au.gov.asic.types.AddressType.Country country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Country target = null;
            target = (au.gov.asic.types.AddressType.Country)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.Country)get_store().add_element_user(COUNTRY$8);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$8, 0);
        }
    }
    
    /**
     * Gets the "DPID" element
     */
    public java.lang.String getDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DPID" element
     */
    public au.gov.asic.types.AddressType.DPID xgetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.DPID target = null;
            target = (au.gov.asic.types.AddressType.DPID)get_store().find_element_user(DPID$10, 0);
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
            return get_store().count_elements(DPID$10) != 0;
        }
    }
    
    /**
     * Sets the "DPID" element
     */
    public void setDPID(java.lang.String dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DPID$10);
            }
            target.setStringValue(dpid);
        }
    }
    
    /**
     * Sets (as xml) the "DPID" element
     */
    public void xsetDPID(au.gov.asic.types.AddressType.DPID dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.DPID target = null;
            target = (au.gov.asic.types.AddressType.DPID)get_store().find_element_user(DPID$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.DPID)get_store().add_element_user(DPID$10);
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
            get_store().remove_element(DPID$10, 0);
        }
    }
    
    /**
     * Gets the "ascotId" element
     */
    public int getAscotId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASCOTID$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ascotId" element
     */
    public au.gov.asic.types.AsicNumericIdType xgetAscotId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(ASCOTID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ascotId" element
     */
    public boolean isSetAscotId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASCOTID$12) != 0;
        }
    }
    
    /**
     * Sets the "ascotId" element
     */
    public void setAscotId(int ascotId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASCOTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASCOTID$12);
            }
            target.setIntValue(ascotId);
        }
    }
    
    /**
     * Sets (as xml) the "ascotId" element
     */
    public void xsetAscotId(au.gov.asic.types.AsicNumericIdType ascotId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(ASCOTID$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(ASCOTID$12);
            }
            target.set(ascotId);
        }
    }
    
    /**
     * Unsets the "ascotId" element
     */
    public void unsetAscotId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASCOTID$12, 0);
        }
    }
    
    /**
     * Gets the "isForeign" element
     */
    public boolean getIsForeign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFOREIGN$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isForeign" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsForeign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFOREIGN$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "isForeign" element
     */
    public boolean isSetIsForeign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFOREIGN$14) != 0;
        }
    }
    
    /**
     * Sets the "isForeign" element
     */
    public void setIsForeign(boolean isForeign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFOREIGN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISFOREIGN$14);
            }
            target.setBooleanValue(isForeign);
        }
    }
    
    /**
     * Sets (as xml) the "isForeign" element
     */
    public void xsetIsForeign(org.apache.xmlbeans.XmlBoolean isForeign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFOREIGN$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISFOREIGN$14);
            }
            target.set(isForeign);
        }
    }
    
    /**
     * Unsets the "isForeign" element
     */
    public void unsetIsForeign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFOREIGN$14, 0);
        }
    }
    
    /**
     * Gets the "isPoBox" element
     */
    public boolean getIsPoBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPOBOX$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPoBox" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPoBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPOBOX$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "isPoBox" element
     */
    public boolean isSetIsPoBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPOBOX$16) != 0;
        }
    }
    
    /**
     * Sets the "isPoBox" element
     */
    public void setIsPoBox(boolean isPoBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPOBOX$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPOBOX$16);
            }
            target.setBooleanValue(isPoBox);
        }
    }
    
    /**
     * Sets (as xml) the "isPoBox" element
     */
    public void xsetIsPoBox(org.apache.xmlbeans.XmlBoolean isPoBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPOBOX$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPOBOX$16);
            }
            target.set(isPoBox);
        }
    }
    
    /**
     * Unsets the "isPoBox" element
     */
    public void unsetIsPoBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPOBOX$16, 0);
        }
    }
    
    /**
     * Gets the "street" element
     */
    public au.gov.asic.types.StreetType getStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StreetType target = null;
            target = (au.gov.asic.types.StreetType)get_store().find_element_user(STREET$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "street" element
     */
    public boolean isSetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREET$18) != 0;
        }
    }
    
    /**
     * Sets the "street" element
     */
    public void setStreet(au.gov.asic.types.StreetType street)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StreetType target = null;
            target = (au.gov.asic.types.StreetType)get_store().find_element_user(STREET$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StreetType)get_store().add_element_user(STREET$18);
            }
            target.set(street);
        }
    }
    
    /**
     * Appends and returns a new empty "street" element
     */
    public au.gov.asic.types.StreetType addNewStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StreetType target = null;
            target = (au.gov.asic.types.StreetType)get_store().add_element_user(STREET$18);
            return target;
        }
    }
    
    /**
     * Unsets the "street" element
     */
    public void unsetStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREET$18, 0);
        }
    }
    
    /**
     * Gets the "locality" element
     */
    public java.lang.String getLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locality" element
     */
    public au.gov.asic.types.AddressType.Locality xgetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Locality target = null;
            target = (au.gov.asic.types.AddressType.Locality)get_store().find_element_user(LOCALITY$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "locality" element
     */
    public boolean isSetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALITY$20) != 0;
        }
    }
    
    /**
     * Sets the "locality" element
     */
    public void setLocality(java.lang.String locality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$20);
            }
            target.setStringValue(locality);
        }
    }
    
    /**
     * Sets (as xml) the "locality" element
     */
    public void xsetLocality(au.gov.asic.types.AddressType.Locality locality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Locality target = null;
            target = (au.gov.asic.types.AddressType.Locality)get_store().find_element_user(LOCALITY$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.Locality)get_store().add_element_user(LOCALITY$20);
            }
            target.set(locality);
        }
    }
    
    /**
     * Unsets the "locality" element
     */
    public void unsetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALITY$20, 0);
        }
    }
    
    /**
     * Gets the "postCode" element
     */
    public java.lang.String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "postCode" element
     */
    public au.gov.asic.types.AddressType.PostCode xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.PostCode target = null;
            target = (au.gov.asic.types.AddressType.PostCode)get_store().find_element_user(POSTCODE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "postCode" element
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCODE$22) != 0;
        }
    }
    
    /**
     * Sets the "postCode" element
     */
    public void setPostCode(java.lang.String postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$22);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "postCode" element
     */
    public void xsetPostCode(au.gov.asic.types.AddressType.PostCode postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.PostCode target = null;
            target = (au.gov.asic.types.AddressType.PostCode)get_store().find_element_user(POSTCODE$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.PostCode)get_store().add_element_user(POSTCODE$22);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Unsets the "postCode" element
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCODE$22, 0);
        }
    }
    
    /**
     * Gets the "state" element
     */
    public au.gov.asic.types.StateTerritoryCodeType.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$24, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" element
     */
    public au.gov.asic.types.StateTerritoryCodeType xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "state" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$24) != 0;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$24);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" element
     */
    public void xsetState(au.gov.asic.types.StateTerritoryCodeType state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$24, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$24);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "state" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$24, 0);
        }
    }
    
    /**
     * Gets the "sequence" element
     */
    public int getSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCE$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sequence" element
     */
    public au.gov.asic.types.AddressType.Sequence xgetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Sequence target = null;
            target = (au.gov.asic.types.AddressType.Sequence)get_store().find_element_user(SEQUENCE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "sequence" element
     */
    public boolean isSetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCE$26) != 0;
        }
    }
    
    /**
     * Sets the "sequence" element
     */
    public void setSequence(int sequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENCE$26);
            }
            target.setIntValue(sequence);
        }
    }
    
    /**
     * Sets (as xml) the "sequence" element
     */
    public void xsetSequence(au.gov.asic.types.AddressType.Sequence sequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Sequence target = null;
            target = (au.gov.asic.types.AddressType.Sequence)get_store().find_element_user(SEQUENCE$26, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.Sequence)get_store().add_element_user(SEQUENCE$26);
            }
            target.set(sequence);
        }
    }
    
    /**
     * Unsets the "sequence" element
     */
    public void unsetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCE$26, 0);
        }
    }
    
    /**
     * Gets the "override" element
     */
    public boolean getOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDE$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "override" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "override" element
     */
    public boolean isSetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDE$28) != 0;
        }
    }
    
    /**
     * Sets the "override" element
     */
    public void setOverride(boolean override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERRIDE$28);
            }
            target.setBooleanValue(override);
        }
    }
    
    /**
     * Sets (as xml) the "override" element
     */
    public void xsetOverride(org.apache.xmlbeans.XmlBoolean override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OVERRIDE$28);
            }
            target.set(override);
        }
    }
    
    /**
     * Unsets the "override" element
     */
    public void unsetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDE$28, 0);
        }
    }
    
    /**
     * Gets the "action" element
     */
    public au.gov.asic.types.AddressType.Action.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$30, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.AddressType.Action.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" element
     */
    public au.gov.asic.types.AddressType.Action xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Action target = null;
            target = (au.gov.asic.types.AddressType.Action)get_store().find_element_user(ACTION$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "action" element
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTION$30) != 0;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(au.gov.asic.types.AddressType.Action.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$30);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" element
     */
    public void xsetAction(au.gov.asic.types.AddressType.Action action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType.Action target = null;
            target = (au.gov.asic.types.AddressType.Action)get_store().find_element_user(ACTION$30, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType.Action)get_store().add_element_user(ACTION$30);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" element
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTION$30, 0);
        }
    }
    
    /**
     * Gets the "startDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "startDate" element
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATE$32) != 0;
        }
    }
    
    /**
     * Sets the "startDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$32);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" element
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$32);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Unsets the "startDate" element
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATE$32, 0);
        }
    }
    
    /**
     * Gets the "endDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "endDate" element
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATE$34) != 0;
        }
    }
    
    /**
     * Sets the "endDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$34);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "endDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$34);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Unsets the "endDate" element
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATE$34, 0);
        }
    }
    
    /**
     * Gets the "documentNumber" element
     */
    public java.lang.String getDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentNumber" element
     */
    public au.gov.asic.types.DocumentNoType xgetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentNoType target = null;
            target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(DOCUMENTNUMBER$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentNumber" element
     */
    public boolean isSetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTNUMBER$36) != 0;
        }
    }
    
    /**
     * Sets the "documentNumber" element
     */
    public void setDocumentNumber(java.lang.String documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$36);
            }
            target.setStringValue(documentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "documentNumber" element
     */
    public void xsetDocumentNumber(au.gov.asic.types.DocumentNoType documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentNoType target = null;
            target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(DOCUMENTNUMBER$36, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DocumentNoType)get_store().add_element_user(DOCUMENTNUMBER$36);
            }
            target.set(documentNumber);
        }
    }
    
    /**
     * Unsets the "documentNumber" element
     */
    public void unsetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTNUMBER$36, 0);
        }
    }
    /**
     * An XML careOf(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$CareOf.
     */
    public static class CareOfImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.CareOf
    {
        
        public CareOfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CareOfImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML addressLine(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$AddressLine.
     */
    public static class AddressLineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.AddressLine
    {
        
        public AddressLineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AddressLineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML iso3166CountryCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$Iso3166CountryCode.
     */
    public static class Iso3166CountryCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.Iso3166CountryCode
    {
        
        public Iso3166CountryCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Iso3166CountryCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML country(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$Country.
     */
    public static class CountryImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.Country
    {
        
        public CountryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CountryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML DPID(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$DPID.
     */
    public static class DPIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.DPID
    {
        
        public DPIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DPIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML locality(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$Locality.
     */
    public static class LocalityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.Locality
    {
        
        public LocalityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LocalityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML postCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$PostCode.
     */
    public static class PostCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressType.PostCode
    {
        
        public PostCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PostCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML sequence(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$Sequence.
     */
    public static class SequenceImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements au.gov.asic.types.AddressType.Sequence
    {
        
        public SequenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SequenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML action(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressType$Action.
     */
    public static class ActionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.AddressType.Action
    {
        
        public ActionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ActionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
