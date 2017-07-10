/*
 * XML Type:  exceptionListType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ExceptionListType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML exceptionListType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ExceptionListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ExceptionListType
{
    
    public ExceptionListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "item");
    
    
    /**
     * Gets array of all "item" elements
     */
    public au.gov.asic.types.ExceptionType[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$0, targetList);
            au.gov.asic.types.ExceptionType[] result = new au.gov.asic.types.ExceptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "item" element
     */
    public au.gov.asic.types.ExceptionType getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType target = null;
            target = (au.gov.asic.types.ExceptionType)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$0);
        }
    }
    
    /**
     * Sets array of all "item" element
     */
    public void setItemArray(au.gov.asic.types.ExceptionType[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$0);
        }
    }
    
    /**
     * Sets ith "item" element
     */
    public void setItemArray(int i, au.gov.asic.types.ExceptionType item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType target = null;
            target = (au.gov.asic.types.ExceptionType)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    public au.gov.asic.types.ExceptionType insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType target = null;
            target = (au.gov.asic.types.ExceptionType)get_store().insert_element_user(ITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    public au.gov.asic.types.ExceptionType addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType target = null;
            target = (au.gov.asic.types.ExceptionType)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$0, i);
        }
    }
}
