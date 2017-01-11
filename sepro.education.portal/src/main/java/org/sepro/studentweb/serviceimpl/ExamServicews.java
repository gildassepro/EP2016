
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
@WebServiceClient(name = "ExamServicews", targetNamespace = "http://serviceimpl.studentweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ExamServicews/ExamServicewsImpl?wsdl")
public class ExamServicews
    extends Service
{

    private final static URL EXAMSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException EXAMSERVICEWS_EXCEPTION;
    private final static QName EXAMSERVICEWS_QNAME = new QName("http://serviceimpl.studentweb.sepro.org/", "ExamServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ExamServicews/ExamServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMSERVICEWS_WSDL_LOCATION = url;
        EXAMSERVICEWS_EXCEPTION = e;
    }

    public ExamServicews() {
        super(__getWsdlLocation(), EXAMSERVICEWS_QNAME);
    }

    public ExamServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMSERVICEWS_QNAME, features);
    }

    public ExamServicews(URL wsdlLocation) {
        super(wsdlLocation, EXAMSERVICEWS_QNAME);
    }

    public ExamServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMSERVICEWS_QNAME, features);
    }

    public ExamServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExamServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExamServicewsEndpoint
     */
    @WebEndpoint(name = "ExamServicewsImplPort")
    public ExamServicewsEndpoint getExamServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "ExamServicewsImplPort"), ExamServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExamServicewsEndpoint
     */
    @WebEndpoint(name = "ExamServicewsImplPort")
    public ExamServicewsEndpoint getExamServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "ExamServicewsImplPort"), ExamServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMSERVICEWS_EXCEPTION!= null) {
            throw EXAMSERVICEWS_EXCEPTION;
        }
        return EXAMSERVICEWS_WSDL_LOCATION;
    }

}
