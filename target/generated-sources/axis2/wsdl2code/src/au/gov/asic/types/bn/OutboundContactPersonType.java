/*
 * XML Type:  outboundContactPersonType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.OutboundContactPersonType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML outboundContactPersonType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface OutboundContactPersonType extends au.gov.asic.types.bn.ContactPersonType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutboundContactPersonType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("outboundcontactpersontype3317type");
    
    /**
     * Gets the "startDate" element
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "startDate" element
     */
    org.apache.xmlbeans.XmlDate xgetStartDate();
    
    /**
     * True if has "startDate" element
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "startDate" element
     */
    void setStartDate(java.util.Calendar startDate);
    
    /**
     * Sets (as xml) the "startDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
    
    /**
     * Unsets the "startDate" element
     */
    void unsetStartDate();
    
    /**
     * Gets the "endDate" element
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "endDate" element
     */
    org.apache.xmlbeans.XmlDate xgetEndDate();
    
    /**
     * True if has "endDate" element
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "endDate" element
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "endDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
    
    /**
     * Unsets the "endDate" element
     */
    void unsetEndDate();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.OutboundContactPersonType newInstance() {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.OutboundContactPersonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.OutboundContactPersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
