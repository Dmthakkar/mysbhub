/*
 * XML Type:  telephoneNumberType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.TelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML telephoneNumberType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TelephoneNumberTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.TelephoneNumberType
{
    
    public TelephoneNumberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONENUMBER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "telephoneNumber");
    private static final javax.xml.namespace.QName PHONETYPE$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "phoneType");
    
    
    /**
     * Gets the "telephoneNumber" element
     */
    public au.gov.asic.types.TelephoneNumberType.TelephoneNumber getTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType.TelephoneNumber target = null;
            target = (au.gov.asic.types.TelephoneNumberType.TelephoneNumber)get_store().find_element_user(TELEPHONENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "telephoneNumber" element
     */
    public void setTelephoneNumber(au.gov.asic.types.TelephoneNumberType.TelephoneNumber telephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType.TelephoneNumber target = null;
            target = (au.gov.asic.types.TelephoneNumberType.TelephoneNumber)get_store().find_element_user(TELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TelephoneNumberType.TelephoneNumber)get_store().add_element_user(TELEPHONENUMBER$0);
            }
            target.set(telephoneNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "telephoneNumber" element
     */
    public au.gov.asic.types.TelephoneNumberType.TelephoneNumber addNewTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType.TelephoneNumber target = null;
            target = (au.gov.asic.types.TelephoneNumberType.TelephoneNumber)get_store().add_element_user(TELEPHONENUMBER$0);
            return target;
        }
    }
    
    /**
     * Gets the "phoneType" element
     */
    public au.gov.asic.types.TelephoneNumberType.PhoneType.Enum getPhoneType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.TelephoneNumberType.PhoneType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "phoneType" element
     */
    public au.gov.asic.types.TelephoneNumberType.PhoneType xgetPhoneType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType.PhoneType target = null;
            target = (au.gov.asic.types.TelephoneNumberType.PhoneType)get_store().find_element_user(PHONETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "phoneType" element
     */
    public void setPhoneType(au.gov.asic.types.TelephoneNumberType.PhoneType.Enum phoneType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONETYPE$2);
            }
            target.setEnumValue(phoneType);
        }
    }
    
    /**
     * Sets (as xml) the "phoneType" element
     */
    public void xsetPhoneType(au.gov.asic.types.TelephoneNumberType.PhoneType phoneType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TelephoneNumberType.PhoneType target = null;
            target = (au.gov.asic.types.TelephoneNumberType.PhoneType)get_store().find_element_user(PHONETYPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TelephoneNumberType.PhoneType)get_store().add_element_user(PHONETYPE$2);
            }
            target.set(phoneType);
        }
    }
    /**
     * An XML telephoneNumber(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class TelephoneNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.TelephoneNumberType.TelephoneNumber
    {
        
        public TelephoneNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREFIX$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "prefix");
        private static final javax.xml.namespace.QName NUMBER$2 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "number");
        
        
        /**
         * Gets the "prefix" element
         */
        public java.lang.String getPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prefix" element
         */
        public org.apache.xmlbeans.XmlString xgetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "prefix" element
         */
        public boolean isSetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREFIX$0) != 0;
            }
        }
        
        /**
         * Sets the "prefix" element
         */
        public void setPrefix(java.lang.String prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                }
                target.setStringValue(prefix);
            }
        }
        
        /**
         * Sets (as xml) the "prefix" element
         */
        public void xsetPrefix(org.apache.xmlbeans.XmlString prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFIX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREFIX$0);
                }
                target.set(prefix);
            }
        }
        
        /**
         * Unsets the "prefix" element
         */
        public void unsetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREFIX$0, 0);
            }
        }
        
        /**
         * Gets the "number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "number" element
         */
        public org.apache.xmlbeans.XmlString xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "number" element
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "number" element
         */
        public void xsetNumber(org.apache.xmlbeans.XmlString number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$2);
                }
                target.set(number);
            }
        }
    }
    /**
     * An XML phoneType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.TelephoneNumberType$PhoneType.
     */
    public static class PhoneTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.TelephoneNumberType.PhoneType
    {
        
        public PhoneTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PhoneTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
