/*
 * XML Type:  personWithRolesType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PersonWithRolesType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML personWithRolesType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PersonWithRolesTypeImpl extends au.gov.asic.types.impl.PersonNameBirthTypeImpl implements au.gov.asic.types.bn.PersonWithRolesType
{
    
    public PersonWithRolesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "role");
    
    
    /**
     * Gets array of all "role" elements
     */
    public au.gov.asic.types.bn.PersonWithRolesType.Role[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$0, targetList);
            au.gov.asic.types.bn.PersonWithRolesType.Role[] result = new au.gov.asic.types.bn.PersonWithRolesType.Role[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public au.gov.asic.types.bn.PersonWithRolesType.Role getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType.Role target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType.Role)get_store().find_element_user(ROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$0);
        }
    }
    
    /**
     * Sets array of all "role" element
     */
    public void setRoleArray(au.gov.asic.types.bn.PersonWithRolesType.Role[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$0);
        }
    }
    
    /**
     * Sets ith "role" element
     */
    public void setRoleArray(int i, au.gov.asic.types.bn.PersonWithRolesType.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType.Role target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType.Role)get_store().find_element_user(ROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    public au.gov.asic.types.bn.PersonWithRolesType.Role insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType.Role target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType.Role)get_store().insert_element_user(ROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public au.gov.asic.types.bn.PersonWithRolesType.Role addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PersonWithRolesType.Role target = null;
            target = (au.gov.asic.types.bn.PersonWithRolesType.Role)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$0, i);
        }
    }
    /**
     * An XML role(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.PersonWithRolesType.Role
    {
        
        public RoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUSINESS$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "business");
        private static final javax.xml.namespace.QName BUSINESSNAME$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessName");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "type");
        private static final javax.xml.namespace.QName ADDRESS$6 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
        private static final javax.xml.namespace.QName STARTDATE$8 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$10 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "endDate");
        
        
        /**
         * Gets the "business" element
         */
        public au.gov.asic.types.bn.BusinessEntityType getBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BusinessEntityType target = null;
                target = (au.gov.asic.types.bn.BusinessEntityType)get_store().find_element_user(BUSINESS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "business" element
         */
        public void setBusiness(au.gov.asic.types.bn.BusinessEntityType business)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BusinessEntityType target = null;
                target = (au.gov.asic.types.bn.BusinessEntityType)get_store().find_element_user(BUSINESS$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.BusinessEntityType)get_store().add_element_user(BUSINESS$0);
                }
                target.set(business);
            }
        }
        
        /**
         * Appends and returns a new empty "business" element
         */
        public au.gov.asic.types.bn.BusinessEntityType addNewBusiness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BusinessEntityType target = null;
                target = (au.gov.asic.types.bn.BusinessEntityType)get_store().add_element_user(BUSINESS$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "businessName" elements
         */
        public au.gov.asic.types.bn.OutboundBusinessNameType[] getBusinessNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BUSINESSNAME$2, targetList);
                au.gov.asic.types.bn.OutboundBusinessNameType[] result = new au.gov.asic.types.bn.OutboundBusinessNameType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "businessName" element
         */
        public au.gov.asic.types.bn.OutboundBusinessNameType getBusinessNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.OutboundBusinessNameType target = null;
                target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "businessName" element
         */
        public int sizeOfBusinessNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSINESSNAME$2);
            }
        }
        
        /**
         * Sets array of all "businessName" element
         */
        public void setBusinessNameArray(au.gov.asic.types.bn.OutboundBusinessNameType[] businessNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(businessNameArray, BUSINESSNAME$2);
            }
        }
        
        /**
         * Sets ith "businessName" element
         */
        public void setBusinessNameArray(int i, au.gov.asic.types.bn.OutboundBusinessNameType businessName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.OutboundBusinessNameType target = null;
                target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(businessName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "businessName" element
         */
        public au.gov.asic.types.bn.OutboundBusinessNameType insertNewBusinessName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.OutboundBusinessNameType target = null;
                target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().insert_element_user(BUSINESSNAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "businessName" element
         */
        public au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.OutboundBusinessNameType target = null;
                target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "businessName" element
         */
        public void removeBusinessName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSINESSNAME$2, i);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public au.gov.asic.types.bn.RoleTypeType getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.RoleTypeType target = null;
                target = (au.gov.asic.types.bn.RoleTypeType)get_store().find_element_user(TYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(TYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(au.gov.asic.types.bn.RoleTypeType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.RoleTypeType target = null;
                target = (au.gov.asic.types.bn.RoleTypeType)get_store().find_element_user(TYPE$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.RoleTypeType)get_store().add_element_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public au.gov.asic.types.bn.RoleTypeType addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.RoleTypeType target = null;
                target = (au.gov.asic.types.bn.RoleTypeType)get_store().add_element_user(TYPE$4);
                return target;
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
                get_store().remove_element(TYPE$4, 0);
            }
        }
        
        /**
         * Gets the "address" element
         */
        public au.gov.asic.types.AddressExtType getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressExtType target = null;
                target = (au.gov.asic.types.AddressExtType)get_store().find_element_user(ADDRESS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "address" element
         */
        public boolean isSetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$6) != 0;
            }
        }
        
        /**
         * Sets the "address" element
         */
        public void setAddress(au.gov.asic.types.AddressExtType address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressExtType target = null;
                target = (au.gov.asic.types.AddressExtType)get_store().find_element_user(ADDRESS$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressExtType)get_store().add_element_user(ADDRESS$6);
                }
                target.set(address);
            }
        }
        
        /**
         * Appends and returns a new empty "address" element
         */
        public au.gov.asic.types.AddressExtType addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressExtType target = null;
                target = (au.gov.asic.types.AddressExtType)get_store().add_element_user(ADDRESS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "address" element
         */
        public void unsetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$8, 0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$8, 0);
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
                return get_store().count_elements(STARTDATE$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$8);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$8);
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
                get_store().remove_element(STARTDATE$8, 0);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "endDate" element
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$10);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$10);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Unsets the "endDate" element
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$10, 0);
            }
        }
    }
}
