
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryActivities allows you to programatically 
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
public class ObjectFactoryActivities {

    private final static QName _SearchActivitiesServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchActivitiesServicewsResponse");
    private final static QName _SearchActivitiesServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchActivitiesServicews");

    /**
     * Create a new ObjectFactoryActivities that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryActivities() {
    }

    /**
     * Create an instance of {@link ActivitiesDto }
     * 
     */
    public ActivitiesDto createActivitiesDto() {
        return new ActivitiesDto();
    }

    /**
     * Create an instance of {@link SearchActivitiesServicews }
     * 
     */
    public SearchActivitiesServicews createSearchActivitiesServicews() {
        return new SearchActivitiesServicews();
    }

    /**
     * Create an instance of {@link SearchActivitiesServicewsResponse }
     * 
     */
    public SearchActivitiesServicewsResponse createSearchActivitiesServicewsResponse() {
        return new SearchActivitiesServicewsResponse();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link ActivitiesDto.ListTeacher }
     * 
     */
    public ActivitiesDto.ListTeacher createActivitiesDtoListTeacher() {
        return new ActivitiesDto.ListTeacher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchActivitiesServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchActivitiesServicewsResponse")
    public JAXBElement<SearchActivitiesServicewsResponse> createSearchActivitiesServicewsResponse(SearchActivitiesServicewsResponse value) {
        return new JAXBElement<SearchActivitiesServicewsResponse>(_SearchActivitiesServicewsResponse_QNAME, SearchActivitiesServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchActivitiesServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchActivitiesServicews")
    public JAXBElement<SearchActivitiesServicews> createSearchActivitiesServicews(SearchActivitiesServicews value) {
        return new JAXBElement<SearchActivitiesServicews>(_SearchActivitiesServicews_QNAME, SearchActivitiesServicews.class, null, value);
    }

}
