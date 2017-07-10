/*
 * XML Type:  birthDetailsLodgeType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.BirthDetailsLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML birthDetailsLodgeType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BirthDetailsLodgeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.BirthDetailsLodgeType
{
    
    public BirthDetailsLodgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "date");
    private static final javax.xml.namespace.QName CITYTOWN$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "cityTown");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "state");
    private static final javax.xml.namespace.QName COUNTRYOFBIRTH$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "countryOfBirth");
    
    
    /**
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlDate xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlDate date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
    
    /**
     * Gets the "cityTown" element
     */
    public java.lang.String getCityTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYTOWN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cityTown" element
     */
    public org.apache.xmlbeans.XmlString xgetCityTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYTOWN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "cityTown" element
     */
    public boolean isSetCityTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITYTOWN$2) != 0;
        }
    }
    
    /**
     * Sets the "cityTown" element
     */
    public void setCityTown(java.lang.String cityTown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYTOWN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYTOWN$2);
            }
            target.setStringValue(cityTown);
        }
    }
    
    /**
     * Sets (as xml) the "cityTown" element
     */
    public void xsetCityTown(org.apache.xmlbeans.XmlString cityTown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYTOWN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYTOWN$2);
            }
            target.set(cityTown);
        }
    }
    
    /**
     * Unsets the "cityTown" element
     */
    public void unsetCityTown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITYTOWN$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
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
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$4, 0);
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
            return get_store().count_elements(STATE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
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
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$4);
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
            get_store().remove_element(STATE$4, 0);
        }
    }
    
    /**
     * Gets the "countryOfBirth" element
     */
    public java.lang.String getCountryOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYOFBIRTH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryOfBirth" element
     */
    public au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth xgetCountryOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth target = null;
            target = (au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth)get_store().find_element_user(COUNTRYOFBIRTH$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "countryOfBirth" element
     */
    public void setCountryOfBirth(java.lang.String countryOfBirth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYOFBIRTH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYOFBIRTH$6);
            }
            target.setStringValue(countryOfBirth);
        }
    }
    
    /**
     * Sets (as xml) the "countryOfBirth" element
     */
    public void xsetCountryOfBirth(au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth countryOfBirth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth target = null;
            target = (au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth)get_store().find_element_user(COUNTRYOFBIRTH$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth)get_store().add_element_user(COUNTRYOFBIRTH$6);
            }
            target.set(countryOfBirth);
        }
    }
    /**
     * An XML countryOfBirth(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsLodgeType$CountryOfBirth.
     */
    public static class CountryOfBirthImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.BirthDetailsLodgeType.CountryOfBirth
    {
        
        public CountryOfBirthImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CountryOfBirthImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
