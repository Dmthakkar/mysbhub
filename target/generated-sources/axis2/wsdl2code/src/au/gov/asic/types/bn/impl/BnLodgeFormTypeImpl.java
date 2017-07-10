/*
 * XML Type:  bnLodgeFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnLodgeFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnLodgeFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnLodgeFormTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnLodgeFormType
{
    
    public BnLodgeFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName TERM$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "term");
    private static final javax.xml.namespace.QName DATERENEWAL$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateRenewal");
    private static final javax.xml.namespace.QName ADDRESS$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName EMAILADDRESS$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName SMSNUMBER$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "smsNumber");
    private static final javax.xml.namespace.QName BUSINESSENTITY$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessEntity");
    private static final javax.xml.namespace.QName TRANSFERKEY$14 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "transferKey");
    private static final javax.xml.namespace.QName CONTACT$16 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "contact");
    private static final javax.xml.namespace.QName SIGNATORY$18 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "signatory");
    
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.DistinguishedNameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(NAME$0, 0);
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
    public void setName(au.gov.asic.types.DistinguishedNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public au.gov.asic.types.DistinguishedNameType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "term" element
     */
    public au.gov.asic.types.bn.TermType.Enum getTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$2, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.TermType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "term" element
     */
    public au.gov.asic.types.bn.TermType xgetTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.TermType target = null;
            target = (au.gov.asic.types.bn.TermType)get_store().find_element_user(TERM$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "term" element
     */
    public void setTerm(au.gov.asic.types.bn.TermType.Enum term)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$2);
            }
            target.setEnumValue(term);
        }
    }
    
    /**
     * Sets (as xml) the "term" element
     */
    public void xsetTerm(au.gov.asic.types.bn.TermType term)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.TermType target = null;
            target = (au.gov.asic.types.bn.TermType)get_store().find_element_user(TERM$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.TermType)get_store().add_element_user(TERM$2);
            }
            target.set(term);
        }
    }
    
    /**
     * Gets the "dateRenewal" element
     */
    public java.util.Calendar getDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateRenewal" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateRenewal" element
     */
    public boolean isSetDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATERENEWAL$4) != 0;
        }
    }
    
    /**
     * Sets the "dateRenewal" element
     */
    public void setDateRenewal(java.util.Calendar dateRenewal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERENEWAL$4);
            }
            target.setCalendarValue(dateRenewal);
        }
    }
    
    /**
     * Sets (as xml) the "dateRenewal" element
     */
    public void xsetDateRenewal(org.apache.xmlbeans.XmlDate dateRenewal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERENEWAL$4);
            }
            target.set(dateRenewal);
        }
    }
    
    /**
     * Unsets the "dateRenewal" element
     */
    public void unsetDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATERENEWAL$4, 0);
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
     * Gets the "smsNumber" element
     */
    public java.lang.String getSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSNUMBER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "smsNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMSNUMBER$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "smsNumber" element
     */
    public boolean isNilSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMSNUMBER$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "smsNumber" element
     */
    public boolean isSetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMSNUMBER$10) != 0;
        }
    }
    
    /**
     * Sets the "smsNumber" element
     */
    public void setSmsNumber(java.lang.String smsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMSNUMBER$10);
            }
            target.setStringValue(smsNumber);
        }
    }
    
    /**
     * Sets (as xml) the "smsNumber" element
     */
    public void xsetSmsNumber(org.apache.xmlbeans.XmlString smsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMSNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SMSNUMBER$10);
            }
            target.set(smsNumber);
        }
    }
    
    /**
     * Nils the "smsNumber" element
     */
    public void setNilSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMSNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SMSNUMBER$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "smsNumber" element
     */
    public void unsetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMSNUMBER$10, 0);
        }
    }
    
    /**
     * Gets the "businessEntity" element
     */
    public au.gov.asic.types.bn.BusinessEntityLodgeType getBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityLodgeType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityLodgeType)get_store().find_element_user(BUSINESSENTITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessEntity" element
     */
    public boolean isSetBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSENTITY$12) != 0;
        }
    }
    
    /**
     * Sets the "businessEntity" element
     */
    public void setBusinessEntity(au.gov.asic.types.bn.BusinessEntityLodgeType businessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityLodgeType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityLodgeType)get_store().find_element_user(BUSINESSENTITY$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BusinessEntityLodgeType)get_store().add_element_user(BUSINESSENTITY$12);
            }
            target.set(businessEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "businessEntity" element
     */
    public au.gov.asic.types.bn.BusinessEntityLodgeType addNewBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityLodgeType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityLodgeType)get_store().add_element_user(BUSINESSENTITY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "businessEntity" element
     */
    public void unsetBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSENTITY$12, 0);
        }
    }
    
    /**
     * Gets the "transferKey" element
     */
    public java.lang.String getTransferKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERKEY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transferKey" element
     */
    public org.apache.xmlbeans.XmlString xgetTransferKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFERKEY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "transferKey" element
     */
    public boolean isSetTransferKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFERKEY$14) != 0;
        }
    }
    
    /**
     * Sets the "transferKey" element
     */
    public void setTransferKey(java.lang.String transferKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFERKEY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFERKEY$14);
            }
            target.setStringValue(transferKey);
        }
    }
    
    /**
     * Sets (as xml) the "transferKey" element
     */
    public void xsetTransferKey(org.apache.xmlbeans.XmlString transferKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFERKEY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSFERKEY$14);
            }
            target.set(transferKey);
        }
    }
    
    /**
     * Unsets the "transferKey" element
     */
    public void unsetTransferKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFERKEY$14, 0);
        }
    }
    
    /**
     * Gets the "contact" element
     */
    public au.gov.asic.types.bn.ContactPersonType getContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.ContactPersonType target = null;
            target = (au.gov.asic.types.bn.ContactPersonType)get_store().find_element_user(CONTACT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contact" element
     */
    public boolean isSetContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACT$16) != 0;
        }
    }
    
    /**
     * Sets the "contact" element
     */
    public void setContact(au.gov.asic.types.bn.ContactPersonType contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.ContactPersonType target = null;
            target = (au.gov.asic.types.bn.ContactPersonType)get_store().find_element_user(CONTACT$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.ContactPersonType)get_store().add_element_user(CONTACT$16);
            }
            target.set(contact);
        }
    }
    
    /**
     * Appends and returns a new empty "contact" element
     */
    public au.gov.asic.types.bn.ContactPersonType addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.ContactPersonType target = null;
            target = (au.gov.asic.types.bn.ContactPersonType)get_store().add_element_user(CONTACT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "contact" element
     */
    public void unsetContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACT$16, 0);
        }
    }
    
    /**
     * Gets the "signatory" element
     */
    public au.gov.asic.types.SignatoryType getSignatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType target = null;
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signatory" element
     */
    public void setSignatory(au.gov.asic.types.SignatoryType signatory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType target = null;
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$18);
            }
            target.set(signatory);
        }
    }
    
    /**
     * Appends and returns a new empty "signatory" element
     */
    public au.gov.asic.types.SignatoryType addNewSignatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType target = null;
            target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$18);
            return target;
        }
    }
}
