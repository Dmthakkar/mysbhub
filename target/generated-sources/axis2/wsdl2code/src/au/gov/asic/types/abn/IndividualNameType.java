/*
 * XML Type:  individualNameType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.IndividualNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML individualNameType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface IndividualNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndividualNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("individualnametype4579type");
    
    /**
     * Gets the "titleTypeCode" element
     */
    java.lang.String getTitleTypeCode();
    
    /**
     * Gets (as xml) the "titleTypeCode" element
     */
    au.gov.asic.types.abn.TitleTypeCodeType xgetTitleTypeCode();
    
    /**
     * True if has "titleTypeCode" element
     */
    boolean isSetTitleTypeCode();
    
    /**
     * Sets the "titleTypeCode" element
     */
    void setTitleTypeCode(java.lang.String titleTypeCode);
    
    /**
     * Sets (as xml) the "titleTypeCode" element
     */
    void xsetTitleTypeCode(au.gov.asic.types.abn.TitleTypeCodeType titleTypeCode);
    
    /**
     * Unsets the "titleTypeCode" element
     */
    void unsetTitleTypeCode();
    
    /**
     * Gets the "givenName" element
     */
    java.lang.String getGivenName();
    
    /**
     * Gets (as xml) the "givenName" element
     */
    au.gov.asic.types.abn.GivenNameType xgetGivenName();
    
    /**
     * Sets the "givenName" element
     */
    void setGivenName(java.lang.String givenName);
    
    /**
     * Sets (as xml) the "givenName" element
     */
    void xsetGivenName(au.gov.asic.types.abn.GivenNameType givenName);
    
    /**
     * Gets the "otherGivenName" element
     */
    java.lang.String getOtherGivenName();
    
    /**
     * Gets (as xml) the "otherGivenName" element
     */
    au.gov.asic.types.abn.OtherGivenNameType xgetOtherGivenName();
    
    /**
     * True if has "otherGivenName" element
     */
    boolean isSetOtherGivenName();
    
    /**
     * Sets the "otherGivenName" element
     */
    void setOtherGivenName(java.lang.String otherGivenName);
    
    /**
     * Sets (as xml) the "otherGivenName" element
     */
    void xsetOtherGivenName(au.gov.asic.types.abn.OtherGivenNameType otherGivenName);
    
    /**
     * Unsets the "otherGivenName" element
     */
    void unsetOtherGivenName();
    
    /**
     * Gets the "familyName" element
     */
    java.lang.String getFamilyName();
    
    /**
     * Gets (as xml) the "familyName" element
     */
    au.gov.asic.types.abn.FamilyNameType xgetFamilyName();
    
    /**
     * Sets the "familyName" element
     */
    void setFamilyName(java.lang.String familyName);
    
    /**
     * Sets (as xml) the "familyName" element
     */
    void xsetFamilyName(au.gov.asic.types.abn.FamilyNameType familyName);
    
    /**
     * Gets the "suffixTypeCode" element
     */
    java.lang.String getSuffixTypeCode();
    
    /**
     * Gets (as xml) the "suffixTypeCode" element
     */
    au.gov.asic.types.abn.SuffixTypeCodeType xgetSuffixTypeCode();
    
    /**
     * True if has "suffixTypeCode" element
     */
    boolean isSetSuffixTypeCode();
    
    /**
     * Sets the "suffixTypeCode" element
     */
    void setSuffixTypeCode(java.lang.String suffixTypeCode);
    
    /**
     * Sets (as xml) the "suffixTypeCode" element
     */
    void xsetSuffixTypeCode(au.gov.asic.types.abn.SuffixTypeCodeType suffixTypeCode);
    
    /**
     * Unsets the "suffixTypeCode" element
     */
    void unsetSuffixTypeCode();
    
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
        public static au.gov.asic.types.abn.IndividualNameType newInstance() {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.IndividualNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.IndividualNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.IndividualNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.IndividualNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.IndividualNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.IndividualNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
