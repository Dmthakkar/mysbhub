/*
 * XML Type:  soapSoftwareIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.SoapSoftwareIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML soapSoftwareIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class SoapSoftwareIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.SoapSoftwareIdentifierType
{
    
    public SoapSoftwareIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALREFERENCENUMBER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "externalReferenceNumber");
    private static final javax.xml.namespace.QName ORGANISATIONALNAME$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "organisationalName");
    private static final javax.xml.namespace.QName PRODUCTNAME$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "productName");
    private static final javax.xml.namespace.QName PRODUCTVERSION$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "productVersion");
    private static final javax.xml.namespace.QName ASICSOFTWARENO$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "asicSoftwareNo");
    
    
    /**
     * Gets the "externalReferenceNumber" element
     */
    public java.lang.String getExternalReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "externalReferenceNumber" element
     */
    public au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber xgetExternalReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber)get_store().find_element_user(EXTERNALREFERENCENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "externalReferenceNumber" element
     */
    public void setExternalReferenceNumber(java.lang.String externalReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALREFERENCENUMBER$0);
            }
            target.setStringValue(externalReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "externalReferenceNumber" element
     */
    public void xsetExternalReferenceNumber(au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber externalReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber)get_store().find_element_user(EXTERNALREFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber)get_store().add_element_user(EXTERNALREFERENCENUMBER$0);
            }
            target.set(externalReferenceNumber);
        }
    }
    
    /**
     * Gets the "organisationalName" element
     */
    public java.lang.String getOrganisationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONALNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organisationalName" element
     */
    public au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName xgetOrganisationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName)get_store().find_element_user(ORGANISATIONALNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "organisationalName" element
     */
    public boolean isSetOrganisationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONALNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "organisationalName" element
     */
    public void setOrganisationalName(java.lang.String organisationalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONALNAME$2);
            }
            target.setStringValue(organisationalName);
        }
    }
    
    /**
     * Sets (as xml) the "organisationalName" element
     */
    public void xsetOrganisationalName(au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName organisationalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName)get_store().find_element_user(ORGANISATIONALNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName)get_store().add_element_user(ORGANISATIONALNAME$2);
            }
            target.set(organisationalName);
        }
    }
    
    /**
     * Unsets the "organisationalName" element
     */
    public void unsetOrganisationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONALNAME$2, 0);
        }
    }
    
    /**
     * Gets the "productName" element
     */
    public java.lang.String getProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productName" element
     */
    public au.gov.asic.types.SoapSoftwareIdentifierType.ProductName xgetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.ProductName target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.ProductName)get_store().find_element_user(PRODUCTNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "productName" element
     */
    public boolean isSetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "productName" element
     */
    public void setProductName(java.lang.String productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$4);
            }
            target.setStringValue(productName);
        }
    }
    
    /**
     * Sets (as xml) the "productName" element
     */
    public void xsetProductName(au.gov.asic.types.SoapSoftwareIdentifierType.ProductName productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.ProductName target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.ProductName)get_store().find_element_user(PRODUCTNAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SoapSoftwareIdentifierType.ProductName)get_store().add_element_user(PRODUCTNAME$4);
            }
            target.set(productName);
        }
    }
    
    /**
     * Unsets the "productName" element
     */
    public void unsetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTNAME$4, 0);
        }
    }
    
    /**
     * Gets the "productVersion" element
     */
    public java.lang.String getProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productVersion" element
     */
    public au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion)get_store().find_element_user(PRODUCTVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "productVersion" element
     */
    public boolean isSetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "productVersion" element
     */
    public void setProductVersion(java.lang.String productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$6);
            }
            target.setStringValue(productVersion);
        }
    }
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    public void xsetProductVersion(au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion target = null;
            target = (au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion)get_store().find_element_user(PRODUCTVERSION$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion)get_store().add_element_user(PRODUCTVERSION$6);
            }
            target.set(productVersion);
        }
    }
    
    /**
     * Unsets the "productVersion" element
     */
    public void unsetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTVERSION$6, 0);
        }
    }
    
    /**
     * Gets the "asicSoftwareNo" element
     */
    public int getAsicSoftwareNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICSOFTWARENO$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "asicSoftwareNo" element
     */
    public au.gov.asic.types.AsicNumericIdType xgetAsicSoftwareNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(ASICSOFTWARENO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "asicSoftwareNo" element
     */
    public boolean isSetAsicSoftwareNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASICSOFTWARENO$8) != 0;
        }
    }
    
    /**
     * Sets the "asicSoftwareNo" element
     */
    public void setAsicSoftwareNo(int asicSoftwareNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICSOFTWARENO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICSOFTWARENO$8);
            }
            target.setIntValue(asicSoftwareNo);
        }
    }
    
    /**
     * Sets (as xml) the "asicSoftwareNo" element
     */
    public void xsetAsicSoftwareNo(au.gov.asic.types.AsicNumericIdType asicSoftwareNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(ASICSOFTWARENO$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(ASICSOFTWARENO$8);
            }
            target.set(asicSoftwareNo);
        }
    }
    
    /**
     * Unsets the "asicSoftwareNo" element
     */
    public void unsetAsicSoftwareNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASICSOFTWARENO$8, 0);
        }
    }
    /**
     * An XML externalReferenceNumber(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$ExternalReferenceNumber.
     */
    public static class ExternalReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber
    {
        
        public ExternalReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ExternalReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML organisationalName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$OrganisationalName.
     */
    public static class OrganisationalNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName
    {
        
        public OrganisationalNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OrganisationalNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML productName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$ProductName.
     */
    public static class ProductNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.SoapSoftwareIdentifierType.ProductName
    {
        
        public ProductNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProductNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML productVersion(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$ProductVersion.
     */
    public static class ProductVersionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion
    {
        
        public ProductVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProductVersionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
