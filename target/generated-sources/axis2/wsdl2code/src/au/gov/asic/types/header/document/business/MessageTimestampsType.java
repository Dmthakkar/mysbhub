/*
 * XML Type:  messageTimestampsType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.MessageTimestampsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business;


/**
 * An XML messageTimestampsType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface MessageTimestampsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageTimestampsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetimestampstype9efetype");
    
    /**
     * Gets array of all "messageTimestamp" elements
     */
    au.gov.asic.types.header.document.business.MessageTimestampType[] getMessageTimestampArray();
    
    /**
     * Gets ith "messageTimestamp" element
     */
    au.gov.asic.types.header.document.business.MessageTimestampType getMessageTimestampArray(int i);
    
    /**
     * Returns number of "messageTimestamp" element
     */
    int sizeOfMessageTimestampArray();
    
    /**
     * Sets array of all "messageTimestamp" element
     */
    void setMessageTimestampArray(au.gov.asic.types.header.document.business.MessageTimestampType[] messageTimestampArray);
    
    /**
     * Sets ith "messageTimestamp" element
     */
    void setMessageTimestampArray(int i, au.gov.asic.types.header.document.business.MessageTimestampType messageTimestamp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageTimestamp" element
     */
    au.gov.asic.types.header.document.business.MessageTimestampType insertNewMessageTimestamp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageTimestamp" element
     */
    au.gov.asic.types.header.document.business.MessageTimestampType addNewMessageTimestamp();
    
    /**
     * Removes the ith "messageTimestamp" element
     */
    void removeMessageTimestamp(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.header.document.business.MessageTimestampsType newInstance() {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.MessageTimestampsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.MessageTimestampsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
