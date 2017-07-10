/*
 * XML Type:  soapSoftwareIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.SoapSoftwareIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML soapSoftwareIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface SoapSoftwareIdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoapSoftwareIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("soapsoftwareidentifiertyped551type");
    
    /**
     * Gets the "externalReferenceNumber" element
     */
    java.lang.String getExternalReferenceNumber();
    
    /**
     * Gets (as xml) the "externalReferenceNumber" element
     */
    au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber xgetExternalReferenceNumber();
    
    /**
     * Sets the "externalReferenceNumber" element
     */
    void setExternalReferenceNumber(java.lang.String externalReferenceNumber);
    
    /**
     * Sets (as xml) the "externalReferenceNumber" element
     */
    void xsetExternalReferenceNumber(au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber externalReferenceNumber);
    
    /**
     * Gets the "organisationalName" element
     */
    java.lang.String getOrganisationalName();
    
    /**
     * Gets (as xml) the "organisationalName" element
     */
    au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName xgetOrganisationalName();
    
    /**
     * True if has "organisationalName" element
     */
    boolean isSetOrganisationalName();
    
    /**
     * Sets the "organisationalName" element
     */
    void setOrganisationalName(java.lang.String organisationalName);
    
    /**
     * Sets (as xml) the "organisationalName" element
     */
    void xsetOrganisationalName(au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName organisationalName);
    
    /**
     * Unsets the "organisationalName" element
     */
    void unsetOrganisationalName();
    
    /**
     * Gets the "productName" element
     */
    java.lang.String getProductName();
    
    /**
     * Gets (as xml) the "productName" element
     */
    au.gov.asic.types.SoapSoftwareIdentifierType.ProductName xgetProductName();
    
    /**
     * True if has "productName" element
     */
    boolean isSetProductName();
    
    /**
     * Sets the "productName" element
     */
    void setProductName(java.lang.String productName);
    
    /**
     * Sets (as xml) the "productName" element
     */
    void xsetProductName(au.gov.asic.types.SoapSoftwareIdentifierType.ProductName productName);
    
    /**
     * Unsets the "productName" element
     */
    void unsetProductName();
    
    /**
     * Gets the "productVersion" element
     */
    java.lang.String getProductVersion();
    
    /**
     * Gets (as xml) the "productVersion" element
     */
    au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion xgetProductVersion();
    
    /**
     * True if has "productVersion" element
     */
    boolean isSetProductVersion();
    
    /**
     * Sets the "productVersion" element
     */
    void setProductVersion(java.lang.String productVersion);
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    void xsetProductVersion(au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion productVersion);
    
    /**
     * Unsets the "productVersion" element
     */
    void unsetProductVersion();
    
    /**
     * Gets the "asicSoftwareNo" element
     */
    int getAsicSoftwareNo();
    
    /**
     * Gets (as xml) the "asicSoftwareNo" element
     */
    au.gov.asic.types.AsicNumericIdType xgetAsicSoftwareNo();
    
    /**
     * True if has "asicSoftwareNo" element
     */
    boolean isSetAsicSoftwareNo();
    
    /**
     * Sets the "asicSoftwareNo" element
     */
    void setAsicSoftwareNo(int asicSoftwareNo);
    
    /**
     * Sets (as xml) the "asicSoftwareNo" element
     */
    void xsetAsicSoftwareNo(au.gov.asic.types.AsicNumericIdType asicSoftwareNo);
    
    /**
     * Unsets the "asicSoftwareNo" element
     */
    void unsetAsicSoftwareNo();
    
    /**
     * An XML externalReferenceNumber(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$ExternalReferenceNumber.
     */
    public interface ExternalReferenceNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalReferenceNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("externalreferencenumberfb9celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber newInstance() {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ExternalReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML organisationalName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$OrganisationalName.
     */
    public interface OrganisationalName extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationalName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisationalname1485elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName newValue(java.lang.Object obj) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName) type.newValue( obj ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName newInstance() {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.OrganisationalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML productName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$ProductName.
     */
    public interface ProductName extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("productname4f0belemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ProductName newValue(java.lang.Object obj) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ProductName) type.newValue( obj ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ProductName newInstance() {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ProductName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ProductName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ProductName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML productVersion(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SoapSoftwareIdentifierType$ProductVersion.
     */
    public interface ProductVersion extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductVersion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("productversionbdacelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion newValue(java.lang.Object obj) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion) type.newValue( obj ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion newInstance() {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.SoapSoftwareIdentifierType.ProductVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.SoapSoftwareIdentifierType newInstance() {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.SoapSoftwareIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.SoapSoftwareIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
