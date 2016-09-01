
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
@WebServiceClient(name = "StudentClasseServicews", targetNamespace = "http://serviceimpl.studentweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/StudentClasseServicews/StudentClasseServicewsImpl?wsdl")
public class StudentClasseServicews
    extends Service
{

    private final static URL STUDENTCLASSESERVICEWS_WSDL_LOCATION;
    private final static WebServiceException STUDENTCLASSESERVICEWS_EXCEPTION;
    private final static QName STUDENTCLASSESERVICEWS_QNAME = new QName("http://serviceimpl.studentweb.sepro.org/", "StudentClasseServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/StudentClasseServicews/StudentClasseServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTCLASSESERVICEWS_WSDL_LOCATION = url;
        STUDENTCLASSESERVICEWS_EXCEPTION = e;
    }

    public StudentClasseServicews() {
        super(__getWsdlLocation(), STUDENTCLASSESERVICEWS_QNAME);
    }

    public StudentClasseServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTCLASSESERVICEWS_QNAME, features);
    }

    public StudentClasseServicews(URL wsdlLocation) {
        super(wsdlLocation, STUDENTCLASSESERVICEWS_QNAME);
    }

    public StudentClasseServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTCLASSESERVICEWS_QNAME, features);
    }

    public StudentClasseServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentClasseServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentClasseServicewsEndpoint
     */
    @WebEndpoint(name = "StudentClasseServicewsImplPort")
    public StudentClasseServicewsEndpoint getStudentClasseServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "StudentClasseServicewsImplPort"), StudentClasseServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentClasseServicewsEndpoint
     */
    @WebEndpoint(name = "StudentClasseServicewsImplPort")
    public StudentClasseServicewsEndpoint getStudentClasseServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "StudentClasseServicewsImplPort"), StudentClasseServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTCLASSESERVICEWS_EXCEPTION!= null) {
            throw STUDENTCLASSESERVICEWS_EXCEPTION;
        }
        return STUDENTCLASSESERVICEWS_WSDL_LOCATION;
    }

}
