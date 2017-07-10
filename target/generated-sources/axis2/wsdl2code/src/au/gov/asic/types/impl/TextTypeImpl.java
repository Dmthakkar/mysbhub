/*
 * XML Type:  textType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.TextType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML textType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TextTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.TextType
{
    
    public TextTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARA$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "para");
    
    
    /**
     * Gets array of all "para" elements
     */
    public java.lang.String[] getParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARA$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "para" element
     */
    public java.lang.String getParaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "para" elements
     */
    public au.gov.asic.types.TextType.Para[] xgetParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARA$0, targetList);
            au.gov.asic.types.TextType.Para[] result = new au.gov.asic.types.TextType.Para[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "para" element
     */
    public au.gov.asic.types.TextType.Para xgetParaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TextType.Para target = null;
            target = (au.gov.asic.types.TextType.Para)get_store().find_element_user(PARA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.TextType.Para)target;
        }
    }
    
    /**
     * Returns number of "para" element
     */
    public int sizeOfParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARA$0);
        }
    }
    
    /**
     * Sets array of all "para" element
     */
    public void setParaArray(java.lang.String[] paraArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(paraArray, PARA$0);
        }
    }
    
    /**
     * Sets ith "para" element
     */
    public void setParaArray(int i, java.lang.String para)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(para);
        }
    }
    
    /**
     * Sets (as xml) array of all "para" element
     */
    public void xsetParaArray(au.gov.asic.types.TextType.Para[]paraArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(paraArray, PARA$0);
        }
    }
    
    /**
     * Sets (as xml) ith "para" element
     */
    public void xsetParaArray(int i, au.gov.asic.types.TextType.Para para)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TextType.Para target = null;
            target = (au.gov.asic.types.TextType.Para)get_store().find_element_user(PARA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(para);
        }
    }
    
    /**
     * Inserts the value as the ith "para" element
     */
    public void insertPara(int i, java.lang.String para)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARA$0, i);
            target.setStringValue(para);
        }
    }
    
    /**
     * Appends the value as the last "para" element
     */
    public void addPara(java.lang.String para)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARA$0);
            target.setStringValue(para);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "para" element
     */
    public au.gov.asic.types.TextType.Para insertNewPara(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TextType.Para target = null;
            target = (au.gov.asic.types.TextType.Para)get_store().insert_element_user(PARA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "para" element
     */
    public au.gov.asic.types.TextType.Para addNewPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TextType.Para target = null;
            target = (au.gov.asic.types.TextType.Para)get_store().add_element_user(PARA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "para" element
     */
    public void removePara(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARA$0, i);
        }
    }
    /**
     * An XML para(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.TextType$Para.
     */
    public static class ParaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.TextType.Para
    {
        
        public ParaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ParaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
