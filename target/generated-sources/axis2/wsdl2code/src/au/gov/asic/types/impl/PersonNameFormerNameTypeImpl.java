/*
 * XML Type:  personNameFormerNameType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.PersonNameFormerNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML personNameFormerNameType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonNameFormerNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.PersonNameFormerNameType
{
    
    public PersonNameFormerNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONID$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "personId");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName FORMERNAME$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "formerName");
    
    
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
     * True if has "personId" element
     */
    public boolean isSetPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONID$0) != 0;
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
     * Unsets the "personId" element
     */
    public void unsetPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONID$0, 0);
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
     * Gets array of all "formerName" elements
     */
    public au.gov.asic.types.PersonNameType[] getFormerNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMERNAME$4, targetList);
            au.gov.asic.types.PersonNameType[] result = new au.gov.asic.types.PersonNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "formerName" element
     */
    public au.gov.asic.types.PersonNameType getFormerNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(FORMERNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "formerName" element
     */
    public int sizeOfFormerNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMERNAME$4);
        }
    }
    
    /**
     * Sets array of all "formerName" element
     */
    public void setFormerNameArray(au.gov.asic.types.PersonNameType[] formerNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formerNameArray, FORMERNAME$4);
        }
    }
    
    /**
     * Sets ith "formerName" element
     */
    public void setFormerNameArray(int i, au.gov.asic.types.PersonNameType formerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().find_element_user(FORMERNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(formerName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formerName" element
     */
    public au.gov.asic.types.PersonNameType insertNewFormerName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameType target = null;
            target = (au.gov.asic.types.PersonNameType)get_store().insert_element_user(FORMERNAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formerName" element
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
     * Removes the ith "formerName" element
     */
    public void removeFormerName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMERNAME$4, i);
        }
    }
}
