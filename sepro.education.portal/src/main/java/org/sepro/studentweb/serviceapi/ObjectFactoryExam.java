
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryExam allows you to programatically 
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
public class ObjectFactoryExam {

    private final static QName _DeleteExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteExamServicewsResponse");
    private final static QName _SearchExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchExamServicews");
    private final static QName _UpdateExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateExamServicews");
    private final static QName _UpdateExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateExamServicewsResponse");
    private final static QName _DeleteExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteExamServicews");
    private final static QName _CreateExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createExamServicews");
    private final static QName _CreateExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createExamServicewsResponse");
    private final static QName _SearchExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchExamServicewsResponse");

    /**
     * Create a new ObjectFactoryExam that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryExam() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link SearchExamServicewsResponse }
     * 
     */
    public SearchExamServicewsResponse createSearchExamServicewsResponse() {
        return new SearchExamServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateExamServicews }
     * 
     */
    public CreateExamServicews createCreateExamServicews() {
        return new CreateExamServicews();
    }

    /**
     * Create an instance of {@link CreateExamServicewsResponse }
     * 
     */
    public CreateExamServicewsResponse createCreateExamServicewsResponse() {
        return new CreateExamServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteExamServicews }
     * 
     */
    public DeleteExamServicews createDeleteExamServicews() {
        return new DeleteExamServicews();
    }

    /**
     * Create an instance of {@link UpdateExamServicews }
     * 
     */
    public UpdateExamServicews createUpdateExamServicews() {
        return new UpdateExamServicews();
    }

    /**
     * Create an instance of {@link UpdateExamServicewsResponse }
     * 
     */
    public UpdateExamServicewsResponse createUpdateExamServicewsResponse() {
        return new UpdateExamServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchExamServicews }
     * 
     */
    public SearchExamServicews createSearchExamServicews() {
        return new SearchExamServicews();
    }

    /**
     * Create an instance of {@link DeleteExamServicewsResponse }
     * 
     */
    public DeleteExamServicewsResponse createDeleteExamServicewsResponse() {
        return new DeleteExamServicewsResponse();
    }

    /**
     * Create an instance of {@link ExamDto }
     * 
     */
    public ExamDto createExamDto() {
        return new ExamDto();
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
     * Create an instance of {@link ExamGroupDto }
     * 
     */
    public ExamGroupDto createExamGroupDto() {
        return new ExamGroupDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteExamServicewsResponse")
    public JAXBElement<DeleteExamServicewsResponse> createDeleteExamServicewsResponse(DeleteExamServicewsResponse value) {
        return new JAXBElement<DeleteExamServicewsResponse>(_DeleteExamServicewsResponse_QNAME, DeleteExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchExamServicews")
    public JAXBElement<SearchExamServicews> createSearchExamServicews(SearchExamServicews value) {
        return new JAXBElement<SearchExamServicews>(_SearchExamServicews_QNAME, SearchExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateExamServicews")
    public JAXBElement<UpdateExamServicews> createUpdateExamServicews(UpdateExamServicews value) {
        return new JAXBElement<UpdateExamServicews>(_UpdateExamServicews_QNAME, UpdateExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateExamServicewsResponse")
    public JAXBElement<UpdateExamServicewsResponse> createUpdateExamServicewsResponse(UpdateExamServicewsResponse value) {
        return new JAXBElement<UpdateExamServicewsResponse>(_UpdateExamServicewsResponse_QNAME, UpdateExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteExamServicews")
    public JAXBElement<DeleteExamServicews> createDeleteExamServicews(DeleteExamServicews value) {
        return new JAXBElement<DeleteExamServicews>(_DeleteExamServicews_QNAME, DeleteExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createExamServicews")
    public JAXBElement<CreateExamServicews> createCreateExamServicews(CreateExamServicews value) {
        return new JAXBElement<CreateExamServicews>(_CreateExamServicews_QNAME, CreateExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createExamServicewsResponse")
    public JAXBElement<CreateExamServicewsResponse> createCreateExamServicewsResponse(CreateExamServicewsResponse value) {
        return new JAXBElement<CreateExamServicewsResponse>(_CreateExamServicewsResponse_QNAME, CreateExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchExamServicewsResponse")
    public JAXBElement<SearchExamServicewsResponse> createSearchExamServicewsResponse(SearchExamServicewsResponse value) {
        return new JAXBElement<SearchExamServicewsResponse>(_SearchExamServicewsResponse_QNAME, SearchExamServicewsResponse.class, null, value);
    }

}
