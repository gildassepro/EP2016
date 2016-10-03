
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentPresence allows you to programatically 
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
public class ObjectFactoryStudentPresence {

    private final static QName _DeleteStudentPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentPresenceServicews");
    private final static QName _SearchStudentPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentPresenceServicews");
    private final static QName _UpdateStudentPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentPresenceServicewsResponse");
    private final static QName _CreateStudentPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentPresenceServicews");
    private final static QName _DeleteStudentPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentPresenceServicewsResponse");
    private final static QName _SearchStudentPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentPresenceServicewsResponse");
    private final static QName _CreateStudentPresenceServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentPresenceServicewsResponse");
    private final static QName _UpdateStudentPresenceServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentPresenceServicews");

    /**
     * Create a new ObjectFactoryStudentPresence that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentPresence() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link UpdateStudentPresenceServicews }
     * 
     */
    public UpdateStudentPresenceServicews createUpdateStudentPresenceServicews() {
        return new UpdateStudentPresenceServicews();
    }

    /**
     * Create an instance of {@link CreateStudentPresenceServicewsResponse }
     * 
     */
    public CreateStudentPresenceServicewsResponse createCreateStudentPresenceServicewsResponse() {
        return new CreateStudentPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentPresenceServicewsResponse }
     * 
     */
    public DeleteStudentPresenceServicewsResponse createDeleteStudentPresenceServicewsResponse() {
        return new DeleteStudentPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentPresenceServicewsResponse }
     * 
     */
    public SearchStudentPresenceServicewsResponse createSearchStudentPresenceServicewsResponse() {
        return new SearchStudentPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateStudentPresenceServicews }
     * 
     */
    public CreateStudentPresenceServicews createCreateStudentPresenceServicews() {
        return new CreateStudentPresenceServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentPresenceServicewsResponse }
     * 
     */
    public UpdateStudentPresenceServicewsResponse createUpdateStudentPresenceServicewsResponse() {
        return new UpdateStudentPresenceServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentPresenceServicews }
     * 
     */
    public DeleteStudentPresenceServicews createDeleteStudentPresenceServicews() {
        return new DeleteStudentPresenceServicews();
    }

    /**
     * Create an instance of {@link SearchStudentPresenceServicews }
     * 
     */
    public SearchStudentPresenceServicews createSearchStudentPresenceServicews() {
        return new SearchStudentPresenceServicews();
    }

    /**
     * Create an instance of {@link StudentPresenceDto }
     * 
     */
    public StudentPresenceDto createStudentPresenceDto() {
        return new StudentPresenceDto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentPresenceServicews")
    public JAXBElement<DeleteStudentPresenceServicews> createDeleteStudentPresenceServicews(DeleteStudentPresenceServicews value) {
        return new JAXBElement<DeleteStudentPresenceServicews>(_DeleteStudentPresenceServicews_QNAME, DeleteStudentPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentPresenceServicews")
    public JAXBElement<SearchStudentPresenceServicews> createSearchStudentPresenceServicews(SearchStudentPresenceServicews value) {
        return new JAXBElement<SearchStudentPresenceServicews>(_SearchStudentPresenceServicews_QNAME, SearchStudentPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentPresenceServicewsResponse")
    public JAXBElement<UpdateStudentPresenceServicewsResponse> createUpdateStudentPresenceServicewsResponse(UpdateStudentPresenceServicewsResponse value) {
        return new JAXBElement<UpdateStudentPresenceServicewsResponse>(_UpdateStudentPresenceServicewsResponse_QNAME, UpdateStudentPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentPresenceServicews")
    public JAXBElement<CreateStudentPresenceServicews> createCreateStudentPresenceServicews(CreateStudentPresenceServicews value) {
        return new JAXBElement<CreateStudentPresenceServicews>(_CreateStudentPresenceServicews_QNAME, CreateStudentPresenceServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentPresenceServicewsResponse")
    public JAXBElement<DeleteStudentPresenceServicewsResponse> createDeleteStudentPresenceServicewsResponse(DeleteStudentPresenceServicewsResponse value) {
        return new JAXBElement<DeleteStudentPresenceServicewsResponse>(_DeleteStudentPresenceServicewsResponse_QNAME, DeleteStudentPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentPresenceServicewsResponse")
    public JAXBElement<SearchStudentPresenceServicewsResponse> createSearchStudentPresenceServicewsResponse(SearchStudentPresenceServicewsResponse value) {
        return new JAXBElement<SearchStudentPresenceServicewsResponse>(_SearchStudentPresenceServicewsResponse_QNAME, SearchStudentPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentPresenceServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentPresenceServicewsResponse")
    public JAXBElement<CreateStudentPresenceServicewsResponse> createCreateStudentPresenceServicewsResponse(CreateStudentPresenceServicewsResponse value) {
        return new JAXBElement<CreateStudentPresenceServicewsResponse>(_CreateStudentPresenceServicewsResponse_QNAME, CreateStudentPresenceServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentPresenceServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentPresenceServicews")
    public JAXBElement<UpdateStudentPresenceServicews> createUpdateStudentPresenceServicews(UpdateStudentPresenceServicews value) {
        return new JAXBElement<UpdateStudentPresenceServicews>(_UpdateStudentPresenceServicews_QNAME, UpdateStudentPresenceServicews.class, null, value);
    }

}
