/*
 * XML Type:  fssTransactionType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FssTransactionType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML fssTransactionType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FssTransactionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FssTransactionType
{
    
    public FssTransactionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUEDATE$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dueDate");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName REFERENCEID$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "referenceId");
    private static final javax.xml.namespace.QName ALLOCATIONREFERENCE$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "allocationReference");
    private static final javax.xml.namespace.QName ORIGINALAMOUNT$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "originalAmount");
    private static final javax.xml.namespace.QName OUTSTANDINGAMOUNT$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "outstandingAmount");
    
    
    /**
     * Gets the "dueDate" element
     */
    public java.util.Calendar getDueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dueDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetDueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DUEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dueDate" element
     */
    public void setDueDate(java.util.Calendar dueDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DUEDATE$0);
            }
            target.setCalendarValue(dueDate);
        }
    }
    
    /**
     * Sets (as xml) the "dueDate" element
     */
    public void xsetDueDate(org.apache.xmlbeans.XmlDate dueDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DUEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DUEDATE$0);
            }
            target.set(dueDate);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public au.gov.asic.types.fss.FssTransactionType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.fss.FssTransactionType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public au.gov.asic.types.fss.FssTransactionType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.Type target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.Type)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(au.gov.asic.types.fss.FssTransactionType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(au.gov.asic.types.fss.FssTransactionType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.Type target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.Type)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssTransactionType.Type)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public au.gov.asic.types.fss.FssTransactionType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.Description target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(au.gov.asic.types.fss.FssTransactionType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.Description target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssTransactionType.Description)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "referenceId" element
     */
    public java.lang.String getReferenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceId" element
     */
    public au.gov.asic.types.fss.FssTransactionType.ReferenceId xgetReferenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.ReferenceId target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.ReferenceId)get_store().find_element_user(REFERENCEID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "referenceId" element
     */
    public void setReferenceId(java.lang.String referenceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEID$6);
            }
            target.setStringValue(referenceId);
        }
    }
    
    /**
     * Sets (as xml) the "referenceId" element
     */
    public void xsetReferenceId(au.gov.asic.types.fss.FssTransactionType.ReferenceId referenceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.ReferenceId target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.ReferenceId)get_store().find_element_user(REFERENCEID$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssTransactionType.ReferenceId)get_store().add_element_user(REFERENCEID$6);
            }
            target.set(referenceId);
        }
    }
    
    /**
     * Gets the "allocationReference" element
     */
    public java.lang.String getAllocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOCATIONREFERENCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "allocationReference" element
     */
    public au.gov.asic.types.fss.FssTransactionType.AllocationReference xgetAllocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.AllocationReference target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.AllocationReference)get_store().find_element_user(ALLOCATIONREFERENCE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "allocationReference" element
     */
    public boolean isSetAllocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOCATIONREFERENCE$8) != 0;
        }
    }
    
    /**
     * Sets the "allocationReference" element
     */
    public void setAllocationReference(java.lang.String allocationReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOCATIONREFERENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLOCATIONREFERENCE$8);
            }
            target.setStringValue(allocationReference);
        }
    }
    
    /**
     * Sets (as xml) the "allocationReference" element
     */
    public void xsetAllocationReference(au.gov.asic.types.fss.FssTransactionType.AllocationReference allocationReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FssTransactionType.AllocationReference target = null;
            target = (au.gov.asic.types.fss.FssTransactionType.AllocationReference)get_store().find_element_user(ALLOCATIONREFERENCE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FssTransactionType.AllocationReference)get_store().add_element_user(ALLOCATIONREFERENCE$8);
            }
            target.set(allocationReference);
        }
    }
    
    /**
     * Unsets the "allocationReference" element
     */
    public void unsetAllocationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOCATIONREFERENCE$8, 0);
        }
    }
    
    /**
     * Gets the "originalAmount" element
     */
    public java.math.BigDecimal getOriginalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALAMOUNT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "originalAmount" element
     */
    public au.gov.asic.types.AmountType xgetOriginalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(ORIGINALAMOUNT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "originalAmount" element
     */
    public void setOriginalAmount(java.math.BigDecimal originalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALAMOUNT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINALAMOUNT$10);
            }
            target.setBigDecimalValue(originalAmount);
        }
    }
    
    /**
     * Sets (as xml) the "originalAmount" element
     */
    public void xsetOriginalAmount(au.gov.asic.types.AmountType originalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(ORIGINALAMOUNT$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(ORIGINALAMOUNT$10);
            }
            target.set(originalAmount);
        }
    }
    
    /**
     * Gets the "outstandingAmount" element
     */
    public java.math.BigDecimal getOutstandingAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTSTANDINGAMOUNT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "outstandingAmount" element
     */
    public au.gov.asic.types.AmountType xgetOutstandingAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(OUTSTANDINGAMOUNT$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "outstandingAmount" element
     */
    public void setOutstandingAmount(java.math.BigDecimal outstandingAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTSTANDINGAMOUNT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTSTANDINGAMOUNT$12);
            }
            target.setBigDecimalValue(outstandingAmount);
        }
    }
    
    /**
     * Sets (as xml) the "outstandingAmount" element
     */
    public void xsetOutstandingAmount(au.gov.asic.types.AmountType outstandingAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(OUTSTANDINGAMOUNT$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(OUTSTANDINGAMOUNT$12);
            }
            target.set(outstandingAmount);
        }
    }
    /**
     * An XML type(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.fss.FssTransactionType.Type
    {
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML description(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssTransactionType.Description
    {
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML referenceId(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$ReferenceId.
     */
    public static class ReferenceIdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssTransactionType.ReferenceId
    {
        
        public ReferenceIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ReferenceIdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML allocationReference(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FssTransactionType$AllocationReference.
     */
    public static class AllocationReferenceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FssTransactionType.AllocationReference
    {
        
        public AllocationReferenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AllocationReferenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
