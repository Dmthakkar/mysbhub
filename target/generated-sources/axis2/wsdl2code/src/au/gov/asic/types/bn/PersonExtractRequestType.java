/*
 * XML Type:  personExtractRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PersonExtractRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML personExtractRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface PersonExtractRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonExtractRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("personextractrequesttypebb67type");
    
    /**
     * Gets the "searchId" element
     */
    int getSearchId();
    
    /**
     * Gets (as xml) the "searchId" element
     */
    au.gov.asic.types.AsicNumericIdType xgetSearchId();
    
    /**
     * True if has "searchId" element
     */
    boolean isSetSearchId();
    
    /**
     * Sets the "searchId" element
     */
    void setSearchId(int searchId);
    
    /**
     * Sets (as xml) the "searchId" element
     */
    void xsetSearchId(au.gov.asic.types.AsicNumericIdType searchId);
    
    /**
     * Unsets the "searchId" element
     */
    void unsetSearchId();
    
    /**
     * Gets the "personIds" element
     */
    au.gov.asic.types.bn.PersonExtractRequestType.PersonIds getPersonIds();
    
    /**
     * Sets the "personIds" element
     */
    void setPersonIds(au.gov.asic.types.bn.PersonExtractRequestType.PersonIds personIds);
    
    /**
     * Appends and returns a new empty "personIds" element
     */
    au.gov.asic.types.bn.PersonExtractRequestType.PersonIds addNewPersonIds();
    
    /**
     * Gets the "showHistory" element
     */
    boolean getShowHistory();
    
    /**
     * Gets (as xml) the "showHistory" element
     */
    au.gov.asic.types.TrueType xgetShowHistory();
    
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
    void xsetShowHistory(au.gov.asic.types.TrueType showHistory);
    
    /**
     * Unsets the "showHistory" element
     */
    void unsetShowHistory();
    
    /**
     * An XML personIds(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface PersonIds extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonIds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("personidscb76elemtype");
        
        /**
         * Gets array of all "personId" elements
         */
        java.lang.String[] getPersonIdArray();
        
        /**
         * Gets ith "personId" element
         */
        java.lang.String getPersonIdArray(int i);
        
        /**
         * Gets (as xml) array of all "personId" elements
         */
        org.apache.xmlbeans.XmlString[] xgetPersonIdArray();
        
        /**
         * Gets (as xml) ith "personId" element
         */
        org.apache.xmlbeans.XmlString xgetPersonIdArray(int i);
        
        /**
         * Returns number of "personId" element
         */
        int sizeOfPersonIdArray();
        
        /**
         * Sets array of all "personId" element
         */
        void setPersonIdArray(java.lang.String[] personIdArray);
        
        /**
         * Sets ith "personId" element
         */
        void setPersonIdArray(int i, java.lang.String personId);
        
        /**
         * Sets (as xml) array of all "personId" element
         */
        void xsetPersonIdArray(org.apache.xmlbeans.XmlString[] personIdArray);
        
        /**
         * Sets (as xml) ith "personId" element
         */
        void xsetPersonIdArray(int i, org.apache.xmlbeans.XmlString personId);
        
        /**
         * Inserts the value as the ith "personId" element
         */
        void insertPersonId(int i, java.lang.String personId);
        
        /**
         * Appends the value as the last "personId" element
         */
        void addPersonId(java.lang.String personId);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "personId" element
         */
        org.apache.xmlbeans.XmlString insertNewPersonId(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "personId" element
         */
        org.apache.xmlbeans.XmlString addNewPersonId();
        
        /**
         * Removes the ith "personId" element
         */
        void removePersonId(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.PersonExtractRequestType.PersonIds newInstance() {
              return (au.gov.asic.types.bn.PersonExtractRequestType.PersonIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.PersonExtractRequestType.PersonIds newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.PersonExtractRequestType.PersonIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.PersonExtractRequestType newInstance() {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.PersonExtractRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.PersonExtractRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
