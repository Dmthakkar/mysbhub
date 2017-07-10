/*
 * XML Type:  abnRecordType
 * Namespace: uri:abn.types.asic.gov.au
 * Java type: au.gov.asic.types.abn.AbnRecordType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.abn;


/**
 * An XML abnRecordType(@uri:abn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public interface AbnRecordType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbnRecordType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("abnrecordtype4ae1type");
    
    /**
     * Gets array of all "ABN" elements
     */
    au.gov.asic.types.abn.IdentifierType[] getABNArray();
    
    /**
     * Gets ith "ABN" element
     */
    au.gov.asic.types.abn.IdentifierType getABNArray(int i);
    
    /**
     * Returns number of "ABN" element
     */
    int sizeOfABNArray();
    
    /**
     * Sets array of all "ABN" element
     */
    void setABNArray(au.gov.asic.types.abn.IdentifierType[] abnArray);
    
    /**
     * Sets ith "ABN" element
     */
    void setABNArray(int i, au.gov.asic.types.abn.IdentifierType abn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ABN" element
     */
    au.gov.asic.types.abn.IdentifierType insertNewABN(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ABN" element
     */
    au.gov.asic.types.abn.IdentifierType addNewABN();
    
    /**
     * Removes the ith "ABN" element
     */
    void removeABN(int i);
    
    /**
     * Gets array of all "ACN" elements
     */
    au.gov.asic.types.abn.IdentifierType[] getACNArray();
    
    /**
     * Gets ith "ACN" element
     */
    au.gov.asic.types.abn.IdentifierType getACNArray(int i);
    
    /**
     * Returns number of "ACN" element
     */
    int sizeOfACNArray();
    
    /**
     * Sets array of all "ACN" element
     */
    void setACNArray(au.gov.asic.types.abn.IdentifierType[] acnArray);
    
    /**
     * Sets ith "ACN" element
     */
    void setACNArray(int i, au.gov.asic.types.abn.IdentifierType acn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ACN" element
     */
    au.gov.asic.types.abn.IdentifierType insertNewACN(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ACN" element
     */
    au.gov.asic.types.abn.IdentifierType addNewACN();
    
    /**
     * Removes the ith "ACN" element
     */
    void removeACN(int i);
    
    /**
     * Gets array of all "ANZSIC" elements
     */
    au.gov.asic.types.abn.AbnRecordType.ANZSIC[] getANZSICArray();
    
    /**
     * Gets ith "ANZSIC" element
     */
    au.gov.asic.types.abn.AbnRecordType.ANZSIC getANZSICArray(int i);
    
    /**
     * Returns number of "ANZSIC" element
     */
    int sizeOfANZSICArray();
    
    /**
     * Sets array of all "ANZSIC" element
     */
    void setANZSICArray(au.gov.asic.types.abn.AbnRecordType.ANZSIC[] anzsicArray);
    
    /**
     * Sets ith "ANZSIC" element
     */
    void setANZSICArray(int i, au.gov.asic.types.abn.AbnRecordType.ANZSIC anzsic);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ANZSIC" element
     */
    au.gov.asic.types.abn.AbnRecordType.ANZSIC insertNewANZSIC(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ANZSIC" element
     */
    au.gov.asic.types.abn.AbnRecordType.ANZSIC addNewANZSIC();
    
    /**
     * Removes the ith "ANZSIC" element
     */
    void removeANZSIC(int i);
    
    /**
     * Gets array of all "entityType" elements
     */
    java.lang.String[] getEntityTypeArray();
    
    /**
     * Gets ith "entityType" element
     */
    java.lang.String getEntityTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "entityType" elements
     */
    au.gov.asic.types.abn.EntityTypeType[] xgetEntityTypeArray();
    
    /**
     * Gets (as xml) ith "entityType" element
     */
    au.gov.asic.types.abn.EntityTypeType xgetEntityTypeArray(int i);
    
    /**
     * Returns number of "entityType" element
     */
    int sizeOfEntityTypeArray();
    
    /**
     * Sets array of all "entityType" element
     */
    void setEntityTypeArray(java.lang.String[] entityTypeArray);
    
    /**
     * Sets ith "entityType" element
     */
    void setEntityTypeArray(int i, java.lang.String entityType);
    
    /**
     * Sets (as xml) array of all "entityType" element
     */
    void xsetEntityTypeArray(au.gov.asic.types.abn.EntityTypeType[] entityTypeArray);
    
    /**
     * Sets (as xml) ith "entityType" element
     */
    void xsetEntityTypeArray(int i, au.gov.asic.types.abn.EntityTypeType entityType);
    
    /**
     * Inserts the value as the ith "entityType" element
     */
    void insertEntityType(int i, java.lang.String entityType);
    
    /**
     * Appends the value as the last "entityType" element
     */
    void addEntityType(java.lang.String entityType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityType" element
     */
    au.gov.asic.types.abn.EntityTypeType insertNewEntityType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entityType" element
     */
    au.gov.asic.types.abn.EntityTypeType addNewEntityType();
    
    /**
     * Removes the ith "entityType" element
     */
    void removeEntityType(int i);
    
    /**
     * Gets array of all "goodsAndServicesTax" elements
     */
    au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax[] getGoodsAndServicesTaxArray();
    
    /**
     * Gets ith "goodsAndServicesTax" element
     */
    au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax getGoodsAndServicesTaxArray(int i);
    
    /**
     * Returns number of "goodsAndServicesTax" element
     */
    int sizeOfGoodsAndServicesTaxArray();
    
    /**
     * Sets array of all "goodsAndServicesTax" element
     */
    void setGoodsAndServicesTaxArray(au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax[] goodsAndServicesTaxArray);
    
    /**
     * Sets ith "goodsAndServicesTax" element
     */
    void setGoodsAndServicesTaxArray(int i, au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax goodsAndServicesTax);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "goodsAndServicesTax" element
     */
    au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax insertNewGoodsAndServicesTax(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "goodsAndServicesTax" element
     */
    au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax addNewGoodsAndServicesTax();
    
    /**
     * Removes the ith "goodsAndServicesTax" element
     */
    void removeGoodsAndServicesTax(int i);
    
    /**
     * Gets array of all "deductibleGiftRecipient" elements
     */
    au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient[] getDeductibleGiftRecipientArray();
    
    /**
     * Gets ith "deductibleGiftRecipient" element
     */
    au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient getDeductibleGiftRecipientArray(int i);
    
    /**
     * Returns number of "deductibleGiftRecipient" element
     */
    int sizeOfDeductibleGiftRecipientArray();
    
    /**
     * Sets array of all "deductibleGiftRecipient" element
     */
    void setDeductibleGiftRecipientArray(au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient[] deductibleGiftRecipientArray);
    
    /**
     * Sets ith "deductibleGiftRecipient" element
     */
    void setDeductibleGiftRecipientArray(int i, au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient deductibleGiftRecipient);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deductibleGiftRecipient" element
     */
    au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient insertNewDeductibleGiftRecipient(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deductibleGiftRecipient" element
     */
    au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient addNewDeductibleGiftRecipient();
    
    /**
     * Removes the ith "deductibleGiftRecipient" element
     */
    void removeDeductibleGiftRecipient(int i);
    
    /**
     * Gets array of all "legalName" elements
     */
    au.gov.asic.types.abn.AbnRecordType.LegalName[] getLegalNameArray();
    
    /**
     * Gets ith "legalName" element
     */
    au.gov.asic.types.abn.AbnRecordType.LegalName getLegalNameArray(int i);
    
    /**
     * Returns number of "legalName" element
     */
    int sizeOfLegalNameArray();
    
    /**
     * Sets array of all "legalName" element
     */
    void setLegalNameArray(au.gov.asic.types.abn.AbnRecordType.LegalName[] legalNameArray);
    
    /**
     * Sets ith "legalName" element
     */
    void setLegalNameArray(int i, au.gov.asic.types.abn.AbnRecordType.LegalName legalName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalName" element
     */
    au.gov.asic.types.abn.AbnRecordType.LegalName insertNewLegalName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalName" element
     */
    au.gov.asic.types.abn.AbnRecordType.LegalName addNewLegalName();
    
    /**
     * Removes the ith "legalName" element
     */
    void removeLegalName(int i);
    
    /**
     * Gets array of all "mainTradingName" elements
     */
    au.gov.asic.types.abn.AbnRecordType.MainTradingName[] getMainTradingNameArray();
    
    /**
     * Gets ith "mainTradingName" element
     */
    au.gov.asic.types.abn.AbnRecordType.MainTradingName getMainTradingNameArray(int i);
    
    /**
     * Returns number of "mainTradingName" element
     */
    int sizeOfMainTradingNameArray();
    
    /**
     * Sets array of all "mainTradingName" element
     */
    void setMainTradingNameArray(au.gov.asic.types.abn.AbnRecordType.MainTradingName[] mainTradingNameArray);
    
    /**
     * Sets ith "mainTradingName" element
     */
    void setMainTradingNameArray(int i, au.gov.asic.types.abn.AbnRecordType.MainTradingName mainTradingName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mainTradingName" element
     */
    au.gov.asic.types.abn.AbnRecordType.MainTradingName insertNewMainTradingName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mainTradingName" element
     */
    au.gov.asic.types.abn.AbnRecordType.MainTradingName addNewMainTradingName();
    
    /**
     * Removes the ith "mainTradingName" element
     */
    void removeMainTradingName(int i);
    
    /**
     * Gets array of all "otherTradingName" elements
     */
    au.gov.asic.types.abn.AbnRecordType.OtherTradingName[] getOtherTradingNameArray();
    
    /**
     * Gets ith "otherTradingName" element
     */
    au.gov.asic.types.abn.AbnRecordType.OtherTradingName getOtherTradingNameArray(int i);
    
    /**
     * Returns number of "otherTradingName" element
     */
    int sizeOfOtherTradingNameArray();
    
    /**
     * Sets array of all "otherTradingName" element
     */
    void setOtherTradingNameArray(au.gov.asic.types.abn.AbnRecordType.OtherTradingName[] otherTradingNameArray);
    
    /**
     * Sets ith "otherTradingName" element
     */
    void setOtherTradingNameArray(int i, au.gov.asic.types.abn.AbnRecordType.OtherTradingName otherTradingName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "otherTradingName" element
     */
    au.gov.asic.types.abn.AbnRecordType.OtherTradingName insertNewOtherTradingName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "otherTradingName" element
     */
    au.gov.asic.types.abn.AbnRecordType.OtherTradingName addNewOtherTradingName();
    
    /**
     * Removes the ith "otherTradingName" element
     */
    void removeOtherTradingName(int i);
    
    /**
     * Gets array of all "serviceOfNoticePhysicalAddress" elements
     */
    au.gov.asic.types.abn.GeographicType[] getServiceOfNoticePhysicalAddressArray();
    
    /**
     * Gets ith "serviceOfNoticePhysicalAddress" element
     */
    au.gov.asic.types.abn.GeographicType getServiceOfNoticePhysicalAddressArray(int i);
    
    /**
     * Returns number of "serviceOfNoticePhysicalAddress" element
     */
    int sizeOfServiceOfNoticePhysicalAddressArray();
    
    /**
     * Sets array of all "serviceOfNoticePhysicalAddress" element
     */
    void setServiceOfNoticePhysicalAddressArray(au.gov.asic.types.abn.GeographicType[] serviceOfNoticePhysicalAddressArray);
    
    /**
     * Sets ith "serviceOfNoticePhysicalAddress" element
     */
    void setServiceOfNoticePhysicalAddressArray(int i, au.gov.asic.types.abn.GeographicType serviceOfNoticePhysicalAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceOfNoticePhysicalAddress" element
     */
    au.gov.asic.types.abn.GeographicType insertNewServiceOfNoticePhysicalAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceOfNoticePhysicalAddress" element
     */
    au.gov.asic.types.abn.GeographicType addNewServiceOfNoticePhysicalAddress();
    
    /**
     * Removes the ith "serviceOfNoticePhysicalAddress" element
     */
    void removeServiceOfNoticePhysicalAddress(int i);
    
    /**
     * Gets array of all "serviceOfNoticeEmailAddress" elements
     */
    au.gov.asic.types.abn.AbnEmailType[] getServiceOfNoticeEmailAddressArray();
    
    /**
     * Gets ith "serviceOfNoticeEmailAddress" element
     */
    au.gov.asic.types.abn.AbnEmailType getServiceOfNoticeEmailAddressArray(int i);
    
    /**
     * Returns number of "serviceOfNoticeEmailAddress" element
     */
    int sizeOfServiceOfNoticeEmailAddressArray();
    
    /**
     * Sets array of all "serviceOfNoticeEmailAddress" element
     */
    void setServiceOfNoticeEmailAddressArray(au.gov.asic.types.abn.AbnEmailType[] serviceOfNoticeEmailAddressArray);
    
    /**
     * Sets ith "serviceOfNoticeEmailAddress" element
     */
    void setServiceOfNoticeEmailAddressArray(int i, au.gov.asic.types.abn.AbnEmailType serviceOfNoticeEmailAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceOfNoticeEmailAddress" element
     */
    au.gov.asic.types.abn.AbnEmailType insertNewServiceOfNoticeEmailAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceOfNoticeEmailAddress" element
     */
    au.gov.asic.types.abn.AbnEmailType addNewServiceOfNoticeEmailAddress();
    
    /**
     * Removes the ith "serviceOfNoticeEmailAddress" element
     */
    void removeServiceOfNoticeEmailAddress(int i);
    
    /**
     * Gets array of all "mainBusinessPhysicalAddress" elements
     */
    au.gov.asic.types.abn.GeographicType[] getMainBusinessPhysicalAddressArray();
    
    /**
     * Gets ith "mainBusinessPhysicalAddress" element
     */
    au.gov.asic.types.abn.GeographicType getMainBusinessPhysicalAddressArray(int i);
    
    /**
     * Returns number of "mainBusinessPhysicalAddress" element
     */
    int sizeOfMainBusinessPhysicalAddressArray();
    
    /**
     * Sets array of all "mainBusinessPhysicalAddress" element
     */
    void setMainBusinessPhysicalAddressArray(au.gov.asic.types.abn.GeographicType[] mainBusinessPhysicalAddressArray);
    
    /**
     * Sets ith "mainBusinessPhysicalAddress" element
     */
    void setMainBusinessPhysicalAddressArray(int i, au.gov.asic.types.abn.GeographicType mainBusinessPhysicalAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mainBusinessPhysicalAddress" element
     */
    au.gov.asic.types.abn.GeographicType insertNewMainBusinessPhysicalAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mainBusinessPhysicalAddress" element
     */
    au.gov.asic.types.abn.GeographicType addNewMainBusinessPhysicalAddress();
    
    /**
     * Removes the ith "mainBusinessPhysicalAddress" element
     */
    void removeMainBusinessPhysicalAddress(int i);
    
    /**
     * Gets array of all "associate" elements
     */
    au.gov.asic.types.abn.AbnRecordType.Associate[] getAssociateArray();
    
    /**
     * Gets ith "associate" element
     */
    au.gov.asic.types.abn.AbnRecordType.Associate getAssociateArray(int i);
    
    /**
     * Returns number of "associate" element
     */
    int sizeOfAssociateArray();
    
    /**
     * Sets array of all "associate" element
     */
    void setAssociateArray(au.gov.asic.types.abn.AbnRecordType.Associate[] associateArray);
    
    /**
     * Sets ith "associate" element
     */
    void setAssociateArray(int i, au.gov.asic.types.abn.AbnRecordType.Associate associate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "associate" element
     */
    au.gov.asic.types.abn.AbnRecordType.Associate insertNewAssociate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "associate" element
     */
    au.gov.asic.types.abn.AbnRecordType.Associate addNewAssociate();
    
    /**
     * Removes the ith "associate" element
     */
    void removeAssociate(int i);
    
    /**
     * Gets the "suppressionIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType.Enum getSuppressionIndicator();
    
    /**
     * Gets (as xml) the "suppressionIndicator" element
     */
    au.gov.asic.types.abn.IndicatorType xgetSuppressionIndicator();
    
    /**
     * True if has "suppressionIndicator" element
     */
    boolean isSetSuppressionIndicator();
    
    /**
     * Sets the "suppressionIndicator" element
     */
    void setSuppressionIndicator(au.gov.asic.types.abn.IndicatorType.Enum suppressionIndicator);
    
    /**
     * Sets (as xml) the "suppressionIndicator" element
     */
    void xsetSuppressionIndicator(au.gov.asic.types.abn.IndicatorType suppressionIndicator);
    
    /**
     * Unsets the "suppressionIndicator" element
     */
    void unsetSuppressionIndicator();
    
    /**
     * An XML ANZSIC(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface ANZSIC extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ANZSIC.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("anzsic223delemtype");
        
        /**
         * Gets the "mainActivityDescription" element
         */
        java.lang.String getMainActivityDescription();
        
        /**
         * Gets (as xml) the "mainActivityDescription" element
         */
        au.gov.asic.types.abn.ANZSICdescriptionType xgetMainActivityDescription();
        
        /**
         * Sets the "mainActivityDescription" element
         */
        void setMainActivityDescription(java.lang.String mainActivityDescription);
        
        /**
         * Sets (as xml) the "mainActivityDescription" element
         */
        void xsetMainActivityDescription(au.gov.asic.types.abn.ANZSICdescriptionType mainActivityDescription);
        
        /**
         * Gets the "mainIndustryCode" element
         */
        java.lang.String getMainIndustryCode();
        
        /**
         * Gets (as xml) the "mainIndustryCode" element
         */
        au.gov.asic.types.abn.ANZSICCodeType xgetMainIndustryCode();
        
        /**
         * Sets the "mainIndustryCode" element
         */
        void setMainIndustryCode(java.lang.String mainIndustryCode);
        
        /**
         * Sets (as xml) the "mainIndustryCode" element
         */
        void xsetMainIndustryCode(au.gov.asic.types.abn.ANZSICCodeType mainIndustryCode);
        
        /**
         * Gets the "code" element
         */
        java.lang.String getCode();
        
        /**
         * Gets (as xml) the "code" element
         */
        au.gov.asic.types.abn.ANZSICCodeType xgetCode();
        
        /**
         * Sets the "code" element
         */
        void setCode(java.lang.String code);
        
        /**
         * Sets (as xml) the "code" element
         */
        void xsetCode(au.gov.asic.types.abn.ANZSICCodeType code);
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        au.gov.asic.types.abn.ANZSICdescriptionType xgetDescription();
        
        /**
         * True if has "description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(au.gov.asic.types.abn.ANZSICdescriptionType description);
        
        /**
         * Unsets the "description" element
         */
        void unsetDescription();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.ANZSIC newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.ANZSIC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.ANZSIC newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.ANZSIC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML goodsAndServicesTax(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface GoodsAndServicesTax extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoodsAndServicesTax.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("goodsandservicestax6e59elemtype");
        
        /**
         * Gets the "effectiveFrom" element
         */
        java.util.Calendar getEffectiveFrom();
        
        /**
         * Gets (as xml) the "effectiveFrom" element
         */
        au.gov.asic.types.abn.DateType xgetEffectiveFrom();
        
        /**
         * True if has "effectiveFrom" element
         */
        boolean isSetEffectiveFrom();
        
        /**
         * Sets the "effectiveFrom" element
         */
        void setEffectiveFrom(java.util.Calendar effectiveFrom);
        
        /**
         * Sets (as xml) the "effectiveFrom" element
         */
        void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom);
        
        /**
         * Unsets the "effectiveFrom" element
         */
        void unsetEffectiveFrom();
        
        /**
         * Gets the "effectiveTo" element
         */
        java.util.Calendar getEffectiveTo();
        
        /**
         * Gets (as xml) the "effectiveTo" element
         */
        au.gov.asic.types.abn.DateType xgetEffectiveTo();
        
        /**
         * True if has "effectiveTo" element
         */
        boolean isSetEffectiveTo();
        
        /**
         * Sets the "effectiveTo" element
         */
        void setEffectiveTo(java.util.Calendar effectiveTo);
        
        /**
         * Sets (as xml) the "effectiveTo" element
         */
        void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo);
        
        /**
         * Unsets the "effectiveTo" element
         */
        void unsetEffectiveTo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.GoodsAndServicesTax) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML deductibleGiftRecipient(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface DeductibleGiftRecipient extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeductibleGiftRecipient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("deductiblegiftrecipientbc81elemtype");
        
        /**
         * Gets the "DGRStatusCode" element
         */
        java.lang.String getDGRStatusCode();
        
        /**
         * Gets (as xml) the "DGRStatusCode" element
         */
        org.apache.xmlbeans.XmlString xgetDGRStatusCode();
        
        /**
         * True if has "DGRStatusCode" element
         */
        boolean isSetDGRStatusCode();
        
        /**
         * Sets the "DGRStatusCode" element
         */
        void setDGRStatusCode(java.lang.String dgrStatusCode);
        
        /**
         * Sets (as xml) the "DGRStatusCode" element
         */
        void xsetDGRStatusCode(org.apache.xmlbeans.XmlString dgrStatusCode);
        
        /**
         * Unsets the "DGRStatusCode" element
         */
        void unsetDGRStatusCode();
        
        /**
         * Gets the "effectiveFrom" element
         */
        java.util.Calendar getEffectiveFrom();
        
        /**
         * Gets (as xml) the "effectiveFrom" element
         */
        au.gov.asic.types.abn.DateType xgetEffectiveFrom();
        
        /**
         * True if has "effectiveFrom" element
         */
        boolean isSetEffectiveFrom();
        
        /**
         * Sets the "effectiveFrom" element
         */
        void setEffectiveFrom(java.util.Calendar effectiveFrom);
        
        /**
         * Sets (as xml) the "effectiveFrom" element
         */
        void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom);
        
        /**
         * Unsets the "effectiveFrom" element
         */
        void unsetEffectiveFrom();
        
        /**
         * Gets the "effectiveTo" element
         */
        java.util.Calendar getEffectiveTo();
        
        /**
         * Gets (as xml) the "effectiveTo" element
         */
        au.gov.asic.types.abn.DateType xgetEffectiveTo();
        
        /**
         * True if has "effectiveTo" element
         */
        boolean isSetEffectiveTo();
        
        /**
         * Sets the "effectiveTo" element
         */
        void setEffectiveTo(java.util.Calendar effectiveTo);
        
        /**
         * Sets (as xml) the "effectiveTo" element
         */
        void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo);
        
        /**
         * Unsets the "effectiveTo" element
         */
        void unsetEffectiveTo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.DeductibleGiftRecipient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML legalName(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface LegalName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LegalName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("legalname9631elemtype");
        
        /**
         * Gets the "organisation" element
         */
        au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation getOrganisation();
        
        /**
         * True if has "organisation" element
         */
        boolean isSetOrganisation();
        
        /**
         * Sets the "organisation" element
         */
        void setOrganisation(au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation organisation);
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation addNewOrganisation();
        
        /**
         * Unsets the "organisation" element
         */
        void unsetOrganisation();
        
        /**
         * Gets the "individual" element
         */
        au.gov.asic.types.abn.AbnRecordType.LegalName.Individual getIndividual();
        
        /**
         * True if has "individual" element
         */
        boolean isSetIndividual();
        
        /**
         * Sets the "individual" element
         */
        void setIndividual(au.gov.asic.types.abn.AbnRecordType.LegalName.Individual individual);
        
        /**
         * Appends and returns a new empty "individual" element
         */
        au.gov.asic.types.abn.AbnRecordType.LegalName.Individual addNewIndividual();
        
        /**
         * Unsets the "individual" element
         */
        void unsetIndividual();
        
        /**
         * An XML organisation(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Organisation extends au.gov.asic.types.abn.OrganisationNameType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisation0727elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation newInstance() {
                  return (au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.abn.AbnRecordType.LegalName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML individual(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Individual extends au.gov.asic.types.abn.IndividualNameType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Individual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("individual49a6elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.abn.AbnRecordType.LegalName.Individual newInstance() {
                  return (au.gov.asic.types.abn.AbnRecordType.LegalName.Individual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.abn.AbnRecordType.LegalName.Individual newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.abn.AbnRecordType.LegalName.Individual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.LegalName newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.LegalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.LegalName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.LegalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML mainTradingName(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface MainTradingName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainTradingName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("maintradingname0060elemtype");
        
        /**
         * Gets the "organisation" element
         */
        au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation getOrganisation();
        
        /**
         * Sets the "organisation" element
         */
        void setOrganisation(au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation organisation);
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation addNewOrganisation();
        
        /**
         * An XML organisation(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Organisation extends au.gov.asic.types.abn.OrganisationNameType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisation60d6elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation newInstance() {
                  return (au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.abn.AbnRecordType.MainTradingName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.MainTradingName newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.MainTradingName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.MainTradingName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.MainTradingName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML otherTradingName(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface OtherTradingName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtherTradingName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("othertradingname1799elemtype");
        
        /**
         * Gets the "organisation" element
         */
        au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation getOrganisation();
        
        /**
         * Sets the "organisation" element
         */
        void setOrganisation(au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation organisation);
        
        /**
         * Appends and returns a new empty "organisation" element
         */
        au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation addNewOrganisation();
        
        /**
         * An XML organisation(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Organisation extends au.gov.asic.types.abn.OrganisationNameType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisationc5e3elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation newInstance() {
                  return (au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.abn.AbnRecordType.OtherTradingName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.OtherTradingName newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.OtherTradingName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.OtherTradingName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.OtherTradingName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML associate(@uri:abn.types.asic.gov.au).
     *
     * This is a complex type.
     */
    public interface Associate extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Associate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("associateefebelemtype");
        
        /**
         * Gets the "legalName" element
         */
        au.gov.asic.types.abn.AbnRecordType.Associate.LegalName getLegalName();
        
        /**
         * Sets the "legalName" element
         */
        void setLegalName(au.gov.asic.types.abn.AbnRecordType.Associate.LegalName legalName);
        
        /**
         * Appends and returns a new empty "legalName" element
         */
        au.gov.asic.types.abn.AbnRecordType.Associate.LegalName addNewLegalName();
        
        /**
         * Gets array of all "relationship" elements
         */
        au.gov.asic.types.abn.AbnRecordType.Associate.Relationship[] getRelationshipArray();
        
        /**
         * Gets ith "relationship" element
         */
        au.gov.asic.types.abn.AbnRecordType.Associate.Relationship getRelationshipArray(int i);
        
        /**
         * Returns number of "relationship" element
         */
        int sizeOfRelationshipArray();
        
        /**
         * Sets array of all "relationship" element
         */
        void setRelationshipArray(au.gov.asic.types.abn.AbnRecordType.Associate.Relationship[] relationshipArray);
        
        /**
         * Sets ith "relationship" element
         */
        void setRelationshipArray(int i, au.gov.asic.types.abn.AbnRecordType.Associate.Relationship relationship);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relationship" element
         */
        au.gov.asic.types.abn.AbnRecordType.Associate.Relationship insertNewRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relationship" element
         */
        au.gov.asic.types.abn.AbnRecordType.Associate.Relationship addNewRelationship();
        
        /**
         * Removes the ith "relationship" element
         */
        void removeRelationship(int i);
        
        /**
         * An XML legalName(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface LegalName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LegalName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("legalnamec33belemtype");
            
            /**
             * Gets the "individual" element
             */
            au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual getIndividual();
            
            /**
             * True if has "individual" element
             */
            boolean isSetIndividual();
            
            /**
             * Sets the "individual" element
             */
            void setIndividual(au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual individual);
            
            /**
             * Appends and returns a new empty "individual" element
             */
            au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual addNewIndividual();
            
            /**
             * Unsets the "individual" element
             */
            void unsetIndividual();
            
            /**
             * Gets the "organisation" element
             */
            au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation getOrganisation();
            
            /**
             * True if has "organisation" element
             */
            boolean isSetOrganisation();
            
            /**
             * Sets the "organisation" element
             */
            void setOrganisation(au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation organisation);
            
            /**
             * Appends and returns a new empty "organisation" element
             */
            au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation addNewOrganisation();
            
            /**
             * Unsets the "organisation" element
             */
            void unsetOrganisation();
            
            /**
             * An XML individual(@uri:abn.types.asic.gov.au).
             *
             * This is a complex type.
             */
            public interface Individual extends au.gov.asic.types.abn.IndividualNameType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Individual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("individualef30elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual newInstance() {
                      return (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Individual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML organisation(@uri:abn.types.asic.gov.au).
             *
             * This is a complex type.
             */
            public interface Organisation extends au.gov.asic.types.abn.OrganisationNameType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("organisation7331elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation newInstance() {
                      return (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.abn.AbnRecordType.Associate.LegalName newInstance() {
                  return (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.abn.AbnRecordType.Associate.LegalName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.abn.AbnRecordType.Associate.LegalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML relationship(@uri:abn.types.asic.gov.au).
         *
         * This is a complex type.
         */
        public interface Relationship extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Relationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB641DC28868661DEB138B69AE9EE6852").resolveHandle("relationship63bfelemtype");
            
            /**
             * Gets the "positionHeldCode" element
             */
            java.lang.String getPositionHeldCode();
            
            /**
             * Gets (as xml) the "positionHeldCode" element
             */
            au.gov.asic.types.abn.PositionHeldCodeType xgetPositionHeldCode();
            
            /**
             * Sets the "positionHeldCode" element
             */
            void setPositionHeldCode(java.lang.String positionHeldCode);
            
            /**
             * Sets (as xml) the "positionHeldCode" element
             */
            void xsetPositionHeldCode(au.gov.asic.types.abn.PositionHeldCodeType positionHeldCode);
            
            /**
             * Gets the "effectiveTo" element
             */
            java.util.Calendar getEffectiveTo();
            
            /**
             * Gets (as xml) the "effectiveTo" element
             */
            au.gov.asic.types.abn.DateType xgetEffectiveTo();
            
            /**
             * True if has "effectiveTo" element
             */
            boolean isSetEffectiveTo();
            
            /**
             * Sets the "effectiveTo" element
             */
            void setEffectiveTo(java.util.Calendar effectiveTo);
            
            /**
             * Sets (as xml) the "effectiveTo" element
             */
            void xsetEffectiveTo(au.gov.asic.types.abn.DateType effectiveTo);
            
            /**
             * Unsets the "effectiveTo" element
             */
            void unsetEffectiveTo();
            
            /**
             * Gets the "effectiveFrom" element
             */
            java.util.Calendar getEffectiveFrom();
            
            /**
             * Gets (as xml) the "effectiveFrom" element
             */
            au.gov.asic.types.abn.DateType xgetEffectiveFrom();
            
            /**
             * True if has "effectiveFrom" element
             */
            boolean isSetEffectiveFrom();
            
            /**
             * Sets the "effectiveFrom" element
             */
            void setEffectiveFrom(java.util.Calendar effectiveFrom);
            
            /**
             * Sets (as xml) the "effectiveFrom" element
             */
            void xsetEffectiveFrom(au.gov.asic.types.abn.DateType effectiveFrom);
            
            /**
             * Unsets the "effectiveFrom" element
             */
            void unsetEffectiveFrom();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static au.gov.asic.types.abn.AbnRecordType.Associate.Relationship newInstance() {
                  return (au.gov.asic.types.abn.AbnRecordType.Associate.Relationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static au.gov.asic.types.abn.AbnRecordType.Associate.Relationship newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (au.gov.asic.types.abn.AbnRecordType.Associate.Relationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.gov.asic.types.abn.AbnRecordType.Associate newInstance() {
              return (au.gov.asic.types.abn.AbnRecordType.Associate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.gov.asic.types.abn.AbnRecordType.Associate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.gov.asic.types.abn.AbnRecordType.Associate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.gov.asic.types.abn.AbnRecordType newInstance() {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.gov.asic.types.abn.AbnRecordType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.gov.asic.types.abn.AbnRecordType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.gov.asic.types.abn.AbnRecordType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.AbnRecordType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.gov.asic.types.abn.AbnRecordType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.gov.asic.types.abn.AbnRecordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
