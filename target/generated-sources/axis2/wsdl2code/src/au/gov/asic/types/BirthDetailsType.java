/*
 * XML Type:  birthDetailsType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.BirthDetailsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML birthDetailsType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BirthDetailsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BirthDetailsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("birthdetailstypeca79type");
    
    /**
     * Gets the "date" element
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    org.apache.xmlbeans.XmlDate xgetDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlDate date);
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "cityTown" element
     */
    java.lang.String getCityTown();
    
    /**
     * Gets (as xml) the "cityTown" element
     */
    au.gov.asic.types.BirthDetailsType.CityTown xgetCityTown();
    
    /**
     * True if has "cityTown" element
     */
    boolean isSetCityTown();
    
    /**
     * Sets the "cityTown" element
     */
    void setCityTown(java.lang.String cityTown);
    
    /**
     * Sets (as xml) the "cityTown" element
     */
    void xsetCityTown(au.gov.asic.types.BirthDetailsType.CityTown cityTown);
    
    /**
     * Unsets the "cityTown" element
     */
    void unsetCityTown();
    
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
     * Gets the "iso3166CountryCode" element
     */
    java.lang.String getIso3166CountryCode();
    
    /**
     * Gets (as xml) the "iso3166CountryCode" element
     */
    au.gov.asic.types.BirthDetailsType.Iso3166CountryCode xgetIso3166CountryCode();
    
    /**
     * True if has "iso3166CountryCode" element
     */
    boolean isSetIso3166CountryCode();
    
    /**
     * Sets the "iso3166CountryCode" element
     */
    void setIso3166CountryCode(java.lang.String iso3166CountryCode);
    
    /**
     * Sets (as xml) the "iso3166CountryCode" element
     */
    void xsetIso3166CountryCode(au.gov.asic.types.BirthDetailsType.Iso3166CountryCode iso3166CountryCode);
    
    /**
     * Unsets the "iso3166CountryCode" element
     */
    void unsetIso3166CountryCode();
    
    /**
     * Gets the "countryOfBirth" element
     */
    java.lang.String getCountryOfBirth();
    
    /**
     * Gets (as xml) the "countryOfBirth" element
     */
    au.gov.asic.types.BirthDetailsType.CountryOfBirth xgetCountryOfBirth();
    
    /**
     * True if has "countryOfBirth" element
     */
    boolean isSetCountryOfBirth();
    
    /**
     * Sets the "countryOfBirth" element
     */
    void setCountryOfBirth(java.lang.String countryOfBirth);
    
    /**
     * Sets (as xml) the "countryOfBirth" element
     */
    void xsetCountryOfBirth(au.gov.asic.types.BirthDetailsType.CountryOfBirth countryOfBirth);
    
    /**
     * Unsets the "countryOfBirth" element
     */
    void unsetCountryOfBirth();
    
    /**
     * An XML cityTown(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsType$CityTown.
     */
    public interface CityTown extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CityTown.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("citytown4360elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsType.CityTown newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsType.CityTown) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsType.CityTown newInstance() {
              return (au.gov.asic.types.BirthDetailsType.CityTown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsType.CityTown newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsType.CityTown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML iso3166CountryCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsType$Iso3166CountryCode.
     */
    public interface Iso3166CountryCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Iso3166CountryCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("iso3166countrycode205delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsType.Iso3166CountryCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsType.Iso3166CountryCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsType.Iso3166CountryCode newInstance() {
              return (au.gov.asic.types.BirthDetailsType.Iso3166CountryCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsType.Iso3166CountryCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsType.Iso3166CountryCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML countryOfBirth(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsType$CountryOfBirth.
     */
    public interface CountryOfBirth extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CountryOfBirth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("countryofbirth8aebelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsType.CountryOfBirth newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsType.CountryOfBirth) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsType.CountryOfBirth newInstance() {
              return (au.gov.asic.types.BirthDetailsType.CountryOfBirth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsType.CountryOfBirth newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsType.CountryOfBirth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.BirthDetailsType newInstance() {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.BirthDetailsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.BirthDetailsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.BirthDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.BirthDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.BirthDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
