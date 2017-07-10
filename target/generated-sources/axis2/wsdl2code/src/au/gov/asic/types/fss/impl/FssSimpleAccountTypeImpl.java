/*
 * XML Type:  fssSimpleAccountType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssSimpleAccountType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML fssSimpleAccountType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FssSimpleAccountTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssSimpleAccountType
{
    
    public FssSimpleAccountTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEDGERNUMBER$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "ledgerNumber");
    private static final javax.xml.namespace.QName ASICIDENTIFIER$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicIdentifier");
    
    
    /**
     * Gets the "ledgerNumber" element
     */
    public int getLedgerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEDGERNUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ledgerNumber" element
     */
    public au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber xgetLedgerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber target = null;
            target = (au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber)get_store().find_element_user(LEDGERNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ledgerNumber" element
     */
    public void setLedgerNumber(int ledgerNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEDGERNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEDGERNUMBER$0);
            }
            target.setIntValue(ledgerNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ledgerNumber" element
     */
    public void xsetLedgerNumber(au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber ledgerNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber target = null;
            target = (au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber)get_store().find_element_user(LEDGERNUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber)get_store().add_element_user(LEDGERNUMBER$0);
            }
            target.set(ledgerNumber);
        }
    }
    
    /**
     * Gets the "asicIdentifier" element
     */
    public int getAsicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICIDENTIFIER$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "asicIdentifier" element
     */
    public au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier xgetAsicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier target = null;
            target = (au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier)get_store().find_element_user(ASICIDENTIFIER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "asicIdentifier" element
     */
    public void setAsicIdentifier(int asicIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICIDENTIFIER$2);
            }
            target.setIntValue(asicIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "asicIdentifier" element
     */
    public void xsetAsicIdentifier(au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier asicIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier target = null;
            target = (au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier)get_store().find_element_user(ASICIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier)get_store().add_element_user(ASICIDENTIFIER$2);
            }
            target.set(asicIdentifier);
        }
    }
    /**
     * An XML ledgerNumber(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssSimpleAccountType$LedgerNumber.
     */
    public static class LedgerNumberImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements au.gov.asic.types.fss.FssSimpleAccountType.LedgerNumber
    {
        
        public LedgerNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LedgerNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML asicIdentifier(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssSimpleAccountType$AsicIdentifier.
     */
    public static class AsicIdentifierImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements au.gov.asic.types.fss.FssSimpleAccountType.AsicIdentifier
    {
        
        public AsicIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AsicIdentifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
