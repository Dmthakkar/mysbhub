/*
 * XML Type:  itemSearchScopeType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ItemSearchScopeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML itemSearchScopeType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ItemSearchScopeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemSearchScopeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("itemsearchscopetypee2fdtype");
    
    /**
     * Gets the "itemType" element
     */
    au.gov.asic.types.ItemTypeType.Enum getItemType();
    
    /**
     * Gets (as xml) the "itemType" element
     */
    au.gov.asic.types.ItemTypeType xgetItemType();
    
    /**
     * Sets the "itemType" element
     */
    void setItemType(au.gov.asic.types.ItemTypeType.Enum itemType);
    
    /**
     * Sets (as xml) the "itemType" element
     */
    void xsetItemType(au.gov.asic.types.ItemTypeType itemType);
    
    /**
     * Gets the "messageType" element
     */
    java.lang.String getMessageType();
    
    /**
     * Gets (as xml) the "messageType" element
     */
    au.gov.asic.types.ItemSearchScopeType.MessageType xgetMessageType();
    
    /**
     * True if has "messageType" element
     */
    boolean isSetMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(java.lang.String messageType);
    
    /**
     * Sets (as xml) the "messageType" element
     */
    void xsetMessageType(au.gov.asic.types.ItemSearchScopeType.MessageType messageType);
    
    /**
     * Unsets the "messageType" element
     */
    void unsetMessageType();
    
    /**
     * Gets the "reportingEntityAbn" element
     */
    java.lang.String getReportingEntityAbn();
    
    /**
     * Gets (as xml) the "reportingEntityAbn" element
     */
    au.gov.asic.types.AbnType xgetReportingEntityAbn();
    
    /**
     * True if has "reportingEntityAbn" element
     */
    boolean isSetReportingEntityAbn();
    
    /**
     * Sets the "reportingEntityAbn" element
     */
    void setReportingEntityAbn(java.lang.String reportingEntityAbn);
    
    /**
     * Sets (as xml) the "reportingEntityAbn" element
     */
    void xsetReportingEntityAbn(au.gov.asic.types.AbnType reportingEntityAbn);
    
    /**
     * Unsets the "reportingEntityAbn" element
     */
    void unsetReportingEntityAbn();
    
    /**
     * Gets the "reportingEntityAcn" element
     */
    int getReportingEntityAcn();
    
    /**
     * Gets (as xml) the "reportingEntityAcn" element
     */
    au.gov.asic.types.NniNumberType xgetReportingEntityAcn();
    
    /**
     * True if has "reportingEntityAcn" element
     */
    boolean isSetReportingEntityAcn();
    
    /**
     * Sets the "reportingEntityAcn" element
     */
    void setReportingEntityAcn(int reportingEntityAcn);
    
    /**
     * Sets (as xml) the "reportingEntityAcn" element
     */
    void xsetReportingEntityAcn(au.gov.asic.types.NniNumberType reportingEntityAcn);
    
    /**
     * Unsets the "reportingEntityAcn" element
     */
    void unsetReportingEntityAcn();
    
    /**
     * Gets the "dateStart" element
     */
    java.util.Calendar getDateStart();
    
    /**
     * Gets (as xml) the "dateStart" element
     */
    org.apache.xmlbeans.XmlDate xgetDateStart();
    
    /**
     * True if has "dateStart" element
     */
    boolean isSetDateStart();
    
    /**
     * Sets the "dateStart" element
     */
    void setDateStart(java.util.Calendar dateStart);
    
    /**
     * Sets (as xml) the "dateStart" element
     */
    void xsetDateStart(org.apache.xmlbeans.XmlDate dateStart);
    
    /**
     * Unsets the "dateStart" element
     */
    void unsetDateStart();
    
    /**
     * Gets the "dateEnd" element
     */
    java.util.Calendar getDateEnd();
    
    /**
     * Gets (as xml) the "dateEnd" element
     */
    org.apache.xmlbeans.XmlDate xgetDateEnd();
    
    /**
     * True if has "dateEnd" element
     */
    boolean isSetDateEnd();
    
    /**
     * Sets the "dateEnd" element
     */
    void setDateEnd(java.util.Calendar dateEnd);
    
    /**
     * Sets (as xml) the "dateEnd" element
     */
    void xsetDateEnd(org.apache.xmlbeans.XmlDate dateEnd);
    
    /**
     * Unsets the "dateEnd" element
     */
    void unsetDateEnd();
    
    /**
     * Gets the "unreadOnly" element
     */
    boolean getUnreadOnly();
    
    /**
     * Gets (as xml) the "unreadOnly" element
     */
    au.gov.asic.types.TrueType xgetUnreadOnly();
    
    /**
     * True if has "unreadOnly" element
     */
    boolean isSetUnreadOnly();
    
    /**
     * Sets the "unreadOnly" element
     */
    void setUnreadOnly(boolean unreadOnly);
    
    /**
     * Sets (as xml) the "unreadOnly" element
     */
    void xsetUnreadOnly(au.gov.asic.types.TrueType unreadOnly);
    
    /**
     * Unsets the "unreadOnly" element
     */
    void unsetUnreadOnly();
    
    /**
     * An XML messageType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ItemSearchScopeType$MessageType.
     */
    public interface MessageType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetype33caelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ItemSearchScopeType.MessageType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ItemSearchScopeType.MessageType) type.newValue( obj ); }
            
            public static au.gov.asic.types.ItemSearchScopeType.MessageType newInstance() {
              return (au.gov.asic.types.ItemSearchScopeType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ItemSearchScopeType.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ItemSearchScopeType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.ItemSearchScopeType newInstance() {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.ItemSearchScopeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.ItemSearchScopeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.ItemSearchScopeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ItemSearchScopeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ItemSearchScopeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ItemSearchScopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
