/*
 * XML Type:  streetType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.StreetType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML streetType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class StreetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.StreetType
{
    
    public StreetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETNUMBER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "streetNumber");
    private static final javax.xml.namespace.QName STREETNAME$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "streetName");
    private static final javax.xml.namespace.QName STREETTYPE$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "streetType");
    
    
    /**
     * Gets the "streetNumber" element
     */
    public java.lang.String getStreetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "streetNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetStreetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "streetNumber" element
     */
    public void setStreetNumber(java.lang.String streetNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETNUMBER$0);
            }
            target.setStringValue(streetNumber);
        }
    }
    
    /**
     * Sets (as xml) the "streetNumber" element
     */
    public void xsetStreetNumber(org.apache.xmlbeans.XmlString streetNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETNUMBER$0);
            }
            target.set(streetNumber);
        }
    }
    
    /**
     * Gets the "streetName" element
     */
    public java.lang.String getStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "streetName" element
     */
    public org.apache.xmlbeans.XmlString xgetStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "streetName" element
     */
    public void setStreetName(java.lang.String streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETNAME$2);
            }
            target.setStringValue(streetName);
        }
    }
    
    /**
     * Sets (as xml) the "streetName" element
     */
    public void xsetStreetName(org.apache.xmlbeans.XmlString streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETNAME$2);
            }
            target.set(streetName);
        }
    }
    
    /**
     * Gets the "streetType" element
     */
    public java.lang.String getStreetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "streetType" element
     */
    public org.apache.xmlbeans.XmlString xgetStreetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "streetType" element
     */
    public void setStreetType(java.lang.String streetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETTYPE$4);
            }
            target.setStringValue(streetType);
        }
    }
    
    /**
     * Sets (as xml) the "streetType" element
     */
    public void xsetStreetType(org.apache.xmlbeans.XmlString streetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETTYPE$4);
            }
            target.set(streetType);
        }
    }
}
