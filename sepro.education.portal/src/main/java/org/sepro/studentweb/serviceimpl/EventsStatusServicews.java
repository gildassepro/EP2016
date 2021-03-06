
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
@WebServiceClient(name = "EventsStatusServicews", targetNamespace = "http://serviceimpl.studentweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/EventsStatusServicews/EventsStatusServicewsImpl?wsdl")
public class EventsStatusServicews
    extends Service
{

    private final static URL EVENTSSTATUSSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException EVENTSSTATUSSERVICEWS_EXCEPTION;
    private final static QName EVENTSSTATUSSERVICEWS_QNAME = new QName("http://serviceimpl.studentweb.sepro.org/", "EventsStatusServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/EventsStatusServicews/EventsStatusServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EVENTSSTATUSSERVICEWS_WSDL_LOCATION = url;
        EVENTSSTATUSSERVICEWS_EXCEPTION = e;
    }

    public EventsStatusServicews() {
        super(__getWsdlLocation(), EVENTSSTATUSSERVICEWS_QNAME);
    }

    public EventsStatusServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), EVENTSSTATUSSERVICEWS_QNAME, features);
    }

    public EventsStatusServicews(URL wsdlLocation) {
        super(wsdlLocation, EVENTSSTATUSSERVICEWS_QNAME);
    }

    public EventsStatusServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EVENTSSTATUSSERVICEWS_QNAME, features);
    }

    public EventsStatusServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EventsStatusServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EventsStatusServicewsEndpoint
     */
    @WebEndpoint(name = "EventsStatusServicewsImplPort")
    public EventsStatusServicewsEndpoint getEventsStatusServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "EventsStatusServicewsImplPort"), EventsStatusServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EventsStatusServicewsEndpoint
     */
    @WebEndpoint(name = "EventsStatusServicewsImplPort")
    public EventsStatusServicewsEndpoint getEventsStatusServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "EventsStatusServicewsImplPort"), EventsStatusServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EVENTSSTATUSSERVICEWS_EXCEPTION!= null) {
            throw EVENTSSTATUSSERVICEWS_EXCEPTION;
        }
        return EVENTSSTATUSSERVICEWS_WSDL_LOCATION;
    }

}
