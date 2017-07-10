/*
 * An XML document type.
 * Localname: Expires
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd
 * Java type: org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.ExpiresDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.impl;
/**
 * A document containing one Expires(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class ExpiresDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.ExpiresDocument
{
    
    public ExpiresDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPIRES$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Expires");
    
    
    /**
     * Gets the "Expires" element
     */
    public org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime getExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().find_element_user(EXPIRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Expires" element
     */
    public void setExpires(org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime expires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().find_element_user(EXPIRES$0, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().add_element_user(EXPIRES$0);
            }
            target.set(expires);
        }
    }
    
    /**
     * Appends and returns a new empty "Expires" element
     */
    public org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime addNewExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().add_element_user(EXPIRES$0);
            return target;
        }
    }
}
