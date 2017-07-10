/*
 * XML Type:  itemSummaryType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ItemSummaryType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML itemSummaryType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ItemSummaryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ItemSummaryType
{
    
    public ItemSummaryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETYPE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageType");
    private static final javax.xml.namespace.QName MESSAGEVERSION$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageVersion");
    private static final javax.xml.namespace.QName REPORTINGENTITY$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "reportingEntity");
    private static final javax.xml.namespace.QName ITEMIDENTIFIER$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "itemIdentifier");
    private static final javax.xml.namespace.QName LODGEDDATE$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "lodgedDate");
    private static final javax.xml.namespace.QName RESULT$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "result");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "status");
    
    
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
    public au.gov.asic.types.ItemSummaryType.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ItemSummaryType.MessageType target = null;
            target = (au.gov.asic.types.ItemSummaryType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
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
    public void xsetMessageType(au.gov.asic.types.ItemSummaryType.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ItemSummaryType.MessageType target = null;
            target = (au.gov.asic.types.ItemSummaryType.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ItemSummaryType.MessageType)get_store().add_element_user(MESSAGETYPE$0);
            }
            target.set(messageType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$2, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MESSAGEVERSION$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEVERSION$2);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MESSAGEVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MESSAGEVERSION$2);
            }
            target.set(messageVersion);
        }
    }
    
    /**
     * Gets the "reportingEntity" element
     */
    public au.gov.asic.types.EntityType getReportingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EntityType target = null;
            target = (au.gov.asic.types.EntityType)get_store().find_element_user(REPORTINGENTITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportingEntity" element
     */
    public boolean isSetReportingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGENTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "reportingEntity" element
     */
    public void setReportingEntity(au.gov.asic.types.EntityType reportingEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EntityType target = null;
            target = (au.gov.asic.types.EntityType)get_store().find_element_user(REPORTINGENTITY$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EntityType)get_store().add_element_user(REPORTINGENTITY$4);
            }
            target.set(reportingEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "reportingEntity" element
     */
    public au.gov.asic.types.EntityType addNewReportingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EntityType target = null;
            target = (au.gov.asic.types.EntityType)get_store().add_element_user(REPORTINGENTITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "reportingEntity" element
     */
    public void unsetReportingEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGENTITY$4, 0);
        }
    }
    
    /**
     * Gets the "itemIdentifier" element
     */
    public au.gov.asic.types.OutboundItemIdentifierType getItemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OutboundItemIdentifierType target = null;
            target = (au.gov.asic.types.OutboundItemIdentifierType)get_store().find_element_user(ITEMIDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "itemIdentifier" element
     */
    public void setItemIdentifier(au.gov.asic.types.OutboundItemIdentifierType itemIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OutboundItemIdentifierType target = null;
            target = (au.gov.asic.types.OutboundItemIdentifierType)get_store().find_element_user(ITEMIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.OutboundItemIdentifierType)get_store().add_element_user(ITEMIDENTIFIER$6);
            }
            target.set(itemIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "itemIdentifier" element
     */
    public au.gov.asic.types.OutboundItemIdentifierType addNewItemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OutboundItemIdentifierType target = null;
            target = (au.gov.asic.types.OutboundItemIdentifierType)get_store().add_element_user(ITEMIDENTIFIER$6);
            return target;
        }
    }
    
    /**
     * Gets the "lodgedDate" element
     */
    public java.util.Calendar getLodgedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LODGEDDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lodgedDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetLodgedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LODGEDDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lodgedDate" element
     */
    public void setLodgedDate(java.util.Calendar lodgedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LODGEDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LODGEDDATE$8);
            }
            target.setCalendarValue(lodgedDate);
        }
    }
    
    /**
     * Sets (as xml) the "lodgedDate" element
     */
    public void xsetLodgedDate(org.apache.xmlbeans.XmlDate lodgedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LODGEDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LODGEDDATE$8);
            }
            target.set(lodgedDate);
        }
    }
    
    /**
     * Gets the "result" element
     */
    public au.gov.asic.types.ResultType getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ResultType target = null;
            target = (au.gov.asic.types.ResultType)get_store().find_element_user(RESULT$10, 0);
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
            return get_store().count_elements(RESULT$10) != 0;
        }
    }
    
    /**
     * Sets the "result" element
     */
    public void setResult(au.gov.asic.types.ResultType result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ResultType target = null;
            target = (au.gov.asic.types.ResultType)get_store().find_element_user(RESULT$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ResultType)get_store().add_element_user(RESULT$10);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "result" element
     */
    public au.gov.asic.types.ResultType addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ResultType target = null;
            target = (au.gov.asic.types.ResultType)get_store().add_element_user(RESULT$10);
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
            get_store().remove_element(RESULT$10, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public au.gov.asic.types.ApplicationStatusType.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.ApplicationStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public au.gov.asic.types.ApplicationStatusType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ApplicationStatusType target = null;
            target = (au.gov.asic.types.ApplicationStatusType)get_store().find_element_user(STATUS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(au.gov.asic.types.ApplicationStatusType.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$12);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(au.gov.asic.types.ApplicationStatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ApplicationStatusType target = null;
            target = (au.gov.asic.types.ApplicationStatusType)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ApplicationStatusType)get_store().add_element_user(STATUS$12);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$12, 0);
        }
    }
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ItemSummaryType$MessageType.
     */
    public static class MessageTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ItemSummaryType.MessageType
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
}
