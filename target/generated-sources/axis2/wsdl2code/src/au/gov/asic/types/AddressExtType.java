/*
 * XML Type:  addressExtType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AddressExtType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML addressExtType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface AddressExtType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressExtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressexttype7943type");
    
    /**
     * Gets the "type" element
     */
    au.gov.asic.types.AddressTypeType.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    au.gov.asic.types.AddressTypeType xgetType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(au.gov.asic.types.AddressTypeType.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(au.gov.asic.types.AddressTypeType type);
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "careOf" element
     */
    java.lang.String getCareOf();
    
    /**
     * Gets (as xml) the "careOf" element
     */
    au.gov.asic.types.AddressExtType.CareOf xgetCareOf();
    
    /**
     * True if has "careOf" element
     */
    boolean isSetCareOf();
    
    /**
     * Sets the "careOf" element
     */
    void setCareOf(java.lang.String careOf);
    
    /**
     * Sets (as xml) the "careOf" element
     */
    void xsetCareOf(au.gov.asic.types.AddressExtType.CareOf careOf);
    
    /**
     * Unsets the "careOf" element
     */
    void unsetCareOf();
    
    /**
     * Gets array of all "addressLine" elements
     */
    java.lang.String[] getAddressLineArray();
    
    /**
     * Gets ith "addressLine" element
     */
    java.lang.String getAddressLineArray(int i);
    
    /**
     * Gets (as xml) array of all "addressLine" elements
     */
    org.apache.xmlbeans.XmlString[] xgetAddressLineArray();
    
    /**
     * Gets (as xml) ith "addressLine" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLineArray(int i);
    
    /**
     * Returns number of "addressLine" element
     */
    int sizeOfAddressLineArray();
    
    /**
     * Sets array of all "addressLine" element
     */
    void setAddressLineArray(java.lang.String[] addressLineArray);
    
    /**
     * Sets ith "addressLine" element
     */
    void setAddressLineArray(int i, java.lang.String addressLine);
    
    /**
     * Sets (as xml) array of all "addressLine" element
     */
    void xsetAddressLineArray(org.apache.xmlbeans.XmlString[] addressLineArray);
    
    /**
     * Sets (as xml) ith "addressLine" element
     */
    void xsetAddressLineArray(int i, org.apache.xmlbeans.XmlString addressLine);
    
    /**
     * Inserts the value as the ith "addressLine" element
     */
    void insertAddressLine(int i, java.lang.String addressLine);
    
    /**
     * Appends the value as the last "addressLine" element
     */
    void addAddressLine(java.lang.String addressLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addressLine" element
     */
    org.apache.xmlbeans.XmlString insertNewAddressLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addressLine" element
     */
    org.apache.xmlbeans.XmlString addNewAddressLine();
    
    /**
     * Removes the ith "addressLine" element
     */
    void removeAddressLine(int i);
    
    /**
     * Gets the "iso3166CountryCode" element
     */
    java.lang.String getIso3166CountryCode();
    
    /**
     * Gets (as xml) the "iso3166CountryCode" element
     */
    au.gov.asic.types.AddressExtType.Iso3166CountryCode xgetIso3166CountryCode();
    
    /**
     * True if has "iso3166CountryCode" element
     */
    boolean isSetIso3166CountryCode();
    
    /**
     * Sets the "iso3166CountryCode" element
     */
    void setIso3166CountryCode(java.lang.String iso3166CountryCode);
    
    /**
     * Sets (as xml) the "iso3166CountryCode" element
     */
    void xsetIso3166CountryCode(au.gov.asic.types.AddressExtType.Iso3166CountryCode iso3166CountryCode);
    
    /**
     * Unsets the "iso3166CountryCode" element
     */
    void unsetIso3166CountryCode();
    
    /**
     * Gets the "country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "country" element
     */
    void unsetCountry();
    
    /**
     * Gets the "DPID" element
     */
    java.lang.String getDPID();
    
    /**
     * Gets (as xml) the "DPID" element
     */
    au.gov.asic.types.AddressExtType.DPID xgetDPID();
    
    /**
     * True if has "DPID" element
     */
    boolean isSetDPID();
    
    /**
     * Sets the "DPID" element
     */
    void setDPID(java.lang.String dpid);
    
    /**
     * Sets (as xml) the "DPID" element
     */
    void xsetDPID(au.gov.asic.types.AddressExtType.DPID dpid);
    
    /**
     * Unsets the "DPID" element
     */
    void unsetDPID();
    
    /**
     * Gets the "street" element
     */
    au.gov.asic.types.StreetType getStreet();
    
    /**
     * True if has "street" element
     */
    boolean isSetStreet();
    
    /**
     * Sets the "street" element
     */
    void setStreet(au.gov.asic.types.StreetType street);
    
    /**
     * Appends and returns a new empty "street" element
     */
    au.gov.asic.types.StreetType addNewStreet();
    
    /**
     * Unsets the "street" element
     */
    void unsetStreet();
    
    /**
     * Gets the "locality" element
     */
    java.lang.String getLocality();
    
    /**
     * Gets (as xml) the "locality" element
     */
    au.gov.asic.types.AddressExtType.Locality xgetLocality();
    
    /**
     * True if has "locality" element
     */
    boolean isSetLocality();
    
    /**
     * Sets the "locality" element
     */
    void setLocality(java.lang.String locality);
    
    /**
     * Sets (as xml) the "locality" element
     */
    void xsetLocality(au.gov.asic.types.AddressExtType.Locality locality);
    
    /**
     * Unsets the "locality" element
     */
    void unsetLocality();
    
    /**
     * Gets the "postCode" element
     */
    java.lang.String getPostCode();
    
    /**
     * Gets (as xml) the "postCode" element
     */
    au.gov.asic.types.AddressExtType.PostCode xgetPostCode();
    
    /**
     * True if has "postCode" element
     */
    boolean isSetPostCode();
    
    /**
     * Sets the "postCode" element
     */
    void setPostCode(java.lang.String postCode);
    
    /**
     * Sets (as xml) the "postCode" element
     */
    void xsetPostCode(au.gov.asic.types.AddressExtType.PostCode postCode);
    
    /**
     * Unsets the "postCode" element
     */
    void unsetPostCode();
    
    /**
     * Gets the "state" element
     */
    au.gov.asic.types.StateTerritoryCodeType.Enum getState();
    
    /**
     * Gets (as xml) the "state" element
     */
    au.gov.asic.types.StateTerritoryCodeType xgetState();
    
    /**
     * True if has "state" element
     */
    boolean isSetState();
    
    /**
     * Sets the "state" element
     */
    void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state);
    
    /**
     * Sets (as xml) the "state" element
     */
    void xsetState(au.gov.asic.types.StateTerritoryCodeType state);
    
    /**
     * Unsets the "state" element
     */
    void unsetState();
    
    /**
     * Gets the "override" element
     */
    boolean getOverride();
    
    /**
     * Gets (as xml) the "override" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOverride();
    
    /**
     * True if has "override" element
     */
    boolean isSetOverride();
    
    /**
     * Sets the "override" element
     */
    void setOverride(boolean override);
    
    /**
     * Sets (as xml) the "override" element
     */
    void xsetOverride(org.apache.xmlbeans.XmlBoolean override);
    
    /**
     * Unsets the "override" element
     */
    void unsetOverride();
    
    /**
     * Gets the "action" element
     */
    au.gov.asic.types.AddressExtType.Action.Enum getAction();
    
    /**
     * Gets (as xml) the "action" element
     */
    au.gov.asic.types.AddressExtType.Action xgetAction();
    
    /**
     * True if has "action" element
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" element
     */
    void setAction(au.gov.asic.types.AddressExtType.Action.Enum action);
    
    /**
     * Sets (as xml) the "action" element
     */
    void xsetAction(au.gov.asic.types.AddressExtType.Action action);
    
    /**
     * Unsets the "action" element
     */
    void unsetAction();
    
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
     * An XML careOf(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$CareOf.
     */
    public interface CareOf extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("careoff55felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressExtType.CareOf newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressExtType.CareOf) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressExtType.CareOf newInstance() {
              return (au.gov.asic.types.AddressExtType.CareOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressExtType.CareOf newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressExtType.CareOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML iso3166CountryCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$Iso3166CountryCode.
     */
    public interface Iso3166CountryCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Iso3166CountryCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("iso3166countrycodef827elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressExtType.Iso3166CountryCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressExtType.Iso3166CountryCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressExtType.Iso3166CountryCode newInstance() {
              return (au.gov.asic.types.AddressExtType.Iso3166CountryCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressExtType.Iso3166CountryCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressExtType.Iso3166CountryCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DPID(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$DPID.
     */
    public interface DPID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DPID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("dpid08a0elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressExtType.DPID newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressExtType.DPID) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressExtType.DPID newInstance() {
              return (au.gov.asic.types.AddressExtType.DPID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressExtType.DPID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressExtType.DPID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML locality(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$Locality.
     */
    public interface Locality extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Locality.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("localityda64elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressExtType.Locality newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressExtType.Locality) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressExtType.Locality newInstance() {
              return (au.gov.asic.types.AddressExtType.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressExtType.Locality newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressExtType.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML postCode(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$PostCode.
     */
    public interface PostCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postcode6ddaelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressExtType.PostCode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressExtType.PostCode) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressExtType.PostCode newInstance() {
              return (au.gov.asic.types.AddressExtType.PostCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressExtType.PostCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressExtType.PostCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML action(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressExtType$Action.
     */
    public interface Action extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("actiondc31elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ADD = Enum.forString("ADD");
        static final Enum REMOVE = Enum.forString("REMOVE");
        
        static final int INT_ADD = Enum.INT_ADD;
        static final int INT_REMOVE = Enum.INT_REMOVE;
        
        /**
         * Enumeration value class for au.gov.asic.types.AddressExtType$Action.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ADD
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
            
            static final int INT_ADD = 1;
            static final int INT_REMOVE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("ADD", INT_ADD),
                    new Enum("REMOVE", INT_REMOVE),
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
            public static au.gov.asic.types.AddressExtType.Action newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressExtType.Action) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressExtType.Action newInstance() {
              return (au.gov.asic.types.AddressExtType.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressExtType.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressExtType.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.AddressExtType newInstance() {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.AddressExtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.AddressExtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.AddressExtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.AddressExtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.AddressExtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.AddressExtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.AddressExtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.AddressExtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.AddressExtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
