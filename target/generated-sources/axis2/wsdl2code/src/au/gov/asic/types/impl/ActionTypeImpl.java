/*
 * XML Type:  actionType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ActionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML actionType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ActionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.ActionType
{
    
    public ActionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "effectiveDate");
    
    
    /**
     * Gets the "code" element
     */
    public au.gov.asic.types.ActionType.Code.Enum getCode()
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
            return (au.gov.asic.types.ActionType.Code.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.ActionType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ActionType.Code target = null;
            target = (au.gov.asic.types.ActionType.Code)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(au.gov.asic.types.ActionType.Code.Enum code)
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
            target.setEnumValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(au.gov.asic.types.ActionType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ActionType.Code target = null;
            target = (au.gov.asic.types.ActionType.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ActionType.Code)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "effectiveDate" element
     */
    public java.util.Calendar getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "effectiveDate" element
     */
    public boolean isSetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVEDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "effectiveDate" element
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$2);
            }
            target.setCalendarValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlDate effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(EFFECTIVEDATE$2);
            }
            target.set(effectiveDate);
        }
    }
    
    /**
     * Unsets the "effectiveDate" element
     */
    public void unsetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVEDATE$2, 0);
        }
    }
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ActionType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.ActionType.Code
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
}
