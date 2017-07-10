/*
 * XML Type:  individualType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.IndividualType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn;


/**
 * An XML individualType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface IndividualType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndividualType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("individualtypedad1type");
    
    /**
     * Gets the "name" element
     */
    au.gov.asic.types.PersonNameType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(au.gov.asic.types.PersonNameType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    au.gov.asic.types.PersonNameType addNewName();
    
    /**
     * Gets the "previousName" element
     */
    au.gov.asic.types.PersonNameType getPreviousName();
    
    /**
     * True if has "previousName" element
     */
    boolean isSetPreviousName();
    
    /**
     * Sets the "previousName" element
     */
    void setPreviousName(au.gov.asic.types.PersonNameType previousName);
    
    /**
     * Appends and returns a new empty "previousName" element
     */
    au.gov.asic.types.PersonNameType addNewPreviousName();
    
    /**
     * Unsets the "previousName" element
     */
    void unsetPreviousName();
    
    /**
     * Gets the "birthDetails" element
     */
    au.gov.asic.types.BirthDetailsType getBirthDetails();
    
    /**
     * True if has "birthDetails" element
     */
    boolean isSetBirthDetails();
    
    /**
     * Sets the "birthDetails" element
     */
    void setBirthDetails(au.gov.asic.types.BirthDetailsType birthDetails);
    
    /**
     * Appends and returns a new empty "birthDetails" element
     */
    au.gov.asic.types.BirthDetailsType addNewBirthDetails();
    
    /**
     * Unsets the "birthDetails" element
     */
    void unsetBirthDetails();
    
    /**
     * Gets the "address" element
     */
    au.gov.asic.types.AddressExtType getAddress();
    
    /**
     * True if has "address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(au.gov.asic.types.AddressExtType address);
    
    /**
     * Appends and returns a new empty "address" element
     */
    au.gov.asic.types.AddressExtType addNewAddress();
    
    /**
     * Unsets the "address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "emailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    au.gov.asic.types.EmailType xgetEmailAddress();
    
    /**
     * Tests for nil "emailAddress" element
     */
    boolean isNilEmailAddress();
    
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
     * Nils the "emailAddress" element
     */
    void setNilEmailAddress();
    
    /**
     * Unsets the "emailAddress" element
     */
    void unsetEmailAddress();
    
    /**
     * Gets the "changeOfIndividual" element
     */
    boolean getChangeOfIndividual();
    
    /**
     * Gets (as xml) the "changeOfIndividual" element
     */
    org.apache.xmlbeans.XmlBoolean xgetChangeOfIndividual();
    
    /**
     * True if has "changeOfIndividual" element
     */
    boolean isSetChangeOfIndividual();
    
    /**
     * Sets the "changeOfIndividual" element
     */
    void setChangeOfIndividual(boolean changeOfIndividual);
    
    /**
     * Sets (as xml) the "changeOfIndividual" element
     */
    void xsetChangeOfIndividual(org.apache.xmlbeans.XmlBoolean changeOfIndividual);
    
    /**
     * Unsets the "changeOfIndividual" element
     */
    void unsetChangeOfIndividual();
    
    /**
     * Gets the "startDate" element
     */
    java.util.Calendar getStartDate();
    
    /**
     * Gets (as xml) the "startDate" element
     */
    org.apache.xmlbeans.XmlDate xgetStartDate();
    
    /**
     * True if has "startDate" element
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "startDate" element
     */
    void setStartDate(java.util.Calendar startDate);
    
    /**
     * Sets (as xml) the "startDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
    
    /**
     * Unsets the "startDate" element
     */
    void unsetStartDate();
    
    /**
     * Gets the "endDate" element
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "endDate" element
     */
    org.apache.xmlbeans.XmlDate xgetEndDate();
    
    /**
     * True if has "endDate" element
     */
    boolean isSetEndDate();
    
    /**
     * Sets the "endDate" element
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "endDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
    
    /**
     * Unsets the "endDate" element
     */
    void unsetEndDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.bn.IndividualType newInstance() {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.bn.IndividualType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.bn.IndividualType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.bn.IndividualType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.IndividualType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.bn.IndividualType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.bn.IndividualType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
