/*
 * XML Type:  requestType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.RequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML requestType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.RequestType
{
    
    public RequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEHEADER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageHeader");
    private static final javax.xml.namespace.QName MESSAGEIDENTIFIER$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageIdentifier");
    private static final javax.xml.namespace.QName TIMESTAMPLIST$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "timestampList");
    
    
    /**
     * Gets the "messageHeader" element
     */
    public au.gov.asic.types.StandardMessageHeaderType getMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType)get_store().find_element_user(MESSAGEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageHeader" element
     */
    public void setMessageHeader(au.gov.asic.types.StandardMessageHeaderType messageHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType)get_store().find_element_user(MESSAGEHEADER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardMessageHeaderType)get_store().add_element_user(MESSAGEHEADER$0);
            }
            target.set(messageHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "messageHeader" element
     */
    public au.gov.asic.types.StandardMessageHeaderType addNewMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType)get_store().add_element_user(MESSAGEHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "messageIdentifier" element
     */
    public au.gov.asic.types.MessageIdentifierType getMessageIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.MessageIdentifierType target = null;
            target = (au.gov.asic.types.MessageIdentifierType)get_store().find_element_user(MESSAGEIDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "messageIdentifier" element
     */
    public boolean isSetMessageIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEIDENTIFIER$2) != 0;
        }
    }
    
    /**
     * Sets the "messageIdentifier" element
     */
    public void setMessageIdentifier(au.gov.asic.types.MessageIdentifierType messageIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.MessageIdentifierType target = null;
            target = (au.gov.asic.types.MessageIdentifierType)get_store().find_element_user(MESSAGEIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.MessageIdentifierType)get_store().add_element_user(MESSAGEIDENTIFIER$2);
            }
            target.set(messageIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "messageIdentifier" element
     */
    public au.gov.asic.types.MessageIdentifierType addNewMessageIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.MessageIdentifierType target = null;
            target = (au.gov.asic.types.MessageIdentifierType)get_store().add_element_user(MESSAGEIDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "messageIdentifier" element
     */
    public void unsetMessageIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEIDENTIFIER$2, 0);
        }
    }
    
    /**
     * Gets the "timestampList" element
     */
    public au.gov.asic.types.TimestampListType getTimestampList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampListType target = null;
            target = (au.gov.asic.types.TimestampListType)get_store().find_element_user(TIMESTAMPLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timestampList" element
     */
    public boolean isSetTimestampList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMPLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "timestampList" element
     */
    public void setTimestampList(au.gov.asic.types.TimestampListType timestampList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampListType target = null;
            target = (au.gov.asic.types.TimestampListType)get_store().find_element_user(TIMESTAMPLIST$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TimestampListType)get_store().add_element_user(TIMESTAMPLIST$4);
            }
            target.set(timestampList);
        }
    }
    
    /**
     * Appends and returns a new empty "timestampList" element
     */
    public au.gov.asic.types.TimestampListType addNewTimestampList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TimestampListType target = null;
            target = (au.gov.asic.types.TimestampListType)get_store().add_element_user(TIMESTAMPLIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "timestampList" element
     */
    public void unsetTimestampList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMPLIST$4, 0);
        }
    }
}
