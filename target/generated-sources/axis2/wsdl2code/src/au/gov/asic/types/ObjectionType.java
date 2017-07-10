/*
 * XML Type:  objectionType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ObjectionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML objectionType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ObjectionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("objectiontypea02dtype");
    
    /**
     * Gets the "code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    au.gov.asic.types.ObjectionType.Code xgetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(au.gov.asic.types.ObjectionType.Code code);
    
    /**
     * Gets the "descriptions" element
     */
    java.lang.String getDescriptions();
    
    /**
     * Gets (as xml) the "descriptions" element
     */
    au.gov.asic.types.ObjectionType.Descriptions xgetDescriptions();
    
    /**
     * Sets the "descriptions" element
     */
    void setDescriptions(java.lang.String descriptions);
    
    /**
     * Sets (as xml) the "descriptions" element
     */
    void xsetDescriptions(au.gov.asic.types.ObjectionType.Descriptions descriptions);
    
    /**
     * Gets the "context" element
     */
    au.gov.asic.types.ObjectionType.Context getContext();
    
    /**
     * True if has "context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "context" element
     */
    void setContext(au.gov.asic.types.ObjectionType.Context context);
    
    /**
     * Appends and returns a new empty "context" element
     */
    au.gov.asic.types.ObjectionType.Context addNewContext();
    
    /**
     * Unsets the "context" element
     */
    void unsetContext();
    
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ObjectionType$Code.
     */
    public interface Code extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("code1bf6elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ObjectionType.Code newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ObjectionType.Code) type.newValue( obj ); }
            
            public static au.gov.asic.types.ObjectionType.Code newInstance() {
              return (au.gov.asic.types.ObjectionType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ObjectionType.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ObjectionType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML descriptions(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.ObjectionType$Descriptions.
     */
    public interface Descriptions extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Descriptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("descriptions7a80elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ObjectionType.Descriptions newValue(java.lang.Object obj) {
              return (au.gov.asic.types.ObjectionType.Descriptions) type.newValue( obj ); }
            
            public static au.gov.asic.types.ObjectionType.Descriptions newInstance() {
              return (au.gov.asic.types.ObjectionType.Descriptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ObjectionType.Descriptions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ObjectionType.Descriptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Context.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("context0608elemtype");
        
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
        au.gov.asic.types.ObjectionType.Context.Line[] xgetLineArray();
        
        /**
         * Gets (as xml) ith "line" element
         */
        au.gov.asic.types.ObjectionType.Context.Line xgetLineArray(int i);
        
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
        void xsetLineArray(au.gov.asic.types.ObjectionType.Context.Line[] lineArray);
        
        /**
         * Sets (as xml) ith "line" element
         */
        void xsetLineArray(int i, au.gov.asic.types.ObjectionType.Context.Line line);
        
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
        au.gov.asic.types.ObjectionType.Context.Line insertNewLine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line" element
         */
        au.gov.asic.types.ObjectionType.Context.Line addNewLine();
        
        /**
         * Removes the ith "line" element
         */
        void removeLine(int i);
        
        /**
         * An XML line(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.ObjectionType$Context$Line.
         */
        public interface Line extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Line.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("line5298elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.ObjectionType.Context.Line newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.ObjectionType.Context.Line) type.newValue( obj ); }
                
                public static au.gov.asic.types.ObjectionType.Context.Line newInstance() {
                  return (au.gov.asic.types.ObjectionType.Context.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.ObjectionType.Context.Line newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.ObjectionType.Context.Line) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ObjectionType.Context newInstance() {
              return (au.gov.asic.types.ObjectionType.Context) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ObjectionType.Context newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ObjectionType.Context) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.ObjectionType newInstance() {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.ObjectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.ObjectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.ObjectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.ObjectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.ObjectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.ObjectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ObjectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ObjectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ObjectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
