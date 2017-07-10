/*
 * An XML document type.
 * Localname: request
 * Namespace: uri:v2.external.query.name.availability.asic.gov.au
 * Java type: au.gov.asic.availability.name.query.external.v2.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.availability.name.query.external.v2.impl;
/**
 * A document containing one request(@uri:v2.external.query.name.availability.asic.gov.au) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.availability.name.query.external.v2.RequestDocument
{
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("uri:v2.external.query.name.availability.asic.gov.au", "request");
    
    
    /**
     * Gets the "request" element
     */
    public au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType target = null;
            target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType target = null;
            target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType target = null;
            target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
}
