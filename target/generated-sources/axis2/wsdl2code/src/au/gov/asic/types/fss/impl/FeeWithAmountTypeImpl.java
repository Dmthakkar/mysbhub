/*
 * XML Type:  feeWithAmountType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FeeWithAmountType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML feeWithAmountType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FeeWithAmountTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeeWithAmountType
{
    
    public FeeWithAmountTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "type");
    private static final javax.xml.namespace.QName SUBTYPE$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "subType");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName AMOUNT$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "amount");
    
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public au.gov.asic.types.fss.FeeWithAmountType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType.Type target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType.Type)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
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
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(au.gov.asic.types.fss.FeeWithAmountType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType.Type target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType.Type)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeWithAmountType.Type)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "subType" element
     */
    public java.lang.String getSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subType" element
     */
    public au.gov.asic.types.fss.FeeWithAmountType.SubType xgetSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType.SubType target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType.SubType)get_store().find_element_user(SUBTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "subType" element
     */
    public boolean isSetSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "subType" element
     */
    public void setSubType(java.lang.String subType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTYPE$2);
            }
            target.setStringValue(subType);
        }
    }
    
    /**
     * Sets (as xml) the "subType" element
     */
    public void xsetSubType(au.gov.asic.types.fss.FeeWithAmountType.SubType subType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType.SubType target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType.SubType)get_store().find_element_user(SUBTYPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeWithAmountType.SubType)get_store().add_element_user(SUBTYPE$2);
            }
            target.set(subType);
        }
    }
    
    /**
     * Unsets the "subType" element
     */
    public void unsetSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBTYPE$2, 0);
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
    public au.gov.asic.types.fss.FeeWithAmountType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType.Description target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
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
    public void xsetDescription(au.gov.asic.types.fss.FeeWithAmountType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType.Description target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType.Description)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeWithAmountType.Description)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$6, 0);
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
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$6);
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
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(AMOUNT$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(AMOUNT$6);
            }
            target.set(amount);
        }
    }
    /**
     * An XML type(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeeWithAmountType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeeWithAmountType.Type
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
     * An XML subType(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeeWithAmountType$SubType.
     */
    public static class SubTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeeWithAmountType.SubType
    {
        
        public SubTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SubTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML description(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeeWithAmountType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeeWithAmountType.Description
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
}
