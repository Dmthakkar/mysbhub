/*
 * XML Type:  fssItemType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssItemType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML fssItemType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FssItemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssItemType
{
    
    public FssItemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGPARTY$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "reportingParty");
    private static final javax.xml.namespace.QName FEE$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "fee");
    private static final javax.xml.namespace.QName DATEPROCESSED$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateProcessed");
    private static final javax.xml.namespace.QName DATEEFFECTIVE$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateEffective");
    private static final javax.xml.namespace.QName DATELASTEFFECTIVE$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateLastEffective");
    private static final javax.xml.namespace.QName REVERSALINDICATOR$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "reversalIndicator");
    private static final javax.xml.namespace.QName REGISTRYDOCUMENTNUMBER$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "registryDocumentNumber");
    private static final javax.xml.namespace.QName AMOUNT$14 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "amount");
    private static final javax.xml.namespace.QName TAXAMOUNT$16 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "taxAmount");
    private static final javax.xml.namespace.QName TAXCODE$18 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "taxCode");
    private static final javax.xml.namespace.QName CHANNEL$20 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "channel");
    private static final javax.xml.namespace.QName QUANTITY$22 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "quantity");
    private static final javax.xml.namespace.QName SUFFIX$24 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "suffix");
    
    
    /**
     * Gets the "reportingParty" element
     */
    public au.gov.asic.types.fss.FssAccountType getReportingParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(REPORTINGPARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportingParty" element
     */
    public boolean isSetReportingParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGPARTY$0) != 0;
        }
    }
    
    /**
     * Sets the "reportingParty" element
     */
    public void setReportingParty(au.gov.asic.types.fss.FssAccountType reportingParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().find_element_user(REPORTINGPARTY$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(REPORTINGPARTY$0);
            }
            target.set(reportingParty);
        }
    }
    
    /**
     * Appends and returns a new empty "reportingParty" element
     */
    public au.gov.asic.types.fss.FssAccountType addNewReportingParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssAccountType target = null;
            target = (au.gov.asic.types.fss.FssAccountType)get_store().add_element_user(REPORTINGPARTY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "reportingParty" element
     */
    public void unsetReportingParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGPARTY$0, 0);
        }
    }
    
    /**
     * Gets the "fee" element
     */
    public au.gov.asic.types.fss.FeeType getFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType target = null;
            target = (au.gov.asic.types.fss.FeeType)get_store().find_element_user(FEE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fee" element
     */
    public void setFee(au.gov.asic.types.fss.FeeType fee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType target = null;
            target = (au.gov.asic.types.fss.FeeType)get_store().find_element_user(FEE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeType)get_store().add_element_user(FEE$2);
            }
            target.set(fee);
        }
    }
    
    /**
     * Appends and returns a new empty "fee" element
     */
    public au.gov.asic.types.fss.FeeType addNewFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType target = null;
            target = (au.gov.asic.types.fss.FeeType)get_store().add_element_user(FEE$2);
            return target;
        }
    }
    
    /**
     * Gets the "dateProcessed" element
     */
    public java.util.Calendar getDateProcessed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEPROCESSED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateProcessed" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateProcessed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEPROCESSED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateProcessed" element
     */
    public void setDateProcessed(java.util.Calendar dateProcessed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEPROCESSED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEPROCESSED$4);
            }
            target.setCalendarValue(dateProcessed);
        }
    }
    
    /**
     * Sets (as xml) the "dateProcessed" element
     */
    public void xsetDateProcessed(org.apache.xmlbeans.XmlDate dateProcessed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEPROCESSED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEPROCESSED$4);
            }
            target.set(dateProcessed);
        }
    }
    
    /**
     * Gets the "dateEffective" element
     */
    public java.util.Calendar getDateEffective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEEFFECTIVE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateEffective" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateEffective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEEFFECTIVE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateEffective" element
     */
    public void setDateEffective(java.util.Calendar dateEffective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEEFFECTIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEEFFECTIVE$6);
            }
            target.setCalendarValue(dateEffective);
        }
    }
    
    /**
     * Sets (as xml) the "dateEffective" element
     */
    public void xsetDateEffective(org.apache.xmlbeans.XmlDate dateEffective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEEFFECTIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEEFFECTIVE$6);
            }
            target.set(dateEffective);
        }
    }
    
    /**
     * Gets the "dateLastEffective" element
     */
    public java.util.Calendar getDateLastEffective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATELASTEFFECTIVE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateLastEffective" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateLastEffective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATELASTEFFECTIVE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateLastEffective" element
     */
    public boolean isSetDateLastEffective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATELASTEFFECTIVE$8) != 0;
        }
    }
    
    /**
     * Sets the "dateLastEffective" element
     */
    public void setDateLastEffective(java.util.Calendar dateLastEffective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATELASTEFFECTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATELASTEFFECTIVE$8);
            }
            target.setCalendarValue(dateLastEffective);
        }
    }
    
    /**
     * Sets (as xml) the "dateLastEffective" element
     */
    public void xsetDateLastEffective(org.apache.xmlbeans.XmlDate dateLastEffective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATELASTEFFECTIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATELASTEFFECTIVE$8);
            }
            target.set(dateLastEffective);
        }
    }
    
    /**
     * Unsets the "dateLastEffective" element
     */
    public void unsetDateLastEffective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATELASTEFFECTIVE$8, 0);
        }
    }
    
    /**
     * Gets the "reversalIndicator" element
     */
    public boolean getReversalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSALINDICATOR$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "reversalIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetReversalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REVERSALINDICATOR$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "reversalIndicator" element
     */
    public boolean isSetReversalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVERSALINDICATOR$10) != 0;
        }
    }
    
    /**
     * Sets the "reversalIndicator" element
     */
    public void setReversalIndicator(boolean reversalIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVERSALINDICATOR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVERSALINDICATOR$10);
            }
            target.setBooleanValue(reversalIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "reversalIndicator" element
     */
    public void xsetReversalIndicator(org.apache.xmlbeans.XmlBoolean reversalIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REVERSALINDICATOR$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REVERSALINDICATOR$10);
            }
            target.set(reversalIndicator);
        }
    }
    
    /**
     * Unsets the "reversalIndicator" element
     */
    public void unsetReversalIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVERSALINDICATOR$10, 0);
        }
    }
    
    /**
     * Gets the "registryDocumentNumber" element
     */
    public java.lang.String getRegistryDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYDOCUMENTNUMBER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "registryDocumentNumber" element
     */
    public au.gov.asic.types.DocumentNoType xgetRegistryDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentNoType target = null;
            target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(REGISTRYDOCUMENTNUMBER$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "registryDocumentNumber" element
     */
    public boolean isSetRegistryDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRYDOCUMENTNUMBER$12) != 0;
        }
    }
    
    /**
     * Sets the "registryDocumentNumber" element
     */
    public void setRegistryDocumentNumber(java.lang.String registryDocumentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYDOCUMENTNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRYDOCUMENTNUMBER$12);
            }
            target.setStringValue(registryDocumentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "registryDocumentNumber" element
     */
    public void xsetRegistryDocumentNumber(au.gov.asic.types.DocumentNoType registryDocumentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentNoType target = null;
            target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(REGISTRYDOCUMENTNUMBER$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DocumentNoType)get_store().add_element_user(REGISTRYDOCUMENTNUMBER$12);
            }
            target.set(registryDocumentNumber);
        }
    }
    
    /**
     * Unsets the "registryDocumentNumber" element
     */
    public void unsetRegistryDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRYDOCUMENTNUMBER$12, 0);
        }
    }
    
    /**
     * Gets the "amount" element
     */
    public java.math.BigDecimal getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "amount" element
     */
    public au.gov.asic.types.AmountType xgetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$14) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(java.math.BigDecimal amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$14);
            }
            target.setBigDecimalValue(amount);
        }
    }
    
    /**
     * Sets (as xml) the "amount" element
     */
    public void xsetAmount(au.gov.asic.types.AmountType amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(AMOUNT$14);
            }
            target.set(amount);
        }
    }
    
    /**
     * Unsets the "amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$14, 0);
        }
    }
    
    /**
     * Gets the "taxAmount" element
     */
    public java.math.BigDecimal getTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "taxAmount" element
     */
    public au.gov.asic.types.AmountType xgetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TAXAMOUNT$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "taxAmount" element
     */
    public boolean isSetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXAMOUNT$16) != 0;
        }
    }
    
    /**
     * Sets the "taxAmount" element
     */
    public void setTaxAmount(java.math.BigDecimal taxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$16);
            }
            target.setBigDecimalValue(taxAmount);
        }
    }
    
    /**
     * Sets (as xml) the "taxAmount" element
     */
    public void xsetTaxAmount(au.gov.asic.types.AmountType taxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TAXAMOUNT$16, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TAXAMOUNT$16);
            }
            target.set(taxAmount);
        }
    }
    
    /**
     * Unsets the "taxAmount" element
     */
    public void unsetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXAMOUNT$16, 0);
        }
    }
    
    /**
     * Gets the "taxCode" element
     */
    public java.lang.String getTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taxCode" element
     */
    public au.gov.asic.types.fss.FssItemType.TaxCode xgetTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.TaxCode target = null;
            target = (au.gov.asic.types.fss.FssItemType.TaxCode)get_store().find_element_user(TAXCODE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "taxCode" element
     */
    public boolean isSetTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "taxCode" element
     */
    public void setTaxCode(java.lang.String taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXCODE$18);
            }
            target.setStringValue(taxCode);
        }
    }
    
    /**
     * Sets (as xml) the "taxCode" element
     */
    public void xsetTaxCode(au.gov.asic.types.fss.FssItemType.TaxCode taxCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.TaxCode target = null;
            target = (au.gov.asic.types.fss.FssItemType.TaxCode)get_store().find_element_user(TAXCODE$18, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssItemType.TaxCode)get_store().add_element_user(TAXCODE$18);
            }
            target.set(taxCode);
        }
    }
    
    /**
     * Unsets the "taxCode" element
     */
    public void unsetTaxCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXCODE$18, 0);
        }
    }
    
    /**
     * Gets the "channel" element
     */
    public au.gov.asic.types.fss.FssItemType.Channel.Enum getChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$20, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.fss.FssItemType.Channel.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "channel" element
     */
    public au.gov.asic.types.fss.FssItemType.Channel xgetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.Channel target = null;
            target = (au.gov.asic.types.fss.FssItemType.Channel)get_store().find_element_user(CHANNEL$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "channel" element
     */
    public void setChannel(au.gov.asic.types.fss.FssItemType.Channel.Enum channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNEL$20);
            }
            target.setEnumValue(channel);
        }
    }
    
    /**
     * Sets (as xml) the "channel" element
     */
    public void xsetChannel(au.gov.asic.types.fss.FssItemType.Channel channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.Channel target = null;
            target = (au.gov.asic.types.fss.FssItemType.Channel)get_store().find_element_user(CHANNEL$20, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssItemType.Channel)get_store().add_element_user(CHANNEL$20);
            }
            target.set(channel);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public au.gov.asic.types.fss.FssItemType.Quantity.Enum getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$22, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.fss.FssItemType.Quantity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantity" element
     */
    public au.gov.asic.types.fss.FssItemType.Quantity xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.Quantity target = null;
            target = (au.gov.asic.types.fss.FssItemType.Quantity)get_store().find_element_user(QUANTITY$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$22) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(au.gov.asic.types.fss.FssItemType.Quantity.Enum quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$22);
            }
            target.setEnumValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "quantity" element
     */
    public void xsetQuantity(au.gov.asic.types.fss.FssItemType.Quantity quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.Quantity target = null;
            target = (au.gov.asic.types.fss.FssItemType.Quantity)get_store().find_element_user(QUANTITY$22, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssItemType.Quantity)get_store().add_element_user(QUANTITY$22);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$22, 0);
        }
    }
    
    /**
     * Gets the "suffix" element
     */
    public java.lang.String getSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suffix" element
     */
    public au.gov.asic.types.fss.FssItemType.Suffix xgetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.Suffix target = null;
            target = (au.gov.asic.types.fss.FssItemType.Suffix)get_store().find_element_user(SUFFIX$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "suffix" element
     */
    public boolean isSetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIX$24) != 0;
        }
    }
    
    /**
     * Sets the "suffix" element
     */
    public void setSuffix(java.lang.String suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUFFIX$24);
            }
            target.setStringValue(suffix);
        }
    }
    
    /**
     * Sets (as xml) the "suffix" element
     */
    public void xsetSuffix(au.gov.asic.types.fss.FssItemType.Suffix suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssItemType.Suffix target = null;
            target = (au.gov.asic.types.fss.FssItemType.Suffix)get_store().find_element_user(SUFFIX$24, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssItemType.Suffix)get_store().add_element_user(SUFFIX$24);
            }
            target.set(suffix);
        }
    }
    
    /**
     * Unsets the "suffix" element
     */
    public void unsetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIX$24, 0);
        }
    }
    /**
     * An XML taxCode(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$TaxCode.
     */
    public static class TaxCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssItemType.TaxCode
    {
        
        public TaxCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TaxCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML channel(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$Channel.
     */
    public static class ChannelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.fss.FssItemType.Channel
    {
        
        public ChannelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ChannelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML quantity(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$Quantity.
     */
    public static class QuantityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.fss.FssItemType.Quantity
    {
        
        public QuantityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected QuantityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML suffix(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssItemType$Suffix.
     */
    public static class SuffixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssItemType.Suffix
    {
        
        public SuffixImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SuffixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
