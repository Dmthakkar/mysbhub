/*
 * An XML document type.
 * Localname: Created
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd
 * Java type: org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.impl;
/**
 * A document containing one Created(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class CreatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.CreatedDocument
{
    
    public CreatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATED$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Created");
    
    
    /**
     * Gets the "Created" element
     */
    public org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Created" element
     */
    public void setCreated(org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().add_element_user(CREATED$0);
            }
            target.set(created);
        }
    }
    
    /**
     * Appends and returns a new empty "Created" element
     */
    public org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime addNewCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.AttributedDateTime)get_store().add_element_user(CREATED$0);
            return target;
        }
    }
}
