
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryTeacherPresence allows you to programatically 
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
public class ObjectFactoryTeacherPresence {

    private final static QName _CreateTeacherPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createTeacherPresenceServicewsResponse");
    private final static QName _SearchTeacherPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchTeacherPresenceServicews");
    private final static QName _SearchTeacherPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchTeacherPresenceServicewsResponse");
    private final static QName _UpdateTeacherPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateTeacherPresenceServicews");
    private final static QName _DeleteTeacherPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteTeacherPresenceServicewsResponse");
    private final static QName _CreateTeacherPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createTeacherPresenceServicews");
    private final static QName _DeleteTeacherPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteTeacherPresenceServicews");
    private final static QName _UpdateTeacherPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateTeacherPresenceServicewsResponse");

    /**
     * Create a new ObjectFactoryTeacherPresence that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryTeacherPresence() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link UpdateTeacherPresenceServicewsResponse }
     * 
     */
    public UpdateTeacherPresenceServicewsResponse createUpdateTeacherPresenceServicewsResponse() {
        return new UpdateTeacherPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteTeacherPresenceServicews }
     * 
     */
    public DeleteTeacherPresenceServicews createDeleteTeacherPresenceServicews() {
        return new DeleteTeacherPresenceServicews();
    }

    /**
     * Create an instance of {@link CreateTeacherPresenceServicews }
     * 
     */
    public CreateTeacherPresenceServicews createCreateTeacherPresenceServicews() {
        return new CreateTeacherPresenceServicews();
    }

    /**
     * Create an instance of {@link DeleteTeacherPresenceServicewsResponse }
     * 
     */
    public DeleteTeacherPresenceServicewsResponse createDeleteTeacherPresenceServicewsResponse() {
        return new DeleteTeacherPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateTeacherPresenceServicews }
     * 
     */
    public UpdateTeacherPresenceServicews createUpdateTeacherPresenceServicews() {
        return new UpdateTeacherPresenceServicews();
    }

    /**
     * Create an instance of {@link SearchTeacherPresenceServicewsResponse }
     * 
     */
    public SearchTeacherPresenceServicewsResponse createSearchTeacherPresenceServicewsResponse() {
        return new SearchTeacherPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchTeacherPresenceServicews }
     * 
     */
    public SearchTeacherPresenceServicews createSearchTeacherPresenceServicews() {
        return new SearchTeacherPresenceServicews();
    }

    /**
     * Create an instance of {@link CreateTeacherPresenceServicewsResponse }
     * 
     */
    public CreateTeacherPresenceServicewsResponse createCreateTeacherPresenceServicewsResponse() {
        return new CreateTeacherPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link TeacherPresenceDto }
     * 
     */
    public TeacherPresenceDto createTeacherPresenceDto() {
        return new TeacherPresenceDto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTeacherPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createTeacherPresenceServicewsResponse")
    public JAXBElement<CreateTeacherPresenceServicewsResponse> createCreateTeacherPresenceServicewsResponse(CreateTeacherPresenceServicewsResponse value) {
        return new JAXBElement<CreateTeacherPresenceServicewsResponse>(_CreateTeacherPresenceServicewsResponse_QNAME, CreateTeacherPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTeacherPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchTeacherPresenceServicews")
    public JAXBElement<SearchTeacherPresenceServicews> createSearchTeacherPresenceServicews(SearchTeacherPresenceServicews value) {
        return new JAXBElement<SearchTeacherPresenceServicews>(_SearchTeacherPresenceServicews_QNAME, SearchTeacherPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTeacherPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchTeacherPresenceServicewsResponse")
    public JAXBElement<SearchTeacherPresenceServicewsResponse> createSearchTeacherPresenceServicewsResponse(SearchTeacherPresenceServicewsResponse value) {
        return new JAXBElement<SearchTeacherPresenceServicewsResponse>(_SearchTeacherPresenceServicewsResponse_QNAME, SearchTeacherPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeacherPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateTeacherPresenceServicews")
    public JAXBElement<UpdateTeacherPresenceServicews> createUpdateTeacherPresenceServicews(UpdateTeacherPresenceServicews value) {
        return new JAXBElement<UpdateTeacherPresenceServicews>(_UpdateTeacherPresenceServicews_QNAME, UpdateTeacherPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeacherPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteTeacherPresenceServicewsResponse")
    public JAXBElement<DeleteTeacherPresenceServicewsResponse> createDeleteTeacherPresenceServicewsResponse(DeleteTeacherPresenceServicewsResponse value) {
        return new JAXBElement<DeleteTeacherPresenceServicewsResponse>(_DeleteTeacherPresenceServicewsResponse_QNAME, DeleteTeacherPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTeacherPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createTeacherPresenceServicews")
    public JAXBElement<CreateTeacherPresenceServicews> createCreateTeacherPresenceServicews(CreateTeacherPresenceServicews value) {
        return new JAXBElement<CreateTeacherPresenceServicews>(_CreateTeacherPresenceServicews_QNAME, CreateTeacherPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeacherPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteTeacherPresenceServicews")
    public JAXBElement<DeleteTeacherPresenceServicews> createDeleteTeacherPresenceServicews(DeleteTeacherPresenceServicews value) {
        return new JAXBElement<DeleteTeacherPresenceServicews>(_DeleteTeacherPresenceServicews_QNAME, DeleteTeacherPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeacherPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateTeacherPresenceServicewsResponse")
    public JAXBElement<UpdateTeacherPresenceServicewsResponse> createUpdateTeacherPresenceServicewsResponse(UpdateTeacherPresenceServicewsResponse value) {
        return new JAXBElement<UpdateTeacherPresenceServicewsResponse>(_UpdateTeacherPresenceServicewsResponse_QNAME, UpdateTeacherPresenceServicewsResponse.class, null, value);
    }

}
