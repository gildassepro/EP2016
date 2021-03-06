
package org.sepro.teacherweb.serviceimpl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IdentityTeacherServicews", targetNamespace = "http://serviceimpl.teacherweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/IdentityTeacherServicews/IdentityTeacherServicewsImpl?wsdl")
public class IdentityTeacherServicews
    extends Service
{

    private final static URL IDENTITYTEACHERSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException IDENTITYTEACHERSERVICEWS_EXCEPTION;
    private final static QName IDENTITYTEACHERSERVICEWS_QNAME = new QName("http://serviceimpl.teacherweb.sepro.org/", "IdentityTeacherServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/IdentityTeacherServicews/IdentityTeacherServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IDENTITYTEACHERSERVICEWS_WSDL_LOCATION = url;
        IDENTITYTEACHERSERVICEWS_EXCEPTION = e;
    }

    public IdentityTeacherServicews() {
        super(__getWsdlLocation(), IDENTITYTEACHERSERVICEWS_QNAME);
    }

    public IdentityTeacherServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), IDENTITYTEACHERSERVICEWS_QNAME, features);
    }

    public IdentityTeacherServicews(URL wsdlLocation) {
        super(wsdlLocation, IDENTITYTEACHERSERVICEWS_QNAME);
    }

    public IdentityTeacherServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IDENTITYTEACHERSERVICEWS_QNAME, features);
    }

    public IdentityTeacherServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IdentityTeacherServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IdentityTeacherServicewsEndpoint
     */
    @WebEndpoint(name = "IdentityTeacherServicewsImplPort")
    public IdentityTeacherServicewsEndpoint getIdentityTeacherServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.teacherweb.sepro.org/", "IdentityTeacherServicewsImplPort"), IdentityTeacherServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IdentityTeacherServicewsEndpoint
     */
    @WebEndpoint(name = "IdentityTeacherServicewsImplPort")
    public IdentityTeacherServicewsEndpoint getIdentityTeacherServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.teacherweb.sepro.org/", "IdentityTeacherServicewsImplPort"), IdentityTeacherServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IDENTITYTEACHERSERVICEWS_EXCEPTION!= null) {
            throw IDENTITYTEACHERSERVICEWS_EXCEPTION;
        }
        return IDENTITYTEACHERSERVICEWS_WSDL_LOCATION;
    }

}
