/*
 * XML Type:  individualLodgeType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.IndividualLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML individualLodgeType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class IndividualLodgeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.IndividualLodgeType
{
    
    public IndividualLodgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName BIRTHDETAILS$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "birthDetails");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName EMAILADDRESS$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.PersonNameLodgeType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameLodgeType target = null;
            target = (au.gov.asic.types.PersonNameLodgeType)get_store().find_element_user(NAME$0, 0);
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
    public void setName(au.gov.asic.types.PersonNameLodgeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameLodgeType target = null;
            target = (au.gov.asic.types.PersonNameLodgeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameLodgeType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public au.gov.asic.types.PersonNameLodgeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameLodgeType target = null;
            target = (au.gov.asic.types.PersonNameLodgeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "birthDetails" element
     */
    public au.gov.asic.types.BirthDetailsLodgeType getBirthDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsLodgeType target = null;
            target = (au.gov.asic.types.BirthDetailsLodgeType)get_store().find_element_user(BIRTHDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "birthDetails" element
     */
    public void setBirthDetails(au.gov.asic.types.BirthDetailsLodgeType birthDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsLodgeType target = null;
            target = (au.gov.asic.types.BirthDetailsLodgeType)get_store().find_element_user(BIRTHDETAILS$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BirthDetailsLodgeType)get_store().add_element_user(BIRTHDETAILS$2);
            }
            target.set(birthDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "birthDetails" element
     */
    public au.gov.asic.types.BirthDetailsLodgeType addNewBirthDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BirthDetailsLodgeType target = null;
            target = (au.gov.asic.types.BirthDetailsLodgeType)get_store().add_element_user(BIRTHDETAILS$2);
            return target;
        }
    }
    
    /**
     * Gets the "address" element
     */
    public au.gov.asic.types.AddressLodgeType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().find_element_user(ADDRESS$4, 0);
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
            return get_store().count_elements(ADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(au.gov.asic.types.AddressLodgeType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressLodgeType)get_store().add_element_user(ADDRESS$4);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public au.gov.asic.types.AddressLodgeType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType target = null;
            target = (au.gov.asic.types.AddressLodgeType)get_store().add_element_user(ADDRESS$4);
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
            get_store().remove_element(ADDRESS$4, 0);
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
     * Tests for nil "emailAddress" element
     */
    public boolean isNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$6, 0);
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
            return get_store().count_elements(EMAILADDRESS$6) != 0;
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
    
    /**
     * Nils the "emailAddress" element
     */
    public void setNilEmailAddress()
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
            get_store().remove_element(EMAILADDRESS$6, 0);
        }
    }
}
