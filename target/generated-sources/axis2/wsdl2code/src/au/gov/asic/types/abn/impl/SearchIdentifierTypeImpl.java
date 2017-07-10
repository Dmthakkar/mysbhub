/*
 * XML Type:  searchIdentifierType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.SearchIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML searchIdentifierType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class SearchIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.SearchIdentifierType
{
    
    public SearchIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERTYPE$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "identifierType");
    private static final javax.xml.namespace.QName IDENTIFIERVALUE$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "identifierValue");
    private static final javax.xml.namespace.QName DATE$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "date");
    private static final javax.xml.namespace.QName HISTORY$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "history");
    
    
    /**
     * Gets the "identifierType" element
     */
    public java.lang.String getIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifierType" element
     */
    public au.gov.asic.types.abn.SearchIdentifierTypeCodeType xgetIdentifierType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.SearchIdentifierTypeCodeType target = null;
            target = (au.gov.asic.types.abn.SearchIdentifierTypeCodeType)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identifierType" element
     */
    public void setIdentifierType(java.lang.String identifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERTYPE$0);
            }
            target.setStringValue(identifierType);
        }
    }
    
    /**
     * Sets (as xml) the "identifierType" element
     */
    public void xsetIdentifierType(au.gov.asic.types.abn.SearchIdentifierTypeCodeType identifierType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.SearchIdentifierTypeCodeType target = null;
            target = (au.gov.asic.types.abn.SearchIdentifierTypeCodeType)get_store().find_element_user(IDENTIFIERTYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.SearchIdentifierTypeCodeType)get_store().add_element_user(IDENTIFIERTYPE$0);
            }
            target.set(identifierType);
        }
    }
    
    /**
     * Gets the "identifierValue" element
     */
    public java.lang.String getIdentifierValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifierValue" element
     */
    public au.gov.asic.types.abn.IdentifierValueType xgetIdentifierValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierValueType target = null;
            target = (au.gov.asic.types.abn.IdentifierValueType)get_store().find_element_user(IDENTIFIERVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "identifierValue" element
     */
    public void setIdentifierValue(java.lang.String identifierValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIERVALUE$2);
            }
            target.setStringValue(identifierValue);
        }
    }
    
    /**
     * Sets (as xml) the "identifierValue" element
     */
    public void xsetIdentifierValue(au.gov.asic.types.abn.IdentifierValueType identifierValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierValueType target = null;
            target = (au.gov.asic.types.abn.IdentifierValueType)get_store().find_element_user(IDENTIFIERVALUE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IdentifierValueType)get_store().add_element_user(IDENTIFIERVALUE$2);
            }
            target.set(identifierValue);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public au.gov.asic.types.abn.DateType xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(DATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$4) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$4);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(au.gov.asic.types.abn.DateType date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.DateType target = null;
            target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(DATE$4);
            }
            target.set(date);
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$4, 0);
        }
    }
    
    /**
     * Gets the "history" element
     */
    public java.lang.String getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "history" element
     */
    public au.gov.asic.types.abn.HistoryType xgetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.HistoryType target = null;
            target = (au.gov.asic.types.abn.HistoryType)get_store().find_element_user(HISTORY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "history" element
     */
    public boolean isSetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HISTORY$6) != 0;
        }
    }
    
    /**
     * Sets the "history" element
     */
    public void setHistory(java.lang.String history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HISTORY$6);
            }
            target.setStringValue(history);
        }
    }
    
    /**
     * Sets (as xml) the "history" element
     */
    public void xsetHistory(au.gov.asic.types.abn.HistoryType history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.HistoryType target = null;
            target = (au.gov.asic.types.abn.HistoryType)get_store().find_element_user(HISTORY$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.HistoryType)get_store().add_element_user(HISTORY$6);
            }
            target.set(history);
        }
    }
    
    /**
     * Unsets the "history" element
     */
    public void unsetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HISTORY$6, 0);
        }
    }
}
