/*
 * XML Type:  fssCustomerType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssCustomerType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss;


/**
 * An XML fssCustomerType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface FssCustomerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FssCustomerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("fsscustomertype3360type");
    
    /**
     * Gets the "account" element
     */
    au.gov.asic.types.fss.FssAccountType getAccount();
    
    /**
     * Sets the "account" element
     */
    void setAccount(au.gov.asic.types.fss.FssAccountType account);
    
    /**
     * Appends and returns a new empty "account" element
     */
    au.gov.asic.types.fss.FssAccountType addNewAccount();
    
    /**
     * Gets the "abn" element
     */
    java.lang.String getAbn();
    
    /**
     * Gets (as xml) the "abn" element
     */
    au.gov.asic.types.AbnType xgetAbn();
    
    /**
     * True if has "abn" element
     */
    boolean isSetAbn();
    
    /**
     * Sets the "abn" element
     */
    void setAbn(java.lang.String abn);
    
    /**
     * Sets (as xml) the "abn" element
     */
    void xsetAbn(au.gov.asic.types.AbnType abn);
    
    /**
     * Unsets the "abn" element
     */
    void unsetAbn();
    
    /**
     * Gets the "person" element
     */
    au.gov.asic.types.PersonNameType getPerson();
    
    /**
     * True if has "person" element
     */
    boolean isSetPerson();
    
    /**
     * Sets the "person" element
     */
    void setPerson(au.gov.asic.types.PersonNameType person);
    
    /**
     * Appends and returns a new empty "person" element
     */
    au.gov.asic.types.PersonNameType addNewPerson();
    
    /**
     * Unsets the "person" element
     */
    void unsetPerson();
    
    /**
     * Gets the "organisationName" element
     */
    java.lang.String getOrganisationName();
    
    /**
     * Gets (as xml) the "organisationName" element
     */
    au.gov.asic.types.NniNameType xgetOrganisationName();
    
    /**
     * True if has "organisationName" element
     */
    boolean isSetOrganisationName();
    
    /**
     * Sets the "organisationName" element
     */
    void setOrganisationName(java.lang.String organisationName);
    
    /**
     * Sets (as xml) the "organisationName" element
     */
    void xsetOrganisationName(au.gov.asic.types.NniNameType organisationName);
    
    /**
     * Unsets the "organisationName" element
     */
    void unsetOrganisationName();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    au.gov.asic.types.fss.FssCustomerType.Name xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(au.gov.asic.types.fss.FssCustomerType.Name name);
    
    /**
     * Gets the "correspondenceName" element
     */
    java.lang.String getCorrespondenceName();
    
    /**
     * Gets (as xml) the "correspondenceName" element
     */
    au.gov.asic.types.fss.FssCustomerType.CorrespondenceName xgetCorrespondenceName();
    
    /**
     * Sets the "correspondenceName" element
     */
    void setCorrespondenceName(java.lang.String correspondenceName);
    
    /**
     * Sets (as xml) the "correspondenceName" element
     */
    void xsetCorrespondenceName(au.gov.asic.types.fss.FssCustomerType.CorrespondenceName correspondenceName);
    
    /**
     * Gets the "dateRegistration" element
     */
    java.util.Calendar getDateRegistration();
    
    /**
     * Gets (as xml) the "dateRegistration" element
     */
    org.apache.xmlbeans.XmlDate xgetDateRegistration();
    
    /**
     * True if has "dateRegistration" element
     */
    boolean isSetDateRegistration();
    
    /**
     * Sets the "dateRegistration" element
     */
    void setDateRegistration(java.util.Calendar dateRegistration);
    
    /**
     * Sets (as xml) the "dateRegistration" element
     */
    void xsetDateRegistration(org.apache.xmlbeans.XmlDate dateRegistration);
    
    /**
     * Unsets the "dateRegistration" element
     */
    void unsetDateRegistration();
    
    /**
     * Gets the "dateRenewalReview" element
     */
    java.util.Calendar getDateRenewalReview();
    
    /**
     * Gets (as xml) the "dateRenewalReview" element
     */
    org.apache.xmlbeans.XmlDate xgetDateRenewalReview();
    
    /**
     * True if has "dateRenewalReview" element
     */
    boolean isSetDateRenewalReview();
    
    /**
     * Sets the "dateRenewalReview" element
     */
    void setDateRenewalReview(java.util.Calendar dateRenewalReview);
    
    /**
     * Sets (as xml) the "dateRenewalReview" element
     */
    void xsetDateRenewalReview(org.apache.xmlbeans.XmlDate dateRenewalReview);
    
    /**
     * Unsets the "dateRenewalReview" element
     */
    void unsetDateRenewalReview();
    
    /**
     * Gets the "status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    au.gov.asic.types.fss.FssCustomerType.Status xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(au.gov.asic.types.fss.FssCustomerType.Status status);
    
    /**
     * Gets the "phoneNumber" element
     */
    au.gov.asic.types.TelephoneNumberType getPhoneNumber();
    
    /**
     * True if has "phoneNumber" element
     */
    boolean isSetPhoneNumber();
    
    /**
     * Sets the "phoneNumber" element
     */
    void setPhoneNumber(au.gov.asic.types.TelephoneNumberType phoneNumber);
    
    /**
     * Appends and returns a new empty "phoneNumber" element
     */
    au.gov.asic.types.TelephoneNumberType addNewPhoneNumber();
    
    /**
     * Unsets the "phoneNumber" element
     */
    void unsetPhoneNumber();
    
    /**
     * Gets the "faxNumber" element
     */
    au.gov.asic.types.TelephoneNumberType getFaxNumber();
    
    /**
     * True if has "faxNumber" element
     */
    boolean isSetFaxNumber();
    
    /**
     * Sets the "faxNumber" element
     */
    void setFaxNumber(au.gov.asic.types.TelephoneNumberType faxNumber);
    
    /**
     * Appends and returns a new empty "faxNumber" element
     */
    au.gov.asic.types.TelephoneNumberType addNewFaxNumber();
    
    /**
     * Unsets the "faxNumber" element
     */
    void unsetFaxNumber();
    
    /**
     * Gets the "emailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    au.gov.asic.types.EmailType xgetEmailAddress();
    
    /**
     * True if has "emailAddress" element
     */
    boolean isSetEmailAddress();
    
    /**
     * Sets the "emailAddress" element
     */
    void setEmailAddress(java.lang.String emailAddress);
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    void xsetEmailAddress(au.gov.asic.types.EmailType emailAddress);
    
    /**
     * Unsets the "emailAddress" element
     */
    void unsetEmailAddress();
    
    /**
     * Gets the "agent" element
     */
    au.gov.asic.types.fss.FssCustomerType.Agent getAgent();
    
    /**
     * True if has "agent" element
     */
    boolean isSetAgent();
    
    /**
     * Sets the "agent" element
     */
    void setAgent(au.gov.asic.types.fss.FssCustomerType.Agent agent);
    
    /**
     * Appends and returns a new empty "agent" element
     */
    au.gov.asic.types.fss.FssCustomerType.Agent addNewAgent();
    
    /**
     * Unsets the "agent" element
     */
    void unsetAgent();
    
    /**
     * Gets the "creditLimit" element
     */
    java.math.BigDecimal getCreditLimit();
    
    /**
     * Gets (as xml) the "creditLimit" element
     */
    au.gov.asic.types.AmountType xgetCreditLimit();
    
    /**
     * True if has "creditLimit" element
     */
    boolean isSetCreditLimit();
    
    /**
     * Sets the "creditLimit" element
     */
    void setCreditLimit(java.math.BigDecimal creditLimit);
    
    /**
     * Sets (as xml) the "creditLimit" element
     */
    void xsetCreditLimit(au.gov.asic.types.AmountType creditLimit);
    
    /**
     * Unsets the "creditLimit" element
     */
    void unsetCreditLimit();
    
    /**
     * Gets the "billingAddress" element
     */
    au.gov.asic.types.fss.FssCustomerType.BillingAddress getBillingAddress();
    
    /**
     * True if has "billingAddress" element
     */
    boolean isSetBillingAddress();
    
    /**
     * Sets the "billingAddress" element
     */
    void setBillingAddress(au.gov.asic.types.fss.FssCustomerType.BillingAddress billingAddress);
    
    /**
     * Appends and returns a new empty "billingAddress" element
     */
    au.gov.asic.types.fss.FssCustomerType.BillingAddress addNewBillingAddress();
    
    /**
     * Unsets the "billingAddress" element
     */
    void unsetBillingAddress();
    
    /**
     * An XML name(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$Name.
     */
    public interface Name extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("namecc07elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssCustomerType.Name newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssCustomerType.Name) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.Name newInstance() {
              return (au.gov.asic.types.fss.FssCustomerType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssCustomerType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML correspondenceName(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$CorrespondenceName.
     */
    public interface CorrespondenceName extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CorrespondenceName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("correspondencenamef9c1elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssCustomerType.CorrespondenceName newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssCustomerType.CorrespondenceName) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.CorrespondenceName newInstance() {
              return (au.gov.asic.types.fss.FssCustomerType.CorrespondenceName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.CorrespondenceName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssCustomerType.CorrespondenceName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML status(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$Status.
     */
    public interface Status extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("status1ceeelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssCustomerType.Status newValue(java.lang.Object obj) {
              return (au.gov.asic.types.fss.FssCustomerType.Status) type.newValue( obj ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.Status newInstance() {
              return (au.gov.asic.types.fss.FssCustomerType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssCustomerType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML agent(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Agent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("agent6751elemtype");
        
        /**
         * Gets the "account" element
         */
        au.gov.asic.types.fss.FssAccountType getAccount();
        
        /**
         * True if has "account" element
         */
        boolean isSetAccount();
        
        /**
         * Sets the "account" element
         */
        void setAccount(au.gov.asic.types.fss.FssAccountType account);
        
        /**
         * Appends and returns a new empty "account" element
         */
        au.gov.asic.types.fss.FssAccountType addNewAccount();
        
        /**
         * Unsets the "account" element
         */
        void unsetAccount();
        
        /**
         * Gets the "removeAgent" element
         */
        boolean getRemoveAgent();
        
        /**
         * Gets (as xml) the "removeAgent" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRemoveAgent();
        
        /**
         * True if has "removeAgent" element
         */
        boolean isSetRemoveAgent();
        
        /**
         * Sets the "removeAgent" element
         */
        void setRemoveAgent(boolean removeAgent);
        
        /**
         * Sets (as xml) the "removeAgent" element
         */
        void xsetRemoveAgent(org.apache.xmlbeans.XmlBoolean removeAgent);
        
        /**
         * Unsets the "removeAgent" element
         */
        void unsetRemoveAgent();
        
        /**
         * Gets the "manager" element
         */
        java.lang.String getManager();
        
        /**
         * Gets (as xml) the "manager" element
         */
        au.gov.asic.types.fss.FssCustomerType.Agent.Manager xgetManager();
        
        /**
         * True if has "manager" element
         */
        boolean isSetManager();
        
        /**
         * Sets the "manager" element
         */
        void setManager(java.lang.String manager);
        
        /**
         * Sets (as xml) the "manager" element
         */
        void xsetManager(au.gov.asic.types.fss.FssCustomerType.Agent.Manager manager);
        
        /**
         * Unsets the "manager" element
         */
        void unsetManager();
        
        /**
         * An XML manager(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$Agent$Manager.
         */
        public interface Manager extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Manager.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("manager68eaelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FssCustomerType.Agent.Manager newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FssCustomerType.Agent.Manager) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FssCustomerType.Agent.Manager newInstance() {
                  return (au.gov.asic.types.fss.FssCustomerType.Agent.Manager) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FssCustomerType.Agent.Manager newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FssCustomerType.Agent.Manager) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssCustomerType.Agent newInstance() {
              return (au.gov.asic.types.fss.FssCustomerType.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.Agent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssCustomerType.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML billingAddress(@uri:fss.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface BillingAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillingAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("billingaddress6775elemtype");
        
        /**
         * Gets the "address" element
         */
        au.gov.asic.types.AddressType getAddress();
        
        /**
         * True if has "address" element
         */
        boolean isSetAddress();
        
        /**
         * Sets the "address" element
         */
        void setAddress(au.gov.asic.types.AddressType address);
        
        /**
         * Appends and returns a new empty "address" element
         */
        au.gov.asic.types.AddressType addNewAddress();
        
        /**
         * Unsets the "address" element
         */
        void unsetAddress();
        
        /**
         * Gets the "addressType" element
         */
        au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType.Enum getAddressType();
        
        /**
         * Gets (as xml) the "addressType" element
         */
        au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType xgetAddressType();
        
        /**
         * Sets the "addressType" element
         */
        void setAddressType(au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType.Enum addressType);
        
        /**
         * Sets (as xml) the "addressType" element
         */
        void xsetAddressType(au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType addressType);
        
        /**
         * Gets the "returnToSenderIndicator" element
         */
        boolean getReturnToSenderIndicator();
        
        /**
         * Gets (as xml) the "returnToSenderIndicator" element
         */
        org.apache.xmlbeans.XmlBoolean xgetReturnToSenderIndicator();
        
        /**
         * True if has "returnToSenderIndicator" element
         */
        boolean isSetReturnToSenderIndicator();
        
        /**
         * Sets the "returnToSenderIndicator" element
         */
        void setReturnToSenderIndicator(boolean returnToSenderIndicator);
        
        /**
         * Sets (as xml) the "returnToSenderIndicator" element
         */
        void xsetReturnToSenderIndicator(org.apache.xmlbeans.XmlBoolean returnToSenderIndicator);
        
        /**
         * Unsets the "returnToSenderIndicator" element
         */
        void unsetReturnToSenderIndicator();
        
        /**
         * Gets the "removeAddress" element
         */
        boolean getRemoveAddress();
        
        /**
         * Gets (as xml) the "removeAddress" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRemoveAddress();
        
        /**
         * True if has "removeAddress" element
         */
        boolean isSetRemoveAddress();
        
        /**
         * Sets the "removeAddress" element
         */
        void setRemoveAddress(boolean removeAddress);
        
        /**
         * Sets (as xml) the "removeAddress" element
         */
        void xsetRemoveAddress(org.apache.xmlbeans.XmlBoolean removeAddress);
        
        /**
         * Unsets the "removeAddress" element
         */
        void unsetRemoveAddress();
        
        /**
         * An XML addressType(@uri:fss.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssCustomerType$BillingAddress$AddressType.
         */
        public interface AddressType extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("addresstypef3fbelemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum BILLING = Enum.forString("BILLING");
            static final Enum CONTACT = Enum.forString("CONTACT");
            static final Enum PO = Enum.forString("PO");
            static final Enum POH = Enum.forString("POH");
            
            static final int INT_BILLING = Enum.INT_BILLING;
            static final int INT_CONTACT = Enum.INT_CONTACT;
            static final int INT_PO = Enum.INT_PO;
            static final int INT_POH = Enum.INT_POH;
            
            /**
             * Enumeration value class for au.gov.asic.types.fss.FssCustomerType$BillingAddress$AddressType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_BILLING
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_BILLING = 1;
                static final int INT_CONTACT = 2;
                static final int INT_PO = 3;
                static final int INT_POH = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("BILLING", INT_BILLING),
                      new Enum("CONTACT", INT_CONTACT),
                      new Enum("PO", INT_PO),
                      new Enum("POH", INT_POH),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType newValue(java.lang.Object obj) {
                  return (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType) type.newValue( obj ); }
                
                public static au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType newInstance() {
                  return (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.fss.FssCustomerType.BillingAddress.AddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.fss.FssCustomerType.BillingAddress newInstance() {
              return (au.gov.asic.types.fss.FssCustomerType.BillingAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.fss.FssCustomerType.BillingAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.fss.FssCustomerType.BillingAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.fss.FssCustomerType newInstance() {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.fss.FssCustomerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.fss.FssCustomerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.fss.FssCustomerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FssCustomerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.fss.FssCustomerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.fss.FssCustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
