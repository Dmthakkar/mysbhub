/*
 * XML Type:  personsWithRolesType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PersonsWithRolesType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML personsWithRolesType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonsWithRolesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.PersonsWithRolesType
{
    
    public PersonsWithRolesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "person");
    
    
    /**
     * Gets array of all "person" elements
     */
    public au.gov.asic.types.bn.PersonWithRolesType[] getPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSON$0, targetList);
            au.gov.asic.types.bn.PersonWithRolesType[] result = new au.gov.asic.types.bn.PersonWithRolesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "person" element
     */
    public au.gov.asic.types.bn.PersonWithRolesType getPersonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "person" element
     */
    public int sizeOfPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$0);
        }
    }
    
    /**
     * Sets array of all "person" element
     */
    public void setPersonArray(au.gov.asic.types.bn.PersonWithRolesType[] personArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personArray, PERSON$0);
        }
    }
    
    /**
     * Sets ith "person" element
     */
    public void setPersonArray(int i, au.gov.asic.types.bn.PersonWithRolesType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(person);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    public au.gov.asic.types.bn.PersonWithRolesType insertNewPerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType)get_store().insert_element_user(PERSON$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    public au.gov.asic.types.bn.PersonWithRolesType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "person" element
     */
    public void removePerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$0, i);
        }
    }
}
