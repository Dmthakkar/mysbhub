/*
 * XML Type:  bnUpdateFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnUpdateFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML bnUpdateFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BnUpdateFormType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BnUpdateFormType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bnupdateformtype5511type");
    
    /**
     * Gets the "number" element
     */
    au.gov.asic.types.bn.BnIdentifier getNumber();
    
    /**
     * Sets the "number" element
     */
    void setNumber(au.gov.asic.types.bn.BnIdentifier number);
    
    /**
     * Appends and returns a new empty "number" element
     */
    au.gov.asic.types.bn.BnIdentifier addNewNumber();
    
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
     * True if has "term" element
     */
    boolean isSetTerm();
    
    /**
     * Sets the "term" element
     */
    void setTerm(au.gov.asic.types.bn.TermType.Enum term);
    
    /**
     * Sets (as xml) the "term" element
     */
    void xsetTerm(au.gov.asic.types.bn.TermType term);
    
    /**
     * Unsets the "term" element
     */
    void unsetTerm();
    
    /**
     * Gets the "dateRegistered" element
     */
    java.util.Calendar getDateRegistered();
    
    /**
     * Gets (as xml) the "dateRegistered" element
     */
    org.apache.xmlbeans.XmlDate xgetDateRegistered();
    
    /**
     * True if has "dateRegistered" element
     */
    boolean isSetDateRegistered();
    
    /**
     * Sets the "dateRegistered" element
     */
    void setDateRegistered(java.util.Calendar dateRegistered);
    
    /**
     * Sets (as xml) the "dateRegistered" element
     */
    void xsetDateRegistered(org.apache.xmlbeans.XmlDate dateRegistered);
    
    /**
     * Unsets the "dateRegistered" element
     */
    void unsetDateRegistered();
    
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
    au.gov.asic.types.AddressType[] getAddressArray();
    
    /**
     * Gets ith "address" element
     */
    au.gov.asic.types.AddressType getAddressArray(int i);
    
    /**
     * Returns number of "address" element
     */
    int sizeOfAddressArray();
    
    /**
     * Sets array of all "address" element
     */
    void setAddressArray(au.gov.asic.types.AddressType[] addressArray);
    
    /**
     * Sets ith "address" element
     */
    void setAddressArray(int i, au.gov.asic.types.AddressType address);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    au.gov.asic.types.AddressType insertNewAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    au.gov.asic.types.AddressType addNewAddress();
    
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
     * True if has "emailAddress" element
     */
    boolean isSetEmailAddress();
    
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
     * Unsets the "emailAddress" element
     */
    void unsetEmailAddress();
    
    /**
     * Gets the "smsNumber" element
     */
    java.lang.String getSmsNumber();
    
    /**
     * Gets (as xml) the "smsNumber" element
     */
    au.gov.asic.types.bn.BnUpdateFormType.SmsNumber xgetSmsNumber();
    
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
    void xsetSmsNumber(au.gov.asic.types.bn.BnUpdateFormType.SmsNumber smsNumber);
    
    /**
     * Nils the "smsNumber" element
     */
    void setNilSmsNumber();
    
    /**
     * Unsets the "smsNumber" element
     */
    void unsetSmsNumber();
    
    /**
     * Gets array of all "representative" elements
     */
    au.gov.asic.types.bn.RepresentativeType[] getRepresentativeArray();
    
    /**
     * Gets ith "representative" element
     */
    au.gov.asic.types.bn.RepresentativeType getRepresentativeArray(int i);
    
    /**
     * Returns number of "representative" element
     */
    int sizeOfRepresentativeArray();
    
    /**
     * Sets array of all "representative" element
     */
    void setRepresentativeArray(au.gov.asic.types.bn.RepresentativeType[] representativeArray);
    
    /**
     * Sets ith "representative" element
     */
    void setRepresentativeArray(int i, au.gov.asic.types.bn.RepresentativeType representative);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representative" element
     */
    au.gov.asic.types.bn.RepresentativeType insertNewRepresentative(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representative" element
     */
    au.gov.asic.types.bn.RepresentativeType addNewRepresentative();
    
    /**
     * Removes the ith "representative" element
     */
    void removeRepresentative(int i);
    
    /**
     * Gets the "businessEntity" element
     */
    au.gov.asic.types.bn.BusinessEntityType getBusinessEntity();
    
    /**
     * True if has "businessEntity" element
     */
    boolean isSetBusinessEntity();
    
    /**
     * Sets the "businessEntity" element
     */
    void setBusinessEntity(au.gov.asic.types.bn.BusinessEntityType businessEntity);
    
    /**
     * Appends and returns a new empty "businessEntity" element
     */
    au.gov.asic.types.bn.BusinessEntityType addNewBusinessEntity();
    
    /**
     * Unsets the "businessEntity" element
     */
    void unsetBusinessEntity();
    
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
     * An XML smsNumber(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnUpdateFormType$SmsNumber.
     */
    public interface SmsNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SmsNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("smsnumber687felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.BnUpdateFormType.SmsNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.BnUpdateFormType.SmsNumber newInstance() {
              return (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BnUpdateFormType.SmsNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BnUpdateFormType.SmsNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BnUpdateFormType newInstance() {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BnUpdateFormType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnUpdateFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnUpdateFormType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnUpdateFormType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
