/*
 * XML Type:  outboundBusinessNameType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.OutboundBusinessNameType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML outboundBusinessNameType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OutboundBusinessNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.OutboundBusinessNameType
{
    
    public OutboundBusinessNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NNINUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "nniNumber");
    private static final javax.xml.namespace.QName BNREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "bnReferenceNumber");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "status");
    private static final javax.xml.namespace.QName TERM$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "term");
    private static final javax.xml.namespace.QName PREVIOUSSTATEORTERRITORY$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "previousStateOrTerritory");
    private static final javax.xml.namespace.QName JURISDICTION$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "jurisdiction");
    private static final javax.xml.namespace.QName DATEREGISTERED$14 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateRegistered");
    private static final javax.xml.namespace.QName DATERENEWAL$16 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateRenewal");
    private static final javax.xml.namespace.QName DATEDEREGISTERED$18 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "dateDeregistered");
    private static final javax.xml.namespace.QName ADDRESS$20 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    private static final javax.xml.namespace.QName EMAILADDRESS$22 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName SMSNUMBER$24 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "smsNumber");
    private static final javax.xml.namespace.QName REPRESENTATIVE$26 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "representative");
    
    
    /**
     * Gets the "nniNumber" element
     */
    public java.lang.String getNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nniNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NNINUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nniNumber" element
     */
    public void setNniNumber(java.lang.String nniNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$0);
            }
            target.setStringValue(nniNumber);
        }
    }
    
    /**
     * Sets (as xml) the "nniNumber" element
     */
    public void xsetNniNumber(org.apache.xmlbeans.XmlString nniNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NNINUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NNINUMBER$0);
            }
            target.set(nniNumber);
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
    public au.gov.asic.types.DistinguishedNameExtType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType)get_store().find_element_user(NAME$4, 0);
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
    public void setName(au.gov.asic.types.DistinguishedNameExtType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameExtType)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public au.gov.asic.types.DistinguishedNameExtType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameExtType target = null;
            target = (au.gov.asic.types.DistinguishedNameExtType)get_store().add_element_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "status" elements
     */
    public au.gov.asic.types.IntervalStatusType[] getStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUS$6, targetList);
            au.gov.asic.types.IntervalStatusType[] result = new au.gov.asic.types.IntervalStatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "status" element
     */
    public au.gov.asic.types.IntervalStatusType getStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.IntervalStatusType target = null;
            target = (au.gov.asic.types.IntervalStatusType)get_store().find_element_user(STATUS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "status" element
     */
    public int sizeOfStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$6);
        }
    }
    
    /**
     * Sets array of all "status" element
     */
    public void setStatusArray(au.gov.asic.types.IntervalStatusType[] statusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusArray, STATUS$6);
        }
    }
    
    /**
     * Sets ith "status" element
     */
    public void setStatusArray(int i, au.gov.asic.types.IntervalStatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.IntervalStatusType target = null;
            target = (au.gov.asic.types.IntervalStatusType)get_store().find_element_user(STATUS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(status);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "status" element
     */
    public au.gov.asic.types.IntervalStatusType insertNewStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.IntervalStatusType target = null;
            target = (au.gov.asic.types.IntervalStatusType)get_store().insert_element_user(STATUS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "status" element
     */
    public au.gov.asic.types.IntervalStatusType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.IntervalStatusType target = null;
            target = (au.gov.asic.types.IntervalStatusType)get_store().add_element_user(STATUS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "status" element
     */
    public void removeStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$6, i);
        }
    }
    
    /**
     * Gets the "term" element
     */
    public au.gov.asic.types.bn.TermType.Enum getTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$8, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.TermType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "term" element
     */
    public au.gov.asic.types.bn.TermType xgetTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.TermType target = null;
            target = (au.gov.asic.types.bn.TermType)get_store().find_element_user(TERM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "term" element
     */
    public boolean isSetTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERM$8) != 0;
        }
    }
    
    /**
     * Sets the "term" element
     */
    public void setTerm(au.gov.asic.types.bn.TermType.Enum term)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$8);
            }
            target.setEnumValue(term);
        }
    }
    
    /**
     * Sets (as xml) the "term" element
     */
    public void xsetTerm(au.gov.asic.types.bn.TermType term)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.TermType target = null;
            target = (au.gov.asic.types.bn.TermType)get_store().find_element_user(TERM$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.TermType)get_store().add_element_user(TERM$8);
            }
            target.set(term);
        }
    }
    
    /**
     * Unsets the "term" element
     */
    public void unsetTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERM$8, 0);
        }
    }
    
    /**
     * Gets the "previousStateOrTerritory" element
     */
    public au.gov.asic.types.bn.PreviousStateTerritoryType getPreviousStateOrTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATEORTERRITORY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "previousStateOrTerritory" element
     */
    public boolean isSetPreviousStateOrTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSSTATEORTERRITORY$10) != 0;
        }
    }
    
    /**
     * Sets the "previousStateOrTerritory" element
     */
    public void setPreviousStateOrTerritory(au.gov.asic.types.bn.PreviousStateTerritoryType previousStateOrTerritory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().find_element_user(PREVIOUSSTATEORTERRITORY$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATEORTERRITORY$10);
            }
            target.set(previousStateOrTerritory);
        }
    }
    
    /**
     * Appends and returns a new empty "previousStateOrTerritory" element
     */
    public au.gov.asic.types.bn.PreviousStateTerritoryType addNewPreviousStateOrTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PreviousStateTerritoryType target = null;
            target = (au.gov.asic.types.bn.PreviousStateTerritoryType)get_store().add_element_user(PREVIOUSSTATEORTERRITORY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "previousStateOrTerritory" element
     */
    public void unsetPreviousStateOrTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSSTATEORTERRITORY$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$12, 0);
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
    public au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction xgetJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction)get_store().find_element_user(JURISDICTION$12, 0);
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
            return get_store().count_elements(JURISDICTION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JURISDICTION$12);
            }
            target.setStringValue(jurisdiction);
        }
    }
    
    /**
     * Sets (as xml) the "jurisdiction" element
     */
    public void xsetJurisdiction(au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction jurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction)get_store().find_element_user(JURISDICTION$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction)get_store().add_element_user(JURISDICTION$12);
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
            get_store().remove_element(JURISDICTION$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$14, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$14, 0);
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
            return get_store().count_elements(DATEREGISTERED$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEREGISTERED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEREGISTERED$14);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEREGISTERED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEREGISTERED$14);
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
            get_store().remove_element(DATEREGISTERED$14, 0);
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
     * Gets the "dateDeregistered" element
     */
    public java.util.Calendar getDateDeregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDEREGISTERED$18, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDEREGISTERED$18, 0);
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
            return get_store().count_elements(DATEDEREGISTERED$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDEREGISTERED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEDEREGISTERED$18);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDEREGISTERED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEDEREGISTERED$18);
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
            get_store().remove_element(DATEDEREGISTERED$18, 0);
        }
    }
    
    /**
     * Gets array of all "address" elements
     */
    public au.gov.asic.types.AddressExtType[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$20, targetList);
            au.gov.asic.types.AddressExtType[] result = new au.gov.asic.types.AddressExtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "address" element
     */
    public au.gov.asic.types.AddressExtType getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().find_element_user(ADDRESS$20, i);
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
            return get_store().count_elements(ADDRESS$20);
        }
    }
    
    /**
     * Sets array of all "address" element
     */
    public void setAddressArray(au.gov.asic.types.AddressExtType[] addressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$20);
        }
    }
    
    /**
     * Sets ith "address" element
     */
    public void setAddressArray(int i, au.gov.asic.types.AddressExtType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().find_element_user(ADDRESS$20, i);
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
    public au.gov.asic.types.AddressExtType insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().insert_element_user(ADDRESS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    public au.gov.asic.types.AddressExtType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressExtType target = null;
            target = (au.gov.asic.types.AddressExtType)get_store().add_element_user(ADDRESS$20);
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
            get_store().remove_element(ADDRESS$20, i);
        }
    }
    
    /**
     * Gets the "emailAddress" element
     */
    public java.lang.String getEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    public au.gov.asic.types.EmailType xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailAddress" element
     */
    public boolean isSetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS$22) != 0;
        }
    }
    
    /**
     * Sets the "emailAddress" element
     */
    public void setEmailAddress(java.lang.String emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$22);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    public void xsetEmailAddress(au.gov.asic.types.EmailType emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$22);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Unsets the "emailAddress" element
     */
    public void unsetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS$22, 0);
        }
    }
    
    /**
     * Gets the "smsNumber" element
     */
    public java.lang.String getSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSNUMBER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "smsNumber" element
     */
    public au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber xgetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber)get_store().find_element_user(SMSNUMBER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "smsNumber" element
     */
    public boolean isSetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMSNUMBER$24) != 0;
        }
    }
    
    /**
     * Sets the "smsNumber" element
     */
    public void setSmsNumber(java.lang.String smsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSNUMBER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMSNUMBER$24);
            }
            target.setStringValue(smsNumber);
        }
    }
    
    /**
     * Sets (as xml) the "smsNumber" element
     */
    public void xsetSmsNumber(au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber smsNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber target = null;
            target = (au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber)get_store().find_element_user(SMSNUMBER$24, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber)get_store().add_element_user(SMSNUMBER$24);
            }
            target.set(smsNumber);
        }
    }
    
    /**
     * Unsets the "smsNumber" element
     */
    public void unsetSmsNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMSNUMBER$24, 0);
        }
    }
    
    /**
     * Gets array of all "representative" elements
     */
    public au.gov.asic.types.bn.RepresentativeType[] getRepresentativeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPRESENTATIVE$26, targetList);
            au.gov.asic.types.bn.RepresentativeType[] result = new au.gov.asic.types.bn.RepresentativeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "representative" element
     */
    public au.gov.asic.types.bn.RepresentativeType getRepresentativeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().find_element_user(REPRESENTATIVE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "representative" element
     */
    public int sizeOfRepresentativeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIVE$26);
        }
    }
    
    /**
     * Sets array of all "representative" element
     */
    public void setRepresentativeArray(au.gov.asic.types.bn.RepresentativeType[] representativeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(representativeArray, REPRESENTATIVE$26);
        }
    }
    
    /**
     * Sets ith "representative" element
     */
    public void setRepresentativeArray(int i, au.gov.asic.types.bn.RepresentativeType representative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().find_element_user(REPRESENTATIVE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representative);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representative" element
     */
    public au.gov.asic.types.bn.RepresentativeType insertNewRepresentative(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().insert_element_user(REPRESENTATIVE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representative" element
     */
    public au.gov.asic.types.bn.RepresentativeType addNewRepresentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RepresentativeType target = null;
            target = (au.gov.asic.types.bn.RepresentativeType)get_store().add_element_user(REPRESENTATIVE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "representative" element
     */
    public void removeRepresentative(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIVE$26, i);
        }
    }
    /**
     * An XML jurisdiction(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.OutboundBusinessNameType$Jurisdiction.
     */
    public static class JurisdictionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.OutboundBusinessNameType.Jurisdiction
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
     * An XML smsNumber(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.OutboundBusinessNameType$SmsNumber.
     */
    public static class SmsNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.OutboundBusinessNameType.SmsNumber
    {
        
        public SmsNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SmsNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
