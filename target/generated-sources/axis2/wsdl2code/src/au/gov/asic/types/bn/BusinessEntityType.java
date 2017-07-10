/*
 * XML Type:  businessEntityType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BusinessEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML businessEntityType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BusinessEntityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessEntityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("businessentitytype7267type");
    
    /**
     * Gets the "abrEntity" element
     */
    au.gov.asic.types.abn.AbrEntityType getAbrEntity();
    
    /**
     * True if has "abrEntity" element
     */
    boolean isSetAbrEntity();
    
    /**
     * Sets the "abrEntity" element
     */
    void setAbrEntity(au.gov.asic.types.abn.AbrEntityType abrEntity);
    
    /**
     * Appends and returns a new empty "abrEntity" element
     */
    au.gov.asic.types.abn.AbrEntityType addNewAbrEntity();
    
    /**
     * Unsets the "abrEntity" element
     */
    void unsetAbrEntity();
    
    /**
     * Gets the "abnExemption" element
     */
    boolean getAbnExemption();
    
    /**
     * Gets (as xml) the "abnExemption" element
     */
    au.gov.asic.types.TrueType xgetAbnExemption();
    
    /**
     * True if has "abnExemption" element
     */
    boolean isSetAbnExemption();
    
    /**
     * Sets the "abnExemption" element
     */
    void setAbnExemption(boolean abnExemption);
    
    /**
     * Sets (as xml) the "abnExemption" element
     */
    void xsetAbnExemption(au.gov.asic.types.TrueType abnExemption);
    
    /**
     * Unsets the "abnExemption" element
     */
    void unsetAbnExemption();
    
    /**
     * Gets the "individual" element
     */
    au.gov.asic.types.bn.IndividualType getIndividual();
    
    /**
     * True if has "individual" element
     */
    boolean isSetIndividual();
    
    /**
     * Sets the "individual" element
     */
    void setIndividual(au.gov.asic.types.bn.IndividualType individual);
    
    /**
     * Appends and returns a new empty "individual" element
     */
    au.gov.asic.types.bn.IndividualType addNewIndividual();
    
    /**
     * Unsets the "individual" element
     */
    void unsetIndividual();
    
    /**
     * Gets the "organisation" element
     */
    au.gov.asic.types.bn.OrganisationType getOrganisation();
    
    /**
     * True if has "organisation" element
     */
    boolean isSetOrganisation();
    
    /**
     * Sets the "organisation" element
     */
    void setOrganisation(au.gov.asic.types.bn.OrganisationType organisation);
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    au.gov.asic.types.bn.OrganisationType addNewOrganisation();
    
    /**
     * Unsets the "organisation" element
     */
    void unsetOrganisation();
    
    /**
     * Gets the "ownerType" element
     */
    au.gov.asic.types.bn.BusinessEntityType.OwnerType.Enum getOwnerType();
    
    /**
     * Gets (as xml) the "ownerType" element
     */
    au.gov.asic.types.bn.BusinessEntityType.OwnerType xgetOwnerType();
    
    /**
     * True if has "ownerType" element
     */
    boolean isSetOwnerType();
    
    /**
     * Sets the "ownerType" element
     */
    void setOwnerType(au.gov.asic.types.bn.BusinessEntityType.OwnerType.Enum ownerType);
    
    /**
     * Sets (as xml) the "ownerType" element
     */
    void xsetOwnerType(au.gov.asic.types.bn.BusinessEntityType.OwnerType ownerType);
    
    /**
     * Unsets the "ownerType" element
     */
    void unsetOwnerType();
    
    /**
     * Gets array of all "associate" elements
     */
    au.gov.asic.types.bn.AssociateType[] getAssociateArray();
    
    /**
     * Gets ith "associate" element
     */
    au.gov.asic.types.bn.AssociateType getAssociateArray(int i);
    
    /**
     * Returns number of "associate" element
     */
    int sizeOfAssociateArray();
    
    /**
     * Sets array of all "associate" element
     */
    void setAssociateArray(au.gov.asic.types.bn.AssociateType[] associateArray);
    
    /**
     * Sets ith "associate" element
     */
    void setAssociateArray(int i, au.gov.asic.types.bn.AssociateType associate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "associate" element
     */
    au.gov.asic.types.bn.AssociateType insertNewAssociate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "associate" element
     */
    au.gov.asic.types.bn.AssociateType addNewAssociate();
    
    /**
     * Removes the ith "associate" element
     */
    void removeAssociate(int i);
    
    /**
     * Gets the "dateReview" element
     */
    java.util.Calendar getDateReview();
    
    /**
     * Gets (as xml) the "dateReview" element
     */
    org.apache.xmlbeans.XmlDate xgetDateReview();
    
    /**
     * True if has "dateReview" element
     */
    boolean isSetDateReview();
    
    /**
     * Sets the "dateReview" element
     */
    void setDateReview(java.util.Calendar dateReview);
    
    /**
     * Sets (as xml) the "dateReview" element
     */
    void xsetDateReview(org.apache.xmlbeans.XmlDate dateReview);
    
    /**
     * Unsets the "dateReview" element
     */
    void unsetDateReview();
    
    /**
     * An XML ownerType(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BusinessEntityType$OwnerType.
     */
    public interface OwnerType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OwnerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("ownertypeada0elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum IND = Enum.forString("IND");
        static final Enum IB = Enum.forString("IB");
        static final Enum PTSH = Enum.forString("PTSH");
        static final Enum USTR = Enum.forString("USTR");
        static final Enum JV = Enum.forString("JV");
        
        static final int INT_IND = Enum.INT_IND;
        static final int INT_IB = Enum.INT_IB;
        static final int INT_PTSH = Enum.INT_PTSH;
        static final int INT_USTR = Enum.INT_USTR;
        static final int INT_JV = Enum.INT_JV;
        
        /**
         * Enumeration value class for au.gov.asic.types.bn.BusinessEntityType$OwnerType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_IND
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
            
            static final int INT_IND = 1;
            static final int INT_IB = 2;
            static final int INT_PTSH = 3;
            static final int INT_USTR = 4;
            static final int INT_JV = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("IND", INT_IND),
                    new Enum("IB", INT_IB),
                    new Enum("PTSH", INT_PTSH),
                    new Enum("USTR", INT_USTR),
                    new Enum("JV", INT_JV),
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
            public static au.gov.asic.types.bn.BusinessEntityType.OwnerType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.bn.BusinessEntityType.OwnerType) type.newValue( obj ); }
            
            public static au.gov.asic.types.bn.BusinessEntityType.OwnerType newInstance() {
              return (au.gov.asic.types.bn.BusinessEntityType.OwnerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.bn.BusinessEntityType.OwnerType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.bn.BusinessEntityType.OwnerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.BusinessEntityType newInstance() {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.BusinessEntityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BusinessEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.BusinessEntityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.BusinessEntityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
