/*
 * XML Type:  geographicType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.GeographicType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML geographicType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface GeographicType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeographicType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("geographictype406ctype");
    
    /**
     * Gets the "addressLine1" element
     */
    java.lang.String getAddressLine1();
    
    /**
     * Gets (as xml) the "addressLine1" element
     */
    au.gov.asic.types.abn.AddressLine1Type xgetAddressLine1();
    
    /**
     * True if has "addressLine1" element
     */
    boolean isSetAddressLine1();
    
    /**
     * Sets the "addressLine1" element
     */
    void setAddressLine1(java.lang.String addressLine1);
    
    /**
     * Sets (as xml) the "addressLine1" element
     */
    void xsetAddressLine1(au.gov.asic.types.abn.AddressLine1Type addressLine1);
    
    /**
     * Unsets the "addressLine1" element
     */
    void unsetAddressLine1();
    
    /**
     * Gets the "addressLine2" element
     */
    java.lang.String getAddressLine2();
    
    /**
     * Gets (as xml) the "addressLine2" element
     */
    au.gov.asic.types.abn.AddressLine2Type xgetAddressLine2();
    
    /**
     * True if has "addressLine2" element
     */
    boolean isSetAddressLine2();
    
    /**
     * Sets the "addressLine2" element
     */
    void setAddressLine2(java.lang.String addressLine2);
    
    /**
     * Sets (as xml) the "addressLine2" element
     */
    void xsetAddressLine2(au.gov.asic.types.abn.AddressLine2Type addressLine2);
    
    /**
     * Unsets the "addressLine2" element
     */
    void unsetAddressLine2();
    
    /**
     * Gets the "suburb" element
     */
    java.lang.String getSuburb();
    
    /**
     * Gets (as xml) the "suburb" element
     */
    au.gov.asic.types.abn.SuburbType xgetSuburb();
    
    /**
     * True if has "suburb" element
     */
    boolean isSetSuburb();
    
    /**
     * Sets the "suburb" element
     */
    void setSuburb(java.lang.String suburb);
    
    /**
     * Sets (as xml) the "suburb" element
     */
    void xsetSuburb(au.gov.asic.types.abn.SuburbType suburb);
    
    /**
     * Unsets the "suburb" element
     */
    void unsetSuburb();
    
    /**
     * Gets the "postcode" element
     */
    java.lang.String getPostcode();
    
    /**
     * Gets (as xml) the "postcode" element
     */
    au.gov.asic.types.abn.PostcodeType xgetPostcode();
    
    /**
     * Sets the "postcode" element
     */
    void setPostcode(java.lang.String postcode);
    
    /**
     * Sets (as xml) the "postcode" element
     */
    void xsetPostcode(au.gov.asic.types.abn.PostcodeType postcode);
    
    /**
     * Gets the "stateCode" element
     */
    java.lang.String getStateCode();
    
    /**
     * Gets (as xml) the "stateCode" element
     */
    au.gov.asic.types.abn.StateCodeType xgetStateCode();
    
    /**
     * True if has "stateCode" element
     */
    boolean isSetStateCode();
    
    /**
     * Sets the "stateCode" element
     */
    void setStateCode(java.lang.String stateCode);
    
    /**
     * Sets (as xml) the "stateCode" element
     */
    void xsetStateCode(au.gov.asic.types.abn.StateCodeType stateCode);
    
    /**
     * Unsets the "stateCode" element
     */
    void unsetStateCode();
    
    /**
     * Gets the "countryCode" element
     */
    java.lang.String getCountryCode();
    
    /**
     * Gets (as xml) the "countryCode" element
     */
    au.gov.asic.types.abn.CountryCodeType xgetCountryCode();
    
    /**
     * True if has "countryCode" element
     */
    boolean isSetCountryCode();
    
    /**
     * Sets the "countryCode" element
     */
    void setCountryCode(java.lang.String countryCode);
    
    /**
     * Sets (as xml) the "countryCode" element
     */
    void xsetCountryCode(au.gov.asic.types.abn.CountryCodeType countryCode);
    
    /**
     * Unsets the "countryCode" element
     */
    void unsetCountryCode();
    
    /**
     * Gets the "DPID" element
     */
    java.math.BigInteger getDPID();
    
    /**
     * Gets (as xml) the "DPID" element
     */
    au.gov.asic.types.abn.DPIDType xgetDPID();
    
    /**
     * True if has "DPID" element
     */
    boolean isSetDPID();
    
    /**
     * Sets the "DPID" element
     */
    void setDPID(java.math.BigInteger dpid);
    
    /**
     * Sets (as xml) the "DPID" element
     */
    void xsetDPID(au.gov.asic.types.abn.DPIDType dpid);
    
    /**
     * Unsets the "DPID" element
     */
    void unsetDPID();
    
    /**
     * Gets the "DPIDStatusCode" element
     */
    java.lang.String getDPIDStatusCode();
    
    /**
     * Gets (as xml) the "DPIDStatusCode" element
     */
    au.gov.asic.types.abn.DPIDStatusCodeType xgetDPIDStatusCode();
    
    /**
     * True if has "DPIDStatusCode" element
     */
    boolean isSetDPIDStatusCode();
    
    /**
     * Sets the "DPIDStatusCode" element
     */
    void setDPIDStatusCode(java.lang.String dpidStatusCode);
    
    /**
     * Sets (as xml) the "DPIDStatusCode" element
     */
    void xsetDPIDStatusCode(au.gov.asic.types.abn.DPIDStatusCodeType dpidStatusCode);
    
    /**
     * Unsets the "DPIDStatusCode" element
     */
    void unsetDPIDStatusCode();
    
    /**
     * Gets the "lastConfirmedDate" element
     */
    java.util.Calendar getLastConfirmedDate();
    
    /**
     * Gets (as xml) the "lastConfirmedDate" element
     */
    au.gov.asic.types.abn.DateType xgetLastConfirmedDate();
    
    /**
     * True if has "lastConfirmedDate" element
     */
    boolean isSetLastConfirmedDate();
    
    /**
     * Sets the "lastConfirmedDate" element
     */
    void setLastConfirmedDate(java.util.Calendar lastConfirmedDate);
    
    /**
     * Sets (as xml) the "lastConfirmedDate" element
     */
    void xsetLastConfirmedDate(au.gov.asic.types.abn.DateType lastConfirmedDate);
    
    /**
     * Unsets the "lastConfirmedDate" element
     */
    void unsetLastConfirmedDate();
    
    /**
     * Gets the "reliabilityIndicatorCode" element
     */
    au.gov.asic.types.abn.IndicatorType.Enum getReliabilityIndicatorCode();
    
    /**
     * Gets (as xml) the "reliabilityIndicatorCode" element
     */
    au.gov.asic.types.abn.IndicatorType xgetReliabilityIndicatorCode();
    
    /**
     * True if has "reliabilityIndicatorCode" element
     */
    boolean isSetReliabilityIndicatorCode();
    
    /**
     * Sets the "reliabilityIndicatorCode" element
     */
    void setReliabilityIndicatorCode(au.gov.asic.types.abn.IndicatorType.Enum reliabilityIndicatorCode);
    
    /**
     * Sets (as xml) the "reliabilityIndicatorCode" element
     */
    void xsetReliabilityIndicatorCode(au.gov.asic.types.abn.IndicatorType reliabilityIndicatorCode);
    
    /**
     * Unsets the "reliabilityIndicatorCode" element
     */
    void unsetReliabilityIndicatorCode();
    
    /**
     * Gets the "reliabilityIndicatorDate" element
     */
    java.util.Calendar getReliabilityIndicatorDate();
    
    /**
     * Gets (as xml) the "reliabilityIndicatorDate" element
     */
    au.gov.asic.types.abn.DateType xgetReliabilityIndicatorDate();
    
    /**
     * True if has "reliabilityIndicatorDate" element
     */
    boolean isSetReliabilityIndicatorDate();
    
    /**
     * Sets the "reliabilityIndicatorDate" element
     */
    void setReliabilityIndicatorDate(java.util.Calendar reliabilityIndicatorDate);
    
    /**
     * Sets (as xml) the "reliabilityIndicatorDate" element
     */
    void xsetReliabilityIndicatorDate(au.gov.asic.types.abn.DateType reliabilityIndicatorDate);
    
    /**
     * Unsets the "reliabilityIndicatorDate" element
     */
    void unsetReliabilityIndicatorDate();
    
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
        public static au.gov.asic.types.abn.GeographicType newInstance() {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.GeographicType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.GeographicType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.GeographicType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.GeographicType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.GeographicType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.GeographicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
