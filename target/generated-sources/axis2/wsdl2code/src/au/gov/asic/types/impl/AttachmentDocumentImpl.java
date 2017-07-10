/*
 * An XML document type.
 * Localname: attachment
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * A document containing one attachment(@uri:types.asic.gov.au) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.AttachmentDocument
{
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "attachment");
    
    
    /**
     * Gets the "attachment" element
     */
    public byte[] getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "attachment" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ATTACHMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attachment" element
     */
    public void setAttachment(byte[] attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENT$0);
            }
            target.setByteArrayValue(attachment);
        }
    }
    
    /**
     * Sets (as xml) the "attachment" element
     */
    public void xsetAttachment(org.apache.xmlbeans.XmlBase64Binary attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(ATTACHMENT$0);
            }
            target.set(attachment);
        }
    }
}
