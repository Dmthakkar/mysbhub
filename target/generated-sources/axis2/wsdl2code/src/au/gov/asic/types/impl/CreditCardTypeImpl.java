/*
 * XML Type:  creditCardType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.CreditCardType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML creditCardType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class CreditCardTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.CreditCardType
{
    
    public CreditCardTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRAND$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "brand");
    private static final javax.xml.namespace.QName ENCRYPTED$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "encrypted");
    
    
    /**
     * Gets the "brand" element
     */
    public au.gov.asic.types.CreditCardType.Brand.Enum getBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.CreditCardType.Brand.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "brand" element
     */
    public au.gov.asic.types.CreditCardType.Brand xgetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType.Brand target = null;
            target = (au.gov.asic.types.CreditCardType.Brand)get_store().find_element_user(BRAND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "brand" element
     */
    public void setBrand(au.gov.asic.types.CreditCardType.Brand.Enum brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRAND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRAND$0);
            }
            target.setEnumValue(brand);
        }
    }
    
    /**
     * Sets (as xml) the "brand" element
     */
    public void xsetBrand(au.gov.asic.types.CreditCardType.Brand brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType.Brand target = null;
            target = (au.gov.asic.types.CreditCardType.Brand)get_store().find_element_user(BRAND$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.CreditCardType.Brand)get_store().add_element_user(BRAND$0);
            }
            target.set(brand);
        }
    }
    
    /**
     * Gets the "encrypted" element
     */
    public java.lang.String getEncrypted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encrypted" element
     */
    public au.gov.asic.types.CreditCardType.Encrypted xgetEncrypted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType.Encrypted target = null;
            target = (au.gov.asic.types.CreditCardType.Encrypted)get_store().find_element_user(ENCRYPTED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "encrypted" element
     */
    public void setEncrypted(java.lang.String encrypted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCRYPTED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCRYPTED$2);
            }
            target.setStringValue(encrypted);
        }
    }
    
    /**
     * Sets (as xml) the "encrypted" element
     */
    public void xsetEncrypted(au.gov.asic.types.CreditCardType.Encrypted encrypted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.CreditCardType.Encrypted target = null;
            target = (au.gov.asic.types.CreditCardType.Encrypted)get_store().find_element_user(ENCRYPTED$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.CreditCardType.Encrypted)get_store().add_element_user(ENCRYPTED$2);
            }
            target.set(encrypted);
        }
    }
    /**
     * An XML brand(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.CreditCardType$Brand.
     */
    public static class BrandImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.CreditCardType.Brand
    {
        
        public BrandImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected BrandImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML encrypted(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.CreditCardType$Encrypted.
     */
    public static class EncryptedImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.CreditCardType.Encrypted
    {
        
        public EncryptedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EncryptedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
