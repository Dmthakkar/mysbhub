/*
 * XML Type:  birthDetailsExtType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.BirthDetailsExtType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML birthDetailsExtType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BirthDetailsExtType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BirthDetailsExtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("birthdetailsexttype98e2type");
    
    /**
     * Gets the "date" element
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    au.gov.asic.types.BirthDetailsExtType.Date xgetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(au.gov.asic.types.BirthDetailsExtType.Date date);
    
    /**
     * Gets the "cityTown" element
     */
    java.lang.String getCityTown();
    
    /**
     * Gets (as xml) the "cityTown" element
     */
    au.gov.asic.types.BirthDetailsExtType.CityTown xgetCityTown();
    
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
    void xsetCityTown(au.gov.asic.types.BirthDetailsExtType.CityTown cityTown);
    
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
    au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode xgetIso3166CountryCode();
    
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
    void xsetIso3166CountryCode(au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode iso3166CountryCode);
    
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
    au.gov.asic.types.BirthDetailsExtType.CountryOfBirth xgetCountryOfBirth();
    
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
    void xsetCountryOfBirth(au.gov.asic.types.BirthDetailsExtType.CountryOfBirth countryOfBirth);
    
    /**
     * Unsets the "countryOfBirth" element
     */
    void unsetCountryOfBirth();
    
    /**
     * An XML date(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsExtType$Date.
     */
    public interface Date extends org.apache.xmlbeans.XmlDate
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("datebe2celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsExtType.Date newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsExtType.Date) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.Date newInstance() {
              return (au.gov.asic.types.BirthDetailsExtType.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsExtType.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML cityTown(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsExtType$CityTown.
     */
    public interface CityTown extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CityTown.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("citytown229belemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsExtType.CityTown newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsExtType.CityTown) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.CityTown newInstance() {
              return (au.gov.asic.types.BirthDetailsExtType.CityTown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.CityTown newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsExtType.CityTown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML iso3166CountryCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsExtType$Iso3166CountryCode.
     */
    public interface Iso3166CountryCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Iso3166CountryCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("iso3166countrycodec87eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode newInstance() {
              return (au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsExtType.Iso3166CountryCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML countryOfBirth(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.BirthDetailsExtType$CountryOfBirth.
     */
    public interface CountryOfBirth extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CountryOfBirth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("countryofbirthab30elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.BirthDetailsExtType.CountryOfBirth newValue(java.lang.Object obj) {
              return (au.gov.asic.types.BirthDetailsExtType.CountryOfBirth) type.newValue( obj ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.CountryOfBirth newInstance() {
              return (au.gov.asic.types.BirthDetailsExtType.CountryOfBirth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.BirthDetailsExtType.CountryOfBirth newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.BirthDetailsExtType.CountryOfBirth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.BirthDetailsExtType newInstance() {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.BirthDetailsExtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.BirthDetailsExtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.BirthDetailsExtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.BirthDetailsExtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.BirthDetailsExtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.BirthDetailsExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
