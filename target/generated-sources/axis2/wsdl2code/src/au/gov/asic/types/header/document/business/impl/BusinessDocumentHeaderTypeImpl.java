/*
 * XML Type:  businessDocumentHeaderType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.BusinessDocumentHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML businessDocumentHeaderType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BusinessDocumentHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType
{
    
    public BusinessDocumentHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName MESSAGEEVENTS$16 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "messageEvents");
    private static final javax.xml.namespace.QName RESULT$18 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "result");
    private static final javax.xml.namespace.QName ATTACHMENTS$20 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "attachments");
    private static final javax.xml.namespace.QName RECEIPT$22 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "receipt");
    private static final javax.xml.namespace.QName ASICTRANSACTIONNUMBER$24 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "asicTransactionNumber");
    private static final javax.xml.namespace.QName TRANSACTIONREFERENCENUMBER$26 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "transactionReferenceNumber");
    private static final javax.xml.namespace.QName PROCESSMODE$28 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "processMode");
    
    
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
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
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
    public void xsetMessageType(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType)get_store().add_element_user(MESSAGETYPE$0);
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
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber xgetMessageReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber)get_store().find_element_user(MESSAGEREFERENCENUMBER$2, 0);
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
    public void xsetMessageReferenceNumber(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber messageReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber)get_store().find_element_user(MESSAGEREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber)get_store().add_element_user(MESSAGEREFERENCENUMBER$2);
            }
            target.set(messageReferenceNumber);
        }
    }
    
    /**
     * Gets the "asicReferenceNumber" element
     */
    public java.lang.String getAsicReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "asicReferenceNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetAsicReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
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
    public void setAsicReferenceNumber(java.lang.String asicReferenceNumber)
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
            target.setStringValue(asicReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "asicReferenceNumber" element
     */
    public void xsetAsicReferenceNumber(org.apache.xmlbeans.XmlString asicReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASICREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASICREFERENCENUMBER$4);
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
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId xgetSenderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId)get_store().find_element_user(SENDERID$8, 0);
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
    public void xsetSenderId(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId senderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId)get_store().find_element_user(SENDERID$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId)get_store().add_element_user(SENDERID$8);
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
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType xgetSenderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType)get_store().find_element_user(SENDERTYPE$10, 0);
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
    public void xsetSenderType(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType senderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType)get_store().find_element_user(SENDERTYPE$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType)get_store().add_element_user(SENDERTYPE$10);
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
     * Gets the "messageEvents" element
     */
    public au.gov.asic.types.header.document.business.MessageEventsType getMessageEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventsType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventsType)get_store().find_element_user(MESSAGEEVENTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "messageEvents" element
     */
    public boolean isSetMessageEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEEVENTS$16) != 0;
        }
    }
    
    /**
     * Sets the "messageEvents" element
     */
    public void setMessageEvents(au.gov.asic.types.header.document.business.MessageEventsType messageEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventsType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventsType)get_store().find_element_user(MESSAGEEVENTS$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.MessageEventsType)get_store().add_element_user(MESSAGEEVENTS$16);
            }
            target.set(messageEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "messageEvents" element
     */
    public au.gov.asic.types.header.document.business.MessageEventsType addNewMessageEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventsType target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventsType)get_store().add_element_user(MESSAGEEVENTS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "messageEvents" element
     */
    public void unsetMessageEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEEVENTS$16, 0);
        }
    }
    
    /**
     * Gets the "result" element
     */
    public au.gov.asic.types.header.document.business.GenericResultType getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.GenericResultType target = null;
            target = (au.gov.asic.types.header.document.business.GenericResultType)get_store().find_element_user(RESULT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "result" element
     */
    public boolean isSetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$18) != 0;
        }
    }
    
    /**
     * Sets the "result" element
     */
    public void setResult(au.gov.asic.types.header.document.business.GenericResultType result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.GenericResultType target = null;
            target = (au.gov.asic.types.header.document.business.GenericResultType)get_store().find_element_user(RESULT$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.GenericResultType)get_store().add_element_user(RESULT$18);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "result" element
     */
    public au.gov.asic.types.header.document.business.GenericResultType addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.GenericResultType target = null;
            target = (au.gov.asic.types.header.document.business.GenericResultType)get_store().add_element_user(RESULT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "result" element
     */
    public void unsetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$18, 0);
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
            target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().find_element_user(ATTACHMENTS$20, 0);
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
            return get_store().count_elements(ATTACHMENTS$20) != 0;
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
            target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().find_element_user(ATTACHMENTS$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().add_element_user(ATTACHMENTS$20);
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
            target = (au.gov.asic.types.header.document.business.AttachmentsType)get_store().add_element_user(ATTACHMENTS$20);
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
            get_store().remove_element(ATTACHMENTS$20, 0);
        }
    }
    
    /**
     * Gets the "receipt" element
     */
    public au.gov.asic.types.fss.ReceiptType getReceipt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.ReceiptType target = null;
            target = (au.gov.asic.types.fss.ReceiptType)get_store().find_element_user(RECEIPT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "receipt" element
     */
    public boolean isSetReceipt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIPT$22) != 0;
        }
    }
    
    /**
     * Sets the "receipt" element
     */
    public void setReceipt(au.gov.asic.types.fss.ReceiptType receipt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.ReceiptType target = null;
            target = (au.gov.asic.types.fss.ReceiptType)get_store().find_element_user(RECEIPT$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.ReceiptType)get_store().add_element_user(RECEIPT$22);
            }
            target.set(receipt);
        }
    }
    
    /**
     * Appends and returns a new empty "receipt" element
     */
    public au.gov.asic.types.fss.ReceiptType addNewReceipt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.ReceiptType target = null;
            target = (au.gov.asic.types.fss.ReceiptType)get_store().add_element_user(RECEIPT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "receipt" element
     */
    public void unsetReceipt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIPT$22, 0);
        }
    }
    
    /**
     * Gets the "asicTransactionNumber" element
     */
    public java.lang.String getAsicTransactionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICTRANSACTIONNUMBER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "asicTransactionNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetAsicTransactionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASICTRANSACTIONNUMBER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "asicTransactionNumber" element
     */
    public boolean isSetAsicTransactionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASICTRANSACTIONNUMBER$24) != 0;
        }
    }
    
    /**
     * Sets the "asicTransactionNumber" element
     */
    public void setAsicTransactionNumber(java.lang.String asicTransactionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICTRANSACTIONNUMBER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICTRANSACTIONNUMBER$24);
            }
            target.setStringValue(asicTransactionNumber);
        }
    }
    
    /**
     * Sets (as xml) the "asicTransactionNumber" element
     */
    public void xsetAsicTransactionNumber(org.apache.xmlbeans.XmlString asicTransactionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASICTRANSACTIONNUMBER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASICTRANSACTIONNUMBER$24);
            }
            target.set(asicTransactionNumber);
        }
    }
    
    /**
     * Unsets the "asicTransactionNumber" element
     */
    public void unsetAsicTransactionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASICTRANSACTIONNUMBER$24, 0);
        }
    }
    
    /**
     * Gets the "transactionReferenceNumber" element
     */
    public java.lang.String getTransactionReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONREFERENCENUMBER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transactionReferenceNumber" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber xgetTransactionReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber)get_store().find_element_user(TRANSACTIONREFERENCENUMBER$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "transactionReferenceNumber" element
     */
    public boolean isSetTransactionReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONREFERENCENUMBER$26) != 0;
        }
    }
    
    /**
     * Sets the "transactionReferenceNumber" element
     */
    public void setTransactionReferenceNumber(java.lang.String transactionReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONREFERENCENUMBER$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONREFERENCENUMBER$26);
            }
            target.setStringValue(transactionReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "transactionReferenceNumber" element
     */
    public void xsetTransactionReferenceNumber(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber transactionReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber)get_store().find_element_user(TRANSACTIONREFERENCENUMBER$26, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber)get_store().add_element_user(TRANSACTIONREFERENCENUMBER$26);
            }
            target.set(transactionReferenceNumber);
        }
    }
    
    /**
     * Unsets the "transactionReferenceNumber" element
     */
    public void unsetTransactionReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONREFERENCENUMBER$26, 0);
        }
    }
    
    /**
     * Gets the "processMode" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode.Enum getProcessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSMODE$28, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "processMode" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode xgetProcessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode)get_store().find_element_user(PROCESSMODE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "processMode" element
     */
    public boolean isSetProcessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSMODE$28) != 0;
        }
    }
    
    /**
     * Sets the "processMode" element
     */
    public void setProcessMode(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode.Enum processMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSMODE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSMODE$28);
            }
            target.setEnumValue(processMode);
        }
    }
    
    /**
     * Sets (as xml) the "processMode" element
     */
    public void xsetProcessMode(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode processMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode)get_store().find_element_user(PROCESSMODE$28, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode)get_store().add_element_user(PROCESSMODE$28);
            }
            target.set(processMode);
        }
    }
    
    /**
     * Unsets the "processMode" element
     */
    public void unsetProcessMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSMODE$28, 0);
        }
    }
    /**
     * An XML messageType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$MessageType.
     */
    public static class MessageTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType
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
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$MessageReferenceNumber.
     */
    public static class MessageReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber
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
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$SenderId.
     */
    public static class SenderIdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId
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
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$SenderType.
     */
    public static class SenderTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType
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
    /**
     * An XML transactionReferenceNumber(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$TransactionReferenceNumber.
     */
    public static class TransactionReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber
    {
        
        public TransactionReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TransactionReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML processMode(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$ProcessMode.
     */
    public static class ProcessModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode
    {
        
        public ProcessModeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProcessModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
