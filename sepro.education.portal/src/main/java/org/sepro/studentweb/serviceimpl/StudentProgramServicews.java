
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
@WebServiceClient(name = "StudentProgramServicews", targetNamespace = "http://serviceimpl.studentweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/StudentProgramServicews/StudentProgramServicewsImpl?wsdl")
public class StudentProgramServicews
    extends Service
{

    private final static URL STUDENTPROGRAMSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException STUDENTPROGRAMSERVICEWS_EXCEPTION;
    private final static QName STUDENTPROGRAMSERVICEWS_QNAME = new QName("http://serviceimpl.studentweb.sepro.org/", "StudentProgramServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/StudentProgramServicews/StudentProgramServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTPROGRAMSERVICEWS_WSDL_LOCATION = url;
        STUDENTPROGRAMSERVICEWS_EXCEPTION = e;
    }

    public StudentProgramServicews() {
        super(__getWsdlLocation(), STUDENTPROGRAMSERVICEWS_QNAME);
    }

    public StudentProgramServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTPROGRAMSERVICEWS_QNAME, features);
    }

    public StudentProgramServicews(URL wsdlLocation) {
        super(wsdlLocation, STUDENTPROGRAMSERVICEWS_QNAME);
    }

    public StudentProgramServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTPROGRAMSERVICEWS_QNAME, features);
    }

    public StudentProgramServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentProgramServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentProgramServicewsEndpoint
     */
    @WebEndpoint(name = "StudentProgramServicewsImplPort")
    public StudentProgramServicewsEndpoint getStudentProgramServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "StudentProgramServicewsImplPort"), StudentProgramServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentProgramServicewsEndpoint
     */
    @WebEndpoint(name = "StudentProgramServicewsImplPort")
    public StudentProgramServicewsEndpoint getStudentProgramServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "StudentProgramServicewsImplPort"), StudentProgramServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTPROGRAMSERVICEWS_EXCEPTION!= null) {
            throw STUDENTPROGRAMSERVICEWS_EXCEPTION;
        }
        return STUDENTPROGRAMSERVICEWS_WSDL_LOCATION;
    }

}