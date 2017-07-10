/*
 * XML Type:  simpleBnExtractType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.SimpleBnExtractType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML simpleBnExtractType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class SimpleBnExtractTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.SimpleBnExtractType
{
    
    public SimpleBnExtractTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESS$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "business");
    private static final javax.xml.namespace.QName BUSINESSNAME$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessName");
    
    
    /**
     * Gets the "business" element
     */
    public au.gov.asic.types.bn.BusinessEntityType getBusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType)get_store().find_element_user(BUSINESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "business" element
     */
    public void setBusiness(au.gov.asic.types.bn.BusinessEntityType business)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType)get_store().find_element_user(BUSINESS$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BusinessEntityType)get_store().add_element_user(BUSINESS$0);
            }
            target.set(business);
        }
    }
    
    /**
     * Appends and returns a new empty "business" element
     */
    public au.gov.asic.types.bn.BusinessEntityType addNewBusiness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType)get_store().add_element_user(BUSINESS$0);
            return target;
        }
    }
    
    /**
     * Gets the "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType getBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessName" element
     */
    public void setBusinessName(au.gov.asic.types.bn.OutboundBusinessNameType businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().find_element_user(BUSINESSNAME$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAME$2);
            }
            target.set(businessName);
        }
    }
    
    /**
     * Appends and returns a new empty "businessName" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType addNewBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType)get_store().add_element_user(BUSINESSNAME$2);
            return target;
        }
    }
}
