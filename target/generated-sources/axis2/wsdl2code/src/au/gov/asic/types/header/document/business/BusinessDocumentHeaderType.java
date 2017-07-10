/*
 * XML Type:  businessDocumentHeaderType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.BusinessDocumentHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business;


/**
 * An XML businessDocumentHeaderType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BusinessDocumentHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessDocumentHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("businessdocumentheadertype9868type");
    
    /**
     * Gets the "messageType" element
     */
    java.lang.String getMessageType();
    
    /**
     * Gets (as xml) the "messageType" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType xgetMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(java.lang.String messageType);
    
    /**
     * Sets (as xml) the "messageType" element
     */
    void xsetMessageType(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType messageType);
    
    /**
     * Gets the "messageReferenceNumber" element
     */
    java.lang.String getMessageReferenceNumber();
    
    /**
     * Gets (as xml) the "messageReferenceNumber" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber xgetMessageReferenceNumber();
    
    /**
     * Sets the "messageReferenceNumber" element
     */
    void setMessageReferenceNumber(java.lang.String messageReferenceNumber);
    
    /**
     * Sets (as xml) the "messageReferenceNumber" element
     */
    void xsetMessageReferenceNumber(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber messageReferenceNumber);
    
    /**
     * Gets the "asicReferenceNumber" element
     */
    java.lang.String getAsicReferenceNumber();
    
    /**
     * Gets (as xml) the "asicReferenceNumber" element
     */
    org.apache.xmlbeans.XmlString xgetAsicReferenceNumber();
    
    /**
     * True if has "asicReferenceNumber" element
     */
    boolean isSetAsicReferenceNumber();
    
    /**
     * Sets the "asicReferenceNumber" element
     */
    void setAsicReferenceNumber(java.lang.String asicReferenceNumber);
    
    /**
     * Sets (as xml) the "asicReferenceNumber" element
     */
    void xsetAsicReferenceNumber(org.apache.xmlbeans.XmlString asicReferenceNumber);
    
    /**
     * Unsets the "asicReferenceNumber" element
     */
    void unsetAsicReferenceNumber();
    
    /**
     * Gets the "messageVersion" element
     */
    long getMessageVersion();
    
    /**
     * Gets (as xml) the "messageVersion" element
     */
    org.apache.xmlbeans.XmlLong xgetMessageVersion();
    
    /**
     * Sets the "messageVersion" element
     */
    void setMessageVersion(long messageVersion);
    
    /**
     * Sets (as xml) the "messageVersion" element
     */
    void xsetMessageVersion(org.apache.xmlbeans.XmlLong messageVersion);
    
    /**
     * Gets the "senderId" element
     */
    java.lang.String getSenderId();
    
    /**
     * Gets (as xml) the "senderId" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId xgetSenderId();
    
    /**
     * Sets the "senderId" element
     */
    void setSenderId(java.lang.String senderId);
    
    /**
     * Sets (as xml) the "senderId" element
     */
    void xsetSenderId(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId senderId);
    
    /**
     * Gets the "senderType" element
     */
    java.lang.String getSenderType();
    
    /**
     * Gets (as xml) the "senderType" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType xgetSenderType();
    
    /**
     * Sets the "senderType" element
     */
    void setSenderType(java.lang.String senderType);
    
    /**
     * Sets (as xml) the "senderType" element
     */
    void xsetSenderType(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType senderType);
    
    /**
     * Gets the "softwareInformation" element
     */
    au.gov.asic.types.header.document.business.SoftwareInformationType getSoftwareInformation();
    
    /**
     * True if has "softwareInformation" element
     */
    boolean isSetSoftwareInformation();
    
    /**
     * Sets the "softwareInformation" element
     */
    void setSoftwareInformation(au.gov.asic.types.header.document.business.SoftwareInformationType softwareInformation);
    
    /**
     * Appends and returns a new empty "softwareInformation" element
     */
    au.gov.asic.types.header.document.business.SoftwareInformationType addNewSoftwareInformation();
    
    /**
     * Unsets the "softwareInformation" element
     */
    void unsetSoftwareInformation();
    
    /**
     * Gets the "messageTimestamps" element
     */
    au.gov.asic.types.header.document.business.MessageTimestampsType getMessageTimestamps();
    
    /**
     * True if has "messageTimestamps" element
     */
    boolean isSetMessageTimestamps();
    
    /**
     * Sets the "messageTimestamps" element
     */
    void setMessageTimestamps(au.gov.asic.types.header.document.business.MessageTimestampsType messageTimestamps);
    
    /**
     * Appends and returns a new empty "messageTimestamps" element
     */
    au.gov.asic.types.header.document.business.MessageTimestampsType addNewMessageTimestamps();
    
    /**
     * Unsets the "messageTimestamps" element
     */
    void unsetMessageTimestamps();
    
    /**
     * Gets the "messageEvents" element
     */
    au.gov.asic.types.header.document.business.MessageEventsType getMessageEvents();
    
    /**
     * True if has "messageEvents" element
     */
    boolean isSetMessageEvents();
    
    /**
     * Sets the "messageEvents" element
     */
    void setMessageEvents(au.gov.asic.types.header.document.business.MessageEventsType messageEvents);
    
    /**
     * Appends and returns a new empty "messageEvents" element
     */
    au.gov.asic.types.header.document.business.MessageEventsType addNewMessageEvents();
    
    /**
     * Unsets the "messageEvents" element
     */
    void unsetMessageEvents();
    
    /**
     * Gets the "result" element
     */
    au.gov.asic.types.header.document.business.GenericResultType getResult();
    
    /**
     * True if has "result" element
     */
    boolean isSetResult();
    
    /**
     * Sets the "result" element
     */
    void setResult(au.gov.asic.types.header.document.business.GenericResultType result);
    
    /**
     * Appends and returns a new empty "result" element
     */
    au.gov.asic.types.header.document.business.GenericResultType addNewResult();
    
    /**
     * Unsets the "result" element
     */
    void unsetResult();
    
    /**
     * Gets the "attachments" element
     */
    au.gov.asic.types.header.document.business.AttachmentsType getAttachments();
    
    /**
     * True if has "attachments" element
     */
    boolean isSetAttachments();
    
    /**
     * Sets the "attachments" element
     */
    void setAttachments(au.gov.asic.types.header.document.business.AttachmentsType attachments);
    
    /**
     * Appends and returns a new empty "attachments" element
     */
    au.gov.asic.types.header.document.business.AttachmentsType addNewAttachments();
    
    /**
     * Unsets the "attachments" element
     */
    void unsetAttachments();
    
    /**
     * Gets the "receipt" element
     */
    au.gov.asic.types.fss.ReceiptType getReceipt();
    
    /**
     * True if has "receipt" element
     */
    boolean isSetReceipt();
    
    /**
     * Sets the "receipt" element
     */
    void setReceipt(au.gov.asic.types.fss.ReceiptType receipt);
    
    /**
     * Appends and returns a new empty "receipt" element
     */
    au.gov.asic.types.fss.ReceiptType addNewReceipt();
    
    /**
     * Unsets the "receipt" element
     */
    void unsetReceipt();
    
    /**
     * Gets the "asicTransactionNumber" element
     */
    java.lang.String getAsicTransactionNumber();
    
    /**
     * Gets (as xml) the "asicTransactionNumber" element
     */
    org.apache.xmlbeans.XmlString xgetAsicTransactionNumber();
    
    /**
     * True if has "asicTransactionNumber" element
     */
    boolean isSetAsicTransactionNumber();
    
    /**
     * Sets the "asicTransactionNumber" element
     */
    void setAsicTransactionNumber(java.lang.String asicTransactionNumber);
    
    /**
     * Sets (as xml) the "asicTransactionNumber" element
     */
    void xsetAsicTransactionNumber(org.apache.xmlbeans.XmlString asicTransactionNumber);
    
    /**
     * Unsets the "asicTransactionNumber" element
     */
    void unsetAsicTransactionNumber();
    
    /**
     * Gets the "transactionReferenceNumber" element
     */
    java.lang.String getTransactionReferenceNumber();
    
    /**
     * Gets (as xml) the "transactionReferenceNumber" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber xgetTransactionReferenceNumber();
    
    /**
     * True if has "transactionReferenceNumber" element
     */
    boolean isSetTransactionReferenceNumber();
    
    /**
     * Sets the "transactionReferenceNumber" element
     */
    void setTransactionReferenceNumber(java.lang.String transactionReferenceNumber);
    
    /**
     * Sets (as xml) the "transactionReferenceNumber" element
     */
    void xsetTransactionReferenceNumber(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber transactionReferenceNumber);
    
    /**
     * Unsets the "transactionReferenceNumber" element
     */
    void unsetTransactionReferenceNumber();
    
    /**
     * Gets the "processMode" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode.Enum getProcessMode();
    
    /**
     * Gets (as xml) the "processMode" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode xgetProcessMode();
    
    /**
     * True if has "processMode" element
     */
    boolean isSetProcessMode();
    
    /**
     * Sets the "processMode" element
     */
    void setProcessMode(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode.Enum processMode);
    
    /**
     * Sets (as xml) the "processMode" element
     */
    void xsetProcessMode(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode processMode);
    
    /**
     * Unsets the "processMode" element
     */
    void unsetProcessMode();
    
    /**
     * An XML messageType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$MessageType.
     */
    public interface MessageType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetype7535elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML messageReferenceNumber(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$MessageReferenceNumber.
     */
    public interface MessageReferenceNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageReferenceNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagereferencenumberfcf1elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.MessageReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML senderId(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$SenderId.
     */
    public interface SenderId extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SenderId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("senderidc134elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML senderType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$SenderType.
     */
    public interface SenderType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SenderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("sendertypebd93elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.SenderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML transactionReferenceNumber(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$TransactionReferenceNumber.
     */
    public interface TransactionReferenceNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionReferenceNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("transactionreferencenumber47baelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.TransactionReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML processMode(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$ProcessMode.
     */
    public interface ProcessMode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("processmode1086elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum VALIDATE = Enum.forString("VALIDATE");
        static final Enum PROCESS = Enum.forString("PROCESS");
        static final Enum PEND = Enum.forString("PEND");
        
        static final int INT_VALIDATE = Enum.INT_VALIDATE;
        static final int INT_PROCESS = Enum.INT_PROCESS;
        static final int INT_PEND = Enum.INT_PEND;
        
        /**
         * Enumeration value class for au.gov.asic.types.header.document.business.BusinessDocumentHeaderType$ProcessMode.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_VALIDATE
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
            
            static final int INT_VALIDATE = 1;
            static final int INT_PROCESS = 2;
            static final int INT_PEND = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("VALIDATE", INT_VALIDATE),
                    new Enum("PROCESS", INT_PROCESS),
                    new Enum("PEND", INT_PEND),
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
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType.ProcessMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType newInstance() {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.BusinessDocumentHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
