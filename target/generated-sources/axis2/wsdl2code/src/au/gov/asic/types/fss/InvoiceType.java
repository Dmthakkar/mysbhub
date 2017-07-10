/*
 * XML Type:  invoiceType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.InvoiceType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML invoiceType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface InvoiceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvoiceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("invoicetype2109type");
    
    /**
     * Gets the "debtor" element
     */
    au.gov.asic.types.fss.DebtorType getDebtor();
    
    /**
     * Sets the "debtor" element
     */
    void setDebtor(au.gov.asic.types.fss.DebtorType debtor);
    
    /**
     * Appends and returns a new empty "debtor" element
     */
    au.gov.asic.types.fss.DebtorType addNewDebtor();
    
    /**
     * Gets the "dateIssued" element
     */
    java.util.Calendar getDateIssued();
    
    /**
     * Gets (as xml) the "dateIssued" element
     */
    org.apache.xmlbeans.XmlDate xgetDateIssued();
    
    /**
     * Sets the "dateIssued" element
     */
    void setDateIssued(java.util.Calendar dateIssued);
    
    /**
     * Sets (as xml) the "dateIssued" element
     */
    void xsetDateIssued(org.apache.xmlbeans.XmlDate dateIssued);
    
    /**
     * Gets the "invoicePeriod" element
     */
    au.gov.asic.types.fss.InvoiceType.InvoicePeriod getInvoicePeriod();
    
    /**
     * True if has "invoicePeriod" element
     */
    boolean isSetInvoicePeriod();
    
    /**
     * Sets the "invoicePeriod" element
     */
    void setInvoicePeriod(au.gov.asic.types.fss.InvoiceType.InvoicePeriod invoicePeriod);
    
    /**
     * Appends and returns a new empty "invoicePeriod" element
     */
    au.gov.asic.types.fss.InvoiceType.InvoicePeriod addNewInvoicePeriod();
    
    /**
     * Unsets the "invoicePeriod" element
     */
    void unsetInvoicePeriod();
    
    /**
     * Gets the "paid" element
     */
    au.gov.asic.types.fss.TransactionsType getPaid();
    
    /**
     * True if has "paid" element
     */
    boolean isSetPaid();
    
    /**
     * Sets the "paid" element
     */
    void setPaid(au.gov.asic.types.fss.TransactionsType paid);
    
    /**
     * Appends and returns a new empty "paid" element
     */
    au.gov.asic.types.fss.TransactionsType addNewPaid();
    
    /**
     * Unsets the "paid" element
     */
    void unsetPaid();
    
    /**
     * Gets the "oldUnpaid" element
     */
    au.gov.asic.types.fss.TransactionsType getOldUnpaid();
    
    /**
     * True if has "oldUnpaid" element
     */
    boolean isSetOldUnpaid();
    
    /**
     * Sets the "oldUnpaid" element
     */
    void setOldUnpaid(au.gov.asic.types.fss.TransactionsType oldUnpaid);
    
    /**
     * Appends and returns a new empty "oldUnpaid" element
     */
    au.gov.asic.types.fss.TransactionsType addNewOldUnpaid();
    
    /**
     * Unsets the "oldUnpaid" element
     */
    void unsetOldUnpaid();
    
    /**
     * Gets the "currentUnpaid" element
     */
    au.gov.asic.types.fss.TransactionsType getCurrentUnpaid();
    
    /**
     * True if has "currentUnpaid" element
     */
    boolean isSetCurrentUnpaid();
    
    /**
     * Sets the "currentUnpaid" element
     */
    void setCurrentUnpaid(au.gov.asic.types.fss.TransactionsType currentUnpaid);
    
    /**
     * Appends and returns a new empty "currentUnpaid" element
     */
    au.gov.asic.types.fss.TransactionsType addNewCurrentUnpaid();
    
    /**
     * Unsets the "currentUnpaid" element
     */
    void unsetCurrentUnpaid();
    
    /**
     * Gets the "totalDue" element
     */
    java.math.BigDecimal getTotalDue();
    
    /**
     * Gets (as xml) the "totalDue" element
     */
    au.gov.asic.types.AmountType xgetTotalDue();
    
    /**
     * Sets the "totalDue" element
     */
    void setTotalDue(java.math.BigDecimal totalDue);
    
    /**
     * Sets (as xml) the "totalDue" element
     */
    void xsetTotalDue(au.gov.asic.types.AmountType totalDue);
    
    /**
     * Gets the "asicPaymentDetails" element
     */
    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails getAsicPaymentDetails();
    
    /**
     * Sets the "asicPaymentDetails" element
     */
    void setAsicPaymentDetails(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails asicPaymentDetails);
    
    /**
     * Appends and returns a new empty "asicPaymentDetails" element
     */
    au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails addNewAsicPaymentDetails();
    
    /**
     * An XML invoicePeriod(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface InvoicePeriod extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvoicePeriod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("invoiceperioddcc3elemtype");
        
        /**
         * Gets the "dateStart" element
         */
        java.util.Calendar getDateStart();
        
        /**
         * Gets (as xml) the "dateStart" element
         */
        org.apache.xmlbeans.XmlDate xgetDateStart();
        
        /**
         * Sets the "dateStart" element
         */
        void setDateStart(java.util.Calendar dateStart);
        
        /**
         * Sets (as xml) the "dateStart" element
         */
        void xsetDateStart(org.apache.xmlbeans.XmlDate dateStart);
        
        /**
         * Gets the "dateEnd" element
         */
        java.util.Calendar getDateEnd();
        
        /**
         * Gets (as xml) the "dateEnd" element
         */
        org.apache.xmlbeans.XmlDate xgetDateEnd();
        
        /**
         * Sets the "dateEnd" element
         */
        void setDateEnd(java.util.Calendar dateEnd);
        
        /**
         * Sets (as xml) the "dateEnd" element
         */
        void xsetDateEnd(org.apache.xmlbeans.XmlDate dateEnd);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.InvoiceType.InvoicePeriod newInstance() {
              return (au.gov.asic.types.fss.InvoiceType.InvoicePeriod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.InvoiceType.InvoicePeriod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.InvoiceType.InvoicePeriod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML asicPaymentDetails(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface AsicPaymentDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicPaymentDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicpaymentdetailsf0edelemtype");
        
        /**
         * Gets the "abn" element
         */
        java.lang.String getAbn();
        
        /**
         * Gets (as xml) the "abn" element
         */
        au.gov.asic.types.AbnType xgetAbn();
        
        /**
         * Sets the "abn" element
         */
        void setAbn(java.lang.String abn);
        
        /**
         * Sets (as xml) the "abn" element
         */
        void xsetAbn(au.gov.asic.types.AbnType abn);
        
        /**
         * Gets the "titleForPayment" element
         */
        java.lang.String getTitleForPayment();
        
        /**
         * Gets (as xml) the "titleForPayment" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment xgetTitleForPayment();
        
        /**
         * Sets the "titleForPayment" element
         */
        void setTitleForPayment(java.lang.String titleForPayment);
        
        /**
         * Sets (as xml) the "titleForPayment" element
         */
        void xsetTitleForPayment(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment titleForPayment);
        
        /**
         * Gets the "addressForPayment" element
         */
        java.lang.String getAddressForPayment();
        
        /**
         * Gets (as xml) the "addressForPayment" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment xgetAddressForPayment();
        
        /**
         * Sets the "addressForPayment" element
         */
        void setAddressForPayment(java.lang.String addressForPayment);
        
        /**
         * Sets (as xml) the "addressForPayment" element
         */
        void xsetAddressForPayment(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment addressForPayment);
        
        /**
         * Gets the "phoneForQueries" element
         */
        java.lang.String getPhoneForQueries();
        
        /**
         * Gets (as xml) the "phoneForQueries" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries xgetPhoneForQueries();
        
        /**
         * Sets the "phoneForQueries" element
         */
        void setPhoneForQueries(java.lang.String phoneForQueries);
        
        /**
         * Sets (as xml) the "phoneForQueries" element
         */
        void xsetPhoneForQueries(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries phoneForQueries);
        
        /**
         * Gets the "barcode" element
         */
        java.lang.String getBarcode();
        
        /**
         * Gets (as xml) the "barcode" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode xgetBarcode();
        
        /**
         * True if has "barcode" element
         */
        boolean isSetBarcode();
        
        /**
         * Sets the "barcode" element
         */
        void setBarcode(java.lang.String barcode);
        
        /**
         * Sets (as xml) the "barcode" element
         */
        void xsetBarcode(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode barcode);
        
        /**
         * Unsets the "barcode" element
         */
        void unsetBarcode();
        
        /**
         * Gets the "bpay" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay getBpay();
        
        /**
         * True if has "bpay" element
         */
        boolean isSetBpay();
        
        /**
         * Sets the "bpay" element
         */
        void setBpay(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay bpay);
        
        /**
         * Appends and returns a new empty "bpay" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay addNewBpay();
        
        /**
         * Unsets the "bpay" element
         */
        void unsetBpay();
        
        /**
         * Gets the "postBillpay" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay getPostBillpay();
        
        /**
         * True if has "postBillpay" element
         */
        boolean isSetPostBillpay();
        
        /**
         * Sets the "postBillpay" element
         */
        void setPostBillpay(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay postBillpay);
        
        /**
         * Appends and returns a new empty "postBillpay" element
         */
        au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay addNewPostBillpay();
        
        /**
         * Unsets the "postBillpay" element
         */
        void unsetPostBillpay();
        
        /**
         * Gets the "eftReferenceNumber" element
         */
        java.math.BigInteger getEftReferenceNumber();
        
        /**
         * Gets (as xml) the "eftReferenceNumber" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetEftReferenceNumber();
        
        /**
         * True if has "eftReferenceNumber" element
         */
        boolean isSetEftReferenceNumber();
        
        /**
         * Sets the "eftReferenceNumber" element
         */
        void setEftReferenceNumber(java.math.BigInteger eftReferenceNumber);
        
        /**
         * Sets (as xml) the "eftReferenceNumber" element
         */
        void xsetEftReferenceNumber(org.apache.xmlbeans.XmlPositiveInteger eftReferenceNumber);
        
        /**
         * Unsets the "eftReferenceNumber" element
         */
        void unsetEftReferenceNumber();
        
        /**
         * An XML titleForPayment(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$TitleForPayment.
         */
        public interface TitleForPayment extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleForPayment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("titleforpayment8eacelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment newInstance() {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.TitleForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML addressForPayment(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$AddressForPayment.
         */
        public interface AddressForPayment extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressForPayment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressforpayment6790elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment newInstance() {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.AddressForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML phoneForQueries(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$PhoneForQueries.
         */
        public interface PhoneForQueries extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhoneForQueries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("phoneforqueriesf576elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries newInstance() {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PhoneForQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML barcode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$Barcode.
         */
        public interface Barcode extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Barcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("barcoded381elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode newInstance() {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Barcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bpay(@uri:fss.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Bpay extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bpay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bpayfa8belemtype");
            
            /**
             * Gets the "billerCode" element
             */
            java.lang.String getBillerCode();
            
            /**
             * Gets (as xml) the "billerCode" element
             */
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode xgetBillerCode();
            
            /**
             * Sets the "billerCode" element
             */
            void setBillerCode(java.lang.String billerCode);
            
            /**
             * Sets (as xml) the "billerCode" element
             */
            void xsetBillerCode(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode billerCode);
            
            /**
             * Gets the "ref" element
             */
            java.lang.String getRef();
            
            /**
             * Gets (as xml) the "ref" element
             */
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref xgetRef();
            
            /**
             * Sets the "ref" element
             */
            void setRef(java.lang.String ref);
            
            /**
             * Sets (as xml) the "ref" element
             */
            void xsetRef(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref ref);
            
            /**
             * An XML billerCode(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$Bpay$BillerCode.
             */
            public interface BillerCode extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillerCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("billercode79a8elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode newInstance() {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.BillerCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ref(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$Bpay$Ref.
             */
            public interface Ref extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("refb40aelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref newInstance() {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay newInstance() {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.Bpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML postBillpay(@uri:fss.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface PostBillpay extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostBillpay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postbillpay9920elemtype");
            
            /**
             * Gets the "billpayCode" element
             */
            java.lang.String getBillpayCode();
            
            /**
             * Gets (as xml) the "billpayCode" element
             */
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode xgetBillpayCode();
            
            /**
             * Sets the "billpayCode" element
             */
            void setBillpayCode(java.lang.String billpayCode);
            
            /**
             * Sets (as xml) the "billpayCode" element
             */
            void xsetBillpayCode(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode billpayCode);
            
            /**
             * Gets the "ref" element
             */
            java.lang.String getRef();
            
            /**
             * Gets (as xml) the "ref" element
             */
            au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref xgetRef();
            
            /**
             * Sets the "ref" element
             */
            void setRef(java.lang.String ref);
            
            /**
             * Sets (as xml) the "ref" element
             */
            void xsetRef(au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref ref);
            
            /**
             * An XML billpayCode(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$PostBillpay$BillpayCode.
             */
            public interface BillpayCode extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillpayCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("billpaycodec3a6elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode newInstance() {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.BillpayCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ref(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.InvoiceType$AsicPaymentDetails$PostBillpay$Ref.
             */
            public interface Ref extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("ref02c1elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref newInstance() {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay newInstance() {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails.PostBillpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails newInstance() {
              return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.InvoiceType.AsicPaymentDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.InvoiceType newInstance() {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.InvoiceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.InvoiceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.InvoiceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.InvoiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.InvoiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.InvoiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
