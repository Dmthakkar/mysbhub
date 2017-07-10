/*
 * XML Type:  receiptType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.ReceiptType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML receiptType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ReceiptTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.ReceiptType
{
    
    public ReceiptTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBTOR$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "debtor");
    private static final javax.xml.namespace.QName DATEISSUED$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateIssued");
    private static final javax.xml.namespace.QName TRANSACTION$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "transaction");
    private static final javax.xml.namespace.QName TOTAL$6 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "total");
    private static final javax.xml.namespace.QName TOTALDUE$8 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "totalDue");
    private static final javax.xml.namespace.QName DATEDUE$10 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "dateDue");
    private static final javax.xml.namespace.QName ASICPAYMENTDETAILS$12 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "asicPaymentDetails");
    
    
    /**
     * Gets the "debtor" element
     */
    public au.gov.asic.types.fss.DebtorType getDebtor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType target = null;
            target = (au.gov.asic.types.fss.DebtorType)get_store().find_element_user(DEBTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "debtor" element
     */
    public void setDebtor(au.gov.asic.types.fss.DebtorType debtor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType target = null;
            target = (au.gov.asic.types.fss.DebtorType)get_store().find_element_user(DEBTOR$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.DebtorType)get_store().add_element_user(DEBTOR$0);
            }
            target.set(debtor);
        }
    }
    
    /**
     * Appends and returns a new empty "debtor" element
     */
    public au.gov.asic.types.fss.DebtorType addNewDebtor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.DebtorType target = null;
            target = (au.gov.asic.types.fss.DebtorType)get_store().add_element_user(DEBTOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "dateIssued" element
     */
    public java.util.Calendar getDateIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEISSUED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateIssued" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEISSUED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateIssued" element
     */
    public void setDateIssued(java.util.Calendar dateIssued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEISSUED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEISSUED$2);
            }
            target.setCalendarValue(dateIssued);
        }
    }
    
    /**
     * Sets (as xml) the "dateIssued" element
     */
    public void xsetDateIssued(org.apache.xmlbeans.XmlDate dateIssued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEISSUED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEISSUED$2);
            }
            target.set(dateIssued);
        }
    }
    
    /**
     * Gets array of all "transaction" elements
     */
    public au.gov.asic.types.fss.TransactionType[] getTransactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSACTION$4, targetList);
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
            target = (au.gov.asic.types.fss.TransactionType)get_store().find_element_user(TRANSACTION$4, i);
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
            return get_store().count_elements(TRANSACTION$4);
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
            arraySetterHelper(transactionArray, TRANSACTION$4);
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
            target = (au.gov.asic.types.fss.TransactionType)get_store().find_element_user(TRANSACTION$4, i);
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
            target = (au.gov.asic.types.fss.TransactionType)get_store().insert_element_user(TRANSACTION$4, i);
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
            target = (au.gov.asic.types.fss.TransactionType)get_store().add_element_user(TRANSACTION$4);
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
            get_store().remove_element(TRANSACTION$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$6, 0);
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
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTAL$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTAL$6);
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
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTAL$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TOTAL$6);
            }
            target.set(total);
        }
    }
    
    /**
     * Gets the "totalDue" element
     */
    public java.math.BigDecimal getTotalDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalDue" element
     */
    public au.gov.asic.types.AmountType xgetTotalDue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALDUE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totalDue" element
     */
    public void setTotalDue(java.math.BigDecimal totalDue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALDUE$8);
            }
            target.setBigDecimalValue(totalDue);
        }
    }
    
    /**
     * Sets (as xml) the "totalDue" element
     */
    public void xsetTotalDue(au.gov.asic.types.AmountType totalDue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AmountType target = null;
            target = (au.gov.asic.types.AmountType)get_store().find_element_user(TOTALDUE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AmountType)get_store().add_element_user(TOTALDUE$8);
            }
            target.set(totalDue);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDUE$10, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDUE$10, 0);
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
            return get_store().count_elements(DATEDUE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDUE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEDUE$10);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEDUE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEDUE$10);
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
            get_store().remove_element(DATEDUE$10, 0);
        }
    }
    
    /**
     * Gets the "asicPaymentDetails" element
     */
    public au.gov.asic.types.fss.AsicPaymentDetailsType getAsicPaymentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.AsicPaymentDetailsType target = null;
            target = (au.gov.asic.types.fss.AsicPaymentDetailsType)get_store().find_element_user(ASICPAYMENTDETAILS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "asicPaymentDetails" element
     */
    public boolean isSetAsicPaymentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASICPAYMENTDETAILS$12) != 0;
        }
    }
    
    /**
     * Sets the "asicPaymentDetails" element
     */
    public void setAsicPaymentDetails(au.gov.asic.types.fss.AsicPaymentDetailsType asicPaymentDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.AsicPaymentDetailsType target = null;
            target = (au.gov.asic.types.fss.AsicPaymentDetailsType)get_store().find_element_user(ASICPAYMENTDETAILS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.AsicPaymentDetailsType)get_store().add_element_user(ASICPAYMENTDETAILS$12);
            }
            target.set(asicPaymentDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "asicPaymentDetails" element
     */
    public au.gov.asic.types.fss.AsicPaymentDetailsType addNewAsicPaymentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.AsicPaymentDetailsType target = null;
            target = (au.gov.asic.types.fss.AsicPaymentDetailsType)get_store().add_element_user(ASICPAYMENTDETAILS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "asicPaymentDetails" element
     */
    public void unsetAsicPaymentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASICPAYMENTDETAILS$12, 0);
        }
    }
}
