/*
 * XML Type:  nameAvailabilityType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameAvailabilityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML nameAvailabilityType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface NameAvailabilityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameAvailabilityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nameavailabilitytype9b3ctype");
    
    /**
     * Gets the "code" element
     */
    au.gov.asic.types.NameAvailabilityType.Code.Enum getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    au.gov.asic.types.NameAvailabilityType.Code xgetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(au.gov.asic.types.NameAvailabilityType.Code.Enum code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(au.gov.asic.types.NameAvailabilityType.Code code);
    
    /**
     * Gets array of all "shortDescription" elements
     */
    java.lang.String[] getShortDescriptionArray();
    
    /**
     * Gets ith "shortDescription" element
     */
    java.lang.String getShortDescriptionArray(int i);
    
    /**
     * Gets (as xml) array of all "shortDescription" elements
     */
    au.gov.asic.types.NameAvailabilityType.ShortDescription[] xgetShortDescriptionArray();
    
    /**
     * Gets (as xml) ith "shortDescription" element
     */
    au.gov.asic.types.NameAvailabilityType.ShortDescription xgetShortDescriptionArray(int i);
    
    /**
     * Returns number of "shortDescription" element
     */
    int sizeOfShortDescriptionArray();
    
    /**
     * Sets array of all "shortDescription" element
     */
    void setShortDescriptionArray(java.lang.String[] shortDescriptionArray);
    
    /**
     * Sets ith "shortDescription" element
     */
    void setShortDescriptionArray(int i, java.lang.String shortDescription);
    
    /**
     * Sets (as xml) array of all "shortDescription" element
     */
    void xsetShortDescriptionArray(au.gov.asic.types.NameAvailabilityType.ShortDescription[] shortDescriptionArray);
    
    /**
     * Sets (as xml) ith "shortDescription" element
     */
    void xsetShortDescriptionArray(int i, au.gov.asic.types.NameAvailabilityType.ShortDescription shortDescription);
    
    /**
     * Inserts the value as the ith "shortDescription" element
     */
    void insertShortDescription(int i, java.lang.String shortDescription);
    
    /**
     * Appends the value as the last "shortDescription" element
     */
    void addShortDescription(java.lang.String shortDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shortDescription" element
     */
    au.gov.asic.types.NameAvailabilityType.ShortDescription insertNewShortDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shortDescription" element
     */
    au.gov.asic.types.NameAvailabilityType.ShortDescription addNewShortDescription();
    
    /**
     * Removes the ith "shortDescription" element
     */
    void removeShortDescription(int i);
    
    /**
     * Gets array of all "longDescription" elements
     */
    java.lang.String[] getLongDescriptionArray();
    
    /**
     * Gets ith "longDescription" element
     */
    java.lang.String getLongDescriptionArray(int i);
    
    /**
     * Gets (as xml) array of all "longDescription" elements
     */
    au.gov.asic.types.NameAvailabilityType.LongDescription[] xgetLongDescriptionArray();
    
    /**
     * Gets (as xml) ith "longDescription" element
     */
    au.gov.asic.types.NameAvailabilityType.LongDescription xgetLongDescriptionArray(int i);
    
    /**
     * Returns number of "longDescription" element
     */
    int sizeOfLongDescriptionArray();
    
    /**
     * Sets array of all "longDescription" element
     */
    void setLongDescriptionArray(java.lang.String[] longDescriptionArray);
    
    /**
     * Sets ith "longDescription" element
     */
    void setLongDescriptionArray(int i, java.lang.String longDescription);
    
    /**
     * Sets (as xml) array of all "longDescription" element
     */
    void xsetLongDescriptionArray(au.gov.asic.types.NameAvailabilityType.LongDescription[] longDescriptionArray);
    
    /**
     * Sets (as xml) ith "longDescription" element
     */
    void xsetLongDescriptionArray(int i, au.gov.asic.types.NameAvailabilityType.LongDescription longDescription);
    
    /**
     * Inserts the value as the ith "longDescription" element
     */
    void insertLongDescription(int i, java.lang.String longDescription);
    
    /**
     * Appends the value as the last "longDescription" element
     */
    void addLongDescription(java.lang.String longDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "longDescription" element
     */
    au.gov.asic.types.NameAvailabilityType.LongDescription insertNewLongDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "longDescription" element
     */
    au.gov.asic.types.NameAvailabilityType.LongDescription addNewLongDescription();
    
    /**
     * Removes the ith "longDescription" element
     */
    void removeLongDescription(int i);
    
    /**
     * Gets array of all "objection" elements
     */
    au.gov.asic.types.ObjectionType[] getObjectionArray();
    
    /**
     * Gets ith "objection" element
     */
    au.gov.asic.types.ObjectionType getObjectionArray(int i);
    
    /**
     * Returns number of "objection" element
     */
    int sizeOfObjectionArray();
    
    /**
     * Sets array of all "objection" element
     */
    void setObjectionArray(au.gov.asic.types.ObjectionType[] objectionArray);
    
    /**
     * Sets ith "objection" element
     */
    void setObjectionArray(int i, au.gov.asic.types.ObjectionType objection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objection" element
     */
    au.gov.asic.types.ObjectionType insertNewObjection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objection" element
     */
    au.gov.asic.types.ObjectionType addNewObjection();
    
    /**
     * Removes the ith "objection" element
     */
    void removeObjection(int i);
    
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityType$Code.
     */
    public interface Code extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("codefb53elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum AVAILABLE = Enum.forString("Available");
        static final Enum UNAVAILABLE = Enum.forString("Unavailable");
        static final Enum SUBJECT_TO_NAMES_DETERMINATION = Enum.forString("SubjectToNamesDetermination");
        static final Enum UNDER_TRANSFER = Enum.forString("UnderTransfer");
        static final Enum IDENTICAL = Enum.forString("Identical");
        
        static final int INT_AVAILABLE = Enum.INT_AVAILABLE;
        static final int INT_UNAVAILABLE = Enum.INT_UNAVAILABLE;
        static final int INT_SUBJECT_TO_NAMES_DETERMINATION = Enum.INT_SUBJECT_TO_NAMES_DETERMINATION;
        static final int INT_UNDER_TRANSFER = Enum.INT_UNDER_TRANSFER;
        static final int INT_IDENTICAL = Enum.INT_IDENTICAL;
        
        /**
         * Enumeration value class for au.gov.asic.types.NameAvailabilityType$Code.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_AVAILABLE
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
            
            static final int INT_AVAILABLE = 1;
            static final int INT_UNAVAILABLE = 2;
            static final int INT_SUBJECT_TO_NAMES_DETERMINATION = 3;
            static final int INT_UNDER_TRANSFER = 4;
            static final int INT_IDENTICAL = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Available", INT_AVAILABLE),
                    new Enum("Unavailable", INT_UNAVAILABLE),
                    new Enum("SubjectToNamesDetermination", INT_SUBJECT_TO_NAMES_DETERMINATION),
                    new Enum("UnderTransfer", INT_UNDER_TRANSFER),
                    new Enum("Identical", INT_IDENTICAL),
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
            public static au.gov.asic.types.NameAvailabilityType.Code newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameAvailabilityType.Code) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameAvailabilityType.Code newInstance() {
              return (au.gov.asic.types.NameAvailabilityType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameAvailabilityType.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameAvailabilityType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML shortDescription(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityType$ShortDescription.
     */
    public interface ShortDescription extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShortDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("shortdescription5a40elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.NameAvailabilityType.ShortDescription newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameAvailabilityType.ShortDescription) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameAvailabilityType.ShortDescription newInstance() {
              return (au.gov.asic.types.NameAvailabilityType.ShortDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameAvailabilityType.ShortDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameAvailabilityType.ShortDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML longDescription(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityType$LongDescription.
     */
    public interface LongDescription extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LongDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("longdescriptionb270elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.NameAvailabilityType.LongDescription newValue(java.lang.Object obj) {
              return (au.gov.asic.types.NameAvailabilityType.LongDescription) type.newValue( obj ); }
            
            public static au.gov.asic.types.NameAvailabilityType.LongDescription newInstance() {
              return (au.gov.asic.types.NameAvailabilityType.LongDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.NameAvailabilityType.LongDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.NameAvailabilityType.LongDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.NameAvailabilityType newInstance() {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.NameAvailabilityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.NameAvailabilityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.NameAvailabilityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.NameAvailabilityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.NameAvailabilityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.NameAvailabilityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
