/*
 * An XML document type.
 * Localname: reply
 * Namespace: uri:v2.external.query.name.availability.asic.gov.au
 * Java type: au.gov.asic.availability.name.query.external.v2.ReplyDocument
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.availability.name.query.external.v2.impl;
/**
 * A document containing one reply(@uri:v2.external.query.name.availability.asic.gov.au) element.
 *
 * This is a complex type.
 */
public class ReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.availability.name.query.external.v2.ReplyDocument
{
    
    public ReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLY$0 = 
        new javax.xml.namespace.QName("uri:v2.external.query.name.availability.asic.gov.au", "reply");
    
    
    /**
     * Gets the "reply" element
     */
    public au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType getReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType target = null;
            target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType)get_store().find_element_user(REPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reply" element
     */
    public void setReply(au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType reply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType target = null;
            target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType)get_store().find_element_user(REPLY$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType)get_store().add_element_user(REPLY$0);
            }
            target.set(reply);
        }
    }
    
    /**
     * Appends and returns a new empty "reply" element
     */
    public au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType addNewReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType target = null;
            target = (au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityReplyType)get_store().add_element_user(REPLY$0);
            return target;
        }
    }
}
