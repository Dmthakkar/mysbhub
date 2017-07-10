/*
 * XML Type:  transactionType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.TransactionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML transactionType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface TransactionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("transactiontype717atype");
    
    /**
     * Gets the "reportingParty" element
     */
    au.gov.asic.types.fss.FssAccountType getReportingParty();
    
    /**
     * Sets the "reportingParty" element
     */
    void setReportingParty(au.gov.asic.types.fss.FssAccountType reportingParty);
    
    /**
     * Appends and returns a new empty "reportingParty" element
     */
    au.gov.asic.types.fss.FssAccountType addNewReportingParty();
    
    /**
     * Gets the "date" element
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    org.apache.xmlbeans.XmlDate xgetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlDate date);
    
    /**
     * Gets the "code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    au.gov.asic.types.fss.TransactionType.Code xgetCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(au.gov.asic.types.fss.TransactionType.Code code);
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets the "descriptionLine1" element
     */
    java.lang.String getDescriptionLine1();
    
    /**
     * Gets (as xml) the "descriptionLine1" element
     */
    au.gov.asic.types.fss.TransactionType.DescriptionLine1 xgetDescriptionLine1();
    
    /**
     * Sets the "descriptionLine1" element
     */
    void setDescriptionLine1(java.lang.String descriptionLine1);
    
    /**
     * Sets (as xml) the "descriptionLine1" element
     */
    void xsetDescriptionLine1(au.gov.asic.types.fss.TransactionType.DescriptionLine1 descriptionLine1);
    
    /**
     * Gets the "descriptionLine2" element
     */
    java.lang.String getDescriptionLine2();
    
    /**
     * Gets (as xml) the "descriptionLine2" element
     */
    au.gov.asic.types.fss.TransactionType.DescriptionLine2 xgetDescriptionLine2();
    
    /**
     * True if has "descriptionLine2" element
     */
    boolean isSetDescriptionLine2();
    
    /**
     * Sets the "descriptionLine2" element
     */
    void setDescriptionLine2(java.lang.String descriptionLine2);
    
    /**
     * Sets (as xml) the "descriptionLine2" element
     */
    void xsetDescriptionLine2(au.gov.asic.types.fss.TransactionType.DescriptionLine2 descriptionLine2);
    
    /**
     * Unsets the "descriptionLine2" element
     */
    void unsetDescriptionLine2();
    
    /**
     * Gets the "reference" element
     */
    java.lang.String getReference();
    
    /**
     * Gets (as xml) the "reference" element
     */
    au.gov.asic.types.fss.TransactionType.Reference xgetReference();
    
    /**
     * Sets the "reference" element
     */
    void setReference(java.lang.String reference);
    
    /**
     * Sets (as xml) the "reference" element
     */
    void xsetReference(au.gov.asic.types.fss.TransactionType.Reference reference);
    
    /**
     * Gets the "amount" element
     */
    java.math.BigDecimal getAmount();
    
    /**
     * Gets (as xml) the "amount" element
     */
    au.gov.asic.types.AmountType xgetAmount();
    
    /**
     * Sets the "amount" element
     */
    void setAmount(java.math.BigDecimal amount);
    
    /**
     * Sets (as xml) the "amount" element
     */
    void xsetAmount(au.gov.asic.types.AmountType amount);
    
    /**
     * An XML code(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$Code.
     */
    public interface Code extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("code3283elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.TransactionType.Code newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.TransactionType.Code) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.TransactionType.Code newInstance() {
              return (au.gov.asic.types.fss.TransactionType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.TransactionType.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.TransactionType.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML descriptionLine1(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$DescriptionLine1.
     */
    public interface DescriptionLine1 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptionLine1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("descriptionline1dab7elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.TransactionType.DescriptionLine1 newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.TransactionType.DescriptionLine1) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.TransactionType.DescriptionLine1 newInstance() {
              return (au.gov.asic.types.fss.TransactionType.DescriptionLine1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.TransactionType.DescriptionLine1 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.TransactionType.DescriptionLine1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML descriptionLine2(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$DescriptionLine2.
     */
    public interface DescriptionLine2 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptionLine2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("descriptionline29d38elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.TransactionType.DescriptionLine2 newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.TransactionType.DescriptionLine2) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.TransactionType.DescriptionLine2 newInstance() {
              return (au.gov.asic.types.fss.TransactionType.DescriptionLine2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.TransactionType.DescriptionLine2 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.TransactionType.DescriptionLine2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML reference(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$Reference.
     */
    public interface Reference extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("reference5cb1elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.TransactionType.Reference newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.TransactionType.Reference) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.TransactionType.Reference newInstance() {
              return (au.gov.asic.types.fss.TransactionType.Reference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.TransactionType.Reference newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.TransactionType.Reference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.TransactionType newInstance() {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.TransactionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.TransactionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.TransactionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.TransactionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.TransactionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.TransactionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
