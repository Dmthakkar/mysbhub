/*
 * XML Type:  priceType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.PriceType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML priceType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class PriceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.PriceType
{
    
    public PriceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEE$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "fee");
    private static final javax.xml.namespace.QName TOTALAMOUNT$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "totalAmount");
    
    
    /**
     * Gets array of all "fee" elements
     */
    public au.gov.asic.types.fss.FeeWithAmountType[] getFeeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEE$0, targetList);
            au.gov.asic.types.fss.FeeWithAmountType[] result = new au.gov.asic.types.fss.FeeWithAmountType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fee" element
     */
    public au.gov.asic.types.fss.FeeWithAmountType getFeeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType)get_store().find_element_user(FEE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fee" element
     */
    public int sizeOfFeeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEE$0);
        }
    }
    
    /**
     * Sets array of all "fee" element
     */
    public void setFeeArray(au.gov.asic.types.fss.FeeWithAmountType[] feeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(feeArray, FEE$0);
        }
    }
    
    /**
     * Sets ith "fee" element
     */
    public void setFeeArray(int i, au.gov.asic.types.fss.FeeWithAmountType fee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType)get_store().find_element_user(FEE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fee);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fee" element
     */
    public au.gov.asic.types.fss.FeeWithAmountType insertNewFee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType)get_store().insert_element_user(FEE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fee" element
     */
    public au.gov.asic.types.fss.FeeWithAmountType addNewFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeWithAmountType target = null;
            target = (au.gov.asic.types.fss.FeeWithAmountType)get_store().add_element_user(FEE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "fee" element
     */
    public void removeFee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEE$0, i);
        }
    }
    
    /**
     * Gets the "totalAmount" element
     */
    public java.math.BigDecimal getTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalAmount" element
     */
    public au.gov.asic.types.AmountType xgetTotalAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALAMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totalAmount" element
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALAMOUNT$2);
            }
            target.setBigDecimalValue(totalAmount);
        }
    }
    
    /**
     * Sets (as xml) the "totalAmount" element
     */
    public void xsetTotalAmount(au.gov.asic.types.AmountType totalAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALAMOUNT$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TOTALAMOUNT$2);
            }
            target.set(totalAmount);
        }
    }
}
