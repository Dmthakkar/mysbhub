/*
 * XML Type:  messageEventType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.MessageEventType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML messageEventType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class MessageEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.MessageEventType
{
    
    public MessageEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "errorCode");
    private static final javax.xml.namespace.QName SERVERITYCODE$2 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "serverityCode");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName LOCATIONPATH$6 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "locationPath");
    private static final javax.xml.namespace.QName DETAILS$8 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "details");
    
    
    /**
     * Gets the "errorCode" element
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorCode" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.ErrorCode xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.ErrorCode target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.ErrorCode)get_store().find_element_user(ERRORCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorCode" element
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$0);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "errorCode" element
     */
    public void xsetErrorCode(au.gov.asic.types.header.document.business.MessageEventType.ErrorCode errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.ErrorCode target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.ErrorCode)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.MessageEventType.ErrorCode)get_store().add_element_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Gets the "serverityCode" element
     */
    public java.lang.String getServerityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERITYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverityCode" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.ServerityCode xgetServerityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.ServerityCode target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.ServerityCode)get_store().find_element_user(SERVERITYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "serverityCode" element
     */
    public void setServerityCode(java.lang.String serverityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERITYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVERITYCODE$2);
            }
            target.setStringValue(serverityCode);
        }
    }
    
    /**
     * Sets (as xml) the "serverityCode" element
     */
    public void xsetServerityCode(au.gov.asic.types.header.document.business.MessageEventType.ServerityCode serverityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.ServerityCode target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.ServerityCode)get_store().find_element_user(SERVERITYCODE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.MessageEventType.ServerityCode)get_store().add_element_user(SERVERITYCODE$2);
            }
            target.set(serverityCode);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.Description target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(au.gov.asic.types.header.document.business.MessageEventType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.Description target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.MessageEventType.Description)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "locationPath" element
     */
    public java.lang.String getLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONPATH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationPath" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.LocationPath xgetLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.LocationPath target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.LocationPath)get_store().find_element_user(LOCATIONPATH$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "locationPath" element
     */
    public boolean isSetLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONPATH$6) != 0;
        }
    }
    
    /**
     * Sets the "locationPath" element
     */
    public void setLocationPath(java.lang.String locationPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONPATH$6);
            }
            target.setStringValue(locationPath);
        }
    }
    
    /**
     * Sets (as xml) the "locationPath" element
     */
    public void xsetLocationPath(au.gov.asic.types.header.document.business.MessageEventType.LocationPath locationPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.LocationPath target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.LocationPath)get_store().find_element_user(LOCATIONPATH$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.MessageEventType.LocationPath)get_store().add_element_user(LOCATIONPATH$6);
            }
            target.set(locationPath);
        }
    }
    
    /**
     * Unsets the "locationPath" element
     */
    public void unsetLocationPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONPATH$6, 0);
        }
    }
    
    /**
     * Gets array of all "details" elements
     */
    public java.lang.String[] getDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAILS$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "details" element
     */
    public java.lang.String getDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "details" elements
     */
    public au.gov.asic.types.header.document.business.MessageEventType.Details[] xgetDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAILS$8, targetList);
            au.gov.asic.types.header.document.business.MessageEventType.Details[] result = new au.gov.asic.types.header.document.business.MessageEventType.Details[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "details" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.Details xgetDetailsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.Details target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.Details)get_store().find_element_user(DETAILS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.header.document.business.MessageEventType.Details)target;
        }
    }
    
    /**
     * Returns number of "details" element
     */
    public int sizeOfDetailsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$8);
        }
    }
    
    /**
     * Sets array of all "details" element
     */
    public void setDetailsArray(java.lang.String[] detailsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(detailsArray, DETAILS$8);
        }
    }
    
    /**
     * Sets ith "details" element
     */
    public void setDetailsArray(int i, java.lang.String details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(details);
        }
    }
    
    /**
     * Sets (as xml) array of all "details" element
     */
    public void xsetDetailsArray(au.gov.asic.types.header.document.business.MessageEventType.Details[]detailsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(detailsArray, DETAILS$8);
        }
    }
    
    /**
     * Sets (as xml) ith "details" element
     */
    public void xsetDetailsArray(int i, au.gov.asic.types.header.document.business.MessageEventType.Details details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.Details target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.Details)get_store().find_element_user(DETAILS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(details);
        }
    }
    
    /**
     * Inserts the value as the ith "details" element
     */
    public void insertDetails(int i, java.lang.String details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DETAILS$8, i);
            target.setStringValue(details);
        }
    }
    
    /**
     * Appends the value as the last "details" element
     */
    public void addDetails(java.lang.String details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAILS$8);
            target.setStringValue(details);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "details" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.Details insertNewDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.Details target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.Details)get_store().insert_element_user(DETAILS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "details" element
     */
    public au.gov.asic.types.header.document.business.MessageEventType.Details addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.MessageEventType.Details target = null;
            target = (au.gov.asic.types.header.document.business.MessageEventType.Details)get_store().add_element_user(DETAILS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "details" element
     */
    public void removeDetails(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$8, i);
        }
    }
    /**
     * An XML errorCode(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$ErrorCode.
     */
    public static class ErrorCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.MessageEventType.ErrorCode
    {
        
        public ErrorCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ErrorCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML serverityCode(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$ServerityCode.
     */
    public static class ServerityCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.MessageEventType.ServerityCode
    {
        
        public ServerityCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ServerityCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML description(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.MessageEventType.Description
    {
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML locationPath(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$LocationPath.
     */
    public static class LocationPathImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.MessageEventType.LocationPath
    {
        
        public LocationPathImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LocationPathImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML details(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$Details.
     */
    public static class DetailsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.MessageEventType.Details
    {
        
        public DetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DetailsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
