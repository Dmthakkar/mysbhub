/*
 * XML Type:  entityType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.EntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML entityType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class EntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.EntityType
{
    
    public EntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName ABN$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName REALMQUALIFIER$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "realmQualifier");
    private static final javax.xml.namespace.QName ENTITYTYPE$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "entityType");
    private static final javax.xml.namespace.QName SOURCEID$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "sourceId");
    
    
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
    public au.gov.asic.types.NniNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$0, 0);
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
    public void xsetName(au.gov.asic.types.NniNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$2, 0);
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
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$2, 0);
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
            return get_store().count_elements(ABN$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$2);
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
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$2);
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
            get_store().remove_element(ABN$2, 0);
        }
    }
    
    /**
     * Gets the "realmQualifier" element
     */
    public au.gov.asic.types.RealmQualifierType getRealmQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType target = null;
            target = (au.gov.asic.types.RealmQualifierType)get_store().find_element_user(REALMQUALIFIER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "realmQualifier" element
     */
    public boolean isSetRealmQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMQUALIFIER$4) != 0;
        }
    }
    
    /**
     * Sets the "realmQualifier" element
     */
    public void setRealmQualifier(au.gov.asic.types.RealmQualifierType realmQualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType target = null;
            target = (au.gov.asic.types.RealmQualifierType)get_store().find_element_user(REALMQUALIFIER$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.RealmQualifierType)get_store().add_element_user(REALMQUALIFIER$4);
            }
            target.set(realmQualifier);
        }
    }
    
    /**
     * Appends and returns a new empty "realmQualifier" element
     */
    public au.gov.asic.types.RealmQualifierType addNewRealmQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType target = null;
            target = (au.gov.asic.types.RealmQualifierType)get_store().add_element_user(REALMQUALIFIER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "realmQualifier" element
     */
    public void unsetRealmQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMQUALIFIER$4, 0);
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
    public org.apache.xmlbeans.XmlString xgetEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYTYPE$6, 0);
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
    public void xsetEntityType(org.apache.xmlbeans.XmlString entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYTYPE$6);
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
     * Gets the "sourceId" element
     */
    public long getSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceId" element
     */
    public org.apache.xmlbeans.XmlLong xgetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SOURCEID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceId" element
     */
    public boolean isSetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEID$8) != 0;
        }
    }
    
    /**
     * Sets the "sourceId" element
     */
    public void setSourceId(long sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$8);
            }
            target.setLongValue(sourceId);
        }
    }
    
    /**
     * Sets (as xml) the "sourceId" element
     */
    public void xsetSourceId(org.apache.xmlbeans.XmlLong sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SOURCEID$8);
            }
            target.set(sourceId);
        }
    }
    
    /**
     * Unsets the "sourceId" element
     */
    public void unsetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEID$8, 0);
        }
    }
}
