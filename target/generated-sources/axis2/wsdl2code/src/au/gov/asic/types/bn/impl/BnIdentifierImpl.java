/*
 * XML Type:  bnIdentifier
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnIdentifier
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnIdentifier(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnIdentifier
{
    
    public BnIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NNINUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "nniNumber");
    private static final javax.xml.namespace.QName BNREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "bnReferenceNumber");
    
    
    /**
     * Gets the "nniNumber" element
     */
    public int getNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$0, 0);
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
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$0, 0);
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
            return get_store().count_elements(NNINUMBER$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$0);
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
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(NNINUMBER$0);
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
            get_store().remove_element(NNINUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "bnReferenceNumber" element
     */
    public java.lang.String getBnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bnReferenceNumber" element
     */
    public au.gov.asic.types.BnReferenceNumberType xgetBnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BnReferenceNumberType target = null;
            target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
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
            return get_store().count_elements(BNREFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "bnReferenceNumber" element
     */
    public void setBnReferenceNumber(java.lang.String bnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNREFERENCENUMBER$2);
            }
            target.setStringValue(bnReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "bnReferenceNumber" element
     */
    public void xsetBnReferenceNumber(au.gov.asic.types.BnReferenceNumberType bnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BnReferenceNumberType target = null;
            target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BnReferenceNumberType)get_store().add_element_user(BNREFERENCENUMBER$2);
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
            get_store().remove_element(BNREFERENCENUMBER$2, 0);
        }
    }
}
