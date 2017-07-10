/*
 * XML Type:  queryNameAvailabilityReplyType
 * Namespace: uri:v2.external.query.name.availability.asic.gov.au
 * Java type: au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.availability.name.query.external.v2;


/**
 * An XML queryNameAvailabilityReplyType(@uri:v2.external.query.name.availability.asic.gov.au).
 *
 * This is a complex type.
 */
public interface QueryNameAvailabilityReplyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryNameAvailabilityReplyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("querynameavailabilityreplytype3f20type");
    
    /**
     * Gets the "businessDocumentHeader" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType getBusinessDocumentHeader();
    
    /**
     * Sets the "businessDocumentHeader" element
     */
    void setBusinessDocumentHeader(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType businessDocumentHeader);
    
    /**
     * Appends and returns a new empty "businessDocumentHeader" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType addNewBusinessDocumentHeader();
    
    /**
     * Gets the "businessDocumentBody" element
     */
    au.gov.asic.types.NameAvailabilityResponseType getBusinessDocumentBody();
    
    /**
     * True if has "businessDocumentBody" element
     */
    boolean isSetBusinessDocumentBody();
    
    /**
     * Sets the "businessDocumentBody" element
     */
    void setBusinessDocumentBody(au.gov.asic.types.NameAvailabilityResponseType businessDocumentBody);
    
    /**
     * Appends and returns a new empty "businessDocumentBody" element
     */
    au.gov.asic.types.NameAvailabilityResponseType addNewBusinessDocumentBody();
    
    /**
     * Unsets the "businessDocumentBody" element
     */
    void unsetBusinessDocumentBody();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType newInstance() {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
