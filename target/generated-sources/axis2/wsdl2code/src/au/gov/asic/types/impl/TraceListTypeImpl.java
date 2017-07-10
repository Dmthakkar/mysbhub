/*
 * XML Type:  traceListType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.TraceListType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML traceListType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TraceListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.TraceListType
{
    
    public TraceListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "trace");
    
    
    /**
     * Gets array of all "trace" elements
     */
    public au.gov.asic.types.TraceType[] getTraceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRACE$0, targetList);
            au.gov.asic.types.TraceType[] result = new au.gov.asic.types.TraceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "trace" element
     */
    public au.gov.asic.types.TraceType getTraceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType target = null;
            target = (au.gov.asic.types.TraceType)get_store().find_element_user(TRACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "trace" element
     */
    public int sizeOfTraceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACE$0);
        }
    }
    
    /**
     * Sets array of all "trace" element
     */
    public void setTraceArray(au.gov.asic.types.TraceType[] traceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(traceArray, TRACE$0);
        }
    }
    
    /**
     * Sets ith "trace" element
     */
    public void setTraceArray(int i, au.gov.asic.types.TraceType trace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType target = null;
            target = (au.gov.asic.types.TraceType)get_store().find_element_user(TRACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(trace);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "trace" element
     */
    public au.gov.asic.types.TraceType insertNewTrace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType target = null;
            target = (au.gov.asic.types.TraceType)get_store().insert_element_user(TRACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "trace" element
     */
    public au.gov.asic.types.TraceType addNewTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType target = null;
            target = (au.gov.asic.types.TraceType)get_store().add_element_user(TRACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "trace" element
     */
    public void removeTrace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACE$0, i);
        }
    }
}
