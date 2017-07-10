/*
 * XML Type:  baseNniEntityType
 * Namespace: uri:nni.types.asic.gov.au
 * Java type: au.gov.asic.types.nni.BaseNniEntityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.nni.impl;
/**
 * An XML baseNniEntityType(@uri:nni.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BaseNniEntityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.BaseNniEntityType
{
    
    public BaseNniEntityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "identifier");
    private static final javax.xml.namespace.QName BNREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "bnReferenceNumber");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName CLASS1$8 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "class");
    private static final javax.xml.namespace.QName SUBCLASS$10 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "subClass");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "status");
    private static final javax.xml.namespace.QName INCORPORATIONSTATE$14 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "incorporationState");
    private static final javax.xml.namespace.QName PLACEOFINCORPORATION$16 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "placeOfIncorporation");
    private static final javax.xml.namespace.QName PREVIOUSSTATETERRITORY$18 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "previousStateTerritory");
    private static final javax.xml.namespace.QName DATEREGISTERED$20 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateRegistered");
    private static final javax.xml.namespace.QName DATERENEWAL$22 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateRenewal");
    private static final javax.xml.namespace.QName DATEDEREGISTERED$24 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateDeregistered");
    private static final javax.xml.namespace.QName DATEREVIEW$26 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "dateReview");
    private static final javax.xml.namespace.QName JURISDICTION$28 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "jurisdiction");
    private static final javax.xml.namespace.QName ADDRESS$30 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName FORMERNAME$32 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "formerName");
    private static final javax.xml.namespace.QName RECENTDOCUMENT$34 = 
        new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "recentDocument");
    
    
    /**
     * Gets the "identifier" element
     */
    public au.gov.asic.types.nni.IdentifierType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.IdentifierType target = null;
            target = (au.gov.asic.types.nni.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
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
            target = (au.gov.asic.types.nni.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
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
            target = (au.gov.asic.types.nni.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "bnReferenceNumber" element
     */
    public java.lang.String getBnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bnReferenceNumber" element
     */
    public au.gov.asic.types.BnReferenceNumberType xgetBnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BnReferenceNumberType target = null;
            target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "bnReferenceNumber" element
     */
    public boolean isSetBnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BNREFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "bnReferenceNumber" element
     */
    public void setBnReferenceNumber(java.lang.String bnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNREFERENCENUMBER$2);
            }
            target.setStringValue(bnReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "bnReferenceNumber" element
     */
    public void xsetBnReferenceNumber(au.gov.asic.types.BnReferenceNumberType bnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.BnReferenceNumberType target = null;
            target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BnReferenceNumberType)get_store().add_element_user(BNREFERENCENUMBER$2);
            }
            target.set(bnReferenceNumber);
        }
    }
    
    /**
     * Unsets the "bnReferenceNumber" element
     */
    public void unsetBnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BNREFERENCENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public au.gov.asic.types.DistinguishedNameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(au.gov.asic.types.DistinguishedNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public au.gov.asic.types.DistinguishedNameType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(NAME$4);
            return target;
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
     * Gets the "class" element
     */
    public au.gov.asic.types.nni.ClassType getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.ClassType target = null;
            target = (au.gov.asic.types.nni.ClassType)get_store().find_element_user(CLASS1$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "class" element
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASS1$8) != 0;
        }
    }
    
    /**
     * Sets the "class" element
     */
    public void setClass1(au.gov.asic.types.nni.ClassType class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.ClassType target = null;
            target = (au.gov.asic.types.nni.ClassType)get_store().find_element_user(CLASS1$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.ClassType)get_store().add_element_user(CLASS1$8);
            }
            target.set(class1);
        }
    }
    
    /**
     * Appends and returns a new empty "class" element
     */
    public au.gov.asic.types.nni.ClassType addNewClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.ClassType target = null;
            target = (au.gov.asic.types.nni.ClassType)get_store().add_element_user(CLASS1$8);
            return target;
        }
    }
    
    /**
     * Unsets the "class" element
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASS1$8, 0);
        }
    }
    
    /**
     * Gets the "subClass" element
     */
    public au.gov.asic.types.nni.ClassType getSubClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.ClassType target = null;
            target = (au.gov.asic.types.nni.ClassType)get_store().find_element_user(SUBCLASS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subClass" element
     */
    public boolean isSetSubClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCLASS$10) != 0;
        }
    }
    
    /**
     * Sets the "subClass" element
     */
    public void setSubClass(au.gov.asic.types.nni.ClassType subClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.ClassType target = null;
            target = (au.gov.asic.types.nni.ClassType)get_store().find_element_user(SUBCLASS$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.ClassType)get_store().add_element_user(SUBCLASS$10);
            }
            target.set(subClass);
        }
    }
    
    /**
     * Appends and returns a new empty "subClass" element
     */
    public au.gov.asic.types.nni.ClassType addNewSubClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.ClassType target = null;
            target = (au.gov.asic.types.nni.ClassType)get_store().add_element_user(SUBCLASS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "subClass" element
     */
    public void unsetSubClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCLASS$10, 0);
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
            target = (au.gov.asic.types.StatusType)get_store().find_element_user(STATUS$12, 0);
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
            target = (au.gov.asic.types.StatusType)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StatusType)get_store().add_element_user(STATUS$12);
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
            target = (au.gov.asic.types.StatusType)get_store().add_element_user(STATUS$12);
            return target;
        }
    }
    
    /**
     * Gets the "incorporationState" element
     */
    public au.gov.asic.types.StateTerritoryCodeType.Enum getIncorporationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONSTATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "incorporationState" element
     */
    public au.gov.asic.types.StateTerritoryCodeType xgetIncorporationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(INCORPORATIONSTATE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "incorporationState" element
     */
    public boolean isSetIncorporationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCORPORATIONSTATE$14) != 0;
        }
    }
    
    /**
     * Sets the "incorporationState" element
     */
    public void setIncorporationState(au.gov.asic.types.StateTerritoryCodeType.Enum incorporationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONSTATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATIONSTATE$14);
            }
            target.setEnumValue(incorporationState);
        }
    }
    
    /**
     * Sets (as xml) the "incorporationState" element
     */
    public void xsetIncorporationState(au.gov.asic.types.StateTerritoryCodeType incorporationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(INCORPORATIONSTATE$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(INCORPORATIONSTATE$14);
            }
            target.set(incorporationState);
        }
    }
    
    /**
     * Unsets the "incorporationState" element
     */
    public void unsetIncorporationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCORPORATIONSTATE$14, 0);
        }
    }
    
    /**
     * Gets the "placeOfIncorporation" element
     */
    public java.lang.String getPlaceOfIncorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEOFINCORPORATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "placeOfIncorporation" element
     */
    public au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation xgetPlaceOfIncorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation)get_store().find_element_user(PLACEOFINCORPORATION$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "placeOfIncorporation" element
     */
    public boolean isSetPlaceOfIncorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACEOFINCORPORATION$16) != 0;
        }
    }
    
    /**
     * Sets the "placeOfIncorporation" element
     */
    public void setPlaceOfIncorporation(java.lang.String placeOfIncorporation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEOFINCORPORATION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACEOFINCORPORATION$16);
            }
            target.setStringValue(placeOfIncorporation);
        }
    }
    
    /**
     * Sets (as xml) the "placeOfIncorporation" element
     */
    public void xsetPlaceOfIncorporation(au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation placeOfIncorporation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation)get_store().find_element_user(PLACEOFINCORPORATION$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation)get_store().add_element_user(PLACEOFINCORPORATION$16);
            }
            target.set(placeOfIncorporation);
        }
    }
    
    /**
     * Unsets the "placeOfIncorporation" element
     */
    public void unsetPlaceOfIncorporation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACEOFINCORPORATION$16, 0);
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
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATETERRITORY$18, 0);
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
            return get_store().count_elements(PREVIOUSSTATETERRITORY$18) != 0;
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
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATETERRITORY$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATETERRITORY$18);
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
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATETERRITORY$18);
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
            get_store().remove_element(PREVIOUSSTATETERRITORY$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$20, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$20, 0);
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
            return get_store().count_elements(DATEREGISTERED$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREGISTERED$20);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREGISTERED$20);
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
            get_store().remove_element(DATEREGISTERED$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$22, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$22, 0);
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
            return get_store().count_elements(DATERENEWAL$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATERENEWAL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATERENEWAL$22);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATERENEWAL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATERENEWAL$22);
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
            get_store().remove_element(DATERENEWAL$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDEREGISTERED$24, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDEREGISTERED$24, 0);
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
            return get_store().count_elements(DATEDEREGISTERED$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDEREGISTERED$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEDEREGISTERED$24);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDEREGISTERED$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEDEREGISTERED$24);
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
            get_store().remove_element(DATEDEREGISTERED$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREVIEW$26, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREVIEW$26, 0);
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
            return get_store().count_elements(DATEREVIEW$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREVIEW$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREVIEW$26);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREVIEW$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREVIEW$26);
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
            get_store().remove_element(DATEREVIEW$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$28, 0);
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
    public au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction xgetJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction)get_store().find_element_user(JURISDICTION$28, 0);
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
            return get_store().count_elements(JURISDICTION$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JURISDICTION$28);
            }
            target.setStringValue(jurisdiction);
        }
    }
    
    /**
     * Sets (as xml) the "jurisdiction" element
     */
    public void xsetJurisdiction(au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction jurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction)get_store().find_element_user(JURISDICTION$28, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction)get_store().add_element_user(JURISDICTION$28);
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
            get_store().remove_element(JURISDICTION$28, 0);
        }
    }
    
    /**
     * Gets array of all "address" elements
     */
    public au.gov.asic.types.AddressType[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$30, targetList);
            au.gov.asic.types.AddressType[] result = new au.gov.asic.types.AddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "address" element
     */
    public au.gov.asic.types.AddressType getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "address" element
     */
    public int sizeOfAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$30);
        }
    }
    
    /**
     * Sets array of all "address" element
     */
    public void setAddressArray(au.gov.asic.types.AddressType[] addressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$30);
        }
    }
    
    /**
     * Sets ith "address" element
     */
    public void setAddressArray(int i, au.gov.asic.types.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(address);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    public au.gov.asic.types.AddressType insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().insert_element_user(ADDRESS$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    public au.gov.asic.types.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "address" element
     */
    public void removeAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$30, i);
        }
    }
    
    /**
     * Gets array of all "formerName" elements
     */
    public au.gov.asic.types.nni.BaseNniEntityType.FormerName[] getFormerNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMERNAME$32, targetList);
            au.gov.asic.types.nni.BaseNniEntityType.FormerName[] result = new au.gov.asic.types.nni.BaseNniEntityType.FormerName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "formerName" element
     */
    public au.gov.asic.types.nni.BaseNniEntityType.FormerName getFormerNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.FormerName target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.FormerName)get_store().find_element_user(FORMERNAME$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "formerName" element
     */
    public int sizeOfFormerNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMERNAME$32);
        }
    }
    
    /**
     * Sets array of all "formerName" element
     */
    public void setFormerNameArray(au.gov.asic.types.nni.BaseNniEntityType.FormerName[] formerNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formerNameArray, FORMERNAME$32);
        }
    }
    
    /**
     * Sets ith "formerName" element
     */
    public void setFormerNameArray(int i, au.gov.asic.types.nni.BaseNniEntityType.FormerName formerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.FormerName target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.FormerName)get_store().find_element_user(FORMERNAME$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(formerName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formerName" element
     */
    public au.gov.asic.types.nni.BaseNniEntityType.FormerName insertNewFormerName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.FormerName target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.FormerName)get_store().insert_element_user(FORMERNAME$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formerName" element
     */
    public au.gov.asic.types.nni.BaseNniEntityType.FormerName addNewFormerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.nni.BaseNniEntityType.FormerName target = null;
            target = (au.gov.asic.types.nni.BaseNniEntityType.FormerName)get_store().add_element_user(FORMERNAME$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "formerName" element
     */
    public void removeFormerName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMERNAME$32, i);
        }
    }
    
    /**
     * Gets array of all "recentDocument" elements
     */
    public au.gov.asic.types.bn.DocumentType[] getRecentDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECENTDOCUMENT$34, targetList);
            au.gov.asic.types.bn.DocumentType[] result = new au.gov.asic.types.bn.DocumentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recentDocument" element
     */
    public au.gov.asic.types.bn.DocumentType getRecentDocumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().find_element_user(RECENTDOCUMENT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recentDocument" element
     */
    public int sizeOfRecentDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECENTDOCUMENT$34);
        }
    }
    
    /**
     * Sets array of all "recentDocument" element
     */
    public void setRecentDocumentArray(au.gov.asic.types.bn.DocumentType[] recentDocumentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recentDocumentArray, RECENTDOCUMENT$34);
        }
    }
    
    /**
     * Sets ith "recentDocument" element
     */
    public void setRecentDocumentArray(int i, au.gov.asic.types.bn.DocumentType recentDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().find_element_user(RECENTDOCUMENT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recentDocument);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recentDocument" element
     */
    public au.gov.asic.types.bn.DocumentType insertNewRecentDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().insert_element_user(RECENTDOCUMENT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recentDocument" element
     */
    public au.gov.asic.types.bn.DocumentType addNewRecentDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.DocumentType target = null;
            target = (au.gov.asic.types.bn.DocumentType)get_store().add_element_user(RECENTDOCUMENT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "recentDocument" element
     */
    public void removeRecentDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECENTDOCUMENT$34, i);
        }
    }
    /**
     * An XML placeOfIncorporation(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.BaseNniEntityType$PlaceOfIncorporation.
     */
    public static class PlaceOfIncorporationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.nni.BaseNniEntityType.PlaceOfIncorporation
    {
        
        public PlaceOfIncorporationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PlaceOfIncorporationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML jurisdiction(@uri:nni.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.nni.BaseNniEntityType$Jurisdiction.
     */
    public static class JurisdictionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.nni.BaseNniEntityType.Jurisdiction
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
    /**
     * An XML formerName(@uri:nni.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class FormerNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.nni.BaseNniEntityType.FormerName
    {
        
        public FormerNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONNAME$0 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "organisationName");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("uri:nni.types.asic.gov.au", "endDate");
        
        
        /**
         * Gets the "organisationName" element
         */
        public java.lang.String getOrganisationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "organisationName" element
         */
        public au.gov.asic.types.NniNameType xgetOrganisationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNameType target = null;
                target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "organisationName" element
         */
        public void setOrganisationName(java.lang.String organisationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONNAME$0);
                }
                target.setStringValue(organisationName);
            }
        }
        
        /**
         * Sets (as xml) the "organisationName" element
         */
        public void xsetOrganisationName(au.gov.asic.types.NniNameType organisationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.NniNameType target = null;
                target = (au.gov.asic.types.NniNameType)get_store().find_element_user(ORGANISATIONNAME$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.NniNameType)get_store().add_element_user(ORGANISATIONNAME$0);
                }
                target.set(organisationName);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$2, 0);
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
                return get_store().count_elements(STARTDATE$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$2);
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
                get_store().remove_element(STARTDATE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$4, 0);
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
                return get_store().count_elements(ENDDATE$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$4);
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
                get_store().remove_element(ENDDATE$4, 0);
            }
        }
    }
}
