/*
 * XML Type:  traceType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.TraceType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML traceType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TraceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.TraceType
{
    
    public TraceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateTime");
    private static final javax.xml.namespace.QName SOURCE$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "source");
    private static final javax.xml.namespace.QName TEXT$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "text");
    
    
    /**
     * Gets the "dateTime" element
     */
    public java.util.Calendar getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateTime" element
     */
    public boolean isSetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIME$0) != 0;
        }
    }
    
    /**
     * Sets the "dateTime" element
     */
    public void setDateTime(java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIME$0);
            }
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Sets (as xml) the "dateTime" element
     */
    public void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIME$0);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Unsets the "dateTime" element
     */
    public void unsetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIME$0, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public au.gov.asic.types.TraceType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType.Source target = null;
            target = (au.gov.asic.types.TraceType.Source)get_store().find_element_user(SOURCE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$2);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(au.gov.asic.types.TraceType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType.Source target = null;
            target = (au.gov.asic.types.TraceType.Source)get_store().find_element_user(SOURCE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TraceType.Source)get_store().add_element_user(SOURCE$2);
            }
            target.set(source);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public au.gov.asic.types.TraceType.Text xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType.Text target = null;
            target = (au.gov.asic.types.TraceType.Text)get_store().find_element_user(TEXT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$4);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(au.gov.asic.types.TraceType.Text text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TraceType.Text target = null;
            target = (au.gov.asic.types.TraceType.Text)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TraceType.Text)get_store().add_element_user(TEXT$4);
            }
            target.set(text);
        }
    }
    /**
     * An XML source(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.TraceType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.TraceType.Source
    {
        
        public SourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML text(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.TraceType$Text.
     */
    public static class TextImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.TraceType.Text
    {
        
        public TextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
