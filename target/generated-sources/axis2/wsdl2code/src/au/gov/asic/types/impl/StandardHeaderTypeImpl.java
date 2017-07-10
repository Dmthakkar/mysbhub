/*
 * XML Type:  standardHeaderType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.StandardHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML standardHeaderType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class StandardHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.StandardHeaderType
{
    
    public StandardHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName DATERECEIVED$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateReceived");
    private static final javax.xml.namespace.QName TIMERECEIVED$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "timeReceived");
    private static final javax.xml.namespace.QName ENTEREDBYASIC$12 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "enteredByAsic");
    private static final javax.xml.namespace.QName DATECOMMENCED$14 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateCommenced");
    private static final javax.xml.namespace.QName TIMECOMMENCED$16 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "timeCommenced");
    private static final javax.xml.namespace.QName DATESUBMITTED$18 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateSubmitted");
    private static final javax.xml.namespace.QName TIMESUBMITTED$20 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "timeSubmitted");
    
    
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
    public au.gov.asic.types.StandardHeaderType.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardHeaderType.MessageType target = null;
            target = (au.gov.asic.types.StandardHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
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
    public void xsetMessageType(au.gov.asic.types.StandardHeaderType.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardHeaderType.MessageType target = null;
            target = (au.gov.asic.types.StandardHeaderType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardHeaderType.MessageType)get_store().add_element_user(MESSAGETYPE$0);
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
    public au.gov.asic.types.StandardHeaderType.MessageVersion xgetMessageVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardHeaderType.MessageVersion target = null;
            target = (au.gov.asic.types.StandardHeaderType.MessageVersion)get_store().find_element_user(MESSAGEVERSION$2, 0);
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
    public void xsetMessageVersion(au.gov.asic.types.StandardHeaderType.MessageVersion messageVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StandardHeaderType.MessageVersion target = null;
            target = (au.gov.asic.types.StandardHeaderType.MessageVersion)get_store().find_element_user(MESSAGEVERSION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StandardHeaderType.MessageVersion)get_store().add_element_user(MESSAGEVERSION$2);
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
     * Gets the "dateReceived" element
     */
    public java.util.Calendar getDateReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERECEIVED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateReceived" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERECEIVED$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateReceived" element
     */
    public boolean isSetDateReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATERECEIVED$8) != 0;
        }
    }
    
    /**
     * Sets the "dateReceived" element
     */
    public void setDateReceived(java.util.Calendar dateReceived)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERECEIVED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERECEIVED$8);
            }
            target.setCalendarValue(dateReceived);
        }
    }
    
    /**
     * Sets (as xml) the "dateReceived" element
     */
    public void xsetDateReceived(org.apache.xmlbeans.XmlDate dateReceived)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERECEIVED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERECEIVED$8);
            }
            target.set(dateReceived);
        }
    }
    
    /**
     * Unsets the "dateReceived" element
     */
    public void unsetDateReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATERECEIVED$8, 0);
        }
    }
    
    /**
     * Gets the "timeReceived" element
     */
    public java.util.Calendar getTimeReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMERECEIVED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeReceived" element
     */
    public org.apache.xmlbeans.XmlTime xgetTimeReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMERECEIVED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeReceived" element
     */
    public boolean isSetTimeReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMERECEIVED$10) != 0;
        }
    }
    
    /**
     * Sets the "timeReceived" element
     */
    public void setTimeReceived(java.util.Calendar timeReceived)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMERECEIVED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMERECEIVED$10);
            }
            target.setCalendarValue(timeReceived);
        }
    }
    
    /**
     * Sets (as xml) the "timeReceived" element
     */
    public void xsetTimeReceived(org.apache.xmlbeans.XmlTime timeReceived)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMERECEIVED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIMERECEIVED$10);
            }
            target.set(timeReceived);
        }
    }
    
    /**
     * Unsets the "timeReceived" element
     */
    public void unsetTimeReceived()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMERECEIVED$10, 0);
        }
    }
    
    /**
     * Gets the "enteredByAsic" element
     */
    public boolean getEnteredByAsic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTEREDBYASIC$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enteredByAsic" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnteredByAsic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTEREDBYASIC$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "enteredByAsic" element
     */
    public boolean isSetEnteredByAsic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTEREDBYASIC$12) != 0;
        }
    }
    
    /**
     * Sets the "enteredByAsic" element
     */
    public void setEnteredByAsic(boolean enteredByAsic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTEREDBYASIC$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTEREDBYASIC$12);
            }
            target.setBooleanValue(enteredByAsic);
        }
    }
    
    /**
     * Sets (as xml) the "enteredByAsic" element
     */
    public void xsetEnteredByAsic(org.apache.xmlbeans.XmlBoolean enteredByAsic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTEREDBYASIC$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENTEREDBYASIC$12);
            }
            target.set(enteredByAsic);
        }
    }
    
    /**
     * Unsets the "enteredByAsic" element
     */
    public void unsetEnteredByAsic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTEREDBYASIC$12, 0);
        }
    }
    
    /**
     * Gets the "dateCommenced" element
     */
    public java.util.Calendar getDateCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECOMMENCED$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateCommenced" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATECOMMENCED$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateCommenced" element
     */
    public boolean isSetDateCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATECOMMENCED$14) != 0;
        }
    }
    
    /**
     * Sets the "dateCommenced" element
     */
    public void setDateCommenced(java.util.Calendar dateCommenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECOMMENCED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECOMMENCED$14);
            }
            target.setCalendarValue(dateCommenced);
        }
    }
    
    /**
     * Sets (as xml) the "dateCommenced" element
     */
    public void xsetDateCommenced(org.apache.xmlbeans.XmlDate dateCommenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATECOMMENCED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATECOMMENCED$14);
            }
            target.set(dateCommenced);
        }
    }
    
    /**
     * Unsets the "dateCommenced" element
     */
    public void unsetDateCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATECOMMENCED$14, 0);
        }
    }
    
    /**
     * Gets the "timeCommenced" element
     */
    public java.util.Calendar getTimeCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECOMMENCED$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeCommenced" element
     */
    public org.apache.xmlbeans.XmlTime xgetTimeCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMECOMMENCED$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeCommenced" element
     */
    public boolean isSetTimeCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECOMMENCED$16) != 0;
        }
    }
    
    /**
     * Sets the "timeCommenced" element
     */
    public void setTimeCommenced(java.util.Calendar timeCommenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECOMMENCED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMECOMMENCED$16);
            }
            target.setCalendarValue(timeCommenced);
        }
    }
    
    /**
     * Sets (as xml) the "timeCommenced" element
     */
    public void xsetTimeCommenced(org.apache.xmlbeans.XmlTime timeCommenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMECOMMENCED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIMECOMMENCED$16);
            }
            target.set(timeCommenced);
        }
    }
    
    /**
     * Unsets the "timeCommenced" element
     */
    public void unsetTimeCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECOMMENCED$16, 0);
        }
    }
    
    /**
     * Gets the "dateSubmitted" element
     */
    public java.util.Calendar getDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESUBMITTED$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateSubmitted" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESUBMITTED$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateSubmitted" element
     */
    public boolean isSetDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATESUBMITTED$18) != 0;
        }
    }
    
    /**
     * Sets the "dateSubmitted" element
     */
    public void setDateSubmitted(java.util.Calendar dateSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESUBMITTED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESUBMITTED$18);
            }
            target.setCalendarValue(dateSubmitted);
        }
    }
    
    /**
     * Sets (as xml) the "dateSubmitted" element
     */
    public void xsetDateSubmitted(org.apache.xmlbeans.XmlDate dateSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESUBMITTED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATESUBMITTED$18);
            }
            target.set(dateSubmitted);
        }
    }
    
    /**
     * Unsets the "dateSubmitted" element
     */
    public void unsetDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATESUBMITTED$18, 0);
        }
    }
    
    /**
     * Gets the "timeSubmitted" element
     */
    public java.util.Calendar getTimeSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESUBMITTED$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeSubmitted" element
     */
    public org.apache.xmlbeans.XmlTime xgetTimeSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMESUBMITTED$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeSubmitted" element
     */
    public boolean isSetTimeSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESUBMITTED$20) != 0;
        }
    }
    
    /**
     * Sets the "timeSubmitted" element
     */
    public void setTimeSubmitted(java.util.Calendar timeSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESUBMITTED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESUBMITTED$20);
            }
            target.setCalendarValue(timeSubmitted);
        }
    }
    
    /**
     * Sets (as xml) the "timeSubmitted" element
     */
    public void xsetTimeSubmitted(org.apache.xmlbeans.XmlTime timeSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMESUBMITTED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIMESUBMITTED$20);
            }
            target.set(timeSubmitted);
        }
    }
    
    /**
     * Unsets the "timeSubmitted" element
     */
    public void unsetTimeSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESUBMITTED$20, 0);
        }
    }
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardHeaderType$MessageType.
     */
    public static class MessageTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StandardHeaderType.MessageType
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
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardHeaderType$MessageVersion.
     */
    public static class MessageVersionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.StandardHeaderType.MessageVersion
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
}
