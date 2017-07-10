/*
 * XML Type:  distinguishedNameExtType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.DistinguishedNameExtType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML distinguishedNameExtType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class DistinguishedNameExtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.DistinguishedNameExtType
{
    
    public DistinguishedNameExtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName DISTINGUISHEDWORD$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "distinguishedWord");
    
    
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
    public au.gov.asic.types.DistinguishedNameExtType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType.Name target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType.Name)get_store().find_element_user(NAME$0, 0);
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
    public void xsetName(au.gov.asic.types.DistinguishedNameExtType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType.Name target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType.Name)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameExtType.Name)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "distinguishedWord" element
     */
    public java.lang.String getDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "distinguishedWord" element
     */
    public au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord xgetDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "distinguishedWord" element
     */
    public boolean isSetDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTINGUISHEDWORD$2) != 0;
        }
    }
    
    /**
     * Sets the "distinguishedWord" element
     */
    public void setDistinguishedWord(java.lang.String distinguishedWord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTINGUISHEDWORD$2);
            }
            target.setStringValue(distinguishedWord);
        }
    }
    
    /**
     * Sets (as xml) the "distinguishedWord" element
     */
    public void xsetDistinguishedWord(au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord distinguishedWord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord)get_store().find_element_user(DISTINGUISHEDWORD$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord)get_store().add_element_user(DISTINGUISHEDWORD$2);
            }
            target.set(distinguishedWord);
        }
    }
    
    /**
     * Unsets the "distinguishedWord" element
     */
    public void unsetDistinguishedWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTINGUISHEDWORD$2, 0);
        }
    }
    /**
     * An XML name(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.DistinguishedNameExtType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.DistinguishedNameExtType.Name
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
     * An XML distinguishedWord(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.DistinguishedNameExtType$DistinguishedWord.
     */
    public static class DistinguishedWordImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.DistinguishedNameExtType.DistinguishedWord
    {
        
        public DistinguishedWordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DistinguishedWordImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
