/*
 * XML Type:  nameAvailabilityResponseType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameAvailabilityResponseType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML nameAvailabilityResponseType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameAvailabilityResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.NameAvailabilityResponseType
{
    
    public NameAvailabilityResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "code");
    private static final javax.xml.namespace.QName SHORTDESCRIPTION$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "shortDescription");
    private static final javax.xml.namespace.QName LONGDESCRIPTION$4 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "longDescription");
    private static final javax.xml.namespace.QName OBJECTION$6 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "objection");
    
    
    /**
     * Gets the "code" element
     */
    public au.gov.asic.types.NameAvailabilityResponseType.Code.Enum getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.NameAvailabilityResponseType.Code.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.NameAvailabilityResponseType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType.Code target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType.Code)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(au.gov.asic.types.NameAvailabilityResponseType.Code.Enum code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setEnumValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(au.gov.asic.types.NameAvailabilityResponseType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType.Code target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameAvailabilityResponseType.Code)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "shortDescription" element
     */
    public java.lang.String getShortDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shortDescription" element
     */
    public au.gov.asic.types.NameAvailabilityResponseType.ShortDescription xgetShortDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType.ShortDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType.ShortDescription)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shortDescription" element
     */
    public void setShortDescription(java.lang.String shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTDESCRIPTION$2);
            }
            target.setStringValue(shortDescription);
        }
    }
    
    /**
     * Sets (as xml) the "shortDescription" element
     */
    public void xsetShortDescription(au.gov.asic.types.NameAvailabilityResponseType.ShortDescription shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType.ShortDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType.ShortDescription)get_store().find_element_user(SHORTDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameAvailabilityResponseType.ShortDescription)get_store().add_element_user(SHORTDESCRIPTION$2);
            }
            target.set(shortDescription);
        }
    }
    
    /**
     * Gets the "longDescription" element
     */
    public java.lang.String getLongDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "longDescription" element
     */
    public au.gov.asic.types.NameAvailabilityResponseType.LongDescription xgetLongDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType.LongDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType.LongDescription)get_store().find_element_user(LONGDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "longDescription" element
     */
    public boolean isSetLongDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "longDescription" element
     */
    public void setLongDescription(java.lang.String longDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGDESCRIPTION$4);
            }
            target.setStringValue(longDescription);
        }
    }
    
    /**
     * Sets (as xml) the "longDescription" element
     */
    public void xsetLongDescription(au.gov.asic.types.NameAvailabilityResponseType.LongDescription longDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityResponseType.LongDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityResponseType.LongDescription)get_store().find_element_user(LONGDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameAvailabilityResponseType.LongDescription)get_store().add_element_user(LONGDESCRIPTION$4);
            }
            target.set(longDescription);
        }
    }
    
    /**
     * Unsets the "longDescription" element
     */
    public void unsetLongDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets array of all "objection" elements
     */
    public au.gov.asic.types.ObjectionType[] getObjectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTION$6, targetList);
            au.gov.asic.types.ObjectionType[] result = new au.gov.asic.types.ObjectionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objection" element
     */
    public au.gov.asic.types.ObjectionType getObjectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().find_element_user(OBJECTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objection" element
     */
    public int sizeOfObjectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTION$6);
        }
    }
    
    /**
     * Sets array of all "objection" element
     */
    public void setObjectionArray(au.gov.asic.types.ObjectionType[] objectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectionArray, OBJECTION$6);
        }
    }
    
    /**
     * Sets ith "objection" element
     */
    public void setObjectionArray(int i, au.gov.asic.types.ObjectionType objection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().find_element_user(OBJECTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objection" element
     */
    public au.gov.asic.types.ObjectionType insertNewObjection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().insert_element_user(OBJECTION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objection" element
     */
    public au.gov.asic.types.ObjectionType addNewObjection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ObjectionType target = null;
            target = (au.gov.asic.types.ObjectionType)get_store().add_element_user(OBJECTION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "objection" element
     */
    public void removeObjection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTION$6, i);
        }
    }
    /**
     * An XML code(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityResponseType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.NameAvailabilityResponseType.Code
    {
        
        public CodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML shortDescription(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityResponseType$ShortDescription.
     */
    public static class ShortDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameAvailabilityResponseType.ShortDescription
    {
        
        public ShortDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ShortDescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML longDescription(@uri:types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityResponseType$LongDescription.
     */
    public static class LongDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameAvailabilityResponseType.LongDescription
    {
        
        public LongDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LongDescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
