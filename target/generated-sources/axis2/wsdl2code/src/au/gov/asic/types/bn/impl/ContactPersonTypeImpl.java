/*
 * XML Type:  contactPersonType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.ContactPersonType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML contactPersonType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ContactPersonTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.ContactPersonType
{
    
    public ContactPersonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName PHONENUMBER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "phoneNumber");
    private static final javax.xml.namespace.QName EMAILADDRESS$4 = 
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
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
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
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "phoneNumber" element
     */
    public au.gov.asic.types.TelephoneNumberType getPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(PHONENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "phoneNumber" element
     */
    public boolean isNilPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(PHONENUMBER$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "phoneNumber" element
     */
    public void setPhoneNumber(au.gov.asic.types.TelephoneNumberType phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(PHONENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(PHONENUMBER$2);
            }
            target.set(phoneNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "phoneNumber" element
     */
    public au.gov.asic.types.TelephoneNumberType addNewPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(PHONENUMBER$2);
            return target;
        }
    }
    
    /**
     * Nils the "phoneNumber" element
     */
    public void setNilPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(PHONENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(PHONENUMBER$2);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$4, 0);
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
    public au.gov.asic.types.bn.ContactPersonType.EmailAddress xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.ContactPersonType.EmailAddress target = null;
            target = (au.gov.asic.types.bn.ContactPersonType.EmailAddress)get_store().find_element_user(EMAILADDRESS$4, 0);
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
            return get_store().count_elements(EMAILADDRESS$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$4);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    public void xsetEmailAddress(au.gov.asic.types.bn.ContactPersonType.EmailAddress emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.ContactPersonType.EmailAddress target = null;
            target = (au.gov.asic.types.bn.ContactPersonType.EmailAddress)get_store().find_element_user(EMAILADDRESS$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.ContactPersonType.EmailAddress)get_store().add_element_user(EMAILADDRESS$4);
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
            get_store().remove_element(EMAILADDRESS$4, 0);
        }
    }
    /**
     * An XML emailAddress(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.ContactPersonType$EmailAddress.
     */
    public static class EmailAddressImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.ContactPersonType.EmailAddress
    {
        
        public EmailAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EmailAddressImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
