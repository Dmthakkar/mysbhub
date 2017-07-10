/*
 * XML Type:  realmQualifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.RealmQualifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML realmQualifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RealmQualifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.RealmQualifierType
{
    
    public RealmQualifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEIDENTIFIER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "typeIdentifier");
    private static final javax.xml.namespace.QName QUALIFIER$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "qualifier");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    
    
    /**
     * Gets the "typeIdentifier" element
     */
    public java.lang.String getTypeIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeIdentifier" element
     */
    public au.gov.asic.types.RealmQualifierType.TypeIdentifier xgetTypeIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType.TypeIdentifier target = null;
            target = (au.gov.asic.types.RealmQualifierType.TypeIdentifier)get_store().find_element_user(TYPEIDENTIFIER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "typeIdentifier" element
     */
    public void setTypeIdentifier(java.lang.String typeIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEIDENTIFIER$0);
            }
            target.setStringValue(typeIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "typeIdentifier" element
     */
    public void xsetTypeIdentifier(au.gov.asic.types.RealmQualifierType.TypeIdentifier typeIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType.TypeIdentifier target = null;
            target = (au.gov.asic.types.RealmQualifierType.TypeIdentifier)get_store().find_element_user(TYPEIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.RealmQualifierType.TypeIdentifier)get_store().add_element_user(TYPEIDENTIFIER$0);
            }
            target.set(typeIdentifier);
        }
    }
    
    /**
     * Gets the "qualifier" element
     */
    public java.lang.String getQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qualifier" element
     */
    public au.gov.asic.types.RealmQualifierType.Qualifier xgetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType.Qualifier target = null;
            target = (au.gov.asic.types.RealmQualifierType.Qualifier)get_store().find_element_user(QUALIFIER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "qualifier" element
     */
    public void setQualifier(java.lang.String qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFIER$2);
            }
            target.setStringValue(qualifier);
        }
    }
    
    /**
     * Sets (as xml) the "qualifier" element
     */
    public void xsetQualifier(au.gov.asic.types.RealmQualifierType.Qualifier qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType.Qualifier target = null;
            target = (au.gov.asic.types.RealmQualifierType.Qualifier)get_store().find_element_user(QUALIFIER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.RealmQualifierType.Qualifier)get_store().add_element_user(QUALIFIER$2);
            }
            target.set(qualifier);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
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
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
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
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
        }
    }
    /**
     * An XML typeIdentifier(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.RealmQualifierType$TypeIdentifier.
     */
    public static class TypeIdentifierImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.RealmQualifierType.TypeIdentifier
    {
        
        public TypeIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeIdentifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML qualifier(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.RealmQualifierType$Qualifier.
     */
    public static class QualifierImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.RealmQualifierType.Qualifier
    {
        
        public QualifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected QualifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
