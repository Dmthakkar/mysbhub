/*
 * XML Type:  genericResultType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.GenericResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business;


/**
 * An XML genericResultType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface GenericResultType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenericResultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("genericresulttyped22etype");
    
    /**
     * Gets the "accepted" element
     */
    boolean getAccepted();
    
    /**
     * Gets (as xml) the "accepted" element
     */
    au.gov.asic.types.TrueType xgetAccepted();
    
    /**
     * True if has "accepted" element
     */
    boolean isSetAccepted();
    
    /**
     * Sets the "accepted" element
     */
    void setAccepted(boolean accepted);
    
    /**
     * Sets (as xml) the "accepted" element
     */
    void xsetAccepted(au.gov.asic.types.TrueType accepted);
    
    /**
     * Unsets the "accepted" element
     */
    void unsetAccepted();
    
    /**
     * Gets the "rejected" element
     */
    boolean getRejected();
    
    /**
     * Gets (as xml) the "rejected" element
     */
    au.gov.asic.types.TrueType xgetRejected();
    
    /**
     * True if has "rejected" element
     */
    boolean isSetRejected();
    
    /**
     * Sets the "rejected" element
     */
    void setRejected(boolean rejected);
    
    /**
     * Sets (as xml) the "rejected" element
     */
    void xsetRejected(au.gov.asic.types.TrueType rejected);
    
    /**
     * Unsets the "rejected" element
     */
    void unsetRejected();
    
    /**
     * Gets the "delayed" element
     */
    boolean getDelayed();
    
    /**
     * Gets (as xml) the "delayed" element
     */
    au.gov.asic.types.TrueType xgetDelayed();
    
    /**
     * True if has "delayed" element
     */
    boolean isSetDelayed();
    
    /**
     * Sets the "delayed" element
     */
    void setDelayed(boolean delayed);
    
    /**
     * Sets (as xml) the "delayed" element
     */
    void xsetDelayed(au.gov.asic.types.TrueType delayed);
    
    /**
     * Unsets the "delayed" element
     */
    void unsetDelayed();
    
    /**
     * Gets the "fault" element
     */
    boolean getFault();
    
    /**
     * Gets (as xml) the "fault" element
     */
    au.gov.asic.types.TrueType xgetFault();
    
    /**
     * True if has "fault" element
     */
    boolean isSetFault();
    
    /**
     * Sets the "fault" element
     */
    void setFault(boolean fault);
    
    /**
     * Sets (as xml) the "fault" element
     */
    void xsetFault(au.gov.asic.types.TrueType fault);
    
    /**
     * Unsets the "fault" element
     */
    void unsetFault();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.header.document.business.GenericResultType newInstance() {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.header.document.business.GenericResultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.GenericResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.GenericResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.GenericResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
