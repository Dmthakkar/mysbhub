/*
 * XML Type:  nameType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML nameType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.NameType
{
    
    public NameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAMILYNAME$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "familyName");
    private static final javax.xml.namespace.QName GIVENNAME1$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "givenName1");
    private static final javax.xml.namespace.QName GIVENNAME2$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "givenName2");
    private static final javax.xml.namespace.QName GIVENNAME3$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "givenName3");
    
    
    /**
     * Gets the "familyName" element
     */
    public java.lang.String getFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "familyName" element
     */
    public au.gov.asic.types.NameType.FamilyName xgetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.FamilyName target = null;
            target = (au.gov.asic.types.NameType.FamilyName)get_store().find_element_user(FAMILYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "familyName" element
     */
    public void setFamilyName(java.lang.String familyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAMILYNAME$0);
            }
            target.setStringValue(familyName);
        }
    }
    
    /**
     * Sets (as xml) the "familyName" element
     */
    public void xsetFamilyName(au.gov.asic.types.NameType.FamilyName familyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.FamilyName target = null;
            target = (au.gov.asic.types.NameType.FamilyName)get_store().find_element_user(FAMILYNAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameType.FamilyName)get_store().add_element_user(FAMILYNAME$0);
            }
            target.set(familyName);
        }
    }
    
    /**
     * Gets the "givenName1" element
     */
    public java.lang.String getGivenName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME1$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "givenName1" element
     */
    public au.gov.asic.types.NameType.GivenName1 xgetGivenName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.GivenName1 target = null;
            target = (au.gov.asic.types.NameType.GivenName1)get_store().find_element_user(GIVENNAME1$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "givenName1" element
     */
    public void setGivenName1(java.lang.String givenName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIVENNAME1$2);
            }
            target.setStringValue(givenName1);
        }
    }
    
    /**
     * Sets (as xml) the "givenName1" element
     */
    public void xsetGivenName1(au.gov.asic.types.NameType.GivenName1 givenName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.GivenName1 target = null;
            target = (au.gov.asic.types.NameType.GivenName1)get_store().find_element_user(GIVENNAME1$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameType.GivenName1)get_store().add_element_user(GIVENNAME1$2);
            }
            target.set(givenName1);
        }
    }
    
    /**
     * Gets the "givenName2" element
     */
    public java.lang.String getGivenName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME2$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "givenName2" element
     */
    public au.gov.asic.types.NameType.GivenName2 xgetGivenName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.GivenName2 target = null;
            target = (au.gov.asic.types.NameType.GivenName2)get_store().find_element_user(GIVENNAME2$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "givenName2" element
     */
    public boolean isSetGivenName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVENNAME2$4) != 0;
        }
    }
    
    /**
     * Sets the "givenName2" element
     */
    public void setGivenName2(java.lang.String givenName2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIVENNAME2$4);
            }
            target.setStringValue(givenName2);
        }
    }
    
    /**
     * Sets (as xml) the "givenName2" element
     */
    public void xsetGivenName2(au.gov.asic.types.NameType.GivenName2 givenName2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.GivenName2 target = null;
            target = (au.gov.asic.types.NameType.GivenName2)get_store().find_element_user(GIVENNAME2$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameType.GivenName2)get_store().add_element_user(GIVENNAME2$4);
            }
            target.set(givenName2);
        }
    }
    
    /**
     * Unsets the "givenName2" element
     */
    public void unsetGivenName2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVENNAME2$4, 0);
        }
    }
    
    /**
     * Gets the "givenName3" element
     */
    public java.lang.String getGivenName3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME3$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "givenName3" element
     */
    public au.gov.asic.types.NameType.GivenName3 xgetGivenName3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.GivenName3 target = null;
            target = (au.gov.asic.types.NameType.GivenName3)get_store().find_element_user(GIVENNAME3$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "givenName3" element
     */
    public boolean isSetGivenName3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVENNAME3$6) != 0;
        }
    }
    
    /**
     * Sets the "givenName3" element
     */
    public void setGivenName3(java.lang.String givenName3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAME3$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIVENNAME3$6);
            }
            target.setStringValue(givenName3);
        }
    }
    
    /**
     * Sets (as xml) the "givenName3" element
     */
    public void xsetGivenName3(au.gov.asic.types.NameType.GivenName3 givenName3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameType.GivenName3 target = null;
            target = (au.gov.asic.types.NameType.GivenName3)get_store().find_element_user(GIVENNAME3$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameType.GivenName3)get_store().add_element_user(GIVENNAME3$6);
            }
            target.set(givenName3);
        }
    }
    
    /**
     * Unsets the "givenName3" element
     */
    public void unsetGivenName3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVENNAME3$6, 0);
        }
    }
    /**
     * An XML familyName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$FamilyName.
     */
    public static class FamilyNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameType.FamilyName
    {
        
        public FamilyNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FamilyNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML givenName1(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$GivenName1.
     */
    public static class GivenName1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameType.GivenName1
    {
        
        public GivenName1Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GivenName1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML givenName2(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$GivenName2.
     */
    public static class GivenName2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameType.GivenName2
    {
        
        public GivenName2Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GivenName2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML givenName3(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$GivenName3.
     */
    public static class GivenName3Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameType.GivenName3
    {
        
        public GivenName3Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GivenName3Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
