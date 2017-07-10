/*
 * XML Type:  attachmentType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.AttachmentType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML attachmentType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AttachmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.AttachmentType
{
    
    public AttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTTYPE$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "documentType");
    private static final javax.xml.namespace.QName BINARYOBJECT$2 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "binaryObject");
    private static final javax.xml.namespace.QName DOCUMENTNUMBER$4 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "documentNumber");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "description");
    private static final javax.xml.namespace.QName URL$10 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "URL");
    
    
    /**
     * Gets the "documentType" element
     */
    public java.lang.String getDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentType" element
     */
    public au.gov.asic.types.header.document.business.AttachmentType.DocumentType xgetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType.DocumentType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType.DocumentType)get_store().find_element_user(DOCUMENTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentType" element
     */
    public boolean isSetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "documentType" element
     */
    public void setDocumentType(java.lang.String documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTTYPE$0);
            }
            target.setStringValue(documentType);
        }
    }
    
    /**
     * Sets (as xml) the "documentType" element
     */
    public void xsetDocumentType(au.gov.asic.types.header.document.business.AttachmentType.DocumentType documentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType.DocumentType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType.DocumentType)get_store().find_element_user(DOCUMENTTYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.AttachmentType.DocumentType)get_store().add_element_user(DOCUMENTTYPE$0);
            }
            target.set(documentType);
        }
    }
    
    /**
     * Unsets the "documentType" element
     */
    public void unsetDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "binaryObject" element
     */
    public byte[] getBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYOBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "binaryObject" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BINARYOBJECT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "binaryObject" element
     */
    public boolean isSetBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARYOBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "binaryObject" element
     */
    public void setBinaryObject(byte[] binaryObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYOBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINARYOBJECT$2);
            }
            target.setByteArrayValue(binaryObject);
        }
    }
    
    /**
     * Sets (as xml) the "binaryObject" element
     */
    public void xsetBinaryObject(org.apache.xmlbeans.XmlBase64Binary binaryObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BINARYOBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(BINARYOBJECT$2);
            }
            target.set(binaryObject);
        }
    }
    
    /**
     * Unsets the "binaryObject" element
     */
    public void unsetBinaryObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARYOBJECT$2, 0);
        }
    }
    
    /**
     * Gets the "documentNumber" element
     */
    public java.lang.String getDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentNumber" element
     */
    public au.gov.asic.types.DocumentNoType xgetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentNoType target = null;
            target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(DOCUMENTNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "documentNumber" element
     */
    public boolean isSetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "documentNumber" element
     */
    public void setDocumentNumber(java.lang.String documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTNUMBER$4);
            }
            target.setStringValue(documentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "documentNumber" element
     */
    public void xsetDocumentNumber(au.gov.asic.types.DocumentNoType documentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentNoType target = null;
            target = (au.gov.asic.types.DocumentNoType)get_store().find_element_user(DOCUMENTNUMBER$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DocumentNoType)get_store().add_element_user(DOCUMENTNUMBER$4);
            }
            target.set(documentNumber);
        }
    }
    
    /**
     * Unsets the "documentNumber" element
     */
    public void unsetDocumentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTNUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public au.gov.asic.types.header.document.business.AttachmentType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType.Name target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType.Name)get_store().find_element_user(NAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(au.gov.asic.types.header.document.business.AttachmentType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType.Name target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType.Name)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.AttachmentType.Name)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public au.gov.asic.types.header.document.business.AttachmentType.Description xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType.Description target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType.Description)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(au.gov.asic.types.header.document.business.AttachmentType.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType.Description target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType.Description)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.header.document.business.AttachmentType.Description)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "URL" element
     */
    public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "URL" element
     */
    public boolean isSetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$10) != 0;
        }
    }
    
    /**
     * Sets the "URL" element
     */
    public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$10);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" element
     */
    public void xsetURL(org.apache.xmlbeans.XmlAnyURI url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URL$10);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "URL" element
     */
    public void unsetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$10, 0);
        }
    }
    /**
     * An XML documentType(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.AttachmentType$DocumentType.
     */
    public static class DocumentTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.AttachmentType.DocumentType
    {
        
        public DocumentTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DocumentTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML name(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.AttachmentType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.AttachmentType.Name
    {
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML description(@uri:business.document.header.types.asic.gov.au).
     *
     * This is an atomic type that is a restriction of au.gov.asic.types.header.document.business.AttachmentType$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements au.gov.asic.types.header.document.business.AttachmentType.Description
    {
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
