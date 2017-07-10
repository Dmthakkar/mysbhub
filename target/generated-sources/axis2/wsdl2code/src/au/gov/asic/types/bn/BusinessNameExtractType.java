/*
 * XML Type:  businessNameExtractType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BusinessNameExtractType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML businessNameExtractType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BusinessNameExtractType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessNameExtractType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("businessnameextracttypea5e6type");
    
    /**
     * Gets array of all "business" elements
     */
    au.gov.asic.types.bn.BusinessNameExtractType.Business[] getBusinessArray();
    
    /**
     * Gets ith "business" element
     */
    au.gov.asic.types.bn.BusinessNameExtractType.Business getBusinessArray(int i);
    
    /**
     * Returns number of "business" element
     */
    int sizeOfBusinessArray();
    
    /**
     * Sets array of all "business" element
     */
    void setBusinessArray(au.gov.asic.types.bn.BusinessNameExtractType.Business[] businessArray);
    
    /**
     * Sets ith "business" element
     */
    void setBusinessArray(int i, au.gov.asic.types.bn.BusinessNameExtractType.Business business);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "business" element
     */
    au.gov.asic.types.bn.BusinessNameExtractType.Business insertNewBusiness(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "business" element
     */
    au.gov.asic.types.bn.BusinessNameExtractType.Business addNewBusiness();
    
    /**
     * Removes the ith "business" element
     */
    void removeBusiness(int i);
    
    /**
     * Gets the "businessName" element
     */
    au.gov.asic.types.bn.OutboundBusinessNameType getBusinessName();
    
    /**
     * Sets the "businessName" element
     */
    void setBusinessName(au.gov.asic.types.bn.OutboundBusinessNameType businessName);
    
    /**
     * Appends and returns a new empty "businessName" element
     */
    au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessName();
    
    /**
     * An XML business(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Business extends au.gov.asic.types.bn.BusinessEntityType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Business.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("business700aelemtype");
        
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
         * Gets the "agentAppointed" element
         */
        boolean getAgentAppointed();
        
        /**
         * Gets (as xml) the "agentAppointed" element
         */
        au.gov.asic.types.TrueType xgetAgentAppointed();
        
        /**
         * True if has "agentAppointed" element
         */
        boolean isSetAgentAppointed();
        
        /**
         * Sets the "agentAppointed" element
         */
        void setAgentAppointed(boolean agentAppointed);
        
        /**
         * Sets (as xml) the "agentAppointed" element
         */
        void xsetAgentAppointed(au.gov.asic.types.TrueType agentAppointed);
        
        /**
         * Unsets the "agentAppointed" element
         */
        void unsetAgentAppointed();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.BusinessNameExtractType.Business newInstance() {
              return (au.gov.asic.types.bn.BusinessNameExtractType.Business) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BusinessNameExtractType.Business newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BusinessNameExtractType.Business) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BusinessNameExtractType newInstance() {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BusinessNameExtractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BusinessNameExtractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
