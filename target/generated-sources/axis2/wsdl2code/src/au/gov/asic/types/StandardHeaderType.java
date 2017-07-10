/*
 * XML Type:  standardHeaderType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.StandardHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML standardHeaderType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface StandardHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("standardheadertype6ca0type");
    
    /**
     * Gets the "messageType" element
     */
    java.lang.String getMessageType();
    
    /**
     * Gets (as xml) the "messageType" element
     */
    au.gov.asic.types.StandardHeaderType.MessageType xgetMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(java.lang.String messageType);
    
    /**
     * Sets (as xml) the "messageType" element
     */
    void xsetMessageType(au.gov.asic.types.StandardHeaderType.MessageType messageType);
    
    /**
     * Gets the "messageVersion" element
     */
    java.lang.String getMessageVersion();
    
    /**
     * Gets (as xml) the "messageVersion" element
     */
    au.gov.asic.types.StandardHeaderType.MessageVersion xgetMessageVersion();
    
    /**
     * Sets the "messageVersion" element
     */
    void setMessageVersion(java.lang.String messageVersion);
    
    /**
     * Sets (as xml) the "messageVersion" element
     */
    void xsetMessageVersion(au.gov.asic.types.StandardHeaderType.MessageVersion messageVersion);
    
    /**
     * Gets the "originatingChannel" element
     */
    au.gov.asic.types.OriginatingChannelType.Enum getOriginatingChannel();
    
    /**
     * Gets (as xml) the "originatingChannel" element
     */
    au.gov.asic.types.OriginatingChannelType xgetOriginatingChannel();
    
    /**
     * Sets the "originatingChannel" element
     */
    void setOriginatingChannel(au.gov.asic.types.OriginatingChannelType.Enum originatingChannel);
    
    /**
     * Sets (as xml) the "originatingChannel" element
     */
    void xsetOriginatingChannel(au.gov.asic.types.OriginatingChannelType originatingChannel);
    
    /**
     * Gets the "originatingService" element
     */
    au.gov.asic.types.OriginatingServiceType.Enum getOriginatingService();
    
    /**
     * Gets (as xml) the "originatingService" element
     */
    au.gov.asic.types.OriginatingServiceType xgetOriginatingService();
    
    /**
     * Sets the "originatingService" element
     */
    void setOriginatingService(au.gov.asic.types.OriginatingServiceType.Enum originatingService);
    
    /**
     * Sets (as xml) the "originatingService" element
     */
    void xsetOriginatingService(au.gov.asic.types.OriginatingServiceType originatingService);
    
    /**
     * Gets the "dateReceived" element
     */
    java.util.Calendar getDateReceived();
    
    /**
     * Gets (as xml) the "dateReceived" element
     */
    org.apache.xmlbeans.XmlDate xgetDateReceived();
    
    /**
     * True if has "dateReceived" element
     */
    boolean isSetDateReceived();
    
    /**
     * Sets the "dateReceived" element
     */
    void setDateReceived(java.util.Calendar dateReceived);
    
    /**
     * Sets (as xml) the "dateReceived" element
     */
    void xsetDateReceived(org.apache.xmlbeans.XmlDate dateReceived);
    
    /**
     * Unsets the "dateReceived" element
     */
    void unsetDateReceived();
    
    /**
     * Gets the "timeReceived" element
     */
    java.util.Calendar getTimeReceived();
    
    /**
     * Gets (as xml) the "timeReceived" element
     */
    org.apache.xmlbeans.XmlTime xgetTimeReceived();
    
    /**
     * True if has "timeReceived" element
     */
    boolean isSetTimeReceived();
    
    /**
     * Sets the "timeReceived" element
     */
    void setTimeReceived(java.util.Calendar timeReceived);
    
    /**
     * Sets (as xml) the "timeReceived" element
     */
    void xsetTimeReceived(org.apache.xmlbeans.XmlTime timeReceived);
    
    /**
     * Unsets the "timeReceived" element
     */
    void unsetTimeReceived();
    
    /**
     * Gets the "enteredByAsic" element
     */
    boolean getEnteredByAsic();
    
    /**
     * Gets (as xml) the "enteredByAsic" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEnteredByAsic();
    
    /**
     * True if has "enteredByAsic" element
     */
    boolean isSetEnteredByAsic();
    
    /**
     * Sets the "enteredByAsic" element
     */
    void setEnteredByAsic(boolean enteredByAsic);
    
    /**
     * Sets (as xml) the "enteredByAsic" element
     */
    void xsetEnteredByAsic(org.apache.xmlbeans.XmlBoolean enteredByAsic);
    
    /**
     * Unsets the "enteredByAsic" element
     */
    void unsetEnteredByAsic();
    
    /**
     * Gets the "dateCommenced" element
     */
    java.util.Calendar getDateCommenced();
    
    /**
     * Gets (as xml) the "dateCommenced" element
     */
    org.apache.xmlbeans.XmlDate xgetDateCommenced();
    
    /**
     * True if has "dateCommenced" element
     */
    boolean isSetDateCommenced();
    
    /**
     * Sets the "dateCommenced" element
     */
    void setDateCommenced(java.util.Calendar dateCommenced);
    
    /**
     * Sets (as xml) the "dateCommenced" element
     */
    void xsetDateCommenced(org.apache.xmlbeans.XmlDate dateCommenced);
    
    /**
     * Unsets the "dateCommenced" element
     */
    void unsetDateCommenced();
    
    /**
     * Gets the "timeCommenced" element
     */
    java.util.Calendar getTimeCommenced();
    
    /**
     * Gets (as xml) the "timeCommenced" element
     */
    org.apache.xmlbeans.XmlTime xgetTimeCommenced();
    
    /**
     * True if has "timeCommenced" element
     */
    boolean isSetTimeCommenced();
    
    /**
     * Sets the "timeCommenced" element
     */
    void setTimeCommenced(java.util.Calendar timeCommenced);
    
    /**
     * Sets (as xml) the "timeCommenced" element
     */
    void xsetTimeCommenced(org.apache.xmlbeans.XmlTime timeCommenced);
    
    /**
     * Unsets the "timeCommenced" element
     */
    void unsetTimeCommenced();
    
    /**
     * Gets the "dateSubmitted" element
     */
    java.util.Calendar getDateSubmitted();
    
    /**
     * Gets (as xml) the "dateSubmitted" element
     */
    org.apache.xmlbeans.XmlDate xgetDateSubmitted();
    
    /**
     * True if has "dateSubmitted" element
     */
    boolean isSetDateSubmitted();
    
    /**
     * Sets the "dateSubmitted" element
     */
    void setDateSubmitted(java.util.Calendar dateSubmitted);
    
    /**
     * Sets (as xml) the "dateSubmitted" element
     */
    void xsetDateSubmitted(org.apache.xmlbeans.XmlDate dateSubmitted);
    
    /**
     * Unsets the "dateSubmitted" element
     */
    void unsetDateSubmitted();
    
    /**
     * Gets the "timeSubmitted" element
     */
    java.util.Calendar getTimeSubmitted();
    
    /**
     * Gets (as xml) the "timeSubmitted" element
     */
    org.apache.xmlbeans.XmlTime xgetTimeSubmitted();
    
    /**
     * True if has "timeSubmitted" element
     */
    boolean isSetTimeSubmitted();
    
    /**
     * Sets the "timeSubmitted" element
     */
    void setTimeSubmitted(java.util.Calendar timeSubmitted);
    
    /**
     * Sets (as xml) the "timeSubmitted" element
     */
    void xsetTimeSubmitted(org.apache.xmlbeans.XmlTime timeSubmitted);
    
    /**
     * Unsets the "timeSubmitted" element
     */
    void unsetTimeSubmitted();
    
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardHeaderType$MessageType.
     */
    public interface MessageType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetype4e33elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.StandardHeaderType.MessageType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.StandardHeaderType.MessageType) type.newValue( obj ); }
            
            public static au.gov.asic.types.StandardHeaderType.MessageType newInstance() {
              return (au.gov.asic.types.StandardHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.StandardHeaderType.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.StandardHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML messageVersion(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.StandardHeaderType$MessageVersion.
     */
    public interface MessageVersion extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageVersion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messageversion1d13elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.StandardHeaderType.MessageVersion newValue(java.lang.Object obj) {
              return (au.gov.asic.types.StandardHeaderType.MessageVersion) type.newValue( obj ); }
            
            public static au.gov.asic.types.StandardHeaderType.MessageVersion newInstance() {
              return (au.gov.asic.types.StandardHeaderType.MessageVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.StandardHeaderType.MessageVersion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.StandardHeaderType.MessageVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.StandardHeaderType newInstance() {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.StandardHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.StandardHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.StandardHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.StandardHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.StandardHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.StandardHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
