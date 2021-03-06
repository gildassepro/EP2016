
package org.sepro.inscriptionweb.serviceimpl;

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
@WebServiceClient(name = "InscriptionSteptreeServicews", targetNamespace = "http://serviceimpl.inscriptionweb.sepro.org/", wsdlLocation = "http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/InscriptionSteptreeServicews/InscriptionSteptreeServicewsImpl?wsdl")
public class InscriptionSteptreeServicews
    extends Service
{

    private final static URL INSCRIPTIONSTEPTREESERVICEWS_WSDL_LOCATION;
    private final static WebServiceException INSCRIPTIONSTEPTREESERVICEWS_EXCEPTION;
    private final static QName INSCRIPTIONSTEPTREESERVICEWS_QNAME = new QName("http://serviceimpl.inscriptionweb.sepro.org/", "InscriptionSteptreeServicews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/org.sepro.web-1.0-SNAPSHOT/InscriptionSteptreeServicews/InscriptionSteptreeServicewsImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSCRIPTIONSTEPTREESERVICEWS_WSDL_LOCATION = url;
        INSCRIPTIONSTEPTREESERVICEWS_EXCEPTION = e;
    }

    public InscriptionSteptreeServicews() {
        super(__getWsdlLocation(), INSCRIPTIONSTEPTREESERVICEWS_QNAME);
    }

    public InscriptionSteptreeServicews(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSCRIPTIONSTEPTREESERVICEWS_QNAME, features);
    }

    public InscriptionSteptreeServicews(URL wsdlLocation) {
        super(wsdlLocation, INSCRIPTIONSTEPTREESERVICEWS_QNAME);
    }

    public InscriptionSteptreeServicews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSCRIPTIONSTEPTREESERVICEWS_QNAME, features);
    }

    public InscriptionSteptreeServicews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InscriptionSteptreeServicews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InscriptionSteptreeServicewsEndpoint
     */
    @WebEndpoint(name = "InscriptionSteptreeServicewsImplPort")
    public InscriptionSteptreeServicewsEndpoint getInscriptionSteptreeServicewsImplPort() {
        return super.getPort(new QName("http://serviceimpl.inscriptionweb.sepro.org/", "InscriptionSteptreeServicewsImplPort"), InscriptionSteptreeServicewsEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InscriptionSteptreeServicewsEndpoint
     */
    @WebEndpoint(name = "InscriptionSteptreeServicewsImplPort")
    public InscriptionSteptreeServicewsEndpoint getInscriptionSteptreeServicewsImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceimpl.inscriptionweb.sepro.org/", "InscriptionSteptreeServicewsImplPort"), InscriptionSteptreeServicewsEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSCRIPTIONSTEPTREESERVICEWS_EXCEPTION!= null) {
            throw INSCRIPTIONSTEPTREESERVICEWS_EXCEPTION;
        }
        return INSCRIPTIONSTEPTREESERVICEWS_WSDL_LOCATION;
    }

}
