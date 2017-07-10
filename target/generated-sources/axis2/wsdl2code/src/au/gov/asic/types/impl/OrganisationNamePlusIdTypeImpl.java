/*
 * XML Type:  organisationNamePlusIdType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.OrganisationNamePlusIdType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML organisationNamePlusIdType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OrganisationNamePlusIdTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.OrganisationNamePlusIdType
{
    
    public OrganisationNamePlusIdTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "identifier");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "type");
    
    
    /**
     * Gets the "identifier" element
     */
    public au.gov.asic.types.OrganisationIdentifierType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OrganisationIdentifierType target = null;
            target = (au.gov.asic.types.OrganisationIdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(au.gov.asic.types.OrganisationIdentifierType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OrganisationIdentifierType target = null;
            target = (au.gov.asic.types.OrganisationIdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.OrganisationIdentifierType)get_store().add_element_user(IDENTIFIER$0);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public au.gov.asic.types.OrganisationIdentifierType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OrganisationIdentifierType target = null;
            target = (au.gov.asic.types.OrganisationIdentifierType)get_store().add_element_user(IDENTIFIER$0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public au.gov.asic.types.OrganisationNamePlusIdType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OrganisationNamePlusIdType.Type target = null;
            target = (au.gov.asic.types.OrganisationNamePlusIdType.Type)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(au.gov.asic.types.OrganisationNamePlusIdType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.OrganisationNamePlusIdType.Type target = null;
            target = (au.gov.asic.types.OrganisationNamePlusIdType.Type)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.OrganisationNamePlusIdType.Type)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, 0);
        }
    }
    /**
     * An XML type(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.OrganisationNamePlusIdType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.OrganisationNamePlusIdType.Type
    {
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
