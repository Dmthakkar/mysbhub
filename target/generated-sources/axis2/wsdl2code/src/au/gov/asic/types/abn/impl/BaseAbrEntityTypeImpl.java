/*
 * XML Type:  baseAbrEntityType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.BaseAbrEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML baseAbrEntityType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BaseAbrEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.BaseAbrEntityType
{
    
    public BaseAbrEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName ENTITYNAME$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "entityName");
    private static final javax.xml.namespace.QName ENTITYTYPE$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "entityType");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveDate");
    
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abn" element
     */
    public au.gov.asic.types.AbnType xgetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "abn" element
     */
    public void setAbn(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$0);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "abn" element
     */
    public void xsetAbn(au.gov.asic.types.AbnType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$0);
            }
            target.set(abn);
        }
    }
    
    /**
     * Gets the "entityName" element
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityName" element
     */
    public au.gov.asic.types.NniNameType xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ENTITYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entityName" element
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$2);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "entityName" element
     */
    public void xsetEntityName(au.gov.asic.types.NniNameType entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ENTITYNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ENTITYNAME$2);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Gets the "entityType" element
     */
    public java.lang.String getEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityType" element
     */
    public au.gov.asic.types.abn.AbrEntityTypeType xgetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityTypeType target = null;
            target = (au.gov.asic.types.abn.AbrEntityTypeType)get_store().find_element_user(ENTITYTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entityType" element
     */
    public void setEntityType(java.lang.String entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$4);
            }
            target.setStringValue(entityType);
        }
    }
    
    /**
     * Sets (as xml) the "entityType" element
     */
    public void xsetEntityType(au.gov.asic.types.abn.AbrEntityTypeType entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityTypeType target = null;
            target = (au.gov.asic.types.abn.AbrEntityTypeType)get_store().find_element_user(ENTITYTYPE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbrEntityTypeType)get_store().add_element_user(ENTITYTYPE$4);
            }
            target.set(entityType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$6, 0);
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
            return get_store().count_elements(EFFECTIVEDATE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$6);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(EFFECTIVEDATE$6);
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
            get_store().remove_element(EFFECTIVEDATE$6, 0);
        }
    }
}
