/*
 * XML Type:  receiptType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.ReceiptType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML receiptType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ReceiptType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReceiptType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("receipttypeaad4type");
    
    /**
     * Gets the "debtor" element
     */
    au.gov.asic.types.fss.DebtorType getDebtor();
    
    /**
     * Sets the "debtor" element
     */
    void setDebtor(au.gov.asic.types.fss.DebtorType debtor);
    
    /**
     * Appends and returns a new empty "debtor" element
     */
    au.gov.asic.types.fss.DebtorType addNewDebtor();
    
    /**
     * Gets the "dateIssued" element
     */
    java.util.Calendar getDateIssued();
    
    /**
     * Gets (as xml) the "dateIssued" element
     */
    org.apache.xmlbeans.XmlDate xgetDateIssued();
    
    /**
     * Sets the "dateIssued" element
     */
    void setDateIssued(java.util.Calendar dateIssued);
    
    /**
     * Sets (as xml) the "dateIssued" element
     */
    void xsetDateIssued(org.apache.xmlbeans.XmlDate dateIssued);
    
    /**
     * Gets array of all "transaction" elements
     */
    au.gov.asic.types.fss.TransactionType[] getTransactionArray();
    
    /**
     * Gets ith "transaction" element
     */
    au.gov.asic.types.fss.TransactionType getTransactionArray(int i);
    
    /**
     * Returns number of "transaction" element
     */
    int sizeOfTransactionArray();
    
    /**
     * Sets array of all "transaction" element
     */
    void setTransactionArray(au.gov.asic.types.fss.TransactionType[] transactionArray);
    
    /**
     * Sets ith "transaction" element
     */
    void setTransactionArray(int i, au.gov.asic.types.fss.TransactionType transaction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transaction" element
     */
    au.gov.asic.types.fss.TransactionType insertNewTransaction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transaction" element
     */
    au.gov.asic.types.fss.TransactionType addNewTransaction();
    
    /**
     * Removes the ith "transaction" element
     */
    void removeTransaction(int i);
    
    /**
     * Gets the "total" element
     */
    java.math.BigDecimal getTotal();
    
    /**
     * Gets (as xml) the "total" element
     */
    au.gov.asic.types.AmountType xgetTotal();
    
    /**
     * Sets the "total" element
     */
    void setTotal(java.math.BigDecimal total);
    
    /**
     * Sets (as xml) the "total" element
     */
    void xsetTotal(au.gov.asic.types.AmountType total);
    
    /**
     * Gets the "totalDue" element
     */
    java.math.BigDecimal getTotalDue();
    
    /**
     * Gets (as xml) the "totalDue" element
     */
    au.gov.asic.types.AmountType xgetTotalDue();
    
    /**
     * Sets the "totalDue" element
     */
    void setTotalDue(java.math.BigDecimal totalDue);
    
    /**
     * Sets (as xml) the "totalDue" element
     */
    void xsetTotalDue(au.gov.asic.types.AmountType totalDue);
    
    /**
     * Gets the "dateDue" element
     */
    java.util.Calendar getDateDue();
    
    /**
     * Gets (as xml) the "dateDue" element
     */
    org.apache.xmlbeans.XmlDate xgetDateDue();
    
    /**
     * True if has "dateDue" element
     */
    boolean isSetDateDue();
    
    /**
     * Sets the "dateDue" element
     */
    void setDateDue(java.util.Calendar dateDue);
    
    /**
     * Sets (as xml) the "dateDue" element
     */
    void xsetDateDue(org.apache.xmlbeans.XmlDate dateDue);
    
    /**
     * Unsets the "dateDue" element
     */
    void unsetDateDue();
    
    /**
     * Gets the "asicPaymentDetails" element
     */
    au.gov.asic.types.fss.AsicPaymentDetailsType getAsicPaymentDetails();
    
    /**
     * True if has "asicPaymentDetails" element
     */
    boolean isSetAsicPaymentDetails();
    
    /**
     * Sets the "asicPaymentDetails" element
     */
    void setAsicPaymentDetails(au.gov.asic.types.fss.AsicPaymentDetailsType asicPaymentDetails);
    
    /**
     * Appends and returns a new empty "asicPaymentDetails" element
     */
    au.gov.asic.types.fss.AsicPaymentDetailsType addNewAsicPaymentDetails();
    
    /**
     * Unsets the "asicPaymentDetails" element
     */
    void unsetAsicPaymentDetails();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.ReceiptType newInstance() {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.ReceiptType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.ReceiptType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.ReceiptType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.ReceiptType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.ReceiptType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.ReceiptType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
