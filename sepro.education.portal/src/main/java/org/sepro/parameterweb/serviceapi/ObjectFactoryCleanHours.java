
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.parameterweb.serviceapi package. 
 * <p>An ObjectFactoryCleanHours allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactoryCleanHours {

    private final static QName _GetAllCleanHoursServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllCleanHoursServicews");
    private final static QName _GetAllCleanHoursServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllCleanHoursServicewsResponse");

    /**
     * Create a new ObjectFactoryCleanHours that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryCleanHours() {
    }

    /**
     * Create an instance of {@link GetAllCleanHoursServicews }
     * 
     */
    public GetAllCleanHoursServicews createGetAllCleanHoursServicews() {
        return new GetAllCleanHoursServicews();
    }

    /**
     * Create an instance of {@link GetAllCleanHoursServicewsResponse }
     * 
     */
    public GetAllCleanHoursServicewsResponse createGetAllCleanHoursServicewsResponse() {
        return new GetAllCleanHoursServicewsResponse();
    }

    /**
     * Create an instance of {@link CleanHoursDto }
     * 
     */
    public CleanHoursDto createCleanHoursDto() {
        return new CleanHoursDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCleanHoursServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllCleanHoursServicews")
    public JAXBElement<GetAllCleanHoursServicews> createGetAllCleanHoursServicews(GetAllCleanHoursServicews value) {
        return new JAXBElement<GetAllCleanHoursServicews>(_GetAllCleanHoursServicews_QNAME, GetAllCleanHoursServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCleanHoursServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllCleanHoursServicewsResponse")
    public JAXBElement<GetAllCleanHoursServicewsResponse> createGetAllCleanHoursServicewsResponse(GetAllCleanHoursServicewsResponse value) {
        return new JAXBElement<GetAllCleanHoursServicewsResponse>(_GetAllCleanHoursServicewsResponse_QNAME, GetAllCleanHoursServicewsResponse.class, null, value);
    }

}
