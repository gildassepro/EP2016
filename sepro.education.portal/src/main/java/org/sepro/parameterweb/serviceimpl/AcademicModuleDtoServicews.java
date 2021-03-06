
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
@WebServiceClient(name = "AcademicModuleDtoServicews", targetNamespace = "http://serviceimpl.parameterweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/AcademicModuleDtoServicews/AcademicModuleDtoServicewsImpl?wsdl")
public class AcademicModuleDtoServicews
    extends Service
{

    private final static URL ACADEMICMODULEDTOSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException ACADEMICMODULEDTOSERVICEWS_EXCEPTION;
    private final static QName ACADEMICMODULEDTOSERVICEWS_QNAME = new QName("http://serviceimpl.parameterweb.sepro.org/", "AcademicModuleDtoServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/AcademicModuleDtoServicews/AcademicModuleDtoServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACADEMICMODULEDTOSERVICEWS_WSDL_LOCATION = url;
        ACADEMICMODULEDTOSERVICEWS_EXCEPTION = e;
    }

    public AcademicModuleDtoServicews() {
        super(__getWsdlLocation(), ACADEMICMODULEDTOSERVICEWS_QNAME);
    }

    public AcademicModuleDtoServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACADEMICMODULEDTOSERVICEWS_QNAME, features);
    }

    public AcademicModuleDtoServicews(URL wsdlLocation) {
        super(wsdlLocation, ACADEMICMODULEDTOSERVICEWS_QNAME);
    }

    public AcademicModuleDtoServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACADEMICMODULEDTOSERVICEWS_QNAME, features);
    }

    public AcademicModuleDtoServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AcademicModuleDtoServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AcademicModuleDtoServicewsEndpoint
     */
    @WebEndpoint(name = "AcademicModuleDtoServicewsImplPort")
    public AcademicModuleDtoServicewsEndpoint getAcademicModuleDtoServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.parameterweb.sepro.org/", "AcademicModuleDtoServicewsImplPort"), AcademicModuleDtoServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AcademicModuleDtoServicewsEndpoint
     */
    @WebEndpoint(name = "AcademicModuleDtoServicewsImplPort")
    public AcademicModuleDtoServicewsEndpoint getAcademicModuleDtoServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.parameterweb.sepro.org/", "AcademicModuleDtoServicewsImplPort"), AcademicModuleDtoServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACADEMICMODULEDTOSERVICEWS_EXCEPTION!= null) {
            throw ACADEMICMODULEDTOSERVICEWS_EXCEPTION;
        }
        return ACADEMICMODULEDTOSERVICEWS_WSDL_LOCATION;
    }

}
