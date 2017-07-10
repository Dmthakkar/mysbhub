/*
 * XML Type:  baseNniEntityType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.BaseNniEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML baseNniEntityType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BaseNniEntityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseNniEntityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("basennientitytype7adatype");
    
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
     * Gets the "class" element
     */
    au.gov.asic.types.nni.ClassType getClass1();
    
    /**
     * True if has "class" element
     */
    boolean isSetClass1();
    
    /**
     * Sets the "class" element
     */
    void setClass1(au.gov.asic.types.nni.ClassType class1);
    
    /**
     * Appends and returns a new empty "class" element
     */
    au.gov.asic.types.nni.ClassType addNewClass1();
    
    /**
     * Unsets the "class" element
     */
    void unsetClass1();
    
    /**
     * Gets the "subClass" element
     */
    au.gov.asic.types.nni.ClassType getSubClass();
    
    /**
     * True if has "subClass" element
     */
    boolean isSetSubClass();
    
    /**
     * Sets the "subClass" element
     */
    void setSubClass(au.gov.asic.types.nni.ClassType subClass);
    
    /**
     * Appends and returns a new empty "subClass" element
     */
    au.gov.asic.types.nni.ClassType addNewSubClass();
    
    /**
     * Unsets the "subClass" element
     */
    void unsetSubClass();
    
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
     * Gets the "incorporationState" element
     */
    au.gov.asic.types.StateTerritoryCodeType.Enum getIncorporationState();
    
    /**
     * Gets (as xml) the "incorporationState" element
     */
    au.gov.asic.types.StateTerritoryCodeType xgetIncorporationState();
    
    /**
     * True if has "incorporationState" element
     */
    boolean isSetIncorporationState();
    
    /**
     * Sets the "incorporationState" element
     */
    void setIncorporationState(au.gov.asic.types.StateTerritoryCodeType.Enum incorporationState);
    
    /**
     * Sets (as xml) the "incorporationState" element
     */
    void xsetIncorporationState(au.gov.asic.types.StateTerritoryCodeType incorporationState);
    
    /**
     * Unsets the "incorporationState" element
     */
    void unsetIncorporationState();
    
    /**
     * Gets the "placeOfIncorporation" element
     */
    java.lang.String getPlaceOfIncorporation();
    
    /**
     * Gets (as xml) the "placeOfIncorporation" element
     */
    au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation xgetPlaceOfIncorporation();
    
    /**
     * True if has "placeOfIncorporation" element
     */
    boolean isSetPlaceOfIncorporation();
    
    /**
     * Sets the "placeOfIncorporation" element
     */
    void setPlaceOfIncorporation(java.lang.String placeOfIncorporation);
    
    /**
     * Sets (as xml) the "placeOfIncorporation" element
     */
    void xsetPlaceOfIncorporation(au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation placeOfIncorporation);
    
    /**
     * Unsets the "placeOfIncorporation" element
     */
    void unsetPlaceOfIncorporation();
    
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
    au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction xgetJurisdiction();
    
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
    void xsetJurisdiction(au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction jurisdiction);
    
    /**
     * Unsets the "jurisdiction" element
     */
    void unsetJurisdiction();
    
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
     * Gets array of all "formerName" elements
     */
    au.gov.asic.types.nni.BaseNniEntityType.FormerName[] getFormerNameArray();
    
    /**
     * Gets ith "formerName" element
     */
    au.gov.asic.types.nni.BaseNniEntityType.FormerName getFormerNameArray(int i);
    
    /**
     * Returns number of "formerName" element
     */
    int sizeOfFormerNameArray();
    
    /**
     * Sets array of all "formerName" element
     */
    void setFormerNameArray(au.gov.asic.types.nni.BaseNniEntityType.FormerName[] formerNameArray);
    
    /**
     * Sets ith "formerName" element
     */
    void setFormerNameArray(int i, au.gov.asic.types.nni.BaseNniEntityType.FormerName formerName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formerName" element
     */
    au.gov.asic.types.nni.BaseNniEntityType.FormerName insertNewFormerName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formerName" element
     */
    au.gov.asic.types.nni.BaseNniEntityType.FormerName addNewFormerName();
    
    /**
     * Removes the ith "formerName" element
     */
    void removeFormerName(int i);
    
    /**
     * Gets array of all "recentDocument" elements
     */
    au.gov.asic.types.bn.DocumentType[] getRecentDocumentArray();
    
    /**
     * Gets ith "recentDocument" element
     */
    au.gov.asic.types.bn.DocumentType getRecentDocumentArray(int i);
    
    /**
     * Returns number of "recentDocument" element
     */
    int sizeOfRecentDocumentArray();
    
    /**
     * Sets array of all "recentDocument" element
     */
    void setRecentDocumentArray(au.gov.asic.types.bn.DocumentType[] recentDocumentArray);
    
    /**
     * Sets ith "recentDocument" element
     */
    void setRecentDocumentArray(int i, au.gov.asic.types.bn.DocumentType recentDocument);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recentDocument" element
     */
    au.gov.asic.types.bn.DocumentType insertNewRecentDocument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recentDocument" element
     */
    au.gov.asic.types.bn.DocumentType addNewRecentDocument();
    
    /**
     * Removes the ith "recentDocument" element
     */
    void removeRecentDocument(int i);
    
    /**
     * An XML placeOfIncorporation(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.BaseNniEntityType$PlaceOfIncorporation.
     */
    public interface PlaceOfIncorporation extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlaceOfIncorporation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("placeofincorporation1edbelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation newValue(java.lang.Object obj) {
              return (au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation) type.newValue( obj ); }
            
            public static au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation newInstance() {
              return (au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML jurisdiction(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.BaseNniEntityType$Jurisdiction.
     */
    public interface Jurisdiction extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Jurisdiction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("jurisdiction5837elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction newValue(java.lang.Object obj) {
              return (au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction) type.newValue( obj ); }
            
            public static au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction newInstance() {
              return (au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML formerName(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface FormerName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormerName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("formername8a12elemtype");
        
        /**
         * Gets the "organisationName" element
         */
        java.lang.String getOrganisationName();
        
        /**
         * Gets (as xml) the "organisationName" element
         */
        au.gov.asic.types.NniNameType xgetOrganisationName();
        
        /**
         * Sets the "organisationName" element
         */
        void setOrganisationName(java.lang.String organisationName);
        
        /**
         * Sets (as xml) the "organisationName" element
         */
        void xsetOrganisationName(au.gov.asic.types.NniNameType organisationName);
        
        /**
         * Gets the "startDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "startDate" element
         */
        org.apache.xmlbeans.XmlDate xgetStartDate();
        
        /**
         * True if has "startDate" element
         */
        boolean isSetStartDate();
        
        /**
         * Sets the "startDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "startDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
        
        /**
         * Unsets the "startDate" element
         */
        void unsetStartDate();
        
        /**
         * Gets the "endDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "endDate" element
         */
        org.apache.xmlbeans.XmlDate xgetEndDate();
        
        /**
         * True if has "endDate" element
         */
        boolean isSetEndDate();
        
        /**
         * Sets the "endDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "endDate" element
         */
        void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
        
        /**
         * Unsets the "endDate" element
         */
        void unsetEndDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.BaseNniEntityType.FormerName newInstance() {
              return (au.gov.asic.types.nni.BaseNniEntityType.FormerName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.BaseNniEntityType.FormerName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.BaseNniEntityType.FormerName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.BaseNniEntityType newInstance() {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.BaseNniEntityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.BaseNniEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.BaseNniEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.BaseNniEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
