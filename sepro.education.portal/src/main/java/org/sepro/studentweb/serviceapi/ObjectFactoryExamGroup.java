
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryExamGroup allows you to programatically 
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
public class ObjectFactoryExamGroup {

    private final static QName _SearchExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchExamGroupServicewsResponse");
    private final static QName _UpdateExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateExamGroupServicews");
    private final static QName _SearchExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchExamGroupServicews");
    private final static QName _CreateExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createExamGroupServicews");
    private final static QName _CreateExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createExamGroupServicewsResponse");
    private final static QName _UpdateExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateExamGroupServicewsResponse");
    private final static QName _DeleteExamGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteExamGroupServicews");
    private final static QName _DeleteExamGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteExamGroupServicewsResponse");

    /**
     * Create a new ObjectFactoryExamGroup that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryExamGroup() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link DeleteExamGroupServicewsResponse }
     * 
     */
    public DeleteExamGroupServicewsResponse createDeleteExamGroupServicewsResponse() {
        return new DeleteExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteExamGroupServicews }
     * 
     */
    public DeleteExamGroupServicews createDeleteExamGroupServicews() {
        return new DeleteExamGroupServicews();
    }

    /**
     * Create an instance of {@link UpdateExamGroupServicewsResponse }
     * 
     */
    public UpdateExamGroupServicewsResponse createUpdateExamGroupServicewsResponse() {
        return new UpdateExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateExamGroupServicewsResponse }
     * 
     */
    public CreateExamGroupServicewsResponse createCreateExamGroupServicewsResponse() {
        return new CreateExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateExamGroupServicews }
     * 
     */
    public CreateExamGroupServicews createCreateExamGroupServicews() {
        return new CreateExamGroupServicews();
    }

    /**
     * Create an instance of {@link SearchExamGroupServicews }
     * 
     */
    public SearchExamGroupServicews createSearchExamGroupServicews() {
        return new SearchExamGroupServicews();
    }

    /**
     * Create an instance of {@link SearchExamGroupServicewsResponse }
     * 
     */
    public SearchExamGroupServicewsResponse createSearchExamGroupServicewsResponse() {
        return new SearchExamGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateExamGroupServicews }
     * 
     */
    public UpdateExamGroupServicews createUpdateExamGroupServicews() {
        return new UpdateExamGroupServicews();
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
     * Create an instance of {@link ExamModuleGroupDto }
     * 
     */
    public ExamModuleGroupDto createExamModuleGroupDto() {
        return new ExamModuleGroupDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchExamGroupServicewsResponse")
    public JAXBElement<SearchExamGroupServicewsResponse> createSearchExamGroupServicewsResponse(SearchExamGroupServicewsResponse value) {
        return new JAXBElement<SearchExamGroupServicewsResponse>(_SearchExamGroupServicewsResponse_QNAME, SearchExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateExamGroupServicews")
    public JAXBElement<UpdateExamGroupServicews> createUpdateExamGroupServicews(UpdateExamGroupServicews value) {
        return new JAXBElement<UpdateExamGroupServicews>(_UpdateExamGroupServicews_QNAME, UpdateExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchExamGroupServicews")
    public JAXBElement<SearchExamGroupServicews> createSearchExamGroupServicews(SearchExamGroupServicews value) {
        return new JAXBElement<SearchExamGroupServicews>(_SearchExamGroupServicews_QNAME, SearchExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createExamGroupServicews")
    public JAXBElement<CreateExamGroupServicews> createCreateExamGroupServicews(CreateExamGroupServicews value) {
        return new JAXBElement<CreateExamGroupServicews>(_CreateExamGroupServicews_QNAME, CreateExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createExamGroupServicewsResponse")
    public JAXBElement<CreateExamGroupServicewsResponse> createCreateExamGroupServicewsResponse(CreateExamGroupServicewsResponse value) {
        return new JAXBElement<CreateExamGroupServicewsResponse>(_CreateExamGroupServicewsResponse_QNAME, CreateExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateExamGroupServicewsResponse")
    public JAXBElement<UpdateExamGroupServicewsResponse> createUpdateExamGroupServicewsResponse(UpdateExamGroupServicewsResponse value) {
        return new JAXBElement<UpdateExamGroupServicewsResponse>(_UpdateExamGroupServicewsResponse_QNAME, UpdateExamGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExamGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteExamGroupServicews")
    public JAXBElement<DeleteExamGroupServicews> createDeleteExamGroupServicews(DeleteExamGroupServicews value) {
        return new JAXBElement<DeleteExamGroupServicews>(_DeleteExamGroupServicews_QNAME, DeleteExamGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExamGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteExamGroupServicewsResponse")
    public JAXBElement<DeleteExamGroupServicewsResponse> createDeleteExamGroupServicewsResponse(DeleteExamGroupServicewsResponse value) {
        return new JAXBElement<DeleteExamGroupServicewsResponse>(_DeleteExamGroupServicewsResponse_QNAME, DeleteExamGroupServicewsResponse.class, null, value);
    }

}
