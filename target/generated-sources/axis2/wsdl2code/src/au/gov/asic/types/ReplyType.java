/*
 * XML Type:  replyType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.ReplyType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types;


/**
 * An XML replyType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface ReplyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReplyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("replytypefeeetype");
    
    /**
     * Gets the "messageHeader" element
     */
    au.gov.asic.types.StandardMessageHeaderType getMessageHeader();
    
    /**
     * Sets the "messageHeader" element
     */
    void setMessageHeader(au.gov.asic.types.StandardMessageHeaderType messageHeader);
    
    /**
     * Appends and returns a new empty "messageHeader" element
     */
    au.gov.asic.types.StandardMessageHeaderType addNewMessageHeader();
    
    /**
     * Gets the "messageIdentifier" element
     */
    au.gov.asic.types.MessageIdentifierType getMessageIdentifier();
    
    /**
     * True if has "messageIdentifier" element
     */
    boolean isSetMessageIdentifier();
    
    /**
     * Sets the "messageIdentifier" element
     */
    void setMessageIdentifier(au.gov.asic.types.MessageIdentifierType messageIdentifier);
    
    /**
     * Appends and returns a new empty "messageIdentifier" element
     */
    au.gov.asic.types.MessageIdentifierType addNewMessageIdentifier();
    
    /**
     * Unsets the "messageIdentifier" element
     */
    void unsetMessageIdentifier();
    
    /**
     * Gets the "result" element
     */
    au.gov.asic.types.ReplyType.Result getResult();
    
    /**
     * Sets the "result" element
     */
    void setResult(au.gov.asic.types.ReplyType.Result result);
    
    /**
     * Appends and returns a new empty "result" element
     */
    au.gov.asic.types.ReplyType.Result addNewResult();
    
    /**
     * Gets the "exceptionList" element
     */
    au.gov.asic.types.ExceptionListType getExceptionList();
    
    /**
     * True if has "exceptionList" element
     */
    boolean isSetExceptionList();
    
    /**
     * Sets the "exceptionList" element
     */
    void setExceptionList(au.gov.asic.types.ExceptionListType exceptionList);
    
    /**
     * Appends and returns a new empty "exceptionList" element
     */
    au.gov.asic.types.ExceptionListType addNewExceptionList();
    
    /**
     * Unsets the "exceptionList" element
     */
    void unsetExceptionList();
    
    /**
     * Gets the "traceList" element
     */
    au.gov.asic.types.TraceListType getTraceList();
    
    /**
     * True if has "traceList" element
     */
    boolean isSetTraceList();
    
    /**
     * Sets the "traceList" element
     */
    void setTraceList(au.gov.asic.types.TraceListType traceList);
    
    /**
     * Appends and returns a new empty "traceList" element
     */
    au.gov.asic.types.TraceListType addNewTraceList();
    
    /**
     * Unsets the "traceList" element
     */
    void unsetTraceList();
    
    /**
     * Gets the "timestampList" element
     */
    au.gov.asic.types.TimestampListType getTimestampList();
    
    /**
     * True if has "timestampList" element
     */
    boolean isSetTimestampList();
    
    /**
     * Sets the "timestampList" element
     */
    void setTimestampList(au.gov.asic.types.TimestampListType timestampList);
    
    /**
     * Appends and returns a new empty "timestampList" element
     */
    au.gov.asic.types.TimestampListType addNewTimestampList();
    
    /**
     * Unsets the "timestampList" element
     */
    void unsetTimestampList();
    
    /**
     * An XML result(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Result extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("result0f67elemtype");
        
        /**
         * Gets the "requestFulfilled" element
         */
        boolean getRequestFulfilled();
        
        /**
         * Gets (as xml) the "requestFulfilled" element
         */
        au.gov.asic.types.TrueType xgetRequestFulfilled();
        
        /**
         * True if has "requestFulfilled" element
         */
        boolean isSetRequestFulfilled();
        
        /**
         * Sets the "requestFulfilled" element
         */
        void setRequestFulfilled(boolean requestFulfilled);
        
        /**
         * Sets (as xml) the "requestFulfilled" element
         */
        void xsetRequestFulfilled(au.gov.asic.types.TrueType requestFulfilled);
        
        /**
         * Unsets the "requestFulfilled" element
         */
        void unsetRequestFulfilled();
        
        /**
         * Gets the "requestRejected" element
         */
        boolean getRequestRejected();
        
        /**
         * Gets (as xml) the "requestRejected" element
         */
        au.gov.asic.types.TrueType xgetRequestRejected();
        
        /**
         * True if has "requestRejected" element
         */
        boolean isSetRequestRejected();
        
        /**
         * Sets the "requestRejected" element
         */
        void setRequestRejected(boolean requestRejected);
        
        /**
         * Sets (as xml) the "requestRejected" element
         */
        void xsetRequestRejected(au.gov.asic.types.TrueType requestRejected);
        
        /**
         * Unsets the "requestRejected" element
         */
        void unsetRequestRejected();
        
        /**
         * Gets the "requestDelayed" element
         */
        boolean getRequestDelayed();
        
        /**
         * Gets (as xml) the "requestDelayed" element
         */
        au.gov.asic.types.TrueType xgetRequestDelayed();
        
        /**
         * True if has "requestDelayed" element
         */
        boolean isSetRequestDelayed();
        
        /**
         * Sets the "requestDelayed" element
         */
        void setRequestDelayed(boolean requestDelayed);
        
        /**
         * Sets (as xml) the "requestDelayed" element
         */
        void xsetRequestDelayed(au.gov.asic.types.TrueType requestDelayed);
        
        /**
         * Unsets the "requestDelayed" element
         */
        void unsetRequestDelayed();
        
        /**
         * Gets the "requestFailed" element
         */
        boolean getRequestFailed();
        
        /**
         * Gets (as xml) the "requestFailed" element
         */
        au.gov.asic.types.TrueType xgetRequestFailed();
        
        /**
         * True if has "requestFailed" element
         */
        boolean isSetRequestFailed();
        
        /**
         * Sets the "requestFailed" element
         */
        void setRequestFailed(boolean requestFailed);
        
        /**
         * Sets (as xml) the "requestFailed" element
         */
        void xsetRequestFailed(au.gov.asic.types.TrueType requestFailed);
        
        /**
         * Unsets the "requestFailed" element
         */
        void unsetRequestFailed();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.ReplyType.Result newInstance() {
              return (au.gov.asic.types.ReplyType.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.ReplyType.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.ReplyType.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.ReplyType newInstance() {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.ReplyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.ReplyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.ReplyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.ReplyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.ReplyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.ReplyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.ReplyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.ReplyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.ReplyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ReplyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.ReplyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
