/*
 * XML Type:  bnCancelFormType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.BnCancelFormType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML bnCancelFormType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class BnCancelFormTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.BnCancelFormType
{
    
    public BnCancelFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSNAME$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "businessName");
    private static final javax.xml.namespace.QName TRANSFER$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "transfer");
    private static final javax.xml.namespace.QName SIGNATORY$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "signatory");
    private static final javax.xml.namespace.QName FILENOTES$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "fileNotes");
    private static final javax.xml.namespace.QName RETURNEXTRACT$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "returnExtract");
    
    
    /**
     * Gets the "businessName" element
     */
    public au.gov.asic.types.bn.BnIdentifier getBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnIdentifier target = null;
            target = (au.gov.asic.types.bn.BnIdentifier)get_store().find_element_user(BUSINESSNAME$0, 0);
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
    public void setBusinessName(au.gov.asic.types.bn.BnIdentifier businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnIdentifier target = null;
            target = (au.gov.asic.types.bn.BnIdentifier)get_store().find_element_user(BUSINESSNAME$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnIdentifier)get_store().add_element_user(BUSINESSNAME$0);
            }
            target.set(businessName);
        }
    }
    
    /**
     * Appends and returns a new empty "businessName" element
     */
    public au.gov.asic.types.bn.BnIdentifier addNewBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnIdentifier target = null;
            target = (au.gov.asic.types.bn.BnIdentifier)get_store().add_element_user(BUSINESSNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "transfer" element
     */
    public boolean getTransfer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFER$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transfer" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransfer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRANSFER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "transfer" element
     */
    public boolean isSetTransfer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFER$2) != 0;
        }
    }
    
    /**
     * Sets the "transfer" element
     */
    public void setTransfer(boolean transfer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFER$2);
            }
            target.setBooleanValue(transfer);
        }
    }
    
    /**
     * Sets (as xml) the "transfer" element
     */
    public void xsetTransfer(org.apache.xmlbeans.XmlBoolean transfer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRANSFER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRANSFER$2);
            }
            target.set(transfer);
        }
    }
    
    /**
     * Unsets the "transfer" element
     */
    public void unsetTransfer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFER$2, 0);
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
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$4, 0);
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
            return get_store().count_elements(SIGNATORY$4) != 0;
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
            target = (au.gov.asic.types.SignatoryType)get_store().find_element_user(SIGNATORY$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$4);
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
            target = (au.gov.asic.types.SignatoryType)get_store().add_element_user(SIGNATORY$4);
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
            get_store().remove_element(SIGNATORY$4, 0);
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
            target = (au.gov.asic.types.FileNotesType)get_store().find_element_user(FILENOTES$6, 0);
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
            return get_store().count_elements(FILENOTES$6) != 0;
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
            target = (au.gov.asic.types.FileNotesType)get_store().find_element_user(FILENOTES$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.FileNotesType)get_store().add_element_user(FILENOTES$6);
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
            target = (au.gov.asic.types.FileNotesType)get_store().add_element_user(FILENOTES$6);
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
            get_store().remove_element(FILENOTES$6, 0);
        }
    }
    
    /**
     * Gets the "returnExtract" element
     */
    public boolean getReturnExtract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNEXTRACT$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "returnExtract" element
     */
    public au.gov.asic.types.TrueType xgetReturnExtract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(RETURNEXTRACT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "returnExtract" element
     */
    public boolean isSetReturnExtract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURNEXTRACT$8) != 0;
        }
    }
    
    /**
     * Sets the "returnExtract" element
     */
    public void setReturnExtract(boolean returnExtract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNEXTRACT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNEXTRACT$8);
            }
            target.setBooleanValue(returnExtract);
        }
    }
    
    /**
     * Sets (as xml) the "returnExtract" element
     */
    public void xsetReturnExtract(au.gov.asic.types.TrueType returnExtract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.TrueType target = null;
            target = (au.gov.asic.types.TrueType)get_store().find_element_user(RETURNEXTRACT$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.TrueType)get_store().add_element_user(RETURNEXTRACT$8);
            }
            target.set(returnExtract);
        }
    }
    
    /**
     * Unsets the "returnExtract" element
     */
    public void unsetReturnExtract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURNEXTRACT$8, 0);
        }
    }
}
