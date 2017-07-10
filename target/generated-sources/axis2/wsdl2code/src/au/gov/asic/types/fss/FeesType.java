/*
 * XML Type:  feesType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FeesType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML feesType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface FeesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("feestype207btype");
    
    /**
     * Gets the "lodgementUnit" element
     */
    int getLodgementUnit();
    
    /**
     * Gets (as xml) the "lodgementUnit" element
     */
    au.gov.asic.types.AsicNumericIdType xgetLodgementUnit();
    
    /**
     * True if has "lodgementUnit" element
     */
    boolean isSetLodgementUnit();
    
    /**
     * Sets the "lodgementUnit" element
     */
    void setLodgementUnit(int lodgementUnit);
    
    /**
     * Sets (as xml) the "lodgementUnit" element
     */
    void xsetLodgementUnit(au.gov.asic.types.AsicNumericIdType lodgementUnit);
    
    /**
     * Unsets the "lodgementUnit" element
     */
    void unsetLodgementUnit();
    
    /**
     * Gets the "lodgementDate" element
     */
    java.util.Calendar getLodgementDate();
    
    /**
     * Gets (as xml) the "lodgementDate" element
     */
    org.apache.xmlbeans.XmlDate xgetLodgementDate();
    
    /**
     * Sets the "lodgementDate" element
     */
    void setLodgementDate(java.util.Calendar lodgementDate);
    
    /**
     * Sets (as xml) the "lodgementDate" element
     */
    void xsetLodgementDate(org.apache.xmlbeans.XmlDate lodgementDate);
    
    /**
     * Gets the "paymentMethod" element
     */
    au.gov.asic.types.fss.PaymentMethodType.Enum getPaymentMethod();
    
    /**
     * Gets (as xml) the "paymentMethod" element
     */
    au.gov.asic.types.fss.PaymentMethodType xgetPaymentMethod();
    
    /**
     * True if has "paymentMethod" element
     */
    boolean isSetPaymentMethod();
    
    /**
     * Sets the "paymentMethod" element
     */
    void setPaymentMethod(au.gov.asic.types.fss.PaymentMethodType.Enum paymentMethod);
    
    /**
     * Sets (as xml) the "paymentMethod" element
     */
    void xsetPaymentMethod(au.gov.asic.types.fss.PaymentMethodType paymentMethod);
    
    /**
     * Unsets the "paymentMethod" element
     */
    void unsetPaymentMethod();
    
    /**
     * Gets the "totalAmountOwing" element
     */
    java.math.BigDecimal getTotalAmountOwing();
    
    /**
     * Gets (as xml) the "totalAmountOwing" element
     */
    au.gov.asic.types.AmountType xgetTotalAmountOwing();
    
    /**
     * Sets the "totalAmountOwing" element
     */
    void setTotalAmountOwing(java.math.BigDecimal totalAmountOwing);
    
    /**
     * Sets (as xml) the "totalAmountOwing" element
     */
    void xsetTotalAmountOwing(au.gov.asic.types.AmountType totalAmountOwing);
    
    /**
     * Gets the "invoice" element
     */
    au.gov.asic.types.fss.FeesType.Invoice getInvoice();
    
    /**
     * True if has "invoice" element
     */
    boolean isSetInvoice();
    
    /**
     * Sets the "invoice" element
     */
    void setInvoice(au.gov.asic.types.fss.FeesType.Invoice invoice);
    
    /**
     * Appends and returns a new empty "invoice" element
     */
    au.gov.asic.types.fss.FeesType.Invoice addNewInvoice();
    
    /**
     * Unsets the "invoice" element
     */
    void unsetInvoice();
    
    /**
     * An XML invoice(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Invoice extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Invoice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("invoice3c82elemtype");
        
        /**
         * Gets the "asicName" element
         */
        java.lang.String getAsicName();
        
        /**
         * Gets (as xml) the "asicName" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.AsicName xgetAsicName();
        
        /**
         * Sets the "asicName" element
         */
        void setAsicName(java.lang.String asicName);
        
        /**
         * Sets (as xml) the "asicName" element
         */
        void xsetAsicName(au.gov.asic.types.fss.FeesType.Invoice.AsicName asicName);
        
        /**
         * Gets the "asicAbn" element
         */
        java.lang.String getAsicAbn();
        
        /**
         * Gets (as xml) the "asicAbn" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.AsicAbn xgetAsicAbn();
        
        /**
         * Sets the "asicAbn" element
         */
        void setAsicAbn(java.lang.String asicAbn);
        
        /**
         * Sets (as xml) the "asicAbn" element
         */
        void xsetAsicAbn(au.gov.asic.types.fss.FeesType.Invoice.AsicAbn asicAbn);
        
        /**
         * Gets the "debtorName" element
         */
        java.lang.String getDebtorName();
        
        /**
         * Gets (as xml) the "debtorName" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.DebtorName xgetDebtorName();
        
        /**
         * Sets the "debtorName" element
         */
        void setDebtorName(java.lang.String debtorName);
        
        /**
         * Sets (as xml) the "debtorName" element
         */
        void xsetDebtorName(au.gov.asic.types.fss.FeesType.Invoice.DebtorName debtorName);
        
        /**
         * Gets the "debtorAddress" element
         */
        au.gov.asic.types.AddressType getDebtorAddress();
        
        /**
         * Sets the "debtorAddress" element
         */
        void setDebtorAddress(au.gov.asic.types.AddressType debtorAddress);
        
        /**
         * Appends and returns a new empty "debtorAddress" element
         */
        au.gov.asic.types.AddressType addNewDebtorAddress();
        
        /**
         * Gets the "debtorAccount" element
         */
        au.gov.asic.types.fss.FssAccountType getDebtorAccount();
        
        /**
         * Sets the "debtorAccount" element
         */
        void setDebtorAccount(au.gov.asic.types.fss.FssAccountType debtorAccount);
        
        /**
         * Appends and returns a new empty "debtorAccount" element
         */
        au.gov.asic.types.fss.FssAccountType addNewDebtorAccount();
        
        /**
         * Gets the "debtorBpayReference" element
         */
        java.lang.String getDebtorBpayReference();
        
        /**
         * Gets (as xml) the "debtorBpayReference" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference xgetDebtorBpayReference();
        
        /**
         * Sets the "debtorBpayReference" element
         */
        void setDebtorBpayReference(java.lang.String debtorBpayReference);
        
        /**
         * Sets (as xml) the "debtorBpayReference" element
         */
        void xsetDebtorBpayReference(au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference debtorBpayReference);
        
        /**
         * Gets array of all "debtorDetail" elements
         */
        au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail[] getDebtorDetailArray();
        
        /**
         * Gets ith "debtorDetail" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail getDebtorDetailArray(int i);
        
        /**
         * Returns number of "debtorDetail" element
         */
        int sizeOfDebtorDetailArray();
        
        /**
         * Sets array of all "debtorDetail" element
         */
        void setDebtorDetailArray(au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail[] debtorDetailArray);
        
        /**
         * Sets ith "debtorDetail" element
         */
        void setDebtorDetailArray(int i, au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail debtorDetail);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "debtorDetail" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail insertNewDebtorDetail(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "debtorDetail" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail addNewDebtorDetail();
        
        /**
         * Removes the ith "debtorDetail" element
         */
        void removeDebtorDetail(int i);
        
        /**
         * Gets the "invoiceIssueDate" element
         */
        java.util.Calendar getInvoiceIssueDate();
        
        /**
         * Gets (as xml) the "invoiceIssueDate" element
         */
        org.apache.xmlbeans.XmlDate xgetInvoiceIssueDate();
        
        /**
         * Sets the "invoiceIssueDate" element
         */
        void setInvoiceIssueDate(java.util.Calendar invoiceIssueDate);
        
        /**
         * Sets (as xml) the "invoiceIssueDate" element
         */
        void xsetInvoiceIssueDate(org.apache.xmlbeans.XmlDate invoiceIssueDate);
        
        /**
         * Gets the "invoiceItems" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems getInvoiceItems();
        
        /**
         * Sets the "invoiceItems" element
         */
        void setInvoiceItems(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems invoiceItems);
        
        /**
         * Appends and returns a new empty "invoiceItems" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems addNewInvoiceItems();
        
        /**
         * Gets the "asicBpayBillerCode" element
         */
        java.lang.String getAsicBpayBillerCode();
        
        /**
         * Gets (as xml) the "asicBpayBillerCode" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode xgetAsicBpayBillerCode();
        
        /**
         * Sets the "asicBpayBillerCode" element
         */
        void setAsicBpayBillerCode(java.lang.String asicBpayBillerCode);
        
        /**
         * Sets (as xml) the "asicBpayBillerCode" element
         */
        void xsetAsicBpayBillerCode(au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode asicBpayBillerCode);
        
        /**
         * Gets the "asicTitleForPayment" element
         */
        java.lang.String getAsicTitleForPayment();
        
        /**
         * Gets (as xml) the "asicTitleForPayment" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment xgetAsicTitleForPayment();
        
        /**
         * Sets the "asicTitleForPayment" element
         */
        void setAsicTitleForPayment(java.lang.String asicTitleForPayment);
        
        /**
         * Sets (as xml) the "asicTitleForPayment" element
         */
        void xsetAsicTitleForPayment(au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment asicTitleForPayment);
        
        /**
         * Gets the "asicAddressForPayment" element
         */
        java.lang.String getAsicAddressForPayment();
        
        /**
         * Gets (as xml) the "asicAddressForPayment" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment xgetAsicAddressForPayment();
        
        /**
         * Sets the "asicAddressForPayment" element
         */
        void setAsicAddressForPayment(java.lang.String asicAddressForPayment);
        
        /**
         * Sets (as xml) the "asicAddressForPayment" element
         */
        void xsetAsicAddressForPayment(au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment asicAddressForPayment);
        
        /**
         * Gets the "asicPhoneForQueries" element
         */
        java.lang.String getAsicPhoneForQueries();
        
        /**
         * Gets (as xml) the "asicPhoneForQueries" element
         */
        au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries xgetAsicPhoneForQueries();
        
        /**
         * Sets the "asicPhoneForQueries" element
         */
        void setAsicPhoneForQueries(java.lang.String asicPhoneForQueries);
        
        /**
         * Sets (as xml) the "asicPhoneForQueries" element
         */
        void xsetAsicPhoneForQueries(au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries asicPhoneForQueries);
        
        /**
         * An XML asicName(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicName.
         */
        public interface AsicName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicname120felemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicName newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicName) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicName newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML asicAbn(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicAbn.
         */
        public interface AsicAbn extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicAbn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicabna475elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicAbn newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicAbn) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicAbn newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicAbn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicAbn newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicAbn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML debtorName(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorName.
         */
        public interface DebtorName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DebtorName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("debtornamed6e5elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorName newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorName) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorName newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML debtorBpayReference(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorBpayReference.
         */
        public interface DebtorBpayReference extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DebtorBpayReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("debtorbpayreference0be7elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorBpayReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML debtorDetail(@uri:fss.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface DebtorDetail extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DebtorDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("debtordetaildfdfelemtype");
            
            /**
             * Gets the "prefix" element
             */
            java.lang.String getPrefix();
            
            /**
             * Gets (as xml) the "prefix" element
             */
            au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix xgetPrefix();
            
            /**
             * Sets the "prefix" element
             */
            void setPrefix(java.lang.String prefix);
            
            /**
             * Sets (as xml) the "prefix" element
             */
            void xsetPrefix(au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix prefix);
            
            /**
             * Gets the "suffix" element
             */
            java.lang.String getSuffix();
            
            /**
             * Gets (as xml) the "suffix" element
             */
            au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix xgetSuffix();
            
            /**
             * Sets the "suffix" element
             */
            void setSuffix(java.lang.String suffix);
            
            /**
             * Sets (as xml) the "suffix" element
             */
            void xsetSuffix(au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix suffix);
            
            /**
             * An XML prefix(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorDetail$Prefix.
             */
            public interface Prefix extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prefix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("prefixcc8delemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix newInstance() {
                      return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML suffix(@uri:fss.types.asic.gov.au).
             *
             * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$DebtorDetail$Suffix.
             */
            public interface Suffix extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Suffix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("suffixbd0celemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix newValue(java.lang.Object obj) {
                      return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix) type.newValue( obj ); }
                    
                    public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix newInstance() {
                      return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail.Suffix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.DebtorDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML invoiceItems(@uri:fss.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface InvoiceItems extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvoiceItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("invoiceitemsc773elemtype");
            
            /**
             * Gets array of all "item" elements
             */
            au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item[] getItemArray();
            
            /**
             * Gets ith "item" element
             */
            au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item getItemArray(int i);
            
            /**
             * Returns number of "item" element
             */
            int sizeOfItemArray();
            
            /**
             * Sets array of all "item" element
             */
            void setItemArray(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item[] itemArray);
            
            /**
             * Sets ith "item" element
             */
            void setItemArray(int i, au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item item);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "item" element
             */
            au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item insertNewItem(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "item" element
             */
            au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item addNewItem();
            
            /**
             * Removes the ith "item" element
             */
            void removeItem(int i);
            
            /**
             * An XML item(@uri:fss.types.asic.gov.au).
             *
             * This is a complex type.
             */
            public interface Item extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("item66e2elemtype");
                
                /**
                 * Gets array of all "description" elements
                 */
                java.lang.String[] getDescriptionArray();
                
                /**
                 * Gets ith "description" element
                 */
                java.lang.String getDescriptionArray(int i);
                
                /**
                 * Gets (as xml) array of all "description" elements
                 */
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description[] xgetDescriptionArray();
                
                /**
                 * Gets (as xml) ith "description" element
                 */
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description xgetDescriptionArray(int i);
                
                /**
                 * Returns number of "description" element
                 */
                int sizeOfDescriptionArray();
                
                /**
                 * Sets array of all "description" element
                 */
                void setDescriptionArray(java.lang.String[] descriptionArray);
                
                /**
                 * Sets ith "description" element
                 */
                void setDescriptionArray(int i, java.lang.String description);
                
                /**
                 * Sets (as xml) array of all "description" element
                 */
                void xsetDescriptionArray(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description[] descriptionArray);
                
                /**
                 * Sets (as xml) ith "description" element
                 */
                void xsetDescriptionArray(int i, au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description description);
                
                /**
                 * Inserts the value as the ith "description" element
                 */
                void insertDescription(int i, java.lang.String description);
                
                /**
                 * Appends the value as the last "description" element
                 */
                void addDescription(java.lang.String description);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "description" element
                 */
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description insertNewDescription(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "description" element
                 */
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description addNewDescription();
                
                /**
                 * Removes the ith "description" element
                 */
                void removeDescription(int i);
                
                /**
                 * Gets the "amount" element
                 */
                java.math.BigDecimal getAmount();
                
                /**
                 * Gets (as xml) the "amount" element
                 */
                au.gov.asic.types.AmountType xgetAmount();
                
                /**
                 * Sets the "amount" element
                 */
                void setAmount(java.math.BigDecimal amount);
                
                /**
                 * Sets (as xml) the "amount" element
                 */
                void xsetAmount(au.gov.asic.types.AmountType amount);
                
                /**
                 * Gets the "taxCode" element
                 */
                java.lang.String getTaxCode();
                
                /**
                 * Gets (as xml) the "taxCode" element
                 */
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode xgetTaxCode();
                
                /**
                 * True if has "taxCode" element
                 */
                boolean isSetTaxCode();
                
                /**
                 * Sets the "taxCode" element
                 */
                void setTaxCode(java.lang.String taxCode);
                
                /**
                 * Sets (as xml) the "taxCode" element
                 */
                void xsetTaxCode(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode taxCode);
                
                /**
                 * Unsets the "taxCode" element
                 */
                void unsetTaxCode();
                
                /**
                 * Gets the "taxAmount" element
                 */
                java.math.BigDecimal getTaxAmount();
                
                /**
                 * Gets (as xml) the "taxAmount" element
                 */
                au.gov.asic.types.AmountType xgetTaxAmount();
                
                /**
                 * True if has "taxAmount" element
                 */
                boolean isSetTaxAmount();
                
                /**
                 * Sets the "taxAmount" element
                 */
                void setTaxAmount(java.math.BigDecimal taxAmount);
                
                /**
                 * Sets (as xml) the "taxAmount" element
                 */
                void xsetTaxAmount(au.gov.asic.types.AmountType taxAmount);
                
                /**
                 * Unsets the "taxAmount" element
                 */
                void unsetTaxAmount();
                
                /**
                 * Gets the "referenceNo" element
                 */
                java.lang.String getReferenceNo();
                
                /**
                 * Gets (as xml) the "referenceNo" element
                 */
                au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo xgetReferenceNo();
                
                /**
                 * True if has "referenceNo" element
                 */
                boolean isSetReferenceNo();
                
                /**
                 * Sets the "referenceNo" element
                 */
                void setReferenceNo(java.lang.String referenceNo);
                
                /**
                 * Sets (as xml) the "referenceNo" element
                 */
                void xsetReferenceNo(au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo referenceNo);
                
                /**
                 * Unsets the "referenceNo" element
                 */
                void unsetReferenceNo();
                
                /**
                 * An XML description(@uri:fss.types.asic.gov.au).
                 *
                 * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$InvoiceItems$Item$Description.
                 */
                public interface Description extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("description7b7aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description newValue(java.lang.Object obj) {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description) type.newValue( obj ); }
                      
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description newInstance() {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML taxCode(@uri:fss.types.asic.gov.au).
                 *
                 * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$InvoiceItems$Item$TaxCode.
                 */
                public interface TaxCode extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaxCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("taxcode9cbeelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode newValue(java.lang.Object obj) {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode) type.newValue( obj ); }
                      
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode newInstance() {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.TaxCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML referenceNo(@uri:fss.types.asic.gov.au).
                 *
                 * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$InvoiceItems$Item$ReferenceNo.
                 */
                public interface ReferenceNo extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferenceNo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("referenceno630aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo newValue(java.lang.Object obj) {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo) type.newValue( obj ); }
                      
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo newInstance() {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item.ReferenceNo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item newInstance() {
                      return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.InvoiceItems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML asicBpayBillerCode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicBpayBillerCode.
         */
        public interface AsicBpayBillerCode extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicBpayBillerCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicbpaybillercode5973elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicBpayBillerCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML asicTitleForPayment(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicTitleForPayment.
         */
        public interface AsicTitleForPayment extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicTitleForPayment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asictitleforpayment7c6delemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicTitleForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML asicAddressForPayment(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicAddressForPayment.
         */
        public interface AsicAddressForPayment extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicAddressForPayment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicaddressforpaymenta951elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicAddressForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML asicPhoneForQueries(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeesType$Invoice$AsicPhoneForQueries.
         */
        public interface AsicPhoneForQueries extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AsicPhoneForQueries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("asicphoneforqueries2cb7elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries newInstance() {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FeesType.Invoice.AsicPhoneForQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FeesType.Invoice newInstance() {
              return (au.gov.asic.types.fss.FeesType.Invoice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FeesType.Invoice newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FeesType.Invoice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.FeesType newInstance() {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.FeesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.FeesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.FeesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.FeesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.FeesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.FeesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FeesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FeesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FeesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
