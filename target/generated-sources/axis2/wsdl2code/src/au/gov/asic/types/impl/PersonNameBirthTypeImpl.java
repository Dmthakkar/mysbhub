/*
 * XML Type:  personNameBirthType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.PersonNameBirthType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML personNameBirthType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonNameBirthTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.PersonNameBirthType
{
    
    public PersonNameBirthTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONID$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "personId");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName FORMERNAME$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "formerName");
    private static final javax.xml.namespace.QName BIRTHDETAILS$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "birthDetails");
    
    
    /**
     * Gets the "personId" element
     */
    public java.lang.String getPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "personId" element
     */
    public org.apache.xmlbeans.XmlString xgetPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "personId" element
     */
    public void setPersonId(java.lang.String personId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONID$0);
            }
            target.setStringValue(personId);
        }
    }
    
    /**
     * Sets (as xml) the "personId" element
     */
    public void xsetPersonId(org.apache.xmlbeans.XmlString personId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSONID$0);
            }
            target.set(personId);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.PersonNameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(NAME$2, 0);
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
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(NAME$2);
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
            target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "formerName" element
     */
    public au.gov.asic.types.PersonNameType getFormerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(FORMERNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formerName" element
     */
    public boolean isSetFormerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMERNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "formerName" element
     */
    public void setFormerName(au.gov.asic.types.PersonNameType formerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(FORMERNAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(FORMERNAME$4);
            }
            target.set(formerName);
        }
    }
    
    /**
     * Appends and returns a new empty "formerName" element
     */
    public au.gov.asic.types.PersonNameType addNewFormerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().add_element_user(FORMERNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "formerName" element
     */
    public void unsetFormerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMERNAME$4, 0);
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
            target = (au.gov.asic.types.BirthDetailsType)get_store().find_element_user(BIRTHDETAILS$6, 0);
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
            return get_store().count_elements(BIRTHDETAILS$6) != 0;
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
            target = (au.gov.asic.types.BirthDetailsType)get_store().find_element_user(BIRTHDETAILS$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BirthDetailsType)get_store().add_element_user(BIRTHDETAILS$6);
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
            target = (au.gov.asic.types.BirthDetailsType)get_store().add_element_user(BIRTHDETAILS$6);
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
            get_store().remove_element(BIRTHDETAILS$6, 0);
        }
    }
}
