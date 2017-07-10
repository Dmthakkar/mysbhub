/*
 * XML Type:  fssAccountType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssAccountType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML fssAccountType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FssAccountTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssAccountType
{
    
    public FssAccountTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASICTYPE$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicType");
    private static final javax.xml.namespace.QName LEDGERNUMBER$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "ledgerNumber");
    private static final javax.xml.namespace.QName ASICIDENTIFIER$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicIdentifier");
    
    
    /**
     * Gets the "asicType" element
     */
    public java.lang.String getAsicType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "asicType" element
     */
    public au.gov.asic.types.fss.FssAccountType.AsicType xgetAsicType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType.AsicType target = null;
            target = (au.gov.asic.types.fss.FssAccountType.AsicType)get_store().find_element_user(ASICTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "asicType" element
     */
    public void setAsicType(java.lang.String asicType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICTYPE$0);
            }
            target.setStringValue(asicType);
        }
    }
    
    /**
     * Sets (as xml) the "asicType" element
     */
    public void xsetAsicType(au.gov.asic.types.fss.FssAccountType.AsicType asicType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType.AsicType target = null;
            target = (au.gov.asic.types.fss.FssAccountType.AsicType)get_store().find_element_user(ASICTYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssAccountType.AsicType)get_store().add_element_user(ASICTYPE$0);
            }
            target.set(asicType);
        }
    }
    
    /**
     * Gets the "ledgerNumber" element
     */
    public int getLedgerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEDGERNUMBER$2, 0);
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
    public au.gov.asic.types.fss.FssAccountType.LedgerNumber xgetLedgerNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType.LedgerNumber target = null;
            target = (au.gov.asic.types.fss.FssAccountType.LedgerNumber)get_store().find_element_user(LEDGERNUMBER$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEDGERNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEDGERNUMBER$2);
            }
            target.setIntValue(ledgerNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ledgerNumber" element
     */
    public void xsetLedgerNumber(au.gov.asic.types.fss.FssAccountType.LedgerNumber ledgerNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType.LedgerNumber target = null;
            target = (au.gov.asic.types.fss.FssAccountType.LedgerNumber)get_store().find_element_user(LEDGERNUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssAccountType.LedgerNumber)get_store().add_element_user(LEDGERNUMBER$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICIDENTIFIER$4, 0);
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
    public au.gov.asic.types.fss.FssAccountType.AsicIdentifier xgetAsicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType.AsicIdentifier target = null;
            target = (au.gov.asic.types.fss.FssAccountType.AsicIdentifier)get_store().find_element_user(ASICIDENTIFIER$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICIDENTIFIER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICIDENTIFIER$4);
            }
            target.setIntValue(asicIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "asicIdentifier" element
     */
    public void xsetAsicIdentifier(au.gov.asic.types.fss.FssAccountType.AsicIdentifier asicIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType.AsicIdentifier target = null;
            target = (au.gov.asic.types.fss.FssAccountType.AsicIdentifier)get_store().find_element_user(ASICIDENTIFIER$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssAccountType.AsicIdentifier)get_store().add_element_user(ASICIDENTIFIER$4);
            }
            target.set(asicIdentifier);
        }
    }
    /**
     * An XML asicType(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssAccountType$AsicType.
     */
    public static class AsicTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssAccountType.AsicType
    {
        
        public AsicTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AsicTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ledgerNumber(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssAccountType$LedgerNumber.
     */
    public static class LedgerNumberImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements au.gov.asic.types.fss.FssAccountType.LedgerNumber
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
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssAccountType$AsicIdentifier.
     */
    public static class AsicIdentifierImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements au.gov.asic.types.fss.FssAccountType.AsicIdentifier
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
