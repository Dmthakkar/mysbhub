/*
 * XML Type:  fssItemType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssItemType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML fssItemType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface FssItemType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FssItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("fssitemtype3a55type");
    
    /**
     * Gets the "reportingParty" element
     */
    au.gov.asic.types.fss.FssAccountType getReportingParty();
    
    /**
     * True if has "reportingParty" element
     */
    boolean isSetReportingParty();
    
    /**
     * Sets the "reportingParty" element
     */
    void setReportingParty(au.gov.asic.types.fss.FssAccountType reportingParty);
    
    /**
     * Appends and returns a new empty "reportingParty" element
     */
    au.gov.asic.types.fss.FssAccountType addNewReportingParty();
    
    /**
     * Unsets the "reportingParty" element
     */
    void unsetReportingParty();
    
    /**
     * Gets the "fee" element
     */
    au.gov.asic.types.fss.FeeType getFee();
    
    /**
     * Sets the "fee" element
     */
    void setFee(au.gov.asic.types.fss.FeeType fee);
    
    /**
     * Appends and returns a new empty "fee" element
     */
    au.gov.asic.types.fss.FeeType addNewFee();
    
    /**
     * Gets the "dateProcessed" element
     */
    java.util.Calendar getDateProcessed();
    
    /**
     * Gets (as xml) the "dateProcessed" element
     */
    org.apache.xmlbeans.XmlDate xgetDateProcessed();
    
    /**
     * Sets the "dateProcessed" element
     */
    void setDateProcessed(java.util.Calendar dateProcessed);
    
    /**
     * Sets (as xml) the "dateProcessed" element
     */
    void xsetDateProcessed(org.apache.xmlbeans.XmlDate dateProcessed);
    
    /**
     * Gets the "dateEffective" element
     */
    java.util.Calendar getDateEffective();
    
    /**
     * Gets (as xml) the "dateEffective" element
     */
    org.apache.xmlbeans.XmlDate xgetDateEffective();
    
    /**
     * Sets the "dateEffective" element
     */
    void setDateEffective(java.util.Calendar dateEffective);
    
    /**
     * Sets (as xml) the "dateEffective" element
     */
    void xsetDateEffective(org.apache.xmlbeans.XmlDate dateEffective);
    
    /**
     * Gets the "dateLastEffective" element
     */
    java.util.Calendar getDateLastEffective();
    
    /**
     * Gets (as xml) the "dateLastEffective" element
     */
    org.apache.xmlbeans.XmlDate xgetDateLastEffective();
    
    /**
     * True if has "dateLastEffective" element
     */
    boolean isSetDateLastEffective();
    
    /**
     * Sets the "dateLastEffective" element
     */
    void setDateLastEffective(java.util.Calendar dateLastEffective);
    
    /**
     * Sets (as xml) the "dateLastEffective" element
     */
    void xsetDateLastEffective(org.apache.xmlbeans.XmlDate dateLastEffective);
    
    /**
     * Unsets the "dateLastEffective" element
     */
    void unsetDateLastEffective();
    
    /**
     * Gets the "reversalIndicator" element
     */
    boolean getReversalIndicator();
    
    /**
     * Gets (as xml) the "reversalIndicator" element
     */
    org.apache.xmlbeans.XmlBoolean xgetReversalIndicator();
    
    /**
     * True if has "reversalIndicator" element
     */
    boolean isSetReversalIndicator();
    
    /**
     * Sets the "reversalIndicator" element
     */
    void setReversalIndicator(boolean reversalIndicator);
    
    /**
     * Sets (as xml) the "reversalIndicator" element
     */
    void xsetReversalIndicator(org.apache.xmlbeans.XmlBoolean reversalIndicator);
    
    /**
     * Unsets the "reversalIndicator" element
     */
    void unsetReversalIndicator();
    
    /**
     * Gets the "registryDocumentNumber" element
     */
    java.lang.String getRegistryDocumentNumber();
    
    /**
     * Gets (as xml) the "registryDocumentNumber" element
     */
    au.gov.asic.types.DocumentNoType xgetRegistryDocumentNumber();
    
    /**
     * True if has "registryDocumentNumber" element
     */
    boolean isSetRegistryDocumentNumber();
    
    /**
     * Sets the "registryDocumentNumber" element
     */
    void setRegistryDocumentNumber(java.lang.String registryDocumentNumber);
    
    /**
     * Sets (as xml) the "registryDocumentNumber" element
     */
    void xsetRegistryDocumentNumber(au.gov.asic.types.DocumentNoType registryDocumentNumber);
    
    /**
     * Unsets the "registryDocumentNumber" element
     */
    void unsetRegistryDocumentNumber();
    
    /**
     * Gets the "amount" element
     */
    java.math.BigDecimal getAmount();
    
    /**
     * Gets (as xml) the "amount" element
     */
    au.gov.asic.types.AmountType xgetAmount();
    
    /**
     * True if has "amount" element
     */
    boolean isSetAmount();
    
    /**
     * Sets the "amount" element
     */
    void setAmount(java.math.BigDecimal amount);
    
    /**
     * Sets (as xml) the "amount" element
     */
    void xsetAmount(au.gov.asic.types.AmountType amount);
    
    /**
     * Unsets the "amount" element
     */
    void unsetAmount();
    
    /**
     * Gets the "taxAmount" element
     */
    java.math.BigDecimal getTaxAmount();
    
    /**
     * Gets (as xml) the "taxAmount" element
     */
    au.gov.asic.types.AmountType xgetTaxAmount();
    
    /**
     * True if has "taxAmount" element
     */
    boolean isSetTaxAmount();
    
    /**
     * Sets the "taxAmount" element
     */
    void setTaxAmount(java.math.BigDecimal taxAmount);
    
    /**
     * Sets (as xml) the "taxAmount" element
     */
    void xsetTaxAmount(au.gov.asic.types.AmountType taxAmount);
    
    /**
     * Unsets the "taxAmount" element
     */
    void unsetTaxAmount();
    
    /**
     * Gets the "taxCode" element
     */
    java.lang.String getTaxCode();
    
    /**
     * Gets (as xml) the "taxCode" element
     */
    au.gov.asic.types.fss.FssItemType.TaxCode xgetTaxCode();
    
    /**
     * True if has "taxCode" element
     */
    boolean isSetTaxCode();
    
    /**
     * Sets the "taxCode" element
     */
    void setTaxCode(java.lang.String taxCode);
    
    /**
     * Sets (as xml) the "taxCode" element
     */
    void xsetTaxCode(au.gov.asic.types.fss.FssItemType.TaxCode taxCode);
    
    /**
     * Unsets the "taxCode" element
     */
    void unsetTaxCode();
    
    /**
     * Gets the "channel" element
     */
    au.gov.asic.types.fss.FssItemType.Channel.Enum getChannel();
    
    /**
     * Gets (as xml) the "channel" element
     */
    au.gov.asic.types.fss.FssItemType.Channel xgetChannel();
    
    /**
     * Sets the "channel" element
     */
    void setChannel(au.gov.asic.types.fss.FssItemType.Channel.Enum channel);
    
    /**
     * Sets (as xml) the "channel" element
     */
    void xsetChannel(au.gov.asic.types.fss.FssItemType.Channel channel);
    
    /**
     * Gets the "quantity" element
     */
    au.gov.asic.types.fss.FssItemType.Quantity.Enum getQuantity();
    
    /**
     * Gets (as xml) the "quantity" element
     */
    au.gov.asic.types.fss.FssItemType.Quantity xgetQuantity();
    
    /**
     * True if has "quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(au.gov.asic.types.fss.FssItemType.Quantity.Enum quantity);
    
    /**
     * Sets (as xml) the "quantity" element
     */
    void xsetQuantity(au.gov.asic.types.fss.FssItemType.Quantity quantity);
    
    /**
     * Unsets the "quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "suffix" element
     */
    java.lang.String getSuffix();
    
    /**
     * Gets (as xml) the "suffix" element
     */
    au.gov.asic.types.fss.FssItemType.Suffix xgetSuffix();
    
    /**
     * True if has "suffix" element
     */
    boolean isSetSuffix();
    
    /**
     * Sets the "suffix" element
     */
    void setSuffix(java.lang.String suffix);
    
    /**
     * Sets (as xml) the "suffix" element
     */
    void xsetSuffix(au.gov.asic.types.fss.FssItemType.Suffix suffix);
    
    /**
     * Unsets the "suffix" element
     */
    void unsetSuffix();
    
    /**
     * An XML taxCode(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$TaxCode.
     */
    public interface TaxCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("taxcode76f9elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssItemType.TaxCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssItemType.TaxCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssItemType.TaxCode newInstance() {
              return (au.gov.asic.types.fss.FssItemType.TaxCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssItemType.TaxCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssItemType.TaxCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML channel(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$Channel.
     */
    public interface Channel extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Channel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("channelf8c4elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum E = Enum.forString("E");
        static final Enum P = Enum.forString("P");
        
        static final int INT_E = Enum.INT_E;
        static final int INT_P = Enum.INT_P;
        
        /**
         * Enumeration value class for au.gov.asic.types.fss.FssItemType$Channel.
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
            static final int INT_P = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("E", INT_E),
                    new Enum("P", INT_P),
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
            public static au.gov.asic.types.fss.FssItemType.Channel newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssItemType.Channel) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssItemType.Channel newInstance() {
              return (au.gov.asic.types.fss.FssItemType.Channel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssItemType.Channel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssItemType.Channel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML quantity(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$Quantity.
     */
    public interface Quantity extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Quantity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("quantity1c7celemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum L = Enum.forString("L");
        static final Enum S = Enum.forString("S");
        
        static final int INT_L = Enum.INT_L;
        static final int INT_S = Enum.INT_S;
        
        /**
         * Enumeration value class for au.gov.asic.types.fss.FssItemType$Quantity.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_L
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
            
            static final int INT_L = 1;
            static final int INT_S = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("L", INT_L),
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
            public static au.gov.asic.types.fss.FssItemType.Quantity newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssItemType.Quantity) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssItemType.Quantity newInstance() {
              return (au.gov.asic.types.fss.FssItemType.Quantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssItemType.Quantity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssItemType.Quantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML suffix(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$Suffix.
     */
    public interface Suffix extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Suffix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("suffix3742elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssItemType.Suffix newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssItemType.Suffix) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssItemType.Suffix newInstance() {
              return (au.gov.asic.types.fss.FssItemType.Suffix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssItemType.Suffix newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssItemType.Suffix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.FssItemType newInstance() {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.FssItemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.FssItemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.FssItemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FssItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FssItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FssItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
