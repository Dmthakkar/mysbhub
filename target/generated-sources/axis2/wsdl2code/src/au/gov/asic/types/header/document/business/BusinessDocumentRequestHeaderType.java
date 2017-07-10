/*
 * XML Type:  businessDocumentRequestHeaderType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business;


/**
 * An XML businessDocumentRequestHeaderType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface BusinessDocumentRequestHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessDocumentRequestHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("businessdocumentrequestheadertype2721type");
    
    /**
     * Gets the "messageType" element
     */
    java.lang.String getMessageType();
    
    /**
     * Gets (as xml) the "messageType" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType xgetMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(java.lang.String messageType);
    
    /**
     * Sets (as xml) the "messageType" element
     */
    void xsetMessageType(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType messageType);
    
    /**
     * Gets the "messageReferenceNumber" element
     */
    java.lang.String getMessageReferenceNumber();
    
    /**
     * Gets (as xml) the "messageReferenceNumber" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber xgetMessageReferenceNumber();
    
    /**
     * Sets the "messageReferenceNumber" element
     */
    void setMessageReferenceNumber(java.lang.String messageReferenceNumber);
    
    /**
     * Sets (as xml) the "messageReferenceNumber" element
     */
    void xsetMessageReferenceNumber(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber messageReferenceNumber);
    
    /**
     * Gets the "asicReferenceNumber" element
     */
    long getAsicReferenceNumber();
    
    /**
     * Gets (as xml) the "asicReferenceNumber" element
     */
    au.gov.asic.types.ReferenceNoType xgetAsicReferenceNumber();
    
    /**
     * True if has "asicReferenceNumber" element
     */
    boolean isSetAsicReferenceNumber();
    
    /**
     * Sets the "asicReferenceNumber" element
     */
    void setAsicReferenceNumber(long asicReferenceNumber);
    
    /**
     * Sets (as xml) the "asicReferenceNumber" element
     */
    void xsetAsicReferenceNumber(au.gov.asic.types.ReferenceNoType asicReferenceNumber);
    
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
    au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId xgetSenderId();
    
    /**
     * Sets the "senderId" element
     */
    void setSenderId(java.lang.String senderId);
    
    /**
     * Sets (as xml) the "senderId" element
     */
    void xsetSenderId(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId senderId);
    
    /**
     * Gets the "senderType" element
     */
    java.lang.String getSenderType();
    
    /**
     * Gets (as xml) the "senderType" element
     */
    au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType xgetSenderType();
    
    /**
     * Sets the "senderType" element
     */
    void setSenderType(java.lang.String senderType);
    
    /**
     * Sets (as xml) the "senderType" element
     */
    void xsetSenderType(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType senderType);
    
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
     * An XML messageType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$MessageType.
     */
    public interface MessageType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagetypeb9b4elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML messageReferenceNumber(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$MessageReferenceNumber.
     */
    public interface MessageReferenceNumber extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageReferenceNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("messagereferencenumber4678elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.MessageReferenceNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML senderId(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$SenderId.
     */
    public interface SenderId extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SenderId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("senderidc0d5elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML senderType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType$SenderType.
     */
    public interface SenderType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SenderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("sendertypeeb96elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType newValue(java.lang.Object obj) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType) type.newValue( obj ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType newInstance() {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType.SenderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType newInstance() {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
