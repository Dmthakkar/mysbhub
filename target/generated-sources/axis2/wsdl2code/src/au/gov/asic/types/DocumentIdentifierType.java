/*
 * XML Type:  documentIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.DocumentIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML documentIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface DocumentIdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("documentidentifiertype541atype");
    
    /**
     * Gets the "ebusiness" element
     */
    au.gov.asic.types.DocumentIdentifierType.Ebusiness getEbusiness();
    
    /**
     * True if has "ebusiness" element
     */
    boolean isSetEbusiness();
    
    /**
     * Sets the "ebusiness" element
     */
    void setEbusiness(au.gov.asic.types.DocumentIdentifierType.Ebusiness ebusiness);
    
    /**
     * Appends and returns a new empty "ebusiness" element
     */
    au.gov.asic.types.DocumentIdentifierType.Ebusiness addNewEbusiness();
    
    /**
     * Unsets the "ebusiness" element
     */
    void unsetEbusiness();
    
    /**
     * Gets the "ascot" element
     */
    au.gov.asic.types.DocumentIdentifierType.Ascot getAscot();
    
    /**
     * True if has "ascot" element
     */
    boolean isSetAscot();
    
    /**
     * Sets the "ascot" element
     */
    void setAscot(au.gov.asic.types.DocumentIdentifierType.Ascot ascot);
    
    /**
     * Appends and returns a new empty "ascot" element
     */
    au.gov.asic.types.DocumentIdentifierType.Ascot addNewAscot();
    
    /**
     * Unsets the "ascot" element
     */
    void unsetAscot();
    
    /**
     * An XML ebusiness(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Ebusiness extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ebusiness.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("ebusinessb669elemtype");
        
        /**
         * Gets the "referenceNumber" element
         */
        long getReferenceNumber();
        
        /**
         * Gets (as xml) the "referenceNumber" element
         */
        au.gov.asic.types.ReferenceNoType xgetReferenceNumber();
        
        /**
         * Sets the "referenceNumber" element
         */
        void setReferenceNumber(long referenceNumber);
        
        /**
         * Sets (as xml) the "referenceNumber" element
         */
        void xsetReferenceNumber(au.gov.asic.types.ReferenceNoType referenceNumber);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.DocumentIdentifierType.Ebusiness newInstance() {
              return (au.gov.asic.types.DocumentIdentifierType.Ebusiness) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.DocumentIdentifierType.Ebusiness newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.DocumentIdentifierType.Ebusiness) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ascot(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Ascot extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ascot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("ascot8158elemtype");
        
        /**
         * Gets the "documentNumber" element
         */
        java.lang.String getDocumentNumber();
        
        /**
         * Gets (as xml) the "documentNumber" element
         */
        au.gov.asic.types.DocumentNoType xgetDocumentNumber();
        
        /**
         * Sets the "documentNumber" element
         */
        void setDocumentNumber(java.lang.String documentNumber);
        
        /**
         * Sets (as xml) the "documentNumber" element
         */
        void xsetDocumentNumber(au.gov.asic.types.DocumentNoType documentNumber);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.DocumentIdentifierType.Ascot newInstance() {
              return (au.gov.asic.types.DocumentIdentifierType.Ascot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.DocumentIdentifierType.Ascot newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.DocumentIdentifierType.Ascot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.DocumentIdentifierType newInstance() {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.DocumentIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.DocumentIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.DocumentIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.DocumentIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.DocumentIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.DocumentIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
