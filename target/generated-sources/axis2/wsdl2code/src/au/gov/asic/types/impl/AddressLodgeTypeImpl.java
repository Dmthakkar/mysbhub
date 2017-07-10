/*
 * XML Type:  addressLodgeType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AddressLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML addressLodgeType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AddressLodgeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AddressLodgeType
{
    
    public AddressLodgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName CAREOF$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "careOf");
    private static final javax.xml.namespace.QName COUNTRY$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "country");
    private static final javax.xml.namespace.QName STARTDATE$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "startDate");
    private static final javax.xml.namespace.QName DPID$8 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "DPID");
    private static final javax.xml.namespace.QName PHYSICALADDRESS$10 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "physicalAddress");
    private static final javax.xml.namespace.QName UNSTRUCTUREDADDRESS$12 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "unstructuredAddress");
    private static final javax.xml.namespace.QName SEMISTRUCTUREDPHYSICALADDRESS$14 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "semiStructuredPhysicalAddress");
    
    
    /**
     * Gets the "type" element
     */
    public au.gov.asic.types.AddressTypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.AddressTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public au.gov.asic.types.AddressTypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressTypeType target = null;
            target = (au.gov.asic.types.AddressTypeType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(au.gov.asic.types.AddressTypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(au.gov.asic.types.AddressTypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressTypeType target = null;
            target = (au.gov.asic.types.AddressTypeType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressTypeType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "careOf" element
     */
    public java.lang.String getCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "careOf" element
     */
    public au.gov.asic.types.AddressLodgeType.CareOf xgetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.CareOf target = null;
            target = (au.gov.asic.types.AddressLodgeType.CareOf)get_store().find_element_user(CAREOF$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "careOf" element
     */
    public boolean isSetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREOF$2) != 0;
        }
    }
    
    /**
     * Sets the "careOf" element
     */
    public void setCareOf(java.lang.String careOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREOF$2);
            }
            target.setStringValue(careOf);
        }
    }
    
    /**
     * Sets (as xml) the "careOf" element
     */
    public void xsetCareOf(au.gov.asic.types.AddressLodgeType.CareOf careOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.CareOf target = null;
            target = (au.gov.asic.types.AddressLodgeType.CareOf)get_store().find_element_user(CAREOF$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressLodgeType.CareOf)get_store().add_element_user(CAREOF$2);
            }
            target.set(careOf);
        }
    }
    
    /**
     * Unsets the "careOf" element
     */
    public void unsetCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREOF$2, 0);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$4) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$4);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$4);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$4, 0);
        }
    }
    
    /**
     * Gets the "startDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "startDate" element
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "startDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$6);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" element
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$6);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Unsets the "startDate" element
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATE$6, 0);
        }
    }
    
    /**
     * Gets the "DPID" element
     */
    public java.lang.String getDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DPID" element
     */
    public au.gov.asic.types.AddressLodgeType.DPID xgetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.DPID target = null;
            target = (au.gov.asic.types.AddressLodgeType.DPID)get_store().find_element_user(DPID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "DPID" element
     */
    public boolean isSetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DPID$8) != 0;
        }
    }
    
    /**
     * Sets the "DPID" element
     */
    public void setDPID(java.lang.String dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DPID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DPID$8);
            }
            target.setStringValue(dpid);
        }
    }
    
    /**
     * Sets (as xml) the "DPID" element
     */
    public void xsetDPID(au.gov.asic.types.AddressLodgeType.DPID dpid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.DPID target = null;
            target = (au.gov.asic.types.AddressLodgeType.DPID)get_store().find_element_user(DPID$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressLodgeType.DPID)get_store().add_element_user(DPID$8);
            }
            target.set(dpid);
        }
    }
    
    /**
     * Unsets the "DPID" element
     */
    public void unsetDPID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DPID$8, 0);
        }
    }
    
    /**
     * Gets the "physicalAddress" element
     */
    public au.gov.asic.types.AddressLodgeType.PhysicalAddress getPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.PhysicalAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress)get_store().find_element_user(PHYSICALADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "physicalAddress" element
     */
    public boolean isSetPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHYSICALADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "physicalAddress" element
     */
    public void setPhysicalAddress(au.gov.asic.types.AddressLodgeType.PhysicalAddress physicalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.PhysicalAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress)get_store().find_element_user(PHYSICALADDRESS$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress)get_store().add_element_user(PHYSICALADDRESS$10);
            }
            target.set(physicalAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "physicalAddress" element
     */
    public au.gov.asic.types.AddressLodgeType.PhysicalAddress addNewPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.PhysicalAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress)get_store().add_element_user(PHYSICALADDRESS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "physicalAddress" element
     */
    public void unsetPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHYSICALADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "unstructuredAddress" element
     */
    public au.gov.asic.types.AddressLodgeType.UnstructuredAddress getUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.UnstructuredAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress)get_store().find_element_user(UNSTRUCTUREDADDRESS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "unstructuredAddress" element
     */
    public boolean isSetUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSTRUCTUREDADDRESS$12) != 0;
        }
    }
    
    /**
     * Sets the "unstructuredAddress" element
     */
    public void setUnstructuredAddress(au.gov.asic.types.AddressLodgeType.UnstructuredAddress unstructuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.UnstructuredAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress)get_store().find_element_user(UNSTRUCTUREDADDRESS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress)get_store().add_element_user(UNSTRUCTUREDADDRESS$12);
            }
            target.set(unstructuredAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "unstructuredAddress" element
     */
    public au.gov.asic.types.AddressLodgeType.UnstructuredAddress addNewUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.UnstructuredAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress)get_store().add_element_user(UNSTRUCTUREDADDRESS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "unstructuredAddress" element
     */
    public void unsetUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSTRUCTUREDADDRESS$12, 0);
        }
    }
    
    /**
     * Gets the "semiStructuredPhysicalAddress" element
     */
    public au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress getSemiStructuredPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress)get_store().find_element_user(SEMISTRUCTUREDPHYSICALADDRESS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "semiStructuredPhysicalAddress" element
     */
    public boolean isSetSemiStructuredPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEMISTRUCTUREDPHYSICALADDRESS$14) != 0;
        }
    }
    
    /**
     * Sets the "semiStructuredPhysicalAddress" element
     */
    public void setSemiStructuredPhysicalAddress(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress semiStructuredPhysicalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress)get_store().find_element_user(SEMISTRUCTUREDPHYSICALADDRESS$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress)get_store().add_element_user(SEMISTRUCTUREDPHYSICALADDRESS$14);
            }
            target.set(semiStructuredPhysicalAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "semiStructuredPhysicalAddress" element
     */
    public au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress addNewSemiStructuredPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress target = null;
            target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress)get_store().add_element_user(SEMISTRUCTUREDPHYSICALADDRESS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "semiStructuredPhysicalAddress" element
     */
    public void unsetSemiStructuredPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEMISTRUCTUREDPHYSICALADDRESS$14, 0);
        }
    }
    /**
     * An XML careOf(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$CareOf.
     */
    public static class CareOfImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.CareOf
    {
        
        public CareOfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CareOfImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML DPID(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$DPID.
     */
    public static class DPIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.DPID
    {
        
        public DPIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DPIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML physicalAddress(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class PhysicalAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AddressLodgeType.PhysicalAddress
    {
        
        public PhysicalAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FLOORNUMBER$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "floorNumber");
        private static final javax.xml.namespace.QName PROPERTYNAME$2 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "propertyName");
        private static final javax.xml.namespace.QName UNITOROFFICENUMBER$4 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "unitOrOfficeNumber");
        private static final javax.xml.namespace.QName STREETNUMBER$6 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "streetNumber");
        private static final javax.xml.namespace.QName STREETNAME$8 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "streetName");
        private static final javax.xml.namespace.QName STREETTYPE$10 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "streetType");
        private static final javax.xml.namespace.QName POSTALDELIVERYTYPE$12 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "postalDeliveryType");
        private static final javax.xml.namespace.QName POSTALDELIVERYNUMBER$14 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "postalDeliveryNumber");
        private static final javax.xml.namespace.QName LOCALITY$16 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "locality");
        private static final javax.xml.namespace.QName STATE$18 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "state");
        private static final javax.xml.namespace.QName POSTCODE$20 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "postCode");
        
        
        /**
         * Gets the "floorNumber" element
         */
        public java.lang.String getFloorNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "floorNumber" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber xgetFloorNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber)get_store().find_element_user(FLOORNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "floorNumber" element
         */
        public boolean isSetFloorNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLOORNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "floorNumber" element
         */
        public void setFloorNumber(java.lang.String floorNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOORNUMBER$0);
                }
                target.setStringValue(floorNumber);
            }
        }
        
        /**
         * Sets (as xml) the "floorNumber" element
         */
        public void xsetFloorNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber floorNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber)get_store().find_element_user(FLOORNUMBER$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber)get_store().add_element_user(FLOORNUMBER$0);
                }
                target.set(floorNumber);
            }
        }
        
        /**
         * Unsets the "floorNumber" element
         */
        public void unsetFloorNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLOORNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "propertyName" element
         */
        public java.lang.String getPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "propertyName" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName xgetPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName)get_store().find_element_user(PROPERTYNAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "propertyName" element
         */
        public boolean isSetPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTYNAME$2) != 0;
            }
        }
        
        /**
         * Sets the "propertyName" element
         */
        public void setPropertyName(java.lang.String propertyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYNAME$2);
                }
                target.setStringValue(propertyName);
            }
        }
        
        /**
         * Sets (as xml) the "propertyName" element
         */
        public void xsetPropertyName(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName propertyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName)get_store().find_element_user(PROPERTYNAME$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName)get_store().add_element_user(PROPERTYNAME$2);
                }
                target.set(propertyName);
            }
        }
        
        /**
         * Unsets the "propertyName" element
         */
        public void unsetPropertyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTYNAME$2, 0);
            }
        }
        
        /**
         * Gets the "unitOrOfficeNumber" element
         */
        public java.lang.String getUnitOrOfficeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOROFFICENUMBER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "unitOrOfficeNumber" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber xgetUnitOrOfficeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber)get_store().find_element_user(UNITOROFFICENUMBER$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "unitOrOfficeNumber" element
         */
        public boolean isSetUnitOrOfficeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITOROFFICENUMBER$4) != 0;
            }
        }
        
        /**
         * Sets the "unitOrOfficeNumber" element
         */
        public void setUnitOrOfficeNumber(java.lang.String unitOrOfficeNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOROFFICENUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITOROFFICENUMBER$4);
                }
                target.setStringValue(unitOrOfficeNumber);
            }
        }
        
        /**
         * Sets (as xml) the "unitOrOfficeNumber" element
         */
        public void xsetUnitOrOfficeNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber unitOrOfficeNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber)get_store().find_element_user(UNITOROFFICENUMBER$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber)get_store().add_element_user(UNITOROFFICENUMBER$4);
                }
                target.set(unitOrOfficeNumber);
            }
        }
        
        /**
         * Unsets the "unitOrOfficeNumber" element
         */
        public void unsetUnitOrOfficeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITOROFFICENUMBER$4, 0);
            }
        }
        
        /**
         * Gets the "streetNumber" element
         */
        public java.lang.String getStreetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNUMBER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "streetNumber" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber xgetStreetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber)get_store().find_element_user(STREETNUMBER$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "streetNumber" element
         */
        public boolean isSetStreetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREETNUMBER$6) != 0;
            }
        }
        
        /**
         * Sets the "streetNumber" element
         */
        public void setStreetNumber(java.lang.String streetNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNUMBER$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETNUMBER$6);
                }
                target.setStringValue(streetNumber);
            }
        }
        
        /**
         * Sets (as xml) the "streetNumber" element
         */
        public void xsetStreetNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber streetNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber)get_store().find_element_user(STREETNUMBER$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber)get_store().add_element_user(STREETNUMBER$6);
                }
                target.set(streetNumber);
            }
        }
        
        /**
         * Unsets the "streetNumber" element
         */
        public void unsetStreetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREETNUMBER$6, 0);
            }
        }
        
        /**
         * Gets the "streetName" element
         */
        public java.lang.String getStreetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "streetName" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName xgetStreetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName)get_store().find_element_user(STREETNAME$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "streetName" element
         */
        public boolean isSetStreetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREETNAME$8) != 0;
            }
        }
        
        /**
         * Sets the "streetName" element
         */
        public void setStreetName(java.lang.String streetName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETNAME$8);
                }
                target.setStringValue(streetName);
            }
        }
        
        /**
         * Sets (as xml) the "streetName" element
         */
        public void xsetStreetName(au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName streetName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName)get_store().find_element_user(STREETNAME$8, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName)get_store().add_element_user(STREETNAME$8);
                }
                target.set(streetName);
            }
        }
        
        /**
         * Unsets the "streetName" element
         */
        public void unsetStreetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREETNAME$8, 0);
            }
        }
        
        /**
         * Gets the "streetType" element
         */
        public java.lang.String getStreetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETTYPE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "streetType" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType xgetStreetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType)get_store().find_element_user(STREETTYPE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "streetType" element
         */
        public boolean isSetStreetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREETTYPE$10) != 0;
            }
        }
        
        /**
         * Sets the "streetType" element
         */
        public void setStreetType(java.lang.String streetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETTYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETTYPE$10);
                }
                target.setStringValue(streetType);
            }
        }
        
        /**
         * Sets (as xml) the "streetType" element
         */
        public void xsetStreetType(au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType streetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType)get_store().find_element_user(STREETTYPE$10, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType)get_store().add_element_user(STREETTYPE$10);
                }
                target.set(streetType);
            }
        }
        
        /**
         * Unsets the "streetType" element
         */
        public void unsetStreetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREETTYPE$10, 0);
            }
        }
        
        /**
         * Gets the "postalDeliveryType" element
         */
        public java.lang.String getPostalDeliveryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALDELIVERYTYPE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postalDeliveryType" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType xgetPostalDeliveryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType)get_store().find_element_user(POSTALDELIVERYTYPE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "postalDeliveryType" element
         */
        public boolean isSetPostalDeliveryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTALDELIVERYTYPE$12) != 0;
            }
        }
        
        /**
         * Sets the "postalDeliveryType" element
         */
        public void setPostalDeliveryType(java.lang.String postalDeliveryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALDELIVERYTYPE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALDELIVERYTYPE$12);
                }
                target.setStringValue(postalDeliveryType);
            }
        }
        
        /**
         * Sets (as xml) the "postalDeliveryType" element
         */
        public void xsetPostalDeliveryType(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType postalDeliveryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType)get_store().find_element_user(POSTALDELIVERYTYPE$12, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType)get_store().add_element_user(POSTALDELIVERYTYPE$12);
                }
                target.set(postalDeliveryType);
            }
        }
        
        /**
         * Unsets the "postalDeliveryType" element
         */
        public void unsetPostalDeliveryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTALDELIVERYTYPE$12, 0);
            }
        }
        
        /**
         * Gets the "postalDeliveryNumber" element
         */
        public java.lang.String getPostalDeliveryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALDELIVERYNUMBER$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postalDeliveryNumber" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber xgetPostalDeliveryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber)get_store().find_element_user(POSTALDELIVERYNUMBER$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "postalDeliveryNumber" element
         */
        public boolean isSetPostalDeliveryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTALDELIVERYNUMBER$14) != 0;
            }
        }
        
        /**
         * Sets the "postalDeliveryNumber" element
         */
        public void setPostalDeliveryNumber(java.lang.String postalDeliveryNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALDELIVERYNUMBER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALDELIVERYNUMBER$14);
                }
                target.setStringValue(postalDeliveryNumber);
            }
        }
        
        /**
         * Sets (as xml) the "postalDeliveryNumber" element
         */
        public void xsetPostalDeliveryNumber(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber postalDeliveryNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber)get_store().find_element_user(POSTALDELIVERYNUMBER$14, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber)get_store().add_element_user(POSTALDELIVERYNUMBER$14);
                }
                target.set(postalDeliveryNumber);
            }
        }
        
        /**
         * Unsets the "postalDeliveryNumber" element
         */
        public void unsetPostalDeliveryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTALDELIVERYNUMBER$14, 0);
            }
        }
        
        /**
         * Gets the "locality" element
         */
        public java.lang.String getLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locality" element
         */
        public org.apache.xmlbeans.XmlString xgetLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "locality" element
         */
        public void setLocality(java.lang.String locality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$16);
                }
                target.setStringValue(locality);
            }
        }
        
        /**
         * Sets (as xml) the "locality" element
         */
        public void xsetLocality(org.apache.xmlbeans.XmlString locality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALITY$16);
                }
                target.set(locality);
            }
        }
        
        /**
         * Gets the "state" element
         */
        public au.gov.asic.types.StateTerritoryCodeType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" element
         */
        public au.gov.asic.types.StateTerritoryCodeType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.StateTerritoryCodeType target = null;
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "state" element
         */
        public void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$18);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" element
         */
        public void xsetState(au.gov.asic.types.StateTerritoryCodeType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.StateTerritoryCodeType target = null;
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$18, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$18);
                }
                target.set(state);
            }
        }
        
        /**
         * Gets the "postCode" element
         */
        public java.lang.String getPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postCode" element
         */
        public au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode xgetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode)get_store().find_element_user(POSTCODE$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "postCode" element
         */
        public void setPostCode(java.lang.String postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$20);
                }
                target.setStringValue(postCode);
            }
        }
        
        /**
         * Sets (as xml) the "postCode" element
         */
        public void xsetPostCode(au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode target = null;
                target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode)get_store().find_element_user(POSTCODE$20, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode)get_store().add_element_user(POSTCODE$20);
                }
                target.set(postCode);
            }
        }
        /**
         * An XML floorNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$FloorNumber.
         */
        public static class FloorNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.FloorNumber
        {
            
            public FloorNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FloorNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML propertyName(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PropertyName.
         */
        public static class PropertyNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.PropertyName
        {
            
            public PropertyNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PropertyNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML unitOrOfficeNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$UnitOrOfficeNumber.
         */
        public static class UnitOrOfficeNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.UnitOrOfficeNumber
        {
            
            public UnitOrOfficeNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UnitOrOfficeNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML streetNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$StreetNumber.
         */
        public static class StreetNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetNumber
        {
            
            public StreetNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected StreetNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML streetName(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$StreetName.
         */
        public static class StreetNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetName
        {
            
            public StreetNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected StreetNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML streetType(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$StreetType.
         */
        public static class StreetTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.StreetType
        {
            
            public StreetTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected StreetTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML postalDeliveryType(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PostalDeliveryType.
         */
        public static class PostalDeliveryTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryType
        {
            
            public PostalDeliveryTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PostalDeliveryTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML postalDeliveryNumber(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PostalDeliveryNumber.
         */
        public static class PostalDeliveryNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostalDeliveryNumber
        {
            
            public PostalDeliveryNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PostalDeliveryNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML postCode(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$PhysicalAddress$PostCode.
         */
        public static class PostCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.PhysicalAddress.PostCode
        {
            
            public PostCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PostCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML unstructuredAddress(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class UnstructuredAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AddressLodgeType.UnstructuredAddress
    {
        
        public UnstructuredAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESSLINE1$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine1");
        private static final javax.xml.namespace.QName ADDRESSLINE2$2 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine2");
        private static final javax.xml.namespace.QName ADDRESSLINE3$4 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine3");
        private static final javax.xml.namespace.QName ADDRESSLINE4$6 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine4");
        
        
        /**
         * Gets the "addressLine1" element
         */
        public java.lang.String getAddressLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressLine1" element
         */
        public au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 xgetAddressLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1)get_store().find_element_user(ADDRESSLINE1$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addressLine1" element
         */
        public void setAddressLine1(java.lang.String addressLine1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE1$0);
                }
                target.setStringValue(addressLine1);
            }
        }
        
        /**
         * Sets (as xml) the "addressLine1" element
         */
        public void xsetAddressLine1(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 addressLine1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1)get_store().find_element_user(ADDRESSLINE1$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1)get_store().add_element_user(ADDRESSLINE1$0);
                }
                target.set(addressLine1);
            }
        }
        
        /**
         * Gets the "addressLine2" element
         */
        public java.lang.String getAddressLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressLine2" element
         */
        public au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 xgetAddressLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2)get_store().find_element_user(ADDRESSLINE2$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addressLine2" element
         */
        public void setAddressLine2(java.lang.String addressLine2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE2$2);
                }
                target.setStringValue(addressLine2);
            }
        }
        
        /**
         * Sets (as xml) the "addressLine2" element
         */
        public void xsetAddressLine2(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 addressLine2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2)get_store().find_element_user(ADDRESSLINE2$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2)get_store().add_element_user(ADDRESSLINE2$2);
                }
                target.set(addressLine2);
            }
        }
        
        /**
         * Gets the "addressLine3" element
         */
        public java.lang.String getAddressLine3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE3$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressLine3" element
         */
        public au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 xgetAddressLine3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3)get_store().find_element_user(ADDRESSLINE3$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "addressLine3" element
         */
        public boolean isSetAddressLine3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSLINE3$4) != 0;
            }
        }
        
        /**
         * Sets the "addressLine3" element
         */
        public void setAddressLine3(java.lang.String addressLine3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE3$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE3$4);
                }
                target.setStringValue(addressLine3);
            }
        }
        
        /**
         * Sets (as xml) the "addressLine3" element
         */
        public void xsetAddressLine3(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 addressLine3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3)get_store().find_element_user(ADDRESSLINE3$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3)get_store().add_element_user(ADDRESSLINE3$4);
                }
                target.set(addressLine3);
            }
        }
        
        /**
         * Unsets the "addressLine3" element
         */
        public void unsetAddressLine3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSLINE3$4, 0);
            }
        }
        
        /**
         * Gets the "addressLine4" element
         */
        public java.lang.String getAddressLine4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE4$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressLine4" element
         */
        public au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 xgetAddressLine4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4)get_store().find_element_user(ADDRESSLINE4$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "addressLine4" element
         */
        public boolean isSetAddressLine4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSLINE4$6) != 0;
            }
        }
        
        /**
         * Sets the "addressLine4" element
         */
        public void setAddressLine4(java.lang.String addressLine4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE4$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE4$6);
                }
                target.setStringValue(addressLine4);
            }
        }
        
        /**
         * Sets (as xml) the "addressLine4" element
         */
        public void xsetAddressLine4(au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 addressLine4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4 target = null;
                target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4)get_store().find_element_user(ADDRESSLINE4$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4)get_store().add_element_user(ADDRESSLINE4$6);
                }
                target.set(addressLine4);
            }
        }
        
        /**
         * Unsets the "addressLine4" element
         */
        public void unsetAddressLine4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSLINE4$6, 0);
            }
        }
        /**
         * An XML addressLine1(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine1.
         */
        public static class AddressLine1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine1
        {
            
            public AddressLine1Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressLine1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML addressLine2(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine2.
         */
        public static class AddressLine2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine2
        {
            
            public AddressLine2Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressLine2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML addressLine3(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine3.
         */
        public static class AddressLine3Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine3
        {
            
            public AddressLine3Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressLine3Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML addressLine4(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$UnstructuredAddress$AddressLine4.
         */
        public static class AddressLine4Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.UnstructuredAddress.AddressLine4
        {
            
            public AddressLine4Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressLine4Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML semiStructuredPhysicalAddress(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class SemiStructuredPhysicalAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress
    {
        
        public SemiStructuredPhysicalAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESSLINE1$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine1");
        private static final javax.xml.namespace.QName ADDRESSLINE2$2 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "addressLine2");
        private static final javax.xml.namespace.QName LOCALITY$4 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "locality");
        private static final javax.xml.namespace.QName STATE$6 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "state");
        private static final javax.xml.namespace.QName POSTCODE$8 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "postCode");
        
        
        /**
         * Gets the "addressLine1" element
         */
        public java.lang.String getAddressLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressLine1" element
         */
        public au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 xgetAddressLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 target = null;
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1)get_store().find_element_user(ADDRESSLINE1$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addressLine1" element
         */
        public void setAddressLine1(java.lang.String addressLine1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE1$0);
                }
                target.setStringValue(addressLine1);
            }
        }
        
        /**
         * Sets (as xml) the "addressLine1" element
         */
        public void xsetAddressLine1(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 addressLine1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1 target = null;
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1)get_store().find_element_user(ADDRESSLINE1$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1)get_store().add_element_user(ADDRESSLINE1$0);
                }
                target.set(addressLine1);
            }
        }
        
        /**
         * Gets the "addressLine2" element
         */
        public java.lang.String getAddressLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressLine2" element
         */
        public au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 xgetAddressLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 target = null;
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2)get_store().find_element_user(ADDRESSLINE2$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "addressLine2" element
         */
        public boolean isSetAddressLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSLINE2$2) != 0;
            }
        }
        
        /**
         * Sets the "addressLine2" element
         */
        public void setAddressLine2(java.lang.String addressLine2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE2$2);
                }
                target.setStringValue(addressLine2);
            }
        }
        
        /**
         * Sets (as xml) the "addressLine2" element
         */
        public void xsetAddressLine2(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 addressLine2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2 target = null;
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2)get_store().find_element_user(ADDRESSLINE2$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2)get_store().add_element_user(ADDRESSLINE2$2);
                }
                target.set(addressLine2);
            }
        }
        
        /**
         * Unsets the "addressLine2" element
         */
        public void unsetAddressLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSLINE2$2, 0);
            }
        }
        
        /**
         * Gets the "locality" element
         */
        public java.lang.String getLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locality" element
         */
        public org.apache.xmlbeans.XmlString xgetLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "locality" element
         */
        public void setLocality(java.lang.String locality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$4);
                }
                target.setStringValue(locality);
            }
        }
        
        /**
         * Sets (as xml) the "locality" element
         */
        public void xsetLocality(org.apache.xmlbeans.XmlString locality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALITY$4);
                }
                target.set(locality);
            }
        }
        
        /**
         * Gets the "state" element
         */
        public au.gov.asic.types.StateTerritoryCodeType.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" element
         */
        public au.gov.asic.types.StateTerritoryCodeType xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.StateTerritoryCodeType target = null;
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "state" element
         */
        public void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$6);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" element
         */
        public void xsetState(au.gov.asic.types.StateTerritoryCodeType state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.StateTerritoryCodeType target = null;
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$6);
                }
                target.set(state);
            }
        }
        
        /**
         * Gets the "postCode" element
         */
        public java.lang.String getPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postCode" element
         */
        public au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode xgetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode target = null;
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode)get_store().find_element_user(POSTCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "postCode" element
         */
        public void setPostCode(java.lang.String postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$8);
                }
                target.setStringValue(postCode);
            }
        }
        
        /**
         * Sets (as xml) the "postCode" element
         */
        public void xsetPostCode(au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode target = null;
                target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode)get_store().find_element_user(POSTCODE$8, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode)get_store().add_element_user(POSTCODE$8);
                }
                target.set(postCode);
            }
        }
        /**
         * An XML addressLine1(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$SemiStructuredPhysicalAddress$AddressLine1.
         */
        public static class AddressLine1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine1
        {
            
            public AddressLine1Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressLine1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML addressLine2(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$SemiStructuredPhysicalAddress$AddressLine2.
         */
        public static class AddressLine2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.AddressLine2
        {
            
            public AddressLine2Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AddressLine2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML postCode(@uri:types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.AddressLodgeType$SemiStructuredPhysicalAddress$PostCode.
         */
        public static class PostCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.AddressLodgeType.SemiStructuredPhysicalAddress.PostCode
        {
            
            public PostCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PostCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
