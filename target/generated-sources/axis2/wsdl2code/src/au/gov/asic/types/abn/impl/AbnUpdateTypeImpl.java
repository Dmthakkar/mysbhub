/*
 * XML Type:  abnUpdateType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbnUpdateType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML abnUpdateType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AbnUpdateTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnUpdateType
{
    
    public AbnUpdateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "action");
    private static final javax.xml.namespace.QName ABNREFERENCENUMBER$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "abnReferenceNumber");
    private static final javax.xml.namespace.QName ABN$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName NNINUMBER$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "nniNumber");
    private static final javax.xml.namespace.QName ABRENTITY$8 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "abrEntity");
    
    
    /**
     * Gets the "action" element
     */
    public au.gov.asic.types.abn.AbnUpdateType.Action.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.abn.AbnUpdateType.Action.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" element
     */
    public au.gov.asic.types.abn.AbnUpdateType.Action xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnUpdateType.Action target = null;
            target = (au.gov.asic.types.abn.AbnUpdateType.Action)get_store().find_element_user(ACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(au.gov.asic.types.abn.AbnUpdateType.Action.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$0);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" element
     */
    public void xsetAction(au.gov.asic.types.abn.AbnUpdateType.Action action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnUpdateType.Action target = null;
            target = (au.gov.asic.types.abn.AbnUpdateType.Action)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbnUpdateType.Action)get_store().add_element_user(ACTION$0);
            }
            target.set(action);
        }
    }
    
    /**
     * Gets the "abnReferenceNumber" element
     */
    public long getAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "abnReferenceNumber" element
     */
    public au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber xgetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber target = null;
            target = (au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "abnReferenceNumber" element
     */
    public boolean isSetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABNREFERENCENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "abnReferenceNumber" element
     */
    public void setAbnReferenceNumber(long abnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABNREFERENCENUMBER$2);
            }
            target.setLongValue(abnReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "abnReferenceNumber" element
     */
    public void xsetAbnReferenceNumber(au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber abnReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber target = null;
            target = (au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber)get_store().find_element_user(ABNREFERENCENUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber)get_store().add_element_user(ABNREFERENCENUMBER$2);
            }
            target.set(abnReferenceNumber);
        }
    }
    
    /**
     * Unsets the "abnReferenceNumber" element
     */
    public void unsetAbnReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABNREFERENCENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abn" element
     */
    public au.gov.asic.types.AbnType xgetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "abn" element
     */
    public boolean isSetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$4) != 0;
        }
    }
    
    /**
     * Sets the "abn" element
     */
    public void setAbn(java.lang.String abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$4);
            }
            target.setStringValue(abn);
        }
    }
    
    /**
     * Sets (as xml) the "abn" element
     */
    public void xsetAbn(au.gov.asic.types.AbnType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AbnType target = null;
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$4);
            }
            target.set(abn);
        }
    }
    
    /**
     * Unsets the "abn" element
     */
    public void unsetAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$4, 0);
        }
    }
    
    /**
     * Gets the "nniNumber" element
     */
    public int getNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "nniNumber" element
     */
    public au.gov.asic.types.NniNumberType xgetNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "nniNumber" element
     */
    public boolean isSetNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NNINUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "nniNumber" element
     */
    public void setNniNumber(int nniNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$6);
            }
            target.setIntValue(nniNumber);
        }
    }
    
    /**
     * Sets (as xml) the "nniNumber" element
     */
    public void xsetNniNumber(au.gov.asic.types.NniNumberType nniNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NniNumberType target = null;
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(NNINUMBER$6);
            }
            target.set(nniNumber);
        }
    }
    
    /**
     * Unsets the "nniNumber" element
     */
    public void unsetNniNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NNINUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "abrEntity" element
     */
    public au.gov.asic.types.abn.BaseAbrEntityType getAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.BaseAbrEntityType target = null;
            target = (au.gov.asic.types.abn.BaseAbrEntityType)get_store().find_element_user(ABRENTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abrEntity" element
     */
    public boolean isSetAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABRENTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "abrEntity" element
     */
    public void setAbrEntity(au.gov.asic.types.abn.BaseAbrEntityType abrEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.BaseAbrEntityType target = null;
            target = (au.gov.asic.types.abn.BaseAbrEntityType)get_store().find_element_user(ABRENTITY$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.BaseAbrEntityType)get_store().add_element_user(ABRENTITY$8);
            }
            target.set(abrEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "abrEntity" element
     */
    public au.gov.asic.types.abn.BaseAbrEntityType addNewAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.BaseAbrEntityType target = null;
            target = (au.gov.asic.types.abn.BaseAbrEntityType)get_store().add_element_user(ABRENTITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "abrEntity" element
     */
    public void unsetAbrEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABRENTITY$8, 0);
        }
    }
    /**
     * An XML action(@uri:abn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.abn.AbnUpdateType$Action.
     */
    public static class ActionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.abn.AbnUpdateType.Action
    {
        
        public ActionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ActionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML abnReferenceNumber(@uri:abn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.abn.AbnUpdateType$AbnReferenceNumber.
     */
    public static class AbnReferenceNumberImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements au.gov.asic.types.abn.AbnUpdateType.AbnReferenceNumber
    {
        
        public AbnReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AbnReferenceNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
