/*
 * XML Type:  asicNumericIdType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AsicNumericIdType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML asicNumericIdType(@uri:types.asic.gov.au).
 *
 * This is an atomic type that is a restriction of au.gov.asic.types.AsicNumericIdType.
 */
public interface AsicNumericIdType extends org.apache.xmlbeans.XmlInteger
{
    int getIntValue();
    void setIntValue(int i);
    /** @deprecated */
    int intValue();
    /** @deprecated */
    void set(int i);
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicNumericIdType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicnumericidtype3020type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.AsicNumericIdType newValue(java.lang.Object obj) {
          return (au.gov.asic.types.AsicNumericIdType) type.newValue( obj ); }
        
        public static au.gov.asic.types.AsicNumericIdType newInstance() {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.AsicNumericIdType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.AsicNumericIdType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.AsicNumericIdType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.AsicNumericIdType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.AsicNumericIdType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.AsicNumericIdType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
