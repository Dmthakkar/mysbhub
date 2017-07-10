/*
 * XML Type:  bnExtractRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnExtractRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML bnExtractRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BnExtractRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BnExtractRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bnextractrequesttypee990type");
    
    /**
     * Gets the "abn" element
     */
    java.lang.String getAbn();
    
    /**
     * Gets (as xml) the "abn" element
     */
    au.gov.asic.types.bn.BnExtractRequestType.Abn xgetAbn();
    
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
    void xsetAbn(au.gov.asic.types.bn.BnExtractRequestType.Abn abn);
    
    /**
     * Unsets the "abn" element
     */
    void unsetAbn();
    
    /**
     * Gets the "orgNumber" element
     */
    java.lang.String getOrgNumber();
    
    /**
     * Gets (as xml) the "orgNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrgNumber();
    
    /**
     * True if has "orgNumber" element
     */
    boolean isSetOrgNumber();
    
    /**
     * Sets the "orgNumber" element
     */
    void setOrgNumber(java.lang.String orgNumber);
    
    /**
     * Sets (as xml) the "orgNumber" element
     */
    void xsetOrgNumber(org.apache.xmlbeans.XmlString orgNumber);
    
    /**
     * Unsets the "orgNumber" element
     */
    void unsetOrgNumber();
    
    /**
     * Gets the "nniNumber" element
     */
    java.lang.String getNniNumber();
    
    /**
     * Gets (as xml) the "nniNumber" element
     */
    org.apache.xmlbeans.XmlString xgetNniNumber();
    
    /**
     * True if has "nniNumber" element
     */
    boolean isSetNniNumber();
    
    /**
     * Sets the "nniNumber" element
     */
    void setNniNumber(java.lang.String nniNumber);
    
    /**
     * Sets (as xml) the "nniNumber" element
     */
    void xsetNniNumber(org.apache.xmlbeans.XmlString nniNumber);
    
    /**
     * Unsets the "nniNumber" element
     */
    void unsetNniNumber();
    
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
     * Gets the "stateTerritory" element
     */
    au.gov.asic.types.bn.BnExtractRequestType.StateTerritory getStateTerritory();
    
    /**
     * True if has "stateTerritory" element
     */
    boolean isSetStateTerritory();
    
    /**
     * Sets the "stateTerritory" element
     */
    void setStateTerritory(au.gov.asic.types.bn.BnExtractRequestType.StateTerritory stateTerritory);
    
    /**
     * Appends and returns a new empty "stateTerritory" element
     */
    au.gov.asic.types.bn.BnExtractRequestType.StateTerritory addNewStateTerritory();
    
    /**
     * Unsets the "stateTerritory" element
     */
    void unsetStateTerritory();
    
    /**
     * Gets the "summaryDetailsOnly" element
     */
    boolean getSummaryDetailsOnly();
    
    /**
     * Gets (as xml) the "summaryDetailsOnly" element
     */
    au.gov.asic.types.TrueType xgetSummaryDetailsOnly();
    
    /**
     * True if has "summaryDetailsOnly" element
     */
    boolean isSetSummaryDetailsOnly();
    
    /**
     * Sets the "summaryDetailsOnly" element
     */
    void setSummaryDetailsOnly(boolean summaryDetailsOnly);
    
    /**
     * Sets (as xml) the "summaryDetailsOnly" element
     */
    void xsetSummaryDetailsOnly(au.gov.asic.types.TrueType summaryDetailsOnly);
    
    /**
     * Unsets the "summaryDetailsOnly" element
     */
    void unsetSummaryDetailsOnly();
    
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
     * Gets the "showHistory" element
     */
    boolean getShowHistory();
    
    /**
     * Gets (as xml) the "showHistory" element
     */
    org.apache.xmlbeans.XmlBoolean xgetShowHistory();
    
    /**
     * True if has "showHistory" element
     */
    boolean isSetShowHistory();
    
    /**
     * Sets the "showHistory" element
     */
    void setShowHistory(boolean showHistory);
    
    /**
     * Sets (as xml) the "showHistory" element
     */
    void xsetShowHistory(org.apache.xmlbeans.XmlBoolean showHistory);
    
    /**
     * Unsets the "showHistory" element
     */
    void unsetShowHistory();
    
    /**
     * An XML abn(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnExtractRequestType$Abn.
     */
    public interface Abn extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Abn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("abnfc69elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.BnExtractRequestType.Abn newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.BnExtractRequestType.Abn) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.BnExtractRequestType.Abn newInstance() {
              return (au.gov.asic.types.bn.BnExtractRequestType.Abn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BnExtractRequestType.Abn newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BnExtractRequestType.Abn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML stateTerritory(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface StateTerritory extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StateTerritory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("stateterritory20b5elemtype");
        
        /**
         * Gets the "previousStateNumber" element
         */
        java.lang.String getPreviousStateNumber();
        
        /**
         * Gets (as xml) the "previousStateNumber" element
         */
        au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber xgetPreviousStateNumber();
        
        /**
         * Sets the "previousStateNumber" element
         */
        void setPreviousStateNumber(java.lang.String previousStateNumber);
        
        /**
         * Sets (as xml) the "previousStateNumber" element
         */
        void xsetPreviousStateNumber(au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber previousStateNumber);
        
        /**
         * Gets the "issuingStateTerritory" element
         */
        au.gov.asic.types.StateTerritoryCodeType.Enum getIssuingStateTerritory();
        
        /**
         * Gets (as xml) the "issuingStateTerritory" element
         */
        au.gov.asic.types.StateTerritoryCodeType xgetIssuingStateTerritory();
        
        /**
         * Sets the "issuingStateTerritory" element
         */
        void setIssuingStateTerritory(au.gov.asic.types.StateTerritoryCodeType.Enum issuingStateTerritory);
        
        /**
         * Sets (as xml) the "issuingStateTerritory" element
         */
        void xsetIssuingStateTerritory(au.gov.asic.types.StateTerritoryCodeType issuingStateTerritory);
        
        /**
         * An XML previousStateNumber(@uri:bn.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnExtractRequestType$StateTerritory$PreviousStateNumber.
         */
        public interface PreviousStateNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PreviousStateNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("previousstatenumber8666elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber) type.newValue( obj ); }
                
                public static au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber newInstance() {
                  return (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.BnExtractRequestType.StateTerritory newInstance() {
              return (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BnExtractRequestType.StateTerritory newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BnExtractRequestType newInstance() {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BnExtractRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnExtractRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnExtractRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
