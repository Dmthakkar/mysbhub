/*
 * XML Type:  bnExtractRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnExtractRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnExtractRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnExtractRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnExtractRequestType
{
    
    public BnExtractRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName ORGNUMBER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "orgNumber");
    private static final javax.xml.namespace.QName NNINUMBER$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "nniNumber");
    private static final javax.xml.namespace.QName BNREFERENCENUMBER$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "bnReferenceNumber");
    private static final javax.xml.namespace.QName STATETERRITORY$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "stateTerritory");
    private static final javax.xml.namespace.QName SUMMARYDETAILSONLY$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "summaryDetailsOnly");
    private static final javax.xml.namespace.QName MAXDOCUMENTS$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "maxDocuments");
    private static final javax.xml.namespace.QName SHOWHISTORY$14 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "showHistory");
    
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abn" element
     */
    public au.gov.asic.types.bn.BnExtractRequestType.Abn xgetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnExtractRequestType.Abn target = null;
            target = (au.gov.asic.types.bn.BnExtractRequestType.Abn)get_store().find_element_user(ABN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "abn" element
     */
    public boolean isSetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$0) != 0;
        }
    }
    
    /**
     * Sets the "abn" element
     */
    public void setAbn(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$0);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "abn" element
     */
    public void xsetAbn(au.gov.asic.types.bn.BnExtractRequestType.Abn abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnExtractRequestType.Abn target = null;
            target = (au.gov.asic.types.bn.BnExtractRequestType.Abn)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnExtractRequestType.Abn)get_store().add_element_user(ABN$0);
            }
            target.set(abn);
        }
    }
    
    /**
     * Unsets the "abn" element
     */
    public void unsetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$0, 0);
        }
    }
    
    /**
     * Gets the "orgNumber" element
     */
    public java.lang.String getOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orgNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "orgNumber" element
     */
    public boolean isSetOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "orgNumber" element
     */
    public void setOrgNumber(java.lang.String orgNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGNUMBER$2);
            }
            target.setStringValue(orgNumber);
        }
    }
    
    /**
     * Sets (as xml) the "orgNumber" element
     */
    public void xsetOrgNumber(org.apache.xmlbeans.XmlString orgNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGNUMBER$2);
            }
            target.set(orgNumber);
        }
    }
    
    /**
     * Unsets the "orgNumber" element
     */
    public void unsetOrgNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGNUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "nniNumber" element
     */
    public java.lang.String getNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NNINUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nniNumber" element
     */
    public boolean isSetNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NNINUMBER$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NNINUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NNINUMBER$4);
            }
            target.set(nniNumber);
        }
    }
    
    /**
     * Unsets the "nniNumber" element
     */
    public void unsetNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NNINUMBER$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$6, 0);
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
            target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$6, 0);
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
            return get_store().count_elements(BNREFERENCENUMBER$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNREFERENCENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNREFERENCENUMBER$6);
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
            target = (au.gov.asic.types.BnReferenceNumberType)get_store().find_element_user(BNREFERENCENUMBER$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.BnReferenceNumberType)get_store().add_element_user(BNREFERENCENUMBER$6);
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
            get_store().remove_element(BNREFERENCENUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "stateTerritory" element
     */
    public au.gov.asic.types.bn.BnExtractRequestType.StateTerritory getStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnExtractRequestType.StateTerritory target = null;
            target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory)get_store().find_element_user(STATETERRITORY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stateTerritory" element
     */
    public boolean isSetStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATETERRITORY$8) != 0;
        }
    }
    
    /**
     * Sets the "stateTerritory" element
     */
    public void setStateTerritory(au.gov.asic.types.bn.BnExtractRequestType.StateTerritory stateTerritory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnExtractRequestType.StateTerritory target = null;
            target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory)get_store().find_element_user(STATETERRITORY$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory)get_store().add_element_user(STATETERRITORY$8);
            }
            target.set(stateTerritory);
        }
    }
    
    /**
     * Appends and returns a new empty "stateTerritory" element
     */
    public au.gov.asic.types.bn.BnExtractRequestType.StateTerritory addNewStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnExtractRequestType.StateTerritory target = null;
            target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory)get_store().add_element_user(STATETERRITORY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "stateTerritory" element
     */
    public void unsetStateTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATETERRITORY$8, 0);
        }
    }
    
    /**
     * Gets the "summaryDetailsOnly" element
     */
    public boolean getSummaryDetailsOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARYDETAILSONLY$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "summaryDetailsOnly" element
     */
    public au.gov.asic.types.TrueType xgetSummaryDetailsOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(SUMMARYDETAILSONLY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "summaryDetailsOnly" element
     */
    public boolean isSetSummaryDetailsOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUMMARYDETAILSONLY$10) != 0;
        }
    }
    
    /**
     * Sets the "summaryDetailsOnly" element
     */
    public void setSummaryDetailsOnly(boolean summaryDetailsOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARYDETAILSONLY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUMMARYDETAILSONLY$10);
            }
            target.setBooleanValue(summaryDetailsOnly);
        }
    }
    
    /**
     * Sets (as xml) the "summaryDetailsOnly" element
     */
    public void xsetSummaryDetailsOnly(au.gov.asic.types.TrueType summaryDetailsOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(SUMMARYDETAILSONLY$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(SUMMARYDETAILSONLY$10);
            }
            target.set(summaryDetailsOnly);
        }
    }
    
    /**
     * Unsets the "summaryDetailsOnly" element
     */
    public void unsetSummaryDetailsOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUMMARYDETAILSONLY$10, 0);
        }
    }
    
    /**
     * Gets the "maxDocuments" element
     */
    public java.math.BigInteger getMaxDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOCUMENTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxDocuments" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaxDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXDOCUMENTS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "maxDocuments" element
     */
    public boolean isSetMaxDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXDOCUMENTS$12) != 0;
        }
    }
    
    /**
     * Sets the "maxDocuments" element
     */
    public void setMaxDocuments(java.math.BigInteger maxDocuments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDOCUMENTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDOCUMENTS$12);
            }
            target.setBigIntegerValue(maxDocuments);
        }
    }
    
    /**
     * Sets (as xml) the "maxDocuments" element
     */
    public void xsetMaxDocuments(org.apache.xmlbeans.XmlPositiveInteger maxDocuments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXDOCUMENTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MAXDOCUMENTS$12);
            }
            target.set(maxDocuments);
        }
    }
    
    /**
     * Unsets the "maxDocuments" element
     */
    public void unsetMaxDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXDOCUMENTS$12, 0);
        }
    }
    
    /**
     * Gets the "showHistory" element
     */
    public boolean getShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWHISTORY$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showHistory" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOWHISTORY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "showHistory" element
     */
    public boolean isSetShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWHISTORY$14) != 0;
        }
    }
    
    /**
     * Sets the "showHistory" element
     */
    public void setShowHistory(boolean showHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWHISTORY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOWHISTORY$14);
            }
            target.setBooleanValue(showHistory);
        }
    }
    
    /**
     * Sets (as xml) the "showHistory" element
     */
    public void xsetShowHistory(org.apache.xmlbeans.XmlBoolean showHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOWHISTORY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHOWHISTORY$14);
            }
            target.set(showHistory);
        }
    }
    
    /**
     * Unsets the "showHistory" element
     */
    public void unsetShowHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWHISTORY$14, 0);
        }
    }
    /**
     * An XML abn(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnExtractRequestType$Abn.
     */
    public static class AbnImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.BnExtractRequestType.Abn
    {
        
        public AbnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AbnImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML stateTerritory(@uri:bn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class StateTerritoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnExtractRequestType.StateTerritory
    {
        
        public StateTerritoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREVIOUSSTATENUMBER$0 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "previousStateNumber");
        private static final javax.xml.namespace.QName ISSUINGSTATETERRITORY$2 = 
            new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "issuingStateTerritory");
        
        
        /**
         * Gets the "previousStateNumber" element
         */
        public java.lang.String getPreviousStateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIOUSSTATENUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "previousStateNumber" element
         */
        public au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber xgetPreviousStateNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber target = null;
                target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber)get_store().find_element_user(PREVIOUSSTATENUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "previousStateNumber" element
         */
        public void setPreviousStateNumber(java.lang.String previousStateNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIOUSSTATENUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIOUSSTATENUMBER$0);
                }
                target.setStringValue(previousStateNumber);
            }
        }
        
        /**
         * Sets (as xml) the "previousStateNumber" element
         */
        public void xsetPreviousStateNumber(au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber previousStateNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber target = null;
                target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber)get_store().find_element_user(PREVIOUSSTATENUMBER$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber)get_store().add_element_user(PREVIOUSSTATENUMBER$0);
                }
                target.set(previousStateNumber);
            }
        }
        
        /**
         * Gets the "issuingStateTerritory" element
         */
        public au.gov.asic.types.StateTerritoryCodeType.Enum getIssuingStateTerritory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGSTATETERRITORY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "issuingStateTerritory" element
         */
        public au.gov.asic.types.StateTerritoryCodeType xgetIssuingStateTerritory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.StateTerritoryCodeType target = null;
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(ISSUINGSTATETERRITORY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "issuingStateTerritory" element
         */
        public void setIssuingStateTerritory(au.gov.asic.types.StateTerritoryCodeType.Enum issuingStateTerritory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUINGSTATETERRITORY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUINGSTATETERRITORY$2);
                }
                target.setEnumValue(issuingStateTerritory);
            }
        }
        
        /**
         * Sets (as xml) the "issuingStateTerritory" element
         */
        public void xsetIssuingStateTerritory(au.gov.asic.types.StateTerritoryCodeType issuingStateTerritory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.StateTerritoryCodeType target = null;
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(ISSUINGSTATETERRITORY$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(ISSUINGSTATETERRITORY$2);
                }
                target.set(issuingStateTerritory);
            }
        }
        /**
         * An XML previousStateNumber(@uri:bn.types.asic.gov.au).
         *
         * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnExtractRequestType$StateTerritory$PreviousStateNumber.
         */
        public static class PreviousStateNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.bn.BnExtractRequestType.StateTerritory.PreviousStateNumber
        {
            
            public PreviousStateNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PreviousStateNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
