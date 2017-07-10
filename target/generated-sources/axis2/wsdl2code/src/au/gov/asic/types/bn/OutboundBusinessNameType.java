/*
 * XML Type:  outboundBusinessNameType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.OutboundBusinessNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML outboundBusinessNameType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface OutboundBusinessNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutboundBusinessNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("outboundbusinessnametypef26ftype");
    
    /**
     * Gets the "nniNumber" element
     */
    java.lang.String getNniNumber();
    
    /**
     * Gets (as xml) the "nniNumber" element
     */
    org.apache.xmlbeans.XmlString xgetNniNumber();
    
    /**
     * Sets the "nniNumber" element
     */
    void setNniNumber(java.lang.String nniNumber);
    
    /**
     * Sets (as xml) the "nniNumber" element
     */
    void xsetNniNumber(org.apache.xmlbeans.XmlString nniNumber);
    
    /**
     * Gets the "bnReferenceNumber" element
     */
    java.lang.String getBnReferenceNumber();
    
    /**
     * Gets (as xml) the "bnReferenceNumber" element
     */
    au.gov.asic.types.BnReferenceNumberType xgetBnReferenceNumber();
    
    /**
     * True if has "bnReferenceNumber" element
     */
    boolean isSetBnReferenceNumber();
    
    /**
     * Sets the "bnReferenceNumber" element
     */
    void setBnReferenceNumber(java.lang.String bnReferenceNumber);
    
    /**
     * Sets (as xml) the "bnReferenceNumber" element
     */
    void xsetBnReferenceNumber(au.gov.asic.types.BnReferenceNumberType bnReferenceNumber);
    
    /**
     * Unsets the "bnReferenceNumber" element
     */
    void unsetBnReferenceNumber();
    
    /**
     * Gets the "name" element
     */
    au.gov.asic.types.DistinguishedNameExtType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(au.gov.asic.types.DistinguishedNameExtType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    au.gov.asic.types.DistinguishedNameExtType addNewName();
    
    /**
     * Gets array of all "status" elements
     */
    au.gov.asic.types.IntervalStatusType[] getStatusArray();
    
    /**
     * Gets ith "status" element
     */
    au.gov.asic.types.IntervalStatusType getStatusArray(int i);
    
    /**
     * Returns number of "status" element
     */
    int sizeOfStatusArray();
    
    /**
     * Sets array of all "status" element
     */
    void setStatusArray(au.gov.asic.types.IntervalStatusType[] statusArray);
    
    /**
     * Sets ith "status" element
     */
    void setStatusArray(int i, au.gov.asic.types.IntervalStatusType status);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "status" element
     */
    au.gov.asic.types.IntervalStatusType insertNewStatus(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "status" element
     */
    au.gov.asic.types.IntervalStatusType addNewStatus();
    
    /**
     * Removes the ith "status" element
     */
    void removeStatus(int i);
    
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
     * Gets the "previousStateOrTerritory" element
     */
    au.gov.asic.types.bn.PreviousStateTerritoryType getPreviousStateOrTerritory();
    
    /**
     * True if has "previousStateOrTerritory" element
     */
    boolean isSetPreviousStateOrTerritory();
    
    /**
     * Sets the "previousStateOrTerritory" element
     */
    void setPreviousStateOrTerritory(au.gov.asic.types.bn.PreviousStateTerritoryType previousStateOrTerritory);
    
    /**
     * Appends and returns a new empty "previousStateOrTerritory" element
     */
    au.gov.asic.types.bn.PreviousStateTerritoryType addNewPreviousStateOrTerritory();
    
    /**
     * Unsets the "previousStateOrTerritory" element
     */
    void unsetPreviousStateOrTerritory();
    
    /**
     * Gets the "jurisdiction" element
     */
    java.lang.String getJurisdiction();
    
    /**
     * Gets (as xml) the "jurisdiction" element
     */
    au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction xgetJurisdiction();
    
    /**
     * True if has "jurisdiction" element
     */
    boolean isSetJurisdiction();
    
    /**
     * Sets the "jurisdiction" element
     */
    void setJurisdiction(java.lang.String jurisdiction);
    
    /**
     * Sets (as xml) the "jurisdiction" element
     */
    void xsetJurisdiction(au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction jurisdiction);
    
    /**
     * Unsets the "jurisdiction" element
     */
    void unsetJurisdiction();
    
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
     * Gets the "dateDeregistered" element
     */
    java.util.Calendar getDateDeregistered();
    
    /**
     * Gets (as xml) the "dateDeregistered" element
     */
    org.apache.xmlbeans.XmlDate xgetDateDeregistered();
    
    /**
     * True if has "dateDeregistered" element
     */
    boolean isSetDateDeregistered();
    
    /**
     * Sets the "dateDeregistered" element
     */
    void setDateDeregistered(java.util.Calendar dateDeregistered);
    
    /**
     * Sets (as xml) the "dateDeregistered" element
     */
    void xsetDateDeregistered(org.apache.xmlbeans.XmlDate dateDeregistered);
    
    /**
     * Unsets the "dateDeregistered" element
     */
    void unsetDateDeregistered();
    
    /**
     * Gets array of all "address" elements
     */
    au.gov.asic.types.AddressExtType[] getAddressArray();
    
    /**
     * Gets ith "address" element
     */
    au.gov.asic.types.AddressExtType getAddressArray(int i);
    
    /**
     * Returns number of "address" element
     */
    int sizeOfAddressArray();
    
    /**
     * Sets array of all "address" element
     */
    void setAddressArray(au.gov.asic.types.AddressExtType[] addressArray);
    
    /**
     * Sets ith "address" element
     */
    void setAddressArray(int i, au.gov.asic.types.AddressExtType address);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    au.gov.asic.types.AddressExtType insertNewAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    au.gov.asic.types.AddressExtType addNewAddress();
    
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
    au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber xgetSmsNumber();
    
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
    void xsetSmsNumber(au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber smsNumber);
    
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
     * An XML jurisdiction(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.OutboundBusinessNameType$Jurisdiction.
     */
    public interface Jurisdiction extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Jurisdiction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("jurisdiction960celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction newInstance() {
              return (au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML smsNumber(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.OutboundBusinessNameType$SmsNumber.
     */
    public interface SmsNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SmsNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("smsnumberb7ddelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber newInstance() {
              return (au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.OutboundBusinessNameType newInstance() {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.OutboundBusinessNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.OutboundBusinessNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
