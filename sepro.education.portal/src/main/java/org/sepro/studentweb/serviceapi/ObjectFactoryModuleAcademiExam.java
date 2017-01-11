
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryModuleAcademiExam allows you to programatically 
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
public class ObjectFactoryModuleAcademiExam {

    private final static QName _CreateModuleAcademiExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createModuleAcademiExamServicews");
    private final static QName _CreateModuleAcademiExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createModuleAcademiExamServicewsResponse");
    private final static QName _SearchModuleAcademiExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchModuleAcademiExamServicews");
    private final static QName _DeleteModuleAcademiExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteModuleAcademiExamServicewsResponse");
    private final static QName _DeleteModuleAcademiExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteModuleAcademiExamServicews");
    private final static QName _UpdateModuleAcademiExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateModuleAcademiExamServicews");
    private final static QName _SearchModuleAcademiExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchModuleAcademiExamServicewsResponse");
    private final static QName _UpdateModuleAcademiExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateModuleAcademiExamServicewsResponse");

    /**
     * Create a new ObjectFactoryModuleAcademiExam that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryModuleAcademiExam() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link UpdateModuleAcademiExamServicewsResponse }
     * 
     */
    public UpdateModuleAcademiExamServicewsResponse createUpdateModuleAcademiExamServicewsResponse() {
        return new UpdateModuleAcademiExamServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchModuleAcademiExamServicewsResponse }
     * 
     */
    public SearchModuleAcademiExamServicewsResponse createSearchModuleAcademiExamServicewsResponse() {
        return new SearchModuleAcademiExamServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateModuleAcademiExamServicews }
     * 
     */
    public UpdateModuleAcademiExamServicews createUpdateModuleAcademiExamServicews() {
        return new UpdateModuleAcademiExamServicews();
    }

    /**
     * Create an instance of {@link DeleteModuleAcademiExamServicews }
     * 
     */
    public DeleteModuleAcademiExamServicews createDeleteModuleAcademiExamServicews() {
        return new DeleteModuleAcademiExamServicews();
    }

    /**
     * Create an instance of {@link DeleteModuleAcademiExamServicewsResponse }
     * 
     */
    public DeleteModuleAcademiExamServicewsResponse createDeleteModuleAcademiExamServicewsResponse() {
        return new DeleteModuleAcademiExamServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchModuleAcademiExamServicews }
     * 
     */
    public SearchModuleAcademiExamServicews createSearchModuleAcademiExamServicews() {
        return new SearchModuleAcademiExamServicews();
    }

    /**
     * Create an instance of {@link CreateModuleAcademiExamServicewsResponse }
     * 
     */
    public CreateModuleAcademiExamServicewsResponse createCreateModuleAcademiExamServicewsResponse() {
        return new CreateModuleAcademiExamServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateModuleAcademiExamServicews }
     * 
     */
    public CreateModuleAcademiExamServicews createCreateModuleAcademiExamServicews() {
        return new CreateModuleAcademiExamServicews();
    }

    /**
     * Create an instance of {@link ModuleAcademiExamDto }
     * 
     */
    public ModuleAcademiExamDto createModuleAcademiExamDto() {
        return new ModuleAcademiExamDto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModuleAcademiExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createModuleAcademiExamServicews")
    public JAXBElement<CreateModuleAcademiExamServicews> createCreateModuleAcademiExamServicews(CreateModuleAcademiExamServicews value) {
        return new JAXBElement<CreateModuleAcademiExamServicews>(_CreateModuleAcademiExamServicews_QNAME, CreateModuleAcademiExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModuleAcademiExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createModuleAcademiExamServicewsResponse")
    public JAXBElement<CreateModuleAcademiExamServicewsResponse> createCreateModuleAcademiExamServicewsResponse(CreateModuleAcademiExamServicewsResponse value) {
        return new JAXBElement<CreateModuleAcademiExamServicewsResponse>(_CreateModuleAcademiExamServicewsResponse_QNAME, CreateModuleAcademiExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchModuleAcademiExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchModuleAcademiExamServicews")
    public JAXBElement<SearchModuleAcademiExamServicews> createSearchModuleAcademiExamServicews(SearchModuleAcademiExamServicews value) {
        return new JAXBElement<SearchModuleAcademiExamServicews>(_SearchModuleAcademiExamServicews_QNAME, SearchModuleAcademiExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModuleAcademiExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteModuleAcademiExamServicewsResponse")
    public JAXBElement<DeleteModuleAcademiExamServicewsResponse> createDeleteModuleAcademiExamServicewsResponse(DeleteModuleAcademiExamServicewsResponse value) {
        return new JAXBElement<DeleteModuleAcademiExamServicewsResponse>(_DeleteModuleAcademiExamServicewsResponse_QNAME, DeleteModuleAcademiExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModuleAcademiExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteModuleAcademiExamServicews")
    public JAXBElement<DeleteModuleAcademiExamServicews> createDeleteModuleAcademiExamServicews(DeleteModuleAcademiExamServicews value) {
        return new JAXBElement<DeleteModuleAcademiExamServicews>(_DeleteModuleAcademiExamServicews_QNAME, DeleteModuleAcademiExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateModuleAcademiExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateModuleAcademiExamServicews")
    public JAXBElement<UpdateModuleAcademiExamServicews> createUpdateModuleAcademiExamServicews(UpdateModuleAcademiExamServicews value) {
        return new JAXBElement<UpdateModuleAcademiExamServicews>(_UpdateModuleAcademiExamServicews_QNAME, UpdateModuleAcademiExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchModuleAcademiExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchModuleAcademiExamServicewsResponse")
    public JAXBElement<SearchModuleAcademiExamServicewsResponse> createSearchModuleAcademiExamServicewsResponse(SearchModuleAcademiExamServicewsResponse value) {
        return new JAXBElement<SearchModuleAcademiExamServicewsResponse>(_SearchModuleAcademiExamServicewsResponse_QNAME, SearchModuleAcademiExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateModuleAcademiExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateModuleAcademiExamServicewsResponse")
    public JAXBElement<UpdateModuleAcademiExamServicewsResponse> createUpdateModuleAcademiExamServicewsResponse(UpdateModuleAcademiExamServicewsResponse value) {
        return new JAXBElement<UpdateModuleAcademiExamServicewsResponse>(_UpdateModuleAcademiExamServicewsResponse_QNAME, UpdateModuleAcademiExamServicewsResponse.class, null, value);
    }

}
