/*
 * XML Type:  personNameLodgeType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.PersonNameLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML personNameLodgeType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface PersonNameLodgeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameLodgeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("personnamelodgetype1f43type");
    
    /**
     * Gets the "givenNames" element
     */
    java.lang.String getGivenNames();
    
    /**
     * Gets (as xml) the "givenNames" element
     */
    au.gov.asic.types.PersonNameLodgeType.GivenNames xgetGivenNames();
    
    /**
     * Sets the "givenNames" element
     */
    void setGivenNames(java.lang.String givenNames);
    
    /**
     * Sets (as xml) the "givenNames" element
     */
    void xsetGivenNames(au.gov.asic.types.PersonNameLodgeType.GivenNames givenNames);
    
    /**
     * Gets the "otherGivenNames" element
     */
    java.lang.String getOtherGivenNames();
    
    /**
     * Gets (as xml) the "otherGivenNames" element
     */
    au.gov.asic.types.PersonNameLodgeType.OtherGivenNames xgetOtherGivenNames();
    
    /**
     * True if has "otherGivenNames" element
     */
    boolean isSetOtherGivenNames();
    
    /**
     * Sets the "otherGivenNames" element
     */
    void setOtherGivenNames(java.lang.String otherGivenNames);
    
    /**
     * Sets (as xml) the "otherGivenNames" element
     */
    void xsetOtherGivenNames(au.gov.asic.types.PersonNameLodgeType.OtherGivenNames otherGivenNames);
    
    /**
     * Unsets the "otherGivenNames" element
     */
    void unsetOtherGivenNames();
    
    /**
     * Gets the "familyName" element
     */
    java.lang.String getFamilyName();
    
    /**
     * Gets (as xml) the "familyName" element
     */
    au.gov.asic.types.PersonNameLodgeType.FamilyName xgetFamilyName();
    
    /**
     * Sets the "familyName" element
     */
    void setFamilyName(java.lang.String familyName);
    
    /**
     * Sets (as xml) the "familyName" element
     */
    void xsetFamilyName(au.gov.asic.types.PersonNameLodgeType.FamilyName familyName);
    
    /**
     * An XML givenNames(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameLodgeType$GivenNames.
     */
    public interface GivenNames extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GivenNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("givennamesa12aelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.PersonNameLodgeType.GivenNames newValue(java.lang.Object obj) {
              return (au.gov.asic.types.PersonNameLodgeType.GivenNames) type.newValue( obj ); }
            
            public static au.gov.asic.types.PersonNameLodgeType.GivenNames newInstance() {
              return (au.gov.asic.types.PersonNameLodgeType.GivenNames) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.PersonNameLodgeType.GivenNames newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.PersonNameLodgeType.GivenNames) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML otherGivenNames(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameLodgeType$OtherGivenNames.
     */
    public interface OtherGivenNames extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtherGivenNames.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("othergivennames722aelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.PersonNameLodgeType.OtherGivenNames newValue(java.lang.Object obj) {
              return (au.gov.asic.types.PersonNameLodgeType.OtherGivenNames) type.newValue( obj ); }
            
            public static au.gov.asic.types.PersonNameLodgeType.OtherGivenNames newInstance() {
              return (au.gov.asic.types.PersonNameLodgeType.OtherGivenNames) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.PersonNameLodgeType.OtherGivenNames newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.PersonNameLodgeType.OtherGivenNames) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML familyName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.PersonNameLodgeType$FamilyName.
     */
    public interface FamilyName extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FamilyName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("familyname2d6eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.PersonNameLodgeType.FamilyName newValue(java.lang.Object obj) {
              return (au.gov.asic.types.PersonNameLodgeType.FamilyName) type.newValue( obj ); }
            
            public static au.gov.asic.types.PersonNameLodgeType.FamilyName newInstance() {
              return (au.gov.asic.types.PersonNameLodgeType.FamilyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.PersonNameLodgeType.FamilyName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.PersonNameLodgeType.FamilyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.PersonNameLodgeType newInstance() {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.PersonNameLodgeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.PersonNameLodgeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.PersonNameLodgeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.PersonNameLodgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.PersonNameLodgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.PersonNameLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
