
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.parameterweb.serviceapi package. 
 * <p>An ObjectFactoryRoomInventory allows you to programatically 
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
public class ObjectFactoryCourseSubject {

    private final static QName _DeleteCourseSubjectServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteCourseSubjectServicews");
    private final static QName _GetAllCourseSubjectServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllCourseSubjectServicews");
    private final static QName _CreateCourseSubjectServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createCourseSubjectServicewsResponse");
    private final static QName _UpdateCourseSubjectServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateCourseSubjectServicews");
    private final static QName _UpdateCourseSubjectServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateCourseSubjectServicewsResponse");
    private final static QName _SearchCourseSubjectServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchCourseSubjectServicewsResponse");
    private final static QName _SearchCourseSubjectServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchCourseSubjectServicews");
    private final static QName _CreateCourseSubjectServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createCourseSubjectServicews");
    private final static QName _GetAllCourseSubjectServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllCourseSubjectServicewsResponse");
    private final static QName _DeleteCourseSubjectServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteCourseSubjectServicewsResponse");

    /**
     * Create a new ObjectFactoryRoomInventory that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryCourseSubject() {
    }

    /**
     * Create an instance of {@link AcademicModuleDto }
     * 
     */
    public AcademicModuleDto createAcademicModuleDto() {
        return new AcademicModuleDto();
    }

    /**
     * Create an instance of {@link CourseSubjectDto }
     * 
     */
    public CourseSubjectDto createCourseSubjectDto() {
        return new CourseSubjectDto();
    }

    /**
     * Create an instance of {@link DeleteCourseSubjectServicewsResponse }
     * 
     */
    public DeleteCourseSubjectServicewsResponse createDeleteCourseSubjectServicewsResponse() {
        return new DeleteCourseSubjectServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllCourseSubjectServicewsResponse }
     * 
     */
    public GetAllCourseSubjectServicewsResponse createGetAllCourseSubjectServicewsResponse() {
        return new GetAllCourseSubjectServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateCourseSubjectServicews }
     * 
     */
    public CreateCourseSubjectServicews createCreateCourseSubjectServicews() {
        return new CreateCourseSubjectServicews();
    }

    /**
     * Create an instance of {@link SearchCourseSubjectServicews }
     * 
     */
    public SearchCourseSubjectServicews createSearchCourseSubjectServicews() {
        return new SearchCourseSubjectServicews();
    }

    /**
     * Create an instance of {@link SearchCourseSubjectServicewsResponse }
     * 
     */
    public SearchCourseSubjectServicewsResponse createSearchCourseSubjectServicewsResponse() {
        return new SearchCourseSubjectServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateCourseSubjectServicewsResponse }
     * 
     */
    public UpdateCourseSubjectServicewsResponse createUpdateCourseSubjectServicewsResponse() {
        return new UpdateCourseSubjectServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateCourseSubjectServicewsResponse }
     * 
     */
    public CreateCourseSubjectServicewsResponse createCreateCourseSubjectServicewsResponse() {
        return new CreateCourseSubjectServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateCourseSubjectServicews }
     * 
     */
    public UpdateCourseSubjectServicews createUpdateCourseSubjectServicews() {
        return new UpdateCourseSubjectServicews();
    }

    /**
     * Create an instance of {@link GetAllCourseSubjectServicews }
     * 
     */
    public GetAllCourseSubjectServicews createGetAllCourseSubjectServicews() {
        return new GetAllCourseSubjectServicews();
    }

    /**
     * Create an instance of {@link DeleteCourseSubjectServicews }
     * 
     */
    public DeleteCourseSubjectServicews createDeleteCourseSubjectServicews() {
        return new DeleteCourseSubjectServicews();
    }

    /**
     * Create an instance of {@link PopuplistDto }
     * 
     */
    public PopuplistDto createPopuplistDto() {
        return new PopuplistDto();
    }

    /**
     * Create an instance of {@link AcademicModuleDto.RequiredModules }
     * 
     */
    public AcademicModuleDto.RequiredModules createAcademicModuleDtoRequiredModules() {
        return new AcademicModuleDto.RequiredModules();
    }

