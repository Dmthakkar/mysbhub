/*
 * XML Type:  bnRenewalFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnRenewalFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML bnRenewalFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BnRenewalFormType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BnRenewalFormType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bnrenewalformtype560ctype");
    
    /**
     * Gets the "accountNumber" element
     */
    long getAccountNumber();
    
    /**
     * Gets (as xml) the "accountNumber" element
     */
    au.gov.asic.types.AccountNumberType xgetAccountNumber();
    
    /**
     * True if has "accountNumber" element
     */
    boolean isSetAccountNumber();
    
    /**
     * Sets the "accountNumber" element
     */
    void setAccountNumber(long accountNumber);
    
    /**
     * Sets (as xml) the "accountNumber" element
     */
    void xsetAccountNumber(au.gov.asic.types.AccountNumberType accountNumber);
    
    /**
     * Unsets the "accountNumber" element
     */
    void unsetAccountNumber();
    
    /**
     * Gets the "ABN" element
     */
    java.lang.String getABN();
    
    /**
     * Gets (as xml) the "ABN" element
     */
    au.gov.asic.types.AbnType xgetABN();
    
    /**
     * True if has "ABN" element
     */
    boolean isSetABN();
    
    /**
     * Sets the "ABN" element
     */
    void setABN(java.lang.String abn);
    
    /**
     * Sets (as xml) the "ABN" element
     */
    void xsetABN(au.gov.asic.types.AbnType abn);
    
    /**
     * Unsets the "ABN" element
     */
    void unsetABN();
    
    /**
     * Gets the "transactionId" element
     */
    java.lang.String getTransactionId();
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    au.gov.asic.types.TransactionIdType xgetTransactionId();
    
    /**
     * True if has "transactionId" element
     */
    boolean isSetTransactionId();
    
    /**
     * Sets the "transactionId" element
     */
    void setTransactionId(java.lang.String transactionId);
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    void xsetTransactionId(au.gov.asic.types.TransactionIdType transactionId);
    
    /**
     * Unsets the "transactionId" element
     */
    void unsetTransactionId();
    
    /**
     * Gets the "businessName" element
     */
    au.gov.asic.types.DistinguishedNameType getBusinessName();
    
    /**
     * Sets the "businessName" element
     */
    void setBusinessName(au.gov.asic.types.DistinguishedNameType businessName);
    
    /**
     * Appends and returns a new empty "businessName" element
     */
    au.gov.asic.types.DistinguishedNameType addNewBusinessName();
    
    /**
     * Gets the "term" element
     */
    au.gov.asic.types.bn.TermType.Enum getTerm();
    
    /**
     * Gets (as xml) the "term" element
     */
    au.gov.asic.types.bn.TermType xgetTerm();
    
    /**
     * Sets the "term" element
     */
    void setTerm(au.gov.asic.types.bn.TermType.Enum term);
    
    /**
     * Sets (as xml) the "term" element
     */
    void xsetTerm(au.gov.asic.types.bn.TermType term);
    
    /**
     * Gets the "paymentType" element
     */
    au.gov.asic.types.PaymentMethodType.Enum getPaymentType();
    
    /**
     * Gets (as xml) the "paymentType" element
     */
    au.gov.asic.types.PaymentMethodType xgetPaymentType();
    
    /**
     * Sets the "paymentType" element
     */
    void setPaymentType(au.gov.asic.types.PaymentMethodType.Enum paymentType);
    
    /**
     * Sets (as xml) the "paymentType" element
     */
    void xsetPaymentType(au.gov.asic.types.PaymentMethodType paymentType);
    
    /**
     * Gets the "emailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    au.gov.asic.types.EmailType xgetEmailAddress();
    
    /**
     * Tests for nil "emailAddress" element
     */
    boolean isNilEmailAddress();
    
    /**
     * Sets the "emailAddress" element
     */
    void setEmailAddress(java.lang.String emailAddress);
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    void xsetEmailAddress(au.gov.asic.types.EmailType emailAddress);
    
    /**
     * Nils the "emailAddress" element
     */
    void setNilEmailAddress();
    
    /**
     * Gets the "signatory" element
     */
    au.gov.asic.types.SignatoryType getSignatory();
    
    /**
     * Sets the "signatory" element
     */
    void setSignatory(au.gov.asic.types.SignatoryType signatory);
    
    /**
     * Appends and returns a new empty "signatory" element
     */
    au.gov.asic.types.SignatoryType addNewSignatory();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BnRenewalFormType newInstance() {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BnRenewalFormType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnRenewalFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnRenewalFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnRenewalFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
