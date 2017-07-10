/*
 * XML Type:  attachmentsType
 * Namespace: uri:business.document.header.types.asic.gov.au
 * Java type: au.gov.asic.types.header.document.business.AttachmentsType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.header.document.business.impl;
/**
 * An XML attachmentsType(@uri:business.document.header.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AttachmentsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.header.document.business.AttachmentsType
{
    
    public AttachmentsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("uri:business.document.header.types.asic.gov.au", "attachment");
    
    
    /**
     * Gets array of all "attachment" elements
     */
    public au.gov.asic.types.header.document.business.AttachmentType[] getAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENT$0, targetList);
            au.gov.asic.types.header.document.business.AttachmentType[] result = new au.gov.asic.types.header.document.business.AttachmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attachment" element
     */
    public au.gov.asic.types.header.document.business.AttachmentType getAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType)get_store().find_element_user(ATTACHMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attachment" element
     */
    public int sizeOfAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENT$0);
        }
    }
    
    /**
     * Sets array of all "attachment" element
     */
    public void setAttachmentArray(au.gov.asic.types.header.document.business.AttachmentType[] attachmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentArray, ATTACHMENT$0);
        }
    }
    
    /**
     * Sets ith "attachment" element
     */
    public void setAttachmentArray(int i, au.gov.asic.types.header.document.business.AttachmentType attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType)get_store().find_element_user(ATTACHMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attachment" element
     */
    public au.gov.asic.types.header.document.business.AttachmentType insertNewAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType)get_store().insert_element_user(ATTACHMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attachment" element
     */
    public au.gov.asic.types.header.document.business.AttachmentType addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.header.document.business.AttachmentType target = null;
            target = (au.gov.asic.types.header.document.business.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attachment" element
     */
    public void removeAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENT$0, i);
        }
    }
}
