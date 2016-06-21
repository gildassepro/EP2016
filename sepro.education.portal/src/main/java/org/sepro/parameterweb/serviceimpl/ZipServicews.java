
package org.sepro.parameterweb.serviceimpl;

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
@WebServiceClient(name = "ZipServicews", targetNamespace = "http://serviceimpl.parameterweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ZipServicews/ZipServicewsImpl?wsdl")
public class ZipServicews
    extends Service
{

    private final static URL ZIPSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException ZIPSERVICEWS_EXCEPTION;
    private final static QName ZIPSERVICEWS_QNAME = new QName("http://serviceimpl.parameterweb.sepro.org/", "ZipServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ZipServicews/ZipServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZIPSERVICEWS_WSDL_LOCATION = url;
        ZIPSERVICEWS_EXCEPTION = e;
    }

    public ZipServicews() {
        super(__getWsdlLocation(), ZIPSERVICEWS_QNAME);
    }

    public ZipServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZIPSERVICEWS_QNAME, features);
    }

    public ZipServicews(URL wsdlLocation) {
        super(wsdlLocation, ZIPSERVICEWS_QNAME);
    }

    public ZipServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZIPSERVICEWS_QNAME, features);
    }

    public ZipServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZipServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZipServicewsEndpoint
     */
    @WebEndpoint(name = "ZipServicewsImplPort")
    public ZipServicewsEndpoint getZipServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.parameterweb.sepro.org/", "ZipServicewsImplPort"), ZipServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZipServicewsEndpoint
     */
    @WebEndpoint(name = "ZipServicewsImplPort")
    public ZipServicewsEndpoint getZipServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.parameterweb.sepro.org/", "ZipServicewsImplPort"), ZipServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZIPSERVICEWS_EXCEPTION!= null) {
            throw ZIPSERVICEWS_EXCEPTION;
        }
        return ZIPSERVICEWS_WSDL_LOCATION;
    }

}
