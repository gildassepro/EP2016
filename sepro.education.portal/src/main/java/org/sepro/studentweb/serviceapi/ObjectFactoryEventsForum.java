
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryEventsForum allows you to programatically 
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
public class ObjectFactoryEventsForum {

    private final static QName _CreateEventsForumServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createEventsForumServicewsResponse");
    private final static QName _SearchEventsForumServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchEventsForumServicews");
    private final static QName _SearchEventsForumServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchEventsForumServicewsResponse");
    private final static QName _DeleteEventsForumServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteEventsForumServicewsResponse");
    private final static QName _CreateEventsForumServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createEventsForumServicews");
    private final static QName _UpdateEventsForumServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateEventsForumServicews");
    private final static QName _UpdateEventsForumServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateEventsForumServicewsResponse");
    private final static QName _DeleteEventsForumServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteEventsForumServicews");

    /**
     * Create a new ObjectFactoryEventsForum that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryEventsForum() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link DeleteEventsForumServicews }
     * 
     */
    public DeleteEventsForumServicews createDeleteEventsForumServicews() {
        return new DeleteEventsForumServicews();
    }

    /**
     * Create an instance of {@link UpdateEventsForumServicews }
     * 
     */
    public UpdateEventsForumServicews createUpdateEventsForumServicews() {
        return new UpdateEventsForumServicews();
    }

    /**
     * Create an instance of {@link UpdateEventsForumServicewsResponse }
     * 
     */
    public UpdateEventsForumServicewsResponse createUpdateEventsForumServicewsResponse() {
        return new UpdateEventsForumServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateEventsForumServicews }
     * 
     */
    public CreateEventsForumServicews createCreateEventsForumServicews() {
        return new CreateEventsForumServicews();
    }

    /**
     * Create an instance of {@link DeleteEventsForumServicewsResponse }
     * 
     */
    public DeleteEventsForumServicewsResponse createDeleteEventsForumServicewsResponse() {
        return new DeleteEventsForumServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateEventsForumServicewsResponse }
     * 
     */
    public CreateEventsForumServicewsResponse createCreateEventsForumServicewsResponse() {
        return new CreateEventsForumServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchEventsForumServicews }
     * 
     */
    public SearchEventsForumServicews createSearchEventsForumServicews() {
        return new SearchEventsForumServicews();
    }

    /**
     * Create an instance of {@link SearchEventsForumServicewsResponse }
     * 
     */
    public SearchEventsForumServicewsResponse createSearchEventsForumServicewsResponse() {
        return new SearchEventsForumServicewsResponse();
    }

    /**
     * Create an instance of {@link EventsForumDto }
     * 
     */
    public EventsForumDto createEventsForumDto() {
        return new EventsForumDto();
    }

    /**
     * Create an instance of {@link EventsStatusDto }
     * 
     */
    public EventsStatusDto createEventsStatusDto() {
        return new EventsStatusDto();
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
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEventsForumServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createEventsForumServicewsResponse")
    public JAXBElement<CreateEventsForumServicewsResponse> createCreateEventsForumServicewsResponse(CreateEventsForumServicewsResponse value) {
        return new JAXBElement<CreateEventsForumServicewsResponse>(_CreateEventsForumServicewsResponse_QNAME, CreateEventsForumServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEventsForumServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchEventsForumServicews")
    public JAXBElement<SearchEventsForumServicews> createSearchEventsForumServicews(SearchEventsForumServicews value) {
        return new JAXBElement<SearchEventsForumServicews>(_SearchEventsForumServicews_QNAME, SearchEventsForumServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEventsForumServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchEventsForumServicewsResponse")
    public JAXBElement<SearchEventsForumServicewsResponse> createSearchEventsForumServicewsResponse(SearchEventsForumServicewsResponse value) {
        return new JAXBElement<SearchEventsForumServicewsResponse>(_SearchEventsForumServicewsResponse_QNAME, SearchEventsForumServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventsForumServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteEventsForumServicewsResponse")
    public JAXBElement<DeleteEventsForumServicewsResponse> createDeleteEventsForumServicewsResponse(DeleteEventsForumServicewsResponse value) {
        return new JAXBElement<DeleteEventsForumServicewsResponse>(_DeleteEventsForumServicewsResponse_QNAME, DeleteEventsForumServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEventsForumServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createEventsForumServicews")
    public JAXBElement<CreateEventsForumServicews> createCreateEventsForumServicews(CreateEventsForumServicews value) {
        return new JAXBElement<CreateEventsForumServicews>(_CreateEventsForumServicews_QNAME, CreateEventsForumServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventsForumServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateEventsForumServicews")
    public JAXBElement<UpdateEventsForumServicews> createUpdateEventsForumServicews(UpdateEventsForumServicews value) {
        return new JAXBElement<UpdateEventsForumServicews>(_UpdateEventsForumServicews_QNAME, UpdateEventsForumServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventsForumServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateEventsForumServicewsResponse")
    public JAXBElement<UpdateEventsForumServicewsResponse> createUpdateEventsForumServicewsResponse(UpdateEventsForumServicewsResponse value) {
        return new JAXBElement<UpdateEventsForumServicewsResponse>(_UpdateEventsForumServicewsResponse_QNAME, UpdateEventsForumServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventsForumServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteEventsForumServicews")
    public JAXBElement<DeleteEventsForumServicews> createDeleteEventsForumServicews(DeleteEventsForumServicews value) {
        return new JAXBElement<DeleteEventsForumServicews>(_DeleteEventsForumServicews_QNAME, DeleteEventsForumServicews.class, null, value);
    }

}
