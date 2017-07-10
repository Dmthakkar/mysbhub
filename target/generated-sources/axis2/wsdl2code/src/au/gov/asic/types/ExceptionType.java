/*
 * XML Type:  exceptionType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ExceptionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML exceptionType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ExceptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExceptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("exceptiontype0493type");
    
    /**
     * Gets the "code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    au.gov.asic.types.ExceptionType.Code xgetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(au.gov.asic.types.ExceptionType.Code code);
    
    /**
     * Gets the "severity" element
     */
    au.gov.asic.types.ExceptionType.Severity.Enum getSeverity();
    
    /**
     * Gets (as xml) the "severity" element
     */
    au.gov.asic.types.ExceptionType.Severity xgetSeverity();
    
    /**
     * Sets the "severity" element
     */
    void setSeverity(au.gov.asic.types.ExceptionType.Severity.Enum severity);
    
    /**
     * Sets (as xml) the "severity" element
     */
    void xsetSeverity(au.gov.asic.types.ExceptionType.Severity severity);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    au.gov.asic.types.ExceptionType.Description xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(au.gov.asic.types.ExceptionType.Description description);
    
    /**
     * Gets the "userDescription" element
     */
    java.lang.String getUserDescription();
    
    /**
     * Gets (as xml) the "userDescription" element
     */
    au.gov.asic.types.ExceptionType.UserDescription xgetUserDescription();
    
    /**
     * True if has "userDescription" element
     */
    boolean isSetUserDescription();
    
    /**
     * Sets the "userDescription" element
     */
    void setUserDescription(java.lang.String userDescription);
    
    /**
     * Sets (as xml) the "userDescription" element
     */
    void xsetUserDescription(au.gov.asic.types.ExceptionType.UserDescription userDescription);
    
    /**
     * Unsets the "userDescription" element
     */
    void unsetUserDescription();
    
    /**
     * Gets the "context" element
     */
    au.gov.asic.types.ExceptionType.Context getContext();
    
    /**
     * True if has "context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "context" element
     */
    void setContext(au.gov.asic.types.ExceptionType.Context context);
    
    /**
     * Appends and returns a new empty "context" element
     */
    au.gov.asic.types.ExceptionType.Context addNewContext();
    
    /**
     * Unsets the "context" element
     */
    void unsetContext();
    
    /**
     * Gets the "nodeXPath" element
     */
    java.lang.String getNodeXPath();
    
    /**
     * Gets (as xml) the "nodeXPath" element
     */
    au.gov.asic.types.ExceptionType.NodeXPath xgetNodeXPath();
    
    /**
     * True if has "nodeXPath" element
     */
    boolean isSetNodeXPath();
    
    /**
     * Sets the "nodeXPath" element
     */
    void setNodeXPath(java.lang.String nodeXPath);
    
    /**
     * Sets (as xml) the "nodeXPath" element
     */
    void xsetNodeXPath(au.gov.asic.types.ExceptionType.NodeXPath nodeXPath);
    
    /**
     * Unsets the "nodeXPath" element
     */
    void unsetNodeXPath();
    
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Code.
     */
    public interface Code extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("code805celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ExceptionType.Code newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ExceptionType.Code) type.newValue( obj ); }
            
            public static au.gov.asic.types.ExceptionType.Code newInstance() {
              return (au.gov.asic.types.ExceptionType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ExceptionType.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ExceptionType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML severity(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Severity.
     */
    public interface Severity extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Severity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("severity8d6celemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum REJECT = Enum.forString("Reject");
        static final Enum WARNING = Enum.forString("Warning");
        static final Enum INFORMATION = Enum.forString("Information");
        static final Enum PENDED = Enum.forString("Pended");
        
        static final int INT_REJECT = Enum.INT_REJECT;
        static final int INT_WARNING = Enum.INT_WARNING;
        static final int INT_INFORMATION = Enum.INT_INFORMATION;
        static final int INT_PENDED = Enum.INT_PENDED;
        
        /**
         * Enumeration value class for au.gov.asic.types.ExceptionType$Severity.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_REJECT
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
            
            static final int INT_REJECT = 1;
            static final int INT_WARNING = 2;
            static final int INT_INFORMATION = 3;
            static final int INT_PENDED = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Reject", INT_REJECT),
                    new Enum("Warning", INT_WARNING),
                    new Enum("Information", INT_INFORMATION),
                    new Enum("Pended", INT_PENDED),
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
            public static au.gov.asic.types.ExceptionType.Severity newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ExceptionType.Severity) type.newValue( obj ); }
            
            public static au.gov.asic.types.ExceptionType.Severity newInstance() {
              return (au.gov.asic.types.ExceptionType.Severity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ExceptionType.Severity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ExceptionType.Severity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML description(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Description.
     */
    public interface Description extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("description22fbelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ExceptionType.Description newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ExceptionType.Description) type.newValue( obj ); }
            
            public static au.gov.asic.types.ExceptionType.Description newInstance() {
              return (au.gov.asic.types.ExceptionType.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ExceptionType.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ExceptionType.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML userDescription(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$UserDescription.
     */
    public interface UserDescription extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("userdescription9e70elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ExceptionType.UserDescription newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ExceptionType.UserDescription) type.newValue( obj ); }
            
            public static au.gov.asic.types.ExceptionType.UserDescription newInstance() {
              return (au.gov.asic.types.ExceptionType.UserDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ExceptionType.UserDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ExceptionType.UserDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML context(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Context extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Context.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("context6a6eelemtype");
        
        /**
         * Gets array of all "line" elements
         */
        java.lang.String[] getLineArray();
        
        /**
         * Gets ith "line" element
         */
        java.lang.String getLineArray(int i);
        
        /**
         * Gets (as xml) array of all "line" elements
         */
        au.gov.asic.types.ExceptionType.Context.Line[] xgetLineArray();
        
        /**
         * Gets (as xml) ith "line" element
         */
        au.gov.asic.types.ExceptionType.Context.Line xgetLineArray(int i);
        
        /**
         * Returns number of "line" element
         */
        int sizeOfLineArray();
        
        /**
         * Sets array of all "line" element
         */
        void setLineArray(java.lang.String[] lineArray);
        
        /**
         * Sets ith "line" element
         */
        void setLineArray(int i, java.lang.String line);
        
        /**
         * Sets (as xml) array of all "line" element
         */
        void xsetLineArray(au.gov.asic.types.ExceptionType.Context.Line[] lineArray);
        
        /**
         * Sets (as xml) ith "line" element
         */
        void xsetLineArray(int i, au.gov.asic.types.ExceptionType.Context.Line line);
        
        /**
         * Inserts the value as the ith "line" element
         */
        void insertLine(int i, java.lang.String line);
        
        /**
         * Appends the value as the last "line" element
         */
        void addLine(java.lang.String line);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "line" element
         */
        au.gov.asic.types.ExceptionType.Context.Line insertNewLine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line" element
         */
        au.gov.asic.types.ExceptionType.Context.Line addNewLine();
        
        /**
         * Removes the ith "line" element
         */
        void removeLine(int i);
        
        /**
         * An XML line(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$Context$Line.
         */
        public interface Line extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("lineb6feelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.ExceptionType.Context.Line newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.ExceptionType.Context.Line) type.newValue( obj ); }
                
                public static au.gov.asic.types.ExceptionType.Context.Line newInstance() {
                  return (au.gov.asic.types.ExceptionType.Context.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.ExceptionType.Context.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.ExceptionType.Context.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ExceptionType.Context newInstance() {
              return (au.gov.asic.types.ExceptionType.Context) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ExceptionType.Context newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ExceptionType.Context) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML nodeXPath(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ExceptionType$NodeXPath.
     */
    public interface NodeXPath extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NodeXPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nodexpathe99aelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ExceptionType.NodeXPath newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ExceptionType.NodeXPath) type.newValue( obj ); }
            
            public static au.gov.asic.types.ExceptionType.NodeXPath newInstance() {
              return (au.gov.asic.types.ExceptionType.NodeXPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ExceptionType.NodeXPath newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ExceptionType.NodeXPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.ExceptionType newInstance() {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.ExceptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.ExceptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.ExceptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.ExceptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.ExceptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.ExceptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ExceptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ExceptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ExceptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
