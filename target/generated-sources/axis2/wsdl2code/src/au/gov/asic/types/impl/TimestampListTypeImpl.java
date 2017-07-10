/*
 * XML Type:  timestampListType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.TimestampListType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML timestampListType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TimestampListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.TimestampListType
{
    
    public TimestampListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESTAMP$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "timestamp");
    
    
    /**
     * Gets array of all "timestamp" elements
     */
    public au.gov.asic.types.TimestampType[] getTimestampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMESTAMP$0, targetList);
            au.gov.asic.types.TimestampType[] result = new au.gov.asic.types.TimestampType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "timestamp" element
     */
    public au.gov.asic.types.TimestampType getTimestampArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampType target = null;
            target = (au.gov.asic.types.TimestampType)get_store().find_element_user(TIMESTAMP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "timestamp" element
     */
    public int sizeOfTimestampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMP$0);
        }
    }
    
    /**
     * Sets array of all "timestamp" element
     */
    public void setTimestampArray(au.gov.asic.types.TimestampType[] timestampArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timestampArray, TIMESTAMP$0);
        }
    }
    
    /**
     * Sets ith "timestamp" element
     */
    public void setTimestampArray(int i, au.gov.asic.types.TimestampType timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampType target = null;
            target = (au.gov.asic.types.TimestampType)get_store().find_element_user(TIMESTAMP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "timestamp" element
     */
    public au.gov.asic.types.TimestampType insertNewTimestamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampType target = null;
            target = (au.gov.asic.types.TimestampType)get_store().insert_element_user(TIMESTAMP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "timestamp" element
     */
    public au.gov.asic.types.TimestampType addNewTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampType target = null;
            target = (au.gov.asic.types.TimestampType)get_store().add_element_user(TIMESTAMP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "timestamp" element
     */
    public void removeTimestamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMP$0, i);
        }
    }
}
