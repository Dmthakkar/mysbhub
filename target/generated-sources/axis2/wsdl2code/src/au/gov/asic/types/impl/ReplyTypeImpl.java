/*
 * XML Type:  replyType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ReplyType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML replyType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ReplyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ReplyType
{
    
    public ReplyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEHEADER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageHeader");
    private static final javax.xml.namespace.QName MESSAGEIDENTIFIER$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "messageIdentifier");
    private static final javax.xml.namespace.QName RESULT$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "result");
    private static final javax.xml.namespace.QName EXCEPTIONLIST$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "exceptionList");
    private static final javax.xml.namespace.QName TRACELIST$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "traceList");
    private static final javax.xml.namespace.QName TIMESTAMPLIST$10 = 
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
     * Gets the "result" element
     */
    public au.gov.asic.types.ReplyType.Result getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReplyType.Result target = null;
            target = (au.gov.asic.types.ReplyType.Result)get_store().find_element_user(RESULT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "result" element
     */
    public void setResult(au.gov.asic.types.ReplyType.Result result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReplyType.Result target = null;
            target = (au.gov.asic.types.ReplyType.Result)get_store().find_element_user(RESULT$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ReplyType.Result)get_store().add_element_user(RESULT$4);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "result" element
     */
    public au.gov.asic.types.ReplyType.Result addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReplyType.Result target = null;
            target = (au.gov.asic.types.ReplyType.Result)get_store().add_element_user(RESULT$4);
            return target;
        }
    }
    
    /**
     * Gets the "exceptionList" element
     */
    public au.gov.asic.types.ExceptionListType getExceptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionListType target = null;
            target = (au.gov.asic.types.ExceptionListType)get_store().find_element_user(EXCEPTIONLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exceptionList" element
     */
    public boolean isSetExceptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCEPTIONLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "exceptionList" element
     */
    public void setExceptionList(au.gov.asic.types.ExceptionListType exceptionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionListType target = null;
            target = (au.gov.asic.types.ExceptionListType)get_store().find_element_user(EXCEPTIONLIST$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionListType)get_store().add_element_user(EXCEPTIONLIST$6);
            }
            target.set(exceptionList);
        }
    }
    
    /**
     * Appends and returns a new empty "exceptionList" element
     */
    public au.gov.asic.types.ExceptionListType addNewExceptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionListType target = null;
            target = (au.gov.asic.types.ExceptionListType)get_store().add_element_user(EXCEPTIONLIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "exceptionList" element
     */
    public void unsetExceptionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCEPTIONLIST$6, 0);
        }
    }
    
    /**
     * Gets the "traceList" element
     */
    public au.gov.asic.types.TraceListType getTraceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceListType target = null;
            target = (au.gov.asic.types.TraceListType)get_store().find_element_user(TRACELIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "traceList" element
     */
    public boolean isSetTraceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACELIST$8) != 0;
        }
    }
    
    /**
     * Sets the "traceList" element
     */
    public void setTraceList(au.gov.asic.types.TraceListType traceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceListType target = null;
            target = (au.gov.asic.types.TraceListType)get_store().find_element_user(TRACELIST$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TraceListType)get_store().add_element_user(TRACELIST$8);
            }
            target.set(traceList);
        }
    }
    
    /**
     * Appends and returns a new empty "traceList" element
     */
    public au.gov.asic.types.TraceListType addNewTraceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceListType target = null;
            target = (au.gov.asic.types.TraceListType)get_store().add_element_user(TRACELIST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "traceList" element
     */
    public void unsetTraceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACELIST$8, 0);
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
            target = (au.gov.asic.types.TimestampListType)get_store().find_element_user(TIMESTAMPLIST$10, 0);
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
            return get_store().count_elements(TIMESTAMPLIST$10) != 0;
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
            target = (au.gov.asic.types.TimestampListType)get_store().find_element_user(TIMESTAMPLIST$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TimestampListType)get_store().add_element_user(TIMESTAMPLIST$10);
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
            target = (au.gov.asic.types.TimestampListType)get_store().add_element_user(TIMESTAMPLIST$10);
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
            get_store().remove_element(TIMESTAMPLIST$10, 0);
        }
    }
    /**
     * An XML result(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class ResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ReplyType.Result
    {
        
        public ResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTFULFILLED$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestFulfilled");
        private static final javax.xml.namespace.QName REQUESTREJECTED$2 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestRejected");
        private static final javax.xml.namespace.QName REQUESTDELAYED$4 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestDelayed");
        private static final javax.xml.namespace.QName REQUESTFAILED$6 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "requestFailed");
        
        
        /**
         * Gets the "requestFulfilled" element
         */
        public boolean getRequestFulfilled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFULFILLED$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestFulfilled" element
         */
        public au.gov.asic.types.TrueType xgetRequestFulfilled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFULFILLED$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "requestFulfilled" element
         */
        public boolean isSetRequestFulfilled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTFULFILLED$0) != 0;
            }
        }
        
        /**
         * Sets the "requestFulfilled" element
         */
        public void setRequestFulfilled(boolean requestFulfilled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFULFILLED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTFULFILLED$0);
                }
                target.setBooleanValue(requestFulfilled);
            }
        }
        
        /**
         * Sets (as xml) the "requestFulfilled" element
         */
        public void xsetRequestFulfilled(au.gov.asic.types.TrueType requestFulfilled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFULFILLED$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTFULFILLED$0);
                }
                target.set(requestFulfilled);
            }
        }
        
        /**
         * Unsets the "requestFulfilled" element
         */
        public void unsetRequestFulfilled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTFULFILLED$0, 0);
            }
        }
        
        /**
         * Gets the "requestRejected" element
         */
        public boolean getRequestRejected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTREJECTED$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestRejected" element
         */
        public au.gov.asic.types.TrueType xgetRequestRejected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTREJECTED$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "requestRejected" element
         */
        public boolean isSetRequestRejected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTREJECTED$2) != 0;
            }
        }
        
        /**
         * Sets the "requestRejected" element
         */
        public void setRequestRejected(boolean requestRejected)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTREJECTED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTREJECTED$2);
                }
                target.setBooleanValue(requestRejected);
            }
        }
        
        /**
         * Sets (as xml) the "requestRejected" element
         */
        public void xsetRequestRejected(au.gov.asic.types.TrueType requestRejected)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTREJECTED$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTREJECTED$2);
                }
                target.set(requestRejected);
            }
        }
        
        /**
         * Unsets the "requestRejected" element
         */
        public void unsetRequestRejected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTREJECTED$2, 0);
            }
        }
        
        /**
         * Gets the "requestDelayed" element
         */
        public boolean getRequestDelayed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDELAYED$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestDelayed" element
         */
        public au.gov.asic.types.TrueType xgetRequestDelayed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTDELAYED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "requestDelayed" element
         */
        public boolean isSetRequestDelayed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTDELAYED$4) != 0;
            }
        }
        
        /**
         * Sets the "requestDelayed" element
         */
        public void setRequestDelayed(boolean requestDelayed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDELAYED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTDELAYED$4);
                }
                target.setBooleanValue(requestDelayed);
            }
        }
        
        /**
         * Sets (as xml) the "requestDelayed" element
         */
        public void xsetRequestDelayed(au.gov.asic.types.TrueType requestDelayed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTDELAYED$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTDELAYED$4);
                }
                target.set(requestDelayed);
            }
        }
        
        /**
         * Unsets the "requestDelayed" element
         */
        public void unsetRequestDelayed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTDELAYED$4, 0);
            }
        }
        
        /**
         * Gets the "requestFailed" element
         */
        public boolean getRequestFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFAILED$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestFailed" element
         */
        public au.gov.asic.types.TrueType xgetRequestFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFAILED$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "requestFailed" element
         */
        public boolean isSetRequestFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTFAILED$6) != 0;
            }
        }
        
        /**
         * Sets the "requestFailed" element
         */
        public void setRequestFailed(boolean requestFailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTFAILED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTFAILED$6);
                }
                target.setBooleanValue(requestFailed);
            }
        }
        
        /**
         * Sets (as xml) the "requestFailed" element
         */
        public void xsetRequestFailed(au.gov.asic.types.TrueType requestFailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.TrueType target = null;
                target = (au.gov.asic.types.TrueType)get_store().find_element_user(REQUESTFAILED$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.TrueType)get_store().add_element_user(REQUESTFAILED$6);
                }
                target.set(requestFailed);
            }
        }
        
        /**
         * Unsets the "requestFailed" element
         */
        public void unsetRequestFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTFAILED$6, 0);
            }
        }
    }
}
