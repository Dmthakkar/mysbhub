/*
 * XML Type:  nameType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML nameType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface NameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nametypef381type");
    
    /**
     * Gets the "familyName" element
     */
    java.lang.String getFamilyName();
    
    /**
     * Gets (as xml) the "familyName" element
     */
    au.gov.asic.types.NameType.FamilyName xgetFamilyName();
    
    /**
     * Sets the "familyName" element
     */
    void setFamilyName(java.lang.String familyName);
    
    /**
     * Sets (as xml) the "familyName" element
     */
    void xsetFamilyName(au.gov.asic.types.NameType.FamilyName familyName);
    
    /**
     * Gets the "givenName1" element
     */
    java.lang.String getGivenName1();
    
    /**
     * Gets (as xml) the "givenName1" element
     */
    au.gov.asic.types.NameType.GivenName1 xgetGivenName1();
    
    /**
     * Sets the "givenName1" element
     */
    void setGivenName1(java.lang.String givenName1);
    
    /**
     * Sets (as xml) the "givenName1" element
     */
    void xsetGivenName1(au.gov.asic.types.NameType.GivenName1 givenName1);
    
    /**
     * Gets the "givenName2" element
     */
    java.lang.String getGivenName2();
    
    /**
     * Gets (as xml) the "givenName2" element
     */
    au.gov.asic.types.NameType.GivenName2 xgetGivenName2();
    
    /**
     * True if has "givenName2" element
     */
    boolean isSetGivenName2();
    
    /**
     * Sets the "givenName2" element
     */
    void setGivenName2(java.lang.String givenName2);
    
    /**
     * Sets (as xml) the "givenName2" element
     */
    void xsetGivenName2(au.gov.asic.types.NameType.GivenName2 givenName2);
    
    /**
     * Unsets the "givenName2" element
     */
    void unsetGivenName2();
    
    /**
     * Gets the "givenName3" element
     */
    java.lang.String getGivenName3();
    
    /**
     * Gets (as xml) the "givenName3" element
     */
    au.gov.asic.types.NameType.GivenName3 xgetGivenName3();
    
    /**
     * True if has "givenName3" element
     */
    boolean isSetGivenName3();
    
    /**
     * Sets the "givenName3" element
     */
    void setGivenName3(java.lang.String givenName3);
    
    /**
     * Sets (as xml) the "givenName3" element
     */
    void xsetGivenName3(au.gov.asic.types.NameType.GivenName3 givenName3);
    
    /**
     * Unsets the "givenName3" element
     */
    void unsetGivenName3();
    
    /**
     * An XML familyName(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$FamilyName.
     */
    public interface FamilyName extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FamilyName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("familyname1236elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.NameType.FamilyName newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameType.FamilyName) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameType.FamilyName newInstance() {
              return (au.gov.asic.types.NameType.FamilyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameType.FamilyName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameType.FamilyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML givenName1(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$GivenName1.
     */
    public interface GivenName1 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GivenName1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("givenname10bfcelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.NameType.GivenName1 newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameType.GivenName1) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameType.GivenName1 newInstance() {
              return (au.gov.asic.types.NameType.GivenName1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameType.GivenName1 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameType.GivenName1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML givenName2(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$GivenName2.
     */
    public interface GivenName2 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GivenName2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("givenname2d01belemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.NameType.GivenName2 newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameType.GivenName2) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameType.GivenName2 newInstance() {
              return (au.gov.asic.types.NameType.GivenName2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameType.GivenName2 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameType.GivenName2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML givenName3(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameType$GivenName3.
     */
    public interface GivenName3 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GivenName3.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("givenname3943aelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.NameType.GivenName3 newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameType.GivenName3) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameType.GivenName3 newInstance() {
              return (au.gov.asic.types.NameType.GivenName3) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameType.GivenName3 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameType.GivenName3) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.NameType newInstance() {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.NameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.NameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.NameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.NameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.NameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.NameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.NameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.NameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.NameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.NameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.NameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.NameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.NameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.NameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.NameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.NameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.NameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.NameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
