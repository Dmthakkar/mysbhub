/*
 * XML Type:  documentType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.DocumentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML documentType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface DocumentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("documenttype854ftype");
    
    /**
     * Gets the "documentNumber" element
     */
    java.lang.String getDocumentNumber();
    
    /**
     * Gets (as xml) the "documentNumber" element
     */
    au.gov.asic.types.DocumentNoType xgetDocumentNumber();
    
    /**
     * Sets the "documentNumber" element
     */
    void setDocumentNumber(java.lang.String documentNumber);
    
    /**
     * Sets (as xml) the "documentNumber" element
     */
    void xsetDocumentNumber(au.gov.asic.types.DocumentNoType documentNumber);
    
    /**
     * Gets the "dateReceived" element
     */
    java.util.Calendar getDateReceived();
    
    /**
     * Gets (as xml) the "dateReceived" element
     */
    org.apache.xmlbeans.XmlDate xgetDateReceived();
    
    /**
     * Sets the "dateReceived" element
     */
    void setDateReceived(java.util.Calendar dateReceived);
    
    /**
     * Sets (as xml) the "dateReceived" element
     */
    void xsetDateReceived(org.apache.xmlbeans.XmlDate dateReceived);
    
    /**
     * Gets the "formCode" element
     */
    java.lang.String getFormCode();
    
    /**
     * Gets (as xml) the "formCode" element
     */
    au.gov.asic.types.CodeType xgetFormCode();
    
    /**
     * Sets the "formCode" element
     */
    void setFormCode(java.lang.String formCode);
    
    /**
     * Sets (as xml) the "formCode" element
     */
    void xsetFormCode(au.gov.asic.types.CodeType formCode);
    
    /**
     * Gets the "numberOfPages" element
     */
    java.math.BigInteger getNumberOfPages();
    
    /**
     * Gets (as xml) the "numberOfPages" element
     */
    au.gov.asic.types.bn.DocumentType.NumberOfPages xgetNumberOfPages();
    
    /**
     * True if has "numberOfPages" element
     */
    boolean isSetNumberOfPages();
    
    /**
     * Sets the "numberOfPages" element
     */
    void setNumberOfPages(java.math.BigInteger numberOfPages);
    
    /**
     * Sets (as xml) the "numberOfPages" element
     */
    void xsetNumberOfPages(au.gov.asic.types.bn.DocumentType.NumberOfPages numberOfPages);
    
    /**
     * Unsets the "numberOfPages" element
     */
    void unsetNumberOfPages();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    au.gov.asic.types.DescriptionType xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(au.gov.asic.types.DescriptionType description);
    
    /**
     * Gets array of all "additionalDescription" elements
     */
    au.gov.asic.types.bn.DocumentType.AdditionalDescription[] getAdditionalDescriptionArray();
    
    /**
     * Gets ith "additionalDescription" element
     */
    au.gov.asic.types.bn.DocumentType.AdditionalDescription getAdditionalDescriptionArray(int i);
    
    /**
     * Returns number of "additionalDescription" element
     */
    int sizeOfAdditionalDescriptionArray();
    
    /**
     * Sets array of all "additionalDescription" element
     */
    void setAdditionalDescriptionArray(au.gov.asic.types.bn.DocumentType.AdditionalDescription[] additionalDescriptionArray);
    
    /**
     * Sets ith "additionalDescription" element
     */
    void setAdditionalDescriptionArray(int i, au.gov.asic.types.bn.DocumentType.AdditionalDescription additionalDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalDescription" element
     */
    au.gov.asic.types.bn.DocumentType.AdditionalDescription insertNewAdditionalDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalDescription" element
     */
    au.gov.asic.types.bn.DocumentType.AdditionalDescription addNewAdditionalDescription();
    
    /**
     * Removes the ith "additionalDescription" element
     */
    void removeAdditionalDescription(int i);
    
    /**
     * An XML numberOfPages(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.DocumentType$NumberOfPages.
     */
    public interface NumberOfPages extends org.apache.xmlbeans.XmlInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberOfPages.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("numberofpages0c5felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.DocumentType.NumberOfPages newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.DocumentType.NumberOfPages) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.DocumentType.NumberOfPages newInstance() {
              return (au.gov.asic.types.bn.DocumentType.NumberOfPages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.DocumentType.NumberOfPages newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.DocumentType.NumberOfPages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML additionalDescription(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface AdditionalDescription extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdditionalDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("additionaldescription1c10elemtype");
        
        /**
         * Gets the "subformCode" element
         */
        java.lang.String getSubformCode();
        
        /**
         * Gets (as xml) the "subformCode" element
         */
        au.gov.asic.types.CodeType xgetSubformCode();
        
        /**
         * True if has "subformCode" element
         */
        boolean isSetSubformCode();
        
        /**
         * Sets the "subformCode" element
         */
        void setSubformCode(java.lang.String subformCode);
        
        /**
         * Sets (as xml) the "subformCode" element
         */
        void xsetSubformCode(au.gov.asic.types.CodeType subformCode);
        
        /**
         * Unsets the "subformCode" element
         */
        void unsetSubformCode();
        
        /**
         * Gets the "subformDescription" element
         */
        java.lang.String getSubformDescription();
        
        /**
         * Gets (as xml) the "subformDescription" element
         */
        au.gov.asic.types.DescriptionType xgetSubformDescription();
        
        /**
         * Sets the "subformDescription" element
         */
        void setSubformDescription(java.lang.String subformDescription);
        
        /**
         * Sets (as xml) the "subformDescription" element
         */
        void xsetSubformDescription(au.gov.asic.types.DescriptionType subformDescription);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.DocumentType.AdditionalDescription newInstance() {
              return (au.gov.asic.types.bn.DocumentType.AdditionalDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.DocumentType.AdditionalDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.DocumentType.AdditionalDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.DocumentType newInstance() {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.DocumentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.DocumentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.DocumentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.DocumentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.DocumentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.DocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
