/*
 * XML Type:  itemSearchScopeType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ItemSearchScopeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML itemSearchScopeType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ItemSearchScopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ItemSearchScopeType
{
    
    public ItemSearchScopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMTYPE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "itemType");
    private static final javax.xml.namespace.QName MESSAGETYPE$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageType");
    private static final javax.xml.namespace.QName REPORTINGENTITYABN$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "reportingEntityAbn");
    private static final javax.xml.namespace.QName REPORTINGENTITYACN$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "reportingEntityAcn");
    private static final javax.xml.namespace.QName DATESTART$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateStart");
    private static final javax.xml.namespace.QName DATEEND$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateEnd");
    private static final javax.xml.namespace.QName UNREADONLY$12 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "unreadOnly");
    
    
    /**
     * Gets the "itemType" element
     */
    public au.gov.asic.types.ItemTypeType.Enum getItemType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.ItemTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemType" element
     */
    public au.gov.asic.types.ItemTypeType xgetItemType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ItemTypeType target = null;
            target = (au.gov.asic.types.ItemTypeType)get_store().find_element_user(ITEMTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "itemType" element
     */
    public void setItemType(au.gov.asic.types.ItemTypeType.Enum itemType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEMTYPE$0);
            }
            target.setEnumValue(itemType);
        }
    }
    
    /**
     * Sets (as xml) the "itemType" element
     */
    public void xsetItemType(au.gov.asic.types.ItemTypeType itemType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ItemTypeType target = null;
            target = (au.gov.asic.types.ItemTypeType)get_store().find_element_user(ITEMTYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ItemTypeType)get_store().add_element_user(ITEMTYPE$0);
            }
            target.set(itemType);
        }
    }
    
    /**
     * Gets the "messageType" element
     */
    public java.lang.String getMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$2, 0);
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
    public au.gov.asic.types.ItemSearchScopeType.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ItemSearchScopeType.MessageType target = null;
            target = (au.gov.asic.types.ItemSearchScopeType.MessageType)get_store().find_element_user(MESSAGETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "messageType" element
     */
    public boolean isSetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGETYPE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGETYPE$2);
            }
            target.setStringValue(messageType);
        }
    }
    
    /**
     * Sets (as xml) the "messageType" element
     */
    public void xsetMessageType(au.gov.asic.types.ItemSearchScopeType.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ItemSearchScopeType.MessageType target = null;
            target = (au.gov.asic.types.ItemSearchScopeType.MessageType)get_store().find_element_user(MESSAGETYPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ItemSearchScopeType.MessageType)get_store().add_element_user(MESSAGETYPE$2);
            }
            target.set(messageType);
        }
    }
    
    /**
     * Unsets the "messageType" element
     */
    public void unsetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGETYPE$2, 0);
        }
    }
    
    /**
     * Gets the "reportingEntityAbn" element
     */
    public java.lang.String getReportingEntityAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGENTITYABN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingEntityAbn" element
     */
    public au.gov.asic.types.AbnType xgetReportingEntityAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(REPORTINGENTITYABN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "reportingEntityAbn" element
     */
    public boolean isSetReportingEntityAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGENTITYABN$4) != 0;
        }
    }
    
    /**
     * Sets the "reportingEntityAbn" element
     */
    public void setReportingEntityAbn(java.lang.String reportingEntityAbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGENTITYABN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGENTITYABN$4);
            }
            target.setStringValue(reportingEntityAbn);
        }
    }
    
    /**
     * Sets (as xml) the "reportingEntityAbn" element
     */
    public void xsetReportingEntityAbn(au.gov.asic.types.AbnType reportingEntityAbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(REPORTINGENTITYABN$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(REPORTINGENTITYABN$4);
            }
            target.set(reportingEntityAbn);
        }
    }
    
    /**
     * Unsets the "reportingEntityAbn" element
     */
    public void unsetReportingEntityAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGENTITYABN$4, 0);
        }
    }
    
    /**
     * Gets the "reportingEntityAcn" element
     */
    public int getReportingEntityAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGENTITYACN$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingEntityAcn" element
     */
    public au.gov.asic.types.NniNumberType xgetReportingEntityAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(REPORTINGENTITYACN$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "reportingEntityAcn" element
     */
    public boolean isSetReportingEntityAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGENTITYACN$6) != 0;
        }
    }
    
    /**
     * Sets the "reportingEntityAcn" element
     */
    public void setReportingEntityAcn(int reportingEntityAcn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGENTITYACN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGENTITYACN$6);
            }
            target.setIntValue(reportingEntityAcn);
        }
    }
    
    /**
     * Sets (as xml) the "reportingEntityAcn" element
     */
    public void xsetReportingEntityAcn(au.gov.asic.types.NniNumberType reportingEntityAcn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(REPORTINGENTITYACN$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(REPORTINGENTITYACN$6);
            }
            target.set(reportingEntityAcn);
        }
    }
    
    /**
     * Unsets the "reportingEntityAcn" element
     */
    public void unsetReportingEntityAcn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGENTITYACN$6, 0);
        }
    }
    
    /**
     * Gets the "dateStart" element
     */
    public java.util.Calendar getDateStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESTART$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateStart" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESTART$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateStart" element
     */
    public boolean isSetDateStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATESTART$8) != 0;
        }
    }
    
    /**
     * Sets the "dateStart" element
     */
    public void setDateStart(java.util.Calendar dateStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESTART$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESTART$8);
            }
            target.setCalendarValue(dateStart);
        }
    }
    
    /**
     * Sets (as xml) the "dateStart" element
     */
    public void xsetDateStart(org.apache.xmlbeans.XmlDate dateStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESTART$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATESTART$8);
            }
            target.set(dateStart);
        }
    }
    
    /**
     * Unsets the "dateStart" element
     */
    public void unsetDateStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATESTART$8, 0);
        }
    }
    
    /**
     * Gets the "dateEnd" element
     */
    public java.util.Calendar getDateEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEEND$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateEnd" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEEND$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateEnd" element
     */
    public boolean isSetDateEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEEND$10) != 0;
        }
    }
    
    /**
     * Sets the "dateEnd" element
     */
    public void setDateEnd(java.util.Calendar dateEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEEND$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEEND$10);
            }
            target.setCalendarValue(dateEnd);
        }
    }
    
    /**
     * Sets (as xml) the "dateEnd" element
     */
    public void xsetDateEnd(org.apache.xmlbeans.XmlDate dateEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEEND$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEEND$10);
            }
            target.set(dateEnd);
        }
    }
    
    /**
     * Unsets the "dateEnd" element
     */
    public void unsetDateEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEEND$10, 0);
        }
    }
    
    /**
     * Gets the "unreadOnly" element
     */
    public boolean getUnreadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNREADONLY$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "unreadOnly" element
     */
    public au.gov.asic.types.TrueType xgetUnreadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(UNREADONLY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "unreadOnly" element
     */
    public boolean isSetUnreadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNREADONLY$12) != 0;
        }
    }
    
    /**
     * Sets the "unreadOnly" element
     */
    public void setUnreadOnly(boolean unreadOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNREADONLY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNREADONLY$12);
            }
            target.setBooleanValue(unreadOnly);
        }
    }
    
    /**
     * Sets (as xml) the "unreadOnly" element
     */
    public void xsetUnreadOnly(au.gov.asic.types.TrueType unreadOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(UNREADONLY$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(UNREADONLY$12);
            }
            target.set(unreadOnly);
        }
    }
    
    /**
     * Unsets the "unreadOnly" element
     */
    public void unsetUnreadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNREADONLY$12, 0);
        }
    }
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ItemSearchScopeType$MessageType.
     */
    public static class MessageTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ItemSearchScopeType.MessageType
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
