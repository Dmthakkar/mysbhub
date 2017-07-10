/*
 * XML Type:  bnLodgeFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnLodgeFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML bnLodgeFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BnLodgeFormType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BnLodgeFormType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bnlodgeformtype63c5type");
    
    /**
     * Gets the "name" element
     */
    au.gov.asic.types.DistinguishedNameType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(au.gov.asic.types.DistinguishedNameType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    au.gov.asic.types.DistinguishedNameType addNewName();
    
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
     * Gets the "dateRenewal" element
     */
    java.util.Calendar getDateRenewal();
    
    /**
     * Gets (as xml) the "dateRenewal" element
     */
    org.apache.xmlbeans.XmlDate xgetDateRenewal();
    
    /**
     * True if has "dateRenewal" element
     */
    boolean isSetDateRenewal();
    
    /**
     * Sets the "dateRenewal" element
     */
    void setDateRenewal(java.util.Calendar dateRenewal);
    
    /**
     * Sets (as xml) the "dateRenewal" element
     */
    void xsetDateRenewal(org.apache.xmlbeans.XmlDate dateRenewal);
    
    /**
     * Unsets the "dateRenewal" element
     */
    void unsetDateRenewal();
    
    /**
     * Gets array of all "address" elements
     */
    au.gov.asic.types.AddressLodgeType[] getAddressArray();
    
    /**
     * Gets ith "address" element
     */
    au.gov.asic.types.AddressLodgeType getAddressArray(int i);
    
    /**
     * Returns number of "address" element
     */
    int sizeOfAddressArray();
    
    /**
     * Sets array of all "address" element
     */
    void setAddressArray(au.gov.asic.types.AddressLodgeType[] addressArray);
    
    /**
     * Sets ith "address" element
     */
    void setAddressArray(int i, au.gov.asic.types.AddressLodgeType address);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    au.gov.asic.types.AddressLodgeType insertNewAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    au.gov.asic.types.AddressLodgeType addNewAddress();
    
    /**
     * Removes the ith "address" element
     */
    void removeAddress(int i);
    
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
     * Gets the "smsNumber" element
     */
    java.lang.String getSmsNumber();
    
    /**
     * Gets (as xml) the "smsNumber" element
     */
    org.apache.xmlbeans.XmlString xgetSmsNumber();
    
    /**
     * Tests for nil "smsNumber" element
     */
    boolean isNilSmsNumber();
    
    /**
     * True if has "smsNumber" element
     */
    boolean isSetSmsNumber();
    
    /**
     * Sets the "smsNumber" element
     */
    void setSmsNumber(java.lang.String smsNumber);
    
    /**
     * Sets (as xml) the "smsNumber" element
     */
    void xsetSmsNumber(org.apache.xmlbeans.XmlString smsNumber);
    
    /**
     * Nils the "smsNumber" element
     */
    void setNilSmsNumber();
    
    /**
     * Unsets the "smsNumber" element
     */
    void unsetSmsNumber();
    
    /**
     * Gets the "businessEntity" element
     */
    au.gov.asic.types.bn.BusinessEntityLodgeType getBusinessEntity();
    
    /**
     * True if has "businessEntity" element
     */
    boolean isSetBusinessEntity();
    
    /**
     * Sets the "businessEntity" element
     */
    void setBusinessEntity(au.gov.asic.types.bn.BusinessEntityLodgeType businessEntity);
    
    /**
     * Appends and returns a new empty "businessEntity" element
     */
    au.gov.asic.types.bn.BusinessEntityLodgeType addNewBusinessEntity();
    
    /**
     * Unsets the "businessEntity" element
     */
    void unsetBusinessEntity();
    
    /**
     * Gets the "transferKey" element
     */
    java.lang.String getTransferKey();
    
    /**
     * Gets (as xml) the "transferKey" element
     */
    org.apache.xmlbeans.XmlString xgetTransferKey();
    
    /**
     * True if has "transferKey" element
     */
    boolean isSetTransferKey();
    
    /**
     * Sets the "transferKey" element
     */
    void setTransferKey(java.lang.String transferKey);
    
    /**
     * Sets (as xml) the "transferKey" element
     */
    void xsetTransferKey(org.apache.xmlbeans.XmlString transferKey);
    
    /**
     * Unsets the "transferKey" element
     */
    void unsetTransferKey();
    
    /**
     * Gets the "contact" element
     */
    au.gov.asic.types.bn.ContactPersonType getContact();
    
    /**
     * True if has "contact" element
     */
    boolean isSetContact();
    
    /**
     * Sets the "contact" element
     */
    void setContact(au.gov.asic.types.bn.ContactPersonType contact);
    
    /**
     * Appends and returns a new empty "contact" element
     */
    au.gov.asic.types.bn.ContactPersonType addNewContact();
    
    /**
     * Unsets the "contact" element
     */
    void unsetContact();
    
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
        public static au.gov.asic.types.bn.BnLodgeFormType newInstance() {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BnLodgeFormType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnLodgeFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnLodgeFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnLodgeFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
