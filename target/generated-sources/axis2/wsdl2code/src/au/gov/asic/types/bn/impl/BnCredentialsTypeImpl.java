/*
 * XML Type:  bnCredentialsType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnCredentialsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnCredentialsType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnCredentialsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnCredentialsType
{
    
    public BnCredentialsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "number");
    private static final javax.xml.namespace.QName KEY$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "key");
    
    
    /**
     * Gets the "number" element
     */
    public int getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" element
     */
    public au.gov.asic.types.NniNumberType xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(int number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
            }
            target.setIntValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" element
     */
    public void xsetNumber(au.gov.asic.types.NniNumberType number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "key" element
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key" element
     */
    public au.gov.asic.types.KeyType xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.KeyType target = null;
            target = (au.gov.asic.types.KeyType)get_store().find_element_user(KEY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$2);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "key" element
     */
    public void xsetKey(au.gov.asic.types.KeyType key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.KeyType target = null;
            target = (au.gov.asic.types.KeyType)get_store().find_element_user(KEY$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.KeyType)get_store().add_element_user(KEY$2);
            }
            target.set(key);
        }
    }
}
