/*
 * XML Type:  hexBinary
 * Namespace: http://www.w3.org/2005/05/xmlmime
 * Java type: org.w3.www._2005._05.xmlmime.HexBinary
 *
 * Automatically generated - do not modify.
 */
package org.w3.www._2005._05.xmlmime;


/**
 * An XML hexBinary(@http://www.w3.org/2005/05/xmlmime).
 *
 * This is an atomic type that is a restriction of org.w3.www._2005._05.xmlmime.HexBinary.
 */
public interface HexBinary extends org.apache.xmlbeans.XmlHexBinary
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HexBinary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("hexbinary1f8ctype");
    
    /**
     * Gets the "contentType" attribute
     */
    java.lang.String getContentType();
    
    /**
     * Gets (as xml) the "contentType" attribute
     */
    org.w3.www._2005._05.xmlmime.ContentTypeAttribute.ContentType xgetContentType();
    
    /**
     * True if has "contentType" attribute
     */
    boolean isSetContentType();
    
    /**
     * Sets the "contentType" attribute
     */
    void setContentType(java.lang.String contentType);
    
    /**
     * Sets (as xml) the "contentType" attribute
     */
    void xsetContentType(org.w3.www._2005._05.xmlmime.ContentTypeAttribute.ContentType contentType);
    
    /**
     * Unsets the "contentType" attribute
     */
    void unsetContentType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.www._2005._05.xmlmime.HexBinary newInstance() {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.www._2005._05.xmlmime.HexBinary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.www._2005._05.xmlmime.HexBinary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
