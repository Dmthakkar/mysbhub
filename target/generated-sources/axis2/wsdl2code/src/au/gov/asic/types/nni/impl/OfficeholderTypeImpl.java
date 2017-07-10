/*
 * XML Type:  officeholderType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.OfficeholderType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML officeholderType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OfficeholderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.OfficeholderType
{
    
    public OfficeholderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATION$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "organisation");
    private static final javax.xml.namespace.QName INDIVIDUAL$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "individual");
    private static final javax.xml.namespace.QName ROLE$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "role");
    
    
    /**
     * Gets the "organisation" element
     */
    public au.gov.asic.types.bn.OrganisationType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationType target = null;
            target = (au.gov.asic.types.bn.OrganisationType)get_store().find_element_user(ORGANISATION$0, 0);
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
            return get_store().count_elements(ORGANISATION$0) != 0;
        }
    }
    
    /**
     * Sets the "organisation" element
     */
    public void setOrganisation(au.gov.asic.types.bn.OrganisationType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationType target = null;
            target = (au.gov.asic.types.bn.OrganisationType)get_store().find_element_user(ORGANISATION$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OrganisationType)get_store().add_element_user(ORGANISATION$0);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "organisation" element
     */
    public au.gov.asic.types.bn.OrganisationType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationType target = null;
            target = (au.gov.asic.types.bn.OrganisationType)get_store().add_element_user(ORGANISATION$0);
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
            get_store().remove_element(ORGANISATION$0, 0);
        }
    }
    
    /**
     * Gets the "individual" element
     */
    public au.gov.asic.types.bn.IndividualType getIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(INDIVIDUAL$2, 0);
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
            return get_store().count_elements(INDIVIDUAL$2) != 0;
        }
    }
    
    /**
     * Sets the "individual" element
     */
    public void setIndividual(au.gov.asic.types.bn.IndividualType individual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(INDIVIDUAL$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(INDIVIDUAL$2);
            }
            target.set(individual);
        }
    }
    
    /**
     * Appends and returns a new empty "individual" element
     */
    public au.gov.asic.types.bn.IndividualType addNewIndividual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.IndividualType target = null;
            target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(INDIVIDUAL$2);
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
            get_store().remove_element(INDIVIDUAL$2, 0);
        }
    }
    
    /**
     * Gets the "role" element
     */
    public au.gov.asic.types.nni.OfficeholderRole.Enum getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.nni.OfficeholderRole.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" element
     */
    public au.gov.asic.types.nni.OfficeholderRole xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.OfficeholderRole target = null;
            target = (au.gov.asic.types.nni.OfficeholderRole)get_store().find_element_user(ROLE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(au.gov.asic.types.nni.OfficeholderRole.Enum role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$4);
            }
            target.setEnumValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" element
     */
    public void xsetRole(au.gov.asic.types.nni.OfficeholderRole role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.OfficeholderRole target = null;
            target = (au.gov.asic.types.nni.OfficeholderRole)get_store().find_element_user(ROLE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.OfficeholderRole)get_store().add_element_user(ROLE$4);
            }
            target.set(role);
        }
    }
}
