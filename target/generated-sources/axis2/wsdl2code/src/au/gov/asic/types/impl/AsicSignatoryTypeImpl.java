/*
 * XML Type:  asicSignatoryType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AsicSignatoryType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML asicSignatoryType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AsicSignatoryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AsicSignatoryType
{
    
    public AsicSignatoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName CAPACITY$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "capacity");
    private static final javax.xml.namespace.QName FILENAME$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "filename");
    private static final javax.xml.namespace.QName DATESIGNED$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateSigned");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public au.gov.asic.types.AsicSignatoryType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicSignatoryType.Name target = null;
            target = (au.gov.asic.types.AsicSignatoryType.Name)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.AsicSignatoryType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicSignatoryType.Name target = null;
            target = (au.gov.asic.types.AsicSignatoryType.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicSignatoryType.Name)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "capacity" element
     */
    public java.lang.String getCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "capacity" element
     */
    public au.gov.asic.types.AsicSignatoryType.Capacity xgetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicSignatoryType.Capacity target = null;
            target = (au.gov.asic.types.AsicSignatoryType.Capacity)get_store().find_element_user(CAPACITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "capacity" element
     */
    public void setCapacity(java.lang.String capacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITY$2);
            }
            target.setStringValue(capacity);
        }
    }
    
    /**
     * Sets (as xml) the "capacity" element
     */
    public void xsetCapacity(au.gov.asic.types.AsicSignatoryType.Capacity capacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicSignatoryType.Capacity target = null;
            target = (au.gov.asic.types.AsicSignatoryType.Capacity)get_store().find_element_user(CAPACITY$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicSignatoryType.Capacity)get_store().add_element_user(CAPACITY$2);
            }
            target.set(capacity);
        }
    }
    
    /**
     * Gets the "filename" element
     */
    public java.lang.String getFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "filename" element
     */
    public au.gov.asic.types.AsicSignatoryType.Filename xgetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicSignatoryType.Filename target = null;
            target = (au.gov.asic.types.AsicSignatoryType.Filename)get_store().find_element_user(FILENAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "filename" element
     */
    public void setFilename(java.lang.String filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$4);
            }
            target.setStringValue(filename);
        }
    }
    
    /**
     * Sets (as xml) the "filename" element
     */
    public void xsetFilename(au.gov.asic.types.AsicSignatoryType.Filename filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicSignatoryType.Filename target = null;
            target = (au.gov.asic.types.AsicSignatoryType.Filename)get_store().find_element_user(FILENAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicSignatoryType.Filename)get_store().add_element_user(FILENAME$4);
            }
            target.set(filename);
        }
    }
    
    /**
     * Gets the "dateSigned" element
     */
    public java.util.Calendar getDateSigned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESIGNED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateSigned" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateSigned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESIGNED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateSigned" element
     */
    public void setDateSigned(java.util.Calendar dateSigned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESIGNED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESIGNED$6);
            }
            target.setCalendarValue(dateSigned);
        }
    }
    
    /**
     * Sets (as xml) the "dateSigned" element
     */
    public void xsetDateSigned(org.apache.xmlbeans.XmlDate dateSigned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESIGNED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATESIGNED$6);
            }
            target.set(dateSigned);
        }
    }
    /**
     * An XML name(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AsicSignatoryType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AsicSignatoryType.Name
    {
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML capacity(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AsicSignatoryType$Capacity.
     */
    public static class CapacityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AsicSignatoryType.Capacity
    {
        
        public CapacityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CapacityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML filename(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AsicSignatoryType$Filename.
     */
    public static class FilenameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AsicSignatoryType.Filename
    {
        
        public FilenameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FilenameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
