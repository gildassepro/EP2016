
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.authentificationweb.serviceapi package. 
 * <p>An ObjectFactoryRole allows you to programatically 
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
public class ObjectFactoryRole {

    private final static QName _GetAllRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getAllRoleServicewsResponse");
    private final static QName _DeleteRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "deleteRoleServicewsResponse");
    private final static QName _SearchPageRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchPageRoleServicewsResponse");
    private final static QName _CreateRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "createRoleServicews");
    private final static QName _SearchRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchRoleServicews");
    private final static QName _UpdateRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "updateRoleServicews");
    private final static QName _DeleteRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "deleteRoleServicews");
    private final static QName _GetAllRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getAllRoleServicews");
    private final static QName _GetPageAllRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getPageAllRoleServicews");
    private final static QName _SearchRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchRoleServicewsResponse");
    private final static QName _CreateRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "createRoleServicewsResponse");
    private final static QName _UpdateRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "updateRoleServicewsResponse");
    private final static QName _GetPageAllRoleServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getPageAllRoleServicewsResponse");
    private final static QName _SearchPageRoleServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchPageRoleServicews");

    /**
     * Create a new ObjectFactoryRole that can be used to create new instances of schema derived classes for package: org.sepro.authentificationweb.serviceapi
     * 
     */
    public ObjectFactoryRole() {
    }

    /**
     * Create an instance of {@link DeleteRoleServicews }
     * 
     */
    public DeleteRoleServicews createDeleteRoleServicews() {
        return new DeleteRoleServicews();
    }

    /**
     * Create an instance of {@link GetAllRoleServicews }
     * 
     */
    public GetAllRoleServicews createGetAllRoleServicews() {
        return new GetAllRoleServicews();
    }

    /**
     * Create an instance of {@link GetPageAllRoleServicews }
     * 
     */
    public GetPageAllRoleServicews createGetPageAllRoleServicews() {
        return new GetPageAllRoleServicews();
    }

    /**
     * Create an instance of {@link SearchRoleServicews }
     * 
     */
    public SearchRoleServicews createSearchRoleServicews() {
        return new SearchRoleServicews();
    }

    /**
     * Create an instance of {@link UpdateRoleServicews }
     * 
     */
    public UpdateRoleServicews createUpdateRoleServicews() {
        return new UpdateRoleServicews();
    }

    /**
     * Create an instance of {@link SearchRoleServicewsResponse }
     * 
     */
    public SearchRoleServicewsResponse createSearchRoleServicewsResponse() {
        return new SearchRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link GetPageAllRoleServicewsResponse }
     * 
     */
    public GetPageAllRoleServicewsResponse createGetPageAllRoleServicewsResponse() {
        return new GetPageAllRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateRoleServicewsResponse }
     * 
     */
    public CreateRoleServicewsResponse createCreateRoleServicewsResponse() {
        return new CreateRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateRoleServicewsResponse }
     * 
     */
    public UpdateRoleServicewsResponse createUpdateRoleServicewsResponse() {
        return new UpdateRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchPageRoleServicews }
     * 
     */
    public SearchPageRoleServicews createSearchPageRoleServicews() {
        return new SearchPageRoleServicews();
    }

    /**
     * Create an instance of {@link GetAllRoleServicewsResponse }
     * 
     */
    public GetAllRoleServicewsResponse createGetAllRoleServicewsResponse() {
        return new GetAllRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteRoleServicewsResponse }
     * 
     */
    public DeleteRoleServicewsResponse createDeleteRoleServicewsResponse() {
        return new DeleteRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchPageRoleServicewsResponse }
     * 
     */
    public SearchPageRoleServicewsResponse createSearchPageRoleServicewsResponse() {
        return new SearchPageRoleServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateRoleServicews }
     * 
     */
    public CreateRoleServicews createCreateRoleServicews() {
        return new CreateRoleServicews();
    }

    /**
     * Create an instance of {@link RoleDto }
     * 
     */
    public RoleDto createRoleDto() {
        return new RoleDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getAllRoleServicewsResponse")
    public JAXBElement<GetAllRoleServicewsResponse> createGetAllRoleServicewsResponse(GetAllRoleServicewsResponse value) {
        return new JAXBElement<GetAllRoleServicewsResponse>(_GetAllRoleServicewsResponse_QNAME, GetAllRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "deleteRoleServicewsResponse")
    public JAXBElement<DeleteRoleServicewsResponse> createDeleteRoleServicewsResponse(DeleteRoleServicewsResponse value) {
        return new JAXBElement<DeleteRoleServicewsResponse>(_DeleteRoleServicewsResponse_QNAME, DeleteRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPageRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchPageRoleServicewsResponse")
    public JAXBElement<SearchPageRoleServicewsResponse> createSearchPageRoleServicewsResponse(SearchPageRoleServicewsResponse value) {
        return new JAXBElement<SearchPageRoleServicewsResponse>(_SearchPageRoleServicewsResponse_QNAME, SearchPageRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "createRoleServicews")
    public JAXBElement<CreateRoleServicews> createCreateRoleServicews(CreateRoleServicews value) {
        return new JAXBElement<CreateRoleServicews>(_CreateRoleServicews_QNAME, CreateRoleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchRoleServicews")
    public JAXBElement<SearchRoleServicews> createSearchRoleServicews(SearchRoleServicews value) {
        return new JAXBElement<SearchRoleServicews>(_SearchRoleServicews_QNAME, SearchRoleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "updateRoleServicews")
    public JAXBElement<UpdateRoleServicews> createUpdateRoleServicews(UpdateRoleServicews value) {
        return new JAXBElement<UpdateRoleServicews>(_UpdateRoleServicews_QNAME, UpdateRoleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "deleteRoleServicews")
    public JAXBElement<DeleteRoleServicews> createDeleteRoleServicews(DeleteRoleServicews value) {
        return new JAXBElement<DeleteRoleServicews>(_DeleteRoleServicews_QNAME, DeleteRoleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getAllRoleServicews")
    public JAXBElement<GetAllRoleServicews> createGetAllRoleServicews(GetAllRoleServicews value) {
        return new JAXBElement<GetAllRoleServicews>(_GetAllRoleServicews_QNAME, GetAllRoleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageAllRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getPageAllRoleServicews")
    public JAXBElement<GetPageAllRoleServicews> createGetPageAllRoleServicews(GetPageAllRoleServicews value) {
        return new JAXBElement<GetPageAllRoleServicews>(_GetPageAllRoleServicews_QNAME, GetPageAllRoleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchRoleServicewsResponse")
    public JAXBElement<SearchRoleServicewsResponse> createSearchRoleServicewsResponse(SearchRoleServicewsResponse value) {
        return new JAXBElement<SearchRoleServicewsResponse>(_SearchRoleServicewsResponse_QNAME, SearchRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "createRoleServicewsResponse")
    public JAXBElement<CreateRoleServicewsResponse> createCreateRoleServicewsResponse(CreateRoleServicewsResponse value) {
        return new JAXBElement<CreateRoleServicewsResponse>(_CreateRoleServicewsResponse_QNAME, CreateRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "updateRoleServicewsResponse")
    public JAXBElement<UpdateRoleServicewsResponse> createUpdateRoleServicewsResponse(UpdateRoleServicewsResponse value) {
        return new JAXBElement<UpdateRoleServicewsResponse>(_UpdateRoleServicewsResponse_QNAME, UpdateRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageAllRoleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getPageAllRoleServicewsResponse")
    public JAXBElement<GetPageAllRoleServicewsResponse> createGetPageAllRoleServicewsResponse(GetPageAllRoleServicewsResponse value) {
        return new JAXBElement<GetPageAllRoleServicewsResponse>(_GetPageAllRoleServicewsResponse_QNAME, GetPageAllRoleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPageRoleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchPageRoleServicews")
    public JAXBElement<SearchPageRoleServicews> createSearchPageRoleServicews(SearchPageRoleServicews value) {
        return new JAXBElement<SearchPageRoleServicews>(_SearchPageRoleServicews_QNAME, SearchPageRoleServicews.class, null, value);
    }

}
