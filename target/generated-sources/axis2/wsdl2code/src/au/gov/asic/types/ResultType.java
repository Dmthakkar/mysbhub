/*
 * XML Type:  resultType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML resultType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ResultType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("resulttype0853type");
    
    /**
     * Gets the "requestFulfilled" element
     */
    boolean getRequestFulfilled();
    
    /**
     * Gets (as xml) the "requestFulfilled" element
     */
    au.gov.asic.types.TrueType xgetRequestFulfilled();
    
    /**
     * True if has "requestFulfilled" element
     */
    boolean isSetRequestFulfilled();
    
    /**
     * Sets the "requestFulfilled" element
     */
    void setRequestFulfilled(boolean requestFulfilled);
    
    /**
     * Sets (as xml) the "requestFulfilled" element
     */
    void xsetRequestFulfilled(au.gov.asic.types.TrueType requestFulfilled);
    
    /**
     * Unsets the "requestFulfilled" element
     */
    void unsetRequestFulfilled();
    
    /**
     * Gets the "requestRejected" element
     */
    boolean getRequestRejected();
    
    /**
     * Gets (as xml) the "requestRejected" element
     */
    au.gov.asic.types.TrueType xgetRequestRejected();
    
    /**
     * True if has "requestRejected" element
     */
    boolean isSetRequestRejected();
    
    /**
     * Sets the "requestRejected" element
     */
    void setRequestRejected(boolean requestRejected);
    
    /**
     * Sets (as xml) the "requestRejected" element
     */
    void xsetRequestRejected(au.gov.asic.types.TrueType requestRejected);
    
    /**
     * Unsets the "requestRejected" element
     */
    void unsetRequestRejected();
    
    /**
     * Gets the "requestDelayed" element
     */
    boolean getRequestDelayed();
    
    /**
     * Gets (as xml) the "requestDelayed" element
     */
    au.gov.asic.types.TrueType xgetRequestDelayed();
    
    /**
     * True if has "requestDelayed" element
     */
    boolean isSetRequestDelayed();
    
    /**
     * Sets the "requestDelayed" element
     */
    void setRequestDelayed(boolean requestDelayed);
    
    /**
     * Sets (as xml) the "requestDelayed" element
     */
    void xsetRequestDelayed(au.gov.asic.types.TrueType requestDelayed);
    
    /**
     * Unsets the "requestDelayed" element
     */
    void unsetRequestDelayed();
    
    /**
     * Gets the "requestFailed" element
     */
    boolean getRequestFailed();
    
    /**
     * Gets (as xml) the "requestFailed" element
     */
    au.gov.asic.types.TrueType xgetRequestFailed();
    
    /**
     * True if has "requestFailed" element
     */
    boolean isSetRequestFailed();
    
    /**
     * Sets the "requestFailed" element
     */
    void setRequestFailed(boolean requestFailed);
    
    /**
     * Sets (as xml) the "requestFailed" element
     */
    void xsetRequestFailed(au.gov.asic.types.TrueType requestFailed);
    
    /**
     * Unsets the "requestFailed" element
     */
    void unsetRequestFailed();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.ResultType newInstance() {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.ResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.ResultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.ResultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.ResultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.ResultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.ResultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.ResultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.ResultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.ResultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
