/*
 * An XML document type.
 * Localname: businessDocumentRequestHeader
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * A document containing one businessDocumentRequestHeader(@uri:business.document.header.types.asic.gov.au) element.
 *
 * This is a complex type.
 */
public class BusinessDocumentRequestHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderDocument
{
    
    public BusinessDocumentRequestHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTREQUESTHEADER$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "businessDocumentRequestHeader");
    
    
    /**
     * Gets the "businessDocumentRequestHeader" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType getBusinessDocumentRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType)get_store().find_element_user(BUSINESSDOCUMENTREQUESTHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessDocumentRequestHeader" element
     */
    public void setBusinessDocumentRequestHeader(au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType businessDocumentRequestHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType)get_store().find_element_user(BUSINESSDOCUMENTREQUESTHEADER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType)get_store().add_element_user(BUSINESSDOCUMENTREQUESTHEADER$0);
            }
            target.set(businessDocumentRequestHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "businessDocumentRequestHeader" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType addNewBusinessDocumentRequestHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentRequestHeaderType)get_store().add_element_user(BUSINESSDOCUMENTREQUESTHEADER$0);
            return target;
        }
    }
}
