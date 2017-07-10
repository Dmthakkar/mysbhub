/*
 * XML Type:  fssTransactionType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssTransactionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML fssTransactionType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface FssTransactionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FssTransactionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("fsstransactiontype7c06type");
    
    /**
     * Gets the "dueDate" element
     */
    java.util.Calendar getDueDate();
    
    /**
     * Gets (as xml) the "dueDate" element
     */
    org.apache.xmlbeans.XmlDate xgetDueDate();
    
    /**
     * Sets the "dueDate" element
     */
    void setDueDate(java.util.Calendar dueDate);
    
    /**
     * Sets (as xml) the "dueDate" element
     */
    void xsetDueDate(org.apache.xmlbeans.XmlDate dueDate);
    
    /**
     * Gets the "type" element
     */
    au.gov.asic.types.fss.FssTransactionType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    au.gov.asic.types.fss.FssTransactionType.Type xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(au.gov.asic.types.fss.FssTransactionType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(au.gov.asic.types.fss.FssTransactionType.Type type);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    au.gov.asic.types.fss.FssTransactionType.Description xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(au.gov.asic.types.fss.FssTransactionType.Description description);
    
    /**
     * Gets the "referenceId" element
     */
    java.lang.String getReferenceId();
    
    /**
     * Gets (as xml) the "referenceId" element
     */
    au.gov.asic.types.fss.FssTransactionType.ReferenceId xgetReferenceId();
    
    /**
     * Sets the "referenceId" element
     */
    void setReferenceId(java.lang.String referenceId);
    
    /**
     * Sets (as xml) the "referenceId" element
     */
    void xsetReferenceId(au.gov.asic.types.fss.FssTransactionType.ReferenceId referenceId);
    
    /**
     * Gets the "allocationReference" element
     */
    java.lang.String getAllocationReference();
    
    /**
     * Gets (as xml) the "allocationReference" element
     */
    au.gov.asic.types.fss.FssTransactionType.AllocationReference xgetAllocationReference();
    
    /**
     * True if has "allocationReference" element
     */
    boolean isSetAllocationReference();
    
    /**
     * Sets the "allocationReference" element
     */
    void setAllocationReference(java.lang.String allocationReference);
    
    /**
     * Sets (as xml) the "allocationReference" element
     */
    void xsetAllocationReference(au.gov.asic.types.fss.FssTransactionType.AllocationReference allocationReference);
    
    /**
     * Unsets the "allocationReference" element
     */
    void unsetAllocationReference();
    
    /**
     * Gets the "originalAmount" element
     */
    java.math.BigDecimal getOriginalAmount();
    
    /**
     * Gets (as xml) the "originalAmount" element
     */
    au.gov.asic.types.AmountType xgetOriginalAmount();
    
    /**
     * Sets the "originalAmount" element
     */
    void setOriginalAmount(java.math.BigDecimal originalAmount);
    
    /**
     * Sets (as xml) the "originalAmount" element
     */
    void xsetOriginalAmount(au.gov.asic.types.AmountType originalAmount);
    
    /**
     * Gets the "outstandingAmount" element
     */
    java.math.BigDecimal getOutstandingAmount();
    
    /**
     * Gets (as xml) the "outstandingAmount" element
     */
    au.gov.asic.types.AmountType xgetOutstandingAmount();
    
    /**
     * Sets the "outstandingAmount" element
     */
    void setOutstandingAmount(java.math.BigDecimal outstandingAmount);
    
    /**
     * Sets (as xml) the "outstandingAmount" element
     */
    void xsetOutstandingAmount(au.gov.asic.types.AmountType outstandingAmount);
    
    /**
     * An XML type(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("typee170elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum FEE = Enum.forString("Fee");
        static final Enum REFUND = Enum.forString("Refund");
        static final Enum WAIVER = Enum.forString("Waiver");
        static final Enum PAYMENT = Enum.forString("Payment");
        
        static final int INT_FEE = Enum.INT_FEE;
        static final int INT_REFUND = Enum.INT_REFUND;
        static final int INT_WAIVER = Enum.INT_WAIVER;
        static final int INT_PAYMENT = Enum.INT_PAYMENT;
        
        /**
         * Enumeration value class for au.gov.asic.types.fss.FssTransactionType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_FEE
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
            
            static final int INT_FEE = 1;
            static final int INT_REFUND = 2;
            static final int INT_WAIVER = 3;
            static final int INT_PAYMENT = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Fee", INT_FEE),
                    new Enum("Refund", INT_REFUND),
                    new Enum("Waiver", INT_WAIVER),
                    new Enum("Payment", INT_PAYMENT),
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
            public static au.gov.asic.types.fss.FssTransactionType.Type newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssTransactionType.Type) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.Type newInstance() {
              return (au.gov.asic.types.fss.FssTransactionType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssTransactionType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML description(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$Description.
     */
    public interface Description extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("description129eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssTransactionType.Description newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssTransactionType.Description) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.Description newInstance() {
              return (au.gov.asic.types.fss.FssTransactionType.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssTransactionType.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML referenceId(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$ReferenceId.
     */
    public interface ReferenceId extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferenceId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("referenceid0f94elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssTransactionType.ReferenceId newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssTransactionType.ReferenceId) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.ReferenceId newInstance() {
              return (au.gov.asic.types.fss.FssTransactionType.ReferenceId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.ReferenceId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssTransactionType.ReferenceId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML allocationReference(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$AllocationReference.
     */
    public interface AllocationReference extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllocationReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("allocationreferencea86felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssTransactionType.AllocationReference newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssTransactionType.AllocationReference) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.AllocationReference newInstance() {
              return (au.gov.asic.types.fss.FssTransactionType.AllocationReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssTransactionType.AllocationReference newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssTransactionType.AllocationReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.FssTransactionType newInstance() {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.FssTransactionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.FssTransactionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.FssTransactionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FssTransactionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FssTransactionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FssTransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