    /**
     * Create an instance of {@link CourseSubjectDto.Academicmodules }
     * 
     */
    public CourseSubjectDto.Academicmodules createCourseSubjectDtoAcademicmodules() {
        return new CourseSubjectDto.Academicmodules();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourseSubjectServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteCourseSubjectServicews")
    public JAXBElement<DeleteCourseSubjectServicews> createDeleteCourseSubjectServicews(DeleteCourseSubjectServicews value) {
        return new JAXBElement<DeleteCourseSubjectServicews>(_DeleteCourseSubjectServicews_QNAME, DeleteCourseSubjectServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCourseSubjectServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllCourseSubjectServicews")
    public JAXBElement<GetAllCourseSubjectServicews> createGetAllCourseSubjectServicews(GetAllCourseSubjectServicews value) {
        return new JAXBElement<GetAllCourseSubjectServicews>(_GetAllCourseSubjectServicews_QNAME, GetAllCourseSubjectServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCourseSubjectServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createCourseSubjectServicewsResponse")
    public JAXBElement<CreateCourseSubjectServicewsResponse> createCreateCourseSubjectServicewsResponse(CreateCourseSubjectServicewsResponse value) {
        return new JAXBElement<CreateCourseSubjectServicewsResponse>(_CreateCourseSubjectServicewsResponse_QNAME, CreateCourseSubjectServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCourseSubjectServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateCourseSubjectServicews")
    public JAXBElement<UpdateCourseSubjectServicews> createUpdateCourseSubjectServicews(UpdateCourseSubjectServicews value) {
        return new JAXBElement<UpdateCourseSubjectServicews>(_UpdateCourseSubjectServicews_QNAME, UpdateCourseSubjectServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCourseSubjectServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateCourseSubjectServicewsResponse")
    public JAXBElement<UpdateCourseSubjectServicewsResponse> createUpdateCourseSubjectServicewsResponse(UpdateCourseSubjectServicewsResponse value) {
        return new JAXBElement<UpdateCourseSubjectServicewsResponse>(_UpdateCourseSubjectServicewsResponse_QNAME, UpdateCourseSubjectServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCourseSubjectServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchCourseSubjectServicewsResponse")
    public JAXBElement<SearchCourseSubjectServicewsResponse> createSearchCourseSubjectServicewsResponse(SearchCourseSubjectServicewsResponse value) {
        return new JAXBElement<SearchCourseSubjectServicewsResponse>(_SearchCourseSubjectServicewsResponse_QNAME, SearchCourseSubjectServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCourseSubjectServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchCourseSubjectServicews")
    public JAXBElement<SearchCourseSubjectServicews> createSearchCourseSubjectServicews(SearchCourseSubjectServicews value) {
        return new JAXBElement<SearchCourseSubjectServicews>(_SearchCourseSubjectServicews_QNAME, SearchCourseSubjectServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCourseSubjectServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createCourseSubjectServicews")
    public JAXBElement<CreateCourseSubjectServicews> createCreateCourseSubjectServicews(CreateCourseSubjectServicews value) {
        return new JAXBElement<CreateCourseSubjectServicews>(_CreateCourseSubjectServicews_QNAME, CreateCourseSubjectServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCourseSubjectServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllCourseSubjectServicewsResponse")
    public JAXBElement<GetAllCourseSubjectServicewsResponse> createGetAllCourseSubjectServicewsResponse(GetAllCourseSubjectServicewsResponse value) {
        return new JAXBElement<GetAllCourseSubjectServicewsResponse>(_GetAllCourseSubjectServicewsResponse_QNAME, GetAllCourseSubjectServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourseSubjectServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteCourseSubjectServicewsResponse")
    public JAXBElement<DeleteCourseSubjectServicewsResponse> createDeleteCourseSubjectServicewsResponse(DeleteCourseSubjectServicewsResponse value) {
        return new JAXBElement<DeleteCourseSubjectServicewsResponse>(_DeleteCourseSubjectServicewsResponse_QNAME, DeleteCourseSubjectServicewsResponse.class, null, value);
    }

}
