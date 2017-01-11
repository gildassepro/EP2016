
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
@WebServiceClient(name = "ClasseProgrammExamServicews", targetNamespace = "http://serviceimpl.studentweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ClasseProgrammExamServicews/ClasseProgrammExamServicewsImpl?wsdl")
public class ClasseProgrammExamServicews
    extends Service
{

    private final static URL CLASSEPROGRAMMEXAMSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException CLASSEPROGRAMMEXAMSERVICEWS_EXCEPTION;
    private final static QName CLASSEPROGRAMMEXAMSERVICEWS_QNAME = new QName("http://serviceimpl.studentweb.sepro.org/", "ClasseProgrammExamServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/ClasseProgrammExamServicews/ClasseProgrammExamServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLASSEPROGRAMMEXAMSERVICEWS_WSDL_LOCATION = url;
        CLASSEPROGRAMMEXAMSERVICEWS_EXCEPTION = e;
    }

    public ClasseProgrammExamServicews() {
        super(__getWsdlLocation(), CLASSEPROGRAMMEXAMSERVICEWS_QNAME);
    }

    public ClasseProgrammExamServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLASSEPROGRAMMEXAMSERVICEWS_QNAME, features);
    }

    public ClasseProgrammExamServicews(URL wsdlLocation) {
        super(wsdlLocation, CLASSEPROGRAMMEXAMSERVICEWS_QNAME);
    }

    public ClasseProgrammExamServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLASSEPROGRAMMEXAMSERVICEWS_QNAME, features);
    }

    public ClasseProgrammExamServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClasseProgrammExamServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClasseProgrammExamServicewsEndpoint
     */
    @WebEndpoint(name = "ClasseProgrammExamServicewsImplPort")
    public ClasseProgrammExamServicewsEndpoint getClasseProgrammExamServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "ClasseProgrammExamServicewsImplPort"), ClasseProgrammExamServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClasseProgrammExamServicewsEndpoint
     */
    @WebEndpoint(name = "ClasseProgrammExamServicewsImplPort")
    public ClasseProgrammExamServicewsEndpoint getClasseProgrammExamServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.studentweb.sepro.org/", "ClasseProgrammExamServicewsImplPort"), ClasseProgrammExamServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLASSEPROGRAMMEXAMSERVICEWS_EXCEPTION!= null) {
            throw CLASSEPROGRAMMEXAMSERVICEWS_EXCEPTION;
        }
        return CLASSEPROGRAMMEXAMSERVICEWS_WSDL_LOCATION;
    }

}