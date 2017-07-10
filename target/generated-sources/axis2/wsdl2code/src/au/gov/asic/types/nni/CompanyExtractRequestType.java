/*
 * XML Type:  companyExtractRequestType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.CompanyExtractRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML companyExtractRequestType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface CompanyExtractRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompanyExtractRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("companyextractrequesttypea06atype");
    
    /**
     * Gets the "abn" element
     */
    java.lang.String getAbn();
    
    /**
     * Gets (as xml) the "abn" element
     */
    au.gov.asic.types.AbnType xgetAbn();
    
    /**
     * True if has "abn" element
     */
    boolean isSetAbn();
    
    /**
     * Sets the "abn" element
     */
    void setAbn(java.lang.String abn);
    
    /**
     * Sets (as xml) the "abn" element
     */
    void xsetAbn(au.gov.asic.types.AbnType abn);
    
    /**
     * Unsets the "abn" element
     */
    void unsetAbn();
    
    /**
     * Gets the "acn" element
     */
    int getAcn();
    
    /**
     * Gets (as xml) the "acn" element
     */
    au.gov.asic.types.NniNumberType xgetAcn();
    
    /**
     * True if has "acn" element
     */
    boolean isSetAcn();
    
    /**
     * Sets the "acn" element
     */
    void setAcn(int acn);
    
    /**
     * Sets (as xml) the "acn" element
     */
    void xsetAcn(au.gov.asic.types.NniNumberType acn);
    
    /**
     * Unsets the "acn" element
     */
    void unsetAcn();
    
    /**
     * Gets the "company" element
     */
    au.gov.asic.types.nni.CompanyExtractRequestType.Company getCompany();
    
    /**
     * True if has "company" element
     */
    boolean isSetCompany();
    
    /**
     * Sets the "company" element
     */
    void setCompany(au.gov.asic.types.nni.CompanyExtractRequestType.Company company);
    
    /**
     * Appends and returns a new empty "company" element
     */
    au.gov.asic.types.nni.CompanyExtractRequestType.Company addNewCompany();
    
    /**
     * Unsets the "company" element
     */
    void unsetCompany();
    
    /**
     * Gets the "formerNames" element
     */
    boolean getFormerNames();
    
    /**
     * Gets (as xml) the "formerNames" element
     */
    au.gov.asic.types.TrueType xgetFormerNames();
    
    /**
     * True if has "formerNames" element
     */
    boolean isSetFormerNames();
    
    /**
     * Sets the "formerNames" element
     */
    void setFormerNames(boolean formerNames);
    
    /**
     * Sets (as xml) the "formerNames" element
     */
    void xsetFormerNames(au.gov.asic.types.TrueType formerNames);
    
    /**
     * Unsets the "formerNames" element
     */
    void unsetFormerNames();
    
    /**
     * Gets the "businessNames" element
     */
    boolean getBusinessNames();
    
    /**
     * Gets (as xml) the "businessNames" element
     */
    au.gov.asic.types.TrueType xgetBusinessNames();
    
    /**
     * True if has "businessNames" element
     */
    boolean isSetBusinessNames();
    
    /**
     * Sets the "businessNames" element
     */
    void setBusinessNames(boolean businessNames);
    
    /**
     * Sets (as xml) the "businessNames" element
     */
    void xsetBusinessNames(au.gov.asic.types.TrueType businessNames);
    
    /**
     * Unsets the "businessNames" element
     */
    void unsetBusinessNames();
    
    /**
     * Gets the "document" element
     */
    au.gov.asic.types.nni.CompanyExtractRequestType.Document getDocument();
    
    /**
     * True if has "document" element
     */
    boolean isSetDocument();
    
    /**
     * Sets the "document" element
     */
    void setDocument(au.gov.asic.types.nni.CompanyExtractRequestType.Document document);
    
    /**
     * Appends and returns a new empty "document" element
     */
    au.gov.asic.types.nni.CompanyExtractRequestType.Document addNewDocument();
    
    /**
     * Unsets the "document" element
     */
    void unsetDocument();
    
    /**
     * An XML company(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Company extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Company.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("company1093elemtype");
        
        /**
         * Gets the "registeredOffice" element
         */
        boolean getRegisteredOffice();
        
        /**
         * Gets (as xml) the "registeredOffice" element
         */
        au.gov.asic.types.TrueType xgetRegisteredOffice();
        
        /**
         * True if has "registeredOffice" element
         */
        boolean isSetRegisteredOffice();
        
        /**
         * Sets the "registeredOffice" element
         */
        void setRegisteredOffice(boolean registeredOffice);
        
        /**
         * Sets (as xml) the "registeredOffice" element
         */
        void xsetRegisteredOffice(au.gov.asic.types.TrueType registeredOffice);
        
        /**
         * Unsets the "registeredOffice" element
         */
        void unsetRegisteredOffice();
        
        /**
         * Gets the "principalPlaceOfBusiness" element
         */
        boolean getPrincipalPlaceOfBusiness();
        
        /**
         * Gets (as xml) the "principalPlaceOfBusiness" element
         */
        au.gov.asic.types.TrueType xgetPrincipalPlaceOfBusiness();
        
        /**
         * True if has "principalPlaceOfBusiness" element
         */
        boolean isSetPrincipalPlaceOfBusiness();
        
        /**
         * Sets the "principalPlaceOfBusiness" element
         */
        void setPrincipalPlaceOfBusiness(boolean principalPlaceOfBusiness);
        
        /**
         * Sets (as xml) the "principalPlaceOfBusiness" element
         */
        void xsetPrincipalPlaceOfBusiness(au.gov.asic.types.TrueType principalPlaceOfBusiness);
        
        /**
         * Unsets the "principalPlaceOfBusiness" element
         */
        void unsetPrincipalPlaceOfBusiness();
        
        /**
         * Gets the "officeholders" element
         */
        boolean getOfficeholders();
        
        /**
         * Gets (as xml) the "officeholders" element
         */
        au.gov.asic.types.TrueType xgetOfficeholders();
        
        /**
         * True if has "officeholders" element
         */
        boolean isSetOfficeholders();
        
        /**
         * Sets the "officeholders" element
         */
        void setOfficeholders(boolean officeholders);
        
        /**
         * Sets (as xml) the "officeholders" element
         */
        void xsetOfficeholders(au.gov.asic.types.TrueType officeholders);
        
        /**
         * Unsets the "officeholders" element
         */
        void unsetOfficeholders();
        
        /**
         * Gets the "shareHolders" element
         */
        boolean getShareHolders();
        
        /**
         * Gets (as xml) the "shareHolders" element
         */
        au.gov.asic.types.TrueType xgetShareHolders();
        
        /**
         * True if has "shareHolders" element
         */
        boolean isSetShareHolders();
        
        /**
         * Sets the "shareHolders" element
         */
        void setShareHolders(boolean shareHolders);
        
        /**
         * Sets (as xml) the "shareHolders" element
         */
        void xsetShareHolders(au.gov.asic.types.TrueType shareHolders);
        
        /**
         * Unsets the "shareHolders" element
         */
        void unsetShareHolders();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.CompanyExtractRequestType.Company newInstance() {
              return (au.gov.asic.types.nni.CompanyExtractRequestType.Company) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.CompanyExtractRequestType.Company newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.CompanyExtractRequestType.Company) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML document(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Document extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("document92e1elemtype");
        
        /**
         * Gets the "dateListStart" element
         */
        java.util.Calendar getDateListStart();
        
        /**
         * Gets (as xml) the "dateListStart" element
         */
        org.apache.xmlbeans.XmlDate xgetDateListStart();
        
        /**
         * True if has "dateListStart" element
         */
        boolean isSetDateListStart();
        
        /**
         * Sets the "dateListStart" element
         */
        void setDateListStart(java.util.Calendar dateListStart);
        
        /**
         * Sets (as xml) the "dateListStart" element
         */
        void xsetDateListStart(org.apache.xmlbeans.XmlDate dateListStart);
        
        /**
         * Unsets the "dateListStart" element
         */
        void unsetDateListStart();
        
        /**
         * Gets the "dateListEnd" element
         */
        java.util.Calendar getDateListEnd();
        
        /**
         * Gets (as xml) the "dateListEnd" element
         */
        org.apache.xmlbeans.XmlDate xgetDateListEnd();
        
        /**
         * True if has "dateListEnd" element
         */
        boolean isSetDateListEnd();
        
        /**
         * Sets the "dateListEnd" element
         */
        void setDateListEnd(java.util.Calendar dateListEnd);
        
        /**
         * Sets (as xml) the "dateListEnd" element
         */
        void xsetDateListEnd(org.apache.xmlbeans.XmlDate dateListEnd);
        
        /**
         * Unsets the "dateListEnd" element
         */
        void unsetDateListEnd();
        
        /**
         * Gets the "maxDocuments" element
         */
        java.math.BigInteger getMaxDocuments();
        
        /**
         * Gets (as xml) the "maxDocuments" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetMaxDocuments();
        
        /**
         * True if has "maxDocuments" element
         */
        boolean isSetMaxDocuments();
        
        /**
         * Sets the "maxDocuments" element
         */
        void setMaxDocuments(java.math.BigInteger maxDocuments);
        
        /**
         * Sets (as xml) the "maxDocuments" element
         */
        void xsetMaxDocuments(org.apache.xmlbeans.XmlPositiveInteger maxDocuments);
        
        /**
         * Unsets the "maxDocuments" element
         */
        void unsetMaxDocuments();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.CompanyExtractRequestType.Document newInstance() {
              return (au.gov.asic.types.nni.CompanyExtractRequestType.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.CompanyExtractRequestType.Document newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.CompanyExtractRequestType.Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.CompanyExtractRequestType newInstance() {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.CompanyExtractRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.CompanyExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
