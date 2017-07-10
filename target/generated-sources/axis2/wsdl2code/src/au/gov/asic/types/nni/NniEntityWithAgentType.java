/*
 * XML Type:  nniEntityWithAgentType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NniEntityWithAgentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni;


/**
 * An XML nniEntityWithAgentType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface NniEntityWithAgentType extends au.gov.asic.types.nni.NameIndexEntityType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NniEntityWithAgentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("nnientitywithagenttype6284type");
    
    /**
     * Gets the "agent" element
     */
    au.gov.asic.types.nni.NniEntityWithAgentType.Agent getAgent();
    
    /**
     * True if has "agent" element
     */
    boolean isSetAgent();
    
    /**
     * Sets the "agent" element
     */
    void setAgent(au.gov.asic.types.nni.NniEntityWithAgentType.Agent agent);
    
    /**
     * Appends and returns a new empty "agent" element
     */
    au.gov.asic.types.nni.NniEntityWithAgentType.Agent addNewAgent();
    
    /**
     * Unsets the "agent" element
     */
    void unsetAgent();
    
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
     * An XML agent(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Agent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("agent0d73elemtype");
        
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
        au.gov.asic.types.NniNameType xgetAgentName();
        
        /**
         * Sets the "agentName" element
         */
        void setAgentName(java.lang.String agentName);
        
        /**
         * Sets (as xml) the "agentName" element
         */
        void xsetAgentName(au.gov.asic.types.NniNameType agentName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.nni.NniEntityWithAgentType.Agent newInstance() {
              return (au.gov.asic.types.nni.NniEntityWithAgentType.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.nni.NniEntityWithAgentType.Agent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.nni.NniEntityWithAgentType.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.nni.NniEntityWithAgentType newInstance() {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.nni.NniEntityWithAgentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.nni.NniEntityWithAgentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
