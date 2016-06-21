
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.parameterweb.serviceapi package. 
 * <p>An ObjectFactoryTypeofClass allows you to programatically 
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
public class ObjectFactoryTypeofClass {

    private final static QName _GetAllTypeofClassServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllTypeofClassServicews");
    private final static QName _GetAllTypeofClassServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllTypeofClassServicewsResponse");

    /**
     * Create a new ObjectFactoryTypeofClass that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryTypeofClass() {
    }

    /**
     * Create an instance of {@link GetAllTypeofClassServicews }
     * 
     */
    public GetAllTypeofClassServicews createGetAllTypeofClassServicews() {
        return new GetAllTypeofClassServicews();
    }

    /**
     * Create an instance of {@link GetAllTypeofClassServicewsResponse }
     * 
     */
    public GetAllTypeofClassServicewsResponse createGetAllTypeofClassServicewsResponse() {
        return new GetAllTypeofClassServicewsResponse();
    }

    /**
     * Create an instance of {@link TypeofClassDto }
     * 
     */
    public TypeofClassDto createTypeofClassDto() {
        return new TypeofClassDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTypeofClassServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllTypeofClassServicews")
    public JAXBElement<GetAllTypeofClassServicews> createGetAllTypeofClassServicews(GetAllTypeofClassServicews value) {
        return new JAXBElement<GetAllTypeofClassServicews>(_GetAllTypeofClassServicews_QNAME, GetAllTypeofClassServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTypeofClassServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllTypeofClassServicewsResponse")
    public JAXBElement<GetAllTypeofClassServicewsResponse> createGetAllTypeofClassServicewsResponse(GetAllTypeofClassServicewsResponse value) {
        return new JAXBElement<GetAllTypeofClassServicewsResponse>(_GetAllTypeofClassServicewsResponse_QNAME, GetAllTypeofClassServicewsResponse.class, null, value);
    }

}
