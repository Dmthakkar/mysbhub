/*
 * XML Type:  nniTypeCodeType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NniTypeCodeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML nniTypeCodeType(@uri:nni.types.asic.gov.au).
 *
 * This is an atomic type that is a restriction of au.gov.asic.types.nni.NniTypeCodeType.
 */
public interface NniTypeCodeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NniTypeCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nnitypecodetypeffcftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum APTY = Enum.forString("APTY");
    static final Enum APUB = Enum.forString("APUB");
    static final Enum ASSN = Enum.forString("ASSN");
    static final Enum BUSN = Enum.forString("BUSN");
    static final Enum CHAR = Enum.forString("CHAR");
    static final Enum COMP = Enum.forString("COMP");
    static final Enum COOP = Enum.forString("COOP");
    static final Enum FNOS = Enum.forString("FNOS");
    static final Enum LTDP = Enum.forString("LTDP");
    static final Enum MISM = Enum.forString("MISM");
    static final Enum NONC = Enum.forString("NONC");
    static final Enum NRET = Enum.forString("NRET");
    static final Enum RACN = Enum.forString("RACN");
    static final Enum REBD = Enum.forString("REBD");
    static final Enum RSVN = Enum.forString("RSVN");
    static final Enum SOLS = Enum.forString("SOLS");
    static final Enum TRST = Enum.forString("TRST");
    
    static final int INT_APTY = Enum.INT_APTY;
    static final int INT_APUB = Enum.INT_APUB;
    static final int INT_ASSN = Enum.INT_ASSN;
    static final int INT_BUSN = Enum.INT_BUSN;
    static final int INT_CHAR = Enum.INT_CHAR;
    static final int INT_COMP = Enum.INT_COMP;
    static final int INT_COOP = Enum.INT_COOP;
    static final int INT_FNOS = Enum.INT_FNOS;
    static final int INT_LTDP = Enum.INT_LTDP;
    static final int INT_MISM = Enum.INT_MISM;
    static final int INT_NONC = Enum.INT_NONC;
    static final int INT_NRET = Enum.INT_NRET;
    static final int INT_RACN = Enum.INT_RACN;
    static final int INT_REBD = Enum.INT_REBD;
    static final int INT_RSVN = Enum.INT_RSVN;
    static final int INT_SOLS = Enum.INT_SOLS;
    static final int INT_TRST = Enum.INT_TRST;
    
    /**
     * Enumeration value class for au.gov.asic.types.nni.NniTypeCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_APTY
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
        
        static final int INT_APTY = 1;
        static final int INT_APUB = 2;
        static final int INT_ASSN = 3;
        static final int INT_BUSN = 4;
        static final int INT_CHAR = 5;
        static final int INT_COMP = 6;
        static final int INT_COOP = 7;
        static final int INT_FNOS = 8;
        static final int INT_LTDP = 9;
        static final int INT_MISM = 10;
        static final int INT_NONC = 11;
        static final int INT_NRET = 12;
        static final int INT_RACN = 13;
        static final int INT_REBD = 14;
        static final int INT_RSVN = 15;
        static final int INT_SOLS = 16;
        static final int INT_TRST = 17;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("APTY", INT_APTY),
                new Enum("APUB", INT_APUB),
                new Enum("ASSN", INT_ASSN),
                new Enum("BUSN", INT_BUSN),
                new Enum("CHAR", INT_CHAR),
                new Enum("COMP", INT_COMP),
                new Enum("COOP", INT_COOP),
                new Enum("FNOS", INT_FNOS),
                new Enum("LTDP", INT_LTDP),
                new Enum("MISM", INT_MISM),
                new Enum("NONC", INT_NONC),
                new Enum("NRET", INT_NRET),
                new Enum("RACN", INT_RACN),
                new Enum("REBD", INT_REBD),
                new Enum("RSVN", INT_RSVN),
                new Enum("SOLS", INT_SOLS),
                new Enum("TRST", INT_TRST),
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
        public static au.gov.asic.types.nni.NniTypeCodeType newValue(java.lang.Object obj) {
          return (au.gov.asic.types.nni.NniTypeCodeType) type.newValue( obj ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType newInstance() {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.NniTypeCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.NniTypeCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.NniTypeCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.NniTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
