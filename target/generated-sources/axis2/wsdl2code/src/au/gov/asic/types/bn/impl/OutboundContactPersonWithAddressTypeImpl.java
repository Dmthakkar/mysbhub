/*
 * XML Type:  outboundContactPersonWithAddressType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.OutboundContactPersonWithAddressType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML outboundContactPersonWithAddressType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class OutboundContactPersonWithAddressTypeImpl extends au.gov.asic.types.bn.impl.OutboundContactPersonTypeImpl implements au.gov.asic.types.bn.OutboundContactPersonWithAddressType
{
    
    public OutboundContactPersonWithAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "address");
    
    
    /**
     * Gets the "address" element
     */
    public au.gov.asic.types.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(au.gov.asic.types.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public au.gov.asic.types.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AddressType target = null;
            target = (au.gov.asic.types.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, 0);
        }
    }
}
