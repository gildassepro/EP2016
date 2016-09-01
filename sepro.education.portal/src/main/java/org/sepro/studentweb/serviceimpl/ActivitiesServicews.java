
package org.sepro.studentweb.serviceimpl;

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
@WebServiceClient(name = "ActivitiesServicews", targetNamespace = "http://serviceimpl.studentweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ActivitiesServicews/ActivitiesServicewsImpl?wsdl")
public class ActivitiesServicews
    extends Service
{

    private final static URL ACTIVITIESSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException ACTIVITIESSERVICEWS_EXCEPTION;
    private final static QName ACTIVITIESSERVICEWS_QNAME = new QName("http://serviceimpl.studentweb.sepro.org/", "ActivitiesServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ActivitiesServicews/ActivitiesServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACTIVITIESSERVICEWS_WSDL_LOCATION = url;
        ACTIVITIESSERVICEWS_EXCEPTION = e;
    }

    public ActivitiesServicews() {
        super(__getWsdlLocation(), ACTIVITIESSERVICEWS_QNAME);
    }

    public ActivitiesServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACTIVITIESSERVICEWS_QNAME, features);
    }

    public ActivitiesServicews(URL wsdlLocation) {
        super(wsdlLocation, ACTIVITIESSERVICEWS_QNAME);
    }

    public ActivitiesServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACTIVITIESSERVICEWS_QNAME, features);
    }

    public ActivitiesServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ActivitiesServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ActivitiesServicewsEndpoint
     */
    @WebEndpoint(name = "ActivitiesServicewsImplPort")
    public ActivitiesServicewsEndpoint getActivitiesServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "ActivitiesServicewsImplPort"), ActivitiesServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ActivitiesServicewsEndpoint
     */
    @WebEndpoint(name = "ActivitiesServicewsImplPort")
    public ActivitiesServicewsEndpoint getActivitiesServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "ActivitiesServicewsImplPort"), ActivitiesServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACTIVITIESSERVICEWS_EXCEPTION!= null) {
            throw ACTIVITIESSERVICEWS_EXCEPTION;
        }
        return ACTIVITIESSERVICEWS_WSDL_LOCATION;
    }

}