/*
 * XML Type:  bnSearchRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnSearchRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML bnSearchRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BnSearchRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BnSearchRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bnsearchrequesttype1541type");
    
    /**
     * Gets the "search" element
     */
    au.gov.asic.types.bn.BnSearchRequestType.Search getSearch();
    
    /**
     * Sets the "search" element
     */
    void setSearch(au.gov.asic.types.bn.BnSearchRequestType.Search search);
    
    /**
     * Appends and returns a new empty "search" element
     */
    au.gov.asic.types.bn.BnSearchRequestType.Search addNewSearch();
    
    /**
     * Gets the "filter" element
     */
    au.gov.asic.types.bn.BnSearchRequestType.Filter getFilter();
    
    /**
     * True if has "filter" element
     */
    boolean isSetFilter();
    
    /**
     * Sets the "filter" element
     */
    void setFilter(au.gov.asic.types.bn.BnSearchRequestType.Filter filter);
    
    /**
     * Appends and returns a new empty "filter" element
     */
    au.gov.asic.types.bn.BnSearchRequestType.Filter addNewFilter();
    
    /**
     * Unsets the "filter" element
     */
    void unsetFilter();
    
    /**
     * Gets the "maxResult" element
     */
    java.math.BigInteger getMaxResult();
    
    /**
     * Gets (as xml) the "maxResult" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetMaxResult();
    
    /**
     * True if has "maxResult" element
     */
    boolean isSetMaxResult();
    
    /**
     * Sets the "maxResult" element
     */
    void setMaxResult(java.math.BigInteger maxResult);
    
    /**
     * Sets (as xml) the "maxResult" element
     */
    void xsetMaxResult(org.apache.xmlbeans.XmlPositiveInteger maxResult);
    
    /**
     * Unsets the "maxResult" element
     */
    void unsetMaxResult();
    
    /**
     * An XML search(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Search extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Search.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("searchf87delemtype");
        
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
         * Gets the "organisation" element
         */
        au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation getOrganisation();
        
        /**
         * True if has "organisation" element
         */
        boolean isSetOrganisation();
        
        /**
         * Sets the "organisation" element
         */
        void setOrganisation(au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation organisation);
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation addNewOrganisation();
        
        /**
         * Unsets the "organisation" element
         */
        void unsetOrganisation();
        
        /**
         * Gets the "previousStateOrTerritory" element
         */
        au.gov.asic.types.bn.PreviousStateTerritoryType getPreviousStateOrTerritory();
        
        /**
         * True if has "previousStateOrTerritory" element
         */
        boolean isSetPreviousStateOrTerritory();
        
        /**
         * Sets the "previousStateOrTerritory" element
         */
        void setPreviousStateOrTerritory(au.gov.asic.types.bn.PreviousStateTerritoryType previousStateOrTerritory);
        
        /**
         * Appends and returns a new empty "previousStateOrTerritory" element
         */
        au.gov.asic.types.bn.PreviousStateTerritoryType addNewPreviousStateOrTerritory();
        
        /**
         * Unsets the "previousStateOrTerritory" element
         */
        void unsetPreviousStateOrTerritory();
        
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
         * An XML organisation(@uri:bn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Organisation extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisation03f3elemtype");
            
            /**
             * Gets the "name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" element
             */
            au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name xgetName();
            
            /**
             * Sets the "name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" element
             */
            void xsetName(au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name name);
            
            /**
             * An XML name(@uri:bn.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnSearchRequestType$Search$Organisation$Name.
             */
            public interface Name extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("name3aecelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name newInstance() {
                      return (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation newInstance() {
                  return (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.bn.BnSearchRequestType.Search.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.BnSearchRequestType.Search newInstance() {
              return (au.gov.asic.types.bn.BnSearchRequestType.Search) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BnSearchRequestType.Search newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BnSearchRequestType.Search) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML filter(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Filter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Filter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("filter78adelemtype");
        
        /**
         * Gets the "roleCategory" element
         */
        au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory.Enum getRoleCategory();
        
        /**
         * Gets (as xml) the "roleCategory" element
         */
        au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory xgetRoleCategory();
        
        /**
         * True if has "roleCategory" element
         */
        boolean isSetRoleCategory();
        
        /**
         * Sets the "roleCategory" element
         */
        void setRoleCategory(au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory.Enum roleCategory);
        
        /**
         * Sets (as xml) the "roleCategory" element
         */
        void xsetRoleCategory(au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory roleCategory);
        
        /**
         * Unsets the "roleCategory" element
         */
        void unsetRoleCategory();
        
        /**
         * Gets array of all "statusCode" elements
         */
        au.gov.asic.types.bn.BnSearchStatusCodeType.Enum[] getStatusCodeArray();
        
        /**
         * Gets ith "statusCode" element
         */
        au.gov.asic.types.bn.BnSearchStatusCodeType.Enum getStatusCodeArray(int i);
        
        /**
         * Gets (as xml) array of all "statusCode" elements
         */
        au.gov.asic.types.bn.BnSearchStatusCodeType[] xgetStatusCodeArray();
        
        /**
         * Gets (as xml) ith "statusCode" element
         */
        au.gov.asic.types.bn.BnSearchStatusCodeType xgetStatusCodeArray(int i);
        
        /**
         * Returns number of "statusCode" element
         */
        int sizeOfStatusCodeArray();
        
        /**
         * Sets array of all "statusCode" element
         */
        void setStatusCodeArray(au.gov.asic.types.bn.BnSearchStatusCodeType.Enum[] statusCodeArray);
        
        /**
         * Sets ith "statusCode" element
         */
        void setStatusCodeArray(int i, au.gov.asic.types.bn.BnSearchStatusCodeType.Enum statusCode);
        
        /**
         * Sets (as xml) array of all "statusCode" element
         */
        void xsetStatusCodeArray(au.gov.asic.types.bn.BnSearchStatusCodeType[] statusCodeArray);
        
        /**
         * Sets (as xml) ith "statusCode" element
         */
        void xsetStatusCodeArray(int i, au.gov.asic.types.bn.BnSearchStatusCodeType statusCode);
        
        /**
         * Inserts the value as the ith "statusCode" element
         */
        void insertStatusCode(int i, au.gov.asic.types.bn.BnSearchStatusCodeType.Enum statusCode);
        
        /**
         * Appends the value as the last "statusCode" element
         */
        void addStatusCode(au.gov.asic.types.bn.BnSearchStatusCodeType.Enum statusCode);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "statusCode" element
         */
        au.gov.asic.types.bn.BnSearchStatusCodeType insertNewStatusCode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "statusCode" element
         */
        au.gov.asic.types.bn.BnSearchStatusCodeType addNewStatusCode();
        
        /**
         * Removes the ith "statusCode" element
         */
        void removeStatusCode(int i);
        
        /**
         * Gets the "principalPlaceOfBusiness" element
         */
        au.gov.asic.types.bn.LocationType getPrincipalPlaceOfBusiness();
        
        /**
         * True if has "principalPlaceOfBusiness" element
         */
        boolean isSetPrincipalPlaceOfBusiness();
        
        /**
         * Sets the "principalPlaceOfBusiness" element
         */
        void setPrincipalPlaceOfBusiness(au.gov.asic.types.bn.LocationType principalPlaceOfBusiness);
        
        /**
         * Appends and returns a new empty "principalPlaceOfBusiness" element
         */
        au.gov.asic.types.bn.LocationType addNewPrincipalPlaceOfBusiness();
        
        /**
         * Unsets the "principalPlaceOfBusiness" element
         */
        void unsetPrincipalPlaceOfBusiness();
        
        /**
         * An XML roleCategory(@uri:bn.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnSearchRequestType$Filter$RoleCategory.
         */
        public interface RoleCategory extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoleCategory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("rolecategoryd8ddelemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum HOLDER = Enum.forString("HOLDER");
            static final Enum BUSINESSNAME = Enum.forString("BUSINESSNAME");
            
            static final int INT_HOLDER = Enum.INT_HOLDER;
            static final int INT_BUSINESSNAME = Enum.INT_BUSINESSNAME;
            
            /**
             * Enumeration value class for au.gov.asic.types.bn.BnSearchRequestType$Filter$RoleCategory.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_HOLDER
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_HOLDER = 1;
                static final int INT_BUSINESSNAME = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("HOLDER", INT_HOLDER),
                      new Enum("BUSINESSNAME", INT_BUSINESSNAME),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory) type.newValue( obj ); }
                
                public static au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory newInstance() {
                  return (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.bn.BnSearchRequestType.Filter.RoleCategory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.bn.BnSearchRequestType.Filter newInstance() {
              return (au.gov.asic.types.bn.BnSearchRequestType.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BnSearchRequestType.Filter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BnSearchRequestType.Filter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BnSearchRequestType newInstance() {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BnSearchRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnSearchRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BnSearchRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BnSearchRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
