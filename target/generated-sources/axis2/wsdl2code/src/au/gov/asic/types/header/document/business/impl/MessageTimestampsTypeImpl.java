/*
 * XML Type:  messageTimestampsType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.MessageTimestampsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML messageTimestampsType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class MessageTimestampsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.MessageTimestampsType
{
    
    public MessageTimestampsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETIMESTAMP$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageTimestamp");
    
    
    /**
     * Gets array of all "messageTimestamp" elements
     */
    public au.gov.asic.types.header.document.business.MessageTimestampType[] getMessageTimestampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGETIMESTAMP$0, targetList);
            au.gov.asic.types.header.document.business.MessageTimestampType[] result = new au.gov.asic.types.header.document.business.MessageTimestampType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageTimestamp" element
     */
    public au.gov.asic.types.header.document.business.MessageTimestampType getMessageTimestampArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampType)get_store().find_element_user(MESSAGETIMESTAMP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageTimestamp" element
     */
    public int sizeOfMessageTimestampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGETIMESTAMP$0);
        }
    }
    
    /**
     * Sets array of all "messageTimestamp" element
     */
    public void setMessageTimestampArray(au.gov.asic.types.header.document.business.MessageTimestampType[] messageTimestampArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageTimestampArray, MESSAGETIMESTAMP$0);
        }
    }
    
    /**
     * Sets ith "messageTimestamp" element
     */
    public void setMessageTimestampArray(int i, au.gov.asic.types.header.document.business.MessageTimestampType messageTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampType)get_store().find_element_user(MESSAGETIMESTAMP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageTimestamp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageTimestamp" element
     */
    public au.gov.asic.types.header.document.business.MessageTimestampType insertNewMessageTimestamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampType)get_store().insert_element_user(MESSAGETIMESTAMP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageTimestamp" element
     */
    public au.gov.asic.types.header.document.business.MessageTimestampType addNewMessageTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampType)get_store().add_element_user(MESSAGETIMESTAMP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageTimestamp" element
     */
    public void removeMessageTimestamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGETIMESTAMP$0, i);
        }
    }
}
