/*
 * XML Type:  softwareInformationType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.SoftwareInformationType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML softwareInformationType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class SoftwareInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.SoftwareInformationType
{
    
    public SoftwareInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONALNAME$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "organisationalName");
    private static final javax.xml.namespace.QName PRODUCTNAME$2 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "productName");
    private static final javax.xml.namespace.QName PRODUCTVERSION$4 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "productVersion");
    
    
    /**
     * Gets the "organisationalName" element
     */
    public java.lang.String getOrganisationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONALNAME$0, 0);
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
    public au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName xgetOrganisationalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName)get_store().find_element_user(ORGANISATIONALNAME$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONALNAME$0);
            }
            target.setStringValue(organisationalName);
        }
    }
    
    /**
     * Sets (as xml) the "organisationalName" element
     */
    public void xsetOrganisationalName(au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName organisationalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName)get_store().find_element_user(ORGANISATIONALNAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName)get_store().add_element_user(ORGANISATIONALNAME$0);
            }
            target.set(organisationalName);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$2, 0);
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
    public au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName xgetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName)get_store().find_element_user(PRODUCTNAME$2, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$2);
            }
            target.setStringValue(productName);
        }
    }
    
    /**
     * Sets (as xml) the "productName" element
     */
    public void xsetProductName(au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName)get_store().find_element_user(PRODUCTNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName)get_store().add_element_user(PRODUCTNAME$2);
            }
            target.set(productName);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$4, 0);
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
    public au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion)get_store().find_element_user(PRODUCTVERSION$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$4);
            }
            target.setStringValue(productVersion);
        }
    }
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    public void xsetProductVersion(au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion target = null;
            target = (au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion)get_store().find_element_user(PRODUCTVERSION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion)get_store().add_element_user(PRODUCTVERSION$4);
            }
            target.set(productVersion);
        }
    }
    /**
     * An XML organisationalName(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.SoftwareInformationType$OrganisationalName.
     */
    public static class OrganisationalNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.SoftwareInformationType.OrganisationalName
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
     * An XML productName(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.SoftwareInformationType$ProductName.
     */
    public static class ProductNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.SoftwareInformationType.ProductName
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
     * An XML productVersion(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.SoftwareInformationType$ProductVersion.
     */
    public static class ProductVersionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.SoftwareInformationType.ProductVersion
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
