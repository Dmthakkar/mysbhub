/*
 * XML Type:  outboundItemIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.OutboundItemIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML outboundItemIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface OutboundItemIdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutboundItemIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("outbounditemidentifiertypee4a2type");
    
    /**
     * Gets the "referenceNumber" element
     */
    long getReferenceNumber();
    
    /**
     * Gets (as xml) the "referenceNumber" element
     */
    au.gov.asic.types.ReferenceNoType xgetReferenceNumber();
    
    /**
     * True if has "referenceNumber" element
     */
    boolean isSetReferenceNumber();
    
    /**
     * Sets the "referenceNumber" element
     */
    void setReferenceNumber(long referenceNumber);
    
    /**
     * Sets (as xml) the "referenceNumber" element
     */
    void xsetReferenceNumber(au.gov.asic.types.ReferenceNoType referenceNumber);
    
    /**
     * Unsets the "referenceNumber" element
     */
    void unsetReferenceNumber();
    
    /**
     * Gets the "documentNumber" element
     */
    java.lang.String getDocumentNumber();
    
    /**
     * Gets (as xml) the "documentNumber" element
     */
    au.gov.asic.types.DocumentNoType xgetDocumentNumber();
    
    /**
     * True if has "documentNumber" element
     */
    boolean isSetDocumentNumber();
    
    /**
     * Sets the "documentNumber" element
     */
    void setDocumentNumber(java.lang.String documentNumber);
    
    /**
     * Sets (as xml) the "documentNumber" element
     */
    void xsetDocumentNumber(au.gov.asic.types.DocumentNoType documentNumber);
    
    /**
     * Unsets the "documentNumber" element
     */
    void unsetDocumentNumber();
    
    /**
     * Gets the "externalReferenceNumber" element
     */
    java.lang.String getExternalReferenceNumber();
    
    /**
     * Gets (as xml) the "externalReferenceNumber" element
     */
    au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber xgetExternalReferenceNumber();
    
    /**
     * True if has "externalReferenceNumber" element
     */
    boolean isSetExternalReferenceNumber();
    
    /**
     * Sets the "externalReferenceNumber" element
     */
    void setExternalReferenceNumber(java.lang.String externalReferenceNumber);
    
    /**
     * Sets (as xml) the "externalReferenceNumber" element
     */
    void xsetExternalReferenceNumber(au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber externalReferenceNumber);
    
    /**
     * Unsets the "externalReferenceNumber" element
     */
    void unsetExternalReferenceNumber();
    
    /**
     * Gets the "inboxNumber" element
     */
    long getInboxNumber();
    
    /**
     * Gets (as xml) the "inboxNumber" element
     */
    au.gov.asic.types.ReferenceNoType xgetInboxNumber();
    
    /**
     * True if has "inboxNumber" element
     */
    boolean isSetInboxNumber();
    
    /**
     * Sets the "inboxNumber" element
     */
    void setInboxNumber(long inboxNumber);
    
    /**
     * Sets (as xml) the "inboxNumber" element
     */
    void xsetInboxNumber(au.gov.asic.types.ReferenceNoType inboxNumber);
    
    /**
     * Unsets the "inboxNumber" element
     */
    void unsetInboxNumber();
    
    /**
     * An XML externalReferenceNumber(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.OutboundItemIdentifierType$ExternalReferenceNumber.
     */
    public interface ExternalReferenceNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalReferenceNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("externalreferencenumber0aedelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber newInstance() {
              return (au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.OutboundItemIdentifierType.ExternalReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.OutboundItemIdentifierType newInstance() {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.OutboundItemIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.OutboundItemIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.OutboundItemIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.OutboundItemIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
