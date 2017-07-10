/*
 * XML Type:  renewalReplyDataType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.RenewalReplyDataType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML renewalReplyDataType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class RenewalReplyDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.RenewalReplyDataType
{
    
    public RenewalReplyDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BNNUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "bnNumber");
    private static final javax.xml.namespace.QName RENEWALRESULT$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "renewalResult");
    
    
    /**
     * Gets the "bnNumber" element
     */
    public int getBnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNNUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "bnNumber" element
     */
    public au.gov.asic.types.NniNumberType xgetBnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(BNNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bnNumber" element
     */
    public void setBnNumber(int bnNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BNNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BNNUMBER$0);
            }
            target.setIntValue(bnNumber);
        }
    }
    
    /**
     * Sets (as xml) the "bnNumber" element
     */
    public void xsetBnNumber(au.gov.asic.types.NniNumberType bnNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(BNNUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(BNNUMBER$0);
            }
            target.set(bnNumber);
        }
    }
    
    /**
     * Gets the "renewalResult" element
     */
    public au.gov.asic.types.bn.RenewalResultType getRenewalResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RenewalResultType target = null;
            target = (au.gov.asic.types.bn.RenewalResultType)get_store().find_element_user(RENEWALRESULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "renewalResult" element
     */
    public void setRenewalResult(au.gov.asic.types.bn.RenewalResultType renewalResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RenewalResultType target = null;
            target = (au.gov.asic.types.bn.RenewalResultType)get_store().find_element_user(RENEWALRESULT$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.RenewalResultType)get_store().add_element_user(RENEWALRESULT$2);
            }
            target.set(renewalResult);
        }
    }
    
    /**
     * Appends and returns a new empty "renewalResult" element
     */
    public au.gov.asic.types.bn.RenewalResultType addNewRenewalResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.RenewalResultType target = null;
            target = (au.gov.asic.types.bn.RenewalResultType)get_store().add_element_user(RENEWALRESULT$2);
            return target;
        }
    }
}
