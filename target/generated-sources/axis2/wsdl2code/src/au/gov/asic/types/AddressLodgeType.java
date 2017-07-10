/*
 * XML Type:  addressLodgeType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AddressLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML addressLodgeType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface AddressLodgeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLodgeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addresslodgetypec041type");
    
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
    au.gov.asic.types.AddressLodgeType.CareOf xgetCareOf();
    
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
    void xsetCareOf(au.gov.asic.types.AddressLodgeType.CareOf careOf);
    
    /**
     * Unsets the "careOf" element
     */
    void unsetCareOf();
    
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
     * Gets the "DPID" element
     */
    java.lang.String getDPID();
    
    /**
     * Gets (as xml) the "DPID" element
     */
    au.gov.asic.types.AddressLodgeType.DPID xgetDPID();
    
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
    void xsetDPID(au.gov.asic.types.AddressLodgeType.DPID dpid);
    
    /**
     * Unsets the "DPID" element
     */
    void unsetDPID();
    
    /**
     * Gets the "physicalAddress" element
     */
    au.gov.asic.types.AddressLodgeType.PhysicalAddress getPhysicalAddress();
    
    /**
     * True if has "physicalAddress" element
     */
    boolean isSetPhysicalAddress();
    
    /**
     * Sets the "physicalAddress" element
     */
    void setPhysicalAddress(au.gov.asic.types.AddressLodgeType.PhysicalAddress physicalAddress);
    
    /**
     * Appends and returns a new empty "physicalAddress" element
     */
    au.gov.asic.types.AddressLodgeType.PhysicalAddress addNewPhysicalAddress();
    
    /**
     * Unsets the "physicalAddress" element
     */
    void unsetPhysicalAddress();
    
    /**
     * Gets the "unstructuredAddress" element
     */
    au.gov.asic.types.AddressLodgeType.UnstructuredAddress getUnstructuredAddress();
    
    /**
     * True if has "unstructuredAddress" element
     */
    boolean isSetUnstructuredAddress();
    
    /**
     * Sets the "unstructuredAddress" element
     */
    void setUnstructuredAddress(au.gov.asic.types.AddressLodgeType.UnstructuredAddress unstructuredAddress);
    
    /**
     * Appends and returns a new empty "unstructuredAddress" element
     */
    au.gov.asic.types.AddressLodgeType.UnstructuredAddress addNewUnstructuredAddress();
    
    /**
     * Unsets the "unstructuredAddress" element
     */
    void unsetUnstructuredAddress();
    
    /**
     * Gets the "semiStructuredPhysicalAddress" element
     */
    au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress getSemiStructuredPhysicalAddress();
    
    /**
     * True if has "semiStructuredPhysicalAddress" element
     */
    boolean isSetSemiStructuredPhysicalAddress();
    
    /**
     * Sets the "semiStructuredPhysicalAddress" element
     */
    void setSemiStructuredPhysicalAddress(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress semiStructuredPhysicalAddress);
    
    /**
     * Appends and returns a new empty "semiStructuredPhysicalAddress" element
     */
    au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress addNewSemiStructuredPhysicalAddress();
    
    /**
     * Unsets the "semiStructuredPhysicalAddress" element
     */
    void unsetSemiStructuredPhysicalAddress();
    
    /**
     * An XML careOf(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$CareOf.
     */
    public interface CareOf extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareOf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("careofa55delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressLodgeType.CareOf newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressLodgeType.CareOf) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressLodgeType.CareOf newInstance() {
              return (au.gov.asic.types.AddressLodgeType.CareOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressLodgeType.CareOf newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressLodgeType.CareOf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DPID(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$DPID.
     */
    public interface DPID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DPID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("dpidec5eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressLodgeType.DPID newValue(java.lang.Object obj) {
              return (au.gov.asic.types.AddressLodgeType.DPID) type.newValue( obj ); }
            
            public static au.gov.asic.types.AddressLodgeType.DPID newInstance() {
              return (au.gov.asic.types.AddressLodgeType.DPID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressLodgeType.DPID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressLodgeType.DPID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML physicalAddress(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface PhysicalAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhysicalAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("physicaladdress56d8elemtype");
        
        /**
         * Gets the "floorNumber" element
         */
        java.lang.String getFloorNumber();
        
        /**
         * Gets (as xml) the "floorNumber" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber xgetFloorNumber();
        
        /**
         * True if has "floorNumber" element
         */
        boolean isSetFloorNumber();
        
        /**
         * Sets the "floorNumber" element
         */
        void setFloorNumber(java.lang.String floorNumber);
        
        /**
         * Sets (as xml) the "floorNumber" element
         */
        void xsetFloorNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber floorNumber);
        
        /**
         * Unsets the "floorNumber" element
         */
        void unsetFloorNumber();
        
        /**
         * Gets the "propertyName" element
         */
        java.lang.String getPropertyName();
        
        /**
         * Gets (as xml) the "propertyName" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName xgetPropertyName();
        
        /**
         * True if has "propertyName" element
         */
        boolean isSetPropertyName();
        
        /**
         * Sets the "propertyName" element
         */
        void setPropertyName(java.lang.String propertyName);
        
        /**
         * Sets (as xml) the "propertyName" element
         */
        void xsetPropertyName(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName propertyName);
        
        /**
         * Unsets the "propertyName" element
         */
        void unsetPropertyName();
        
        /**
         * Gets the "unitOrOfficeNumber" element
         */
        java.lang.String getUnitOrOfficeNumber();
        
        /**
         * Gets (as xml) the "unitOrOfficeNumber" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber xgetUnitOrOfficeNumber();
        
        /**
         * True if has "unitOrOfficeNumber" element
         */
        boolean isSetUnitOrOfficeNumber();
        
        /**
         * Sets the "unitOrOfficeNumber" element
         */
        void setUnitOrOfficeNumber(java.lang.String unitOrOfficeNumber);
        
        /**
         * Sets (as xml) the "unitOrOfficeNumber" element
         */
        void xsetUnitOrOfficeNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber unitOrOfficeNumber);
        
        /**
         * Unsets the "unitOrOfficeNumber" element
         */
        void unsetUnitOrOfficeNumber();
        
        /**
         * Gets the "streetNumber" element
         */
        java.lang.String getStreetNumber();
        
        /**
         * Gets (as xml) the "streetNumber" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber xgetStreetNumber();
        
        /**
         * True if has "streetNumber" element
         */
        boolean isSetStreetNumber();
        
        /**
         * Sets the "streetNumber" element
         */
        void setStreetNumber(java.lang.String streetNumber);
        
        /**
         * Sets (as xml) the "streetNumber" element
         */
        void xsetStreetNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber streetNumber);
        
        /**
         * Unsets the "streetNumber" element
         */
        void unsetStreetNumber();
        
        /**
         * Gets the "streetName" element
         */
        java.lang.String getStreetName();
        
        /**
         * Gets (as xml) the "streetName" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName xgetStreetName();
        
        /**
         * True if has "streetName" element
         */
        boolean isSetStreetName();
        
        /**
         * Sets the "streetName" element
         */
        void setStreetName(java.lang.String streetName);
        
        /**
         * Sets (as xml) the "streetName" element
         */
        void xsetStreetName(au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName streetName);
        
        /**
         * Unsets the "streetName" element
         */
        void unsetStreetName();
        
        /**
         * Gets the "streetType" element
         */
        java.lang.String getStreetType();
        
        /**
         * Gets (as xml) the "streetType" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType xgetStreetType();
        
        /**
         * True if has "streetType" element
         */
        boolean isSetStreetType();
        
        /**
         * Sets the "streetType" element
         */
        void setStreetType(java.lang.String streetType);
        
        /**
         * Sets (as xml) the "streetType" element
         */
        void xsetStreetType(au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType streetType);
        
        /**
         * Unsets the "streetType" element
         */
        void unsetStreetType();
        
        /**
         * Gets the "postalDeliveryType" element
         */
        java.lang.String getPostalDeliveryType();
        
        /**
         * Gets (as xml) the "postalDeliveryType" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType xgetPostalDeliveryType();
        
        /**
         * True if has "postalDeliveryType" element
         */
        boolean isSetPostalDeliveryType();
        
        /**
         * Sets the "postalDeliveryType" element
         */
        void setPostalDeliveryType(java.lang.String postalDeliveryType);
        
        /**
         * Sets (as xml) the "postalDeliveryType" element
         */
        void xsetPostalDeliveryType(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType postalDeliveryType);
        
        /**
         * Unsets the "postalDeliveryType" element
         */
        void unsetPostalDeliveryType();
        
        /**
         * Gets the "postalDeliveryNumber" element
         */
        java.lang.String getPostalDeliveryNumber();
        
        /**
         * Gets (as xml) the "postalDeliveryNumber" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber xgetPostalDeliveryNumber();
        
        /**
         * True if has "postalDeliveryNumber" element
         */
        boolean isSetPostalDeliveryNumber();
        
        /**
         * Sets the "postalDeliveryNumber" element
         */
        void setPostalDeliveryNumber(java.lang.String postalDeliveryNumber);
        
        /**
         * Sets (as xml) the "postalDeliveryNumber" element
         */
        void xsetPostalDeliveryNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber postalDeliveryNumber);
        
        /**
         * Unsets the "postalDeliveryNumber" element
         */
        void unsetPostalDeliveryNumber();
        
        /**
         * Gets the "locality" element
         */
        java.lang.String getLocality();
        
        /**
         * Gets (as xml) the "locality" element
         */
        org.apache.xmlbeans.XmlString xgetLocality();
        
        /**
         * Sets the "locality" element
         */
        void setLocality(java.lang.String locality);
        
        /**
         * Sets (as xml) the "locality" element
         */
        void xsetLocality(org.apache.xmlbeans.XmlString locality);
        
        /**
         * Gets the "state" element
         */
        au.gov.asic.types.StateTerritoryCodeType.Enum getState();
        
        /**
         * Gets (as xml) the "state" element
         */
        au.gov.asic.types.StateTerritoryCodeType xgetState();
        
        /**
         * Sets the "state" element
         */
        void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state);
        
        /**
         * Sets (as xml) the "state" element
         */
        void xsetState(au.gov.asic.types.StateTerritoryCodeType state);
        
        /**
         * Gets the "postCode" element
         */
        java.lang.String getPostCode();
        
        /**
         * Gets (as xml) the "postCode" element
         */
        au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode xgetPostCode();
        
        /**
         * Sets the "postCode" element
         */
        void setPostCode(java.lang.String postCode);
        
        /**
         * Sets (as xml) the "postCode" element
         */
        void xsetPostCode(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode postCode);
        
        /**
         * An XML floorNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$FloorNumber.
         */
        public interface FloorNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FloorNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("floornumberfb57elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML propertyName(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PropertyName.
         */
        public interface PropertyName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("propertynamec6bcelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML unitOrOfficeNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$UnitOrOfficeNumber.
         */
        public interface UnitOrOfficeNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnitOrOfficeNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("unitorofficenumberd5f0elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML streetNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$StreetNumber.
         */
        public interface StreetNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreetNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("streetnumber6c10elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML streetName(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$StreetName.
         */
        public interface StreetName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreetName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("streetnamec0ceelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML streetType(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$StreetType.
         */
        public interface StreetType extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StreetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("streettype32bfelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML postalDeliveryType(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PostalDeliveryType.
         */
        public interface PostalDeliveryType extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostalDeliveryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postaldeliverytype4d63elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML postalDeliveryNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PostalDeliveryNumber.
         */
        public interface PostalDeliveryNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostalDeliveryNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postaldeliverynumber6db4elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML postCode(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PostCode.
         */
        public interface PostCode extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postcode19efelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressLodgeType.PhysicalAddress newInstance() {
              return (au.gov.asic.types.AddressLodgeType.PhysicalAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressLodgeType.PhysicalAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressLodgeType.PhysicalAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML unstructuredAddress(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface UnstructuredAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnstructuredAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("unstructuredaddress3cabelemtype");
        
        /**
         * Gets the "addressLine1" element
         */
        java.lang.String getAddressLine1();
        
        /**
         * Gets (as xml) the "addressLine1" element
         */
        au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 xgetAddressLine1();
        
        /**
         * Sets the "addressLine1" element
         */
        void setAddressLine1(java.lang.String addressLine1);
        
        /**
         * Sets (as xml) the "addressLine1" element
         */
        void xsetAddressLine1(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 addressLine1);
        
        /**
         * Gets the "addressLine2" element
         */
        java.lang.String getAddressLine2();
        
        /**
         * Gets (as xml) the "addressLine2" element
         */
        au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 xgetAddressLine2();
        
        /**
         * Sets the "addressLine2" element
         */
        void setAddressLine2(java.lang.String addressLine2);
        
        /**
         * Sets (as xml) the "addressLine2" element
         */
        void xsetAddressLine2(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 addressLine2);
        
        /**
         * Gets the "addressLine3" element
         */
        java.lang.String getAddressLine3();
        
        /**
         * Gets (as xml) the "addressLine3" element
         */
        au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 xgetAddressLine3();
        
        /**
         * True if has "addressLine3" element
         */
        boolean isSetAddressLine3();
        
        /**
         * Sets the "addressLine3" element
         */
        void setAddressLine3(java.lang.String addressLine3);
        
        /**
         * Sets (as xml) the "addressLine3" element
         */
        void xsetAddressLine3(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 addressLine3);
        
        /**
         * Unsets the "addressLine3" element
         */
        void unsetAddressLine3();
        
        /**
         * Gets the "addressLine4" element
         */
        java.lang.String getAddressLine4();
        
        /**
         * Gets (as xml) the "addressLine4" element
         */
        au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 xgetAddressLine4();
        
        /**
         * True if has "addressLine4" element
         */
        boolean isSetAddressLine4();
        
        /**
         * Sets the "addressLine4" element
         */
        void setAddressLine4(java.lang.String addressLine4);
        
        /**
         * Sets (as xml) the "addressLine4" element
         */
        void xsetAddressLine4(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 addressLine4);
        
        /**
         * Unsets the "addressLine4" element
         */
        void unsetAddressLine4();
        
        /**
         * An XML addressLine1(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine1.
         */
        public interface AddressLine1 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLine1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressline15846elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML addressLine2(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine2.
         */
        public interface AddressLine2 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLine2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressline25c25elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML addressLine3(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine3.
         */
        public interface AddressLine3 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLine3.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressline36004elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML addressLine4(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine4.
         */
        public interface AddressLine4 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLine4.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressline463e3elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress newInstance() {
              return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressLodgeType.UnstructuredAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressLodgeType.UnstructuredAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML semiStructuredPhysicalAddress(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface SemiStructuredPhysicalAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SemiStructuredPhysicalAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("semistructuredphysicaladdressa357elemtype");
        
        /**
         * Gets the "addressLine1" element
         */
        java.lang.String getAddressLine1();
        
        /**
         * Gets (as xml) the "addressLine1" element
         */
        au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 xgetAddressLine1();
        
        /**
         * Sets the "addressLine1" element
         */
        void setAddressLine1(java.lang.String addressLine1);
        
        /**
         * Sets (as xml) the "addressLine1" element
         */
        void xsetAddressLine1(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 addressLine1);
        
        /**
         * Gets the "addressLine2" element
         */
        java.lang.String getAddressLine2();
        
        /**
         * Gets (as xml) the "addressLine2" element
         */
        au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 xgetAddressLine2();
        
        /**
         * True if has "addressLine2" element
         */
        boolean isSetAddressLine2();
        
        /**
         * Sets the "addressLine2" element
         */
        void setAddressLine2(java.lang.String addressLine2);
        
        /**
         * Sets (as xml) the "addressLine2" element
         */
        void xsetAddressLine2(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 addressLine2);
        
        /**
         * Unsets the "addressLine2" element
         */
        void unsetAddressLine2();
        
        /**
         * Gets the "locality" element
         */
        java.lang.String getLocality();
        
        /**
         * Gets (as xml) the "locality" element
         */
        org.apache.xmlbeans.XmlString xgetLocality();
        
        /**
         * Sets the "locality" element
         */
        void setLocality(java.lang.String locality);
        
        /**
         * Sets (as xml) the "locality" element
         */
        void xsetLocality(org.apache.xmlbeans.XmlString locality);
        
        /**
         * Gets the "state" element
         */
        au.gov.asic.types.StateTerritoryCodeType.Enum getState();
        
        /**
         * Gets (as xml) the "state" element
         */
        au.gov.asic.types.StateTerritoryCodeType xgetState();
        
        /**
         * Sets the "state" element
         */
        void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state);
        
        /**
         * Sets (as xml) the "state" element
         */
        void xsetState(au.gov.asic.types.StateTerritoryCodeType state);
        
        /**
         * Gets the "postCode" element
         */
        java.lang.String getPostCode();
        
        /**
         * Gets (as xml) the "postCode" element
         */
        au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode xgetPostCode();
        
        /**
         * Sets the "postCode" element
         */
        void setPostCode(java.lang.String postCode);
        
        /**
         * Sets (as xml) the "postCode" element
         */
        void xsetPostCode(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode postCode);
        
        /**
         * An XML addressLine1(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$SemiStructuredPhysicalAddress$AddressLine1.
         */
        public interface AddressLine1 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLine1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressline13932elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML addressLine2(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$SemiStructuredPhysicalAddress$AddressLine2.
         */
        public interface AddressLine2 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressLine2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressline23251elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML postCode(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$SemiStructuredPhysicalAddress$PostCode.
         */
        public interface PostCode extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postcodeb22eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode) type.newValue( obj ); }
                
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode newInstance() {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress newInstance() {
              return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.AddressLodgeType newInstance() {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.AddressLodgeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.AddressLodgeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.AddressLodgeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.AddressLodgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.AddressLodgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.AddressLodgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
