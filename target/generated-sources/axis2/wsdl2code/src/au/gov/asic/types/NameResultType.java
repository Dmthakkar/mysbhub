/*
 * XML Type:  nameResultType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameResultType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML nameResultType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface NameResultType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameResultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nameresulttype3e7etype");
    
    /**
     * Gets the "nameAvailable" element
     */
    boolean getNameAvailable();
    
    /**
     * Gets (as xml) the "nameAvailable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetNameAvailable();
    
    /**
     * True if has "nameAvailable" element
     */
    boolean isSetNameAvailable();
    
    /**
     * Sets the "nameAvailable" element
     */
    void setNameAvailable(boolean nameAvailable);
    
    /**
     * Sets (as xml) the "nameAvailable" element
     */
    void xsetNameAvailable(org.apache.xmlbeans.XmlBoolean nameAvailable);
    
    /**
     * Unsets the "nameAvailable" element
     */
    void unsetNameAvailable();
    
    /**
     * Gets the "nameUnavailable" element
     */
    boolean getNameUnavailable();
    
    /**
     * Gets (as xml) the "nameUnavailable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetNameUnavailable();
    
    /**
     * True if has "nameUnavailable" element
     */
    boolean isSetNameUnavailable();
    
    /**
     * Sets the "nameUnavailable" element
     */
    void setNameUnavailable(boolean nameUnavailable);
    
    /**
     * Sets (as xml) the "nameUnavailable" element
     */
    void xsetNameUnavailable(org.apache.xmlbeans.XmlBoolean nameUnavailable);
    
    /**
     * Unsets the "nameUnavailable" element
     */
    void unsetNameUnavailable();
    
    /**
     * Gets the "nameSubjectToNamesDetermination" element
     */
    boolean getNameSubjectToNamesDetermination();
    
    /**
     * Gets (as xml) the "nameSubjectToNamesDetermination" element
     */
    org.apache.xmlbeans.XmlBoolean xgetNameSubjectToNamesDetermination();
    
    /**
     * True if has "nameSubjectToNamesDetermination" element
     */
    boolean isSetNameSubjectToNamesDetermination();
    
    /**
     * Sets the "nameSubjectToNamesDetermination" element
     */
    void setNameSubjectToNamesDetermination(boolean nameSubjectToNamesDetermination);
    
    /**
     * Sets (as xml) the "nameSubjectToNamesDetermination" element
     */
    void xsetNameSubjectToNamesDetermination(org.apache.xmlbeans.XmlBoolean nameSubjectToNamesDetermination);
    
    /**
     * Unsets the "nameSubjectToNamesDetermination" element
     */
    void unsetNameSubjectToNamesDetermination();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.NameResultType newInstance() {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.NameResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.NameResultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.NameResultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.NameResultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.NameResultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.NameResultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.NameResultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.NameResultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.NameResultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.NameResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.NameResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.NameResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
