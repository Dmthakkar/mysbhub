/*
 * XML Type:  feeType
 * Namespace: uri:fss.types.asic.gov.au
 * Java type: au.gov.asic.types.fss.FeeType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.fss.impl;
/**
 * An XML feeType(@uri:fss.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class FeeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.fss.FeeType
{
    
    public FeeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEETYPE$0 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "feeType");
    private static final javax.xml.namespace.QName FEESUBTYPE$2 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "feeSubType");
    private static final javax.xml.namespace.QName FEEDESCRIPTION$4 = 
        new javax.xml.namespace.QName("uri:fss.types.asic.gov.au", "feeDescription");
    
    
    /**
     * Gets the "feeType" element
     */
    public java.lang.String getFeeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "feeType" element
     */
    public au.gov.asic.types.fss.FeeType.FeeType2 xgetFeeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType.FeeType2 target = null;
            target = (au.gov.asic.types.fss.FeeType.FeeType2)get_store().find_element_user(FEETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "feeType" element
     */
    public void setFeeType(java.lang.String feeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEETYPE$0);
            }
            target.setStringValue(feeType);
        }
    }
    
    /**
     * Sets (as xml) the "feeType" element
     */
    public void xsetFeeType(au.gov.asic.types.fss.FeeType.FeeType2 feeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType.FeeType2 target = null;
            target = (au.gov.asic.types.fss.FeeType.FeeType2)get_store().find_element_user(FEETYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeType.FeeType2)get_store().add_element_user(FEETYPE$0);
            }
            target.set(feeType);
        }
    }
    
    /**
     * Gets the "feeSubType" element
     */
    public java.lang.String getFeeSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEESUBTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "feeSubType" element
     */
    public au.gov.asic.types.fss.FeeType.FeeSubType xgetFeeSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType.FeeSubType target = null;
            target = (au.gov.asic.types.fss.FeeType.FeeSubType)get_store().find_element_user(FEESUBTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "feeSubType" element
     */
    public boolean isSetFeeSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEESUBTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "feeSubType" element
     */
    public void setFeeSubType(java.lang.String feeSubType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEESUBTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEESUBTYPE$2);
            }
            target.setStringValue(feeSubType);
        }
    }
    
    /**
     * Sets (as xml) the "feeSubType" element
     */
    public void xsetFeeSubType(au.gov.asic.types.fss.FeeType.FeeSubType feeSubType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType.FeeSubType target = null;
            target = (au.gov.asic.types.fss.FeeType.FeeSubType)get_store().find_element_user(FEESUBTYPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeType.FeeSubType)get_store().add_element_user(FEESUBTYPE$2);
            }
            target.set(feeSubType);
        }
    }
    
    /**
     * Unsets the "feeSubType" element
     */
    public void unsetFeeSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEESUBTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "feeDescription" element
     */
    public java.lang.String getFeeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEEDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "feeDescription" element
     */
    public au.gov.asic.types.fss.FeeType.FeeDescription xgetFeeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType.FeeDescription target = null;
            target = (au.gov.asic.types.fss.FeeType.FeeDescription)get_store().find_element_user(FEEDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "feeDescription" element
     */
    public boolean isSetFeeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEEDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "feeDescription" element
     */
    public void setFeeDescription(java.lang.String feeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEEDESCRIPTION$4);
            }
            target.setStringValue(feeDescription);
        }
    }
    
    /**
     * Sets (as xml) the "feeDescription" element
     */
    public void xsetFeeDescription(au.gov.asic.types.fss.FeeType.FeeDescription feeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.fss.FeeType.FeeDescription target = null;
            target = (au.gov.asic.types.fss.FeeType.FeeDescription)get_store().find_element_user(FEEDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.fss.FeeType.FeeDescription)get_store().add_element_user(FEEDESCRIPTION$4);
            }
            target.set(feeDescription);
        }
    }
    
    /**
     * Unsets the "feeDescription" element
     */
    public void unsetFeeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEEDESCRIPTION$4, 0);
        }
    }
    /**
     * An XML feeType(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeeType$FeeType2.
     */
    public static class FeeTypeImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeeType.FeeType2
    {
        
        public FeeTypeImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FeeTypeImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML feeSubType(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeeType$FeeSubType.
     */
    public static class FeeSubTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeeType.FeeSubType
    {
        
        public FeeSubTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FeeSubTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML feeDescription(@uri:fss.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.fss.FeeType$FeeDescription.
     */
    public static class FeeDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.fss.FeeType.FeeDescription
    {
        
        public FeeDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FeeDescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
