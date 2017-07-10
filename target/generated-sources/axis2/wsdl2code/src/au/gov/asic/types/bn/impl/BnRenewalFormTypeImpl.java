/*
 * XML Type:  bnRenewalFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnRenewalFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnRenewalFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnRenewalFormTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnRenewalFormType
{
    
    public BnRenewalFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTNUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "accountNumber");
    private static final javax.xml.namespace.QName ABN$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "ABN");
    private static final javax.xml.namespace.QName TRANSACTIONID$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "transactionId");
    private static final javax.xml.namespace.QName BUSINESSNAME$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessName");
    private static final javax.xml.namespace.QName TERM$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "term");
    private static final javax.xml.namespace.QName PAYMENTTYPE$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "paymentType");
    private static final javax.xml.namespace.QName EMAILADDRESS$12 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "emailAddress");
    private static final javax.xml.namespace.QName SIGNATORY$14 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "signatory");
    
    
    /**
     * Gets the "accountNumber" element
     */
    public long getAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "accountNumber" element
     */
    public au.gov.asic.types.AccountNumberType xgetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AccountNumberType target = null;
            target = (au.gov.asic.types.AccountNumberType)get_store().find_element_user(ACCOUNTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "accountNumber" element
     */
    public boolean isSetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTNUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "accountNumber" element
     */
    public void setAccountNumber(long accountNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTNUMBER$0);
            }
            target.setLongValue(accountNumber);
        }
    }
    
    /**
     * Sets (as xml) the "accountNumber" element
     */
    public void xsetAccountNumber(au.gov.asic.types.AccountNumberType accountNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AccountNumberType target = null;
            target = (au.gov.asic.types.AccountNumberType)get_store().find_element_user(ACCOUNTNUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AccountNumberType)get_store().add_element_user(ACCOUNTNUMBER$0);
            }
            target.set(accountNumber);
        }
    }
    
    /**
     * Unsets the "accountNumber" element
     */
    public void unsetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTNUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "ABN" element
     */
    public java.lang.String getABN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ABN" element
     */
    public au.gov.asic.types.AbnType xgetABN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ABN" element
     */
    public boolean isSetABN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$2) != 0;
        }
    }
    
    /**
     * Sets the "ABN" element
     */
    public void setABN(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$2);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "ABN" element
     */
    public void xsetABN(au.gov.asic.types.AbnType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$2);
            }
            target.set(abn);
        }
    }
    
    /**
     * Unsets the "ABN" element
     */
    public void unsetABN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$2, 0);
        }
    }
    
    /**
     * Gets the "transactionId" element
     */
    public java.lang.String getTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transactionId" element
     */
    public au.gov.asic.types.TransactionIdType xgetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TransactionIdType target = null;
            target = (au.gov.asic.types.TransactionIdType)get_store().find_element_user(TRANSACTIONID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "transactionId" element
     */
    public boolean isSetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONID$4) != 0;
        }
    }
    
    /**
     * Sets the "transactionId" element
     */
    public void setTransactionId(java.lang.String transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$4);
            }
            target.setStringValue(transactionId);
        }
    }
    
    /**
     * Sets (as xml) the "transactionId" element
     */
    public void xsetTransactionId(au.gov.asic.types.TransactionIdType transactionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TransactionIdType target = null;
            target = (au.gov.asic.types.TransactionIdType)get_store().find_element_user(TRANSACTIONID$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TransactionIdType)get_store().add_element_user(TRANSACTIONID$4);
            }
            target.set(transactionId);
        }
    }
    
    /**
     * Unsets the "transactionId" element
     */
    public void unsetTransactionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONID$4, 0);
        }
    }
    
    /**
     * Gets the "businessName" element
     */
    public au.gov.asic.types.DistinguishedNameType getBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(BUSINESSNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessName" element
     */
    public void setBusinessName(au.gov.asic.types.DistinguishedNameType businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().find_element_user(BUSINESSNAME$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(BUSINESSNAME$6);
            }
            target.set(businessName);
        }
    }
    
    /**
     * Appends and returns a new empty "businessName" element
     */
    public au.gov.asic.types.DistinguishedNameType addNewBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DistinguishedNameType target = null;
            target = (au.gov.asic.types.DistinguishedNameType)get_store().add_element_user(BUSINESSNAME$6);
            return target;
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
     * Gets the "paymentType" element
     */
    public au.gov.asic.types.PaymentMethodType.Enum getPaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.PaymentMethodType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paymentType" element
     */
    public au.gov.asic.types.PaymentMethodType xgetPaymentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PaymentMethodType target = null;
            target = (au.gov.asic.types.PaymentMethodType)get_store().find_element_user(PAYMENTTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "paymentType" element
     */
    public void setPaymentType(au.gov.asic.types.PaymentMethodType.Enum paymentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTTYPE$10);
            }
            target.setEnumValue(paymentType);
        }
    }
    
    /**
     * Sets (as xml) the "paymentType" element
     */
    public void xsetPaymentType(au.gov.asic.types.PaymentMethodType paymentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.PaymentMethodType target = null;
            target = (au.gov.asic.types.PaymentMethodType)get_store().find_element_user(PAYMENTTYPE$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.PaymentMethodType)get_store().add_element_user(PAYMENTTYPE$10);
            }
            target.set(paymentType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$12, 0);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "emailAddress" element
     */
    public boolean isNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$12);
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
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$12);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Nils the "emailAddress" element
     */
    public void setNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.EmailType target = null;
            target = (au.gov.asic.types.EmailType)get_store().find_element_user(EMAILADDRESS$12, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.EmailType)get_store().add_element_user(EMAILADDRESS$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "signatory" element
     */
    public au.gov.asic.types.SignatoryType getSignatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType target = null;
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signatory" element
     */
    public void setSignatory(au.gov.asic.types.SignatoryType signatory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType target = null;
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$14, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$14);
            }
            target.set(signatory);
        }
    }
    
    /**
     * Appends and returns a new empty "signatory" element
     */
    public au.gov.asic.types.SignatoryType addNewSignatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.SignatoryType target = null;
            target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$14);
            return target;
        }
    }
}
