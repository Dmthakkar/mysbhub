/*
 * XML Type:  searchNniRequestType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.SearchNniRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML searchNniRequestType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface SearchNniRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchNniRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("searchnnirequesttypeb79ftype");
    
    /**
     * Gets the "searchType" element
     */
    au.gov.asic.types.nni.SearchNniRequestType.SearchType.Enum getSearchType();
    
    /**
     * Gets (as xml) the "searchType" element
     */
    au.gov.asic.types.nni.SearchNniRequestType.SearchType xgetSearchType();
    
    /**
     * Sets the "searchType" element
     */
    void setSearchType(au.gov.asic.types.nni.SearchNniRequestType.SearchType.Enum searchType);
    
    /**
     * Sets (as xml) the "searchType" element
     */
    void xsetSearchType(au.gov.asic.types.nni.SearchNniRequestType.SearchType searchType);
    
    /**
     * Gets the "searchScope" element
     */
    java.lang.String getSearchScope();
    
    /**
     * Gets (as xml) the "searchScope" element
     */
    au.gov.asic.types.nni.SearchNniRequestType.SearchScope xgetSearchScope();
    
    /**
     * Sets the "searchScope" element
     */
    void setSearchScope(java.lang.String searchScope);
    
    /**
     * Sets (as xml) the "searchScope" element
     */
    void xsetSearchScope(au.gov.asic.types.nni.SearchNniRequestType.SearchScope searchScope);
    
    /**
     * Gets the "organisation" element
     */
    au.gov.asic.types.nni.SearchNniRequestType.Organisation getOrganisation();
    
    /**
     * Sets the "organisation" element
     */
    void setOrganisation(au.gov.asic.types.nni.SearchNniRequestType.Organisation organisation);
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    au.gov.asic.types.nni.SearchNniRequestType.Organisation addNewOrganisation();
    
    /**
     * Gets the "maxResult" element
     */
    java.math.BigInteger getMaxResult();
    
    /**
     * Gets (as xml) the "maxResult" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetMaxResult();
    
    /**
     * True if has "maxResult" element
     */
    boolean isSetMaxResult();
    
    /**
     * Sets the "maxResult" element
     */
    void setMaxResult(java.math.BigInteger maxResult);
    
    /**
     * Sets (as xml) the "maxResult" element
     */
    void xsetMaxResult(org.apache.xmlbeans.XmlPositiveInteger maxResult);
    
    /**
     * Unsets the "maxResult" element
     */
    void unsetMaxResult();
    
    /**
     * An XML searchType(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.SearchNniRequestType$SearchType.
     */
    public interface SearchType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("searchtype9fc1elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum E = Enum.forString("E");
        static final Enum S = Enum.forString("S");
        
        static final int INT_E = Enum.INT_E;
        static final int INT_S = Enum.INT_S;
        
        /**
         * Enumeration value class for au.gov.asic.types.nni.SearchNniRequestType$SearchType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_E
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
            
            static final int INT_E = 1;
            static final int INT_S = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("E", INT_E),
                    new Enum("S", INT_S),
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
            public static au.gov.asic.types.nni.SearchNniRequestType.SearchType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.nni.SearchNniRequestType.SearchType) type.newValue( obj ); }
            
            public static au.gov.asic.types.nni.SearchNniRequestType.SearchType newInstance() {
              return (au.gov.asic.types.nni.SearchNniRequestType.SearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.SearchNniRequestType.SearchType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.SearchNniRequestType.SearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML searchScope(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.SearchNniRequestType$SearchScope.
     */
    public interface SearchScope extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchScope.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("searchscope6ca7elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.SearchNniRequestType.SearchScope newValue(java.lang.Object obj) {
              return (au.gov.asic.types.nni.SearchNniRequestType.SearchScope) type.newValue( obj ); }
            
            public static au.gov.asic.types.nni.SearchNniRequestType.SearchScope newInstance() {
              return (au.gov.asic.types.nni.SearchNniRequestType.SearchScope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.SearchNniRequestType.SearchScope newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.SearchNniRequestType.SearchScope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML organisation(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Organisation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisation04e9elemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        au.gov.asic.types.NniNameType xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(au.gov.asic.types.NniNameType name);
        
        /**
         * Gets the "type" element
         */
        au.gov.asic.types.nni.NniTypeCodeType.Enum getType();
        
        /**
         * Gets (as xml) the "type" element
         */
        au.gov.asic.types.nni.NniTypeCodeType xgetType();
        
        /**
         * True if has "type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "type" element
         */
        void setType(au.gov.asic.types.nni.NniTypeCodeType.Enum type);
        
        /**
         * Sets (as xml) the "type" element
         */
        void xsetType(au.gov.asic.types.nni.NniTypeCodeType type);
        
        /**
         * Unsets the "type" element
         */
        void unsetType();
        
        /**
         * Gets the "status" element
         */
        au.gov.asic.types.nni.SearchStatusType.Enum getStatus();
        
        /**
         * Gets (as xml) the "status" element
         */
        au.gov.asic.types.nni.SearchStatusType xgetStatus();
        
        /**
         * True if has "status" element
         */
        boolean isSetStatus();
        
        /**
         * Sets the "status" element
         */
        void setStatus(au.gov.asic.types.nni.SearchStatusType.Enum status);
        
        /**
         * Sets (as xml) the "status" element
         */
        void xsetStatus(au.gov.asic.types.nni.SearchStatusType status);
        
        /**
         * Unsets the "status" element
         */
        void unsetStatus();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.SearchNniRequestType.Organisation newInstance() {
              return (au.gov.asic.types.nni.SearchNniRequestType.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.SearchNniRequestType.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.SearchNniRequestType.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.SearchNniRequestType newInstance() {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.SearchNniRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.SearchNniRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.SearchNniRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.SearchNniRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
