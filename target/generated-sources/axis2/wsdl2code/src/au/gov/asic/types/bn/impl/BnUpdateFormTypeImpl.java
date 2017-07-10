/*
 * XML Type:  bnUpdateFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnUpdateFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnUpdateFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnUpdateFormTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnUpdateFormType
{
    
    public BnUpdateFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "number");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName TERM$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "term");
    private static final javax.xml.namespace.QName DATEREGISTERED$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateRegistered");
    private static final javax.xml.namespace.QName DATERENEWAL$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateRenewal");
    private static final javax.xml.namespace.QName ADDRESS$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName EMAILADDRESS$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName SMSNUMBER$14 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "smsNumber");
    private static final javax.xml.namespace.QName REPRESENTATIVE$16 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "representative");
    private static final javax.xml.namespace.QName BUSINESSENTITY$18 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessEntity");
    private static final javax.xml.namespace.QName SIGNATORY$20 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "signatory");
    
    
    /**
     * Gets the "number" element
     */
    public au.gov.asic.types.bn.BnIdentifier getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnIdentifier target = null;
            target = (au.gov.asic.types.bn.BnIdentifier)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(au.gov.asic.types.bn.BnIdentifier number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnIdentifier target = null;
            target = (au.gov.asic.types.bn.BnIdentifier)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnIdentifier)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Appends and returns a new empty "number" element
     */
    public au.gov.asic.types.bn.BnIdentifier addNewNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnIdentifier target = null;
            target = (au.gov.asic.types.bn.BnIdentifier)get_store().add_element_user(NUMBER$0);
            return target;
        }
    }
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.DistinguishedNameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(NAME$2, 0);
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
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(NAME$2);
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
            target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$4, 0);
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
            target = (au.gov.asic.types.bn.TermType)get_store().find_element_user(TERM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "term" element
     */
    public boolean isSetTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERM$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$4);
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
            target = (au.gov.asic.types.bn.TermType)get_store().find_element_user(TERM$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.TermType)get_store().add_element_user(TERM$4);
            }
            target.set(term);
        }
    }
    
    /**
     * Unsets the "term" element
     */
    public void unsetTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERM$4, 0);
        }
    }
    
    /**
     * Gets the "dateRegistered" element
     */
    public java.util.Calendar getDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateRegistered" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateRegistered" element
     */
    public boolean isSetDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEREGISTERED$6) != 0;
        }
    }
    
    /**
     * Sets the "dateRegistered" element
     */
    public void setDateRegistered(java.util.Calendar dateRegistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREGISTERED$6);
            }
            target.setCalendarValue(dateRegistered);
        }
    }
    
    /**
     * Sets (as xml) the "dateRegistered" element
     */
    public void xsetDateRegistered(org.apache.xmlbeans.XmlDate dateRegistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREGISTERED$6);
            }
            target.set(dateRegistered);
        }
    }
    
    /**
     * Unsets the "dateRegistered" element
     */
    public void unsetDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEREGISTERED$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$8, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$8, 0);
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
            return get_store().count_elements(DATERENEWAL$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERENEWAL$8);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERENEWAL$8);
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
            get_store().remove_element(DATERENEWAL$8, 0);
        }
    }
    
    /**
     * Gets array of all "address" elements
     */
    public au.gov.asic.types.AddressType[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$10, targetList);
            au.gov.asic.types.AddressType[] result = new au.gov.asic.types.AddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "address" element
     */
    public au.gov.asic.types.AddressType getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$10, i);
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
            return get_store().count_elements(ADDRESS$10);
        }
    }
    
    /**
     * Sets array of all "address" element
     */
    public void setAddressArray(au.gov.asic.types.AddressType[] addressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$10);
        }
    }
    
    /**
     * Sets ith "address" element
     */
    public void setAddressArray(int i, au.gov.asic.types.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$10, i);
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
    public au.gov.asic.types.AddressType insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().insert_element_user(ADDRESS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    public au.gov.asic.types.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$10);
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
            get_store().remove_element(ADDRESS$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$12, 0);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
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
            return get_store().count_elements(EMAILADDRESS$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$12);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$12);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$12);
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
            get_store().remove_element(EMAILADDRESS$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSNUMBER$14, 0);
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
    public au.gov.asic.types.bn.BnUpdateFormType.SmsNumber xgetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnUpdateFormType.SmsNumber target = null;
            target = (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber)get_store().find_element_user(SMSNUMBER$14, 0);
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
            au.gov.asic.types.bn.BnUpdateFormType.SmsNumber target = null;
            target = (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber)get_store().find_element_user(SMSNUMBER$14, 0);
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
            return get_store().count_elements(SMSNUMBER$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSNUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMSNUMBER$14);
            }
            target.setStringValue(smsNumber);
        }
    }
    
    /**
     * Sets (as xml) the "smsNumber" element
     */
    public void xsetSmsNumber(au.gov.asic.types.bn.BnUpdateFormType.SmsNumber smsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnUpdateFormType.SmsNumber target = null;
            target = (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber)get_store().find_element_user(SMSNUMBER$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber)get_store().add_element_user(SMSNUMBER$14);
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
            au.gov.asic.types.bn.BnUpdateFormType.SmsNumber target = null;
            target = (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber)get_store().find_element_user(SMSNUMBER$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber)get_store().add_element_user(SMSNUMBER$14);
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
            get_store().remove_element(SMSNUMBER$14, 0);
        }
    }
    
    /**
     * Gets array of all "representative" elements
     */
    public au.gov.asic.types.bn.RepresentativeType[] getRepresentativeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPRESENTATIVE$16, targetList);
            au.gov.asic.types.bn.RepresentativeType[] result = new au.gov.asic.types.bn.RepresentativeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "representative" element
     */
    public au.gov.asic.types.bn.RepresentativeType getRepresentativeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().find_element_user(REPRESENTATIVE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "representative" element
     */
    public int sizeOfRepresentativeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIVE$16);
        }
    }
    
    /**
     * Sets array of all "representative" element
     */
    public void setRepresentativeArray(au.gov.asic.types.bn.RepresentativeType[] representativeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(representativeArray, REPRESENTATIVE$16);
        }
    }
    
    /**
     * Sets ith "representative" element
     */
    public void setRepresentativeArray(int i, au.gov.asic.types.bn.RepresentativeType representative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().find_element_user(REPRESENTATIVE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representative);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representative" element
     */
    public au.gov.asic.types.bn.RepresentativeType insertNewRepresentative(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().insert_element_user(REPRESENTATIVE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representative" element
     */
    public au.gov.asic.types.bn.RepresentativeType addNewRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().add_element_user(REPRESENTATIVE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "representative" element
     */
    public void removeRepresentative(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIVE$16, i);
        }
    }
    
    /**
     * Gets the "businessEntity" element
     */
    public au.gov.asic.types.bn.BusinessEntityType getBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType)get_store().find_element_user(BUSINESSENTITY$18, 0);
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
            return get_store().count_elements(BUSINESSENTITY$18) != 0;
        }
    }
    
    /**
     * Sets the "businessEntity" element
     */
    public void setBusinessEntity(au.gov.asic.types.bn.BusinessEntityType businessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType)get_store().find_element_user(BUSINESSENTITY$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BusinessEntityType)get_store().add_element_user(BUSINESSENTITY$18);
            }
            target.set(businessEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "businessEntity" element
     */
    public au.gov.asic.types.bn.BusinessEntityType addNewBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType)get_store().add_element_user(BUSINESSENTITY$18);
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
            get_store().remove_element(BUSINESSENTITY$18, 0);
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
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$20, 0);
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
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$20);
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
            target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$20);
            return target;
        }
    }
    /**
     * An XML smsNumber(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnUpdateFormType$SmsNumber.
     */
    public static class SmsNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.BnUpdateFormType.SmsNumber
    {
        
        public SmsNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SmsNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
