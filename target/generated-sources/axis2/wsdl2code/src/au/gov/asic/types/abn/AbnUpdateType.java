/*
 * XML Type:  abnUpdateType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbnUpdateType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML abnUpdateType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface AbnUpdateType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbnUpdateType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("abnupdatetypef559type");
    
    /**
     * Gets the "action" element
     */
    au.gov.asic.types.abn.AbnUpdateType.Action.Enum getAction();
    
    /**
     * Gets (as xml) the "action" element
     */
    au.gov.asic.types.abn.AbnUpdateType.Action xgetAction();
    
    /**
     * Sets the "action" element
     */
    void setAction(au.gov.asic.types.abn.AbnUpdateType.Action.Enum action);
    
    /**
     * Sets (as xml) the "action" element
     */
    void xsetAction(au.gov.asic.types.abn.AbnUpdateType.Action action);
    
    /**
     * Gets the "abnReferenceNumber" element
     */
    long getAbnReferenceNumber();
    
    /**
     * Gets (as xml) the "abnReferenceNumber" element
     */
    au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber xgetAbnReferenceNumber();
    
    /**
     * True if has "abnReferenceNumber" element
     */
    boolean isSetAbnReferenceNumber();
    
    /**
     * Sets the "abnReferenceNumber" element
     */
    void setAbnReferenceNumber(long abnReferenceNumber);
    
    /**
     * Sets (as xml) the "abnReferenceNumber" element
     */
    void xsetAbnReferenceNumber(au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber abnReferenceNumber);
    
    /**
     * Unsets the "abnReferenceNumber" element
     */
    void unsetAbnReferenceNumber();
    
    /**
     * Gets the "abn" element
     */
    java.lang.String getAbn();
    
    /**
     * Gets (as xml) the "abn" element
     */
    au.gov.asic.types.AbnType xgetAbn();
    
    /**
     * True if has "abn" element
     */
    boolean isSetAbn();
    
    /**
     * Sets the "abn" element
     */
    void setAbn(java.lang.String abn);
    
    /**
     * Sets (as xml) the "abn" element
     */
    void xsetAbn(au.gov.asic.types.AbnType abn);
    
    /**
     * Unsets the "abn" element
     */
    void unsetAbn();
    
    /**
     * Gets the "nniNumber" element
     */
    int getNniNumber();
    
    /**
     * Gets (as xml) the "nniNumber" element
     */
    au.gov.asic.types.NniNumberType xgetNniNumber();
    
    /**
     * True if has "nniNumber" element
     */
    boolean isSetNniNumber();
    
    /**
     * Sets the "nniNumber" element
     */
    void setNniNumber(int nniNumber);
    
    /**
     * Sets (as xml) the "nniNumber" element
     */
    void xsetNniNumber(au.gov.asic.types.NniNumberType nniNumber);
    
    /**
     * Unsets the "nniNumber" element
     */
    void unsetNniNumber();
    
    /**
     * Gets the "abrEntity" element
     */
    au.gov.asic.types.abn.BaseAbrEntityType getAbrEntity();
    
    /**
     * True if has "abrEntity" element
     */
    boolean isSetAbrEntity();
    
    /**
     * Sets the "abrEntity" element
     */
    void setAbrEntity(au.gov.asic.types.abn.BaseAbrEntityType abrEntity);
    
    /**
     * Appends and returns a new empty "abrEntity" element
     */
    au.gov.asic.types.abn.BaseAbrEntityType addNewAbrEntity();
    
    /**
     * Unsets the "abrEntity" element
     */
    void unsetAbrEntity();
    
    /**
     * An XML action(@uri:abn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.abn.AbnUpdateType$Action.
     */
    public interface Action extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("action83abelemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum APPROVED = Enum.forString("APPROVED");
        static final Enum CEASED = Enum.forString("CEASED");
        static final Enum CHANGED = Enum.forString("CHANGED");
        static final Enum REINSTATED = Enum.forString("REINSTATED");
        static final Enum REJECTED = Enum.forString("REJECTED");
        
        static final int INT_APPROVED = Enum.INT_APPROVED;
        static final int INT_CEASED = Enum.INT_CEASED;
        static final int INT_CHANGED = Enum.INT_CHANGED;
        static final int INT_REINSTATED = Enum.INT_REINSTATED;
        static final int INT_REJECTED = Enum.INT_REJECTED;
        
        /**
         * Enumeration value class for au.gov.asic.types.abn.AbnUpdateType$Action.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_APPROVED
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
            
            static final int INT_APPROVED = 1;
            static final int INT_CEASED = 2;
            static final int INT_CHANGED = 3;
            static final int INT_REINSTATED = 4;
            static final int INT_REJECTED = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("APPROVED", INT_APPROVED),
                    new Enum("CEASED", INT_CEASED),
                    new Enum("CHANGED", INT_CHANGED),
                    new Enum("REINSTATED", INT_REINSTATED),
                    new Enum("REJECTED", INT_REJECTED),
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
            public static au.gov.asic.types.abn.AbnUpdateType.Action newValue(java.lang.Object obj) {
              return (au.gov.asic.types.abn.AbnUpdateType.Action) type.newValue( obj ); }
            
            public static au.gov.asic.types.abn.AbnUpdateType.Action newInstance() {
              return (au.gov.asic.types.abn.AbnUpdateType.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnUpdateType.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnUpdateType.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML abnReferenceNumber(@uri:abn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.abn.AbnUpdateType$AbnReferenceNumber.
     */
    public interface AbnReferenceNumber extends au.gov.asic.types.AbnApplicationReferenceNumberType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbnReferenceNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("abnreferencenumber167celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber newInstance() {
              return (au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.abn.AbnUpdateType newInstance() {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.AbnUpdateType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.AbnUpdateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.AbnUpdateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.AbnUpdateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
