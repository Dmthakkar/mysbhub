/*
 * XML Type:  businessDocumentRequestHeaderType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML businessDocumentRequestHeaderType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BusinessDocumentRequestHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType
{
    
    public BusinessDocumentRequestHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETYPE$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageType");
    private static final javax.xml.namespace.QName MESSAGEREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageReferenceNumber");
    private static final javax.xml.namespace.QName ASICREFERENCENUMBER$4 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "asicReferenceNumber");
    private static final javax.xml.namespace.QName MESSAGEVERSION$6 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageVersion");
    private static final javax.xml.namespace.QName SENDERID$8 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "senderId");
    private static final javax.xml.namespace.QName SENDERTYPE$10 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "senderType");
    private static final javax.xml.namespace.QName SOFTWAREINFORMATION$12 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "softwareInformation");
    private static final javax.xml.namespace.QName MESSAGETIMESTAMPS$14 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageTimestamps");
    private static final javax.xml.namespace.QName ATTACHMENTS$16 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "attachments");
    
    
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
    public au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
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
    public void xsetMessageType(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType)get_store().add_element_user(MESSAGETYPE$0);
            }
            target.set(messageType);
        }
    }
    
    /**
     * Gets the "messageReferenceNumber" element
     */
    public java.lang.String getMessageReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEREFERENCENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageReferenceNumber" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber xgetMessageReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber)get_store().find_element_user(MESSAGEREFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageReferenceNumber" element
     */
    public void setMessageReferenceNumber(java.lang.String messageReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEREFERENCENUMBER$2);
            }
            target.setStringValue(messageReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "messageReferenceNumber" element
     */
    public void xsetMessageReferenceNumber(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber messageReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber)get_store().find_element_user(MESSAGEREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber)get_store().add_element_user(MESSAGEREFERENCENUMBER$2);
            }
            target.set(messageReferenceNumber);
        }
    }
    
    /**
     * Gets the "asicReferenceNumber" element
     */
    public long getAsicReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "asicReferenceNumber" element
     */
    public au.gov.asic.types.ReferenceNoType xgetAsicReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "asicReferenceNumber" element
     */
    public boolean isSetAsicReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASICREFERENCENUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "asicReferenceNumber" element
     */
    public void setAsicReferenceNumber(long asicReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICREFERENCENUMBER$4);
            }
            target.setLongValue(asicReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "asicReferenceNumber" element
     */
    public void xsetAsicReferenceNumber(au.gov.asic.types.ReferenceNoType asicReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ReferenceNoType)get_store().add_element_user(ASICREFERENCENUMBER$4);
            }
            target.set(asicReferenceNumber);
        }
    }
    
    /**
     * Unsets the "asicReferenceNumber" element
     */
    public void unsetAsicReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASICREFERENCENUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "messageVersion" element
     */
    public long getMessageVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageVersion" element
     */
    public org.apache.xmlbeans.XmlLong xgetMessageVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MESSAGEVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageVersion" element
     */
    public void setMessageVersion(long messageVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEVERSION$6);
            }
            target.setLongValue(messageVersion);
        }
    }
    
    /**
     * Sets (as xml) the "messageVersion" element
     */
    public void xsetMessageVersion(org.apache.xmlbeans.XmlLong messageVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MESSAGEVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MESSAGEVERSION$6);
            }
            target.set(messageVersion);
        }
    }
    
    /**
     * Gets the "senderId" element
     */
    public java.lang.String getSenderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "senderId" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId xgetSenderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId)get_store().find_element_user(SENDERID$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "senderId" element
     */
    public void setSenderId(java.lang.String senderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERID$8);
            }
            target.setStringValue(senderId);
        }
    }
    
    /**
     * Sets (as xml) the "senderId" element
     */
    public void xsetSenderId(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId senderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId)get_store().find_element_user(SENDERID$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId)get_store().add_element_user(SENDERID$8);
            }
            target.set(senderId);
        }
    }
    
    /**
     * Gets the "senderType" element
     */
    public java.lang.String getSenderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "senderType" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType xgetSenderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType)get_store().find_element_user(SENDERTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "senderType" element
     */
    public void setSenderType(java.lang.String senderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERTYPE$10);
            }
            target.setStringValue(senderType);
        }
    }
    
    /**
     * Sets (as xml) the "senderType" element
     */
    public void xsetSenderType(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType senderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType)get_store().find_element_user(SENDERTYPE$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType)get_store().add_element_user(SENDERTYPE$10);
            }
            target.set(senderType);
        }
    }
    
    /**
     * Gets the "softwareInformation" element
     */
    public au.gov.asic.types.header.document.business.SoftwareInformationType getSoftwareInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType)get_store().find_element_user(SOFTWAREINFORMATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "softwareInformation" element
     */
    public boolean isSetSoftwareInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREINFORMATION$12) != 0;
        }
    }
    
    /**
     * Sets the "softwareInformation" element
     */
    public void setSoftwareInformation(au.gov.asic.types.header.document.business.SoftwareInformationType softwareInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType)get_store().find_element_user(SOFTWAREINFORMATION$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.SoftwareInformationType)get_store().add_element_user(SOFTWAREINFORMATION$12);
            }
            target.set(softwareInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "softwareInformation" element
     */
    public au.gov.asic.types.header.document.business.SoftwareInformationType addNewSoftwareInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType)get_store().add_element_user(SOFTWAREINFORMATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "softwareInformation" element
     */
    public void unsetSoftwareInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREINFORMATION$12, 0);
        }
    }
    
    /**
     * Gets the "messageTimestamps" element
     */
    public au.gov.asic.types.header.document.business.MessageTimestampsType getMessageTimestamps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampsType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampsType)get_store().find_element_user(MESSAGETIMESTAMPS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "messageTimestamps" element
     */
    public boolean isSetMessageTimestamps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGETIMESTAMPS$14) != 0;
        }
    }
    
    /**
     * Sets the "messageTimestamps" element
     */
    public void setMessageTimestamps(au.gov.asic.types.header.document.business.MessageTimestampsType messageTimestamps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampsType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampsType)get_store().find_element_user(MESSAGETIMESTAMPS$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.MessageTimestampsType)get_store().add_element_user(MESSAGETIMESTAMPS$14);
            }
            target.set(messageTimestamps);
        }
    }
    
    /**
     * Appends and returns a new empty "messageTimestamps" element
     */
    public au.gov.asic.types.header.document.business.MessageTimestampsType addNewMessageTimestamps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageTimestampsType target = null;
            target = (au.gov.asic.types.header.document.business.MessageTimestampsType)get_store().add_element_user(MESSAGETIMESTAMPS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "messageTimestamps" element
     */
    public void unsetMessageTimestamps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGETIMESTAMPS$14, 0);
        }
    }
    
    /**
     * Gets the "attachments" element
     */
    public au.gov.asic.types.header.document.business.AttachmentsType getAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentsType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().find_element_user(ATTACHMENTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attachments" element
     */
    public boolean isSetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTS$16) != 0;
        }
    }
    
    /**
     * Sets the "attachments" element
     */
    public void setAttachments(au.gov.asic.types.header.document.business.AttachmentsType attachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentsType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().find_element_user(ATTACHMENTS$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().add_element_user(ATTACHMENTS$16);
            }
            target.set(attachments);
        }
    }
    
    /**
     * Appends and returns a new empty "attachments" element
     */
    public au.gov.asic.types.header.document.business.AttachmentsType addNewAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentsType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().add_element_user(ATTACHMENTS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "attachments" element
     */
    public void unsetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTS$16, 0);
        }
    }
    /**
     * An XML messageType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$MessageType.
     */
    public static class MessageTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType
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
     * An XML messageReferenceNumber(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$MessageReferenceNumber.
     */
    public static class MessageReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber
    {
        
        public MessageReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MessageReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML senderId(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$SenderId.
     */
    public static class SenderIdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId
    {
        
        public SenderIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SenderIdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML senderType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$SenderType.
     */
    public static class SenderTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType
    {
        
        public SenderTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SenderTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
