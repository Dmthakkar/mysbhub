/*
 * XML Type:  identifierType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.IdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML identifierType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class IdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.IdentifierType
{
    
    public IdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBERHEADING$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "numberHeading");
    private static final javax.xml.namespace.QName NUMBER$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "number");
    
    
    /**
     * Gets the "numberHeading" element
     */
    public au.gov.asic.types.nni.NumberHeadingType.Enum getNumberHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERHEADING$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.nni.NumberHeadingType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberHeading" element
     */
    public au.gov.asic.types.nni.NumberHeadingType xgetNumberHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NumberHeadingType target = null;
            target = (au.gov.asic.types.nni.NumberHeadingType)get_store().find_element_user(NUMBERHEADING$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberHeading" element
     */
    public boolean isSetNumberHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERHEADING$0) != 0;
        }
    }
    
    /**
     * Sets the "numberHeading" element
     */
    public void setNumberHeading(au.gov.asic.types.nni.NumberHeadingType.Enum numberHeading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERHEADING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERHEADING$0);
            }
            target.setEnumValue(numberHeading);
        }
    }
    
    /**
     * Sets (as xml) the "numberHeading" element
     */
    public void xsetNumberHeading(au.gov.asic.types.nni.NumberHeadingType numberHeading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NumberHeadingType target = null;
            target = (au.gov.asic.types.nni.NumberHeadingType)get_store().find_element_user(NUMBERHEADING$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.NumberHeadingType)get_store().add_element_user(NUMBERHEADING$0);
            }
            target.set(numberHeading);
        }
    }
    
    /**
     * Unsets the "numberHeading" element
     */
    public void unsetNumberHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERHEADING$0, 0);
        }
    }
    
    /**
     * Gets the "number" element
     */
    public int getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" element
     */
    public au.gov.asic.types.NniNumberType xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(int number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
            }
            target.setIntValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" element
     */
    public void xsetNumber(au.gov.asic.types.NniNumberType number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(NUMBER$2);
            }
            target.set(number);
        }
    }
}
