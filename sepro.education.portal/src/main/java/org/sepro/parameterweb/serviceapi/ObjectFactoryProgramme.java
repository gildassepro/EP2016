
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
public class ObjectFactoryProgramme {

    private final static QName _UpdateProgrammeServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateProgrammeServicewsResponse");
    private final static QName _SearchProgrammeServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchProgrammeServicews");
    private final static QName _UpdateProgrammeServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateProgrammeServicews");
    private final static QName _CreateProgrammeServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createProgrammeServicews");
    private final static QName _CreateProgrammeServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createProgrammeServicewsResponse");
    private final static QName _GetAllProgrammeServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllProgrammeServicewsResponse");
    private final static QName _SearchProgrammeServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchProgrammeServicewsResponse");
    private final static QName _DeleteProgrammeServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteProgrammeServicews");
    private final static QName _DeleteProgrammeServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteProgrammeServicewsResponse");
    private final static QName _GetAllProgrammeServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllProgrammeServicews");

    /**
     * Create a new ObjectFactoryRoomInventory that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryProgramme() {
    }

    /**
     * Create an instance of {@link AcademicModuleDto }
     * 
     */
    public AcademicModuleDto createAcademicModuleDto() {
        return new AcademicModuleDto();
    }

    /**
     * Create an instance of {@link ProgrammeDto }
     * 
     */
    public ProgrammeDto createProgrammeDto() {
        return new ProgrammeDto();
    }

    /**
     * Create an instance of {@link GetAllProgrammeServicews }
     * 
     */
    public GetAllProgrammeServicews createGetAllProgrammeServicews() {
        return new GetAllProgrammeServicews();
    }

    /**
     * Create an instance of {@link DeleteProgrammeServicewsResponse }
     * 
     */
    public DeleteProgrammeServicewsResponse createDeleteProgrammeServicewsResponse() {
        return new DeleteProgrammeServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteProgrammeServicews }
     * 
     */
    public DeleteProgrammeServicews createDeleteProgrammeServicews() {
        return new DeleteProgrammeServicews();
    }

    /**
     * Create an instance of {@link SearchProgrammeServicewsResponse }
     * 
     */
    public SearchProgrammeServicewsResponse createSearchProgrammeServicewsResponse() {
        return new SearchProgrammeServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateProgrammeServicewsResponse }
     * 
     */
    public CreateProgrammeServicewsResponse createCreateProgrammeServicewsResponse() {
        return new CreateProgrammeServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllProgrammeServicewsResponse }
     * 
     */
    public GetAllProgrammeServicewsResponse createGetAllProgrammeServicewsResponse() {
        return new GetAllProgrammeServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateProgrammeServicews }
     * 
     */
    public CreateProgrammeServicews createCreateProgrammeServicews() {
        return new CreateProgrammeServicews();
    }

    /**
     * Create an instance of {@link SearchProgrammeServicews }
     * 
     */
    public SearchProgrammeServicews createSearchProgrammeServicews() {
        return new SearchProgrammeServicews();
    }

    /**
     * Create an instance of {@link UpdateProgrammeServicews }
     * 
     */
    public UpdateProgrammeServicews createUpdateProgrammeServicews() {
        return new UpdateProgrammeServicews();
    }

    /**
     * Create an instance of {@link UpdateProgrammeServicewsResponse }
     * 
     */
    public UpdateProgrammeServicewsResponse createUpdateProgrammeServicewsResponse() {
        return new UpdateProgrammeServicewsResponse();
    }

    /**
     * Create an instance of {@link PopuplistDto }
     * 
     */
    public PopuplistDto createPopuplistDto() {
        return new PopuplistDto();
    }

    /**
     * Create an instance of {@link CurriculumDto }
     * 
     */
    public CurriculumDto createCurriculumDto() {
        return new CurriculumDto();
    }

    /**
     * Create an instance of {@link AcademicModuleDto.RequiredModules }
     * 
     */
    public AcademicModuleDto.RequiredModules createAcademicModuleDtoRequiredModules() {
        return new AcademicModuleDto.RequiredModules();
    }

    /**
     * Create an instance of {@link ProgrammeDto.Academicmodule }
     * 
     */
    public ProgrammeDto.Academicmodule createProgrammeDtoAcademicmodule() {
        return new ProgrammeDto.Academicmodule();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProgrammeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateProgrammeServicewsResponse")
    public JAXBElement<UpdateProgrammeServicewsResponse> createUpdateProgrammeServicewsResponse(UpdateProgrammeServicewsResponse value) {
        return new JAXBElement<UpdateProgrammeServicewsResponse>(_UpdateProgrammeServicewsResponse_QNAME, UpdateProgrammeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProgrammeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchProgrammeServicews")
    public JAXBElement<SearchProgrammeServicews> createSearchProgrammeServicews(SearchProgrammeServicews value) {
        return new JAXBElement<SearchProgrammeServicews>(_SearchProgrammeServicews_QNAME, SearchProgrammeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProgrammeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateProgrammeServicews")
    public JAXBElement<UpdateProgrammeServicews> createUpdateProgrammeServicews(UpdateProgrammeServicews value) {
        return new JAXBElement<UpdateProgrammeServicews>(_UpdateProgrammeServicews_QNAME, UpdateProgrammeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProgrammeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createProgrammeServicews")
    public JAXBElement<CreateProgrammeServicews> createCreateProgrammeServicews(CreateProgrammeServicews value) {
        return new JAXBElement<CreateProgrammeServicews>(_CreateProgrammeServicews_QNAME, CreateProgrammeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProgrammeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createProgrammeServicewsResponse")
    public JAXBElement<CreateProgrammeServicewsResponse> createCreateProgrammeServicewsResponse(CreateProgrammeServicewsResponse value) {
        return new JAXBElement<CreateProgrammeServicewsResponse>(_CreateProgrammeServicewsResponse_QNAME, CreateProgrammeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProgrammeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllProgrammeServicewsResponse")
    public JAXBElement<GetAllProgrammeServicewsResponse> createGetAllProgrammeServicewsResponse(GetAllProgrammeServicewsResponse value) {
        return new JAXBElement<GetAllProgrammeServicewsResponse>(_GetAllProgrammeServicewsResponse_QNAME, GetAllProgrammeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProgrammeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchProgrammeServicewsResponse")
    public JAXBElement<SearchProgrammeServicewsResponse> createSearchProgrammeServicewsResponse(SearchProgrammeServicewsResponse value) {
        return new JAXBElement<SearchProgrammeServicewsResponse>(_SearchProgrammeServicewsResponse_QNAME, SearchProgrammeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProgrammeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteProgrammeServicews")
    public JAXBElement<DeleteProgrammeServicews> createDeleteProgrammeServicews(DeleteProgrammeServicews value) {
        return new JAXBElement<DeleteProgrammeServicews>(_DeleteProgrammeServicews_QNAME, DeleteProgrammeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProgrammeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteProgrammeServicewsResponse")
    public JAXBElement<DeleteProgrammeServicewsResponse> createDeleteProgrammeServicewsResponse(DeleteProgrammeServicewsResponse value) {
        return new JAXBElement<DeleteProgrammeServicewsResponse>(_DeleteProgrammeServicewsResponse_QNAME, DeleteProgrammeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProgrammeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllProgrammeServicews")
    public JAXBElement<GetAllProgrammeServicews> createGetAllProgrammeServicews(GetAllProgrammeServicews value) {
        return new JAXBElement<GetAllProgrammeServicews>(_GetAllProgrammeServicews_QNAME, GetAllProgrammeServicews.class, null, value);
    }

}
