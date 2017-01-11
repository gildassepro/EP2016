
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentExam allows you to programatically 
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
public class ObjectFactoryStudentExam {

    private final static QName _SearchStudentExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentExamServicews");
    private final static QName _UpdateStudentExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentExamServicewsResponse");
    private final static QName _CreateStudentExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentExamServicewsResponse");
    private final static QName _SearchStudentExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentExamServicewsResponse");
    private final static QName _UpdateStudentExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentExamServicews");
    private final static QName _DeleteStudentExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentExamServicews");
    private final static QName _CreateStudentExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentExamServicews");
    private final static QName _DeleteStudentExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentExamServicewsResponse");

    /**
     * Create a new ObjectFactoryStudentExam that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentExam() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link DeleteStudentExamServicewsResponse }
     * 
     */
    public DeleteStudentExamServicewsResponse createDeleteStudentExamServicewsResponse() {
        return new DeleteStudentExamServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateStudentExamServicews }
     * 
     */
    public CreateStudentExamServicews createCreateStudentExamServicews() {
        return new CreateStudentExamServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentExamServicews }
     * 
     */
    public DeleteStudentExamServicews createDeleteStudentExamServicews() {
        return new DeleteStudentExamServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentExamServicews }
     * 
     */
    public UpdateStudentExamServicews createUpdateStudentExamServicews() {
        return new UpdateStudentExamServicews();
    }

    /**
     * Create an instance of {@link CreateStudentExamServicewsResponse }
     * 
     */
    public CreateStudentExamServicewsResponse createCreateStudentExamServicewsResponse() {
        return new CreateStudentExamServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentExamServicewsResponse }
     * 
     */
    public SearchStudentExamServicewsResponse createSearchStudentExamServicewsResponse() {
        return new SearchStudentExamServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateStudentExamServicewsResponse }
     * 
     */
    public UpdateStudentExamServicewsResponse createUpdateStudentExamServicewsResponse() {
        return new UpdateStudentExamServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentExamServicews }
     * 
     */
    public SearchStudentExamServicews createSearchStudentExamServicews() {
        return new SearchStudentExamServicews();
    }

    /**
     * Create an instance of {@link ExamDto }
     * 
     */
    public ExamDto createExamDto() {
        return new ExamDto();
    }

    /**
     * Create an instance of {@link StudentExamDto }
     * 
     */
    public StudentExamDto createStudentExamDto() {
        return new StudentExamDto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentExamServicews")
    public JAXBElement<SearchStudentExamServicews> createSearchStudentExamServicews(SearchStudentExamServicews value) {
        return new JAXBElement<SearchStudentExamServicews>(_SearchStudentExamServicews_QNAME, SearchStudentExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentExamServicewsResponse")
    public JAXBElement<UpdateStudentExamServicewsResponse> createUpdateStudentExamServicewsResponse(UpdateStudentExamServicewsResponse value) {
        return new JAXBElement<UpdateStudentExamServicewsResponse>(_UpdateStudentExamServicewsResponse_QNAME, UpdateStudentExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentExamServicewsResponse")
    public JAXBElement<CreateStudentExamServicewsResponse> createCreateStudentExamServicewsResponse(CreateStudentExamServicewsResponse value) {
        return new JAXBElement<CreateStudentExamServicewsResponse>(_CreateStudentExamServicewsResponse_QNAME, CreateStudentExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentExamServicewsResponse")
    public JAXBElement<SearchStudentExamServicewsResponse> createSearchStudentExamServicewsResponse(SearchStudentExamServicewsResponse value) {
        return new JAXBElement<SearchStudentExamServicewsResponse>(_SearchStudentExamServicewsResponse_QNAME, SearchStudentExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentExamServicews")
    public JAXBElement<UpdateStudentExamServicews> createUpdateStudentExamServicews(UpdateStudentExamServicews value) {
        return new JAXBElement<UpdateStudentExamServicews>(_UpdateStudentExamServicews_QNAME, UpdateStudentExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentExamServicews")
    public JAXBElement<DeleteStudentExamServicews> createDeleteStudentExamServicews(DeleteStudentExamServicews value) {
        return new JAXBElement<DeleteStudentExamServicews>(_DeleteStudentExamServicews_QNAME, DeleteStudentExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentExamServicews")
    public JAXBElement<CreateStudentExamServicews> createCreateStudentExamServicews(CreateStudentExamServicews value) {
        return new JAXBElement<CreateStudentExamServicews>(_CreateStudentExamServicews_QNAME, CreateStudentExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentExamServicewsResponse")
    public JAXBElement<DeleteStudentExamServicewsResponse> createDeleteStudentExamServicewsResponse(DeleteStudentExamServicewsResponse value) {
        return new JAXBElement<DeleteStudentExamServicewsResponse>(_DeleteStudentExamServicewsResponse_QNAME, DeleteStudentExamServicewsResponse.class, null, value);
    }

}
