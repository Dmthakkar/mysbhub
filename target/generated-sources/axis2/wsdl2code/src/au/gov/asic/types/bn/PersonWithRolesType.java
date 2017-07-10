/*
 * XML Type:  personWithRolesType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PersonWithRolesType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML personWithRolesType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface PersonWithRolesType extends au.gov.asic.types.PersonNameBirthType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonWithRolesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("personwithrolestype3bbatype");
    
    /**
     * Gets array of all "role" elements
     */
    au.gov.asic.types.bn.PersonWithRolesType.Role[] getRoleArray();
    
    /**
     * Gets ith "role" element
     */
    au.gov.asic.types.bn.PersonWithRolesType.Role getRoleArray(int i);
    
    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "role" element
     */
    void setRoleArray(au.gov.asic.types.bn.PersonWithRolesType.Role[] roleArray);
    
    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, au.gov.asic.types.bn.PersonWithRolesType.Role role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    au.gov.asic.types.bn.PersonWithRolesType.Role insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    au.gov.asic.types.bn.PersonWithRolesType.Role addNewRole();
    
    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);
    
    /**
     * An XML role(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Role extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Role.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("role8068elemtype");
        
        /**
         * Gets the "business" element
         */
        au.gov.asic.types.bn.BusinessEntityType getBusiness();
        
        /**
         * Sets the "business" element
         */
        void setBusiness(au.gov.asic.types.bn.BusinessEntityType business);
        
        /**
         * Appends and returns a new empty "business" element
         */
        au.gov.asic.types.bn.BusinessEntityType addNewBusiness();
        
        /**
         * Gets array of all "businessName" elements
         */
        au.gov.asic.types.bn.OutboundBusinessNameType[] getBusinessNameArray();
        
        /**
         * Gets ith "businessName" element
         */
        au.gov.asic.types.bn.OutboundBusinessNameType getBusinessNameArray(int i);
        
        /**
         * Returns number of "businessName" element
         */
        int sizeOfBusinessNameArray();
        
        /**
         * Sets array of all "businessName" element
         */
        void setBusinessNameArray(au.gov.asic.types.bn.OutboundBusinessNameType[] businessNameArray);
        
        /**
         * Sets ith "businessName" element
         */
        void setBusinessNameArray(int i, au.gov.asic.types.bn.OutboundBusinessNameType businessName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "businessName" element
         */
        au.gov.asic.types.bn.OutboundBusinessNameType insertNewBusinessName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "businessName" element
         */
        au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessName();
        
        /**
         * Removes the ith "businessName" element
         */
        void removeBusinessName(int i);
        
        /**
         * Gets the "type" element
         */
        au.gov.asic.types.bn.RoleTypeType getType();
        
        /**
         * True if has "type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "type" element
         */
        void setType(au.gov.asic.types.bn.RoleTypeType type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        au.gov.asic.types.bn.RoleTypeType addNewType();
        
        /**
         * Unsets the "type" element
         */
        void unsetType();
        
        /**
         * Gets the "address" element
         */
        au.gov.asic.types.AddressExtType getAddress();
        
        /**
         * True if has "address" element
         */
        boolean isSetAddress();
        
        /**
         * Sets the "address" element
         */
        void setAddress(au.gov.asic.types.AddressExtType address);
        
        /**
         * Appends and returns a new empty "address" element
         */
        au.gov.asic.types.AddressExtType addNewAddress();
        
        /**
         * Unsets the "address" element
         */
        void unsetAddress();
        
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
            public static au.gov.asic.types.bn.PersonWithRolesType.Role newInstance() {
              return (au.gov.asic.types.bn.PersonWithRolesType.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.PersonWithRolesType.Role newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.PersonWithRolesType.Role) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.PersonWithRolesType newInstance() {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.PersonWithRolesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.PersonWithRolesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.PersonWithRolesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.PersonWithRolesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
