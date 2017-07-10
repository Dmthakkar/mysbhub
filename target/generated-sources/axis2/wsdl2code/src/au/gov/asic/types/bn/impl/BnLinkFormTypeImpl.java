/*
 * XML Type:  bnLinkFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnLinkFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnLinkFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnLinkFormTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnLinkFormType
{
    
    public BnLinkFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "abn");
    private static final javax.xml.namespace.QName NNINUMBER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "nniNumber");
    private static final javax.xml.namespace.QName AGENT$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "agent");
    private static final javax.xml.namespace.QName ACTION$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "action");
    private static final javax.xml.namespace.QName SIGNATORY$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "signatory");
    private static final javax.xml.namespace.QName FILENOTES$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "fileNotes");
    
    
    /**
     * Gets the "abn" element
     */
    public java.lang.String getAbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
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
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
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
            return get_store().count_elements(ABN$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABN$0);
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
            target = (au.gov.asic.types.AbnType)get_store().find_element_user(ABN$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AbnType)get_store().add_element_user(ABN$0);
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
            get_store().remove_element(ABN$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$2, 0);
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
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$2, 0);
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
            return get_store().count_elements(NNINUMBER$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NNINUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NNINUMBER$2);
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
            target = (au.gov.asic.types.NniNumberType)get_store().find_element_user(NNINUMBER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NniNumberType)get_store().add_element_user(NNINUMBER$2);
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
            get_store().remove_element(NNINUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "agent" element
     */
    public au.gov.asic.types.AgentType getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentType target = null;
            target = (au.gov.asic.types.AgentType)get_store().find_element_user(AGENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(au.gov.asic.types.AgentType agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentType target = null;
            target = (au.gov.asic.types.AgentType)get_store().find_element_user(AGENT$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.AgentType)get_store().add_element_user(AGENT$4);
            }
            target.set(agent);
        }
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public au.gov.asic.types.AgentType addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.AgentType target = null;
            target = (au.gov.asic.types.AgentType)get_store().add_element_user(AGENT$4);
            return target;
        }
    }
    
    /**
     * Gets the "action" element
     */
    public au.gov.asic.types.bn.BnLinkFormType.Action.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.BnLinkFormType.Action.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" element
     */
    public au.gov.asic.types.bn.BnLinkFormType.Action xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnLinkFormType.Action target = null;
            target = (au.gov.asic.types.bn.BnLinkFormType.Action)get_store().find_element_user(ACTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(au.gov.asic.types.bn.BnLinkFormType.Action.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$6);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" element
     */
    public void xsetAction(au.gov.asic.types.bn.BnLinkFormType.Action action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnLinkFormType.Action target = null;
            target = (au.gov.asic.types.bn.BnLinkFormType.Action)get_store().find_element_user(ACTION$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnLinkFormType.Action)get_store().add_element_user(ACTION$6);
            }
            target.set(action);
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
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "signatory" element
     */
    public boolean isSetSignatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATORY$8) != 0;
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
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$8);
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
            target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "signatory" element
     */
    public void unsetSignatory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATORY$8, 0);
        }
    }
    
    /**
     * Gets the "fileNotes" element
     */
    public au.gov.asic.types.FileNotesType getFileNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType target = null;
            target = (au.gov.asic.types.FileNotesType)get_store().find_element_user(FILENOTES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileNotes" element
     */
    public boolean isSetFileNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENOTES$10) != 0;
        }
    }
    
    /**
     * Sets the "fileNotes" element
     */
    public void setFileNotes(au.gov.asic.types.FileNotesType fileNotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType target = null;
            target = (au.gov.asic.types.FileNotesType)get_store().find_element_user(FILENOTES$10, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.FileNotesType)get_store().add_element_user(FILENOTES$10);
            }
            target.set(fileNotes);
        }
    }
    
    /**
     * Appends and returns a new empty "fileNotes" element
     */
    public au.gov.asic.types.FileNotesType addNewFileNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.FileNotesType target = null;
            target = (au.gov.asic.types.FileNotesType)get_store().add_element_user(FILENOTES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "fileNotes" element
     */
    public void unsetFileNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENOTES$10, 0);
        }
    }
    /**
     * An XML action(@uri:bn.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.bn.BnLinkFormType$Action.
     */
    public static class ActionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.bn.BnLinkFormType.Action
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
}
