/*
 * XML Type:  transactionsType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.TransactionsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML transactionsType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class TransactionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.TransactionsType
{
    
    public TransactionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTION$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "transaction");
    private static final javax.xml.namespace.QName TOTAL$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "total");
    private static final javax.xml.namespace.QName DATEDUE$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateDue");
    
    
    /**
     * Gets array of all "transaction" elements
     */
    public au.gov.asic.types.fss.TransactionType[] getTransactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSACTION$0, targetList);
            au.gov.asic.types.fss.TransactionType[] result = new au.gov.asic.types.fss.TransactionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transaction" element
     */
    public au.gov.asic.types.fss.TransactionType getTransactionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType target = null;
            target = (au.gov.asic.types.fss.TransactionType)get_store().find_element_user(TRANSACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transaction" element
     */
    public int sizeOfTransactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTION$0);
        }
    }
    
    /**
     * Sets array of all "transaction" element
     */
    public void setTransactionArray(au.gov.asic.types.fss.TransactionType[] transactionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transactionArray, TRANSACTION$0);
        }
    }
    
    /**
     * Sets ith "transaction" element
     */
    public void setTransactionArray(int i, au.gov.asic.types.fss.TransactionType transaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType target = null;
            target = (au.gov.asic.types.fss.TransactionType)get_store().find_element_user(TRANSACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transaction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transaction" element
     */
    public au.gov.asic.types.fss.TransactionType insertNewTransaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType target = null;
            target = (au.gov.asic.types.fss.TransactionType)get_store().insert_element_user(TRANSACTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transaction" element
     */
    public au.gov.asic.types.fss.TransactionType addNewTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.TransactionType target = null;
            target = (au.gov.asic.types.fss.TransactionType)get_store().add_element_user(TRANSACTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "transaction" element
     */
    public void removeTransaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTION$0, i);
        }
    }
    
    /**
     * Gets the "total" element
     */
    public java.math.BigDecimal getTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "total" element
     */
    public au.gov.asic.types.AmountType xgetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTAL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "total" element
     */
    public void setTotal(java.math.BigDecimal total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTAL$2);
            }
            target.setBigDecimalValue(total);
        }
    }
    
    /**
     * Sets (as xml) the "total" element
     */
    public void xsetTotal(au.gov.asic.types.AmountType total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTAL$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TOTAL$2);
            }
            target.set(total);
        }
    }
    
    /**
     * Gets the "dateDue" element
     */
    public java.util.Calendar getDateDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateDue" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDUE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateDue" element
     */
    public boolean isSetDateDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEDUE$4) != 0;
        }
    }
    
    /**
     * Sets the "dateDue" element
     */
    public void setDateDue(java.util.Calendar dateDue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEDUE$4);
            }
            target.setCalendarValue(dateDue);
        }
    }
    
    /**
     * Sets (as xml) the "dateDue" element
     */
    public void xsetDateDue(org.apache.xmlbeans.XmlDate dateDue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEDUE$4);
            }
            target.set(dateDue);
        }
    }
    
    /**
     * Unsets the "dateDue" element
     */
    public void unsetDateDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEDUE$4, 0);
        }
    }
}
