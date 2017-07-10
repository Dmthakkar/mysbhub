/*
 * XML Type:  transactionType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.TransactionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML transactionType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TransactionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.TransactionType
{
    
    public TransactionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGPARTY$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "reportingParty");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "date");
    private static final javax.xml.namespace.QName CODE$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName DESCRIPTIONLINE1$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "descriptionLine1");
    private static final javax.xml.namespace.QName DESCRIPTIONLINE2$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "descriptionLine2");
    private static final javax.xml.namespace.QName REFERENCE$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "reference");
    private static final javax.xml.namespace.QName AMOUNT$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "amount");
    
    
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
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlDate xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$2);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlDate date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$2);
            }
            target.set(date);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.fss.TransactionType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.Code target = null;
            target = (au.gov.asic.types.fss.TransactionType.Code)get_store().find_element_user(CODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$4) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$4);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(au.gov.asic.types.fss.TransactionType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.Code target = null;
            target = (au.gov.asic.types.fss.TransactionType.Code)get_store().find_element_user(CODE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionType.Code)get_store().add_element_user(CODE$4);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$4, 0);
        }
    }
    
    /**
     * Gets the "descriptionLine1" element
     */
    public java.lang.String getDescriptionLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONLINE1$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptionLine1" element
     */
    public au.gov.asic.types.fss.TransactionType.DescriptionLine1 xgetDescriptionLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.DescriptionLine1 target = null;
            target = (au.gov.asic.types.fss.TransactionType.DescriptionLine1)get_store().find_element_user(DESCRIPTIONLINE1$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "descriptionLine1" element
     */
    public void setDescriptionLine1(java.lang.String descriptionLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONLINE1$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONLINE1$6);
            }
            target.setStringValue(descriptionLine1);
        }
    }
    
    /**
     * Sets (as xml) the "descriptionLine1" element
     */
    public void xsetDescriptionLine1(au.gov.asic.types.fss.TransactionType.DescriptionLine1 descriptionLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.DescriptionLine1 target = null;
            target = (au.gov.asic.types.fss.TransactionType.DescriptionLine1)get_store().find_element_user(DESCRIPTIONLINE1$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionType.DescriptionLine1)get_store().add_element_user(DESCRIPTIONLINE1$6);
            }
            target.set(descriptionLine1);
        }
    }
    
    /**
     * Gets the "descriptionLine2" element
     */
    public java.lang.String getDescriptionLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONLINE2$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptionLine2" element
     */
    public au.gov.asic.types.fss.TransactionType.DescriptionLine2 xgetDescriptionLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.DescriptionLine2 target = null;
            target = (au.gov.asic.types.fss.TransactionType.DescriptionLine2)get_store().find_element_user(DESCRIPTIONLINE2$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "descriptionLine2" element
     */
    public boolean isSetDescriptionLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIONLINE2$8) != 0;
        }
    }
    
    /**
     * Sets the "descriptionLine2" element
     */
    public void setDescriptionLine2(java.lang.String descriptionLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONLINE2$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONLINE2$8);
            }
            target.setStringValue(descriptionLine2);
        }
    }
    
    /**
     * Sets (as xml) the "descriptionLine2" element
     */
    public void xsetDescriptionLine2(au.gov.asic.types.fss.TransactionType.DescriptionLine2 descriptionLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.DescriptionLine2 target = null;
            target = (au.gov.asic.types.fss.TransactionType.DescriptionLine2)get_store().find_element_user(DESCRIPTIONLINE2$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionType.DescriptionLine2)get_store().add_element_user(DESCRIPTIONLINE2$8);
            }
            target.set(descriptionLine2);
        }
    }
    
    /**
     * Unsets the "descriptionLine2" element
     */
    public void unsetDescriptionLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIONLINE2$8, 0);
        }
    }
    
    /**
     * Gets the "reference" element
     */
    public java.lang.String getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reference" element
     */
    public au.gov.asic.types.fss.TransactionType.Reference xgetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.Reference target = null;
            target = (au.gov.asic.types.fss.TransactionType.Reference)get_store().find_element_user(REFERENCE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(java.lang.String reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCE$10);
            }
            target.setStringValue(reference);
        }
    }
    
    /**
     * Sets (as xml) the "reference" element
     */
    public void xsetReference(au.gov.asic.types.fss.TransactionType.Reference reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType.Reference target = null;
            target = (au.gov.asic.types.fss.TransactionType.Reference)get_store().find_element_user(REFERENCE$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.TransactionType.Reference)get_store().add_element_user(REFERENCE$10);
            }
            target.set(reference);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$12, 0);
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
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$12, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$12);
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
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(AMOUNT$12);
            }
            target.set(amount);
        }
    }
    /**
     * An XML code(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.TransactionType.Code
    {
        
        public CodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML descriptionLine1(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$DescriptionLine1.
     */
    public static class DescriptionLine1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.TransactionType.DescriptionLine1
    {
        
        public DescriptionLine1Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionLine1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML descriptionLine2(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$DescriptionLine2.
     */
    public static class DescriptionLine2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.TransactionType.DescriptionLine2
    {
        
        public DescriptionLine2Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionLine2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML reference(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.TransactionType$Reference.
     */
    public static class ReferenceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.TransactionType.Reference
    {
        
        public ReferenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ReferenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
