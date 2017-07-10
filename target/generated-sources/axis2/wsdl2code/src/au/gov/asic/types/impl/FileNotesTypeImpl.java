/*
 * XML Type:  fileNotesType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.FileNotesType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML fileNotesType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FileNotesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.FileNotesType
{
    
    public FileNotesTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public au.gov.asic.types.FileNotesType.Line[] xgetLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINE$0, targetList);
            au.gov.asic.types.FileNotesType.Line[] result = new au.gov.asic.types.FileNotesType.Line[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "line" element
     */
    public au.gov.asic.types.FileNotesType.Line xgetLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType.Line target = null;
            target = (au.gov.asic.types.FileNotesType.Line)get_store().find_element_user(LINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.FileNotesType.Line)target;
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
    public void xsetLineArray(au.gov.asic.types.FileNotesType.Line[]lineArray)
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
    public void xsetLineArray(int i, au.gov.asic.types.FileNotesType.Line line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType.Line target = null;
            target = (au.gov.asic.types.FileNotesType.Line)get_store().find_element_user(LINE$0, i);
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
    public au.gov.asic.types.FileNotesType.Line insertNewLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType.Line target = null;
            target = (au.gov.asic.types.FileNotesType.Line)get_store().insert_element_user(LINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    public au.gov.asic.types.FileNotesType.Line addNewLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType.Line target = null;
            target = (au.gov.asic.types.FileNotesType.Line)get_store().add_element_user(LINE$0);
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
     * This is an atomic type that is a restriction of au.gov.asic.types.FileNotesType$Line.
     */
    public static class LineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.FileNotesType.Line
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
