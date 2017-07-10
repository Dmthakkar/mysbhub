/*
 * XML Type:  representativeType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.RepresentativeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML representativeType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RepresentativeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.RepresentativeType
{
    
    public RepresentativeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName INDIVIDUAL$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "individual");
    private static final javax.xml.namespace.QName ORGANISATION$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "organisation");
    private static final javax.xml.namespace.QName STARTDATE$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "endDate");
    private static final javax.xml.namespace.QName ACTION$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "action");
    
    
    /**
     * Gets the "type" element
     */
    public au.gov.asic.types.bn.RepresentativeTypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.RepresentativeTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public au.gov.asic.types.bn.RepresentativeTypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeTypeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeTypeType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(au.gov.asic.types.bn.RepresentativeTypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(au.gov.asic.types.bn.RepresentativeTypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeTypeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeTypeType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.RepresentativeTypeType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
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
     * Gets the "organisation" element
     */
    public au.gov.asic.types.bn.OrganisationType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OrganisationType target = null;
            target = (au.gov.asic.types.bn.OrganisationType)get_store().find_element_user(ORGANISATION$4, 0);
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
            return get_store().count_elements(ORGANISATION$4) != 0;
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
            target = (au.gov.asic.types.bn.OrganisationType)get_store().find_element_user(ORGANISATION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OrganisationType)get_store().add_element_user(ORGANISATION$4);
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
            target = (au.gov.asic.types.bn.OrganisationType)get_store().add_element_user(ORGANISATION$4);
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
            get_store().remove_element(ORGANISATION$4, 0);
        }
    }
    
    /**
     * Gets the "startDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "startDate" element
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "startDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$6);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" element
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$6);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Unsets the "startDate" element
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATE$6, 0);
        }
    }
    
    /**
     * Gets the "endDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "endDate" element
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "endDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$8);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "endDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$8);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Unsets the "endDate" element
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATE$8, 0);
        }
    }
    
    /**
     * Gets the "action" element
     */
    public au.gov.asic.types.bn.UpdateActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.UpdateActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" element
     */
    public au.gov.asic.types.bn.UpdateActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.UpdateActionType target = null;
            target = (au.gov.asic.types.bn.UpdateActionType)get_store().find_element_user(ACTION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "action" element
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTION$10) != 0;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(au.gov.asic.types.bn.UpdateActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$10);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" element
     */
    public void xsetAction(au.gov.asic.types.bn.UpdateActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.UpdateActionType target = null;
            target = (au.gov.asic.types.bn.UpdateActionType)get_store().find_element_user(ACTION$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.UpdateActionType)get_store().add_element_user(ACTION$10);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" element
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTION$10, 0);
        }
    }
}
