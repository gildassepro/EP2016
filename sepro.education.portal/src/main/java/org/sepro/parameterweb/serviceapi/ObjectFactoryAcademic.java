
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
public class ObjectFactoryAcademic {

    private final static QName _DeleteAcademicModuleServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteAcademicModuleServicewsResponse");
    private final static QName _SearchAcademicModuleServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchAcademicModuleServicewsResponse");
    private final static QName _SearchAcademicModuleServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchAcademicModuleServicews");
    private final static QName _CreateAcademicModuleServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createAcademicModuleServicewsResponse");
    private final static QName _UpdateAcademicModuleServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateAcademicModuleServicews");
    private final static QName _GetAllAcademicModuleServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllAcademicModuleServicewsResponse");
    private final static QName _UpdateAcademicModuleServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateAcademicModuleServicewsResponse");
    private final static QName _DeleteAcademicModuleServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteAcademicModuleServicews");
    private final static QName _GetAllAcademicModuleServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllAcademicModuleServicews");
    private final static QName _CreateAcademicModuleServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createAcademicModuleServicews");

    /**
     * Create a new ObjectFactoryRoomInventory that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryAcademic() {
    }

    /**
     * Create an instance of {@link AcademicModuleDto }
     * 
     */
    public AcademicModuleDto createAcademicModuleDto() {
        return new AcademicModuleDto();
    }

    /**
     * Create an instance of {@link CreateAcademicModuleServicews }
     * 
     */
    public CreateAcademicModuleServicews createCreateAcademicModuleServicews() {
        return new CreateAcademicModuleServicews();
    }

    /**
     * Create an instance of {@link GetAllAcademicModuleServicews }
     * 
     */
    public GetAllAcademicModuleServicews createGetAllAcademicModuleServicews() {
        return new GetAllAcademicModuleServicews();
    }

    /**
     * Create an instance of {@link DeleteAcademicModuleServicews }
     * 
     */
    public DeleteAcademicModuleServicews createDeleteAcademicModuleServicews() {
        return new DeleteAcademicModuleServicews();
    }

    /**
     * Create an instance of {@link GetAllAcademicModuleServicewsResponse }
     * 
     */
    public GetAllAcademicModuleServicewsResponse createGetAllAcademicModuleServicewsResponse() {
        return new GetAllAcademicModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateAcademicModuleServicewsResponse }
     * 
     */
    public UpdateAcademicModuleServicewsResponse createUpdateAcademicModuleServicewsResponse() {
        return new UpdateAcademicModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateAcademicModuleServicewsResponse }
     * 
     */
    public CreateAcademicModuleServicewsResponse createCreateAcademicModuleServicewsResponse() {
        return new CreateAcademicModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateAcademicModuleServicews }
     * 
     */
    public UpdateAcademicModuleServicews createUpdateAcademicModuleServicews() {
        return new UpdateAcademicModuleServicews();
    }

    /**
     * Create an instance of {@link SearchAcademicModuleServicews }
     * 
     */
    public SearchAcademicModuleServicews createSearchAcademicModuleServicews() {
        return new SearchAcademicModuleServicews();
    }

    /**
     * Create an instance of {@link DeleteAcademicModuleServicewsResponse }
     * 
     */
    public DeleteAcademicModuleServicewsResponse createDeleteAcademicModuleServicewsResponse() {
        return new DeleteAcademicModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchAcademicModuleServicewsResponse }
     * 
     */
    public SearchAcademicModuleServicewsResponse createSearchAcademicModuleServicewsResponse() {
        return new SearchAcademicModuleServicewsResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAcademicModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteAcademicModuleServicewsResponse")
    public JAXBElement<DeleteAcademicModuleServicewsResponse> createDeleteAcademicModuleServicewsResponse(DeleteAcademicModuleServicewsResponse value) {
        return new JAXBElement<DeleteAcademicModuleServicewsResponse>(_DeleteAcademicModuleServicewsResponse_QNAME, DeleteAcademicModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAcademicModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchAcademicModuleServicewsResponse")
    public JAXBElement<SearchAcademicModuleServicewsResponse> createSearchAcademicModuleServicewsResponse(SearchAcademicModuleServicewsResponse value) {
        return new JAXBElement<SearchAcademicModuleServicewsResponse>(_SearchAcademicModuleServicewsResponse_QNAME, SearchAcademicModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAcademicModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchAcademicModuleServicews")
    public JAXBElement<SearchAcademicModuleServicews> createSearchAcademicModuleServicews(SearchAcademicModuleServicews value) {
        return new JAXBElement<SearchAcademicModuleServicews>(_SearchAcademicModuleServicews_QNAME, SearchAcademicModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAcademicModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createAcademicModuleServicewsResponse")
    public JAXBElement<CreateAcademicModuleServicewsResponse> createCreateAcademicModuleServicewsResponse(CreateAcademicModuleServicewsResponse value) {
        return new JAXBElement<CreateAcademicModuleServicewsResponse>(_CreateAcademicModuleServicewsResponse_QNAME, CreateAcademicModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAcademicModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateAcademicModuleServicews")
    public JAXBElement<UpdateAcademicModuleServicews> createUpdateAcademicModuleServicews(UpdateAcademicModuleServicews value) {
        return new JAXBElement<UpdateAcademicModuleServicews>(_UpdateAcademicModuleServicews_QNAME, UpdateAcademicModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAcademicModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllAcademicModuleServicewsResponse")
    public JAXBElement<GetAllAcademicModuleServicewsResponse> createGetAllAcademicModuleServicewsResponse(GetAllAcademicModuleServicewsResponse value) {
        return new JAXBElement<GetAllAcademicModuleServicewsResponse>(_GetAllAcademicModuleServicewsResponse_QNAME, GetAllAcademicModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAcademicModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateAcademicModuleServicewsResponse")
    public JAXBElement<UpdateAcademicModuleServicewsResponse> createUpdateAcademicModuleServicewsResponse(UpdateAcademicModuleServicewsResponse value) {
        return new JAXBElement<UpdateAcademicModuleServicewsResponse>(_UpdateAcademicModuleServicewsResponse_QNAME, UpdateAcademicModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAcademicModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteAcademicModuleServicews")
    public JAXBElement<DeleteAcademicModuleServicews> createDeleteAcademicModuleServicews(DeleteAcademicModuleServicews value) {
        return new JAXBElement<DeleteAcademicModuleServicews>(_DeleteAcademicModuleServicews_QNAME, DeleteAcademicModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAcademicModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllAcademicModuleServicews")
    public JAXBElement<GetAllAcademicModuleServicews> createGetAllAcademicModuleServicews(GetAllAcademicModuleServicews value) {
        return new JAXBElement<GetAllAcademicModuleServicews>(_GetAllAcademicModuleServicews_QNAME, GetAllAcademicModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAcademicModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createAcademicModuleServicews")
    public JAXBElement<CreateAcademicModuleServicews> createCreateAcademicModuleServicews(CreateAcademicModuleServicews value) {
        return new JAXBElement<CreateAcademicModuleServicews>(_CreateAcademicModuleServicews_QNAME, CreateAcademicModuleServicews.class, null, value);
    }

}
