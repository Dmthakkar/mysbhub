/*
 * XML Type:  organisationLodgeType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.OrganisationLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML organisationLodgeType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OrganisationLodgeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.OrganisationLodgeType
{
    
    public OrganisationLodgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName ACN$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "acn");
    private static final javax.xml.namespace.QName ORGNUMBER$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "orgNumber");
    private static final javax.xml.namespace.QName ADDRESS$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName EMAILADDRESS$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName STARTDATE$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "endDate");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public au.gov.asic.types.bn.OrganisationLodgeType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationLodgeType.Name target = null;
            target = (au.gov.asic.types.bn.OrganisationLodgeType.Name)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.bn.OrganisationLodgeType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationLodgeType.Name target = null;
            target = (au.gov.asic.types.bn.OrganisationLodgeType.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OrganisationLodgeType.Name)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "acn" element
     */
    public int getAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACN$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "acn" element
     */
    public au.gov.asic.types.NniNumberType xgetAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(ACN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "acn" element
     */
    public boolean isSetAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACN$2) != 0;
        }
    }
    
    /**
     * Sets the "acn" element
     */
    public void setAcn(int acn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACN$2);
            }
            target.setIntValue(acn);
        }
    }
    
    /**
     * Sets (as xml) the "acn" element
     */
    public void xsetAcn(au.gov.asic.types.NniNumberType acn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(ACN$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(ACN$2);
            }
            target.set(acn);
        }
    }
    
    /**
     * Unsets the "acn" element
     */
    public void unsetAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACN$2, 0);
        }
    }
    
    /**
     * Gets the "orgNumber" element
     */
    public java.lang.String getOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orgNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "orgNumber" element
     */
    public boolean isSetOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "orgNumber" element
     */
    public void setOrgNumber(java.lang.String orgNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGNUMBER$4);
            }
            target.setStringValue(orgNumber);
        }
    }
    
    /**
     * Sets (as xml) the "orgNumber" element
     */
    public void xsetOrgNumber(org.apache.xmlbeans.XmlString orgNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGNUMBER$4);
            }
            target.set(orgNumber);
        }
    }
    
    /**
     * Unsets the "orgNumber" element
     */
    public void unsetOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGNUMBER$4, 0);
        }
    }
    
    /**
     * Gets array of all "address" elements
     */
    public au.gov.asic.types.AddressLodgeType[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$6, targetList);
            au.gov.asic.types.AddressLodgeType[] result = new au.gov.asic.types.AddressLodgeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "address" element
     */
    public au.gov.asic.types.AddressLodgeType getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().find_element_user(ADDRESS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "address" element
     */
    public int sizeOfAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$6);
        }
    }
    
    /**
     * Sets array of all "address" element
     */
    public void setAddressArray(au.gov.asic.types.AddressLodgeType[] addressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$6);
        }
    }
    
    /**
     * Sets ith "address" element
     */
    public void setAddressArray(int i, au.gov.asic.types.AddressLodgeType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().find_element_user(ADDRESS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(address);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    public au.gov.asic.types.AddressLodgeType insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().insert_element_user(ADDRESS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    public au.gov.asic.types.AddressLodgeType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().add_element_user(ADDRESS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "address" element
     */
    public void removeAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$6, i);
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
     * Gets the "startDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$10, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$10, 0);
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
            return get_store().count_elements(STARTDATE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$10);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$10);
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
            get_store().remove_element(STARTDATE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$12, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$12, 0);
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
            return get_store().count_elements(ENDDATE$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$12);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$12);
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
            get_store().remove_element(ENDDATE$12, 0);
        }
    }
    /**
     * An XML name(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.OrganisationLodgeType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.OrganisationLodgeType.Name
    {
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
