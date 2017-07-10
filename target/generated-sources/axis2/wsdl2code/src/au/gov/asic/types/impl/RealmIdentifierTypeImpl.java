/*
 * XML Type:  realmIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.RealmIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML realmIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RealmIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.RealmIdentifierType
{
    
    public RealmIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALM$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "realm");
    
    
    /**
     * Gets the "realm" element
     */
    public au.gov.asic.types.RealmQualifierType getRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType target = null;
            target = (au.gov.asic.types.RealmQualifierType)get_store().find_element_user(REALM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "realm" element
     */
    public void setRealm(au.gov.asic.types.RealmQualifierType realm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType target = null;
            target = (au.gov.asic.types.RealmQualifierType)get_store().find_element_user(REALM$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.RealmQualifierType)get_store().add_element_user(REALM$0);
            }
            target.set(realm);
        }
    }
    
    /**
     * Appends and returns a new empty "realm" element
     */
    public au.gov.asic.types.RealmQualifierType addNewRealm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.RealmQualifierType target = null;
            target = (au.gov.asic.types.RealmQualifierType)get_store().add_element_user(REALM$0);
            return target;
        }
    }
}
