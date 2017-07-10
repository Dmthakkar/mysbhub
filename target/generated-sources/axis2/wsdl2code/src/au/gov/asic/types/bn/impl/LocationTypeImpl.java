/*
 * XML Type:  locationType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.LocationType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML locationType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class LocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.LocationType
{
    
    public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTCODE$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "postCode");
    private static final javax.xml.namespace.QName LOCALITYSTATE$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "localityState");
    
    
    /**
     * Gets the "postCode" element
     */
    public java.lang.String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$0, 0);
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
    public au.gov.asic.types.bn.LocationType.PostCode xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.LocationType.PostCode target = null;
            target = (au.gov.asic.types.bn.LocationType.PostCode)get_store().find_element_user(POSTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "postCode" element
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCODE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$0);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "postCode" element
     */
    public void xsetPostCode(au.gov.asic.types.bn.LocationType.PostCode postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.LocationType.PostCode target = null;
            target = (au.gov.asic.types.bn.LocationType.PostCode)get_store().find_element_user(POSTCODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.LocationType.PostCode)get_store().add_element_user(POSTCODE$0);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Unsets the "postCode" element
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "localityState" element
     */
    public au.gov.asic.types.bn.LocationType.LocalityState getLocalityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.LocationType.LocalityState target = null;
            target = (au.gov.asic.types.bn.LocationType.LocalityState)get_store().find_element_user(LOCALITYSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "localityState" element
     */
    public boolean isSetLocalityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALITYSTATE$2) != 0;
        }
    }
    
    /**
     * Sets the "localityState" element
     */
    public void setLocalityState(au.gov.asic.types.bn.LocationType.LocalityState localityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.LocationType.LocalityState target = null;
            target = (au.gov.asic.types.bn.LocationType.LocalityState)get_store().find_element_user(LOCALITYSTATE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.LocationType.LocalityState)get_store().add_element_user(LOCALITYSTATE$2);
            }
            target.set(localityState);
        }
    }
    
    /**
     * Appends and returns a new empty "localityState" element
     */
    public au.gov.asic.types.bn.LocationType.LocalityState addNewLocalityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.LocationType.LocalityState target = null;
            target = (au.gov.asic.types.bn.LocationType.LocalityState)get_store().add_element_user(LOCALITYSTATE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "localityState" element
     */
    public void unsetLocalityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALITYSTATE$2, 0);
        }
    }
    /**
     * An XML postCode(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.LocationType$PostCode.
     */
    public static class PostCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.LocationType.PostCode
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
    /**
     * An XML localityState(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class LocalityStateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.LocationType.LocalityState
    {
        
        public LocalityStateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALITY$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "locality");
        private static final javax.xml.namespace.QName STATE$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "state");
        
        
        /**
         * Gets the "locality" element
         */
        public java.lang.String getLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "locality" element
         */
        public boolean isSetLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALITY$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALITY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALITY$0);
                }
                target.set(locality);
            }
        }
        
        /**
         * Unsets the "locality" element
         */
        public void unsetLocality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALITY$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$2, 0);
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
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$2);
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
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$2);
                }
                target.set(state);
            }
        }
    }
}
