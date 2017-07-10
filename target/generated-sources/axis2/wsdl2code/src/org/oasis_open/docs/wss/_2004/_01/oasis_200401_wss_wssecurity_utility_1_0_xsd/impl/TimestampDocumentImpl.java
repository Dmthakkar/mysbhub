/*
 * An XML document type.
 * Localname: Timestamp
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd
 * Java type: org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.impl;
/**
 * A document containing one Timestamp(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class TimestampDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampDocument
{
    
    public TimestampDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESTAMP$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Timestamp");
    
    
    /**
     * Gets the "Timestamp" element
     */
    public org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Timestamp" element
     */
    public void setTimestamp(org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType)get_store().add_element_user(TIMESTAMP$0);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Appends and returns a new empty "Timestamp" element
     */
    public org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType addNewTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType target = null;
            target = (org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0_xsd.TimestampType)get_store().add_element_user(TIMESTAMP$0);
            return target;
        }
    }
}
