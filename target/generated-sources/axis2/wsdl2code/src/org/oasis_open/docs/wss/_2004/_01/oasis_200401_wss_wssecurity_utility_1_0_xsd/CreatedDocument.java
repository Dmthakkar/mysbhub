/*
 * An XML document type.
 * Localname: Created
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd
 * Java type: org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd;


/**
 * A document containing one Created(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd) element.
 *
 * This is a complex type.
 */
public interface CreatedDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreatedDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("createda806doctype");
    
    /**
     * Gets the "Created" element
     */
    org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime getCreated();
    
    /**
     * Sets the "Created" element
     */
    void setCreated(org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime created);
    
    /**
     * Appends and returns a new empty "Created" element
     */
    org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime addNewCreated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument newInstance() {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
