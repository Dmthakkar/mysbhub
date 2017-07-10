/*
 * XML Type:  nameResultWithObjectionsType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameResultWithObjectionsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML nameResultWithObjectionsType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameResultWithObjectionsTypeImpl extends au.gov.asic.types.impl.NameResultTypeImpl implements au.gov.asic.types.NameResultWithObjectionsType
{
    
    public NameResultWithObjectionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTIONS$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "objections");
    
    
    /**
     * Gets array of all "objections" elements
     */
    public au.gov.asic.types.ObjectionType[] getObjectionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTIONS$0, targetList);
            au.gov.asic.types.ObjectionType[] result = new au.gov.asic.types.ObjectionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objections" element
     */
    public au.gov.asic.types.ObjectionType getObjectionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().find_element_user(OBJECTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objections" element
     */
    public int sizeOfObjectionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIONS$0);
        }
    }
    
    /**
     * Sets array of all "objections" element
     */
    public void setObjectionsArray(au.gov.asic.types.ObjectionType[] objectionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectionsArray, OBJECTIONS$0);
        }
    }
    
    /**
     * Sets ith "objections" element
     */
    public void setObjectionsArray(int i, au.gov.asic.types.ObjectionType objections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().find_element_user(OBJECTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objections);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objections" element
     */
    public au.gov.asic.types.ObjectionType insertNewObjections(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().insert_element_user(OBJECTIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objections" element
     */
    public au.gov.asic.types.ObjectionType addNewObjections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().add_element_user(OBJECTIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "objections" element
     */
    public void removeObjections(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIONS$0, i);
        }
    }
}
