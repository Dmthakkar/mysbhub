/*
 * XML Type:  paymentDetailsType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.PaymentDetailsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML paymentDetailsType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface PaymentDetailsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaymentDetailsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("paymentdetailstypea4aatype");
    
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
    au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment xgetTitleForPayment();
    
    /**
     * Sets the "titleForPayment" element
     */
    void setTitleForPayment(java.lang.String titleForPayment);
    
    /**
     * Sets (as xml) the "titleForPayment" element
     */
    void xsetTitleForPayment(au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment titleForPayment);
    
    /**
     * Gets the "addressForPayment" element
     */
    java.lang.String getAddressForPayment();
    
    /**
     * Gets (as xml) the "addressForPayment" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment xgetAddressForPayment();
    
    /**
     * Sets the "addressForPayment" element
     */
    void setAddressForPayment(java.lang.String addressForPayment);
    
    /**
     * Sets (as xml) the "addressForPayment" element
     */
    void xsetAddressForPayment(au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment addressForPayment);
    
    /**
     * Gets the "phoneForQueries" element
     */
    java.lang.String getPhoneForQueries();
    
    /**
     * Gets (as xml) the "phoneForQueries" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries xgetPhoneForQueries();
    
    /**
     * Sets the "phoneForQueries" element
     */
    void setPhoneForQueries(java.lang.String phoneForQueries);
    
    /**
     * Sets (as xml) the "phoneForQueries" element
     */
    void xsetPhoneForQueries(au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries phoneForQueries);
    
    /**
     * Gets the "barcode" element
     */
    java.lang.String getBarcode();
    
    /**
     * Gets (as xml) the "barcode" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.Barcode xgetBarcode();
    
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
    void xsetBarcode(au.gov.asic.types.fss.PaymentDetailsType.Barcode barcode);
    
    /**
     * Unsets the "barcode" element
     */
    void unsetBarcode();
    
    /**
     * Gets the "bpay" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.Bpay getBpay();
    
    /**
     * True if has "bpay" element
     */
    boolean isSetBpay();
    
    /**
     * Sets the "bpay" element
     */
    void setBpay(au.gov.asic.types.fss.PaymentDetailsType.Bpay bpay);
    
    /**
     * Appends and returns a new empty "bpay" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.Bpay addNewBpay();
    
    /**
     * Unsets the "bpay" element
     */
    void unsetBpay();
    
    /**
     * Gets the "postBillpay" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.PostBillpay getPostBillpay();
    
    /**
     * True if has "postBillpay" element
     */
    boolean isSetPostBillpay();
    
    /**
     * Sets the "postBillpay" element
     */
    void setPostBillpay(au.gov.asic.types.fss.PaymentDetailsType.PostBillpay postBillpay);
    
    /**
     * Appends and returns a new empty "postBillpay" element
     */
    au.gov.asic.types.fss.PaymentDetailsType.PostBillpay addNewPostBillpay();
    
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
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$TitleForPayment.
     */
    public interface TitleForPayment extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleForPayment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("titleforpaymentaca9elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment newInstance() {
              return (au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.PaymentDetailsType.TitleForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML addressForPayment(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$AddressForPayment.
     */
    public interface AddressForPayment extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressForPayment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addressforpayment248delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment newInstance() {
              return (au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.PaymentDetailsType.AddressForPayment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML phoneForQueries(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$PhoneForQueries.
     */
    public interface PhoneForQueries extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhoneForQueries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("phoneforqueries5cf3elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries newInstance() {
              return (au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.PaymentDetailsType.PhoneForQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML barcode(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$Barcode.
     */
    public interface Barcode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Barcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("barcodeda3eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.PaymentDetailsType.Barcode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.PaymentDetailsType.Barcode) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.Barcode newInstance() {
              return (au.gov.asic.types.fss.PaymentDetailsType.Barcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.Barcode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.PaymentDetailsType.Barcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bpay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("bpaybac8elemtype");
        
        /**
         * Gets the "billerCode" element
         */
        java.lang.String getBillerCode();
        
        /**
         * Gets (as xml) the "billerCode" element
         */
        au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode xgetBillerCode();
        
        /**
         * Sets the "billerCode" element
         */
        void setBillerCode(java.lang.String billerCode);
        
        /**
         * Sets (as xml) the "billerCode" element
         */
        void xsetBillerCode(au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode billerCode);
        
        /**
         * Gets the "ref" element
         */
        java.lang.String getRef();
        
        /**
         * Gets (as xml) the "ref" element
         */
        au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref xgetRef();
        
        /**
         * Sets the "ref" element
         */
        void setRef(java.lang.String ref);
        
        /**
         * Sets (as xml) the "ref" element
         */
        void xsetRef(au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref ref);
        
        /**
         * An XML billerCode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$Bpay$BillerCode.
         */
        public interface BillerCode extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillerCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("billercode40a5elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode newInstance() {
                  return (au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.Bpay.BillerCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ref(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$Bpay$Ref.
         */
        public interface Ref extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("ref6e87elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref newInstance() {
                  return (au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.Bpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.PaymentDetailsType.Bpay newInstance() {
              return (au.gov.asic.types.fss.PaymentDetailsType.Bpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.Bpay newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.PaymentDetailsType.Bpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostBillpay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("postbillpay521delemtype");
        
        /**
         * Gets the "billpayCode" element
         */
        java.lang.String getBillpayCode();
        
        /**
         * Gets (as xml) the "billpayCode" element
         */
        au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode xgetBillpayCode();
        
        /**
         * Sets the "billpayCode" element
         */
        void setBillpayCode(java.lang.String billpayCode);
        
        /**
         * Sets (as xml) the "billpayCode" element
         */
        void xsetBillpayCode(au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode billpayCode);
        
        /**
         * Gets the "ref" element
         */
        java.lang.String getRef();
        
        /**
         * Gets (as xml) the "ref" element
         */
        au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref xgetRef();
        
        /**
         * Sets the "ref" element
         */
        void setRef(java.lang.String ref);
        
        /**
         * Sets (as xml) the "ref" element
         */
        void xsetRef(au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref ref);
        
        /**
         * An XML billpayCode(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$PostBillpay$BillpayCode.
         */
        public interface BillpayCode extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillpayCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("billpaycodebf23elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode newInstance() {
                  return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.BillpayCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ref(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.PaymentDetailsType$PostBillpay$Ref.
         */
        public interface Ref extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("refb97eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref newInstance() {
                  return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay newInstance() {
              return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.PaymentDetailsType.PostBillpay newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.PaymentDetailsType.PostBillpay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.PaymentDetailsType newInstance() {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.PaymentDetailsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.PaymentDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.PaymentDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.PaymentDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
