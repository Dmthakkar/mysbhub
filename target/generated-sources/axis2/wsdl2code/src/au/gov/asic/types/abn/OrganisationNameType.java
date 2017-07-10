/*
 * XML Type:  organisationNameType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.OrganisationNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML organisationNameType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface OrganisationNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisationnametype3d3atype");
    
    /**
     * Gets the "organisationShortName1" element
     */
    java.lang.String getOrganisationShortName1();
    
    /**
     * Gets (as xml) the "organisationShortName1" element
     */
    au.gov.asic.types.NniNameType xgetOrganisationShortName1();
    
    /**
     * Sets the "organisationShortName1" element
     */
    void setOrganisationShortName1(java.lang.String organisationShortName1);
    
    /**
     * Sets (as xml) the "organisationShortName1" element
     */
    void xsetOrganisationShortName1(au.gov.asic.types.NniNameType organisationShortName1);
    
    /**
     * Gets the "organisationShortName2" element
     */
    java.lang.String getOrganisationShortName2();
    
    /**
     * Gets (as xml) the "organisationShortName2" element
     */
    au.gov.asic.types.NniNameType xgetOrganisationShortName2();
    
    /**
     * Sets the "organisationShortName2" element
     */
    void setOrganisationShortName2(java.lang.String organisationShortName2);
    
    /**
     * Sets (as xml) the "organisationShortName2" element
     */
    void xsetOrganisationShortName2(au.gov.asic.types.NniNameType organisationShortName2);
    
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
     * Sets the "deleteIndicator" element
     */
    void setDeleteIndicator(au.gov.asic.types.abn.IndicatorType.Enum deleteIndicator);
    
    /**
     * Sets (as xml) the "deleteIndicator" element
     */
    void xsetDeleteIndicator(au.gov.asic.types.abn.IndicatorType deleteIndicator);
    
    /**
     * Gets the "organisationName" element
     */
    java.lang.String getOrganisationName();
    
    /**
     * Gets (as xml) the "organisationName" element
     */
    au.gov.asic.types.NniNameType xgetOrganisationName();
    
    /**
     * Sets the "organisationName" element
     */
    void setOrganisationName(java.lang.String organisationName);
    
    /**
     * Sets (as xml) the "organisationName" element
     */
    void xsetOrganisationName(au.gov.asic.types.NniNameType organisationName);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.abn.OrganisationNameType newInstance() {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.OrganisationNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.OrganisationNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.OrganisationNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.OrganisationNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
