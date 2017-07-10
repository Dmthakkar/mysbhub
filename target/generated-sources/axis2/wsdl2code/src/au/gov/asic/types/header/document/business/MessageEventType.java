/*
 * XML Type:  messageEventType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.MessageEventType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business;


/**
 * An XML messageEventType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface MessageEventType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messageeventtyped3ddtype");
    
    /**
     * Gets the "errorCode" element
     */
    java.lang.String getErrorCode();
    
    /**
     * Gets (as xml) the "errorCode" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.ErrorCode xgetErrorCode();
    
    /**
     * Sets the "errorCode" element
     */
    void setErrorCode(java.lang.String errorCode);
    
    /**
     * Sets (as xml) the "errorCode" element
     */
    void xsetErrorCode(au.gov.asic.types.header.document.business.MessageEventType.ErrorCode errorCode);
    
    /**
     * Gets the "serverityCode" element
     */
    java.lang.String getServerityCode();
    
    /**
     * Gets (as xml) the "serverityCode" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.ServerityCode xgetServerityCode();
    
    /**
     * Sets the "serverityCode" element
     */
    void setServerityCode(java.lang.String serverityCode);
    
    /**
     * Sets (as xml) the "serverityCode" element
     */
    void xsetServerityCode(au.gov.asic.types.header.document.business.MessageEventType.ServerityCode serverityCode);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.Description xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(au.gov.asic.types.header.document.business.MessageEventType.Description description);
    
    /**
     * Gets the "locationPath" element
     */
    java.lang.String getLocationPath();
    
    /**
     * Gets (as xml) the "locationPath" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.LocationPath xgetLocationPath();
    
    /**
     * True if has "locationPath" element
     */
    boolean isSetLocationPath();
    
    /**
     * Sets the "locationPath" element
     */
    void setLocationPath(java.lang.String locationPath);
    
    /**
     * Sets (as xml) the "locationPath" element
     */
    void xsetLocationPath(au.gov.asic.types.header.document.business.MessageEventType.LocationPath locationPath);
    
    /**
     * Unsets the "locationPath" element
     */
    void unsetLocationPath();
    
    /**
     * Gets array of all "details" elements
     */
    java.lang.String[] getDetailsArray();
    
    /**
     * Gets ith "details" element
     */
    java.lang.String getDetailsArray(int i);
    
    /**
     * Gets (as xml) array of all "details" elements
     */
    au.gov.asic.types.header.document.business.MessageEventType.Details[] xgetDetailsArray();
    
    /**
     * Gets (as xml) ith "details" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.Details xgetDetailsArray(int i);
    
    /**
     * Returns number of "details" element
     */
    int sizeOfDetailsArray();
    
    /**
     * Sets array of all "details" element
     */
    void setDetailsArray(java.lang.String[] detailsArray);
    
    /**
     * Sets ith "details" element
     */
    void setDetailsArray(int i, java.lang.String details);
    
    /**
     * Sets (as xml) array of all "details" element
     */
    void xsetDetailsArray(au.gov.asic.types.header.document.business.MessageEventType.Details[] detailsArray);
    
    /**
     * Sets (as xml) ith "details" element
     */
    void xsetDetailsArray(int i, au.gov.asic.types.header.document.business.MessageEventType.Details details);
    
    /**
     * Inserts the value as the ith "details" element
     */
    void insertDetails(int i, java.lang.String details);
    
    /**
     * Appends the value as the last "details" element
     */
    void addDetails(java.lang.String details);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "details" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.Details insertNewDetails(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "details" element
     */
    au.gov.asic.types.header.document.business.MessageEventType.Details addNewDetails();
    
    /**
     * Removes the ith "details" element
     */
    void removeDetails(int i);
    
    /**
     * An XML errorCode(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$ErrorCode.
     */
    public interface ErrorCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("errorcode821eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.MessageEventType.ErrorCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.MessageEventType.ErrorCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.ErrorCode newInstance() {
              return (au.gov.asic.types.header.document.business.MessageEventType.ErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.ErrorCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.MessageEventType.ErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML serverityCode(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$ServerityCode.
     */
    public interface ServerityCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServerityCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("serveritycode7461elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.MessageEventType.ServerityCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.MessageEventType.ServerityCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.ServerityCode newInstance() {
              return (au.gov.asic.types.header.document.business.MessageEventType.ServerityCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.ServerityCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.MessageEventType.ServerityCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML description(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$Description.
     */
    public interface Description extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("descriptionc645elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.MessageEventType.Description newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.MessageEventType.Description) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.Description newInstance() {
              return (au.gov.asic.types.header.document.business.MessageEventType.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.MessageEventType.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML locationPath(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$LocationPath.
     */
    public interface LocationPath extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("locationpath7073elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.MessageEventType.LocationPath newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.MessageEventType.LocationPath) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.LocationPath newInstance() {
              return (au.gov.asic.types.header.document.business.MessageEventType.LocationPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.LocationPath newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.MessageEventType.LocationPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML details(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.MessageEventType$Details.
     */
    public interface Details extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Details.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("detailsff0belemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.MessageEventType.Details newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.MessageEventType.Details) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.Details newInstance() {
              return (au.gov.asic.types.header.document.business.MessageEventType.Details) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.MessageEventType.Details newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.MessageEventType.Details) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.header.document.business.MessageEventType newInstance() {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.MessageEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.MessageEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.MessageEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
