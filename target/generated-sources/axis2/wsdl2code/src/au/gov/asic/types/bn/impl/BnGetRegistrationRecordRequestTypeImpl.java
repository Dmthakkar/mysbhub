/*
 * XML Type:  bnGetRegistrationRecordRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnGetRegistrationRecordRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnGetRegistrationRecordRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnGetRegistrationRecordRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnGetRegistrationRecordRequestType
{
    
    public BnGetRegistrationRecordRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATIONRECORD$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "registrationRecord");
    
    
    /**
     * Gets the "registrationRecord" element
     */
    public au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord getRegistrationRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord target = null;
            target = (au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord)get_store().find_element_user(REGISTRATIONRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "registrationRecord" element
     */
    public void setRegistrationRecord(au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord registrationRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord target = null;
            target = (au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord)get_store().find_element_user(REGISTRATIONRECORD$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord)get_store().add_element_user(REGISTRATIONRECORD$0);
            }
            target.set(registrationRecord);
        }
    }
    
    /**
     * Appends and returns a new empty "registrationRecord" element
     */
    public au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord addNewRegistrationRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord target = null;
            target = (au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord)get_store().add_element_user(REGISTRATIONRECORD$0);
            return target;
        }
    }
    /**
     * An XML registrationRecord(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class RegistrationRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnGetRegistrationRecordRequestType.RegistrationRecord
    {
        
        public RegistrationRecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BNREFERENCENUMBER$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "bnReferenceNumber");
        private static final javax.xml.namespace.QName NNINUMBER$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "nniNumber");
        
        
        /**
         * Gets the "bnReferenceNumber" element
         */
        public int getBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "bnReferenceNumber" element
         */
        public au.gov.asic.types.NniNumberType xgetBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNumberType target = null;
                target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(BNREFERENCENUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "bnReferenceNumber" element
         */
        public boolean isSetBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BNREFERENCENUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "bnReferenceNumber" element
         */
        public void setBnReferenceNumber(int bnReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNREFERENCENUMBER$0);
                }
                target.setIntValue(bnReferenceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "bnReferenceNumber" element
         */
        public void xsetBnReferenceNumber(au.gov.asic.types.NniNumberType bnReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNumberType target = null;
                target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(BNREFERENCENUMBER$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(BNREFERENCENUMBER$0);
                }
                target.set(bnReferenceNumber);
            }
        }
        
        /**
         * Unsets the "bnReferenceNumber" element
         */
        public void unsetBnReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BNREFERENCENUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "nniNumber" element
         */
        public int getNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "nniNumber" element
         */
        public au.gov.asic.types.NniNumberType xgetNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNumberType target = null;
                target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "nniNumber" element
         */
        public boolean isSetNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NNINUMBER$2) != 0;
            }
        }
        
        /**
         * Sets the "nniNumber" element
         */
        public void setNniNumber(int nniNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$2);
                }
                target.setIntValue(nniNumber);
            }
        }
        
        /**
         * Sets (as xml) the "nniNumber" element
         */
        public void xsetNniNumber(au.gov.asic.types.NniNumberType nniNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNumberType target = null;
                target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(NNINUMBER$2);
                }
                target.set(nniNumber);
            }
        }
        
        /**
         * Unsets the "nniNumber" element
         */
        public void unsetNniNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NNINUMBER$2, 0);
            }
        }
    }
}
