/*
 * XML Type:  fssCustomerType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssCustomerType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML fssCustomerType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FssCustomerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssCustomerType
{
    
    public FssCustomerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNT$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "account");
    private static final javax.xml.namespace.QName ABN$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName PERSON$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "person");
    private static final javax.xml.namespace.QName ORGANISATIONNAME$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "organisationName");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName CORRESPONDENCENAME$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "correspondenceName");
    private static final javax.xml.namespace.QName DATEREGISTRATION$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateRegistration");
    private static final javax.xml.namespace.QName DATERENEWALREVIEW$14 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateRenewalReview");
    private static final javax.xml.namespace.QName STATUS$16 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "status");
    private static final javax.xml.namespace.QName PHONENUMBER$18 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "phoneNumber");
    private static final javax.xml.namespace.QName FAXNUMBER$20 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "faxNumber");
    private static final javax.xml.namespace.QName EMAILADDRESS$22 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName AGENT$24 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "agent");
    private static final javax.xml.namespace.QName CREDITLIMIT$26 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "creditLimit");
    private static final javax.xml.namespace.QName BILLINGADDRESS$28 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "billingAddress");
    
    
    /**
     * Gets the "account" element
     */
    public au.gov.asic.types.fss.FssAccountType getAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(ACCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "account" element
     */
    public void setAccount(au.gov.asic.types.fss.FssAccountType account)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(ACCOUNT$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(ACCOUNT$0);
            }
            target.set(account);
        }
    }
    
    /**
     * Appends and returns a new empty "account" element
     */
    public au.gov.asic.types.fss.FssAccountType addNewAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(ACCOUNT$0);
            return target;
        }
    }
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abn" element
     */
    public au.gov.asic.types.AbnType xgetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "abn" element
     */
    public boolean isSetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$2) != 0;
        }
    }
    
    /**
     * Sets the "abn" element
     */
    public void setAbn(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$2);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "abn" element
     */
    public void xsetAbn(au.gov.asic.types.AbnType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$2);
            }
            target.set(abn);
        }
    }
    
    /**
     * Unsets the "abn" element
     */
    public void unsetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$2, 0);
        }
    }
    
    /**
     * Gets the "person" element
     */
    public au.gov.asic.types.PersonNameType getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(PERSON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "person" element
     */
    public boolean isSetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$4) != 0;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(au.gov.asic.types.PersonNameType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(PERSON$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(PERSON$4);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "person" element
     */
    public au.gov.asic.types.PersonNameType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(PERSON$4);
            return target;
        }
    }
    
    /**
     * Unsets the "person" element
     */
    public void unsetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$4, 0);
        }
    }
    
    /**
     * Gets the "organisationName" element
     */
    public java.lang.String getOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organisationName" element
     */
    public au.gov.asic.types.NniNameType xgetOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "organisationName" element
     */
    public boolean isSetOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "organisationName" element
     */
    public void setOrganisationName(java.lang.String organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONNAME$6);
            }
            target.setStringValue(organisationName);
        }
    }
    
    /**
     * Sets (as xml) the "organisationName" element
     */
    public void xsetOrganisationName(au.gov.asic.types.NniNameType organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONNAME$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ORGANISATIONNAME$6);
            }
            target.set(organisationName);
        }
    }
    
    /**
     * Unsets the "organisationName" element
     */
    public void unsetOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONNAME$6, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
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
    public au.gov.asic.types.fss.FssCustomerType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Name target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Name)get_store().find_element_user(NAME$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$8);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.fss.FssCustomerType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Name target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Name)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssCustomerType.Name)get_store().add_element_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "correspondenceName" element
     */
    public java.lang.String getCorrespondenceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRESPONDENCENAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "correspondenceName" element
     */
    public au.gov.asic.types.fss.FssCustomerType.CorrespondenceName xgetCorrespondenceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.CorrespondenceName target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.CorrespondenceName)get_store().find_element_user(CORRESPONDENCENAME$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "correspondenceName" element
     */
    public void setCorrespondenceName(java.lang.String correspondenceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRESPONDENCENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRESPONDENCENAME$10);
            }
            target.setStringValue(correspondenceName);
        }
    }
    
    /**
     * Sets (as xml) the "correspondenceName" element
     */
    public void xsetCorrespondenceName(au.gov.asic.types.fss.FssCustomerType.CorrespondenceName correspondenceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.CorrespondenceName target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.CorrespondenceName)get_store().find_element_user(CORRESPONDENCENAME$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssCustomerType.CorrespondenceName)get_store().add_element_user(CORRESPONDENCENAME$10);
            }
            target.set(correspondenceName);
        }
    }
    
    /**
     * Gets the "dateRegistration" element
     */
    public java.util.Calendar getDateRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTRATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateRegistration" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTRATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateRegistration" element
     */
    public boolean isSetDateRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEREGISTRATION$12) != 0;
        }
    }
    
    /**
     * Sets the "dateRegistration" element
     */
    public void setDateRegistration(java.util.Calendar dateRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTRATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREGISTRATION$12);
            }
            target.setCalendarValue(dateRegistration);
        }
    }
    
    /**
     * Sets (as xml) the "dateRegistration" element
     */
    public void xsetDateRegistration(org.apache.xmlbeans.XmlDate dateRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTRATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREGISTRATION$12);
            }
            target.set(dateRegistration);
        }
    }
    
    /**
     * Unsets the "dateRegistration" element
     */
    public void unsetDateRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEREGISTRATION$12, 0);
        }
    }
    
    /**
     * Gets the "dateRenewalReview" element
     */
    public java.util.Calendar getDateRenewalReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWALREVIEW$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateRenewalReview" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateRenewalReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWALREVIEW$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateRenewalReview" element
     */
    public boolean isSetDateRenewalReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATERENEWALREVIEW$14) != 0;
        }
    }
    
    /**
     * Sets the "dateRenewalReview" element
     */
    public void setDateRenewalReview(java.util.Calendar dateRenewalReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWALREVIEW$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERENEWALREVIEW$14);
            }
            target.setCalendarValue(dateRenewalReview);
        }
    }
    
    /**
     * Sets (as xml) the "dateRenewalReview" element
     */
    public void xsetDateRenewalReview(org.apache.xmlbeans.XmlDate dateRenewalReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWALREVIEW$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERENEWALREVIEW$14);
            }
            target.set(dateRenewalReview);
        }
    }
    
    /**
     * Unsets the "dateRenewalReview" element
     */
    public void unsetDateRenewalReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATERENEWALREVIEW$14, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public au.gov.asic.types.fss.FssCustomerType.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Status target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Status)get_store().find_element_user(STATUS$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$16);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(au.gov.asic.types.fss.FssCustomerType.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Status target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Status)get_store().find_element_user(STATUS$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssCustomerType.Status)get_store().add_element_user(STATUS$16);
            }
            target.set(status);
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
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(PHONENUMBER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phoneNumber" element
     */
    public boolean isSetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONENUMBER$18) != 0;
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
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(PHONENUMBER$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(PHONENUMBER$18);
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
            target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(PHONENUMBER$18);
            return target;
        }
    }
    
    /**
     * Unsets the "phoneNumber" element
     */
    public void unsetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONENUMBER$18, 0);
        }
    }
    
    /**
     * Gets the "faxNumber" element
     */
    public au.gov.asic.types.TelephoneNumberType getFaxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(FAXNUMBER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "faxNumber" element
     */
    public boolean isSetFaxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAXNUMBER$20) != 0;
        }
    }
    
    /**
     * Sets the "faxNumber" element
     */
    public void setFaxNumber(au.gov.asic.types.TelephoneNumberType faxNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().find_element_user(FAXNUMBER$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(FAXNUMBER$20);
            }
            target.set(faxNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "faxNumber" element
     */
    public au.gov.asic.types.TelephoneNumberType addNewFaxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType target = null;
            target = (au.gov.asic.types.TelephoneNumberType)get_store().add_element_user(FAXNUMBER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "faxNumber" element
     */
    public void unsetFaxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAXNUMBER$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$22, 0);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$22, 0);
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
            return get_store().count_elements(EMAILADDRESS$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$22);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$22);
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
            get_store().remove_element(EMAILADDRESS$22, 0);
        }
    }
    
    /**
     * Gets the "agent" element
     */
    public au.gov.asic.types.fss.FssCustomerType.Agent getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Agent target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Agent)get_store().find_element_user(AGENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "agent" element
     */
    public boolean isSetAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENT$24) != 0;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(au.gov.asic.types.fss.FssCustomerType.Agent agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Agent target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Agent)get_store().find_element_user(AGENT$24, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssCustomerType.Agent)get_store().add_element_user(AGENT$24);
            }
            target.set(agent);
        }
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public au.gov.asic.types.fss.FssCustomerType.Agent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.Agent target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.Agent)get_store().add_element_user(AGENT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "agent" element
     */
    public void unsetAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENT$24, 0);
        }
    }
    
    /**
     * Gets the "creditLimit" element
     */
    public java.math.BigDecimal getCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITLIMIT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "creditLimit" element
     */
    public au.gov.asic.types.AmountType xgetCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(CREDITLIMIT$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "creditLimit" element
     */
    public boolean isSetCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITLIMIT$26) != 0;
        }
    }
    
    /**
     * Sets the "creditLimit" element
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITLIMIT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITLIMIT$26);
            }
            target.setBigDecimalValue(creditLimit);
        }
    }
    
    /**
     * Sets (as xml) the "creditLimit" element
     */
    public void xsetCreditLimit(au.gov.asic.types.AmountType creditLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(CREDITLIMIT$26, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(CREDITLIMIT$26);
            }
            target.set(creditLimit);
        }
    }
    
    /**
     * Unsets the "creditLimit" element
     */
    public void unsetCreditLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITLIMIT$26, 0);
        }
    }
    
    /**
     * Gets the "billingAddress" element
     */
    public au.gov.asic.types.fss.FssCustomerType.BillingAddress getBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.BillingAddress target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress)get_store().find_element_user(BILLINGADDRESS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "billingAddress" element
     */
    public boolean isSetBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLINGADDRESS$28) != 0;
        }
    }
    
    /**
     * Sets the "billingAddress" element
     */
    public void setBillingAddress(au.gov.asic.types.fss.FssCustomerType.BillingAddress billingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.BillingAddress target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress)get_store().find_element_user(BILLINGADDRESS$28, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress)get_store().add_element_user(BILLINGADDRESS$28);
            }
            target.set(billingAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "billingAddress" element
     */
    public au.gov.asic.types.fss.FssCustomerType.BillingAddress addNewBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssCustomerType.BillingAddress target = null;
            target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress)get_store().add_element_user(BILLINGADDRESS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "billingAddress" element
     */
    public void unsetBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLINGADDRESS$28, 0);
        }
    }
    /**
     * An XML name(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssCustomerType.Name
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
    /**
     * An XML correspondenceName(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$CorrespondenceName.
     */
    public static class CorrespondenceNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssCustomerType.CorrespondenceName
    {
        
        public CorrespondenceNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CorrespondenceNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML status(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssCustomerType.Status
    {
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML agent(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class AgentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssCustomerType.Agent
    {
        
        public AgentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACCOUNT$0 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "account");
        private static final javax.xml.namespace.QName REMOVEAGENT$2 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "removeAgent");
        private static final javax.xml.namespace.QName MANAGER$4 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "manager");
        
        
        /**
         * Gets the "account" element
         */
        public au.gov.asic.types.fss.FssAccountType getAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssAccountType target = null;
                target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(ACCOUNT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "account" element
         */
        public boolean isSetAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCOUNT$0) != 0;
            }
        }
        
        /**
         * Sets the "account" element
         */
        public void setAccount(au.gov.asic.types.fss.FssAccountType account)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssAccountType target = null;
                target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(ACCOUNT$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(ACCOUNT$0);
                }
                target.set(account);
            }
        }
        
        /**
         * Appends and returns a new empty "account" element
         */
        public au.gov.asic.types.fss.FssAccountType addNewAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssAccountType target = null;
                target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(ACCOUNT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "account" element
         */
        public void unsetAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCOUNT$0, 0);
            }
        }
        
        /**
         * Gets the "removeAgent" element
         */
        public boolean getRemoveAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMOVEAGENT$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "removeAgent" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRemoveAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REMOVEAGENT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "removeAgent" element
         */
        public boolean isSetRemoveAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOVEAGENT$2) != 0;
            }
        }
        
        /**
         * Sets the "removeAgent" element
         */
        public void setRemoveAgent(boolean removeAgent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMOVEAGENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMOVEAGENT$2);
                }
                target.setBooleanValue(removeAgent);
            }
        }
        
        /**
         * Sets (as xml) the "removeAgent" element
         */
        public void xsetRemoveAgent(org.apache.xmlbeans.XmlBoolean removeAgent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REMOVEAGENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REMOVEAGENT$2);
                }
                target.set(removeAgent);
            }
        }
        
        /**
         * Unsets the "removeAgent" element
         */
        public void unsetRemoveAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOVEAGENT$2, 0);
            }
        }
        
        /**
         * Gets the "manager" element
         */
        public java.lang.String getManager()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "manager" element
         */
        public au.gov.asic.types.fss.FssCustomerType.Agent.Manager xgetManager()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssCustomerType.Agent.Manager target = null;
                target = (au.gov.asic.types.fss.FssCustomerType.Agent.Manager)get_store().find_element_user(MANAGER$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "manager" element
         */
        public boolean isSetManager()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MANAGER$4) != 0;
            }
        }
        
        /**
         * Sets the "manager" element
         */
        public void setManager(java.lang.String manager)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGER$4);
                }
                target.setStringValue(manager);
            }
        }
        
        /**
         * Sets (as xml) the "manager" element
         */
        public void xsetManager(au.gov.asic.types.fss.FssCustomerType.Agent.Manager manager)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssCustomerType.Agent.Manager target = null;
                target = (au.gov.asic.types.fss.FssCustomerType.Agent.Manager)get_store().find_element_user(MANAGER$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FssCustomerType.Agent.Manager)get_store().add_element_user(MANAGER$4);
                }
                target.set(manager);
            }
        }
        
        /**
         * Unsets the "manager" element
         */
        public void unsetManager()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MANAGER$4, 0);
            }
        }
        /**
         * An XML manager(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$Agent$Manager.
         */
        public static class ManagerImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssCustomerType.Agent.Manager
        {
            
            public ManagerImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ManagerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML billingAddress(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class BillingAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssCustomerType.BillingAddress
    {
        
        public BillingAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESS$0 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "address");
        private static final javax.xml.namespace.QName ADDRESSTYPE$2 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "addressType");
        private static final javax.xml.namespace.QName RETURNTOSENDERINDICATOR$4 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "returnToSenderIndicator");
        private static final javax.xml.namespace.QName REMOVEADDRESS$6 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "removeAddress");
        
        
        /**
         * Gets the "address" element
         */
        public au.gov.asic.types.AddressType getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressType target = null;
                target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$0, 0);
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
                return get_store().count_elements(ADDRESS$0) != 0;
            }
        }
        
        /**
         * Sets the "address" element
         */
        public void setAddress(au.gov.asic.types.AddressType address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressType target = null;
                target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$0);
                }
                target.set(address);
            }
        }
        
        /**
         * Appends and returns a new empty "address" element
         */
        public au.gov.asic.types.AddressType addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressType target = null;
                target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$0);
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
                get_store().remove_element(ADDRESS$0, 0);
            }
        }
        
        /**
         * Gets the "addressType" element
         */
        public au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType.Enum getAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressType" element
         */
        public au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType xgetAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType target = null;
                target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType)get_store().find_element_user(ADDRESSTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addressType" element
         */
        public void setAddressType(au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType.Enum addressType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSTYPE$2);
                }
                target.setEnumValue(addressType);
            }
        }
        
        /**
         * Sets (as xml) the "addressType" element
         */
        public void xsetAddressType(au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType addressType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType target = null;
                target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType)get_store().find_element_user(ADDRESSTYPE$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType)get_store().add_element_user(ADDRESSTYPE$2);
                }
                target.set(addressType);
            }
        }
        
        /**
         * Gets the "returnToSenderIndicator" element
         */
        public boolean getReturnToSenderIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNTOSENDERINDICATOR$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "returnToSenderIndicator" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetReturnToSenderIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETURNTOSENDERINDICATOR$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "returnToSenderIndicator" element
         */
        public boolean isSetReturnToSenderIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURNTOSENDERINDICATOR$4) != 0;
            }
        }
        
        /**
         * Sets the "returnToSenderIndicator" element
         */
        public void setReturnToSenderIndicator(boolean returnToSenderIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNTOSENDERINDICATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNTOSENDERINDICATOR$4);
                }
                target.setBooleanValue(returnToSenderIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "returnToSenderIndicator" element
         */
        public void xsetReturnToSenderIndicator(org.apache.xmlbeans.XmlBoolean returnToSenderIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETURNTOSENDERINDICATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RETURNTOSENDERINDICATOR$4);
                }
                target.set(returnToSenderIndicator);
            }
        }
        
        /**
         * Unsets the "returnToSenderIndicator" element
         */
        public void unsetReturnToSenderIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURNTOSENDERINDICATOR$4, 0);
            }
        }
        
        /**
         * Gets the "removeAddress" element
         */
        public boolean getRemoveAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMOVEADDRESS$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "removeAddress" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRemoveAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REMOVEADDRESS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "removeAddress" element
         */
        public boolean isSetRemoveAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOVEADDRESS$6) != 0;
            }
        }
        
        /**
         * Sets the "removeAddress" element
         */
        public void setRemoveAddress(boolean removeAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMOVEADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMOVEADDRESS$6);
                }
                target.setBooleanValue(removeAddress);
            }
        }
        
        /**
         * Sets (as xml) the "removeAddress" element
         */
        public void xsetRemoveAddress(org.apache.xmlbeans.XmlBoolean removeAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REMOVEADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REMOVEADDRESS$6);
                }
                target.set(removeAddress);
            }
        }
        
        /**
         * Unsets the "removeAddress" element
         */
        public void unsetRemoveAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOVEADDRESS$6, 0);
            }
        }
        /**
         * An XML addressType(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$BillingAddress$AddressType.
         */
        public static class AddressTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType
        {
            
            public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
