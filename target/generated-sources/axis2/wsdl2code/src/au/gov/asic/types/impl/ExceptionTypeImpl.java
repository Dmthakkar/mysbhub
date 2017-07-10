/*
 * XML Type:  exceptionType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ExceptionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML exceptionType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ExceptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ExceptionType
{
    
    public ExceptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName SEVERITY$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "severity");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName USERDESCRIPTION$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "userDescription");
    private static final javax.xml.namespace.QName CONTEXT$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "context");
    private static final javax.xml.namespace.QName NODEXPATH$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "nodeXPath");
    
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.ExceptionType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Code target = null;
            target = (au.gov.asic.types.ExceptionType.Code)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(au.gov.asic.types.ExceptionType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Code target = null;
            target = (au.gov.asic.types.ExceptionType.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionType.Code)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "severity" element
     */
    public au.gov.asic.types.ExceptionType.Severity.Enum getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.ExceptionType.Severity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "severity" element
     */
    public au.gov.asic.types.ExceptionType.Severity xgetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Severity target = null;
            target = (au.gov.asic.types.ExceptionType.Severity)get_store().find_element_user(SEVERITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "severity" element
     */
    public void setSeverity(au.gov.asic.types.ExceptionType.Severity.Enum severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITY$2);
            }
            target.setEnumValue(severity);
        }
    }
    
    /**
     * Sets (as xml) the "severity" element
     */
    public void xsetSeverity(au.gov.asic.types.ExceptionType.Severity severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Severity target = null;
            target = (au.gov.asic.types.ExceptionType.Severity)get_store().find_element_user(SEVERITY$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionType.Severity)get_store().add_element_user(SEVERITY$2);
            }
            target.set(severity);
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
    public au.gov.asic.types.ExceptionType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Description target = null;
            target = (au.gov.asic.types.ExceptionType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
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
    public void xsetDescription(au.gov.asic.types.ExceptionType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Description target = null;
            target = (au.gov.asic.types.ExceptionType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionType.Description)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "userDescription" element
     */
    public java.lang.String getUserDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userDescription" element
     */
    public au.gov.asic.types.ExceptionType.UserDescription xgetUserDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.UserDescription target = null;
            target = (au.gov.asic.types.ExceptionType.UserDescription)get_store().find_element_user(USERDESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "userDescription" element
     */
    public boolean isSetUserDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERDESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "userDescription" element
     */
    public void setUserDescription(java.lang.String userDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERDESCRIPTION$6);
            }
            target.setStringValue(userDescription);
        }
    }
    
    /**
     * Sets (as xml) the "userDescription" element
     */
    public void xsetUserDescription(au.gov.asic.types.ExceptionType.UserDescription userDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.UserDescription target = null;
            target = (au.gov.asic.types.ExceptionType.UserDescription)get_store().find_element_user(USERDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionType.UserDescription)get_store().add_element_user(USERDESCRIPTION$6);
            }
            target.set(userDescription);
        }
    }
    
    /**
     * Unsets the "userDescription" element
     */
    public void unsetUserDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERDESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "context" element
     */
    public au.gov.asic.types.ExceptionType.Context getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Context target = null;
            target = (au.gov.asic.types.ExceptionType.Context)get_store().find_element_user(CONTEXT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$8) != 0;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(au.gov.asic.types.ExceptionType.Context context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Context target = null;
            target = (au.gov.asic.types.ExceptionType.Context)get_store().find_element_user(CONTEXT$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionType.Context)get_store().add_element_user(CONTEXT$8);
            }
            target.set(context);
        }
    }
    
    /**
     * Appends and returns a new empty "context" element
     */
    public au.gov.asic.types.ExceptionType.Context addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.Context target = null;
            target = (au.gov.asic.types.ExceptionType.Context)get_store().add_element_user(CONTEXT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$8, 0);
        }
    }
    
    /**
     * Gets the "nodeXPath" element
     */
    public java.lang.String getNodeXPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODEXPATH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nodeXPath" element
     */
    public au.gov.asic.types.ExceptionType.NodeXPath xgetNodeXPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.NodeXPath target = null;
            target = (au.gov.asic.types.ExceptionType.NodeXPath)get_store().find_element_user(NODEXPATH$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "nodeXPath" element
     */
    public boolean isSetNodeXPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NODEXPATH$10) != 0;
        }
    }
    
    /**
     * Sets the "nodeXPath" element
     */
    public void setNodeXPath(java.lang.String nodeXPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODEXPATH$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NODEXPATH$10);
            }
            target.setStringValue(nodeXPath);
        }
    }
    
    /**
     * Sets (as xml) the "nodeXPath" element
     */
    public void xsetNodeXPath(au.gov.asic.types.ExceptionType.NodeXPath nodeXPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ExceptionType.NodeXPath target = null;
            target = (au.gov.asic.types.ExceptionType.NodeXPath)get_store().find_element_user(NODEXPATH$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ExceptionType.NodeXPath)get_store().add_element_user(NODEXPATH$10);
            }
            target.set(nodeXPath);
        }
    }
    
    /**
     * Unsets the "nodeXPath" element
     */
    public void unsetNodeXPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NODEXPATH$10, 0);
        }
    }
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ExceptionType.Code
    {
        
        public CodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML severity(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Severity.
     */
    public static class SeverityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.ExceptionType.Severity
    {
        
        public SeverityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SeverityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML description(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ExceptionType.Description
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
     * An XML userDescription(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$UserDescription.
     */
    public static class UserDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ExceptionType.UserDescription
    {
        
        public UserDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UserDescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML context(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class ContextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ExceptionType.Context
    {
        
        public ContextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINE$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "line");
        
        
        /**
         * Gets array of all "line" elements
         */
        public java.lang.String[] getLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "line" element
         */
        public java.lang.String getLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "line" elements
         */
        public au.gov.asic.types.ExceptionType.Context.Line[] xgetLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINE$0, targetList);
                au.gov.asic.types.ExceptionType.Context.Line[] result = new au.gov.asic.types.ExceptionType.Context.Line[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "line" element
         */
        public au.gov.asic.types.ExceptionType.Context.Line xgetLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ExceptionType.Context.Line target = null;
                target = (au.gov.asic.types.ExceptionType.Context.Line)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (au.gov.asic.types.ExceptionType.Context.Line)target;
            }
        }
        
        /**
         * Returns number of "line" element
         */
        public int sizeOfLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINE$0);
            }
        }
        
        /**
         * Sets array of all "line" element
         */
        public void setLineArray(java.lang.String[] lineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lineArray, LINE$0);
            }
        }
        
        /**
         * Sets ith "line" element
         */
        public void setLineArray(int i, java.lang.String line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(line);
            }
        }
        
        /**
         * Sets (as xml) array of all "line" element
         */
        public void xsetLineArray(au.gov.asic.types.ExceptionType.Context.Line[]lineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lineArray, LINE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "line" element
         */
        public void xsetLineArray(int i, au.gov.asic.types.ExceptionType.Context.Line line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ExceptionType.Context.Line target = null;
                target = (au.gov.asic.types.ExceptionType.Context.Line)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(line);
            }
        }
        
        /**
         * Inserts the value as the ith "line" element
         */
        public void insertLine(int i, java.lang.String line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LINE$0, i);
                target.setStringValue(line);
            }
        }
        
        /**
         * Appends the value as the last "line" element
         */
        public void addLine(java.lang.String line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE$0);
                target.setStringValue(line);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "line" element
         */
        public au.gov.asic.types.ExceptionType.Context.Line insertNewLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ExceptionType.Context.Line target = null;
                target = (au.gov.asic.types.ExceptionType.Context.Line)get_store().insert_element_user(LINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line" element
         */
        public au.gov.asic.types.ExceptionType.Context.Line addNewLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ExceptionType.Context.Line target = null;
                target = (au.gov.asic.types.ExceptionType.Context.Line)get_store().add_element_user(LINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "line" element
         */
        public void removeLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINE$0, i);
            }
        }
        /**
         * An XML line(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Context$Line.
         */
        public static class LineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ExceptionType.Context.Line
        {
            
            public LineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected LineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML nodeXPath(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$NodeXPath.
     */
    public static class NodeXPathImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ExceptionType.NodeXPath
    {
        
        public NodeXPathImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NodeXPathImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
