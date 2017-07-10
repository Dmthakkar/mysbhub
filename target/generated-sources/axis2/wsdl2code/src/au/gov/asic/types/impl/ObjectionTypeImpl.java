/*
 * XML Type:  objectionType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ObjectionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML objectionType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ObjectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ObjectionType
{
    
    public ObjectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName DESCRIPTIONS$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "descriptions");
    private static final javax.xml.namespace.QName CONTEXT$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "context");
    
    
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
    public au.gov.asic.types.ObjectionType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Code target = null;
            target = (au.gov.asic.types.ObjectionType.Code)get_store().find_element_user(CODE$0, 0);
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
    public void xsetCode(au.gov.asic.types.ObjectionType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Code target = null;
            target = (au.gov.asic.types.ObjectionType.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ObjectionType.Code)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "descriptions" element
     */
    public java.lang.String getDescriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptions" element
     */
    public au.gov.asic.types.ObjectionType.Descriptions xgetDescriptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Descriptions target = null;
            target = (au.gov.asic.types.ObjectionType.Descriptions)get_store().find_element_user(DESCRIPTIONS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "descriptions" element
     */
    public void setDescriptions(java.lang.String descriptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONS$2);
            }
            target.setStringValue(descriptions);
        }
    }
    
    /**
     * Sets (as xml) the "descriptions" element
     */
    public void xsetDescriptions(au.gov.asic.types.ObjectionType.Descriptions descriptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Descriptions target = null;
            target = (au.gov.asic.types.ObjectionType.Descriptions)get_store().find_element_user(DESCRIPTIONS$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ObjectionType.Descriptions)get_store().add_element_user(DESCRIPTIONS$2);
            }
            target.set(descriptions);
        }
    }
    
    /**
     * Gets the "context" element
     */
    public au.gov.asic.types.ObjectionType.Context getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Context target = null;
            target = (au.gov.asic.types.ObjectionType.Context)get_store().find_element_user(CONTEXT$4, 0);
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
            return get_store().count_elements(CONTEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(au.gov.asic.types.ObjectionType.Context context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Context target = null;
            target = (au.gov.asic.types.ObjectionType.Context)get_store().find_element_user(CONTEXT$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ObjectionType.Context)get_store().add_element_user(CONTEXT$4);
            }
            target.set(context);
        }
    }
    
    /**
     * Appends and returns a new empty "context" element
     */
    public au.gov.asic.types.ObjectionType.Context addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType.Context target = null;
            target = (au.gov.asic.types.ObjectionType.Context)get_store().add_element_user(CONTEXT$4);
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
            get_store().remove_element(CONTEXT$4, 0);
        }
    }
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ObjectionType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ObjectionType.Code
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
     * An XML descriptions(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ObjectionType$Descriptions.
     */
    public static class DescriptionsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ObjectionType.Descriptions
    {
        
        public DescriptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML context(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class ContextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ObjectionType.Context
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
        public au.gov.asic.types.ObjectionType.Context.Line[] xgetLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINE$0, targetList);
                au.gov.asic.types.ObjectionType.Context.Line[] result = new au.gov.asic.types.ObjectionType.Context.Line[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "line" element
         */
        public au.gov.asic.types.ObjectionType.Context.Line xgetLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ObjectionType.Context.Line target = null;
                target = (au.gov.asic.types.ObjectionType.Context.Line)get_store().find_element_user(LINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (au.gov.asic.types.ObjectionType.Context.Line)target;
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
        public void xsetLineArray(au.gov.asic.types.ObjectionType.Context.Line[]lineArray)
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
        public void xsetLineArray(int i, au.gov.asic.types.ObjectionType.Context.Line line)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ObjectionType.Context.Line target = null;
                target = (au.gov.asic.types.ObjectionType.Context.Line)get_store().find_element_user(LINE$0, i);
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
        public au.gov.asic.types.ObjectionType.Context.Line insertNewLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ObjectionType.Context.Line target = null;
                target = (au.gov.asic.types.ObjectionType.Context.Line)get_store().insert_element_user(LINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line" element
         */
        public au.gov.asic.types.ObjectionType.Context.Line addNewLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.ObjectionType.Context.Line target = null;
                target = (au.gov.asic.types.ObjectionType.Context.Line)get_store().add_element_user(LINE$0);
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
         * This is an atomic type that is a restriction of au.gov.asic.types.ObjectionType$Context$Line.
         */
        public static class LineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.ObjectionType.Context.Line
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
}
