
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentExamGroup allows you to programatically 
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
public class ObjectFactoryStudentExamGroup {

    private final static QName _UpdateStudentExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentExamGroupServicewsResponse");
    private final static QName _DeleteStudentExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentExamGroupServicews");
    private final static QName _SearchStudentExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentExamGroupServicews");
    private final static QName _DeleteStudentExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentExamGroupServicewsResponse");
    private final static QName _UpdateStudentExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentExamGroupServicews");
    private final static QName _SearchStudentExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentExamGroupServicewsResponse");
    private final static QName _CreateStudentExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentExamGroupServicewsResponse");
    private final static QName _CreateStudentExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentExamGroupServicews");

    /**
     * Create a new ObjectFactoryStudentExamGroup that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentExamGroup() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link CreateStudentExamGroupServicews }
     * 
     */
    public CreateStudentExamGroupServicews createCreateStudentExamGroupServicews() {
        return new CreateStudentExamGroupServicews();
    }

    /**
     * Create an instance of {@link CreateStudentExamGroupServicewsResponse }
     * 
     */
    public CreateStudentExamGroupServicewsResponse createCreateStudentExamGroupServicewsResponse() {
        return new CreateStudentExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentExamGroupServicewsResponse }
     * 
     */
    public SearchStudentExamGroupServicewsResponse createSearchStudentExamGroupServicewsResponse() {
        return new SearchStudentExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateStudentExamGroupServicews }
     * 
     */
    public UpdateStudentExamGroupServicews createUpdateStudentExamGroupServicews() {
        return new UpdateStudentExamGroupServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentExamGroupServicewsResponse }
     * 
     */
    public DeleteStudentExamGroupServicewsResponse createDeleteStudentExamGroupServicewsResponse() {
        return new DeleteStudentExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentExamGroupServicews }
     * 
     */
    public SearchStudentExamGroupServicews createSearchStudentExamGroupServicews() {
        return new SearchStudentExamGroupServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentExamGroupServicews }
     * 
     */
    public DeleteStudentExamGroupServicews createDeleteStudentExamGroupServicews() {
        return new DeleteStudentExamGroupServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentExamGroupServicewsResponse }
     * 
     */
    public UpdateStudentExamGroupServicewsResponse createUpdateStudentExamGroupServicewsResponse() {
        return new UpdateStudentExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link ExamGroupDto }
     * 
     */
    public ExamGroupDto createExamGroupDto() {
        return new ExamGroupDto();
    }

    /**
     * Create an instance of {@link StudentExamGroupDto }
     * 
     */
    public StudentExamGroupDto createStudentExamGroupDto() {
        return new StudentExamGroupDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentExamGroupServicewsResponse")
    public JAXBElement<UpdateStudentExamGroupServicewsResponse> createUpdateStudentExamGroupServicewsResponse(UpdateStudentExamGroupServicewsResponse value) {
        return new JAXBElement<UpdateStudentExamGroupServicewsResponse>(_UpdateStudentExamGroupServicewsResponse_QNAME, UpdateStudentExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentExamGroupServicews")
    public JAXBElement<DeleteStudentExamGroupServicews> createDeleteStudentExamGroupServicews(DeleteStudentExamGroupServicews value) {
        return new JAXBElement<DeleteStudentExamGroupServicews>(_DeleteStudentExamGroupServicews_QNAME, DeleteStudentExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentExamGroupServicews")
    public JAXBElement<SearchStudentExamGroupServicews> createSearchStudentExamGroupServicews(SearchStudentExamGroupServicews value) {
        return new JAXBElement<SearchStudentExamGroupServicews>(_SearchStudentExamGroupServicews_QNAME, SearchStudentExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentExamGroupServicewsResponse")
    public JAXBElement<DeleteStudentExamGroupServicewsResponse> createDeleteStudentExamGroupServicewsResponse(DeleteStudentExamGroupServicewsResponse value) {
        return new JAXBElement<DeleteStudentExamGroupServicewsResponse>(_DeleteStudentExamGroupServicewsResponse_QNAME, DeleteStudentExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentExamGroupServicews")
    public JAXBElement<UpdateStudentExamGroupServicews> createUpdateStudentExamGroupServicews(UpdateStudentExamGroupServicews value) {
        return new JAXBElement<UpdateStudentExamGroupServicews>(_UpdateStudentExamGroupServicews_QNAME, UpdateStudentExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentExamGroupServicewsResponse")
    public JAXBElement<SearchStudentExamGroupServicewsResponse> createSearchStudentExamGroupServicewsResponse(SearchStudentExamGroupServicewsResponse value) {
        return new JAXBElement<SearchStudentExamGroupServicewsResponse>(_SearchStudentExamGroupServicewsResponse_QNAME, SearchStudentExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentExamGroupServicewsResponse")
    public JAXBElement<CreateStudentExamGroupServicewsResponse> createCreateStudentExamGroupServicewsResponse(CreateStudentExamGroupServicewsResponse value) {
        return new JAXBElement<CreateStudentExamGroupServicewsResponse>(_CreateStudentExamGroupServicewsResponse_QNAME, CreateStudentExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentExamGroupServicews")
    public JAXBElement<CreateStudentExamGroupServicews> createCreateStudentExamGroupServicews(CreateStudentExamGroupServicews value) {
        return new JAXBElement<CreateStudentExamGroupServicews>(_CreateStudentExamGroupServicews_QNAME, CreateStudentExamGroupServicews.class, null, value);
    }

}
