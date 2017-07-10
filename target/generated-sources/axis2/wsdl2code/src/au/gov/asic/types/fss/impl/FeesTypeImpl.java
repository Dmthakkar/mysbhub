/*
 * XML Type:  feesType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FeesType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML feesType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FeesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeesType
{
    
    public FeesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LODGEMENTUNIT$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "lodgementUnit");
    private static final javax.xml.namespace.QName LODGEMENTDATE$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "lodgementDate");
    private static final javax.xml.namespace.QName PAYMENTMETHOD$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "paymentMethod");
    private static final javax.xml.namespace.QName TOTALAMOUNTOWING$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "totalAmountOwing");
    private static final javax.xml.namespace.QName INVOICE$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "invoice");
    
    
    /**
     * Gets the "lodgementUnit" element
     */
    public int getLodgementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LODGEMENTUNIT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lodgementUnit" element
     */
    public au.gov.asic.types.AsicNumericIdType xgetLodgementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(LODGEMENTUNIT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "lodgementUnit" element
     */
    public boolean isSetLodgementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LODGEMENTUNIT$0) != 0;
        }
    }
    
    /**
     * Sets the "lodgementUnit" element
     */
    public void setLodgementUnit(int lodgementUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LODGEMENTUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LODGEMENTUNIT$0);
            }
            target.setIntValue(lodgementUnit);
        }
    }
    
    /**
     * Sets (as xml) the "lodgementUnit" element
     */
    public void xsetLodgementUnit(au.gov.asic.types.AsicNumericIdType lodgementUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AsicNumericIdType target = null;
            target = (au.gov.asic.types.AsicNumericIdType)get_store().find_element_user(LODGEMENTUNIT$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AsicNumericIdType)get_store().add_element_user(LODGEMENTUNIT$0);
            }
            target.set(lodgementUnit);
        }
    }
    
    /**
     * Unsets the "lodgementUnit" element
     */
    public void unsetLodgementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LODGEMENTUNIT$0, 0);
        }
    }
    
    /**
     * Gets the "lodgementDate" element
     */
    public java.util.Calendar getLodgementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LODGEMENTDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lodgementDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetLodgementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LODGEMENTDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lodgementDate" element
     */
    public void setLodgementDate(java.util.Calendar lodgementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LODGEMENTDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LODGEMENTDATE$2);
            }
            target.setCalendarValue(lodgementDate);
        }
    }
    
    /**
     * Sets (as xml) the "lodgementDate" element
     */
    public void xsetLodgementDate(org.apache.xmlbeans.XmlDate lodgementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LODGEMENTDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LODGEMENTDATE$2);
            }
            target.set(lodgementDate);
        }
    }
    
    /**
     * Gets the "paymentMethod" element
     */
    public au.gov.asic.types.fss.PaymentMethodType.Enum getPaymentMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMETHOD$4, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.fss.PaymentMethodType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentMethod" element
     */
    public au.gov.asic.types.fss.PaymentMethodType xgetPaymentMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentMethodType target = null;
            target = (au.gov.asic.types.fss.PaymentMethodType)get_store().find_element_user(PAYMENTMETHOD$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "paymentMethod" element
     */
    public boolean isSetPaymentMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTMETHOD$4) != 0;
        }
    }
    
    /**
     * Sets the "paymentMethod" element
     */
    public void setPaymentMethod(au.gov.asic.types.fss.PaymentMethodType.Enum paymentMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMETHOD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTMETHOD$4);
            }
            target.setEnumValue(paymentMethod);
        }
    }
    
    /**
     * Sets (as xml) the "paymentMethod" element
     */
    public void xsetPaymentMethod(au.gov.asic.types.fss.PaymentMethodType paymentMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.PaymentMethodType target = null;
            target = (au.gov.asic.types.fss.PaymentMethodType)get_store().find_element_user(PAYMENTMETHOD$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.PaymentMethodType)get_store().add_element_user(PAYMENTMETHOD$4);
            }
            target.set(paymentMethod);
        }
    }
    
    /**
     * Unsets the "paymentMethod" element
     */
    public void unsetPaymentMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTMETHOD$4, 0);
        }
    }
    
    /**
     * Gets the "totalAmountOwing" element
     */
    public java.math.BigDecimal getTotalAmountOwing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNTOWING$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalAmountOwing" element
     */
    public au.gov.asic.types.AmountType xgetTotalAmountOwing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALAMOUNTOWING$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totalAmountOwing" element
     */
    public void setTotalAmountOwing(java.math.BigDecimal totalAmountOwing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNTOWING$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALAMOUNTOWING$6);
            }
            target.setBigDecimalValue(totalAmountOwing);
        }
    }
    
    /**
     * Sets (as xml) the "totalAmountOwing" element
     */
    public void xsetTotalAmountOwing(au.gov.asic.types.AmountType totalAmountOwing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALAMOUNTOWING$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TOTALAMOUNTOWING$6);
            }
            target.set(totalAmountOwing);
        }
    }
    
    /**
     * Gets the "invoice" element
     */
    public au.gov.asic.types.fss.FeesType.Invoice getInvoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeesType.Invoice target = null;
            target = (au.gov.asic.types.fss.FeesType.Invoice)get_store().find_element_user(INVOICE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "invoice" element
     */
    public boolean isSetInvoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVOICE$8) != 0;
        }
    }
    
    /**
     * Sets the "invoice" element
     */
    public void setInvoice(au.gov.asic.types.fss.FeesType.Invoice invoice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeesType.Invoice target = null;
            target = (au.gov.asic.types.fss.FeesType.Invoice)get_store().find_element_user(INVOICE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeesType.Invoice)get_store().add_element_user(INVOICE$8);
            }
            target.set(invoice);
        }
    }
    
    /**
     * Appends and returns a new empty "invoice" element
     */
    public au.gov.asic.types.fss.FeesType.Invoice addNewInvoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeesType.Invoice target = null;
            target = (au.gov.asic.types.fss.FeesType.Invoice)get_store().add_element_user(INVOICE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "invoice" element
     */
    public void unsetInvoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVOICE$8, 0);
        }
    }
    /**
     * An XML invoice(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class InvoiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeesType.Invoice
    {
        
        public InvoiceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ASICNAME$0 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicName");
        private static final javax.xml.namespace.QName ASICABN$2 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicAbn");
        private static final javax.xml.namespace.QName DEBTORNAME$4 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtorName");
        private static final javax.xml.namespace.QName DEBTORADDRESS$6 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtorAddress");
        private static final javax.xml.namespace.QName DEBTORACCOUNT$8 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtorAccount");
        private static final javax.xml.namespace.QName DEBTORBPAYREFERENCE$10 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtorBpayReference");
        private static final javax.xml.namespace.QName DEBTORDETAIL$12 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtorDetail");
        private static final javax.xml.namespace.QName INVOICEISSUEDATE$14 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "invoiceIssueDate");
        private static final javax.xml.namespace.QName INVOICEITEMS$16 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "invoiceItems");
        private static final javax.xml.namespace.QName ASICBPAYBILLERCODE$18 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicBpayBillerCode");
        private static final javax.xml.namespace.QName ASICTITLEFORPAYMENT$20 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicTitleForPayment");
        private static final javax.xml.namespace.QName ASICADDRESSFORPAYMENT$22 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicAddressForPayment");
        private static final javax.xml.namespace.QName ASICPHONEFORQUERIES$24 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicPhoneForQueries");
        
        
        /**
         * Gets the "asicName" element
         */
        public java.lang.String getAsicName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "asicName" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.AsicName xgetAsicName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicName target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicName)get_store().find_element_user(ASICNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "asicName" element
         */
        public void setAsicName(java.lang.String asicName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICNAME$0);
                }
                target.setStringValue(asicName);
            }
        }
        
        /**
         * Sets (as xml) the "asicName" element
         */
        public void xsetAsicName(au.gov.asic.types.fss.FeesType.Invoice.AsicName asicName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicName target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicName)get_store().find_element_user(ASICNAME$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.AsicName)get_store().add_element_user(ASICNAME$0);
                }
                target.set(asicName);
            }
        }
        
        /**
         * Gets the "asicAbn" element
         */
        public java.lang.String getAsicAbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICABN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "asicAbn" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.AsicAbn xgetAsicAbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicAbn target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicAbn)get_store().find_element_user(ASICABN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "asicAbn" element
         */
        public void setAsicAbn(java.lang.String asicAbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICABN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICABN$2);
                }
                target.setStringValue(asicAbn);
            }
        }
        
        /**
         * Sets (as xml) the "asicAbn" element
         */
        public void xsetAsicAbn(au.gov.asic.types.fss.FeesType.Invoice.AsicAbn asicAbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicAbn target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicAbn)get_store().find_element_user(ASICABN$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.AsicAbn)get_store().add_element_user(ASICABN$2);
                }
                target.set(asicAbn);
            }
        }
        
        /**
         * Gets the "debtorName" element
         */
        public java.lang.String getDebtorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTORNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "debtorName" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.DebtorName xgetDebtorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorName target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorName)get_store().find_element_user(DEBTORNAME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "debtorName" element
         */
        public void setDebtorName(java.lang.String debtorName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTORNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTORNAME$4);
                }
                target.setStringValue(debtorName);
            }
        }
        
        /**
         * Sets (as xml) the "debtorName" element
         */
        public void xsetDebtorName(au.gov.asic.types.fss.FeesType.Invoice.DebtorName debtorName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorName target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorName)get_store().find_element_user(DEBTORNAME$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorName)get_store().add_element_user(DEBTORNAME$4);
                }
                target.set(debtorName);
            }
        }
        
        /**
         * Gets the "debtorAddress" element
         */
        public au.gov.asic.types.AddressType getDebtorAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressType target = null;
                target = (au.gov.asic.types.AddressType)get_store().find_element_user(DEBTORADDRESS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "debtorAddress" element
         */
        public void setDebtorAddress(au.gov.asic.types.AddressType debtorAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressType target = null;
                target = (au.gov.asic.types.AddressType)get_store().find_element_user(DEBTORADDRESS$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AddressType)get_store().add_element_user(DEBTORADDRESS$6);
                }
                target.set(debtorAddress);
            }
        }
        
        /**
         * Appends and returns a new empty "debtorAddress" element
         */
        public au.gov.asic.types.AddressType addNewDebtorAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AddressType target = null;
                target = (au.gov.asic.types.AddressType)get_store().add_element_user(DEBTORADDRESS$6);
                return target;
            }
        }
        
        /**
         * Gets the "debtorAccount" element
         */
        public au.gov.asic.types.fss.FssAccountType getDebtorAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssAccountType target = null;
                target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(DEBTORACCOUNT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "debtorAccount" element
         */
        public void setDebtorAccount(au.gov.asic.types.fss.FssAccountType debtorAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssAccountType target = null;
                target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(DEBTORACCOUNT$8, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(DEBTORACCOUNT$8);
                }
                target.set(debtorAccount);
            }
        }
        
        /**
         * Appends and returns a new empty "debtorAccount" element
         */
        public au.gov.asic.types.fss.FssAccountType addNewDebtorAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FssAccountType target = null;
                target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(DEBTORACCOUNT$8);
                return target;
            }
        }
        
        /**
         * Gets the "debtorBpayReference" element
         */
        public java.lang.String getDebtorBpayReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTORBPAYREFERENCE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "debtorBpayReference" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference xgetDebtorBpayReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference)get_store().find_element_user(DEBTORBPAYREFERENCE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "debtorBpayReference" element
         */
        public void setDebtorBpayReference(java.lang.String debtorBpayReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBTORBPAYREFERENCE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBTORBPAYREFERENCE$10);
                }
                target.setStringValue(debtorBpayReference);
            }
        }
        
        /**
         * Sets (as xml) the "debtorBpayReference" element
         */
        public void xsetDebtorBpayReference(au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference debtorBpayReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference)get_store().find_element_user(DEBTORBPAYREFERENCE$10, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference)get_store().add_element_user(DEBTORBPAYREFERENCE$10);
                }
                target.set(debtorBpayReference);
            }
        }
        
        /**
         * Gets array of all "debtorDetail" elements
         */
        public au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail[] getDebtorDetailArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEBTORDETAIL$12, targetList);
                au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail[] result = new au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "debtorDetail" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail getDebtorDetailArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail)get_store().find_element_user(DEBTORDETAIL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "debtorDetail" element
         */
        public int sizeOfDebtorDetailArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEBTORDETAIL$12);
            }
        }
        
        /**
         * Sets array of all "debtorDetail" element
         */
        public void setDebtorDetailArray(au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail[] debtorDetailArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(debtorDetailArray, DEBTORDETAIL$12);
            }
        }
        
        /**
         * Sets ith "debtorDetail" element
         */
        public void setDebtorDetailArray(int i, au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail debtorDetail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail)get_store().find_element_user(DEBTORDETAIL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(debtorDetail);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "debtorDetail" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail insertNewDebtorDetail(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail)get_store().insert_element_user(DEBTORDETAIL$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "debtorDetail" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail addNewDebtorDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail)get_store().add_element_user(DEBTORDETAIL$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "debtorDetail" element
         */
        public void removeDebtorDetail(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEBTORDETAIL$12, i);
            }
        }
        
        /**
         * Gets the "invoiceIssueDate" element
         */
        public java.util.Calendar getInvoiceIssueDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEISSUEDATE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "invoiceIssueDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetInvoiceIssueDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(INVOICEISSUEDATE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "invoiceIssueDate" element
         */
        public void setInvoiceIssueDate(java.util.Calendar invoiceIssueDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEISSUEDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICEISSUEDATE$14);
                }
                target.setCalendarValue(invoiceIssueDate);
            }
        }
        
        /**
         * Sets (as xml) the "invoiceIssueDate" element
         */
        public void xsetInvoiceIssueDate(org.apache.xmlbeans.XmlDate invoiceIssueDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(INVOICEISSUEDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(INVOICEISSUEDATE$14);
                }
                target.set(invoiceIssueDate);
            }
        }
        
        /**
         * Gets the "invoiceItems" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems getInvoiceItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems)get_store().find_element_user(INVOICEITEMS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "invoiceItems" element
         */
        public void setInvoiceItems(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems invoiceItems)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems)get_store().find_element_user(INVOICEITEMS$16, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems)get_store().add_element_user(INVOICEITEMS$16);
                }
                target.set(invoiceItems);
            }
        }
        
        /**
         * Appends and returns a new empty "invoiceItems" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems addNewInvoiceItems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems)get_store().add_element_user(INVOICEITEMS$16);
                return target;
            }
        }
        
        /**
         * Gets the "asicBpayBillerCode" element
         */
        public java.lang.String getAsicBpayBillerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICBPAYBILLERCODE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "asicBpayBillerCode" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode xgetAsicBpayBillerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode)get_store().find_element_user(ASICBPAYBILLERCODE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "asicBpayBillerCode" element
         */
        public void setAsicBpayBillerCode(java.lang.String asicBpayBillerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICBPAYBILLERCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICBPAYBILLERCODE$18);
                }
                target.setStringValue(asicBpayBillerCode);
            }
        }
        
        /**
         * Sets (as xml) the "asicBpayBillerCode" element
         */
        public void xsetAsicBpayBillerCode(au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode asicBpayBillerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode)get_store().find_element_user(ASICBPAYBILLERCODE$18, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode)get_store().add_element_user(ASICBPAYBILLERCODE$18);
                }
                target.set(asicBpayBillerCode);
            }
        }
        
        /**
         * Gets the "asicTitleForPayment" element
         */
        public java.lang.String getAsicTitleForPayment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICTITLEFORPAYMENT$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "asicTitleForPayment" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment xgetAsicTitleForPayment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment)get_store().find_element_user(ASICTITLEFORPAYMENT$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "asicTitleForPayment" element
         */
        public void setAsicTitleForPayment(java.lang.String asicTitleForPayment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICTITLEFORPAYMENT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICTITLEFORPAYMENT$20);
                }
                target.setStringValue(asicTitleForPayment);
            }
        }
        
        /**
         * Sets (as xml) the "asicTitleForPayment" element
         */
        public void xsetAsicTitleForPayment(au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment asicTitleForPayment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment)get_store().find_element_user(ASICTITLEFORPAYMENT$20, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment)get_store().add_element_user(ASICTITLEFORPAYMENT$20);
                }
                target.set(asicTitleForPayment);
            }
        }
        
        /**
         * Gets the "asicAddressForPayment" element
         */
        public java.lang.String getAsicAddressForPayment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICADDRESSFORPAYMENT$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "asicAddressForPayment" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment xgetAsicAddressForPayment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment)get_store().find_element_user(ASICADDRESSFORPAYMENT$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "asicAddressForPayment" element
         */
        public void setAsicAddressForPayment(java.lang.String asicAddressForPayment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICADDRESSFORPAYMENT$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICADDRESSFORPAYMENT$22);
                }
                target.setStringValue(asicAddressForPayment);
            }
        }
        
        /**
         * Sets (as xml) the "asicAddressForPayment" element
         */
        public void xsetAsicAddressForPayment(au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment asicAddressForPayment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment)get_store().find_element_user(ASICADDRESSFORPAYMENT$22, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment)get_store().add_element_user(ASICADDRESSFORPAYMENT$22);
                }
                target.set(asicAddressForPayment);
            }
        }
        
        /**
         * Gets the "asicPhoneForQueries" element
         */
        public java.lang.String getAsicPhoneForQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICPHONEFORQUERIES$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "asicPhoneForQueries" element
         */
        public au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries xgetAsicPhoneForQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries)get_store().find_element_user(ASICPHONEFORQUERIES$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "asicPhoneForQueries" element
         */
        public void setAsicPhoneForQueries(java.lang.String asicPhoneForQueries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASICPHONEFORQUERIES$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASICPHONEFORQUERIES$24);
                }
                target.setStringValue(asicPhoneForQueries);
            }
        }
        
        /**
         * Sets (as xml) the "asicPhoneForQueries" element
         */
        public void xsetAsicPhoneForQueries(au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries asicPhoneForQueries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries target = null;
                target = (au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries)get_store().find_element_user(ASICPHONEFORQUERIES$24, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries)get_store().add_element_user(ASICPHONEFORQUERIES$24);
                }
                target.set(asicPhoneForQueries);
            }
        }
        /**
         * An XML asicName(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicName.
         */
        public static class AsicNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.AsicName
        {
            
            public AsicNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AsicNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML asicAbn(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicAbn.
         */
        public static class AsicAbnImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.AsicAbn
        {
            
            public AsicAbnImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AsicAbnImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML debtorName(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorName.
         */
        public static class DebtorNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.DebtorName
        {
            
            public DebtorNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DebtorNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML debtorBpayReference(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorBpayReference.
         */
        public static class DebtorBpayReferenceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference
        {
            
            public DebtorBpayReferenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DebtorBpayReferenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML debtorDetail(@uri:fss.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class DebtorDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail
        {
            
            public DebtorDetailImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PREFIX$0 = 
                new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "prefix");
            private static final javax.xml.namespace.QName SUFFIX$2 = 
                new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "suffix");
            
            
            /**
             * Gets the "prefix" element
             */
            public java.lang.String getPrefix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "prefix" element
             */
            public au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix xgetPrefix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix)get_store().find_element_user(PREFIX$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "prefix" element
             */
            public void setPrefix(java.lang.String prefix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                    }
                    target.setStringValue(prefix);
                }
            }
            
            /**
             * Sets (as xml) the "prefix" element
             */
            public void xsetPrefix(au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix prefix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix)get_store().find_element_user(PREFIX$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix)get_store().add_element_user(PREFIX$0);
                    }
                    target.set(prefix);
                }
            }
            
            /**
             * Gets the "suffix" element
             */
            public java.lang.String getSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "suffix" element
             */
            public au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix xgetSuffix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix)get_store().find_element_user(SUFFIX$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "suffix" element
             */
            public void setSuffix(java.lang.String suffix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUFFIX$2);
                    }
                    target.setStringValue(suffix);
                }
            }
            
            /**
             * Sets (as xml) the "suffix" element
             */
            public void xsetSuffix(au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix suffix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix)get_store().find_element_user(SUFFIX$2, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix)get_store().add_element_user(SUFFIX$2);
                    }
                    target.set(suffix);
                }
            }
            /**
             * An XML prefix(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorDetail$Prefix.
             */
            public static class PrefixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix
            {
                
                public PrefixImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PrefixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML suffix(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorDetail$Suffix.
             */
            public static class SuffixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix
            {
                
                public SuffixImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected SuffixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML invoiceItems(@uri:fss.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class InvoiceItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems
        {
            
            public InvoiceItemsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ITEM$0 = 
                new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "item");
            
            
            /**
             * Gets array of all "item" elements
             */
            public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item[] getItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ITEM$0, targetList);
                    au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item[] result = new au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "item" element
             */
            public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item getItemArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item)get_store().find_element_user(ITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "item" element
             */
            public int sizeOfItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ITEM$0);
                }
            }
            
            /**
             * Sets array of all "item" element
             */
            public void setItemArray(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item[] itemArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(itemArray, ITEM$0);
                }
            }
            
            /**
             * Sets ith "item" element
             */
            public void setItemArray(int i, au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item item)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item)get_store().find_element_user(ITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(item);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "item" element
             */
            public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item insertNewItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item)get_store().insert_element_user(ITEM$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "item" element
             */
            public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item addNewItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item target = null;
                    target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item)get_store().add_element_user(ITEM$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "item" element
             */
            public void removeItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ITEM$0, i);
                }
            }
            /**
             * An XML item(@uri:fss.types.asic.gov.au).
             *
             * This is a complex type.
             */
            public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item
            {
                
                public ItemImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DESCRIPTION$0 = 
                    new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "description");
                private static final javax.xml.namespace.QName AMOUNT$2 = 
                    new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "amount");
                private static final javax.xml.namespace.QName TAXCODE$4 = 
                    new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "taxCode");
                private static final javax.xml.namespace.QName TAXAMOUNT$6 = 
                    new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "taxAmount");
                private static final javax.xml.namespace.QName REFERENCENO$8 = 
                    new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "referenceNo");
                
                
                /**
                 * Gets array of all "description" elements
                 */
                public java.lang.String[] getDescriptionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DESCRIPTION$0, targetList);
                      java.lang.String[] result = new java.lang.String[targetList.size()];
                      for (int i = 0, len = targetList.size() ; i < len ; i++)
                          result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                      return result;
                    }
                }
                
                /**
                 * Gets ith "description" element
                 */
                public java.lang.String getDescriptionArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) array of all "description" elements
                 */
                public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description[] xgetDescriptionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DESCRIPTION$0, targetList);
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description[] result = new au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets (as xml) ith "description" element
                 */
                public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description xgetDescriptionArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description)get_store().find_element_user(DESCRIPTION$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description)target;
                    }
                }
                
                /**
                 * Returns number of "description" element
                 */
                public int sizeOfDescriptionArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DESCRIPTION$0);
                    }
                }
                
                /**
                 * Sets array of all "description" element
                 */
                public void setDescriptionArray(java.lang.String[] descriptionArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(descriptionArray, DESCRIPTION$0);
                    }
                }
                
                /**
                 * Sets ith "description" element
                 */
                public void setDescriptionArray(int i, java.lang.String description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Sets (as xml) array of all "description" element
                 */
                public void xsetDescriptionArray(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description[]descriptionArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(descriptionArray, DESCRIPTION$0);
                    }
                }
                
                /**
                 * Sets (as xml) ith "description" element
                 */
                public void xsetDescriptionArray(int i, au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description)get_store().find_element_user(DESCRIPTION$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(description);
                    }
                }
                
                /**
                 * Inserts the value as the ith "description" element
                 */
                public void insertDescription(int i, java.lang.String description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = 
                        (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DESCRIPTION$0, i);
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Appends the value as the last "description" element
                 */
                public void addDescription(java.lang.String description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "description" element
                 */
                public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description insertNewDescription(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description)get_store().insert_element_user(DESCRIPTION$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "description" element
                 */
                public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description addNewDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description)get_store().add_element_user(DESCRIPTION$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "description" element
                 */
                public void removeDescription(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DESCRIPTION$0, i);
                    }
                }
                
                /**
                 * Gets the "amount" element
                 */
                public java.math.BigDecimal getAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigDecimalValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "amount" element
                 */
                public au.gov.asic.types.AmountType xgetAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.AmountType target = null;
                      target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "amount" element
                 */
                public void setAmount(java.math.BigDecimal amount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$2);
                      }
                      target.setBigDecimalValue(amount);
                    }
                }
                
                /**
                 * Sets (as xml) the "amount" element
                 */
                public void xsetAmount(au.gov.asic.types.AmountType amount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.AmountType target = null;
                      target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$2, 0);
                      if (target == null)
                      {
                        target = (au.gov.asic.types.AmountType)get_store().add_element_user(AMOUNT$2);
                      }
                      target.set(amount);
                    }
                }
                
                /**
                 * Gets the "taxCode" element
                 */
                public java.lang.String getTaxCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "taxCode" element
                 */
                public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode xgetTaxCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode)get_store().find_element_user(TAXCODE$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "taxCode" element
                 */
                public boolean isSetTaxCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TAXCODE$4) != 0;
                    }
                }
                
                /**
                 * Sets the "taxCode" element
                 */
                public void setTaxCode(java.lang.String taxCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCODE$4);
                      }
                      target.setStringValue(taxCode);
                    }
                }
                
                /**
                 * Sets (as xml) the "taxCode" element
                 */
                public void xsetTaxCode(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode taxCode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode)get_store().find_element_user(TAXCODE$4, 0);
                      if (target == null)
                      {
                        target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode)get_store().add_element_user(TAXCODE$4);
                      }
                      target.set(taxCode);
                    }
                }
                
                /**
                 * Unsets the "taxCode" element
                 */
                public void unsetTaxCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TAXCODE$4, 0);
                    }
                }
                
                /**
                 * Gets the "taxAmount" element
                 */
                public java.math.BigDecimal getTaxAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigDecimalValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "taxAmount" element
                 */
                public au.gov.asic.types.AmountType xgetTaxAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.AmountType target = null;
                      target = (au.gov.asic.types.AmountType)get_store().find_element_user(TAXAMOUNT$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "taxAmount" element
                 */
                public boolean isSetTaxAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TAXAMOUNT$6) != 0;
                    }
                }
                
                /**
                 * Sets the "taxAmount" element
                 */
                public void setTaxAmount(java.math.BigDecimal taxAmount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$6);
                      }
                      target.setBigDecimalValue(taxAmount);
                    }
                }
                
                /**
                 * Sets (as xml) the "taxAmount" element
                 */
                public void xsetTaxAmount(au.gov.asic.types.AmountType taxAmount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.AmountType target = null;
                      target = (au.gov.asic.types.AmountType)get_store().find_element_user(TAXAMOUNT$6, 0);
                      if (target == null)
                      {
                        target = (au.gov.asic.types.AmountType)get_store().add_element_user(TAXAMOUNT$6);
                      }
                      target.set(taxAmount);
                    }
                }
                
                /**
                 * Unsets the "taxAmount" element
                 */
                public void unsetTaxAmount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TAXAMOUNT$6, 0);
                    }
                }
                
                /**
                 * Gets the "referenceNo" element
                 */
                public java.lang.String getReferenceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENO$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "referenceNo" element
                 */
                public au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo xgetReferenceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo)get_store().find_element_user(REFERENCENO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "referenceNo" element
                 */
                public boolean isSetReferenceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(REFERENCENO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "referenceNo" element
                 */
                public void setReferenceNo(java.lang.String referenceNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCENO$8);
                      }
                      target.setStringValue(referenceNo);
                    }
                }
                
                /**
                 * Sets (as xml) the "referenceNo" element
                 */
                public void xsetReferenceNo(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo referenceNo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo target = null;
                      target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo)get_store().find_element_user(REFERENCENO$8, 0);
                      if (target == null)
                      {
                        target = (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo)get_store().add_element_user(REFERENCENO$8);
                      }
                      target.set(referenceNo);
                    }
                }
                
                /**
                 * Unsets the "referenceNo" element
                 */
                public void unsetReferenceNo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(REFERENCENO$8, 0);
                    }
                }
                /**
                 * An XML description(@uri:fss.types.asic.gov.au).
                 *
                 * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$InvoiceItems$Item$Description.
                 */
                public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description
                {
                    
                    public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML taxCode(@uri:fss.types.asic.gov.au).
                 *
                 * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$InvoiceItems$Item$TaxCode.
                 */
                public static class TaxCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode
                {
                    
                    public TaxCodeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TaxCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML referenceNo(@uri:fss.types.asic.gov.au).
                 *
                 * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$InvoiceItems$Item$ReferenceNo.
                 */
                public static class ReferenceNoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo
                {
                    
                    public ReferenceNoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected ReferenceNoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
        /**
         * An XML asicBpayBillerCode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicBpayBillerCode.
         */
        public static class AsicBpayBillerCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode
        {
            
            public AsicBpayBillerCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AsicBpayBillerCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML asicTitleForPayment(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicTitleForPayment.
         */
        public static class AsicTitleForPaymentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment
        {
            
            public AsicTitleForPaymentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AsicTitleForPaymentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML asicAddressForPayment(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicAddressForPayment.
         */
        public static class AsicAddressForPaymentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment
        {
            
            public AsicAddressForPaymentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AsicAddressForPaymentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML asicPhoneForQueries(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicPhoneForQueries.
         */
        public static class AsicPhoneForQueriesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries
        {
            
            public AsicPhoneForQueriesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AsicPhoneForQueriesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
