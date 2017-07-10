/*
 * XML Type:  addressExtType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AddressExtType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML addressExtType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AddressExtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AddressExtType
{
    
    public AddressExtTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName STREET$12 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "street");
    private static final javax.xml.namespace.QName LOCALITY$14 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "locality");
    private static final javax.xml.namespace.QName POSTCODE$16 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "postCode");
    private static final javax.xml.namespace.QName STATE$18 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "state");
    private static final javax.xml.namespace.QName OVERRIDE$20 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "override");
    private static final javax.xml.namespace.QName ACTION$22 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "action");
    private static final javax.xml.namespace.QName STARTDATE$24 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$26 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "endDate");
    
    
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
    public au.gov.asic.types.AddressExtType.CareOf xgetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.CareOf target = null;
            target = (au.gov.asic.types.AddressExtType.CareOf)get_store().find_element_user(CAREOF$2, 0);
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
    public void xsetCareOf(au.gov.asic.types.AddressExtType.CareOf careOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.CareOf target = null;
            target = (au.gov.asic.types.AddressExtType.CareOf)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType.CareOf)get_store().add_element_user(CAREOF$2);
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
    public org.apache.xmlbeans.XmlString[] xgetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSLINE$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "addressLine" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
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
    public void xsetAddressLineArray(org.apache.xmlbeans.XmlString[]addressLineArray)
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
    public void xsetAddressLineArray(int i, org.apache.xmlbeans.XmlString addressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE$4, i);
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
    public org.apache.xmlbeans.XmlString insertNewAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ADDRESSLINE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addressLine" element
     */
    public org.apache.xmlbeans.XmlString addNewAddressLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE$4);
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
    public au.gov.asic.types.AddressExtType.Iso3166CountryCode xgetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.Iso3166CountryCode target = null;
            target = (au.gov.asic.types.AddressExtType.Iso3166CountryCode)get_store().find_element_user(ISO3166COUNTRYCODE$6, 0);
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
    public void xsetIso3166CountryCode(au.gov.asic.types.AddressExtType.Iso3166CountryCode iso3166CountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.Iso3166CountryCode target = null;
            target = (au.gov.asic.types.AddressExtType.Iso3166CountryCode)get_store().find_element_user(ISO3166COUNTRYCODE$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType.Iso3166CountryCode)get_store().add_element_user(ISO3166COUNTRYCODE$6);
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
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
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
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$8);
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
    public au.gov.asic.types.AddressExtType.DPID xgetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.DPID target = null;
            target = (au.gov.asic.types.AddressExtType.DPID)get_store().find_element_user(DPID$10, 0);
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
    public void xsetDPID(au.gov.asic.types.AddressExtType.DPID dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.DPID target = null;
            target = (au.gov.asic.types.AddressExtType.DPID)get_store().find_element_user(DPID$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType.DPID)get_store().add_element_user(DPID$10);
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
     * Gets the "street" element
     */
    public au.gov.asic.types.StreetType getStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StreetType target = null;
            target = (au.gov.asic.types.StreetType)get_store().find_element_user(STREET$12, 0);
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
            return get_store().count_elements(STREET$12) != 0;
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
            target = (au.gov.asic.types.StreetType)get_store().find_element_user(STREET$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StreetType)get_store().add_element_user(STREET$12);
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
            target = (au.gov.asic.types.StreetType)get_store().add_element_user(STREET$12);
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
            get_store().remove_element(STREET$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$14, 0);
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
    public au.gov.asic.types.AddressExtType.Locality xgetLocality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.Locality target = null;
            target = (au.gov.asic.types.AddressExtType.Locality)get_store().find_element_user(LOCALITY$14, 0);
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
            return get_store().count_elements(LOCALITY$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$14);
            }
            target.setStringValue(locality);
        }
    }
    
    /**
     * Sets (as xml) the "locality" element
     */
    public void xsetLocality(au.gov.asic.types.AddressExtType.Locality locality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.Locality target = null;
            target = (au.gov.asic.types.AddressExtType.Locality)get_store().find_element_user(LOCALITY$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType.Locality)get_store().add_element_user(LOCALITY$14);
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
            get_store().remove_element(LOCALITY$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$16, 0);
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
    public au.gov.asic.types.AddressExtType.PostCode xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.PostCode target = null;
            target = (au.gov.asic.types.AddressExtType.PostCode)get_store().find_element_user(POSTCODE$16, 0);
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
            return get_store().count_elements(POSTCODE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$16);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "postCode" element
     */
    public void xsetPostCode(au.gov.asic.types.AddressExtType.PostCode postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.PostCode target = null;
            target = (au.gov.asic.types.AddressExtType.PostCode)get_store().find_element_user(POSTCODE$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType.PostCode)get_store().add_element_user(POSTCODE$16);
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
            get_store().remove_element(POSTCODE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$18, 0);
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
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$18, 0);
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
            return get_store().count_elements(STATE$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$18);
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
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$18);
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
            get_store().remove_element(STATE$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDE$20, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDE$20, 0);
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
            return get_store().count_elements(OVERRIDE$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERRIDE$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OVERRIDE$20);
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
            get_store().remove_element(OVERRIDE$20, 0);
        }
    }
    
    /**
     * Gets the "action" element
     */
    public au.gov.asic.types.AddressExtType.Action.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.AddressExtType.Action.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" element
     */
    public au.gov.asic.types.AddressExtType.Action xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.Action target = null;
            target = (au.gov.asic.types.AddressExtType.Action)get_store().find_element_user(ACTION$22, 0);
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
            return get_store().count_elements(ACTION$22) != 0;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(au.gov.asic.types.AddressExtType.Action.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$22);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" element
     */
    public void xsetAction(au.gov.asic.types.AddressExtType.Action action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType.Action target = null;
            target = (au.gov.asic.types.AddressExtType.Action)get_store().find_element_user(ACTION$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType.Action)get_store().add_element_user(ACTION$22);
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
            get_store().remove_element(ACTION$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$24, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$24, 0);
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
            return get_store().count_elements(STARTDATE$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$24);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$24);
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
            get_store().remove_element(STARTDATE$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$26, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$26, 0);
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
            return get_store().count_elements(ENDDATE$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$26);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$26);
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
            get_store().remove_element(ENDDATE$26, 0);
        }
    }
    /**
     * An XML careOf(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$CareOf.
     */
    public static class CareOfImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressExtType.CareOf
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
     * An XML iso3166CountryCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$Iso3166CountryCode.
     */
    public static class Iso3166CountryCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressExtType.Iso3166CountryCode
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
     * An XML DPID(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$DPID.
     */
    public static class DPIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressExtType.DPID
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
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$Locality.
     */
    public static class LocalityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressExtType.Locality
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
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$PostCode.
     */
    public static class PostCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressExtType.PostCode
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
     * An XML action(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$Action.
     */
    public static class ActionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.AddressExtType.Action
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
