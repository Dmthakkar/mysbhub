/*
 * XML Type:  paymentDetailsType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.PaymentDetailsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML paymentDetailsType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PaymentDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.PaymentDetailsType
{
    
    public PaymentDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName TITLEFORPAYMENT$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "titleForPayment");
    private static final javax.xml.namespace.QName ADDRESSFORPAYMENT$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "addressForPayment");
    private static final javax.xml.namespace.QName PHONEFORQUERIES$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "phoneForQueries");
    private static final javax.xml.namespace.QName BARCODE$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "barcode");
    private static final javax.xml.namespace.QName BPAY$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "bpay");
    private static final javax.xml.namespace.QName POSTBILLPAY$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "postBillpay");
    private static final javax.xml.namespace.QName EFTREFERENCENUMBER$14 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "eftReferenceNumber");
    
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
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
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$0);
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
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$0);
            }
            target.set(abn);
        }
    }
    
    /**
     * Gets the "titleForPayment" element
     */
    public java.lang.String getTitleForPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLEFORPAYMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "titleForPayment" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment xgetTitleForPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment)get_store().find_element_user(TITLEFORPAYMENT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "titleForPayment" element
     */
    public void setTitleForPayment(java.lang.String titleForPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLEFORPAYMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLEFORPAYMENT$2);
            }
            target.setStringValue(titleForPayment);
        }
    }
    
    /**
     * Sets (as xml) the "titleForPayment" element
     */
    public void xsetTitleForPayment(au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment titleForPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment)get_store().find_element_user(TITLEFORPAYMENT$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment)get_store().add_element_user(TITLEFORPAYMENT$2);
            }
            target.set(titleForPayment);
        }
    }
    
    /**
     * Gets the "addressForPayment" element
     */
    public java.lang.String getAddressForPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSFORPAYMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressForPayment" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment xgetAddressForPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment)get_store().find_element_user(ADDRESSFORPAYMENT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addressForPayment" element
     */
    public void setAddressForPayment(java.lang.String addressForPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSFORPAYMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSFORPAYMENT$4);
            }
            target.setStringValue(addressForPayment);
        }
    }
    
    /**
     * Sets (as xml) the "addressForPayment" element
     */
    public void xsetAddressForPayment(au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment addressForPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment)get_store().find_element_user(ADDRESSFORPAYMENT$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment)get_store().add_element_user(ADDRESSFORPAYMENT$4);
            }
            target.set(addressForPayment);
        }
    }
    
    /**
     * Gets the "phoneForQueries" element
     */
    public java.lang.String getPhoneForQueries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONEFORQUERIES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phoneForQueries" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries xgetPhoneForQueries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries)get_store().find_element_user(PHONEFORQUERIES$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "phoneForQueries" element
     */
    public void setPhoneForQueries(java.lang.String phoneForQueries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONEFORQUERIES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONEFORQUERIES$6);
            }
            target.setStringValue(phoneForQueries);
        }
    }
    
    /**
     * Sets (as xml) the "phoneForQueries" element
     */
    public void xsetPhoneForQueries(au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries phoneForQueries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries)get_store().find_element_user(PHONEFORQUERIES$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries)get_store().add_element_user(PHONEFORQUERIES$6);
            }
            target.set(phoneForQueries);
        }
    }
    
    /**
     * Gets the "barcode" element
     */
    public java.lang.String getBarcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BARCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "barcode" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.Barcode xgetBarcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.Barcode target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.Barcode)get_store().find_element_user(BARCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "barcode" element
     */
    public boolean isSetBarcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BARCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "barcode" element
     */
    public void setBarcode(java.lang.String barcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BARCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BARCODE$8);
            }
            target.setStringValue(barcode);
        }
    }
    
    /**
     * Sets (as xml) the "barcode" element
     */
    public void xsetBarcode(au.gov.asic.types.fss.PaymentDetailsType.Barcode barcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.Barcode target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.Barcode)get_store().find_element_user(BARCODE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentDetailsType.Barcode)get_store().add_element_user(BARCODE$8);
            }
            target.set(barcode);
        }
    }
    
    /**
     * Unsets the "barcode" element
     */
    public void unsetBarcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BARCODE$8, 0);
        }
    }
    
    /**
     * Gets the "bpay" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.Bpay getBpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.Bpay target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay)get_store().find_element_user(BPAY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bpay" element
     */
    public boolean isSetBpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BPAY$10) != 0;
        }
    }
    
    /**
     * Sets the "bpay" element
     */
    public void setBpay(au.gov.asic.types.fss.PaymentDetailsType.Bpay bpay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.Bpay target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay)get_store().find_element_user(BPAY$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay)get_store().add_element_user(BPAY$10);
            }
            target.set(bpay);
        }
    }
    
    /**
     * Appends and returns a new empty "bpay" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.Bpay addNewBpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.Bpay target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay)get_store().add_element_user(BPAY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "bpay" element
     */
    public void unsetBpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BPAY$10, 0);
        }
    }
    
    /**
     * Gets the "postBillpay" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.PostBillpay getPostBillpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.PostBillpay target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay)get_store().find_element_user(POSTBILLPAY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "postBillpay" element
     */
    public boolean isSetPostBillpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTBILLPAY$12) != 0;
        }
    }
    
    /**
     * Sets the "postBillpay" element
     */
    public void setPostBillpay(au.gov.asic.types.fss.PaymentDetailsType.PostBillpay postBillpay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.PostBillpay target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay)get_store().find_element_user(POSTBILLPAY$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay)get_store().add_element_user(POSTBILLPAY$12);
            }
            target.set(postBillpay);
        }
    }
    
    /**
     * Appends and returns a new empty "postBillpay" element
     */
    public au.gov.asic.types.fss.PaymentDetailsType.PostBillpay addNewPostBillpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentDetailsType.PostBillpay target = null;
            target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay)get_store().add_element_user(POSTBILLPAY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "postBillpay" element
     */
    public void unsetPostBillpay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTBILLPAY$12, 0);
        }
    }
    
    /**
     * Gets the "eftReferenceNumber" element
     */
    public java.math.BigInteger getEftReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFTREFERENCENUMBER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "eftReferenceNumber" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetEftReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(EFTREFERENCENUMBER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "eftReferenceNumber" element
     */
    public boolean isSetEftReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFTREFERENCENUMBER$14) != 0;
        }
    }
    
    /**
     * Sets the "eftReferenceNumber" element
     */
    public void setEftReferenceNumber(java.math.BigInteger eftReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFTREFERENCENUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFTREFERENCENUMBER$14);
            }
            target.setBigIntegerValue(eftReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "eftReferenceNumber" element
     */
    public void xsetEftReferenceNumber(org.apache.xmlbeans.XmlPositiveInteger eftReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(EFTREFERENCENUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(EFTREFERENCENUMBER$14);
            }
            target.set(eftReferenceNumber);
        }
    }
    
    /**
     * Unsets the "eftReferenceNumber" element
     */
    public void unsetEftReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFTREFERENCENUMBER$14, 0);
        }
    }
    /**
     * An XML titleForPayment(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$TitleForPayment.
     */
    public static class TitleForPaymentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment
    {
        
        public TitleForPaymentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TitleForPaymentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML addressForPayment(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$AddressForPayment.
     */
    public static class AddressForPaymentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment
    {
        
        public AddressForPaymentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AddressForPaymentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML phoneForQueries(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$PhoneForQueries.
     */
    public static class PhoneForQueriesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries
    {
        
        public PhoneForQueriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PhoneForQueriesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML barcode(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$Barcode.
     */
    public static class BarcodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.Barcode
    {
        
        public BarcodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected BarcodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML bpay(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class BpayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.PaymentDetailsType.Bpay
    {
        
        public BpayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BILLERCODE$0 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "billerCode");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "ref");
        
        
        /**
         * Gets the "billerCode" element
         */
        public java.lang.String getBillerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLERCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "billerCode" element
         */
        public au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode xgetBillerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode)get_store().find_element_user(BILLERCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "billerCode" element
         */
        public void setBillerCode(java.lang.String billerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLERCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLERCODE$0);
                }
                target.setStringValue(billerCode);
            }
        }
        
        /**
         * Sets (as xml) the "billerCode" element
         */
        public void xsetBillerCode(au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode billerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode)get_store().find_element_user(BILLERCODE$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode)get_store().add_element_user(BILLERCODE$0);
                }
                target.set(billerCode);
            }
        }
        
        /**
         * Gets the "ref" element
         */
        public java.lang.String getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" element
         */
        public au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref)get_store().find_element_user(REF$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ref" element
         */
        public void setRef(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REF$2);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" element
         */
        public void xsetRef(au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref)get_store().add_element_user(REF$2);
                }
                target.set(ref);
            }
        }
        /**
         * An XML billerCode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$Bpay$BillerCode.
         */
        public static class BillerCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode
        {
            
            public BillerCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected BillerCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ref(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$Bpay$Ref.
         */
        public static class RefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref
        {
            
            public RefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML postBillpay(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class PostBillpayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.PaymentDetailsType.PostBillpay
    {
        
        public PostBillpayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BILLPAYCODE$0 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "billpayCode");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "ref");
        
        
        /**
         * Gets the "billpayCode" element
         */
        public java.lang.String getBillpayCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLPAYCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "billpayCode" element
         */
        public au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode xgetBillpayCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode)get_store().find_element_user(BILLPAYCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "billpayCode" element
         */
        public void setBillpayCode(java.lang.String billpayCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLPAYCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLPAYCODE$0);
                }
                target.setStringValue(billpayCode);
            }
        }
        
        /**
         * Sets (as xml) the "billpayCode" element
         */
        public void xsetBillpayCode(au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode billpayCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode)get_store().find_element_user(BILLPAYCODE$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode)get_store().add_element_user(BILLPAYCODE$0);
                }
                target.set(billpayCode);
            }
        }
        
        /**
         * Gets the "ref" element
         */
        public java.lang.String getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" element
         */
        public au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref)get_store().find_element_user(REF$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ref" element
         */
        public void setRef(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REF$2);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" element
         */
        public void xsetRef(au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref target = null;
                target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref)get_store().add_element_user(REF$2);
                }
                target.set(ref);
            }
        }
        /**
         * An XML billpayCode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$PostBillpay$BillpayCode.
         */
        public static class BillpayCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode
        {
            
            public BillpayCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected BillpayCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ref(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$PostBillpay$Ref.
         */
        public static class RefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref
        {
            
            public RefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
