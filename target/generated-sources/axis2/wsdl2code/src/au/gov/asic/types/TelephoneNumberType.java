/*
 * XML Type:  telephoneNumberType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.TelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML telephoneNumberType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface TelephoneNumberType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TelephoneNumberType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("telephonenumbertypebdf1type");
    
    /**
     * Gets the "telephoneNumber" element
     */
    au.gov.asic.types.TelephoneNumberType.TelephoneNumber getTelephoneNumber();
    
    /**
     * Sets the "telephoneNumber" element
     */
    void setTelephoneNumber(au.gov.asic.types.TelephoneNumberType.TelephoneNumber telephoneNumber);
    
    /**
     * Appends and returns a new empty "telephoneNumber" element
     */
    au.gov.asic.types.TelephoneNumberType.TelephoneNumber addNewTelephoneNumber();
    
    /**
     * Gets the "phoneType" element
     */
    au.gov.asic.types.TelephoneNumberType.PhoneType.Enum getPhoneType();
    
    /**
     * Gets (as xml) the "phoneType" element
     */
    au.gov.asic.types.TelephoneNumberType.PhoneType xgetPhoneType();
    
    /**
     * Sets the "phoneType" element
     */
    void setPhoneType(au.gov.asic.types.TelephoneNumberType.PhoneType.Enum phoneType);
    
    /**
     * Sets (as xml) the "phoneType" element
     */
    void xsetPhoneType(au.gov.asic.types.TelephoneNumberType.PhoneType phoneType);
    
    /**
     * An XML telephoneNumber(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface TelephoneNumber extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TelephoneNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("telephonenumberb94aelemtype");
        
        /**
         * Gets the "prefix" element
         */
        java.lang.String getPrefix();
        
        /**
         * Gets (as xml) the "prefix" element
         */
        org.apache.xmlbeans.XmlString xgetPrefix();
        
        /**
         * True if has "prefix" element
         */
        boolean isSetPrefix();
        
        /**
         * Sets the "prefix" element
         */
        void setPrefix(java.lang.String prefix);
        
        /**
         * Sets (as xml) the "prefix" element
         */
        void xsetPrefix(org.apache.xmlbeans.XmlString prefix);
        
        /**
         * Unsets the "prefix" element
         */
        void unsetPrefix();
        
        /**
         * Gets the "number" element
         */
        java.lang.String getNumber();
        
        /**
         * Gets (as xml) the "number" element
         */
        org.apache.xmlbeans.XmlString xgetNumber();
        
        /**
         * Sets the "number" element
         */
        void setNumber(java.lang.String number);
        
        /**
         * Sets (as xml) the "number" element
         */
        void xsetNumber(org.apache.xmlbeans.XmlString number);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.TelephoneNumberType.TelephoneNumber newInstance() {
              return (au.gov.asic.types.TelephoneNumberType.TelephoneNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.TelephoneNumberType.TelephoneNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.TelephoneNumberType.TelephoneNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML phoneType(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.TelephoneNumberType$PhoneType.
     */
    public interface PhoneType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhoneType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("phonetype3c25elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum HOME = Enum.forString("Home");
        static final Enum MOBILE = Enum.forString("Mobile");
        static final Enum WORK = Enum.forString("Work");
        
        static final int INT_HOME = Enum.INT_HOME;
        static final int INT_MOBILE = Enum.INT_MOBILE;
        static final int INT_WORK = Enum.INT_WORK;
        
        /**
         * Enumeration value class for au.gov.asic.types.TelephoneNumberType$PhoneType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_HOME
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_HOME = 1;
            static final int INT_MOBILE = 2;
            static final int INT_WORK = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Home", INT_HOME),
                    new Enum("Mobile", INT_MOBILE),
                    new Enum("Work", INT_WORK),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.TelephoneNumberType.PhoneType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.TelephoneNumberType.PhoneType) type.newValue( obj ); }
            
            public static au.gov.asic.types.TelephoneNumberType.PhoneType newInstance() {
              return (au.gov.asic.types.TelephoneNumberType.PhoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.TelephoneNumberType.PhoneType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.TelephoneNumberType.PhoneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.TelephoneNumberType newInstance() {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.TelephoneNumberType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.TelephoneNumberType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.TelephoneNumberType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.TelephoneNumberType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.TelephoneNumberType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.TelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
