
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.parameterweb.serviceapi package. 
 * <p>An ObjectFactoryDaysofWeek allows you to programatically 
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
public class ObjectFactoryDaysofWeek {

    private final static QName _GetAllDaysofWeekServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllDaysofWeekServicews");
    private final static QName _GetAllDaysofWeekServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllDaysofWeekServicewsResponse");

    /**
     * Create a new ObjectFactoryDaysofWeek that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryDaysofWeek() {
    }

    /**
     * Create an instance of {@link GetAllDaysofWeekServicewsResponse }
     * 
     */
    public GetAllDaysofWeekServicewsResponse createGetAllDaysofWeekServicewsResponse() {
        return new GetAllDaysofWeekServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllDaysofWeekServicews }
     * 
     */
    public GetAllDaysofWeekServicews createGetAllDaysofWeekServicews() {
        return new GetAllDaysofWeekServicews();
    }

    /**
     * Create an instance of {@link DaysofWeekDto }
     * 
     */
    public DaysofWeekDto createDaysofWeekDto() {
        return new DaysofWeekDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDaysofWeekServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllDaysofWeekServicews")
    public JAXBElement<GetAllDaysofWeekServicews> createGetAllDaysofWeekServicews(GetAllDaysofWeekServicews value) {
        return new JAXBElement<GetAllDaysofWeekServicews>(_GetAllDaysofWeekServicews_QNAME, GetAllDaysofWeekServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDaysofWeekServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllDaysofWeekServicewsResponse")
    public JAXBElement<GetAllDaysofWeekServicewsResponse> createGetAllDaysofWeekServicewsResponse(GetAllDaysofWeekServicewsResponse value) {
        return new JAXBElement<GetAllDaysofWeekServicewsResponse>(_GetAllDaysofWeekServicewsResponse_QNAME, GetAllDaysofWeekServicewsResponse.class, null, value);
    }

}
