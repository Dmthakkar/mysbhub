/*
 * XML Type:  abrEntityType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbrEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML abrEntityType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AbrEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbrEntityType
{
    
    public AbrEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName ABNREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "abnReferenceNumber");
    private static final javax.xml.namespace.QName ENTITYNAME$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "entityName");
    private static final javax.xml.namespace.QName ENTITYTYPE$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "entityType");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$8 = 
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
     * True if has "abn" element
     */
    public boolean isSetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$0) != 0;
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
     * Unsets the "abn" element
     */
    public void unsetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$0, 0);
        }
    }
    
    /**
     * Gets the "abnReferenceNumber" element
     */
    public long getAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "abnReferenceNumber" element
     */
    public au.gov.asic.types.AbnApplicationReferenceNumberType xgetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnApplicationReferenceNumberType target = null;
            target = (au.gov.asic.types.AbnApplicationReferenceNumberType)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "abnReferenceNumber" element
     */
    public boolean isSetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABNREFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "abnReferenceNumber" element
     */
    public void setAbnReferenceNumber(long abnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABNREFERENCENUMBER$2);
            }
            target.setLongValue(abnReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "abnReferenceNumber" element
     */
    public void xsetAbnReferenceNumber(au.gov.asic.types.AbnApplicationReferenceNumberType abnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnApplicationReferenceNumberType target = null;
            target = (au.gov.asic.types.AbnApplicationReferenceNumberType)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnApplicationReferenceNumberType)get_store().add_element_user(ABNREFERENCENUMBER$2);
            }
            target.set(abnReferenceNumber);
        }
    }
    
    /**
     * Unsets the "abnReferenceNumber" element
     */
    public void unsetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABNREFERENCENUMBER$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
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
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ENTITYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "entityName" element
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYNAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$4);
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
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ENTITYNAME$4);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Unsets the "entityName" element
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYNAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$6, 0);
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
            target = (au.gov.asic.types.abn.AbrEntityTypeType)get_store().find_element_user(ENTITYTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "entityType" element
     */
    public boolean isSetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYTYPE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$6);
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
            target = (au.gov.asic.types.abn.AbrEntityTypeType)get_store().find_element_user(ENTITYTYPE$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbrEntityTypeType)get_store().add_element_user(ENTITYTYPE$6);
            }
            target.set(entityType);
        }
    }
    
    /**
     * Unsets the "entityType" element
     */
    public void unsetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYTYPE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$8, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$8, 0);
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
            return get_store().count_elements(EFFECTIVEDATE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$8);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(EFFECTIVEDATE$8);
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
            get_store().remove_element(EFFECTIVEDATE$8, 0);
        }
    }
}
