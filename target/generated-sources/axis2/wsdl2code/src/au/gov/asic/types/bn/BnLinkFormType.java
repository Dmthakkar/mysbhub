/*
 * XML Type:  bnLinkFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnLinkFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML bnLinkFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BnLinkFormType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BnLinkFormType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bnlinkformtype3ec0type");
    
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
     * Gets the "agent" element
     */
    au.gov.asic.types.AgentType getAgent();
    
    /**
     * Sets the "agent" element
     */
    void setAgent(au.gov.asic.types.AgentType agent);
    
    /**
     * Appends and returns a new empty "agent" element
     */
    au.gov.asic.types.AgentType addNewAgent();
    
    /**
     * Gets the "action" element
     */
    au.gov.asic.types.bn.BnLinkFormType.Action.Enum getAction();
    
    /**
     * Gets (as xml) the "action" element
     */
    au.gov.asic.types.bn.BnLinkFormType.Action xgetAction();
    
    /**
     * Sets the "action" element
     */
    void setAction(au.gov.asic.types.bn.BnLinkFormType.Action.Enum action);
    
    /**
     * Sets (as xml) the "action" element
     */
    void xsetAction(au.gov.asic.types.bn.BnLinkFormType.Action action);
    
    /**
     * Gets the "signatory" element
     */
    au.gov.asic.types.SignatoryType getSignatory();
    
    /**
     * True if has "signatory" element
     */
    boolean isSetSignatory();
    
    /**
     * Sets the "signatory" element
     */
    void setSignatory(au.gov.asic.types.SignatoryType signatory);
    
    /**
     * Appends and returns a new empty "signatory" element
     */
    au.gov.asic.types.SignatoryType addNewSignatory();
    
    /**
     * Unsets the "signatory" element
     */
    void unsetSignatory();
    
    /**
     * Gets the "fileNotes" element
     */
    au.gov.asic.types.FileNotesType getFileNotes();
    
    /**
     * True if has "fileNotes" element
     */
    boolean isSetFileNotes();
    
    /**
     * Sets the "fileNotes" element
     */
    void setFileNotes(au.gov.asic.types.FileNotesType fileNotes);
    
    /**
     * Appends and returns a new empty "fileNotes" element
     */
    au.gov.asic.types.FileNotesType addNewFileNotes();
    
    /**
     * Unsets the "fileNotes" element
     */
    void unsetFileNotes();
    
    /**
     * An XML action(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnLinkFormType$Action.
     */
    public interface Action extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("actioncd12elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ADD = Enum.forString("ADD");
        static final Enum CEASE = Enum.forString("CEASE");
        
        static final int INT_ADD = Enum.INT_ADD;
        static final int INT_CEASE = Enum.INT_CEASE;
        
        /**
         * Enumeration value class for au.gov.asic.types.bn.BnLinkFormType$Action.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ADD
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
            
            static final int INT_ADD = 1;
            static final int INT_CEASE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("ADD", INT_ADD),
                    new Enum("CEASE", INT_CEASE),
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
            public static au.gov.asic.types.bn.BnLinkFormType.Action newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.BnLinkFormType.Action) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.BnLinkFormType.Action newInstance() {
              return (au.gov.asic.types.bn.BnLinkFormType.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BnLinkFormType.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BnLinkFormType.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BnLinkFormType newInstance() {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BnLinkFormType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnLinkFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnLinkFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnLinkFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
