/*
 * XML Type:  identifierType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.IdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML identifierType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface IdentifierType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("identifiertype131etype");
    
    /**
     * Gets the "identifierValue" element
     */
    java.lang.String getIdentifierValue();
    
    /**
     * Gets (as xml) the "identifierValue" element
     */
    au.gov.asic.types.abn.IdentifierValueType xgetIdentifierValue();
    
    /**
     * Sets the "identifierValue" element
     */
    void setIdentifierValue(java.lang.String identifierValue);
    
    /**
     * Sets (as xml) the "identifierValue" element
     */
    void xsetIdentifierValue(au.gov.asic.types.abn.IdentifierValueType identifierValue);
    
    /**
     * Gets the "identifierStatusCode" element
     */
    java.lang.String getIdentifierStatusCode();
    
    /**
     * Gets (as xml) the "identifierStatusCode" element
     */
    au.gov.asic.types.abn.IdentifierStatusCodeType xgetIdentifierStatusCode();
    
    /**
     * True if has "identifierStatusCode" element
     */
    boolean isSetIdentifierStatusCode();
    
    /**
     * Sets the "identifierStatusCode" element
     */
    void setIdentifierStatusCode(java.lang.String identifierStatusCode);
    
    /**
     * Sets (as xml) the "identifierStatusCode" element
     */
    void xsetIdentifierStatusCode(au.gov.asic.types.abn.IdentifierStatusCodeType identifierStatusCode);
    
    /**
     * Unsets the "identifierStatusCode" element
     */
    void unsetIdentifierStatusCode();
    
    /**
     * Gets the "issuingPartyCode" element
     */
    java.lang.String getIssuingPartyCode();
    
    /**
     * Gets (as xml) the "issuingPartyCode" element
     */
    au.gov.asic.types.abn.IssuingPartyCodeType xgetIssuingPartyCode();
    
    /**
     * True if has "issuingPartyCode" element
     */
    boolean isSetIssuingPartyCode();
    
    /**
     * Sets the "issuingPartyCode" element
     */
    void setIssuingPartyCode(java.lang.String issuingPartyCode);
    
    /**
     * Sets (as xml) the "issuingPartyCode" element
     */
    void xsetIssuingPartyCode(au.gov.asic.types.abn.IssuingPartyCodeType issuingPartyCode);
    
    /**
     * Unsets the "issuingPartyCode" element
     */
    void unsetIssuingPartyCode();
    
    /**
     * Gets the "replacedIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType.Enum getReplacedIndicator();
    
    /**
     * Gets (as xml) the "replacedIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType xgetReplacedIndicator();
    
    /**
     * True if has "replacedIndicator" element
     */
    boolean isSetReplacedIndicator();
    
    /**
     * Sets the "replacedIndicator" element
     */
    void setReplacedIndicator(au.gov.asic.types.abn.IndicatorType.Enum replacedIndicator);
    
    /**
     * Sets (as xml) the "replacedIndicator" element
     */
    void xsetReplacedIndicator(au.gov.asic.types.abn.IndicatorType replacedIndicator);
    
    /**
     * Unsets the "replacedIndicator" element
     */
    void unsetReplacedIndicator();
    
    /**
     * Gets the "effectiveFrom" element
     */
    java.util.Calendar getEffectiveFrom();
    
    /**
     * Gets (as xml) the "effectiveFrom" element
     */
    au.gov.asic.types.abn.DateType xgetEffectiveFrom();
    
    /**
     * True if has "effectiveFrom" element
     */
    boolean isSetEffectiveFrom();
    
    /**
     * Sets the "effectiveFrom" element
     */
    void setEffectiveFrom(java.util.Calendar effectiveFrom);
    
    /**
     * Sets (as xml) the "effectiveFrom" element
     */
    void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom);
    
    /**
     * Unsets the "effectiveFrom" element
     */
    void unsetEffectiveFrom();
    
    /**
     * Gets the "effectiveTo" element
     */
    java.util.Calendar getEffectiveTo();
    
    /**
     * Gets (as xml) the "effectiveTo" element
     */
    au.gov.asic.types.abn.DateType xgetEffectiveTo();
    
    /**
     * True if has "effectiveTo" element
     */
    boolean isSetEffectiveTo();
    
    /**
     * Sets the "effectiveTo" element
     */
    void setEffectiveTo(java.util.Calendar effectiveTo);
    
    /**
     * Sets (as xml) the "effectiveTo" element
     */
    void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo);
    
    /**
     * Unsets the "effectiveTo" element
     */
    void unsetEffectiveTo();
    
    /**
     * Gets the "deleteIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType.Enum getDeleteIndicator();
    
    /**
     * Gets (as xml) the "deleteIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType xgetDeleteIndicator();
    
    /**
     * True if has "deleteIndicator" element
     */
    boolean isSetDeleteIndicator();
    
    /**
     * Sets the "deleteIndicator" element
     */
    void setDeleteIndicator(au.gov.asic.types.abn.IndicatorType.Enum deleteIndicator);
    
    /**
     * Sets (as xml) the "deleteIndicator" element
     */
    void xsetDeleteIndicator(au.gov.asic.types.abn.IndicatorType deleteIndicator);
    
    /**
     * Unsets the "deleteIndicator" element
     */
    void unsetDeleteIndicator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.abn.IdentifierType newInstance() {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.IdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.IdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.IdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.IdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.IdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.IdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
