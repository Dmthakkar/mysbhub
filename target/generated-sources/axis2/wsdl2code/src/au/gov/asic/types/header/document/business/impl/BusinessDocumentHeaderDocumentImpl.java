/*
 * An XML document type.
 * Localname: businessDocumentHeader
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.BusinessDocumentHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * A document containing one businessDocumentHeader(@uri:business.document.header.types.asic.gov.au) element.
 *
 * This is a complex type.
 */
public class BusinessDocumentHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.BusinessDocumentHeaderDocument
{
    
    public BusinessDocumentHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTHEADER$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "businessDocumentHeader");
    
    
    /**
     * Gets the "businessDocumentHeader" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType getBusinessDocumentHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType)get_store().find_element_user(BUSINESSDOCUMENTHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessDocumentHeader" element
     */
    public void setBusinessDocumentHeader(au.gov.asic.types.header.document.business.BusinessDocumentHeaderType businessDocumentHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType)get_store().find_element_user(BUSINESSDOCUMENTHEADER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType)get_store().add_element_user(BUSINESSDOCUMENTHEADER$0);
            }
            target.set(businessDocumentHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "businessDocumentHeader" element
     */
    public au.gov.asic.types.header.document.business.BusinessDocumentHeaderType addNewBusinessDocumentHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.BusinessDocumentHeaderType target = null;
            target = (au.gov.asic.types.header.document.business.BusinessDocumentHeaderType)get_store().add_element_user(BUSINESSDOCUMENTHEADER$0);
            return target;
        }
    }
}
