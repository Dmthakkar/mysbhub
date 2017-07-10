/*
 * XML Type:  nameAvailabilityType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.NameAvailabilityType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML nameAvailabilityType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class NameAvailabilityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.NameAvailabilityType
{
    
    public NameAvailabilityTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public au.gov.asic.types.NameAvailabilityType.Code.Enum getCode()
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
            return (au.gov.asic.types.NameAvailabilityType.Code.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public au.gov.asic.types.NameAvailabilityType.Code xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.Code target = null;
            target = (au.gov.asic.types.NameAvailabilityType.Code)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(au.gov.asic.types.NameAvailabilityType.Code.Enum code)
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
    public void xsetCode(au.gov.asic.types.NameAvailabilityType.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.Code target = null;
            target = (au.gov.asic.types.NameAvailabilityType.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.NameAvailabilityType.Code)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets array of all "shortDescription" elements
     */
    public java.lang.String[] getShortDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHORTDESCRIPTION$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "shortDescription" element
     */
    public java.lang.String getShortDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "shortDescription" elements
     */
    public au.gov.asic.types.NameAvailabilityType.ShortDescription[] xgetShortDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHORTDESCRIPTION$2, targetList);
            au.gov.asic.types.NameAvailabilityType.ShortDescription[] result = new au.gov.asic.types.NameAvailabilityType.ShortDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "shortDescription" element
     */
    public au.gov.asic.types.NameAvailabilityType.ShortDescription xgetShortDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.ShortDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.ShortDescription)get_store().find_element_user(SHORTDESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.NameAvailabilityType.ShortDescription)target;
        }
    }
    
    /**
     * Returns number of "shortDescription" element
     */
    public int sizeOfShortDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHORTDESCRIPTION$2);
        }
    }
    
    /**
     * Sets array of all "shortDescription" element
     */
    public void setShortDescriptionArray(java.lang.String[] shortDescriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shortDescriptionArray, SHORTDESCRIPTION$2);
        }
    }
    
    /**
     * Sets ith "shortDescription" element
     */
    public void setShortDescriptionArray(int i, java.lang.String shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTDESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(shortDescription);
        }
    }
    
    /**
     * Sets (as xml) array of all "shortDescription" element
     */
    public void xsetShortDescriptionArray(au.gov.asic.types.NameAvailabilityType.ShortDescription[]shortDescriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shortDescriptionArray, SHORTDESCRIPTION$2);
        }
    }
    
    /**
     * Sets (as xml) ith "shortDescription" element
     */
    public void xsetShortDescriptionArray(int i, au.gov.asic.types.NameAvailabilityType.ShortDescription shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.ShortDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.ShortDescription)get_store().find_element_user(SHORTDESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shortDescription);
        }
    }
    
    /**
     * Inserts the value as the ith "shortDescription" element
     */
    public void insertShortDescription(int i, java.lang.String shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SHORTDESCRIPTION$2, i);
            target.setStringValue(shortDescription);
        }
    }
    
    /**
     * Appends the value as the last "shortDescription" element
     */
    public void addShortDescription(java.lang.String shortDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTDESCRIPTION$2);
            target.setStringValue(shortDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shortDescription" element
     */
    public au.gov.asic.types.NameAvailabilityType.ShortDescription insertNewShortDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.ShortDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.ShortDescription)get_store().insert_element_user(SHORTDESCRIPTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shortDescription" element
     */
    public au.gov.asic.types.NameAvailabilityType.ShortDescription addNewShortDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.ShortDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.ShortDescription)get_store().add_element_user(SHORTDESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "shortDescription" element
     */
    public void removeShortDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHORTDESCRIPTION$2, i);
        }
    }
    
    /**
     * Gets array of all "longDescription" elements
     */
    public java.lang.String[] getLongDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGDESCRIPTION$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "longDescription" element
     */
    public java.lang.String getLongDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGDESCRIPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "longDescription" elements
     */
    public au.gov.asic.types.NameAvailabilityType.LongDescription[] xgetLongDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGDESCRIPTION$4, targetList);
            au.gov.asic.types.NameAvailabilityType.LongDescription[] result = new au.gov.asic.types.NameAvailabilityType.LongDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "longDescription" element
     */
    public au.gov.asic.types.NameAvailabilityType.LongDescription xgetLongDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.LongDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.LongDescription)get_store().find_element_user(LONGDESCRIPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.NameAvailabilityType.LongDescription)target;
        }
    }
    
    /**
     * Returns number of "longDescription" element
     */
    public int sizeOfLongDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGDESCRIPTION$4);
        }
    }
    
    /**
     * Sets array of all "longDescription" element
     */
    public void setLongDescriptionArray(java.lang.String[] longDescriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longDescriptionArray, LONGDESCRIPTION$4);
        }
    }
    
    /**
     * Sets ith "longDescription" element
     */
    public void setLongDescriptionArray(int i, java.lang.String longDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGDESCRIPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(longDescription);
        }
    }
    
    /**
     * Sets (as xml) array of all "longDescription" element
     */
    public void xsetLongDescriptionArray(au.gov.asic.types.NameAvailabilityType.LongDescription[]longDescriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longDescriptionArray, LONGDESCRIPTION$4);
        }
    }
    
    /**
     * Sets (as xml) ith "longDescription" element
     */
    public void xsetLongDescriptionArray(int i, au.gov.asic.types.NameAvailabilityType.LongDescription longDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.LongDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.LongDescription)get_store().find_element_user(LONGDESCRIPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(longDescription);
        }
    }
    
    /**
     * Inserts the value as the ith "longDescription" element
     */
    public void insertLongDescription(int i, java.lang.String longDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LONGDESCRIPTION$4, i);
            target.setStringValue(longDescription);
        }
    }
    
    /**
     * Appends the value as the last "longDescription" element
     */
    public void addLongDescription(java.lang.String longDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGDESCRIPTION$4);
            target.setStringValue(longDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "longDescription" element
     */
    public au.gov.asic.types.NameAvailabilityType.LongDescription insertNewLongDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.LongDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.LongDescription)get_store().insert_element_user(LONGDESCRIPTION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "longDescription" element
     */
    public au.gov.asic.types.NameAvailabilityType.LongDescription addNewLongDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.NameAvailabilityType.LongDescription target = null;
            target = (au.gov.asic.types.NameAvailabilityType.LongDescription)get_store().add_element_user(LONGDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "longDescription" element
     */
    public void removeLongDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGDESCRIPTION$4, i);
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
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityType$Code.
     */
    public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements au.gov.asic.types.NameAvailabilityType.Code
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
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityType$ShortDescription.
     */
    public static class ShortDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameAvailabilityType.ShortDescription
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
     * This is an atomic type that is a restriction of au.gov.asic.types.NameAvailabilityType$LongDescription.
     */
    public static class LongDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.NameAvailabilityType.LongDescription
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
