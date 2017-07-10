/*
 * XML Type:  queryNameAvailabilityRequestType
 * Namespace: uri:v2.external.query.name.availability.asic.gov.au
 * Java type: au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.availability.name.query.external.v2.impl;
/**
 * An XML queryNameAvailabilityRequestType(@uri:v2.external.query.name.availability.asic.gov.au).
 *
 * This is a complex type.
 */
public class QueryNameAvailabilityRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.availability.name.query.external.v2.QueryNameAvailabilityRequestType
{
    
    public QueryNameAvailabilityRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTHEADER$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "businessDocumentHeader");
    private static final javax.xml.namespace.QName BUSINESSDOCUMENTBODY$2 = 
        new javax.xml.namespace.QName("uri:v2.external.query.name.availability.asic.gov.au", "businessDocumentBody");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
    
    
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
    public au.gov.asic.types.nni.QueryNniNameType getBusinessDocumentBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.QueryNniNameType target = null;
            target = (au.gov.asic.types.nni.QueryNniNameType)get_store().find_element_user(BUSINESSDOCUMENTBODY$2, 0);
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
    public void setBusinessDocumentBody(au.gov.asic.types.nni.QueryNniNameType businessDocumentBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.QueryNniNameType target = null;
            target = (au.gov.asic.types.nni.QueryNniNameType)get_store().find_element_user(BUSINESSDOCUMENTBODY$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.QueryNniNameType)get_store().add_element_user(BUSINESSDOCUMENTBODY$2);
            }
            target.set(businessDocumentBody);
        }
    }
    
    /**
     * Appends and returns a new empty "businessDocumentBody" element
     */
    public au.gov.asic.types.nni.QueryNniNameType addNewBusinessDocumentBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.QueryNniNameType target = null;
            target = (au.gov.asic.types.nni.QueryNniNameType)get_store().add_element_user(BUSINESSDOCUMENTBODY$2);
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
    
    /**
     * Gets the "Id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "Id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "Id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "Id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
}
