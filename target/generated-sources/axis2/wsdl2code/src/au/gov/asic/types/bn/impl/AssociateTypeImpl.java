/*
 * XML Type:  associateType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.AssociateType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML associateType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AssociateTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.AssociateType
{
    
    public AssociateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABRENTITY$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "abrEntity");
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
    private static final javax.xml.namespace.QName PARTNERASSOCIATE$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "partnerAssociate");
    
    
    /**
     * Gets the "abrEntity" element
     */
    public au.gov.asic.types.abn.AbrEntityType getAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().find_element_user(ABRENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abrEntity" element
     */
    public boolean isSetAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABRENTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "abrEntity" element
     */
    public void setAbrEntity(au.gov.asic.types.abn.AbrEntityType abrEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().find_element_user(ABRENTITY$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbrEntityType)get_store().add_element_user(ABRENTITY$0);
            }
            target.set(abrEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "abrEntity" element
     */
    public au.gov.asic.types.abn.AbrEntityType addNewAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().add_element_user(ABRENTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "abrEntity" element
     */
    public void unsetAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABRENTITY$0, 0);
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
    
    /**
     * Gets array of all "partnerAssociate" elements
     */
    public au.gov.asic.types.bn.PartnerAssociateType[] getPartnerAssociateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTNERASSOCIATE$12, targetList);
            au.gov.asic.types.bn.PartnerAssociateType[] result = new au.gov.asic.types.bn.PartnerAssociateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "partnerAssociate" element
     */
    public au.gov.asic.types.bn.PartnerAssociateType getPartnerAssociateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PartnerAssociateType target = null;
            target = (au.gov.asic.types.bn.PartnerAssociateType)get_store().find_element_user(PARTNERASSOCIATE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "partnerAssociate" element
     */
    public int sizeOfPartnerAssociateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERASSOCIATE$12);
        }
    }
    
    /**
     * Sets array of all "partnerAssociate" element
     */
    public void setPartnerAssociateArray(au.gov.asic.types.bn.PartnerAssociateType[] partnerAssociateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partnerAssociateArray, PARTNERASSOCIATE$12);
        }
    }
    
    /**
     * Sets ith "partnerAssociate" element
     */
    public void setPartnerAssociateArray(int i, au.gov.asic.types.bn.PartnerAssociateType partnerAssociate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PartnerAssociateType target = null;
            target = (au.gov.asic.types.bn.PartnerAssociateType)get_store().find_element_user(PARTNERASSOCIATE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(partnerAssociate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "partnerAssociate" element
     */
    public au.gov.asic.types.bn.PartnerAssociateType insertNewPartnerAssociate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PartnerAssociateType target = null;
            target = (au.gov.asic.types.bn.PartnerAssociateType)get_store().insert_element_user(PARTNERASSOCIATE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "partnerAssociate" element
     */
    public au.gov.asic.types.bn.PartnerAssociateType addNewPartnerAssociate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PartnerAssociateType target = null;
            target = (au.gov.asic.types.bn.PartnerAssociateType)get_store().add_element_user(PARTNERASSOCIATE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "partnerAssociate" element
     */
    public void removePartnerAssociate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERASSOCIATE$12, i);
        }
    }
}
