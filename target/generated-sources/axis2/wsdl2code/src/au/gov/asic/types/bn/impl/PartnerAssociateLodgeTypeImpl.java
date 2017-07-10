/*
 * XML Type:  partnerAssociateLodgeType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.PartnerAssociateLodgeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML partnerAssociateLodgeType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PartnerAssociateLodgeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.PartnerAssociateLodgeType
{
    
    public PartnerAssociateLodgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUAL$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "individual");
    private static final javax.xml.namespace.QName ORGANISATION$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "organisation");
    
    
    /**
     * Gets the "individual" element
     */
    public au.gov.asic.types.bn.IndividualLodgeType getIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualLodgeType target = null;
            target = (au.gov.asic.types.bn.IndividualLodgeType)get_store().find_element_user(INDIVIDUAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "individual" element
     */
    public boolean isSetIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIVIDUAL$0) != 0;
        }
    }
    
    /**
     * Sets the "individual" element
     */
    public void setIndividual(au.gov.asic.types.bn.IndividualLodgeType individual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualLodgeType target = null;
            target = (au.gov.asic.types.bn.IndividualLodgeType)get_store().find_element_user(INDIVIDUAL$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.IndividualLodgeType)get_store().add_element_user(INDIVIDUAL$0);
            }
            target.set(individual);
        }
    }
    
    /**
     * Appends and returns a new empty "individual" element
     */
    public au.gov.asic.types.bn.IndividualLodgeType addNewIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualLodgeType target = null;
            target = (au.gov.asic.types.bn.IndividualLodgeType)get_store().add_element_user(INDIVIDUAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "individual" element
     */
    public void unsetIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIVIDUAL$0, 0);
        }
    }
    
    /**
     * Gets the "organisation" element
     */
    public au.gov.asic.types.bn.OrganisationLodgeType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationLodgeType target = null;
            target = (au.gov.asic.types.bn.OrganisationLodgeType)get_store().find_element_user(ORGANISATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organisation" element
     */
    public boolean isSetOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATION$2) != 0;
        }
    }
    
    /**
     * Sets the "organisation" element
     */
    public void setOrganisation(au.gov.asic.types.bn.OrganisationLodgeType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationLodgeType target = null;
            target = (au.gov.asic.types.bn.OrganisationLodgeType)get_store().find_element_user(ORGANISATION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OrganisationLodgeType)get_store().add_element_user(ORGANISATION$2);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    public au.gov.asic.types.bn.OrganisationLodgeType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationLodgeType target = null;
            target = (au.gov.asic.types.bn.OrganisationLodgeType)get_store().add_element_user(ORGANISATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "organisation" element
     */
    public void unsetOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATION$2, 0);
        }
    }
}
