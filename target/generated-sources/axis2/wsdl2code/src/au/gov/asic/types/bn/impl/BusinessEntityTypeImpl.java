/*
 * XML Type:  businessEntityType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BusinessEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML businessEntityType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BusinessEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BusinessEntityType
{
    
    public BusinessEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABRENTITY$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "abrEntity");
    private static final javax.xml.namespace.QName ABNEXEMPTION$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "abnExemption");
    private static final javax.xml.namespace.QName INDIVIDUAL$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "individual");
    private static final javax.xml.namespace.QName ORGANISATION$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "organisation");
    private static final javax.xml.namespace.QName OWNERTYPE$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "ownerType");
    private static final javax.xml.namespace.QName ASSOCIATE$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "associate");
    private static final javax.xml.namespace.QName DATEREVIEW$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateReview");
    
    
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
     * Gets the "abnExemption" element
     */
    public boolean getAbnExemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNEXEMPTION$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "abnExemption" element
     */
    public au.gov.asic.types.TrueType xgetAbnExemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(ABNEXEMPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "abnExemption" element
     */
    public boolean isSetAbnExemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABNEXEMPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "abnExemption" element
     */
    public void setAbnExemption(boolean abnExemption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNEXEMPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABNEXEMPTION$2);
            }
            target.setBooleanValue(abnExemption);
        }
    }
    
    /**
     * Sets (as xml) the "abnExemption" element
     */
    public void xsetAbnExemption(au.gov.asic.types.TrueType abnExemption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(ABNEXEMPTION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(ABNEXEMPTION$2);
            }
            target.set(abnExemption);
        }
    }
    
    /**
     * Unsets the "abnExemption" element
     */
    public void unsetAbnExemption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABNEXEMPTION$2, 0);
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
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(INDIVIDUAL$4, 0);
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
            return get_store().count_elements(INDIVIDUAL$4) != 0;
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
            target = (au.gov.asic.types.bn.IndividualType)get_store().find_element_user(INDIVIDUAL$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(INDIVIDUAL$4);
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
            target = (au.gov.asic.types.bn.IndividualType)get_store().add_element_user(INDIVIDUAL$4);
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
            get_store().remove_element(INDIVIDUAL$4, 0);
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
            target = (au.gov.asic.types.bn.OrganisationType)get_store().find_element_user(ORGANISATION$6, 0);
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
            return get_store().count_elements(ORGANISATION$6) != 0;
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
            target = (au.gov.asic.types.bn.OrganisationType)get_store().find_element_user(ORGANISATION$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OrganisationType)get_store().add_element_user(ORGANISATION$6);
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
            target = (au.gov.asic.types.bn.OrganisationType)get_store().add_element_user(ORGANISATION$6);
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
            get_store().remove_element(ORGANISATION$6, 0);
        }
    }
    
    /**
     * Gets the "ownerType" element
     */
    public au.gov.asic.types.bn.BusinessEntityType.OwnerType.Enum getOwnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.BusinessEntityType.OwnerType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownerType" element
     */
    public au.gov.asic.types.bn.BusinessEntityType.OwnerType xgetOwnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType.OwnerType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType.OwnerType)get_store().find_element_user(OWNERTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ownerType" element
     */
    public boolean isSetOwnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "ownerType" element
     */
    public void setOwnerType(au.gov.asic.types.bn.BusinessEntityType.OwnerType.Enum ownerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERTYPE$8);
            }
            target.setEnumValue(ownerType);
        }
    }
    
    /**
     * Sets (as xml) the "ownerType" element
     */
    public void xsetOwnerType(au.gov.asic.types.bn.BusinessEntityType.OwnerType ownerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BusinessEntityType.OwnerType target = null;
            target = (au.gov.asic.types.bn.BusinessEntityType.OwnerType)get_store().find_element_user(OWNERTYPE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BusinessEntityType.OwnerType)get_store().add_element_user(OWNERTYPE$8);
            }
            target.set(ownerType);
        }
    }
    
    /**
     * Unsets the "ownerType" element
     */
    public void unsetOwnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERTYPE$8, 0);
        }
    }
    
    /**
     * Gets array of all "associate" elements
     */
    public au.gov.asic.types.bn.AssociateType[] getAssociateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ASSOCIATE$10, targetList);
            au.gov.asic.types.bn.AssociateType[] result = new au.gov.asic.types.bn.AssociateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "associate" element
     */
    public au.gov.asic.types.bn.AssociateType getAssociateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.AssociateType target = null;
            target = (au.gov.asic.types.bn.AssociateType)get_store().find_element_user(ASSOCIATE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "associate" element
     */
    public int sizeOfAssociateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSOCIATE$10);
        }
    }
    
    /**
     * Sets array of all "associate" element
     */
    public void setAssociateArray(au.gov.asic.types.bn.AssociateType[] associateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(associateArray, ASSOCIATE$10);
        }
    }
    
    /**
     * Sets ith "associate" element
     */
    public void setAssociateArray(int i, au.gov.asic.types.bn.AssociateType associate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.AssociateType target = null;
            target = (au.gov.asic.types.bn.AssociateType)get_store().find_element_user(ASSOCIATE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(associate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "associate" element
     */
    public au.gov.asic.types.bn.AssociateType insertNewAssociate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.AssociateType target = null;
            target = (au.gov.asic.types.bn.AssociateType)get_store().insert_element_user(ASSOCIATE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "associate" element
     */
    public au.gov.asic.types.bn.AssociateType addNewAssociate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.AssociateType target = null;
            target = (au.gov.asic.types.bn.AssociateType)get_store().add_element_user(ASSOCIATE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "associate" element
     */
    public void removeAssociate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSOCIATE$10, i);
        }
    }
    
    /**
     * Gets the "dateReview" element
     */
    public java.util.Calendar getDateReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREVIEW$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateReview" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREVIEW$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateReview" element
     */
    public boolean isSetDateReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEREVIEW$12) != 0;
        }
    }
    
    /**
     * Sets the "dateReview" element
     */
    public void setDateReview(java.util.Calendar dateReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREVIEW$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREVIEW$12);
            }
            target.setCalendarValue(dateReview);
        }
    }
    
    /**
     * Sets (as xml) the "dateReview" element
     */
    public void xsetDateReview(org.apache.xmlbeans.XmlDate dateReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREVIEW$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREVIEW$12);
            }
            target.set(dateReview);
        }
    }
    
    /**
     * Unsets the "dateReview" element
     */
    public void unsetDateReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEREVIEW$12, 0);
        }
    }
    /**
     * An XML ownerType(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BusinessEntityType$OwnerType.
     */
    public static class OwnerTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.bn.BusinessEntityType.OwnerType
    {
        
        public OwnerTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OwnerTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
