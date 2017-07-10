/*
 * XML Type:  invoiceType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.InvoiceType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML invoiceType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class InvoiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.InvoiceType
{
    
    public InvoiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBTOR$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtor");
    private static final javax.xml.namespace.QName DATEISSUED$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateIssued");
    private static final javax.xml.namespace.QName INVOICEPERIOD$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "invoicePeriod");
    private static final javax.xml.namespace.QName PAID$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "paid");
    private static final javax.xml.namespace.QName OLDUNPAID$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "oldUnpaid");
    private static final javax.xml.namespace.QName CURRENTUNPAID$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "currentUnpaid");
    private static final javax.xml.namespace.QName TOTALDUE$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "totalDue");
    private static final javax.xml.namespace.QName ASICPAYMENTDETAILS$14 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicPaymentDetails");
    
    
    /**
     * Gets the "debtor" element
     */
    public au.gov.asic.types.fss.DebtorType getDebtor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType target = null;
            target = (au.gov.asic.types.fss.DebtorType)get_store().find_element_user(DEBTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "debtor" element
     */
    public void setDebtor(au.gov.asic.types.fss.DebtorType debtor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType target = null;
            target = (au.gov.asic.types.fss.DebtorType)get_store().find_element_user(DEBTOR$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.DebtorType)get_store().add_element_user(DEBTOR$0);
            }
            target.set(debtor);
        }
    }
    
    /**
     * Appends and returns a new empty "debtor" element
     */
    public au.gov.asic.types.fss.DebtorType addNewDebtor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType target = null;
            target = (au.gov.asic.types.fss.DebtorType)get_store().add_element_user(DEBTOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "dateIssued" element
     */
    public java.util.Calendar getDateIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEISSUED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateIssued" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEISSUED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateIssued" element
     */
    public void setDateIssued(java.util.Calendar dateIssued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEISSUED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEISSUED$2);
            }
            target.setCalendarValue(dateIssued);
        }
    }
    
    /**
     * Sets (as xml) the "dateIssued" element
     */
    public void xsetDateIssued(org.apache.xmlbeans.XmlDate dateIssued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEISSUED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEISSUED$2);
            }
            target.set(dateIssued);
        }
    }
    
    /**
     * Gets the "invoicePeriod" element
     */
    public au.gov.asic.types.fss.InvoiceType.InvoicePeriod getInvoicePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.InvoiceType.InvoicePeriod target = null;
            target = (au.gov.asic.types.fss.InvoiceType.InvoicePeriod)get_store().find_element_user(INVOICEPERIOD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "invoicePeriod" element
     */
    public boolean isSetInvoicePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVOICEPERIOD$4) != 0;
        }
    }
    
    /**
     * Sets the "invoicePeriod" element
     */
    public void setInvoicePeriod(au.gov.asic.types.fss.InvoiceType.InvoicePeriod invoicePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.InvoiceType.InvoicePeriod target = null;
            target = (au.gov.asic.types.fss.InvoiceType.InvoicePeriod)get_store().find_element_user(INVOICEPERIOD$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.InvoiceType.InvoicePeriod)get_store().add_element_user(INVOICEPERIOD$4);
            }
            target.set(invoicePeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "invoicePeriod" element
     */
    public au.gov.asic.types.fss.InvoiceType.InvoicePeriod addNewInvoicePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.InvoiceType.InvoicePeriod target = null;
            target = (au.gov.asic.types.fss.InvoiceType.InvoicePeriod)get_store().add_element_user(INVOICEPERIOD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "invoicePeriod" element
     */
    public void unsetInvoicePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVOICEPERIOD$4, 0);
        }
    }
    
    /**
     * Gets the "paid" element
     */
    public au.gov.asic.types.fss.TransactionsType getPaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().find_element_user(PAID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paid" element
     */
    public boolean isSetPaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAID$6) != 0;
        }
    }
    
    /**
     * Sets the "paid" element
     */
    public void setPaid(au.gov.asic.types.fss.TransactionsType paid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().find_element_user(PAID$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionsType)get_store().add_element_user(PAID$6);
            }
            target.set(paid);
        }
    }
    
    /**
     * Appends and returns a new empty "paid" element
     */
    public au.gov.asic.types.fss.TransactionsType addNewPaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().add_element_user(PAID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "paid" element
     */
    public void unsetPaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAID$6, 0);
        }
    }
    
    /**
     * Gets the "oldUnpaid" element
     */
    public au.gov.asic.types.fss.TransactionsType getOldUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().find_element_user(OLDUNPAID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oldUnpaid" element
     */
    public boolean isSetOldUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDUNPAID$8) != 0;
        }
    }
    
    /**
     * Sets the "oldUnpaid" element
     */
    public void setOldUnpaid(au.gov.asic.types.fss.TransactionsType oldUnpaid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().find_element_user(OLDUNPAID$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionsType)get_store().add_element_user(OLDUNPAID$8);
            }
            target.set(oldUnpaid);
        }
    }
    
    /**
     * Appends and returns a new empty "oldUnpaid" element
     */
    public au.gov.asic.types.fss.TransactionsType addNewOldUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().add_element_user(OLDUNPAID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "oldUnpaid" element
     */
    public void unsetOldUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDUNPAID$8, 0);
        }
    }
    
    /**
     * Gets the "currentUnpaid" element
     */
    public au.gov.asic.types.fss.TransactionsType getCurrentUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().find_element_user(CURRENTUNPAID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentUnpaid" element
     */
    public boolean isSetCurrentUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTUNPAID$10) != 0;
        }
    }
    
    /**
     * Sets the "currentUnpaid" element
     */
    public void setCurrentUnpaid(au.gov.asic.types.fss.TransactionsType currentUnpaid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().find_element_user(CURRENTUNPAID$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionsType)get_store().add_element_user(CURRENTUNPAID$10);
            }
            target.set(currentUnpaid);
        }
    }
    
    /**
     * Appends and returns a new empty "currentUnpaid" element
     */
    public au.gov.asic.types.fss.TransactionsType addNewCurrentUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionsType target = null;
            target = (au.gov.asic.types.fss.TransactionsType)get_store().add_element_user(CURRENTUNPAID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "currentUnpaid" element
     */
    public void unsetCurrentUnpaid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTUNPAID$10, 0);
        }
    }
    
    /**
     * Gets the "totalDue" element
     */
    public java.math.BigDecimal getTotalDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDUE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalDue" element
     */
    public au.gov.asic.types.AmountType xgetTotalDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALDUE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totalDue" element
     */
    public void setTotalDue(java.math.BigDecimal totalDue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALDUE$12);
            }
            target.setBigDecimalValue(totalDue);
        }
    }
    
    /**
     * Sets (as xml) the "totalDue" element
     */
    public void xsetTotalDue(au.gov.asic.types.AmountType totalDue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALDUE$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TOTALDUE$12);
            }
            target.set(totalDue);
        }
    }
    
    /**
     * Gets the "asicPaymentDetails" element
     */
    public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails getAsicPaymentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails target = null;
            target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails)get_store().find_element_user(ASICPAYMENTDETAILS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "asicPaymentDetails" element
     */
    public void setAsicPaymentDetails(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails asicPaymentDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails target = null;
            target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails)get_store().find_element_user(ASICPAYMENTDETAILS$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails)get_store().add_element_user(ASICPAYMENTDETAILS$14);
            }
            target.set(asicPaymentDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "asicPaymentDetails" element
     */
    public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails addNewAsicPaymentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails target = null;
            target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails)get_store().add_element_user(ASICPAYMENTDETAILS$14);
            return target;
        }
    }
    /**
     * An XML invoicePeriod(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class InvoicePeriodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.InvoiceType.InvoicePeriod
    {
        
        public InvoicePeriodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATESTART$0 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateStart");
        private static final javax.xml.namespace.QName DATEEND$2 = 
            new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateEnd");
        
        
        /**
         * Gets the "dateStart" element
         */
        public java.util.Calendar getDateStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESTART$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "dateStart" element
         */
        public org.apache.xmlbeans.XmlDate xgetDateStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESTART$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dateStart" element
         */
        public void setDateStart(java.util.Calendar dateStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESTART$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESTART$0);
                }
                target.setCalendarValue(dateStart);
            }
        }
        
        /**
         * Sets (as xml) the "dateStart" element
         */
        public void xsetDateStart(org.apache.xmlbeans.XmlDate dateStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATESTART$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATESTART$0);
                }
                target.set(dateStart);
            }
        }
        
        /**
         * Gets the "dateEnd" element
         */
        public java.util.Calendar getDateEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEEND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "dateEnd" element
         */
        public org.apache.xmlbeans.XmlDate xgetDateEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEEND$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dateEnd" element
         */
        public void setDateEnd(java.util.Calendar dateEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEEND$2);
                }
                target.setCalendarValue(dateEnd);
            }
        }
        
        /**
         * Sets (as xml) the "dateEnd" element
         */
        public void xsetDateEnd(org.apache.xmlbeans.XmlDate dateEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEEND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEEND$2);
                }
                target.set(dateEnd);
            }
        }
    }
    /**
     * An XML asicPaymentDetails(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class AsicPaymentDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails
    {
        
        public AsicPaymentDetailsImpl(org.apache.xmlbeans.SchemaType sType)
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
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment xgetTitleForPayment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment)get_store().find_element_user(TITLEFORPAYMENT$2, 0);
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
        public void xsetTitleForPayment(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment titleForPayment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment)get_store().find_element_user(TITLEFORPAYMENT$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment)get_store().add_element_user(TITLEFORPAYMENT$2);
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
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment xgetAddressForPayment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment)get_store().find_element_user(ADDRESSFORPAYMENT$4, 0);
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
        public void xsetAddressForPayment(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment addressForPayment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment)get_store().find_element_user(ADDRESSFORPAYMENT$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment)get_store().add_element_user(ADDRESSFORPAYMENT$4);
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
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries xgetPhoneForQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries)get_store().find_element_user(PHONEFORQUERIES$6, 0);
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
        public void xsetPhoneForQueries(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries phoneForQueries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries)get_store().find_element_user(PHONEFORQUERIES$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries)get_store().add_element_user(PHONEFORQUERIES$6);
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
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode xgetBarcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode)get_store().find_element_user(BARCODE$8, 0);
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
        public void xsetBarcode(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode barcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode)get_store().find_element_user(BARCODE$8, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode)get_store().add_element_user(BARCODE$8);
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
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay getBpay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay)get_store().find_element_user(BPAY$10, 0);
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
        public void setBpay(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay bpay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay)get_store().find_element_user(BPAY$10, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay)get_store().add_element_user(BPAY$10);
                }
                target.set(bpay);
            }
        }
        
        /**
         * Appends and returns a new empty "bpay" element
         */
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay addNewBpay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay)get_store().add_element_user(BPAY$10);
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
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay getPostBillpay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay)get_store().find_element_user(POSTBILLPAY$12, 0);
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
        public void setPostBillpay(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay postBillpay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay)get_store().find_element_user(POSTBILLPAY$12, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay)get_store().add_element_user(POSTBILLPAY$12);
                }
                target.set(postBillpay);
            }
        }
        
        /**
         * Appends and returns a new empty "postBillpay" element
         */
        public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay addNewPostBillpay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay target = null;
                target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay)get_store().add_element_user(POSTBILLPAY$12);
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
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$TitleForPayment.
         */
        public static class TitleForPaymentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment
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
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$AddressForPayment.
         */
        public static class AddressForPaymentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment
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
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$PhoneForQueries.
         */
        public static class PhoneForQueriesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries
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
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$Barcode.
         */
        public static class BarcodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode
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
        public static class BpayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay
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
            public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode xgetBillerCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode)get_store().find_element_user(BILLERCODE$0, 0);
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
            public void xsetBillerCode(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode billerCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode)get_store().find_element_user(BILLERCODE$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode)get_store().add_element_user(BILLERCODE$0);
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
            public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref xgetRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref)get_store().find_element_user(REF$2, 0);
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
            public void xsetRef(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref ref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref)get_store().find_element_user(REF$2, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref)get_store().add_element_user(REF$2);
                    }
                    target.set(ref);
                }
            }
            /**
             * An XML billerCode(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$Bpay$BillerCode.
             */
            public static class BillerCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode
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
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$Bpay$Ref.
             */
            public static class RefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref
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
        public static class PostBillpayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay
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
            public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode xgetBillpayCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode)get_store().find_element_user(BILLPAYCODE$0, 0);
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
            public void xsetBillpayCode(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode billpayCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode)get_store().find_element_user(BILLPAYCODE$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode)get_store().add_element_user(BILLPAYCODE$0);
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
            public au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref xgetRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref)get_store().find_element_user(REF$2, 0);
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
            public void xsetRef(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref ref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref target = null;
                    target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref)get_store().find_element_user(REF$2, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref)get_store().add_element_user(REF$2);
                    }
                    target.set(ref);
                }
            }
            /**
             * An XML billpayCode(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$PostBillpay$BillpayCode.
             */
            public static class BillpayCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode
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
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$PostBillpay$Ref.
             */
            public static class RefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref
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
}
