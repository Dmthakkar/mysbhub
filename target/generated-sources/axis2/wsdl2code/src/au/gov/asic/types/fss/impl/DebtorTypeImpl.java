/*
 * XML Type:  debtorType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.DebtorType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML debtorType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class DebtorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.DebtorType
{
    
    public DebtorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNT$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "account");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName ABN$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName ABNREFERENCENUMBER$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "abnReferenceNumber");
    private static final javax.xml.namespace.QName ADDRESS$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "address");
    
    
    /**
     * Gets the "account" element
     */
    public au.gov.asic.types.fss.FssAccountType getAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(ACCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "account" element
     */
    public void setAccount(au.gov.asic.types.fss.FssAccountType account)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(ACCOUNT$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(ACCOUNT$0);
            }
            target.set(account);
        }
    }
    
    /**
     * Appends and returns a new empty "account" element
     */
    public au.gov.asic.types.fss.FssAccountType addNewAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(ACCOUNT$0);
            return target;
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public au.gov.asic.types.NniNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.NniNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abn" element
     */
    public au.gov.asic.types.AbnType xgetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "abn" element
     */
    public boolean isSetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$4) != 0;
        }
    }
    
    /**
     * Sets the "abn" element
     */
    public void setAbn(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$4);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "abn" element
     */
    public void xsetAbn(au.gov.asic.types.AbnType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$4);
            }
            target.set(abn);
        }
    }
    
    /**
     * Unsets the "abn" element
     */
    public void unsetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$4, 0);
        }
    }
    
    /**
     * Gets the "abnReferenceNumber" element
     */
    public long getAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNREFERENCENUMBER$6, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "abnReferenceNumber" element
     */
    public au.gov.asic.types.fss.DebtorType.AbnReferenceNumber xgetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType.AbnReferenceNumber target = null;
            target = (au.gov.asic.types.fss.DebtorType.AbnReferenceNumber)get_store().find_element_user(ABNREFERENCENUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "abnReferenceNumber" element
     */
    public boolean isSetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABNREFERENCENUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "abnReferenceNumber" element
     */
    public void setAbnReferenceNumber(long abnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNREFERENCENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABNREFERENCENUMBER$6);
            }
            target.setLongValue(abnReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "abnReferenceNumber" element
     */
    public void xsetAbnReferenceNumber(au.gov.asic.types.fss.DebtorType.AbnReferenceNumber abnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType.AbnReferenceNumber target = null;
            target = (au.gov.asic.types.fss.DebtorType.AbnReferenceNumber)get_store().find_element_user(ABNREFERENCENUMBER$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.DebtorType.AbnReferenceNumber)get_store().add_element_user(ABNREFERENCENUMBER$6);
            }
            target.set(abnReferenceNumber);
        }
    }
    
    /**
     * Unsets the "abnReferenceNumber" element
     */
    public void unsetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABNREFERENCENUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public au.gov.asic.types.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(au.gov.asic.types.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$8);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public au.gov.asic.types.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$8);
            return target;
        }
    }
    /**
     * An XML abnReferenceNumber(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.DebtorType$AbnReferenceNumber.
     */
    public static class AbnReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements au.gov.asic.types.fss.DebtorType.AbnReferenceNumber
    {
        
        public AbnReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AbnReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
