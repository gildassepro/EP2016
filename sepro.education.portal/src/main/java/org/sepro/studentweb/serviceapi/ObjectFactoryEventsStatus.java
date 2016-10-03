
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryEventsStatus allows you to programatically 
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
public class ObjectFactoryEventsStatus {

    private final static QName _CreateEventsStatusServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createEventsStatusServicews");
    private final static QName _DeleteEventsStatusServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteEventsStatusServicews");
    private final static QName _UpdateEventsStatusServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateEventsStatusServicews");
    private final static QName _SearchEventsStatusServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchEventsStatusServicews");
    private final static QName _CreateEventsStatusServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createEventsStatusServicewsResponse");
    private final static QName _SearchEventsStatusServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchEventsStatusServicewsResponse");
    private final static QName _UpdateEventsStatusServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateEventsStatusServicewsResponse");
    private final static QName _DeleteEventsStatusServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteEventsStatusServicewsResponse");

    /**
     * Create a new ObjectFactoryEventsStatus that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryEventsStatus() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link DeleteEventsStatusServicewsResponse }
     * 
     */
    public DeleteEventsStatusServicewsResponse createDeleteEventsStatusServicewsResponse() {
        return new DeleteEventsStatusServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchEventsStatusServicewsResponse }
     * 
     */
    public SearchEventsStatusServicewsResponse createSearchEventsStatusServicewsResponse() {
        return new SearchEventsStatusServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateEventsStatusServicewsResponse }
     * 
     */
    public UpdateEventsStatusServicewsResponse createUpdateEventsStatusServicewsResponse() {
        return new UpdateEventsStatusServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateEventsStatusServicewsResponse }
     * 
     */
    public CreateEventsStatusServicewsResponse createCreateEventsStatusServicewsResponse() {
        return new CreateEventsStatusServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchEventsStatusServicews }
     * 
     */
    public SearchEventsStatusServicews createSearchEventsStatusServicews() {
        return new SearchEventsStatusServicews();
    }

    /**
     * Create an instance of {@link UpdateEventsStatusServicews }
     * 
     */
    public UpdateEventsStatusServicews createUpdateEventsStatusServicews() {
        return new UpdateEventsStatusServicews();
    }

    /**
     * Create an instance of {@link DeleteEventsStatusServicews }
     * 
     */
    public DeleteEventsStatusServicews createDeleteEventsStatusServicews() {
        return new DeleteEventsStatusServicews();
    }

    /**
     * Create an instance of {@link CreateEventsStatusServicews }
     * 
     */
    public CreateEventsStatusServicews createCreateEventsStatusServicews() {
        return new CreateEventsStatusServicews();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link StudentEventsDto }
     * 
     */
    public StudentEventsDto createStudentEventsDto() {
        return new StudentEventsDto();
    }

    /**
     * Create an instance of {@link EventsStatusDto }
     * 
     */
    public EventsStatusDto createEventsStatusDto() {
        return new EventsStatusDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEventsStatusServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createEventsStatusServicews")
    public JAXBElement<CreateEventsStatusServicews> createCreateEventsStatusServicews(CreateEventsStatusServicews value) {
        return new JAXBElement<CreateEventsStatusServicews>(_CreateEventsStatusServicews_QNAME, CreateEventsStatusServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventsStatusServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteEventsStatusServicews")
    public JAXBElement<DeleteEventsStatusServicews> createDeleteEventsStatusServicews(DeleteEventsStatusServicews value) {
        return new JAXBElement<DeleteEventsStatusServicews>(_DeleteEventsStatusServicews_QNAME, DeleteEventsStatusServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventsStatusServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateEventsStatusServicews")
    public JAXBElement<UpdateEventsStatusServicews> createUpdateEventsStatusServicews(UpdateEventsStatusServicews value) {
        return new JAXBElement<UpdateEventsStatusServicews>(_UpdateEventsStatusServicews_QNAME, UpdateEventsStatusServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEventsStatusServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchEventsStatusServicews")
    public JAXBElement<SearchEventsStatusServicews> createSearchEventsStatusServicews(SearchEventsStatusServicews value) {
        return new JAXBElement<SearchEventsStatusServicews>(_SearchEventsStatusServicews_QNAME, SearchEventsStatusServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEventsStatusServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createEventsStatusServicewsResponse")
    public JAXBElement<CreateEventsStatusServicewsResponse> createCreateEventsStatusServicewsResponse(CreateEventsStatusServicewsResponse value) {
        return new JAXBElement<CreateEventsStatusServicewsResponse>(_CreateEventsStatusServicewsResponse_QNAME, CreateEventsStatusServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEventsStatusServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchEventsStatusServicewsResponse")
    public JAXBElement<SearchEventsStatusServicewsResponse> createSearchEventsStatusServicewsResponse(SearchEventsStatusServicewsResponse value) {
        return new JAXBElement<SearchEventsStatusServicewsResponse>(_SearchEventsStatusServicewsResponse_QNAME, SearchEventsStatusServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventsStatusServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateEventsStatusServicewsResponse")
    public JAXBElement<UpdateEventsStatusServicewsResponse> createUpdateEventsStatusServicewsResponse(UpdateEventsStatusServicewsResponse value) {
        return new JAXBElement<UpdateEventsStatusServicewsResponse>(_UpdateEventsStatusServicewsResponse_QNAME, UpdateEventsStatusServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventsStatusServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteEventsStatusServicewsResponse")
    public JAXBElement<DeleteEventsStatusServicewsResponse> createDeleteEventsStatusServicewsResponse(DeleteEventsStatusServicewsResponse value) {
        return new JAXBElement<DeleteEventsStatusServicewsResponse>(_DeleteEventsStatusServicewsResponse_QNAME, DeleteEventsStatusServicewsResponse.class, null, value);
    }

}
