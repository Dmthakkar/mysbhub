/*
 * XML Type:  abnRecordType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbnRecordType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn.impl;
/**
 * An XML abnRecordType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class AbnRecordTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType
{
    
    public AbnRecordTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABN$0 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "ABN");
    private static final javax.xml.namespace.QName ACN$2 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "ACN");
    private static final javax.xml.namespace.QName ANZSIC$4 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "ANZSIC");
    private static final javax.xml.namespace.QName ENTITYTYPE$6 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "entityType");
    private static final javax.xml.namespace.QName GOODSANDSERVICESTAX$8 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "goodsAndServicesTax");
    private static final javax.xml.namespace.QName DEDUCTIBLEGIFTRECIPIENT$10 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "deductibleGiftRecipient");
    private static final javax.xml.namespace.QName LEGALNAME$12 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "legalName");
    private static final javax.xml.namespace.QName MAINTRADINGNAME$14 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "mainTradingName");
    private static final javax.xml.namespace.QName OTHERTRADINGNAME$16 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "otherTradingName");
    private static final javax.xml.namespace.QName SERVICEOFNOTICEPHYSICALADDRESS$18 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "serviceOfNoticePhysicalAddress");
    private static final javax.xml.namespace.QName SERVICEOFNOTICEEMAILADDRESS$20 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "serviceOfNoticeEmailAddress");
    private static final javax.xml.namespace.QName MAINBUSINESSPHYSICALADDRESS$22 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "mainBusinessPhysicalAddress");
    private static final javax.xml.namespace.QName ASSOCIATE$24 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "associate");
    private static final javax.xml.namespace.QName SUPPRESSIONINDICATOR$26 = 
        new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "suppressionIndicator");
    
    
    /**
     * Gets array of all "ABN" elements
     */
    public au.gov.asic.types.abn.IdentifierType[] getABNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABN$0, targetList);
            au.gov.asic.types.abn.IdentifierType[] result = new au.gov.asic.types.abn.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ABN" element
     */
    public au.gov.asic.types.abn.IdentifierType getABNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().find_element_user(ABN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ABN" element
     */
    public int sizeOfABNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABN$0);
        }
    }
    
    /**
     * Sets array of all "ABN" element
     */
    public void setABNArray(au.gov.asic.types.abn.IdentifierType[] abnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(abnArray, ABN$0);
        }
    }
    
    /**
     * Sets ith "ABN" element
     */
    public void setABNArray(int i, au.gov.asic.types.abn.IdentifierType abn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().find_element_user(ABN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ABN" element
     */
    public au.gov.asic.types.abn.IdentifierType insertNewABN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().insert_element_user(ABN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ABN" element
     */
    public au.gov.asic.types.abn.IdentifierType addNewABN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().add_element_user(ABN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ABN" element
     */
    public void removeABN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABN$0, i);
        }
    }
    
    /**
     * Gets array of all "ACN" elements
     */
    public au.gov.asic.types.abn.IdentifierType[] getACNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACN$2, targetList);
            au.gov.asic.types.abn.IdentifierType[] result = new au.gov.asic.types.abn.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ACN" element
     */
    public au.gov.asic.types.abn.IdentifierType getACNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().find_element_user(ACN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ACN" element
     */
    public int sizeOfACNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACN$2);
        }
    }
    
    /**
     * Sets array of all "ACN" element
     */
    public void setACNArray(au.gov.asic.types.abn.IdentifierType[] acnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(acnArray, ACN$2);
        }
    }
    
    /**
     * Sets ith "ACN" element
     */
    public void setACNArray(int i, au.gov.asic.types.abn.IdentifierType acn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().find_element_user(ACN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(acn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ACN" element
     */
    public au.gov.asic.types.abn.IdentifierType insertNewACN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().insert_element_user(ACN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ACN" element
     */
    public au.gov.asic.types.abn.IdentifierType addNewACN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IdentifierType target = null;
            target = (au.gov.asic.types.abn.IdentifierType)get_store().add_element_user(ACN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ACN" element
     */
    public void removeACN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACN$2, i);
        }
    }
    
    /**
     * Gets array of all "ANZSIC" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.ANZSIC[] getANZSICArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANZSIC$4, targetList);
            au.gov.asic.types.abn.AbnRecordType.ANZSIC[] result = new au.gov.asic.types.abn.AbnRecordType.ANZSIC[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ANZSIC" element
     */
    public au.gov.asic.types.abn.AbnRecordType.ANZSIC getANZSICArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.ANZSIC target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.ANZSIC)get_store().find_element_user(ANZSIC$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ANZSIC" element
     */
    public int sizeOfANZSICArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANZSIC$4);
        }
    }
    
    /**
     * Sets array of all "ANZSIC" element
     */
    public void setANZSICArray(au.gov.asic.types.abn.AbnRecordType.ANZSIC[] anzsicArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anzsicArray, ANZSIC$4);
        }
    }
    
    /**
     * Sets ith "ANZSIC" element
     */
    public void setANZSICArray(int i, au.gov.asic.types.abn.AbnRecordType.ANZSIC anzsic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.ANZSIC target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.ANZSIC)get_store().find_element_user(ANZSIC$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anzsic);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ANZSIC" element
     */
    public au.gov.asic.types.abn.AbnRecordType.ANZSIC insertNewANZSIC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.ANZSIC target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.ANZSIC)get_store().insert_element_user(ANZSIC$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ANZSIC" element
     */
    public au.gov.asic.types.abn.AbnRecordType.ANZSIC addNewANZSIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.ANZSIC target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.ANZSIC)get_store().add_element_user(ANZSIC$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ANZSIC" element
     */
    public void removeANZSIC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANZSIC$4, i);
        }
    }
    
    /**
     * Gets array of all "entityType" elements
     */
    public java.lang.String[] getEntityTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYTYPE$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "entityType" element
     */
    public java.lang.String getEntityTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "entityType" elements
     */
    public au.gov.asic.types.abn.EntityTypeType[] xgetEntityTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITYTYPE$6, targetList);
            au.gov.asic.types.abn.EntityTypeType[] result = new au.gov.asic.types.abn.EntityTypeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "entityType" element
     */
    public au.gov.asic.types.abn.EntityTypeType xgetEntityTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.EntityTypeType target = null;
            target = (au.gov.asic.types.abn.EntityTypeType)get_store().find_element_user(ENTITYTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (au.gov.asic.types.abn.EntityTypeType)target;
        }
    }
    
    /**
     * Returns number of "entityType" element
     */
    public int sizeOfEntityTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYTYPE$6);
        }
    }
    
    /**
     * Sets array of all "entityType" element
     */
    public void setEntityTypeArray(java.lang.String[] entityTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityTypeArray, ENTITYTYPE$6);
        }
    }
    
    /**
     * Sets ith "entityType" element
     */
    public void setEntityTypeArray(int i, java.lang.String entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(entityType);
        }
    }
    
    /**
     * Sets (as xml) array of all "entityType" element
     */
    public void xsetEntityTypeArray(au.gov.asic.types.abn.EntityTypeType[]entityTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityTypeArray, ENTITYTYPE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "entityType" element
     */
    public void xsetEntityTypeArray(int i, au.gov.asic.types.abn.EntityTypeType entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.EntityTypeType target = null;
            target = (au.gov.asic.types.abn.EntityTypeType)get_store().find_element_user(ENTITYTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityType);
        }
    }
    
    /**
     * Inserts the value as the ith "entityType" element
     */
    public void insertEntityType(int i, java.lang.String entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENTITYTYPE$6, i);
            target.setStringValue(entityType);
        }
    }
    
    /**
     * Appends the value as the last "entityType" element
     */
    public void addEntityType(java.lang.String entityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$6);
            target.setStringValue(entityType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityType" element
     */
    public au.gov.asic.types.abn.EntityTypeType insertNewEntityType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.EntityTypeType target = null;
            target = (au.gov.asic.types.abn.EntityTypeType)get_store().insert_element_user(ENTITYTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityType" element
     */
    public au.gov.asic.types.abn.EntityTypeType addNewEntityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.EntityTypeType target = null;
            target = (au.gov.asic.types.abn.EntityTypeType)get_store().add_element_user(ENTITYTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "entityType" element
     */
    public void removeEntityType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYTYPE$6, i);
        }
    }
    
    /**
     * Gets array of all "goodsAndServicesTax" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax[] getGoodsAndServicesTaxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GOODSANDSERVICESTAX$8, targetList);
            au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax[] result = new au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "goodsAndServicesTax" element
     */
    public au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax getGoodsAndServicesTaxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax)get_store().find_element_user(GOODSANDSERVICESTAX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "goodsAndServicesTax" element
     */
    public int sizeOfGoodsAndServicesTaxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOODSANDSERVICESTAX$8);
        }
    }
    
    /**
     * Sets array of all "goodsAndServicesTax" element
     */
    public void setGoodsAndServicesTaxArray(au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax[] goodsAndServicesTaxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(goodsAndServicesTaxArray, GOODSANDSERVICESTAX$8);
        }
    }
    
    /**
     * Sets ith "goodsAndServicesTax" element
     */
    public void setGoodsAndServicesTaxArray(int i, au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax goodsAndServicesTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax)get_store().find_element_user(GOODSANDSERVICESTAX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(goodsAndServicesTax);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "goodsAndServicesTax" element
     */
    public au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax insertNewGoodsAndServicesTax(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax)get_store().insert_element_user(GOODSANDSERVICESTAX$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "goodsAndServicesTax" element
     */
    public au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax addNewGoodsAndServicesTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax)get_store().add_element_user(GOODSANDSERVICESTAX$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "goodsAndServicesTax" element
     */
    public void removeGoodsAndServicesTax(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOODSANDSERVICESTAX$8, i);
        }
    }
    
    /**
     * Gets array of all "deductibleGiftRecipient" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient[] getDeductibleGiftRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEDUCTIBLEGIFTRECIPIENT$10, targetList);
            au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient[] result = new au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deductibleGiftRecipient" element
     */
    public au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient getDeductibleGiftRecipientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient)get_store().find_element_user(DEDUCTIBLEGIFTRECIPIENT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deductibleGiftRecipient" element
     */
    public int sizeOfDeductibleGiftRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEDUCTIBLEGIFTRECIPIENT$10);
        }
    }
    
    /**
     * Sets array of all "deductibleGiftRecipient" element
     */
    public void setDeductibleGiftRecipientArray(au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient[] deductibleGiftRecipientArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deductibleGiftRecipientArray, DEDUCTIBLEGIFTRECIPIENT$10);
        }
    }
    
    /**
     * Sets ith "deductibleGiftRecipient" element
     */
    public void setDeductibleGiftRecipientArray(int i, au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient deductibleGiftRecipient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient)get_store().find_element_user(DEDUCTIBLEGIFTRECIPIENT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deductibleGiftRecipient);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deductibleGiftRecipient" element
     */
    public au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient insertNewDeductibleGiftRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient)get_store().insert_element_user(DEDUCTIBLEGIFTRECIPIENT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deductibleGiftRecipient" element
     */
    public au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient addNewDeductibleGiftRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient)get_store().add_element_user(DEDUCTIBLEGIFTRECIPIENT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "deductibleGiftRecipient" element
     */
    public void removeDeductibleGiftRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEDUCTIBLEGIFTRECIPIENT$10, i);
        }
    }
    
    /**
     * Gets array of all "legalName" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.LegalName[] getLegalNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LEGALNAME$12, targetList);
            au.gov.asic.types.abn.AbnRecordType.LegalName[] result = new au.gov.asic.types.abn.AbnRecordType.LegalName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "legalName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.LegalName getLegalNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.LegalName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.LegalName)get_store().find_element_user(LEGALNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "legalName" element
     */
    public int sizeOfLegalNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALNAME$12);
        }
    }
    
    /**
     * Sets array of all "legalName" element
     */
    public void setLegalNameArray(au.gov.asic.types.abn.AbnRecordType.LegalName[] legalNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(legalNameArray, LEGALNAME$12);
        }
    }
    
    /**
     * Sets ith "legalName" element
     */
    public void setLegalNameArray(int i, au.gov.asic.types.abn.AbnRecordType.LegalName legalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.LegalName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.LegalName)get_store().find_element_user(LEGALNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(legalName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.LegalName insertNewLegalName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.LegalName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.LegalName)get_store().insert_element_user(LEGALNAME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.LegalName addNewLegalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.LegalName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.LegalName)get_store().add_element_user(LEGALNAME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "legalName" element
     */
    public void removeLegalName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALNAME$12, i);
        }
    }
    
    /**
     * Gets array of all "mainTradingName" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.MainTradingName[] getMainTradingNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAINTRADINGNAME$14, targetList);
            au.gov.asic.types.abn.AbnRecordType.MainTradingName[] result = new au.gov.asic.types.abn.AbnRecordType.MainTradingName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mainTradingName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.MainTradingName getMainTradingNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.MainTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName)get_store().find_element_user(MAINTRADINGNAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mainTradingName" element
     */
    public int sizeOfMainTradingNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINTRADINGNAME$14);
        }
    }
    
    /**
     * Sets array of all "mainTradingName" element
     */
    public void setMainTradingNameArray(au.gov.asic.types.abn.AbnRecordType.MainTradingName[] mainTradingNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mainTradingNameArray, MAINTRADINGNAME$14);
        }
    }
    
    /**
     * Sets ith "mainTradingName" element
     */
    public void setMainTradingNameArray(int i, au.gov.asic.types.abn.AbnRecordType.MainTradingName mainTradingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.MainTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName)get_store().find_element_user(MAINTRADINGNAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mainTradingName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mainTradingName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.MainTradingName insertNewMainTradingName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.MainTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName)get_store().insert_element_user(MAINTRADINGNAME$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mainTradingName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.MainTradingName addNewMainTradingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.MainTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName)get_store().add_element_user(MAINTRADINGNAME$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "mainTradingName" element
     */
    public void removeMainTradingName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINTRADINGNAME$14, i);
        }
    }
    
    /**
     * Gets array of all "otherTradingName" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.OtherTradingName[] getOtherTradingNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHERTRADINGNAME$16, targetList);
            au.gov.asic.types.abn.AbnRecordType.OtherTradingName[] result = new au.gov.asic.types.abn.AbnRecordType.OtherTradingName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "otherTradingName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.OtherTradingName getOtherTradingNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.OtherTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName)get_store().find_element_user(OTHERTRADINGNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "otherTradingName" element
     */
    public int sizeOfOtherTradingNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERTRADINGNAME$16);
        }
    }
    
    /**
     * Sets array of all "otherTradingName" element
     */
    public void setOtherTradingNameArray(au.gov.asic.types.abn.AbnRecordType.OtherTradingName[] otherTradingNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(otherTradingNameArray, OTHERTRADINGNAME$16);
        }
    }
    
    /**
     * Sets ith "otherTradingName" element
     */
    public void setOtherTradingNameArray(int i, au.gov.asic.types.abn.AbnRecordType.OtherTradingName otherTradingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.OtherTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName)get_store().find_element_user(OTHERTRADINGNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(otherTradingName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "otherTradingName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.OtherTradingName insertNewOtherTradingName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.OtherTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName)get_store().insert_element_user(OTHERTRADINGNAME$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "otherTradingName" element
     */
    public au.gov.asic.types.abn.AbnRecordType.OtherTradingName addNewOtherTradingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.OtherTradingName target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName)get_store().add_element_user(OTHERTRADINGNAME$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "otherTradingName" element
     */
    public void removeOtherTradingName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERTRADINGNAME$16, i);
        }
    }
    
    /**
     * Gets array of all "serviceOfNoticePhysicalAddress" elements
     */
    public au.gov.asic.types.abn.GeographicType[] getServiceOfNoticePhysicalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICEOFNOTICEPHYSICALADDRESS$18, targetList);
            au.gov.asic.types.abn.GeographicType[] result = new au.gov.asic.types.abn.GeographicType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serviceOfNoticePhysicalAddress" element
     */
    public au.gov.asic.types.abn.GeographicType getServiceOfNoticePhysicalAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().find_element_user(SERVICEOFNOTICEPHYSICALADDRESS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serviceOfNoticePhysicalAddress" element
     */
    public int sizeOfServiceOfNoticePhysicalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEOFNOTICEPHYSICALADDRESS$18);
        }
    }
    
    /**
     * Sets array of all "serviceOfNoticePhysicalAddress" element
     */
    public void setServiceOfNoticePhysicalAddressArray(au.gov.asic.types.abn.GeographicType[] serviceOfNoticePhysicalAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceOfNoticePhysicalAddressArray, SERVICEOFNOTICEPHYSICALADDRESS$18);
        }
    }
    
    /**
     * Sets ith "serviceOfNoticePhysicalAddress" element
     */
    public void setServiceOfNoticePhysicalAddressArray(int i, au.gov.asic.types.abn.GeographicType serviceOfNoticePhysicalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().find_element_user(SERVICEOFNOTICEPHYSICALADDRESS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceOfNoticePhysicalAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceOfNoticePhysicalAddress" element
     */
    public au.gov.asic.types.abn.GeographicType insertNewServiceOfNoticePhysicalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().insert_element_user(SERVICEOFNOTICEPHYSICALADDRESS$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceOfNoticePhysicalAddress" element
     */
    public au.gov.asic.types.abn.GeographicType addNewServiceOfNoticePhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().add_element_user(SERVICEOFNOTICEPHYSICALADDRESS$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "serviceOfNoticePhysicalAddress" element
     */
    public void removeServiceOfNoticePhysicalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEOFNOTICEPHYSICALADDRESS$18, i);
        }
    }
    
    /**
     * Gets array of all "serviceOfNoticeEmailAddress" elements
     */
    public au.gov.asic.types.abn.AbnEmailType[] getServiceOfNoticeEmailAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICEOFNOTICEEMAILADDRESS$20, targetList);
            au.gov.asic.types.abn.AbnEmailType[] result = new au.gov.asic.types.abn.AbnEmailType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serviceOfNoticeEmailAddress" element
     */
    public au.gov.asic.types.abn.AbnEmailType getServiceOfNoticeEmailAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnEmailType target = null;
            target = (au.gov.asic.types.abn.AbnEmailType)get_store().find_element_user(SERVICEOFNOTICEEMAILADDRESS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serviceOfNoticeEmailAddress" element
     */
    public int sizeOfServiceOfNoticeEmailAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEOFNOTICEEMAILADDRESS$20);
        }
    }
    
    /**
     * Sets array of all "serviceOfNoticeEmailAddress" element
     */
    public void setServiceOfNoticeEmailAddressArray(au.gov.asic.types.abn.AbnEmailType[] serviceOfNoticeEmailAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceOfNoticeEmailAddressArray, SERVICEOFNOTICEEMAILADDRESS$20);
        }
    }
    
    /**
     * Sets ith "serviceOfNoticeEmailAddress" element
     */
    public void setServiceOfNoticeEmailAddressArray(int i, au.gov.asic.types.abn.AbnEmailType serviceOfNoticeEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnEmailType target = null;
            target = (au.gov.asic.types.abn.AbnEmailType)get_store().find_element_user(SERVICEOFNOTICEEMAILADDRESS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceOfNoticeEmailAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceOfNoticeEmailAddress" element
     */
    public au.gov.asic.types.abn.AbnEmailType insertNewServiceOfNoticeEmailAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnEmailType target = null;
            target = (au.gov.asic.types.abn.AbnEmailType)get_store().insert_element_user(SERVICEOFNOTICEEMAILADDRESS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceOfNoticeEmailAddress" element
     */
    public au.gov.asic.types.abn.AbnEmailType addNewServiceOfNoticeEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnEmailType target = null;
            target = (au.gov.asic.types.abn.AbnEmailType)get_store().add_element_user(SERVICEOFNOTICEEMAILADDRESS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "serviceOfNoticeEmailAddress" element
     */
    public void removeServiceOfNoticeEmailAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEOFNOTICEEMAILADDRESS$20, i);
        }
    }
    
    /**
     * Gets array of all "mainBusinessPhysicalAddress" elements
     */
    public au.gov.asic.types.abn.GeographicType[] getMainBusinessPhysicalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAINBUSINESSPHYSICALADDRESS$22, targetList);
            au.gov.asic.types.abn.GeographicType[] result = new au.gov.asic.types.abn.GeographicType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mainBusinessPhysicalAddress" element
     */
    public au.gov.asic.types.abn.GeographicType getMainBusinessPhysicalAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().find_element_user(MAINBUSINESSPHYSICALADDRESS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mainBusinessPhysicalAddress" element
     */
    public int sizeOfMainBusinessPhysicalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINBUSINESSPHYSICALADDRESS$22);
        }
    }
    
    /**
     * Sets array of all "mainBusinessPhysicalAddress" element
     */
    public void setMainBusinessPhysicalAddressArray(au.gov.asic.types.abn.GeographicType[] mainBusinessPhysicalAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mainBusinessPhysicalAddressArray, MAINBUSINESSPHYSICALADDRESS$22);
        }
    }
    
    /**
     * Sets ith "mainBusinessPhysicalAddress" element
     */
    public void setMainBusinessPhysicalAddressArray(int i, au.gov.asic.types.abn.GeographicType mainBusinessPhysicalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().find_element_user(MAINBUSINESSPHYSICALADDRESS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mainBusinessPhysicalAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mainBusinessPhysicalAddress" element
     */
    public au.gov.asic.types.abn.GeographicType insertNewMainBusinessPhysicalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().insert_element_user(MAINBUSINESSPHYSICALADDRESS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mainBusinessPhysicalAddress" element
     */
    public au.gov.asic.types.abn.GeographicType addNewMainBusinessPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.GeographicType target = null;
            target = (au.gov.asic.types.abn.GeographicType)get_store().add_element_user(MAINBUSINESSPHYSICALADDRESS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "mainBusinessPhysicalAddress" element
     */
    public void removeMainBusinessPhysicalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINBUSINESSPHYSICALADDRESS$22, i);
        }
    }
    
    /**
     * Gets array of all "associate" elements
     */
    public au.gov.asic.types.abn.AbnRecordType.Associate[] getAssociateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ASSOCIATE$24, targetList);
            au.gov.asic.types.abn.AbnRecordType.Associate[] result = new au.gov.asic.types.abn.AbnRecordType.Associate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "associate" element
     */
    public au.gov.asic.types.abn.AbnRecordType.Associate getAssociateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.Associate target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.Associate)get_store().find_element_user(ASSOCIATE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "associate" element
     */
    public int sizeOfAssociateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSOCIATE$24);
        }
    }
    
    /**
     * Sets array of all "associate" element
     */
    public void setAssociateArray(au.gov.asic.types.abn.AbnRecordType.Associate[] associateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(associateArray, ASSOCIATE$24);
        }
    }
    
    /**
     * Sets ith "associate" element
     */
    public void setAssociateArray(int i, au.gov.asic.types.abn.AbnRecordType.Associate associate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.Associate target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.Associate)get_store().find_element_user(ASSOCIATE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(associate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "associate" element
     */
    public au.gov.asic.types.abn.AbnRecordType.Associate insertNewAssociate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.Associate target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.Associate)get_store().insert_element_user(ASSOCIATE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "associate" element
     */
    public au.gov.asic.types.abn.AbnRecordType.Associate addNewAssociate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.AbnRecordType.Associate target = null;
            target = (au.gov.asic.types.abn.AbnRecordType.Associate)get_store().add_element_user(ASSOCIATE$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "associate" element
     */
    public void removeAssociate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSOCIATE$24, i);
        }
    }
    
    /**
     * Gets the "suppressionIndicator" element
     */
    public au.gov.asic.types.abn.IndicatorType.Enum getSuppressionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPRESSIONINDICATOR$26, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.abn.IndicatorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "suppressionIndicator" element
     */
    public au.gov.asic.types.abn.IndicatorType xgetSuppressionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(SUPPRESSIONINDICATOR$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "suppressionIndicator" element
     */
    public boolean isSetSuppressionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPRESSIONINDICATOR$26) != 0;
        }
    }
    
    /**
     * Sets the "suppressionIndicator" element
     */
    public void setSuppressionIndicator(au.gov.asic.types.abn.IndicatorType.Enum suppressionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPRESSIONINDICATOR$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPRESSIONINDICATOR$26);
            }
            target.setEnumValue(suppressionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "suppressionIndicator" element
     */
    public void xsetSuppressionIndicator(au.gov.asic.types.abn.IndicatorType suppressionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.abn.IndicatorType target = null;
            target = (au.gov.asic.types.abn.IndicatorType)get_store().find_element_user(SUPPRESSIONINDICATOR$26, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.abn.IndicatorType)get_store().add_element_user(SUPPRESSIONINDICATOR$26);
            }
            target.set(suppressionIndicator);
        }
    }
    
    /**
     * Unsets the "suppressionIndicator" element
     */
    public void unsetSuppressionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPRESSIONINDICATOR$26, 0);
        }
    }
    /**
     * An XML ANZSIC(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class ANZSICImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.ANZSIC
    {
        
        public ANZSICImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAINACTIVITYDESCRIPTION$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "mainActivityDescription");
        private static final javax.xml.namespace.QName MAININDUSTRYCODE$2 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "mainIndustryCode");
        private static final javax.xml.namespace.QName CODE$4 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "code");
        private static final javax.xml.namespace.QName DESCRIPTION$6 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "description");
        
        
        /**
         * Gets the "mainActivityDescription" element
         */
        public java.lang.String getMainActivityDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINACTIVITYDESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mainActivityDescription" element
         */
        public au.gov.asic.types.abn.ANZSICdescriptionType xgetMainActivityDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICdescriptionType target = null;
                target = (au.gov.asic.types.abn.ANZSICdescriptionType)get_store().find_element_user(MAINACTIVITYDESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mainActivityDescription" element
         */
        public void setMainActivityDescription(java.lang.String mainActivityDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINACTIVITYDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINACTIVITYDESCRIPTION$0);
                }
                target.setStringValue(mainActivityDescription);
            }
        }
        
        /**
         * Sets (as xml) the "mainActivityDescription" element
         */
        public void xsetMainActivityDescription(au.gov.asic.types.abn.ANZSICdescriptionType mainActivityDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICdescriptionType target = null;
                target = (au.gov.asic.types.abn.ANZSICdescriptionType)get_store().find_element_user(MAINACTIVITYDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.ANZSICdescriptionType)get_store().add_element_user(MAINACTIVITYDESCRIPTION$0);
                }
                target.set(mainActivityDescription);
            }
        }
        
        /**
         * Gets the "mainIndustryCode" element
         */
        public java.lang.String getMainIndustryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAININDUSTRYCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mainIndustryCode" element
         */
        public au.gov.asic.types.abn.ANZSICCodeType xgetMainIndustryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICCodeType target = null;
                target = (au.gov.asic.types.abn.ANZSICCodeType)get_store().find_element_user(MAININDUSTRYCODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mainIndustryCode" element
         */
        public void setMainIndustryCode(java.lang.String mainIndustryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAININDUSTRYCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAININDUSTRYCODE$2);
                }
                target.setStringValue(mainIndustryCode);
            }
        }
        
        /**
         * Sets (as xml) the "mainIndustryCode" element
         */
        public void xsetMainIndustryCode(au.gov.asic.types.abn.ANZSICCodeType mainIndustryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICCodeType target = null;
                target = (au.gov.asic.types.abn.ANZSICCodeType)get_store().find_element_user(MAININDUSTRYCODE$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.ANZSICCodeType)get_store().add_element_user(MAININDUSTRYCODE$2);
                }
                target.set(mainIndustryCode);
            }
        }
        
        /**
         * Gets the "code" element
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" element
         */
        public au.gov.asic.types.abn.ANZSICCodeType xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICCodeType target = null;
                target = (au.gov.asic.types.abn.ANZSICCodeType)get_store().find_element_user(CODE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$4);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" element
         */
        public void xsetCode(au.gov.asic.types.abn.ANZSICCodeType code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICCodeType target = null;
                target = (au.gov.asic.types.abn.ANZSICCodeType)get_store().find_element_user(CODE$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.ANZSICCodeType)get_store().add_element_user(CODE$4);
                }
                target.set(code);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
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
        public au.gov.asic.types.abn.ANZSICdescriptionType xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICdescriptionType target = null;
                target = (au.gov.asic.types.abn.ANZSICdescriptionType)get_store().find_element_user(DESCRIPTION$6, 0);
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
                return get_store().count_elements(DESCRIPTION$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(au.gov.asic.types.abn.ANZSICdescriptionType description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.ANZSICdescriptionType target = null;
                target = (au.gov.asic.types.abn.ANZSICdescriptionType)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.ANZSICdescriptionType)get_store().add_element_user(DESCRIPTION$6);
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
                get_store().remove_element(DESCRIPTION$6, 0);
            }
        }
    }
    /**
     * An XML goodsAndServicesTax(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class GoodsAndServicesTaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax
    {
        
        public GoodsAndServicesTaxImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EFFECTIVEFROM$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
        private static final javax.xml.namespace.QName EFFECTIVETO$2 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
        
        
        /**
         * Gets the "effectiveFrom" element
         */
        public java.util.Calendar getEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "effectiveFrom" element
         */
        public au.gov.asic.types.abn.DateType xgetEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "effectiveFrom" element
         */
        public boolean isSetEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EFFECTIVEFROM$0) != 0;
            }
        }
        
        /**
         * Sets the "effectiveFrom" element
         */
        public void setEffectiveFrom(java.util.Calendar effectiveFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$0);
                }
                target.setCalendarValue(effectiveFrom);
            }
        }
        
        /**
         * Sets (as xml) the "effectiveFrom" element
         */
        public void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$0);
                }
                target.set(effectiveFrom);
            }
        }
        
        /**
         * Unsets the "effectiveFrom" element
         */
        public void unsetEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EFFECTIVEFROM$0, 0);
            }
        }
        
        /**
         * Gets the "effectiveTo" element
         */
        public java.util.Calendar getEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "effectiveTo" element
         */
        public au.gov.asic.types.abn.DateType xgetEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "effectiveTo" element
         */
        public boolean isSetEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EFFECTIVETO$2) != 0;
            }
        }
        
        /**
         * Sets the "effectiveTo" element
         */
        public void setEffectiveTo(java.util.Calendar effectiveTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$2);
                }
                target.setCalendarValue(effectiveTo);
            }
        }
        
        /**
         * Sets (as xml) the "effectiveTo" element
         */
        public void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$2);
                }
                target.set(effectiveTo);
            }
        }
        
        /**
         * Unsets the "effectiveTo" element
         */
        public void unsetEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EFFECTIVETO$2, 0);
            }
        }
    }
    /**
     * An XML deductibleGiftRecipient(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class DeductibleGiftRecipientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient
    {
        
        public DeductibleGiftRecipientImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DGRSTATUSCODE$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "DGRStatusCode");
        private static final javax.xml.namespace.QName EFFECTIVEFROM$2 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
        private static final javax.xml.namespace.QName EFFECTIVETO$4 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
        
        
        /**
         * Gets the "DGRStatusCode" element
         */
        public java.lang.String getDGRStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DGRSTATUSCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DGRStatusCode" element
         */
        public org.apache.xmlbeans.XmlString xgetDGRStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DGRSTATUSCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DGRStatusCode" element
         */
        public boolean isSetDGRStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DGRSTATUSCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "DGRStatusCode" element
         */
        public void setDGRStatusCode(java.lang.String dgrStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DGRSTATUSCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DGRSTATUSCODE$0);
                }
                target.setStringValue(dgrStatusCode);
            }
        }
        
        /**
         * Sets (as xml) the "DGRStatusCode" element
         */
        public void xsetDGRStatusCode(org.apache.xmlbeans.XmlString dgrStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DGRSTATUSCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DGRSTATUSCODE$0);
                }
                target.set(dgrStatusCode);
            }
        }
        
        /**
         * Unsets the "DGRStatusCode" element
         */
        public void unsetDGRStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DGRSTATUSCODE$0, 0);
            }
        }
        
        /**
         * Gets the "effectiveFrom" element
         */
        public java.util.Calendar getEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "effectiveFrom" element
         */
        public au.gov.asic.types.abn.DateType xgetEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "effectiveFrom" element
         */
        public boolean isSetEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EFFECTIVEFROM$2) != 0;
            }
        }
        
        /**
         * Sets the "effectiveFrom" element
         */
        public void setEffectiveFrom(java.util.Calendar effectiveFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$2);
                }
                target.setCalendarValue(effectiveFrom);
            }
        }
        
        /**
         * Sets (as xml) the "effectiveFrom" element
         */
        public void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$2);
                }
                target.set(effectiveFrom);
            }
        }
        
        /**
         * Unsets the "effectiveFrom" element
         */
        public void unsetEffectiveFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EFFECTIVEFROM$2, 0);
            }
        }
        
        /**
         * Gets the "effectiveTo" element
         */
        public java.util.Calendar getEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "effectiveTo" element
         */
        public au.gov.asic.types.abn.DateType xgetEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "effectiveTo" element
         */
        public boolean isSetEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EFFECTIVETO$4) != 0;
            }
        }
        
        /**
         * Sets the "effectiveTo" element
         */
        public void setEffectiveTo(java.util.Calendar effectiveTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$4);
                }
                target.setCalendarValue(effectiveTo);
            }
        }
        
        /**
         * Sets (as xml) the "effectiveTo" element
         */
        public void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.DateType target = null;
                target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$4, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$4);
                }
                target.set(effectiveTo);
            }
        }
        
        /**
         * Unsets the "effectiveTo" element
         */
        public void unsetEffectiveTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EFFECTIVETO$4, 0);
            }
        }
    }
    /**
     * An XML legalName(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class LegalNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.LegalName
    {
        
        public LegalNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATION$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisation");
        private static final javax.xml.namespace.QName INDIVIDUAL$2 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "individual");
        
        
        /**
         * Gets the "organisation" element
         */
        public au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation getOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "organisation" element
         */
        public boolean isSetOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATION$0) != 0;
            }
        }
        
        /**
         * Sets the "organisation" element
         */
        public void setOrganisation(au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation organisation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation)get_store().add_element_user(ORGANISATION$0);
                }
                target.set(organisation);
            }
        }
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        public au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation addNewOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation)get_store().add_element_user(ORGANISATION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "organisation" element
         */
        public void unsetOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATION$0, 0);
            }
        }
        
        /**
         * Gets the "individual" element
         */
        public au.gov.asic.types.abn.AbnRecordType.LegalName.Individual getIndividual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.LegalName.Individual target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Individual)get_store().find_element_user(INDIVIDUAL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "individual" element
         */
        public boolean isSetIndividual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDIVIDUAL$2) != 0;
            }
        }
        
        /**
         * Sets the "individual" element
         */
        public void setIndividual(au.gov.asic.types.abn.AbnRecordType.LegalName.Individual individual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.LegalName.Individual target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Individual)get_store().find_element_user(INDIVIDUAL$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Individual)get_store().add_element_user(INDIVIDUAL$2);
                }
                target.set(individual);
            }
        }
        
        /**
         * Appends and returns a new empty "individual" element
         */
        public au.gov.asic.types.abn.AbnRecordType.LegalName.Individual addNewIndividual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.LegalName.Individual target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.LegalName.Individual)get_store().add_element_user(INDIVIDUAL$2);
                return target;
            }
        }
        
        /**
         * Unsets the "individual" element
         */
        public void unsetIndividual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDIVIDUAL$2, 0);
            }
        }
        /**
         * An XML organisation(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class OrganisationImpl extends au.gov.asic.types.abn.impl.OrganisationNameTypeImpl implements au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation
        {
            
            public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML individual(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class IndividualImpl extends au.gov.asic.types.abn.impl.IndividualNameTypeImpl implements au.gov.asic.types.abn.AbnRecordType.LegalName.Individual
        {
            
            public IndividualImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
    /**
     * An XML mainTradingName(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class MainTradingNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.MainTradingName
    {
        
        public MainTradingNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATION$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisation");
        
        
        /**
         * Gets the "organisation" element
         */
        public au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation getOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organisation" element
         */
        public void setOrganisation(au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation organisation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation)get_store().add_element_user(ORGANISATION$0);
                }
                target.set(organisation);
            }
        }
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        public au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation addNewOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation)get_store().add_element_user(ORGANISATION$0);
                return target;
            }
        }
        /**
         * An XML organisation(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class OrganisationImpl extends au.gov.asic.types.abn.impl.OrganisationNameTypeImpl implements au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation
        {
            
            public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
    /**
     * An XML otherTradingName(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class OtherTradingNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.OtherTradingName
    {
        
        public OtherTradingNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATION$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisation");
        
        
        /**
         * Gets the "organisation" element
         */
        public au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation getOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organisation" element
         */
        public void setOrganisation(au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation organisation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation)get_store().find_element_user(ORGANISATION$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation)get_store().add_element_user(ORGANISATION$0);
                }
                target.set(organisation);
            }
        }
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        public au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation addNewOrganisation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation)get_store().add_element_user(ORGANISATION$0);
                return target;
            }
        }
        /**
         * An XML organisation(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class OrganisationImpl extends au.gov.asic.types.abn.impl.OrganisationNameTypeImpl implements au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation
        {
            
            public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
    /**
     * An XML associate(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class AssociateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.Associate
    {
        
        public AssociateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEGALNAME$0 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "legalName");
        private static final javax.xml.namespace.QName RELATIONSHIP$2 = 
            new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "relationship");
        
        
        /**
         * Gets the "legalName" element
         */
        public au.gov.asic.types.abn.AbnRecordType.Associate.LegalName getLegalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.LegalName target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName)get_store().find_element_user(LEGALNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "legalName" element
         */
        public void setLegalName(au.gov.asic.types.abn.AbnRecordType.Associate.LegalName legalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.LegalName target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName)get_store().find_element_user(LEGALNAME$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName)get_store().add_element_user(LEGALNAME$0);
                }
                target.set(legalName);
            }
        }
        
        /**
         * Appends and returns a new empty "legalName" element
         */
        public au.gov.asic.types.abn.AbnRecordType.Associate.LegalName addNewLegalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.LegalName target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName)get_store().add_element_user(LEGALNAME$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "relationship" elements
         */
        public au.gov.asic.types.abn.AbnRecordType.Associate.Relationship[] getRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RELATIONSHIP$2, targetList);
                au.gov.asic.types.abn.AbnRecordType.Associate.Relationship[] result = new au.gov.asic.types.abn.AbnRecordType.Associate.Relationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "relationship" element
         */
        public au.gov.asic.types.abn.AbnRecordType.Associate.Relationship getRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.Relationship target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.Relationship)get_store().find_element_user(RELATIONSHIP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "relationship" element
         */
        public int sizeOfRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATIONSHIP$2);
            }
        }
        
        /**
         * Sets array of all "relationship" element
         */
        public void setRelationshipArray(au.gov.asic.types.abn.AbnRecordType.Associate.Relationship[] relationshipArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(relationshipArray, RELATIONSHIP$2);
            }
        }
        
        /**
         * Sets ith "relationship" element
         */
        public void setRelationshipArray(int i, au.gov.asic.types.abn.AbnRecordType.Associate.Relationship relationship)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.Relationship target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.Relationship)get_store().find_element_user(RELATIONSHIP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(relationship);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relationship" element
         */
        public au.gov.asic.types.abn.AbnRecordType.Associate.Relationship insertNewRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.Relationship target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.Relationship)get_store().insert_element_user(RELATIONSHIP$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relationship" element
         */
        public au.gov.asic.types.abn.AbnRecordType.Associate.Relationship addNewRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.abn.AbnRecordType.Associate.Relationship target = null;
                target = (au.gov.asic.types.abn.AbnRecordType.Associate.Relationship)get_store().add_element_user(RELATIONSHIP$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "relationship" element
         */
        public void removeRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATIONSHIP$2, i);
            }
        }
        /**
         * An XML legalName(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class LegalNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.Associate.LegalName
        {
            
            public LegalNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INDIVIDUAL$0 = 
                new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "individual");
            private static final javax.xml.namespace.QName ORGANISATION$2 = 
                new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "organisation");
            
            
            /**
             * Gets the "individual" element
             */
            public au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual getIndividual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual target = null;
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual)get_store().find_element_user(INDIVIDUAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "individual" element
             */
            public boolean isSetIndividual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INDIVIDUAL$0) != 0;
                }
            }
            
            /**
             * Sets the "individual" element
             */
            public void setIndividual(au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual individual)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual target = null;
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual)get_store().find_element_user(INDIVIDUAL$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual)get_store().add_element_user(INDIVIDUAL$0);
                    }
                    target.set(individual);
                }
            }
            
            /**
             * Appends and returns a new empty "individual" element
             */
            public au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual addNewIndividual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual target = null;
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual)get_store().add_element_user(INDIVIDUAL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "individual" element
             */
            public void unsetIndividual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INDIVIDUAL$0, 0);
                }
            }
            
            /**
             * Gets the "organisation" element
             */
            public au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation getOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation target = null;
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation)get_store().find_element_user(ORGANISATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "organisation" element
             */
            public boolean isSetOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATION$2) != 0;
                }
            }
            
            /**
             * Sets the "organisation" element
             */
            public void setOrganisation(au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation organisation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation target = null;
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation)get_store().find_element_user(ORGANISATION$2, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation)get_store().add_element_user(ORGANISATION$2);
                    }
                    target.set(organisation);
                }
            }
            
            /**
             * Appends and returns a new empty "organisation" element
             */
            public au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation addNewOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation target = null;
                    target = (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation)get_store().add_element_user(ORGANISATION$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "organisation" element
             */
            public void unsetOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATION$2, 0);
                }
            }
            /**
             * An XML individual(@uri:abn.types.asic.gov.au).
             *
             * This is a complex type.
             */
            public static class IndividualImpl extends au.gov.asic.types.abn.impl.IndividualNameTypeImpl implements au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual
            {
                
                public IndividualImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
            /**
             * An XML organisation(@uri:abn.types.asic.gov.au).
             *
             * This is a complex type.
             */
            public static class OrganisationImpl extends au.gov.asic.types.abn.impl.OrganisationNameTypeImpl implements au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation
            {
                
                public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
        /**
         * An XML relationship(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class RelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.abn.AbnRecordType.Associate.Relationship
        {
            
            public RelationshipImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName POSITIONHELDCODE$0 = 
                new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "positionHeldCode");
            private static final javax.xml.namespace.QName EFFECTIVETO$2 = 
                new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveTo");
            private static final javax.xml.namespace.QName EFFECTIVEFROM$4 = 
                new javax.xml.namespace.QName("uri:abn.types.asic.gov.au", "effectiveFrom");
            
            
            /**
             * Gets the "positionHeldCode" element
             */
            public java.lang.String getPositionHeldCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITIONHELDCODE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "positionHeldCode" element
             */
            public au.gov.asic.types.abn.PositionHeldCodeType xgetPositionHeldCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.PositionHeldCodeType target = null;
                    target = (au.gov.asic.types.abn.PositionHeldCodeType)get_store().find_element_user(POSITIONHELDCODE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "positionHeldCode" element
             */
            public void setPositionHeldCode(java.lang.String positionHeldCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITIONHELDCODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITIONHELDCODE$0);
                    }
                    target.setStringValue(positionHeldCode);
                }
            }
            
            /**
             * Sets (as xml) the "positionHeldCode" element
             */
            public void xsetPositionHeldCode(au.gov.asic.types.abn.PositionHeldCodeType positionHeldCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.PositionHeldCodeType target = null;
                    target = (au.gov.asic.types.abn.PositionHeldCodeType)get_store().find_element_user(POSITIONHELDCODE$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.abn.PositionHeldCodeType)get_store().add_element_user(POSITIONHELDCODE$0);
                    }
                    target.set(positionHeldCode);
                }
            }
            
            /**
             * Gets the "effectiveTo" element
             */
            public java.util.Calendar getEffectiveTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "effectiveTo" element
             */
            public au.gov.asic.types.abn.DateType xgetEffectiveTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.DateType target = null;
                    target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "effectiveTo" element
             */
            public boolean isSetEffectiveTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EFFECTIVETO$2) != 0;
                }
            }
            
            /**
             * Sets the "effectiveTo" element
             */
            public void setEffectiveTo(java.util.Calendar effectiveTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVETO$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVETO$2);
                    }
                    target.setCalendarValue(effectiveTo);
                }
            }
            
            /**
             * Sets (as xml) the "effectiveTo" element
             */
            public void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.DateType target = null;
                    target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVETO$2, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVETO$2);
                    }
                    target.set(effectiveTo);
                }
            }
            
            /**
             * Unsets the "effectiveTo" element
             */
            public void unsetEffectiveTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EFFECTIVETO$2, 0);
                }
            }
            
            /**
             * Gets the "effectiveFrom" element
             */
            public java.util.Calendar getEffectiveFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "effectiveFrom" element
             */
            public au.gov.asic.types.abn.DateType xgetEffectiveFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.DateType target = null;
                    target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "effectiveFrom" element
             */
            public boolean isSetEffectiveFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EFFECTIVEFROM$4) != 0;
                }
            }
            
            /**
             * Sets the "effectiveFrom" element
             */
            public void setEffectiveFrom(java.util.Calendar effectiveFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEFROM$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEFROM$4);
                    }
                    target.setCalendarValue(effectiveFrom);
                }
            }
            
            /**
             * Sets (as xml) the "effectiveFrom" element
             */
            public void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.abn.DateType target = null;
                    target = (au.gov.asic.types.abn.DateType)get_store().find_element_user(EFFECTIVEFROM$4, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.abn.DateType)get_store().add_element_user(EFFECTIVEFROM$4);
                    }
                    target.set(effectiveFrom);
                }
            }
            
            /**
             * Unsets the "effectiveFrom" element
             */
            public void unsetEffectiveFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EFFECTIVEFROM$4, 0);
                }
            }
        }
    }
}
