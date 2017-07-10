/*
 * XML Type:  outboundAgentType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.OutboundAgentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML outboundAgentType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface OutboundAgentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutboundAgentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("outboundagenttypeb334type");
    
    /**
     * Gets the "agentAbn" element
     */
    java.lang.String getAgentAbn();
    
    /**
     * Gets (as xml) the "agentAbn" element
     */
    au.gov.asic.types.AbnType xgetAgentAbn();
    
    /**
     * True if has "agentAbn" element
     */
    boolean isSetAgentAbn();
    
    /**
     * Sets the "agentAbn" element
     */
    void setAgentAbn(java.lang.String agentAbn);
    
    /**
     * Sets (as xml) the "agentAbn" element
     */
    void xsetAgentAbn(au.gov.asic.types.AbnType agentAbn);
    
    /**
     * Unsets the "agentAbn" element
     */
    void unsetAgentAbn();
    
    /**
     * Gets the "agentNo" element
     */
    int getAgentNo();
    
    /**
     * Gets (as xml) the "agentNo" element
     */
    au.gov.asic.types.AsicNumericIdType xgetAgentNo();
    
    /**
     * Sets the "agentNo" element
     */
    void setAgentNo(int agentNo);
    
    /**
     * Sets (as xml) the "agentNo" element
     */
    void xsetAgentNo(au.gov.asic.types.AsicNumericIdType agentNo);
    
    /**
     * Gets the "agentName" element
     */
    java.lang.String getAgentName();
    
    /**
     * Gets (as xml) the "agentName" element
     */
    au.gov.asic.types.AgentNameType xgetAgentName();
    
    /**
     * True if has "agentName" element
     */
    boolean isSetAgentName();
    
    /**
     * Sets the "agentName" element
     */
    void setAgentName(java.lang.String agentName);
    
    /**
     * Sets (as xml) the "agentName" element
     */
    void xsetAgentName(au.gov.asic.types.AgentNameType agentName);
    
    /**
     * Unsets the "agentName" element
     */
    void unsetAgentName();
    
    /**
     * Gets the "organisation" element
     */
    au.gov.asic.types.nni.NameIndexEntityType getOrganisation();
    
    /**
     * True if has "organisation" element
     */
    boolean isSetOrganisation();
    
    /**
     * Sets the "organisation" element
     */
    void setOrganisation(au.gov.asic.types.nni.NameIndexEntityType organisation);
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    au.gov.asic.types.nni.NameIndexEntityType addNewOrganisation();
    
    /**
     * Unsets the "organisation" element
     */
    void unsetOrganisation();
    
    /**
     * Gets the "person" element
     */
    au.gov.asic.types.bn.IndividualType getPerson();
    
    /**
     * True if has "person" element
     */
    boolean isSetPerson();
    
    /**
     * Sets the "person" element
     */
    void setPerson(au.gov.asic.types.bn.IndividualType person);
    
    /**
     * Appends and returns a new empty "person" element
     */
    au.gov.asic.types.bn.IndividualType addNewPerson();
    
    /**
     * Unsets the "person" element
     */
    void unsetPerson();
    
    /**
     * Gets array of all "business" elements
     */
    au.gov.asic.types.nni.OutboundAgentType.Business[] getBusinessArray();
    
    /**
     * Gets ith "business" element
     */
    au.gov.asic.types.nni.OutboundAgentType.Business getBusinessArray(int i);
    
    /**
     * Returns number of "business" element
     */
    int sizeOfBusinessArray();
    
    /**
     * Sets array of all "business" element
     */
    void setBusinessArray(au.gov.asic.types.nni.OutboundAgentType.Business[] businessArray);
    
    /**
     * Sets ith "business" element
     */
    void setBusinessArray(int i, au.gov.asic.types.nni.OutboundAgentType.Business business);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "business" element
     */
    au.gov.asic.types.nni.OutboundAgentType.Business insertNewBusiness(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "business" element
     */
    au.gov.asic.types.nni.OutboundAgentType.Business addNewBusiness();
    
    /**
     * Removes the ith "business" element
     */
    void removeBusiness(int i);
    
    /**
     * An XML business(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Business extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Business.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("business2290elemtype");
        
        /**
         * Gets the "organisation" element
         */
        au.gov.asic.types.nni.NameIndexEntityType getOrganisation();
        
        /**
         * True if has "organisation" element
         */
        boolean isSetOrganisation();
        
        /**
         * Sets the "organisation" element
         */
        void setOrganisation(au.gov.asic.types.nni.NameIndexEntityType organisation);
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        au.gov.asic.types.nni.NameIndexEntityType addNewOrganisation();
        
        /**
         * Unsets the "organisation" element
         */
        void unsetOrganisation();
        
        /**
         * Gets the "person" element
         */
        au.gov.asic.types.bn.IndividualType getPerson();
        
        /**
         * True if has "person" element
         */
        boolean isSetPerson();
        
        /**
         * Sets the "person" element
         */
        void setPerson(au.gov.asic.types.bn.IndividualType person);
        
        /**
         * Appends and returns a new empty "person" element
         */
        au.gov.asic.types.bn.IndividualType addNewPerson();
        
        /**
         * Unsets the "person" element
         */
        void unsetPerson();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.OutboundAgentType.Business newInstance() {
              return (au.gov.asic.types.nni.OutboundAgentType.Business) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.OutboundAgentType.Business newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.OutboundAgentType.Business) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.OutboundAgentType newInstance() {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.OutboundAgentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.OutboundAgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.OutboundAgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.OutboundAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
