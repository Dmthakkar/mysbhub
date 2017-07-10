/*
 * XML Type:  queryNameAvailabilityReplyType
 * Namespace: uri:v2.external.query.name.availability.asic.gov.au
 * Java type: au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.availability.name.query.external.v2.impl;
/**
 * An XML queryNameAvailabilityReplyType(@uri:v2.external.query.name.availability.asic.gov.au).
 *
 * This is a complex type.
 */
public class QueryNameAvailabilityReplyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType
{
    
    public QueryNameAvailabilityReplyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTHEADER$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "businessDocumentHeader");
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTBODY$2 = 
        new javax.xml.namespace.QName("uri:v2.external.query.name.availability.asic.gov.au", "businessDocumentBody");
    
    
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
    
    /**
     * Gets the "businessDocumentBody" element
     */
    public au.gov.asic.types.NameAvailabilityResponseType getBusinessDocumentBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType)get_store().find_element_user(BUSINESSDOCUMENTBODY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessDocumentBody" element
     */
    public boolean isSetBusinessDocumentBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSDOCUMENTBODY$2) != 0;
        }
    }
    
    /**
     * Sets the "businessDocumentBody" element
     */
    public void setBusinessDocumentBody(au.gov.asic.types.NameAvailabilityResponseType businessDocumentBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType)get_store().find_element_user(BUSINESSDOCUMENTBODY$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameAvailabilityResponseType)get_store().add_element_user(BUSINESSDOCUMENTBODY$2);
            }
            target.set(businessDocumentBody);
        }
    }
    
    /**
     * Appends and returns a new empty "businessDocumentBody" element
     */
    public au.gov.asic.types.NameAvailabilityResponseType addNewBusinessDocumentBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType)get_store().add_element_user(BUSINESSDOCUMENTBODY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "businessDocumentBody" element
     */
    public void unsetBusinessDocumentBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSDOCUMENTBODY$2, 0);
        }
    }
}
