/*
 * XML Type:  reportDataType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.ReportDataType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML reportDataType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ReportDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.ReportDataType
{
    
    public ReportDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTIDENTIFIER$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "reportIdentifier");
    private static final javax.xml.namespace.QName REPORTTYPE$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "reportType");
    private static final javax.xml.namespace.QName CREATEDATE$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "createDate");
    private static final javax.xml.namespace.QName REPORTPERIOD$6 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "reportPeriod");
    private static final javax.xml.namespace.QName STATE$8 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "state");
    private static final javax.xml.namespace.QName REPORTSIZE$10 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "reportSize");
    
    
    /**
     * Gets the "reportIdentifier" element
     */
    public long getReportIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTIDENTIFIER$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportIdentifier" element
     */
    public au.gov.asic.types.ReferenceNoType xgetReportIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(REPORTIDENTIFIER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reportIdentifier" element
     */
    public void setReportIdentifier(long reportIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTIDENTIFIER$0);
            }
            target.setLongValue(reportIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "reportIdentifier" element
     */
    public void xsetReportIdentifier(au.gov.asic.types.ReferenceNoType reportIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.ReferenceNoType target = null;
            target = (au.gov.asic.types.ReferenceNoType)get_store().find_element_user(REPORTIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.ReferenceNoType)get_store().add_element_user(REPORTIDENTIFIER$0);
            }
            target.set(reportIdentifier);
        }
    }
    
    /**
     * Gets the "reportType" element
     */
    public au.gov.asic.types.bn.BnReportType.Enum getReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.bn.BnReportType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportType" element
     */
    public au.gov.asic.types.bn.BnReportType xgetReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnReportType target = null;
            target = (au.gov.asic.types.bn.BnReportType)get_store().find_element_user(REPORTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reportType" element
     */
    public void setReportType(au.gov.asic.types.bn.BnReportType.Enum reportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTTYPE$2);
            }
            target.setEnumValue(reportType);
        }
    }
    
    /**
     * Sets (as xml) the "reportType" element
     */
    public void xsetReportType(au.gov.asic.types.bn.BnReportType reportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.BnReportType target = null;
            target = (au.gov.asic.types.bn.BnReportType)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnReportType)get_store().add_element_user(REPORTTYPE$2);
            }
            target.set(reportType);
        }
    }
    
    /**
     * Gets the "createDate" element
     */
    public java.util.Calendar getCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "createDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CREATEDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "createDate" element
     */
    public void setCreateDate(java.util.Calendar createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDATE$4);
            }
            target.setCalendarValue(createDate);
        }
    }
    
    /**
     * Sets (as xml) the "createDate" element
     */
    public void xsetCreateDate(org.apache.xmlbeans.XmlDate createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CREATEDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CREATEDATE$4);
            }
            target.set(createDate);
        }
    }
    
    /**
     * Gets the "reportPeriod" element
     */
    public au.gov.asic.types.bn.PeriodType getReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PeriodType target = null;
            target = (au.gov.asic.types.bn.PeriodType)get_store().find_element_user(REPORTPERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportPeriod" element
     */
    public boolean isSetReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTPERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "reportPeriod" element
     */
    public void setReportPeriod(au.gov.asic.types.bn.PeriodType reportPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PeriodType target = null;
            target = (au.gov.asic.types.bn.PeriodType)get_store().find_element_user(REPORTPERIOD$6, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PeriodType)get_store().add_element_user(REPORTPERIOD$6);
            }
            target.set(reportPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "reportPeriod" element
     */
    public au.gov.asic.types.bn.PeriodType addNewReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.bn.PeriodType target = null;
            target = (au.gov.asic.types.bn.PeriodType)get_store().add_element_user(REPORTPERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "reportPeriod" element
     */
    public void unsetReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTPERIOD$6, 0);
        }
    }
    
    /**
     * Gets the "state" element
     */
    public au.gov.asic.types.StateTerritoryCodeType.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (au.gov.asic.types.StateTerritoryCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" element
     */
    public au.gov.asic.types.StateTerritoryCodeType xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "state" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$8) != 0;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(au.gov.asic.types.StateTerritoryCodeType.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$8);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" element
     */
    public void xsetState(au.gov.asic.types.StateTerritoryCodeType state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.StateTerritoryCodeType target = null;
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$8);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "state" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$8, 0);
        }
    }
    
    /**
     * Gets the "reportSize" element
     */
    public long getReportSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTSIZE$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportSize" element
     */
    public org.apache.xmlbeans.XmlLong xgetReportSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(REPORTSIZE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "reportSize" element
     */
    public boolean isSetReportSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSIZE$10) != 0;
        }
    }
    
    /**
     * Sets the "reportSize" element
     */
    public void setReportSize(long reportSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTSIZE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTSIZE$10);
            }
            target.setLongValue(reportSize);
        }
    }
    
    /**
     * Sets (as xml) the "reportSize" element
     */
    public void xsetReportSize(org.apache.xmlbeans.XmlLong reportSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(REPORTSIZE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(REPORTSIZE$10);
            }
            target.set(reportSize);
        }
    }
    
    /**
     * Unsets the "reportSize" element
     */
    public void unsetReportSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSIZE$10, 0);
        }
    }
}
