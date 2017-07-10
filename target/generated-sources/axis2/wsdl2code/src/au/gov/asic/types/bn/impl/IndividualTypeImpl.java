/*
 * XML Type:  individualType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.IndividualType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML individualType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class IndividualTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.IndividualType
{
    
    public IndividualTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName PREVIOUSNAME$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "previousName");
    private static final javax.xml.namespace.QName BIRTHDETAILS$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "birthDetails");
    private static final javax.xml.namespace.QName ADDRESS$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName EMAILADDRESS$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName CHANGEOFINDIVIDUAL$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "changeOfIndividual");
    private static final javax.xml.namespace.QName STARTDATE$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$14 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "endDate");
    
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.PersonNameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(au.gov.asic.types.PersonNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public au.gov.asic.types.PersonNameType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "previousName" element
     */
    public au.gov.asic.types.PersonNameType getPreviousName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(PREVIOUSNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "previousName" element
     */
    public boolean isSetPreviousName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "previousName" element
     */
    public void setPreviousName(au.gov.asic.types.PersonNameType previousName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(PREVIOUSNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(PREVIOUSNAME$2);
            }
            target.set(previousName);
        }
    }
    
    /**
     * Appends and returns a new empty "previousName" element
     */
    public au.gov.asic.types.PersonNameType addNewPreviousName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(PREVIOUSNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "previousName" element
     */
    public void unsetPreviousName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSNAME$2, 0);
        }
    }
    
    /**
     * Gets the "birthDetails" element
     */
    public au.gov.asic.types.BirthDetailsType getBirthDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsType target = null;
            target = (au.gov.asic.types.BirthDetailsType)get_store().find_element_user(BIRTHDETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthDetails" element
     */
    public boolean isSetBirthDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHDETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "birthDetails" element
     */
    public void setBirthDetails(au.gov.asic.types.BirthDetailsType birthDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsType target = null;
            target = (au.gov.asic.types.BirthDetailsType)get_store().find_element_user(BIRTHDETAILS$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BirthDetailsType)get_store().add_element_user(BIRTHDETAILS$4);
            }
            target.set(birthDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "birthDetails" element
     */
    public au.gov.asic.types.BirthDetailsType addNewBirthDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsType target = null;
            target = (au.gov.asic.types.BirthDetailsType)get_store().add_element_user(BIRTHDETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "birthDetails" element
     */
    public void unsetBirthDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHDETAILS$4, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public au.gov.asic.types.AddressExtType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().find_element_user(ADDRESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$6) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(au.gov.asic.types.AddressExtType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().find_element_user(ADDRESS$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressExtType)get_store().add_element_user(ADDRESS$6);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public au.gov.asic.types.AddressExtType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().add_element_user(ADDRESS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$8, 0);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "emailAddress" element
     */
    public boolean isNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "emailAddress" element
     */
    public boolean isSetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$8);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$8);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Nils the "emailAddress" element
     */
    public void setNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "emailAddress" element
     */
    public void unsetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS$8, 0);
        }
    }
    
    /**
     * Gets the "changeOfIndividual" element
     */
    public boolean getChangeOfIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEOFINDIVIDUAL$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "changeOfIndividual" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetChangeOfIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGEOFINDIVIDUAL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "changeOfIndividual" element
     */
    public boolean isSetChangeOfIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGEOFINDIVIDUAL$10) != 0;
        }
    }
    
    /**
     * Sets the "changeOfIndividual" element
     */
    public void setChangeOfIndividual(boolean changeOfIndividual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEOFINDIVIDUAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEOFINDIVIDUAL$10);
            }
            target.setBooleanValue(changeOfIndividual);
        }
    }
    
    /**
     * Sets (as xml) the "changeOfIndividual" element
     */
    public void xsetChangeOfIndividual(org.apache.xmlbeans.XmlBoolean changeOfIndividual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGEOFINDIVIDUAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CHANGEOFINDIVIDUAL$10);
            }
            target.set(changeOfIndividual);
        }
    }
    
    /**
     * Unsets the "changeOfIndividual" element
     */
    public void unsetChangeOfIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGEOFINDIVIDUAL$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$12, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$12, 0);
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
            return get_store().count_elements(STARTDATE$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$12);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$12);
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
            get_store().remove_element(STARTDATE$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$14, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$14, 0);
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
            return get_store().count_elements(ENDDATE$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$14);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$14);
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
            get_store().remove_element(ENDDATE$14, 0);
        }
    }
}
