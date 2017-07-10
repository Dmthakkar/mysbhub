/*
 * XML Type:  reportRequestType
 * Namespace: uri:bn.types.asic.gov.au
 * Java type: au.gov.asic.types.bn.ReportRequestType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.bn.impl;
/**
 * An XML reportRequestType(@uri:bn.types.asic.gov.au).
 *
 * This is a complex type.
 */
public class ReportRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.bn.ReportRequestType
{
    
    public ReportRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTYPE$0 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "reportType");
    private static final javax.xml.namespace.QName REPORTPERIOD$2 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "reportPeriod");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("uri:bn.types.asic.gov.au", "state");
    
    
    /**
     * Gets the "reportType" element
     */
    public au.gov.asic.types.bn.BnReportType.Enum getReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$0, 0);
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
            target = (au.gov.asic.types.bn.BnReportType)get_store().find_element_user(REPORTTYPE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTTYPE$0);
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
            target = (au.gov.asic.types.bn.BnReportType)get_store().find_element_user(REPORTTYPE$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.BnReportType)get_store().add_element_user(REPORTTYPE$0);
            }
            target.set(reportType);
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
            target = (au.gov.asic.types.bn.PeriodType)get_store().find_element_user(REPORTPERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (au.gov.asic.types.bn.PeriodType)get_store().find_element_user(REPORTPERIOD$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.bn.PeriodType)get_store().add_element_user(REPORTPERIOD$2);
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
            target = (au.gov.asic.types.bn.PeriodType)get_store().add_element_user(REPORTPERIOD$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
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
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$4, 0);
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
            return get_store().count_elements(STATE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
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
            target = (au.gov.asic.types.StateTerritoryCodeType)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.StateTerritoryCodeType)get_store().add_element_user(STATE$4);
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
            get_store().remove_element(STATE$4, 0);
        }
    }
}
