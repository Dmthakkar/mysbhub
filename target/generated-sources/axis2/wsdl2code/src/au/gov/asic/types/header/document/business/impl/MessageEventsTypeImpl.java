/*
 * XML Type:  messageEventsType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.MessageEventsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML messageEventsType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class MessageEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.MessageEventsType
{
    
    public MessageEventsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEEVENT$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageEvent");
    
    
    /**
     * Gets array of all "messageEvent" elements
     */
    public au.gov.asic.types.header.document.business.MessageEventType[] getMessageEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEEVENT$0, targetList);
            au.gov.asic.types.header.document.business.MessageEventType[] result = new au.gov.asic.types.header.document.business.MessageEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageEvent" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType getMessageEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType)get_store().find_element_user(MESSAGEEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageEvent" element
     */
    public int sizeOfMessageEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEEVENT$0);
        }
    }
    
    /**
     * Sets array of all "messageEvent" element
     */
    public void setMessageEventArray(au.gov.asic.types.header.document.business.MessageEventType[] messageEventArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageEventArray, MESSAGEEVENT$0);
        }
    }
    
    /**
     * Sets ith "messageEvent" element
     */
    public void setMessageEventArray(int i, au.gov.asic.types.header.document.business.MessageEventType messageEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType)get_store().find_element_user(MESSAGEEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageEvent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageEvent" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType insertNewMessageEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType)get_store().insert_element_user(MESSAGEEVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageEvent" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType addNewMessageEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType)get_store().add_element_user(MESSAGEEVENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageEvent" element
     */
    public void removeMessageEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEEVENT$0, i);
        }
    }
}
