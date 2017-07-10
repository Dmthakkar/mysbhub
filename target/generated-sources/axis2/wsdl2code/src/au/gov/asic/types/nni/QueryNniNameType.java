/*
 * XML Type:  queryNniNameType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.QueryNniNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML queryNniNameType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface QueryNniNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryNniNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("querynninametypedf1dtype");
    
    /**
     * Gets the "proposedName" element
     */
    java.lang.String getProposedName();
    
    /**
     * Gets (as xml) the "proposedName" element
     */
    au.gov.asic.types.NniNameType xgetProposedName();
    
    /**
     * Sets the "proposedName" element
     */
    void setProposedName(java.lang.String proposedName);
    
    /**
     * Sets (as xml) the "proposedName" element
     */
    void xsetProposedName(au.gov.asic.types.NniNameType proposedName);
    
    /**
     * Gets the "companyNameAvailabilityCheck" element
     */
    boolean getCompanyNameAvailabilityCheck();
    
    /**
     * Gets (as xml) the "companyNameAvailabilityCheck" element
     */
    au.gov.asic.types.TrueType xgetCompanyNameAvailabilityCheck();
    
    /**
     * True if has "companyNameAvailabilityCheck" element
     */
    boolean isSetCompanyNameAvailabilityCheck();
    
    /**
     * Sets the "companyNameAvailabilityCheck" element
     */
    void setCompanyNameAvailabilityCheck(boolean companyNameAvailabilityCheck);
    
    /**
     * Sets (as xml) the "companyNameAvailabilityCheck" element
     */
    void xsetCompanyNameAvailabilityCheck(au.gov.asic.types.TrueType companyNameAvailabilityCheck);
    
    /**
     * Unsets the "companyNameAvailabilityCheck" element
     */
    void unsetCompanyNameAvailabilityCheck();
    
    /**
     * Gets the "bnNameAvailabilityCheck" element
     */
    boolean getBnNameAvailabilityCheck();
    
    /**
     * Gets (as xml) the "bnNameAvailabilityCheck" element
     */
    au.gov.asic.types.TrueType xgetBnNameAvailabilityCheck();
    
    /**
     * True if has "bnNameAvailabilityCheck" element
     */
    boolean isSetBnNameAvailabilityCheck();
    
    /**
     * Sets the "bnNameAvailabilityCheck" element
     */
    void setBnNameAvailabilityCheck(boolean bnNameAvailabilityCheck);
    
    /**
     * Sets (as xml) the "bnNameAvailabilityCheck" element
     */
    void xsetBnNameAvailabilityCheck(au.gov.asic.types.TrueType bnNameAvailabilityCheck);
    
    /**
     * Unsets the "bnNameAvailabilityCheck" element
     */
    void unsetBnNameAvailabilityCheck();
    
    /**
     * Gets the "proprietor" element
     */
    au.gov.asic.types.nni.QueryNniNameType.Proprietor getProprietor();
    
    /**
     * True if has "proprietor" element
     */
    boolean isSetProprietor();
    
    /**
     * Sets the "proprietor" element
     */
    void setProprietor(au.gov.asic.types.nni.QueryNniNameType.Proprietor proprietor);
    
    /**
     * Appends and returns a new empty "proprietor" element
     */
    au.gov.asic.types.nni.QueryNniNameType.Proprietor addNewProprietor();
    
    /**
     * Unsets the "proprietor" element
     */
    void unsetProprietor();
    
    /**
     * An XML proprietor(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Proprietor extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Proprietor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("proprietor96d5elemtype");
        
        /**
         * Gets the "proprietorAcn" element
         */
        int getProprietorAcn();
        
        /**
         * Gets (as xml) the "proprietorAcn" element
         */
        au.gov.asic.types.NniNumberType xgetProprietorAcn();
        
        /**
         * True if has "proprietorAcn" element
         */
        boolean isSetProprietorAcn();
        
        /**
         * Sets the "proprietorAcn" element
         */
        void setProprietorAcn(int proprietorAcn);
        
        /**
         * Sets (as xml) the "proprietorAcn" element
         */
        void xsetProprietorAcn(au.gov.asic.types.NniNumberType proprietorAcn);
        
        /**
         * Unsets the "proprietorAcn" element
         */
        void unsetProprietorAcn();
        
        /**
         * Gets the "proprietorAbn" element
         */
        java.lang.String getProprietorAbn();
        
        /**
         * Gets (as xml) the "proprietorAbn" element
         */
        au.gov.asic.types.AbnType xgetProprietorAbn();
        
        /**
         * True if has "proprietorAbn" element
         */
        boolean isSetProprietorAbn();
        
        /**
         * Sets the "proprietorAbn" element
         */
        void setProprietorAbn(java.lang.String proprietorAbn);
        
        /**
         * Sets (as xml) the "proprietorAbn" element
         */
        void xsetProprietorAbn(au.gov.asic.types.AbnType proprietorAbn);
        
        /**
         * Unsets the "proprietorAbn" element
         */
        void unsetProprietorAbn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.QueryNniNameType.Proprietor newInstance() {
              return (au.gov.asic.types.nni.QueryNniNameType.Proprietor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.QueryNniNameType.Proprietor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.QueryNniNameType.Proprietor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.QueryNniNameType newInstance() {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.QueryNniNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.QueryNniNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.QueryNniNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.QueryNniNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
