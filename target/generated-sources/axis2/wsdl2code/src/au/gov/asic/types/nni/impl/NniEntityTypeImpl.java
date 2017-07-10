/*
 * XML Type:  nniEntityType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.NniEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML nniEntityType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NniEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.NniEntityType
{
    
    public NniEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITY$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "businessEntity");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "identifier");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "status");
    private static final javax.xml.namespace.QName PREVIOUSSTATETERRITORY$10 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "previousStateTerritory");
    private static final javax.xml.namespace.QName DATEREGISTERED$12 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateRegistered");
    private static final javax.xml.namespace.QName DATEDEREGISTERED$14 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateDeregistered");
    private static final javax.xml.namespace.QName DATERENEWAL$16 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateRenewal");
    private static final javax.xml.namespace.QName DATEREVIEW$18 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateReview");
    private static final javax.xml.namespace.QName JURISDICTION$20 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "jurisdiction");
    private static final javax.xml.namespace.QName REGISTEREDADDRESS$22 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "registeredAddress");
    private static final javax.xml.namespace.QName RECENTDOCUMENTS$24 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "recentDocuments");
    
    
    /**
     * Gets the "businessEntity" element
     */
    public au.gov.asic.types.abn.AbrEntityType getBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().find_element_user(BUSINESSENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessEntity" element
     */
    public boolean isSetBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSENTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "businessEntity" element
     */
    public void setBusinessEntity(au.gov.asic.types.abn.AbrEntityType businessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().find_element_user(BUSINESSENTITY$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbrEntityType)get_store().add_element_user(BUSINESSENTITY$0);
            }
            target.set(businessEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "businessEntity" element
     */
    public au.gov.asic.types.abn.AbrEntityType addNewBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbrEntityType target = null;
            target = (au.gov.asic.types.abn.AbrEntityType)get_store().add_element_user(BUSINESSENTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "businessEntity" element
     */
    public void unsetBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSENTITY$0, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public au.gov.asic.types.nni.IdentifierType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.IdentifierType target = null;
            target = (au.gov.asic.types.nni.IdentifierType)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(au.gov.asic.types.nni.IdentifierType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.IdentifierType target = null;
            target = (au.gov.asic.types.nni.IdentifierType)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.IdentifierType)get_store().add_element_user(IDENTIFIER$2);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public au.gov.asic.types.nni.IdentifierType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.IdentifierType target = null;
            target = (au.gov.asic.types.nni.IdentifierType)get_store().add_element_user(IDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public au.gov.asic.types.NniNameType xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.NniNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNameType target = null;
            target = (au.gov.asic.types.NniNameType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNameType)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public au.gov.asic.types.nni.NniTypeType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniTypeType target = null;
            target = (au.gov.asic.types.nni.NniTypeType)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(au.gov.asic.types.nni.NniTypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniTypeType target = null;
            target = (au.gov.asic.types.nni.NniTypeType)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.NniTypeType)get_store().add_element_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public au.gov.asic.types.nni.NniTypeType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniTypeType target = null;
            target = (au.gov.asic.types.nni.NniTypeType)get_store().add_element_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Gets the "status" element
     */
    public au.gov.asic.types.StatusType getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType target = null;
            target = (au.gov.asic.types.StatusType)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(au.gov.asic.types.StatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType target = null;
            target = (au.gov.asic.types.StatusType)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StatusType)get_store().add_element_user(STATUS$8);
            }
            target.set(status);
        }
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public au.gov.asic.types.StatusType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StatusType target = null;
            target = (au.gov.asic.types.StatusType)get_store().add_element_user(STATUS$8);
            return target;
        }
    }
    
    /**
     * Gets the "previousStateTerritory" element
     */
    public au.gov.asic.types.bn.PreviousStateTerritoryType getPreviousStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATETERRITORY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "previousStateTerritory" element
     */
    public boolean isSetPreviousStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSSTATETERRITORY$10) != 0;
        }
    }
    
    /**
     * Sets the "previousStateTerritory" element
     */
    public void setPreviousStateTerritory(au.gov.asic.types.bn.PreviousStateTerritoryType previousStateTerritory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATETERRITORY$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATETERRITORY$10);
            }
            target.set(previousStateTerritory);
        }
    }
    
    /**
     * Appends and returns a new empty "previousStateTerritory" element
     */
    public au.gov.asic.types.bn.PreviousStateTerritoryType addNewPreviousStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATETERRITORY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "previousStateTerritory" element
     */
    public void unsetPreviousStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSSTATETERRITORY$10, 0);
        }
    }
    
    /**
     * Gets the "dateRegistered" element
     */
    public java.util.Calendar getDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateRegistered" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateRegistered" element
     */
    public boolean isSetDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEREGISTERED$12) != 0;
        }
    }
    
    /**
     * Sets the "dateRegistered" element
     */
    public void setDateRegistered(java.util.Calendar dateRegistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREGISTERED$12);
            }
            target.setCalendarValue(dateRegistered);
        }
    }
    
    /**
     * Sets (as xml) the "dateRegistered" element
     */
    public void xsetDateRegistered(org.apache.xmlbeans.XmlDate dateRegistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREGISTERED$12);
            }
            target.set(dateRegistered);
        }
    }
    
    /**
     * Unsets the "dateRegistered" element
     */
    public void unsetDateRegistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEREGISTERED$12, 0);
        }
    }
    
    /**
     * Gets the "dateDeregistered" element
     */
    public java.util.Calendar getDateDeregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDEREGISTERED$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateDeregistered" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateDeregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDEREGISTERED$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateDeregistered" element
     */
    public boolean isSetDateDeregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEDEREGISTERED$14) != 0;
        }
    }
    
    /**
     * Sets the "dateDeregistered" element
     */
    public void setDateDeregistered(java.util.Calendar dateDeregistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDEREGISTERED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEDEREGISTERED$14);
            }
            target.setCalendarValue(dateDeregistered);
        }
    }
    
    /**
     * Sets (as xml) the "dateDeregistered" element
     */
    public void xsetDateDeregistered(org.apache.xmlbeans.XmlDate dateDeregistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDEREGISTERED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEDEREGISTERED$14);
            }
            target.set(dateDeregistered);
        }
    }
    
    /**
     * Unsets the "dateDeregistered" element
     */
    public void unsetDateDeregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEDEREGISTERED$14, 0);
        }
    }
    
    /**
     * Gets the "dateRenewal" element
     */
    public java.util.Calendar getDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateRenewal" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateRenewal" element
     */
    public boolean isSetDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATERENEWAL$16) != 0;
        }
    }
    
    /**
     * Sets the "dateRenewal" element
     */
    public void setDateRenewal(java.util.Calendar dateRenewal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERENEWAL$16);
            }
            target.setCalendarValue(dateRenewal);
        }
    }
    
    /**
     * Sets (as xml) the "dateRenewal" element
     */
    public void xsetDateRenewal(org.apache.xmlbeans.XmlDate dateRenewal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERENEWAL$16);
            }
            target.set(dateRenewal);
        }
    }
    
    /**
     * Unsets the "dateRenewal" element
     */
    public void unsetDateRenewal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATERENEWAL$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREVIEW$18, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREVIEW$18, 0);
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
            return get_store().count_elements(DATEREVIEW$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREVIEW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREVIEW$18);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREVIEW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREVIEW$18);
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
            get_store().remove_element(DATEREVIEW$18, 0);
        }
    }
    
    /**
     * Gets the "jurisdiction" element
     */
    public java.lang.String getJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jurisdiction" element
     */
    public au.gov.asic.types.nni.NniEntityType.Jurisdiction xgetJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniEntityType.Jurisdiction target = null;
            target = (au.gov.asic.types.nni.NniEntityType.Jurisdiction)get_store().find_element_user(JURISDICTION$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "jurisdiction" element
     */
    public boolean isSetJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JURISDICTION$20) != 0;
        }
    }
    
    /**
     * Sets the "jurisdiction" element
     */
    public void setJurisdiction(java.lang.String jurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JURISDICTION$20);
            }
            target.setStringValue(jurisdiction);
        }
    }
    
    /**
     * Sets (as xml) the "jurisdiction" element
     */
    public void xsetJurisdiction(au.gov.asic.types.nni.NniEntityType.Jurisdiction jurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.NniEntityType.Jurisdiction target = null;
            target = (au.gov.asic.types.nni.NniEntityType.Jurisdiction)get_store().find_element_user(JURISDICTION$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.NniEntityType.Jurisdiction)get_store().add_element_user(JURISDICTION$20);
            }
            target.set(jurisdiction);
        }
    }
    
    /**
     * Unsets the "jurisdiction" element
     */
    public void unsetJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JURISDICTION$20, 0);
        }
    }
    
    /**
     * Gets the "registeredAddress" element
     */
    public au.gov.asic.types.AddressType getRegisteredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(REGISTEREDADDRESS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "registeredAddress" element
     */
    public boolean isSetRegisteredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTEREDADDRESS$22) != 0;
        }
    }
    
    /**
     * Sets the "registeredAddress" element
     */
    public void setRegisteredAddress(au.gov.asic.types.AddressType registeredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(REGISTEREDADDRESS$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType)get_store().add_element_user(REGISTEREDADDRESS$22);
            }
            target.set(registeredAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "registeredAddress" element
     */
    public au.gov.asic.types.AddressType addNewRegisteredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().add_element_user(REGISTEREDADDRESS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "registeredAddress" element
     */
    public void unsetRegisteredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTEREDADDRESS$22, 0);
        }
    }
    
    /**
     * Gets array of all "recentDocuments" elements
     */
    public au.gov.asic.types.bn.DocumentType[] getRecentDocumentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECENTDOCUMENTS$24, targetList);
            au.gov.asic.types.bn.DocumentType[] result = new au.gov.asic.types.bn.DocumentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recentDocuments" element
     */
    public au.gov.asic.types.bn.DocumentType getRecentDocumentsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().find_element_user(RECENTDOCUMENTS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recentDocuments" element
     */
    public int sizeOfRecentDocumentsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECENTDOCUMENTS$24);
        }
    }
    
    /**
     * Sets array of all "recentDocuments" element
     */
    public void setRecentDocumentsArray(au.gov.asic.types.bn.DocumentType[] recentDocumentsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recentDocumentsArray, RECENTDOCUMENTS$24);
        }
    }
    
    /**
     * Sets ith "recentDocuments" element
     */
    public void setRecentDocumentsArray(int i, au.gov.asic.types.bn.DocumentType recentDocuments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().find_element_user(RECENTDOCUMENTS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recentDocuments);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recentDocuments" element
     */
    public au.gov.asic.types.bn.DocumentType insertNewRecentDocuments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().insert_element_user(RECENTDOCUMENTS$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recentDocuments" element
     */
    public au.gov.asic.types.bn.DocumentType addNewRecentDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().add_element_user(RECENTDOCUMENTS$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "recentDocuments" element
     */
    public void removeRecentDocuments(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECENTDOCUMENTS$24, i);
        }
    }
    /**
     * An XML jurisdiction(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.NniEntityType$Jurisdiction.
     */
    public static class JurisdictionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.nni.NniEntityType.Jurisdiction
    {
        
        public JurisdictionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected JurisdictionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
