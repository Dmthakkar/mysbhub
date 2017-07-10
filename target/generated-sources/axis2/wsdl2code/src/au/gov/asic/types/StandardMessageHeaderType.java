/*
 * XML Type:  standardMessageHeaderType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.StandardMessageHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML standardMessageHeaderType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface StandardMessageHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardMessageHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("standardmessageheadertype217btype");
    
    /**
     * Gets the "messageType" element
     */
    java.lang.String getMessageType();
    
    /**
     * Gets (as xml) the "messageType" element
     */
    au.gov.asic.types.StandardMessageHeaderType.MessageType xgetMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(java.lang.String messageType);
    
    /**
     * Sets (as xml) the "messageType" element
     */
    void xsetMessageType(au.gov.asic.types.StandardMessageHeaderType.MessageType messageType);
    
    /**
     * Gets the "messageVersion" element
     */
    java.lang.String getMessageVersion();
    
    /**
     * Gets (as xml) the "messageVersion" element
     */
    au.gov.asic.types.StandardMessageHeaderType.MessageVersion xgetMessageVersion();
    
    /**
     * Sets the "messageVersion" element
     */
    void setMessageVersion(java.lang.String messageVersion);
    
    /**
     * Sets (as xml) the "messageVersion" element
     */
    void xsetMessageVersion(au.gov.asic.types.StandardMessageHeaderType.MessageVersion messageVersion);
    
    /**
     * Gets the "originatingChannel" element
     */
    au.gov.asic.types.OriginatingChannelType.Enum getOriginatingChannel();
    
    /**
     * Gets (as xml) the "originatingChannel" element
     */
    au.gov.asic.types.OriginatingChannelType xgetOriginatingChannel();
    
    /**
     * True if has "originatingChannel" element
     */
    boolean isSetOriginatingChannel();
    
    /**
     * Sets the "originatingChannel" element
     */
    void setOriginatingChannel(au.gov.asic.types.OriginatingChannelType.Enum originatingChannel);
    
    /**
     * Sets (as xml) the "originatingChannel" element
     */
    void xsetOriginatingChannel(au.gov.asic.types.OriginatingChannelType originatingChannel);
    
    /**
     * Unsets the "originatingChannel" element
     */
    void unsetOriginatingChannel();
    
    /**
     * Gets the "originatingService" element
     */
    au.gov.asic.types.OriginatingServiceType.Enum getOriginatingService();
    
    /**
     * Gets (as xml) the "originatingService" element
     */
    au.gov.asic.types.OriginatingServiceType xgetOriginatingService();
    
    /**
     * True if has "originatingService" element
     */
    boolean isSetOriginatingService();
    
    /**
     * Sets the "originatingService" element
     */
    void setOriginatingService(au.gov.asic.types.OriginatingServiceType.Enum originatingService);
    
    /**
     * Sets (as xml) the "originatingService" element
     */
    void xsetOriginatingService(au.gov.asic.types.OriginatingServiceType originatingService);
    
    /**
     * Unsets the "originatingService" element
     */
    void unsetOriginatingService();
    
    /**
     * Gets the "transactionId" element
     */
    java.lang.String getTransactionId();
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    au.gov.asic.types.StandardMessageHeaderType.TransactionId xgetTransactionId();
    
    /**
     * True if has "transactionId" element
     */
    boolean isSetTransactionId();
    
    /**
     * Sets the "transactionId" element
     */
    void setTransactionId(java.lang.String transactionId);
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    void xsetTransactionId(au.gov.asic.types.StandardMessageHeaderType.TransactionId transactionId);
    
    /**
     * Unsets the "transactionId" element
     */
    void unsetTransactionId();
    
    /**
     * Gets the "operation" element
     */
    java.lang.String getOperation();
    
    /**
     * Gets (as xml) the "operation" element
     */
    au.gov.asic.types.StandardMessageHeaderType.Operation xgetOperation();
    
    /**
     * True if has "operation" element
     */
    boolean isSetOperation();
    
    /**
     * Sets the "operation" element
     */
    void setOperation(java.lang.String operation);
    
    /**
     * Sets (as xml) the "operation" element
     */
    void xsetOperation(au.gov.asic.types.StandardMessageHeaderType.Operation operation);
    
    /**
     * Unsets the "operation" element
     */
    void unsetOperation();
    
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$MessageType.
     */
    public interface MessageType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetypee488elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.StandardMessageHeaderType.MessageType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.StandardMessageHeaderType.MessageType) type.newValue( obj ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.MessageType newInstance() {
              return (au.gov.asic.types.StandardMessageHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.StandardMessageHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML messageVersion(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$MessageVersion.
     */
    public interface MessageVersion extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageVersion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messageversion99a8elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.StandardMessageHeaderType.MessageVersion newValue(java.lang.Object obj) {
              return (au.gov.asic.types.StandardMessageHeaderType.MessageVersion) type.newValue( obj ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.MessageVersion newInstance() {
              return (au.gov.asic.types.StandardMessageHeaderType.MessageVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.MessageVersion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.StandardMessageHeaderType.MessageVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML transactionId(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$TransactionId.
     */
    public interface TransactionId extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("transactionid4140elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.StandardMessageHeaderType.TransactionId newValue(java.lang.Object obj) {
              return (au.gov.asic.types.StandardMessageHeaderType.TransactionId) type.newValue( obj ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.TransactionId newInstance() {
              return (au.gov.asic.types.StandardMessageHeaderType.TransactionId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.TransactionId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.StandardMessageHeaderType.TransactionId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML operation(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardMessageHeaderType$Operation.
     */
    public interface Operation extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("operationde8eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.StandardMessageHeaderType.Operation newValue(java.lang.Object obj) {
              return (au.gov.asic.types.StandardMessageHeaderType.Operation) type.newValue( obj ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.Operation newInstance() {
              return (au.gov.asic.types.StandardMessageHeaderType.Operation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.StandardMessageHeaderType.Operation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.StandardMessageHeaderType.Operation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.StandardMessageHeaderType newInstance() {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.StandardMessageHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.StandardMessageHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.StandardMessageHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.StandardMessageHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
