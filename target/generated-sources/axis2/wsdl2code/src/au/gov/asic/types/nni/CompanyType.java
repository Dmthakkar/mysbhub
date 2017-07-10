/*
 * XML Type:  companyType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.CompanyType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML companyType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface CompanyType extends au.gov.asic.types.nni.NameIndexEntityType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("companytype98fctype");
    
    /**
     * Gets the "officeholders" element
     */
    au.gov.asic.types.nni.CompanyType.Officeholders getOfficeholders();
    
    /**
     * True if has "officeholders" element
     */
    boolean isSetOfficeholders();
    
    /**
     * Sets the "officeholders" element
     */
    void setOfficeholders(au.gov.asic.types.nni.CompanyType.Officeholders officeholders);
    
    /**
     * Appends and returns a new empty "officeholders" element
     */
    au.gov.asic.types.nni.CompanyType.Officeholders addNewOfficeholders();
    
    /**
     * Unsets the "officeholders" element
     */
    void unsetOfficeholders();
    
    /**
     * Gets the "shareholders" element
     */
    au.gov.asic.types.nni.CompanyType.Shareholders getShareholders();
    
    /**
     * True if has "shareholders" element
     */
    boolean isSetShareholders();
    
    /**
     * Sets the "shareholders" element
     */
    void setShareholders(au.gov.asic.types.nni.CompanyType.Shareholders shareholders);
    
    /**
     * Appends and returns a new empty "shareholders" element
     */
    au.gov.asic.types.nni.CompanyType.Shareholders addNewShareholders();
    
    /**
     * Unsets the "shareholders" element
     */
    void unsetShareholders();
    
    /**
     * Gets array of all "businessNames" elements
     */
    au.gov.asic.types.bn.OutboundBusinessNameType[] getBusinessNamesArray();
    
    /**
     * Gets ith "businessNames" element
     */
    au.gov.asic.types.bn.OutboundBusinessNameType getBusinessNamesArray(int i);
    
    /**
     * Returns number of "businessNames" element
     */
    int sizeOfBusinessNamesArray();
    
    /**
     * Sets array of all "businessNames" element
     */
    void setBusinessNamesArray(au.gov.asic.types.bn.OutboundBusinessNameType[] businessNamesArray);
    
    /**
     * Sets ith "businessNames" element
     */
    void setBusinessNamesArray(int i, au.gov.asic.types.bn.OutboundBusinessNameType businessNames);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "businessNames" element
     */
    au.gov.asic.types.bn.OutboundBusinessNameType insertNewBusinessNames(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "businessNames" element
     */
    au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessNames();
    
    /**
     * Removes the ith "businessNames" element
     */
    void removeBusinessNames(int i);
    
    /**
     * An XML officeholders(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Officeholders extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Officeholders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("officeholders2273elemtype");
        
        /**
         * Gets array of all "officeholder" elements
         */
        au.gov.asic.types.nni.OfficeholderType[] getOfficeholderArray();
        
        /**
         * Gets ith "officeholder" element
         */
        au.gov.asic.types.nni.OfficeholderType getOfficeholderArray(int i);
        
        /**
         * Returns number of "officeholder" element
         */
        int sizeOfOfficeholderArray();
        
        /**
         * Sets array of all "officeholder" element
         */
        void setOfficeholderArray(au.gov.asic.types.nni.OfficeholderType[] officeholderArray);
        
        /**
         * Sets ith "officeholder" element
         */
        void setOfficeholderArray(int i, au.gov.asic.types.nni.OfficeholderType officeholder);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "officeholder" element
         */
        au.gov.asic.types.nni.OfficeholderType insertNewOfficeholder(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "officeholder" element
         */
        au.gov.asic.types.nni.OfficeholderType addNewOfficeholder();
        
        /**
         * Removes the ith "officeholder" element
         */
        void removeOfficeholder(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.CompanyType.Officeholders newInstance() {
              return (au.gov.asic.types.nni.CompanyType.Officeholders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.CompanyType.Officeholders newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.CompanyType.Officeholders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML shareholders(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Shareholders extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Shareholders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("shareholders5920elemtype");
        
        /**
         * Gets array of all "shareholder" elements
         */
        au.gov.asic.types.nni.ShareholderType[] getShareholderArray();
        
        /**
         * Gets ith "shareholder" element
         */
        au.gov.asic.types.nni.ShareholderType getShareholderArray(int i);
        
        /**
         * Returns number of "shareholder" element
         */
        int sizeOfShareholderArray();
        
        /**
         * Sets array of all "shareholder" element
         */
        void setShareholderArray(au.gov.asic.types.nni.ShareholderType[] shareholderArray);
        
        /**
         * Sets ith "shareholder" element
         */
        void setShareholderArray(int i, au.gov.asic.types.nni.ShareholderType shareholder);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shareholder" element
         */
        au.gov.asic.types.nni.ShareholderType insertNewShareholder(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shareholder" element
         */
        au.gov.asic.types.nni.ShareholderType addNewShareholder();
        
        /**
         * Removes the ith "shareholder" element
         */
        void removeShareholder(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.CompanyType.Shareholders newInstance() {
              return (au.gov.asic.types.nni.CompanyType.Shareholders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.CompanyType.Shareholders newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.CompanyType.Shareholders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.CompanyType newInstance() {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.CompanyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.CompanyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.CompanyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.CompanyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.CompanyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
