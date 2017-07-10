/*
 * XML Type:  signatoryType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.SignatoryType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML signatoryType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface SignatoryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignatoryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("signatorytype9fcatype");
    
    /**
     * Gets the "name" element
     */
    au.gov.asic.types.PersonNameLodgeType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(au.gov.asic.types.PersonNameLodgeType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    au.gov.asic.types.PersonNameLodgeType addNewName();
    
    /**
     * Gets the "capacity" element
     */
    au.gov.asic.types.SignatoryType.Capacity.Enum getCapacity();
    
    /**
     * Gets (as xml) the "capacity" element
     */
    au.gov.asic.types.SignatoryType.Capacity xgetCapacity();
    
    /**
     * True if has "capacity" element
     */
    boolean isSetCapacity();
    
    /**
     * Sets the "capacity" element
     */
    void setCapacity(au.gov.asic.types.SignatoryType.Capacity.Enum capacity);
    
    /**
     * Sets (as xml) the "capacity" element
     */
    void xsetCapacity(au.gov.asic.types.SignatoryType.Capacity capacity);
    
    /**
     * Unsets the "capacity" element
     */
    void unsetCapacity();
    
    /**
     * Gets the "dateSigned" element
     */
    java.util.Calendar getDateSigned();
    
    /**
     * Gets (as xml) the "dateSigned" element
     */
    org.apache.xmlbeans.XmlDate xgetDateSigned();
    
    /**
     * Sets the "dateSigned" element
     */
    void setDateSigned(java.util.Calendar dateSigned);
    
    /**
     * Sets (as xml) the "dateSigned" element
     */
    void xsetDateSigned(org.apache.xmlbeans.XmlDate dateSigned);
    
    /**
     * Gets the "declaresTrueAndCorrect" element
     */
    boolean getDeclaresTrueAndCorrect();
    
    /**
     * Gets (as xml) the "declaresTrueAndCorrect" element
     */
    au.gov.asic.types.TrueType xgetDeclaresTrueAndCorrect();
    
    /**
     * Sets the "declaresTrueAndCorrect" element
     */
    void setDeclaresTrueAndCorrect(boolean declaresTrueAndCorrect);
    
    /**
     * Sets (as xml) the "declaresTrueAndCorrect" element
     */
    void xsetDeclaresTrueAndCorrect(au.gov.asic.types.TrueType declaresTrueAndCorrect);
    
    /**
     * An XML capacity(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.SignatoryType$Capacity.
     */
    public interface Capacity extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Capacity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("capacityf4a0elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum COMPANY_DIRECTOR = Enum.forString("COMPANY DIRECTOR");
        static final Enum COMPANY_SECRETARY = Enum.forString("COMPANY SECRETARY");
        static final Enum COMPANY_OTHER = Enum.forString("COMPANY OTHER");
        static final Enum OWNER = Enum.forString("OWNER");
        static final Enum TRUSTEE = Enum.forString("TRUSTEE");
        static final Enum WRITTEN = Enum.forString("WRITTEN");
        
        static final int INT_COMPANY_DIRECTOR = Enum.INT_COMPANY_DIRECTOR;
        static final int INT_COMPANY_SECRETARY = Enum.INT_COMPANY_SECRETARY;
        static final int INT_COMPANY_OTHER = Enum.INT_COMPANY_OTHER;
        static final int INT_OWNER = Enum.INT_OWNER;
        static final int INT_TRUSTEE = Enum.INT_TRUSTEE;
        static final int INT_WRITTEN = Enum.INT_WRITTEN;
        
        /**
         * Enumeration value class for au.gov.asic.types.SignatoryType$Capacity.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_COMPANY_DIRECTOR
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
            
            static final int INT_COMPANY_DIRECTOR = 1;
            static final int INT_COMPANY_SECRETARY = 2;
            static final int INT_COMPANY_OTHER = 3;
            static final int INT_OWNER = 4;
            static final int INT_TRUSTEE = 5;
            static final int INT_WRITTEN = 6;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("COMPANY DIRECTOR", INT_COMPANY_DIRECTOR),
                    new Enum("COMPANY SECRETARY", INT_COMPANY_SECRETARY),
                    new Enum("COMPANY OTHER", INT_COMPANY_OTHER),
                    new Enum("OWNER", INT_OWNER),
                    new Enum("TRUSTEE", INT_TRUSTEE),
                    new Enum("WRITTEN", INT_WRITTEN),
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
            public static au.gov.asic.types.SignatoryType.Capacity newValue(java.lang.Object obj) {
              return (au.gov.asic.types.SignatoryType.Capacity) type.newValue( obj ); }
            
            public static au.gov.asic.types.SignatoryType.Capacity newInstance() {
              return (au.gov.asic.types.SignatoryType.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.SignatoryType.Capacity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.SignatoryType.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.SignatoryType newInstance() {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.SignatoryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.SignatoryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.SignatoryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.SignatoryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.SignatoryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.SignatoryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.SignatoryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.SignatoryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.SignatoryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
