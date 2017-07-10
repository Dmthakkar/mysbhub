/*
 * XML Type:  reportDataType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.ReportDataType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML reportDataType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ReportDataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("reportdatatypeb48ctype");
    
    /**
     * Gets the "reportIdentifier" element
     */
    long getReportIdentifier();
    
    /**
     * Gets (as xml) the "reportIdentifier" element
     */
    au.gov.asic.types.ReferenceNoType xgetReportIdentifier();
    
    /**
     * Sets the "reportIdentifier" element
     */
    void setReportIdentifier(long reportIdentifier);
    
    /**
     * Sets (as xml) the "reportIdentifier" element
     */
    void xsetReportIdentifier(au.gov.asic.types.ReferenceNoType reportIdentifier);
    
    /**
     * Gets the "reportType" element
     */
    au.gov.asic.types.bn.BnReportType.Enum getReportType();
    
    /**
     * Gets (as xml) the "reportType" element
     */
    au.gov.asic.types.bn.BnReportType xgetReportType();
    
    /**
     * Sets the "reportType" element
     */
    void setReportType(au.gov.asic.types.bn.BnReportType.Enum reportType);
    
    /**
     * Sets (as xml) the "reportType" element
     */
    void xsetReportType(au.gov.asic.types.bn.BnReportType reportType);
    
    /**
     * Gets the "createDate" element
     */
    java.util.Calendar getCreateDate();
    
    /**
     * Gets (as xml) the "createDate" element
     */
    org.apache.xmlbeans.XmlDate xgetCreateDate();
    
    /**
     * Sets the "createDate" element
     */
    void setCreateDate(java.util.Calendar createDate);
    
    /**
     * Sets (as xml) the "createDate" element
     */
    void xsetCreateDate(org.apache.xmlbeans.XmlDate createDate);
    
    /**
     * Gets the "reportPeriod" element
     */
    au.gov.asic.types.bn.PeriodType getReportPeriod();
    
    /**
     * True if has "reportPeriod" element
     */
    boolean isSetReportPeriod();
    
    /**
     * Sets the "reportPeriod" element
     */
    void setReportPeriod(au.gov.asic.types.bn.PeriodType reportPeriod);
    
    /**
     * Appends and returns a new empty "reportPeriod" element
     */
    au.gov.asic.types.bn.PeriodType addNewReportPeriod();
    
    /**
     * Unsets the "reportPeriod" element
     */
    void unsetReportPeriod();
    
    /**
     * Gets the "state" element
     */
    au.gov.asic.types.StateTerritoryCodeType.Enum getState();
    
    /**
     * Gets (as xml) the "state" element
     */
    au.gov.asic.types.StateTerritoryCodeType xgetState();
    
    /**
     * True if has "state" element
     */
    boolean isSetState();
    
    /**
     * Sets the "state" element
     */
    void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state);
    
    /**
     * Sets (as xml) the "state" element
     */
    void xsetState(au.gov.asic.types.StateTerritoryCodeType state);
    
    /**
     * Unsets the "state" element
     */
    void unsetState();
    
    /**
     * Gets the "reportSize" element
     */
    long getReportSize();
    
    /**
     * Gets (as xml) the "reportSize" element
     */
    org.apache.xmlbeans.XmlLong xgetReportSize();
    
    /**
     * True if has "reportSize" element
     */
    boolean isSetReportSize();
    
    /**
     * Sets the "reportSize" element
     */
    void setReportSize(long reportSize);
    
    /**
     * Sets (as xml) the "reportSize" element
     */
    void xsetReportSize(org.apache.xmlbeans.XmlLong reportSize);
    
    /**
     * Unsets the "reportSize" element
     */
    void unsetReportSize();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.ReportDataType newInstance() {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.ReportDataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.ReportDataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.ReportDataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.ReportDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.ReportDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.ReportDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
