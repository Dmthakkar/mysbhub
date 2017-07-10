/*
 * XML Type:  itemSummaryType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ItemSummaryType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML itemSummaryType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ItemSummaryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemSummaryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("itemsummarytype5e97type");
    
    /**
     * Gets the "messageType" element
     */
    java.lang.String getMessageType();
    
    /**
     * Gets (as xml) the "messageType" element
     */
    au.gov.asic.types.ItemSummaryType.MessageType xgetMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(java.lang.String messageType);
    
    /**
     * Sets (as xml) the "messageType" element
     */
    void xsetMessageType(au.gov.asic.types.ItemSummaryType.MessageType messageType);
    
    /**
     * Gets the "messageVersion" element
     */
    long getMessageVersion();
    
    /**
     * Gets (as xml) the "messageVersion" element
     */
    org.apache.xmlbeans.XmlLong xgetMessageVersion();
    
    /**
     * Sets the "messageVersion" element
     */
    void setMessageVersion(long messageVersion);
    
    /**
     * Sets (as xml) the "messageVersion" element
     */
    void xsetMessageVersion(org.apache.xmlbeans.XmlLong messageVersion);
    
    /**
     * Gets the "reportingEntity" element
     */
    au.gov.asic.types.EntityType getReportingEntity();
    
    /**
     * True if has "reportingEntity" element
     */
    boolean isSetReportingEntity();
    
    /**
     * Sets the "reportingEntity" element
     */
    void setReportingEntity(au.gov.asic.types.EntityType reportingEntity);
    
    /**
     * Appends and returns a new empty "reportingEntity" element
     */
    au.gov.asic.types.EntityType addNewReportingEntity();
    
    /**
     * Unsets the "reportingEntity" element
     */
    void unsetReportingEntity();
    
    /**
     * Gets the "itemIdentifier" element
     */
    au.gov.asic.types.OutboundItemIdentifierType getItemIdentifier();
    
    /**
     * Sets the "itemIdentifier" element
     */
    void setItemIdentifier(au.gov.asic.types.OutboundItemIdentifierType itemIdentifier);
    
    /**
     * Appends and returns a new empty "itemIdentifier" element
     */
    au.gov.asic.types.OutboundItemIdentifierType addNewItemIdentifier();
    
    /**
     * Gets the "lodgedDate" element
     */
    java.util.Calendar getLodgedDate();
    
    /**
     * Gets (as xml) the "lodgedDate" element
     */
    org.apache.xmlbeans.XmlDate xgetLodgedDate();
    
    /**
     * Sets the "lodgedDate" element
     */
    void setLodgedDate(java.util.Calendar lodgedDate);
    
    /**
     * Sets (as xml) the "lodgedDate" element
     */
    void xsetLodgedDate(org.apache.xmlbeans.XmlDate lodgedDate);
    
    /**
     * Gets the "result" element
     */
    au.gov.asic.types.ResultType getResult();
    
    /**
     * True if has "result" element
     */
    boolean isSetResult();
    
    /**
     * Sets the "result" element
     */
    void setResult(au.gov.asic.types.ResultType result);
    
    /**
     * Appends and returns a new empty "result" element
     */
    au.gov.asic.types.ResultType addNewResult();
    
    /**
     * Unsets the "result" element
     */
    void unsetResult();
    
    /**
     * Gets the "status" element
     */
    au.gov.asic.types.ApplicationStatusType.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    au.gov.asic.types.ApplicationStatusType xgetStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(au.gov.asic.types.ApplicationStatusType.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(au.gov.asic.types.ApplicationStatusType status);
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ItemSummaryType$MessageType.
     */
    public interface MessageType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetype1de4elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ItemSummaryType.MessageType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ItemSummaryType.MessageType) type.newValue( obj ); }
            
            public static au.gov.asic.types.ItemSummaryType.MessageType newInstance() {
              return (au.gov.asic.types.ItemSummaryType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ItemSummaryType.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ItemSummaryType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.ItemSummaryType newInstance() {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.ItemSummaryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.ItemSummaryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.ItemSummaryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ItemSummaryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ItemSummaryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ItemSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
