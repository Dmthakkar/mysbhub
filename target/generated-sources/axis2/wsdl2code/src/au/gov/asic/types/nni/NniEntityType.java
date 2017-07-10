/*
 * XML Type:  nniEntityType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NniEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML nniEntityType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface NniEntityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NniEntityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nnientitytype166btype");
    
    /**
     * Gets the "businessEntity" element
     */
    au.gov.asic.types.abn.AbrEntityType getBusinessEntity();
    
    /**
     * True if has "businessEntity" element
     */
    boolean isSetBusinessEntity();
    
    /**
     * Sets the "businessEntity" element
     */
    void setBusinessEntity(au.gov.asic.types.abn.AbrEntityType businessEntity);
    
    /**
     * Appends and returns a new empty "businessEntity" element
     */
    au.gov.asic.types.abn.AbrEntityType addNewBusinessEntity();
    
    /**
     * Unsets the "businessEntity" element
     */
    void unsetBusinessEntity();
    
    /**
     * Gets the "identifier" element
     */
    au.gov.asic.types.nni.IdentifierType getIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(au.gov.asic.types.nni.IdentifierType identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    au.gov.asic.types.nni.IdentifierType addNewIdentifier();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    au.gov.asic.types.NniNameType xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(au.gov.asic.types.NniNameType name);
    
    /**
     * Gets the "type" element
     */
    au.gov.asic.types.nni.NniTypeType getType();
    
    /**
     * Sets the "type" element
     */
    void setType(au.gov.asic.types.nni.NniTypeType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    au.gov.asic.types.nni.NniTypeType addNewType();
    
    /**
     * Gets the "status" element
     */
    au.gov.asic.types.StatusType getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(au.gov.asic.types.StatusType status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    au.gov.asic.types.StatusType addNewStatus();
    
    /**
     * Gets the "previousStateTerritory" element
     */
    au.gov.asic.types.bn.PreviousStateTerritoryType getPreviousStateTerritory();
    
    /**
     * True if has "previousStateTerritory" element
     */
    boolean isSetPreviousStateTerritory();
    
    /**
     * Sets the "previousStateTerritory" element
     */
    void setPreviousStateTerritory(au.gov.asic.types.bn.PreviousStateTerritoryType previousStateTerritory);
    
    /**
     * Appends and returns a new empty "previousStateTerritory" element
     */
    au.gov.asic.types.bn.PreviousStateTerritoryType addNewPreviousStateTerritory();
    
    /**
     * Unsets the "previousStateTerritory" element
     */
    void unsetPreviousStateTerritory();
    
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
     * Gets the "dateReview" element
     */
    java.util.Calendar getDateReview();
    
    /**
     * Gets (as xml) the "dateReview" element
     */
    org.apache.xmlbeans.XmlDate xgetDateReview();
    
    /**
     * True if has "dateReview" element
     */
    boolean isSetDateReview();
    
    /**
     * Sets the "dateReview" element
     */
    void setDateReview(java.util.Calendar dateReview);
    
    /**
     * Sets (as xml) the "dateReview" element
     */
    void xsetDateReview(org.apache.xmlbeans.XmlDate dateReview);
    
    /**
     * Unsets the "dateReview" element
     */
    void unsetDateReview();
    
    /**
     * Gets the "jurisdiction" element
     */
    java.lang.String getJurisdiction();
    
    /**
     * Gets (as xml) the "jurisdiction" element
     */
    au.gov.asic.types.nni.NniEntityType.Jurisdiction xgetJurisdiction();
    
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
    void xsetJurisdiction(au.gov.asic.types.nni.NniEntityType.Jurisdiction jurisdiction);
    
    /**
     * Unsets the "jurisdiction" element
     */
    void unsetJurisdiction();
    
    /**
     * Gets the "registeredAddress" element
     */
    au.gov.asic.types.AddressType getRegisteredAddress();
    
    /**
     * True if has "registeredAddress" element
     */
    boolean isSetRegisteredAddress();
    
    /**
     * Sets the "registeredAddress" element
     */
    void setRegisteredAddress(au.gov.asic.types.AddressType registeredAddress);
    
    /**
     * Appends and returns a new empty "registeredAddress" element
     */
    au.gov.asic.types.AddressType addNewRegisteredAddress();
    
    /**
     * Unsets the "registeredAddress" element
     */
    void unsetRegisteredAddress();
    
    /**
     * Gets array of all "recentDocuments" elements
     */
    au.gov.asic.types.bn.DocumentType[] getRecentDocumentsArray();
    
    /**
     * Gets ith "recentDocuments" element
     */
    au.gov.asic.types.bn.DocumentType getRecentDocumentsArray(int i);
    
    /**
     * Returns number of "recentDocuments" element
     */
    int sizeOfRecentDocumentsArray();
    
    /**
     * Sets array of all "recentDocuments" element
     */
    void setRecentDocumentsArray(au.gov.asic.types.bn.DocumentType[] recentDocumentsArray);
    
    /**
     * Sets ith "recentDocuments" element
     */
    void setRecentDocumentsArray(int i, au.gov.asic.types.bn.DocumentType recentDocuments);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recentDocuments" element
     */
    au.gov.asic.types.bn.DocumentType insertNewRecentDocuments(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recentDocuments" element
     */
    au.gov.asic.types.bn.DocumentType addNewRecentDocuments();
    
    /**
     * Removes the ith "recentDocuments" element
     */
    void removeRecentDocuments(int i);
    
    /**
     * An XML jurisdiction(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.NniEntityType$Jurisdiction.
     */
    public interface Jurisdiction extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Jurisdiction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("jurisdiction2a48elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.NniEntityType.Jurisdiction newValue(java.lang.Object obj) {
              return (au.gov.asic.types.nni.NniEntityType.Jurisdiction) type.newValue( obj ); }
            
            public static au.gov.asic.types.nni.NniEntityType.Jurisdiction newInstance() {
              return (au.gov.asic.types.nni.NniEntityType.Jurisdiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.NniEntityType.Jurisdiction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.NniEntityType.Jurisdiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.NniEntityType newInstance() {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.NniEntityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.NniEntityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.NniEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.NniEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.NniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
