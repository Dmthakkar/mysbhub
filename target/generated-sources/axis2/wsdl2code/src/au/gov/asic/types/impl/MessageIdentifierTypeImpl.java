/*
 * XML Type:  messageIdentifierType
 * Namespace: uri:types.asic.gov.au
 * Java type: au.gov.asic.types.MessageIdentifierType
 *
 * Automatically generated - do not modify.
 */
package au.gov.asic.types.impl;
/**
 * An XML messageIdentifierType(@uri:types.asic.gov.au).
 *
 * This is a complex type.
 */
public class MessageIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.MessageIdentifierType
{
    
    public MessageIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASICIDENTIFIER$0 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "asicIdentifier");
    private static final javax.xml.namespace.QName CUSTOMERIDENTIFIER$2 = 
        new javax.xml.namespace.QName("uri:types.asic.gov.au", "customerIdentifier");
    
    
    /**
     * Gets the "asicIdentifier" element
     */
    public au.gov.asic.types.DocumentIdentifierType getAsicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType target = null;
            target = (au.gov.asic.types.DocumentIdentifierType)get_store().find_element_user(ASICIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "asicIdentifier" element
     */
    public void setAsicIdentifier(au.gov.asic.types.DocumentIdentifierType asicIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType target = null;
            target = (au.gov.asic.types.DocumentIdentifierType)get_store().find_element_user(ASICIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.DocumentIdentifierType)get_store().add_element_user(ASICIDENTIFIER$0);
            }
            target.set(asicIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "asicIdentifier" element
     */
    public au.gov.asic.types.DocumentIdentifierType addNewAsicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.DocumentIdentifierType target = null;
            target = (au.gov.asic.types.DocumentIdentifierType)get_store().add_element_user(ASICIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "customerIdentifier" element
     */
    public au.gov.asic.types.MessageIdentifierType.CustomerIdentifier getCustomerIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.MessageIdentifierType.CustomerIdentifier target = null;
            target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier)get_store().find_element_user(CUSTOMERIDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "customerIdentifier" element
     */
    public void setCustomerIdentifier(au.gov.asic.types.MessageIdentifierType.CustomerIdentifier customerIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.MessageIdentifierType.CustomerIdentifier target = null;
            target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier)get_store().find_element_user(CUSTOMERIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier)get_store().add_element_user(CUSTOMERIDENTIFIER$2);
            }
            target.set(customerIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "customerIdentifier" element
     */
    public au.gov.asic.types.MessageIdentifierType.CustomerIdentifier addNewCustomerIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.gov.asic.types.MessageIdentifierType.CustomerIdentifier target = null;
            target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier)get_store().add_element_user(CUSTOMERIDENTIFIER$2);
            return target;
        }
    }
    /**
     * An XML customerIdentifier(@uri:types.asic.gov.au).
     *
     * This is a complex type.
     */
    public static class CustomerIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.MessageIdentifierType.CustomerIdentifier
    {
        
        public CustomerIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMER$0 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "customer");
        private static final javax.xml.namespace.QName IDENTIFIER$2 = 
            new javax.xml.namespace.QName("uri:types.asic.gov.au", "identifier");
        
        
        /**
         * Gets the "customer" element
         */
        public au.gov.asic.types.AccountIdentifierType getCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AccountIdentifierType target = null;
                target = (au.gov.asic.types.AccountIdentifierType)get_store().find_element_user(CUSTOMER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "customer" element
         */
        public void setCustomer(au.gov.asic.types.AccountIdentifierType customer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AccountIdentifierType target = null;
                target = (au.gov.asic.types.AccountIdentifierType)get_store().find_element_user(CUSTOMER$0, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.AccountIdentifierType)get_store().add_element_user(CUSTOMER$0);
                }
                target.set(customer);
            }
        }
        
        /**
         * Appends and returns a new empty "customer" element
         */
        public au.gov.asic.types.AccountIdentifierType addNewCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.AccountIdentifierType target = null;
                target = (au.gov.asic.types.AccountIdentifierType)get_store().add_element_user(CUSTOMER$0);
                return target;
            }
        }
        
        /**
         * Gets the "identifier" element
         */
        public au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier target = null;
                target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier target = null;
                target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier)get_store().add_element_user(IDENTIFIER$2);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Appends and returns a new empty "identifier" element
         */
        public au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier target = null;
                target = (au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier)get_store().add_element_user(IDENTIFIER$2);
                return target;
            }
        }
        /**
         * An XML identifier(@uri:types.asic.gov.au).
         *
         * This is a complex type.
         */
        public static class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.gov.asic.types.MessageIdentifierType.CustomerIdentifier.Identifier
        {
            
            public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BROWSER$0 = 
                new javax.xml.namespace.QName("uri:types.asic.gov.au", "browser");
            private static final javax.xml.namespace.QName SOAP$2 = 
                new javax.xml.namespace.QName("uri:types.asic.gov.au", "soap");
            private static final javax.xml.namespace.QName INTERNAL$4 = 
                new javax.xml.namespace.QName("uri:types.asic.gov.au", "internal");
            
            
            /**
             * Gets the "browser" element
             */
            public au.gov.asic.types.BrowserIdentifierType getBrowser()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.BrowserIdentifierType target = null;
                    target = (au.gov.asic.types.BrowserIdentifierType)get_store().find_element_user(BROWSER$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "browser" element
             */
            public boolean isSetBrowser()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BROWSER$0) != 0;
                }
            }
            
            /**
             * Sets the "browser" element
             */
            public void setBrowser(au.gov.asic.types.BrowserIdentifierType browser)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.BrowserIdentifierType target = null;
                    target = (au.gov.asic.types.BrowserIdentifierType)get_store().find_element_user(BROWSER$0, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.BrowserIdentifierType)get_store().add_element_user(BROWSER$0);
                    }
                    target.set(browser);
                }
            }
            
            /**
             * Appends and returns a new empty "browser" element
             */
            public au.gov.asic.types.BrowserIdentifierType addNewBrowser()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.BrowserIdentifierType target = null;
                    target = (au.gov.asic.types.BrowserIdentifierType)get_store().add_element_user(BROWSER$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "browser" element
             */
            public void unsetBrowser()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BROWSER$0, 0);
                }
            }
            
            /**
             * Gets the "soap" element
             */
            public au.gov.asic.types.SoapSoftwareIdentifierType getSoap()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.SoapSoftwareIdentifierType target = null;
                    target = (au.gov.asic.types.SoapSoftwareIdentifierType)get_store().find_element_user(SOAP$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "soap" element
             */
            public boolean isSetSoap()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SOAP$2) != 0;
                }
            }
            
            /**
             * Sets the "soap" element
             */
            public void setSoap(au.gov.asic.types.SoapSoftwareIdentifierType soap)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.SoapSoftwareIdentifierType target = null;
                    target = (au.gov.asic.types.SoapSoftwareIdentifierType)get_store().find_element_user(SOAP$2, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.SoapSoftwareIdentifierType)get_store().add_element_user(SOAP$2);
                    }
                    target.set(soap);
                }
            }
            
            /**
             * Appends and returns a new empty "soap" element
             */
            public au.gov.asic.types.SoapSoftwareIdentifierType addNewSoap()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.SoapSoftwareIdentifierType target = null;
                    target = (au.gov.asic.types.SoapSoftwareIdentifierType)get_store().add_element_user(SOAP$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "soap" element
             */
            public void unsetSoap()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SOAP$2, 0);
                }
            }
            
            /**
             * Gets the "internal" element
             */
            public boolean getInternal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNAL$4, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "internal" element
             */
            public au.gov.asic.types.TrueType xgetInternal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.TrueType target = null;
                    target = (au.gov.asic.types.TrueType)get_store().find_element_user(INTERNAL$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "internal" element
             */
            public boolean isSetInternal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTERNAL$4) != 0;
                }
            }
            
            /**
             * Sets the "internal" element
             */
            public void setInternal(boolean internal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNAL$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNAL$4);
                    }
                    target.setBooleanValue(internal);
                }
            }
            
            /**
             * Sets (as xml) the "internal" element
             */
            public void xsetInternal(au.gov.asic.types.TrueType internal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    au.gov.asic.types.TrueType target = null;
                    target = (au.gov.asic.types.TrueType)get_store().find_element_user(INTERNAL$4, 0);
                    if (target == null)
                    {
                      target = (au.gov.asic.types.TrueType)get_store().add_element_user(INTERNAL$4);
                    }
                    target.set(internal);
                }
            }
            
            /**
             * Unsets the "internal" element
             */
            public void unsetInternal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTERNAL$4, 0);
                }
            }
        }
    }
}
