
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
public class ObjectFactoryCurriculum {

    private final static QName _UpdateCurriculumDServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateCurriculumDServicewsResponse");
    private final static QName _DeleteCurriculumDServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteCurriculumDServicewsResponse");
    private final static QName _CreateCurriculumDServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createCurriculumDServicewsResponse");
    private final static QName _GetAllCurriculumDServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllCurriculumDServicewsResponse");
    private final static QName _UpdateCurriculumDServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateCurriculumDServicews");
    private final static QName _GetAllCurriculumDServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllCurriculumDServicews");
    private final static QName _CreateCurriculumDServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createCurriculumDServicews");
    private final static QName _DeleteCurriculumDServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteCurriculumDServicews");
    private final static QName _SearchCurriculumDServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchCurriculumDServicews");
    private final static QName _SearchCurriculumDServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchCurriculumDServicewsResponse");

    /**
     * Create a new ObjectFactoryRoomInventory that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryCurriculum() {
    }

    /**
     * Create an instance of {@link SearchCurriculumDServicews }
     * 
     */
    public SearchCurriculumDServicews createSearchCurriculumDServicews() {
        return new SearchCurriculumDServicews();
    }

    /**
     * Create an instance of {@link SearchCurriculumDServicewsResponse }
     * 
     */
    public SearchCurriculumDServicewsResponse createSearchCurriculumDServicewsResponse() {
        return new SearchCurriculumDServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateCurriculumDServicews }
     * 
     */
    public CreateCurriculumDServicews createCreateCurriculumDServicews() {
        return new CreateCurriculumDServicews();
    }

    /**
     * Create an instance of {@link DeleteCurriculumDServicews }
     * 
     */
    public DeleteCurriculumDServicews createDeleteCurriculumDServicews() {
        return new DeleteCurriculumDServicews();
    }

    /**
     * Create an instance of {@link GetAllCurriculumDServicews }
     * 
     */
    public GetAllCurriculumDServicews createGetAllCurriculumDServicews() {
        return new GetAllCurriculumDServicews();
    }

    /**
     * Create an instance of {@link UpdateCurriculumDServicews }
     * 
     */
    public UpdateCurriculumDServicews createUpdateCurriculumDServicews() {
        return new UpdateCurriculumDServicews();
    }

    /**
     * Create an instance of {@link CreateCurriculumDServicewsResponse }
     * 
     */
    public CreateCurriculumDServicewsResponse createCreateCurriculumDServicewsResponse() {
        return new CreateCurriculumDServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllCurriculumDServicewsResponse }
     * 
     */
    public GetAllCurriculumDServicewsResponse createGetAllCurriculumDServicewsResponse() {
        return new GetAllCurriculumDServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteCurriculumDServicewsResponse }
     * 
     */
    public DeleteCurriculumDServicewsResponse createDeleteCurriculumDServicewsResponse() {
        return new DeleteCurriculumDServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateCurriculumDServicewsResponse }
     * 
     */
    public UpdateCurriculumDServicewsResponse createUpdateCurriculumDServicewsResponse() {
        return new UpdateCurriculumDServicewsResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCurriculumDServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateCurriculumDServicewsResponse")
    public JAXBElement<UpdateCurriculumDServicewsResponse> createUpdateCurriculumDServicewsResponse(UpdateCurriculumDServicewsResponse value) {
        return new JAXBElement<UpdateCurriculumDServicewsResponse>(_UpdateCurriculumDServicewsResponse_QNAME, UpdateCurriculumDServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCurriculumDServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteCurriculumDServicewsResponse")
    public JAXBElement<DeleteCurriculumDServicewsResponse> createDeleteCurriculumDServicewsResponse(DeleteCurriculumDServicewsResponse value) {
        return new JAXBElement<DeleteCurriculumDServicewsResponse>(_DeleteCurriculumDServicewsResponse_QNAME, DeleteCurriculumDServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCurriculumDServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createCurriculumDServicewsResponse")
    public JAXBElement<CreateCurriculumDServicewsResponse> createCreateCurriculumDServicewsResponse(CreateCurriculumDServicewsResponse value) {
        return new JAXBElement<CreateCurriculumDServicewsResponse>(_CreateCurriculumDServicewsResponse_QNAME, CreateCurriculumDServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurriculumDServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllCurriculumDServicewsResponse")
    public JAXBElement<GetAllCurriculumDServicewsResponse> createGetAllCurriculumDServicewsResponse(GetAllCurriculumDServicewsResponse value) {
        return new JAXBElement<GetAllCurriculumDServicewsResponse>(_GetAllCurriculumDServicewsResponse_QNAME, GetAllCurriculumDServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCurriculumDServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateCurriculumDServicews")
    public JAXBElement<UpdateCurriculumDServicews> createUpdateCurriculumDServicews(UpdateCurriculumDServicews value) {
        return new JAXBElement<UpdateCurriculumDServicews>(_UpdateCurriculumDServicews_QNAME, UpdateCurriculumDServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCurriculumDServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllCurriculumDServicews")
    public JAXBElement<GetAllCurriculumDServicews> createGetAllCurriculumDServicews(GetAllCurriculumDServicews value) {
        return new JAXBElement<GetAllCurriculumDServicews>(_GetAllCurriculumDServicews_QNAME, GetAllCurriculumDServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCurriculumDServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createCurriculumDServicews")
    public JAXBElement<CreateCurriculumDServicews> createCreateCurriculumDServicews(CreateCurriculumDServicews value) {
        return new JAXBElement<CreateCurriculumDServicews>(_CreateCurriculumDServicews_QNAME, CreateCurriculumDServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCurriculumDServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteCurriculumDServicews")
    public JAXBElement<DeleteCurriculumDServicews> createDeleteCurriculumDServicews(DeleteCurriculumDServicews value) {
        return new JAXBElement<DeleteCurriculumDServicews>(_DeleteCurriculumDServicews_QNAME, DeleteCurriculumDServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCurriculumDServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchCurriculumDServicews")
    public JAXBElement<SearchCurriculumDServicews> createSearchCurriculumDServicews(SearchCurriculumDServicews value) {
        return new JAXBElement<SearchCurriculumDServicews>(_SearchCurriculumDServicews_QNAME, SearchCurriculumDServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCurriculumDServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchCurriculumDServicewsResponse")
    public JAXBElement<SearchCurriculumDServicewsResponse> createSearchCurriculumDServicewsResponse(SearchCurriculumDServicewsResponse value) {
        return new JAXBElement<SearchCurriculumDServicewsResponse>(_SearchCurriculumDServicewsResponse_QNAME, SearchCurriculumDServicewsResponse.class, null, value);
    }

}
