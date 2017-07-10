/*
 * XML Type:  standardMessageHeaderType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.StandardMessageHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML standardMessageHeaderType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class StandardMessageHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.StandardMessageHeaderType
{
    
    public StandardMessageHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETYPE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageType");
    private static final javax.xml.namespace.QName MESSAGEVERSION$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageVersion");
    private static final javax.xml.namespace.QName ORIGINATINGCHANNEL$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "originatingChannel");
    private static final javax.xml.namespace.QName ORIGINATINGSERVICE$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "originatingService");
    private static final javax.xml.namespace.QName TRANSACTIONID$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "transactionId");
    private static final javax.xml.namespace.QName OPERATION$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "operation");
    
    
    /**
     * Gets the "messageType" element
     */
    public java.lang.String getMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageType" element
     */
    public au.gov.asic.types.StandardMessageHeaderType.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.MessageType target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageType" element
     */
    public void setMessageType(java.lang.String messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGETYPE$0);
            }
            target.setStringValue(messageType);
        }
    }
    
    /**
     * Sets (as xml) the "messageType" element
     */
    public void xsetMessageType(au.gov.asic.types.StandardMessageHeaderType.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.MessageType target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardMessageHeaderType.MessageType)get_store().add_element_user(MESSAGETYPE$0);
            }
            target.set(messageType);
        }
    }
    
    /**
     * Gets the "messageVersion" element
     */
    public java.lang.String getMessageVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageVersion" element
     */
    public au.gov.asic.types.StandardMessageHeaderType.MessageVersion xgetMessageVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.MessageVersion target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.MessageVersion)get_store().find_element_user(MESSAGEVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageVersion" element
     */
    public void setMessageVersion(java.lang.String messageVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEVERSION$2);
            }
            target.setStringValue(messageVersion);
        }
    }
    
    /**
     * Sets (as xml) the "messageVersion" element
     */
    public void xsetMessageVersion(au.gov.asic.types.StandardMessageHeaderType.MessageVersion messageVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.MessageVersion target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.MessageVersion)get_store().find_element_user(MESSAGEVERSION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardMessageHeaderType.MessageVersion)get_store().add_element_user(MESSAGEVERSION$2);
            }
            target.set(messageVersion);
        }
    }
    
    /**
     * Gets the "originatingChannel" element
     */
    public au.gov.asic.types.OriginatingChannelType.Enum getOriginatingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGCHANNEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.OriginatingChannelType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "originatingChannel" element
     */
    public au.gov.asic.types.OriginatingChannelType xgetOriginatingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OriginatingChannelType target = null;
            target = (au.gov.asic.types.OriginatingChannelType)get_store().find_element_user(ORIGINATINGCHANNEL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "originatingChannel" element
     */
    public boolean isSetOriginatingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINATINGCHANNEL$4) != 0;
        }
    }
    
    /**
     * Sets the "originatingChannel" element
     */
    public void setOriginatingChannel(au.gov.asic.types.OriginatingChannelType.Enum originatingChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGCHANNEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATINGCHANNEL$4);
            }
            target.setEnumValue(originatingChannel);
        }
    }
    
    /**
     * Sets (as xml) the "originatingChannel" element
     */
    public void xsetOriginatingChannel(au.gov.asic.types.OriginatingChannelType originatingChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OriginatingChannelType target = null;
            target = (au.gov.asic.types.OriginatingChannelType)get_store().find_element_user(ORIGINATINGCHANNEL$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.OriginatingChannelType)get_store().add_element_user(ORIGINATINGCHANNEL$4);
            }
            target.set(originatingChannel);
        }
    }
    
    /**
     * Unsets the "originatingChannel" element
     */
    public void unsetOriginatingChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINATINGCHANNEL$4, 0);
        }
    }
    
    /**
     * Gets the "originatingService" element
     */
    public au.gov.asic.types.OriginatingServiceType.Enum getOriginatingService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGSERVICE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.OriginatingServiceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "originatingService" element
     */
    public au.gov.asic.types.OriginatingServiceType xgetOriginatingService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OriginatingServiceType target = null;
            target = (au.gov.asic.types.OriginatingServiceType)get_store().find_element_user(ORIGINATINGSERVICE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "originatingService" element
     */
    public boolean isSetOriginatingService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINATINGSERVICE$6) != 0;
        }
    }
    
    /**
     * Sets the "originatingService" element
     */
    public void setOriginatingService(au.gov.asic.types.OriginatingServiceType.Enum originatingService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGSERVICE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATINGSERVICE$6);
            }
            target.setEnumValue(originatingService);
        }
    }
    
    /**
     * Sets (as xml) the "originatingService" element
     */
    public void xsetOriginatingService(au.gov.asic.types.OriginatingServiceType originatingService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OriginatingServiceType target = null;
            target = (au.gov.asic.types.OriginatingServiceType)get_store().find_element_user(ORIGINATINGSERVICE$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.OriginatingServiceType)get_store().add_element_user(ORIGINATINGSERVICE$6);
            }
            target.set(originatingService);
        }
    }
    
    /**
     * Unsets the "originatingService" element
     */
    public void unsetOriginatingService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINATINGSERVICE$6, 0);
        }
    }
    
    /**
     * Gets the "transactionId" element
     */
    public java.lang.String getTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    public au.gov.asic.types.StandardMessageHeaderType.TransactionId xgetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.TransactionId target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.TransactionId)get_store().find_element_user(TRANSACTIONID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "transactionId" element
     */
    public boolean isSetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONID$8) != 0;
        }
    }
    
    /**
     * Sets the "transactionId" element
     */
    public void setTransactionId(java.lang.String transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$8);
            }
            target.setStringValue(transactionId);
        }
    }
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    public void xsetTransactionId(au.gov.asic.types.StandardMessageHeaderType.TransactionId transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.TransactionId target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.TransactionId)get_store().find_element_user(TRANSACTIONID$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardMessageHeaderType.TransactionId)get_store().add_element_user(TRANSACTIONID$8);
            }
            target.set(transactionId);
        }
    }
    
    /**
     * Unsets the "transactionId" element
     */
    public void unsetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONID$8, 0);
        }
    }
    
    /**
     * Gets the "operation" element
     */
    public java.lang.String getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operation" element
     */
    public au.gov.asic.types.StandardMessageHeaderType.Operation xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.Operation target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.Operation)get_store().find_element_user(OPERATION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "operation" element
     */
    public boolean isSetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$10) != 0;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(java.lang.String operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$10);
            }
            target.setStringValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "operation" element
     */
    public void xsetOperation(au.gov.asic.types.StandardMessageHeaderType.Operation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardMessageHeaderType.Operation target = null;
            target = (au.gov.asic.types.StandardMessageHeaderType.Operation)get_store().find_element_user(OPERATION$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardMessageHeaderType.Operation)get_store().add_element_user(OPERATION$10);
            }
            target.set(operation);
        }
    }
    
    /**
     * Unsets the "operation" element
     */
    public void unsetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$10, 0);
        }
    }
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$MessageType.
     */
    public static class MessageTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StandardMessageHeaderType.MessageType
    {
        
        public MessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MessageTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML messageVersion(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$MessageVersion.
     */
    public static class MessageVersionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StandardMessageHeaderType.MessageVersion
    {
        
        public MessageVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MessageVersionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML transactionId(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$TransactionId.
     */
    public static class TransactionIdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StandardMessageHeaderType.TransactionId
    {
        
        public TransactionIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TransactionIdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML operation(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$Operation.
     */
    public static class OperationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StandardMessageHeaderType.Operation
    {
        
        public OperationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OperationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
