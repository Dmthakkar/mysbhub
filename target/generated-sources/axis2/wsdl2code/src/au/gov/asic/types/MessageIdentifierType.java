/*
 * XML Type:  messageIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.MessageIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML messageIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface MessageIdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messageidentifiertype9a14type");
    
    /**
     * Gets the "asicIdentifier" element
     */
    au.gov.asic.types.DocumentIdentifierType getAsicIdentifier();
    
    /**
     * Sets the "asicIdentifier" element
     */
    void setAsicIdentifier(au.gov.asic.types.DocumentIdentifierType asicIdentifier);
    
    /**
     * Appends and returns a new empty "asicIdentifier" element
     */
    au.gov.asic.types.DocumentIdentifierType addNewAsicIdentifier();
    
    /**
     * Gets the "customerIdentifier" element
     */
    au.gov.asic.types.MessageIdentifierType.CustomerIdentifier getCustomerIdentifier();
    
    /**
     * Sets the "customerIdentifier" element
     */
    void setCustomerIdentifier(au.gov.asic.types.MessageIdentifierType.CustomerIdentifier customerIdentifier);
    
    /**
     * Appends and returns a new empty "customerIdentifier" element
     */
    au.gov.asic.types.MessageIdentifierType.CustomerIdentifier addNewCustomerIdentifier();
    
    /**
     * An XML customerIdentifier(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface CustomerIdentifier extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerIdentifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("customeridentifier5a97elemtype");
        
        /**
         * Gets the "customer" element
         */
        au.gov.asic.types.AccountIdentifierType getCustomer();
        
        /**
         * Sets the "customer" element
         */
        void setCustomer(au.gov.asic.types.AccountIdentifierType customer);
        
        /**
         * Appends and returns a new empty "customer" element
         */
        au.gov.asic.types.AccountIdentifierType addNewCustomer();
        
        /**
         * Gets the "identifier" element
         */
        au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier getIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier identifier);
        
        /**
         * Appends and returns a new empty "identifier" element
         */
        au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier addNewIdentifier();
        
        /**
         * An XML identifier(@uri:types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Identifier extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Identifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("identifier2932elemtype");
            
            /**
             * Gets the "browser" element
             */
            au.gov.asic.types.BrowserIdentifierType getBrowser();
            
            /**
             * True if has "browser" element
             */
            boolean isSetBrowser();
            
            /**
             * Sets the "browser" element
             */
            void setBrowser(au.gov.asic.types.BrowserIdentifierType browser);
            
            /**
             * Appends and returns a new empty "browser" element
             */
            au.gov.asic.types.BrowserIdentifierType addNewBrowser();
            
            /**
             * Unsets the "browser" element
             */
            void unsetBrowser();
            
            /**
             * Gets the "soap" element
             */
            au.gov.asic.types.SoapSoftwareIdentifierType getSoap();
            
            /**
             * True if has "soap" element
             */
            boolean isSetSoap();
            
            /**
             * Sets the "soap" element
             */
            void setSoap(au.gov.asic.types.SoapSoftwareIdentifierType soap);
            
            /**
             * Appends and returns a new empty "soap" element
             */
            au.gov.asic.types.SoapSoftwareIdentifierType addNewSoap();
            
            /**
             * Unsets the "soap" element
             */
            void unsetSoap();
            
            /**
             * Gets the "internal" element
             */
            boolean getInternal();
            
            /**
             * Gets (as xml) the "internal" element
             */
            au.gov.asic.types.TrueType xgetInternal();
            
            /**
             * True if has "internal" element
             */
            boolean isSetInternal();
            
            /**
             * Sets the "internal" element
             */
            void setInternal(boolean internal);
            
            /**
             * Sets (as xml) the "internal" element
             */
            void xsetInternal(au.gov.asic.types.TrueType internal);
            
            /**
             * Unsets the "internal" element
             */
            void unsetInternal();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier newInstance() {
                  return (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.MessageIdentifierType.CustomerIdentifier newInstance() {
              return (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.MessageIdentifierType.CustomerIdentifier newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.MessageIdentifierType newInstance() {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.MessageIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.MessageIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.MessageIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.MessageIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.MessageIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.MessageIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
