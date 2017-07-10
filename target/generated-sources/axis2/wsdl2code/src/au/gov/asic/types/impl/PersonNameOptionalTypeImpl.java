/*
 * XML Type:  personNameOptionalType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.PersonNameOptionalType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML personNameOptionalType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonNameOptionalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.PersonNameOptionalType
{
    
    public PersonNameOptionalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GIVENNAMES$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "givenNames");
    private static final javax.xml.namespace.QName OTHERGIVENNAMES$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "otherGivenNames");
    private static final javax.xml.namespace.QName FAMILYNAME$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "familyName");
    
    
    /**
     * Gets the "givenNames" element
     */
    public java.lang.String getGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "givenNames" element
     */
    public au.gov.asic.types.PersonNameOptionalType.GivenNames xgetGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameOptionalType.GivenNames target = null;
            target = (au.gov.asic.types.PersonNameOptionalType.GivenNames)get_store().find_element_user(GIVENNAMES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "givenNames" element
     */
    public boolean isSetGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVENNAMES$0) != 0;
        }
    }
    
    /**
     * Sets the "givenNames" element
     */
    public void setGivenNames(java.lang.String givenNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIVENNAMES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIVENNAMES$0);
            }
            target.setStringValue(givenNames);
        }
    }
    
    /**
     * Sets (as xml) the "givenNames" element
     */
    public void xsetGivenNames(au.gov.asic.types.PersonNameOptionalType.GivenNames givenNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameOptionalType.GivenNames target = null;
            target = (au.gov.asic.types.PersonNameOptionalType.GivenNames)get_store().find_element_user(GIVENNAMES$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameOptionalType.GivenNames)get_store().add_element_user(GIVENNAMES$0);
            }
            target.set(givenNames);
        }
    }
    
    /**
     * Unsets the "givenNames" element
     */
    public void unsetGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVENNAMES$0, 0);
        }
    }
    
    /**
     * Gets the "otherGivenNames" element
     */
    public java.lang.String getOtherGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERGIVENNAMES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "otherGivenNames" element
     */
    public au.gov.asic.types.PersonNameOptionalType.OtherGivenNames xgetOtherGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameOptionalType.OtherGivenNames target = null;
            target = (au.gov.asic.types.PersonNameOptionalType.OtherGivenNames)get_store().find_element_user(OTHERGIVENNAMES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "otherGivenNames" element
     */
    public boolean isSetOtherGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERGIVENNAMES$2) != 0;
        }
    }
    
    /**
     * Sets the "otherGivenNames" element
     */
    public void setOtherGivenNames(java.lang.String otherGivenNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERGIVENNAMES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERGIVENNAMES$2);
            }
            target.setStringValue(otherGivenNames);
        }
    }
    
    /**
     * Sets (as xml) the "otherGivenNames" element
     */
    public void xsetOtherGivenNames(au.gov.asic.types.PersonNameOptionalType.OtherGivenNames otherGivenNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameOptionalType.OtherGivenNames target = null;
            target = (au.gov.asic.types.PersonNameOptionalType.OtherGivenNames)get_store().find_element_user(OTHERGIVENNAMES$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameOptionalType.OtherGivenNames)get_store().add_element_user(OTHERGIVENNAMES$2);
            }
            target.set(otherGivenNames);
        }
    }
    
    /**
     * Unsets the "otherGivenNames" element
     */
    public void unsetOtherGivenNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERGIVENNAMES$2, 0);
        }
    }
    
    /**
     * Gets the "familyName" element
     */
    public java.lang.String getFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILYNAME$4, 0);
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
    public au.gov.asic.types.PersonNameOptionalType.FamilyName xgetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameOptionalType.FamilyName target = null;
            target = (au.gov.asic.types.PersonNameOptionalType.FamilyName)get_store().find_element_user(FAMILYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "familyName" element
     */
    public boolean isSetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILYNAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAMILYNAME$4);
            }
            target.setStringValue(familyName);
        }
    }
    
    /**
     * Sets (as xml) the "familyName" element
     */
    public void xsetFamilyName(au.gov.asic.types.PersonNameOptionalType.FamilyName familyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PersonNameOptionalType.FamilyName target = null;
            target = (au.gov.asic.types.PersonNameOptionalType.FamilyName)get_store().find_element_user(FAMILYNAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PersonNameOptionalType.FamilyName)get_store().add_element_user(FAMILYNAME$4);
            }
            target.set(familyName);
        }
    }
    
    /**
     * Unsets the "familyName" element
     */
    public void unsetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILYNAME$4, 0);
        }
    }
    /**
     * An XML givenNames(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameOptionalType$GivenNames.
     */
    public static class GivenNamesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.PersonNameOptionalType.GivenNames
    {
        
        public GivenNamesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GivenNamesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML otherGivenNames(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameOptionalType$OtherGivenNames.
     */
    public static class OtherGivenNamesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.PersonNameOptionalType.OtherGivenNames
    {
        
        public OtherGivenNamesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OtherGivenNamesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML familyName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameOptionalType$FamilyName.
     */
    public static class FamilyNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.PersonNameOptionalType.FamilyName
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
}
