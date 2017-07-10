/*
 * XML Type:  abnEmailType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbnEmailType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML abnEmailType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface AbnEmailType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbnEmailType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("abnemailtype1d64type");
    
    /**
     * Gets the "effectiveFrom" element
     */
    java.util.Calendar getEffectiveFrom();
    
    /**
     * Gets (as xml) the "effectiveFrom" element
     */
    au.gov.asic.types.abn.DateType xgetEffectiveFrom();
    
    /**
     * Sets the "effectiveFrom" element
     */
    void setEffectiveFrom(java.util.Calendar effectiveFrom);
    
    /**
     * Sets (as xml) the "effectiveFrom" element
     */
    void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom);
    
    /**
     * Gets the "effectiveTo" element
     */
    java.util.Calendar getEffectiveTo();
    
    /**
     * Gets (as xml) the "effectiveTo" element
     */
    au.gov.asic.types.abn.DateType xgetEffectiveTo();
    
    /**
     * Sets the "effectiveTo" element
     */
    void setEffectiveTo(java.util.Calendar effectiveTo);
    
    /**
     * Sets (as xml) the "effectiveTo" element
     */
    void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo);
    
    /**
     * Gets the "deleteIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType.Enum getDeleteIndicator();
    
    /**
     * Gets (as xml) the "deleteIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType xgetDeleteIndicator();
    
    /**
     * Sets the "deleteIndicator" element
     */
    void setDeleteIndicator(au.gov.asic.types.abn.IndicatorType.Enum deleteIndicator);
    
    /**
     * Sets (as xml) the "deleteIndicator" element
     */
    void xsetDeleteIndicator(au.gov.asic.types.abn.IndicatorType deleteIndicator);
    
    /**
     * Gets the "emailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    au.gov.asic.types.EmailType xgetEmailAddress();
    
    /**
     * Sets the "emailAddress" element
     */
    void setEmailAddress(java.lang.String emailAddress);
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    void xsetEmailAddress(au.gov.asic.types.EmailType emailAddress);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.abn.AbnEmailType newInstance() {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.AbnEmailType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.AbnEmailType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.AbnEmailType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.AbnEmailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.AbnEmailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.AbnEmailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
