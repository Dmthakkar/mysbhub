/*
 * XML Type:  signatoryType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.SignatoryType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML signatoryType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class SignatoryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.SignatoryType
{
    
    public SignatoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName CAPACITY$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "capacity");
    private static final javax.xml.namespace.QName DATESIGNED$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "dateSigned");
    private static final javax.xml.namespace.QName DECLARESTRUEANDCORRECT$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "declaresTrueAndCorrect");
    
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.PersonNameLodgeType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameLodgeType target = null;
            target = (au.gov.asic.types.PersonNameLodgeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(au.gov.asic.types.PersonNameLodgeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameLodgeType target = null;
            target = (au.gov.asic.types.PersonNameLodgeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameLodgeType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public au.gov.asic.types.PersonNameLodgeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameLodgeType target = null;
            target = (au.gov.asic.types.PersonNameLodgeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "capacity" element
     */
    public au.gov.asic.types.SignatoryType.Capacity.Enum getCapacity()
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
            return (au.gov.asic.types.SignatoryType.Capacity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "capacity" element
     */
    public au.gov.asic.types.SignatoryType.Capacity xgetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType.Capacity target = null;
            target = (au.gov.asic.types.SignatoryType.Capacity)get_store().find_element_user(CAPACITY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "capacity" element
     */
    public boolean isSetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPACITY$2) != 0;
        }
    }
    
    /**
     * Sets the "capacity" element
     */
    public void setCapacity(au.gov.asic.types.SignatoryType.Capacity.Enum capacity)
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
            target.setEnumValue(capacity);
        }
    }
    
    /**
     * Sets (as xml) the "capacity" element
     */
    public void xsetCapacity(au.gov.asic.types.SignatoryType.Capacity capacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType.Capacity target = null;
            target = (au.gov.asic.types.SignatoryType.Capacity)get_store().find_element_user(CAPACITY$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SignatoryType.Capacity)get_store().add_element_user(CAPACITY$2);
            }
            target.set(capacity);
        }
    }
    
    /**
     * Unsets the "capacity" element
     */
    public void unsetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPACITY$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESIGNED$4, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESIGNED$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESIGNED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESIGNED$4);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESIGNED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATESIGNED$4);
            }
            target.set(dateSigned);
        }
    }
    
    /**
     * Gets the "declaresTrueAndCorrect" element
     */
    public boolean getDeclaresTrueAndCorrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECLARESTRUEANDCORRECT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "declaresTrueAndCorrect" element
     */
    public au.gov.asic.types.TrueType xgetDeclaresTrueAndCorrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(DECLARESTRUEANDCORRECT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "declaresTrueAndCorrect" element
     */
    public void setDeclaresTrueAndCorrect(boolean declaresTrueAndCorrect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECLARESTRUEANDCORRECT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECLARESTRUEANDCORRECT$6);
            }
            target.setBooleanValue(declaresTrueAndCorrect);
        }
    }
    
    /**
     * Sets (as xml) the "declaresTrueAndCorrect" element
     */
    public void xsetDeclaresTrueAndCorrect(au.gov.asic.types.TrueType declaresTrueAndCorrect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(DECLARESTRUEANDCORRECT$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(DECLARESTRUEANDCORRECT$6);
            }
            target.set(declaresTrueAndCorrect);
        }
    }
    /**
     * An XML capacity(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SignatoryType$Capacity.
     */
    public static class CapacityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.SignatoryType.Capacity
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
}
