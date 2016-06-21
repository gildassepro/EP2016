
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.authentificationweb.serviceapi package. 
 * <p>An ObjectFactoryMenu allows you to programatically 
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
public class ObjectFactoryMenu {

    private final static QName _CreateMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "createMenuServicews");
    private final static QName _DeleteMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "deleteMenuServicews");
    private final static QName _GetAllMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getAllMenuServicews");
    private final static QName _SearchPageMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchPageMenuServicews");
    private final static QName _UpdateMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "updateMenuServicewsResponse");
    private final static QName _UpdateMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "updateMenuServicews");
    private final static QName _GetPageAllMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getPageAllMenuServicewsResponse");
    private final static QName _SearchMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchMenuServicews");
    private final static QName _CreateMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "createMenuServicewsResponse");
    private final static QName _SearchPageMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchPageMenuServicewsResponse");
    private final static QName _SearchMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "searchMenuServicewsResponse");
    private final static QName _DeleteMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "deleteMenuServicewsResponse");
    private final static QName _GetPageAllMenuServicews_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getPageAllMenuServicews");
    private final static QName _GetAllMenuServicewsResponse_QNAME = new QName("http://serviceapi.authentificationweb.sepro.org/", "getAllMenuServicewsResponse");

    /**
     * Create a new ObjectFactoryMenu that can be used to create new instances of schema derived classes for package: org.sepro.authentificationweb.serviceapi
     * 
     */
    public ObjectFactoryMenu() {
    }

    /**
     * Create an instance of {@link MenuDto }
     * 
     */
    public MenuDto createMenuDto() {
        return new MenuDto();
    }

    /**
     * Create an instance of {@link DeleteMenuServicewsResponse }
     * 
     */
    public DeleteMenuServicewsResponse createDeleteMenuServicewsResponse() {
        return new DeleteMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link GetPageAllMenuServicews }
     * 
     */
    public GetPageAllMenuServicews createGetPageAllMenuServicews() {
        return new GetPageAllMenuServicews();
    }

    /**
     * Create an instance of {@link GetAllMenuServicewsResponse }
     * 
     */
    public GetAllMenuServicewsResponse createGetAllMenuServicewsResponse() {
        return new GetAllMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateMenuServicews }
     * 
     */
    public CreateMenuServicews createCreateMenuServicews() {
        return new CreateMenuServicews();
    }

    /**
     * Create an instance of {@link DeleteMenuServicews }
     * 
     */
    public DeleteMenuServicews createDeleteMenuServicews() {
        return new DeleteMenuServicews();
    }

    /**
     * Create an instance of {@link GetAllMenuServicews }
     * 
     */
    public GetAllMenuServicews createGetAllMenuServicews() {
        return new GetAllMenuServicews();
    }

    /**
     * Create an instance of {@link SearchPageMenuServicews }
     * 
     */
    public SearchPageMenuServicews createSearchPageMenuServicews() {
        return new SearchPageMenuServicews();
    }

    /**
     * Create an instance of {@link UpdateMenuServicewsResponse }
     * 
     */
    public UpdateMenuServicewsResponse createUpdateMenuServicewsResponse() {
        return new UpdateMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateMenuServicews }
     * 
     */
    public UpdateMenuServicews createUpdateMenuServicews() {
        return new UpdateMenuServicews();
    }

    /**
     * Create an instance of {@link CreateMenuServicewsResponse }
     * 
     */
    public CreateMenuServicewsResponse createCreateMenuServicewsResponse() {
        return new CreateMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link GetPageAllMenuServicewsResponse }
     * 
     */
    public GetPageAllMenuServicewsResponse createGetPageAllMenuServicewsResponse() {
        return new GetPageAllMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchMenuServicews }
     * 
     */
    public SearchMenuServicews createSearchMenuServicews() {
        return new SearchMenuServicews();
    }

    /**
     * Create an instance of {@link SearchPageMenuServicewsResponse }
     * 
     */
    public SearchPageMenuServicewsResponse createSearchPageMenuServicewsResponse() {
        return new SearchPageMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchMenuServicewsResponse }
     * 
     */
    public SearchMenuServicewsResponse createSearchMenuServicewsResponse() {
        return new SearchMenuServicewsResponse();
    }

    /**
     * Create an instance of {@link RoleDto }
     * 
     */
    public RoleDto createRoleDto() {
        return new RoleDto();
    }

    /**
     * Create an instance of {@link MenuDto.ChildMenu }
     * 
     */
    public MenuDto.ChildMenu createMenuDtoChildMenu() {
        return new MenuDto.ChildMenu();
    }

    /**
     * Create an instance of {@link MenuDto.Roles }
     * 
     */
    public MenuDto.Roles createMenuDtoRoles() {
        return new MenuDto.Roles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "createMenuServicews")
    public JAXBElement<CreateMenuServicews> createCreateMenuServicews(CreateMenuServicews value) {
        return new JAXBElement<CreateMenuServicews>(_CreateMenuServicews_QNAME, CreateMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "deleteMenuServicews")
    public JAXBElement<DeleteMenuServicews> createDeleteMenuServicews(DeleteMenuServicews value) {
        return new JAXBElement<DeleteMenuServicews>(_DeleteMenuServicews_QNAME, DeleteMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getAllMenuServicews")
    public JAXBElement<GetAllMenuServicews> createGetAllMenuServicews(GetAllMenuServicews value) {
        return new JAXBElement<GetAllMenuServicews>(_GetAllMenuServicews_QNAME, GetAllMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPageMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchPageMenuServicews")
    public JAXBElement<SearchPageMenuServicews> createSearchPageMenuServicews(SearchPageMenuServicews value) {
        return new JAXBElement<SearchPageMenuServicews>(_SearchPageMenuServicews_QNAME, SearchPageMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "updateMenuServicewsResponse")
    public JAXBElement<UpdateMenuServicewsResponse> createUpdateMenuServicewsResponse(UpdateMenuServicewsResponse value) {
        return new JAXBElement<UpdateMenuServicewsResponse>(_UpdateMenuServicewsResponse_QNAME, UpdateMenuServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "updateMenuServicews")
    public JAXBElement<UpdateMenuServicews> createUpdateMenuServicews(UpdateMenuServicews value) {
        return new JAXBElement<UpdateMenuServicews>(_UpdateMenuServicews_QNAME, UpdateMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageAllMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getPageAllMenuServicewsResponse")
    public JAXBElement<GetPageAllMenuServicewsResponse> createGetPageAllMenuServicewsResponse(GetPageAllMenuServicewsResponse value) {
        return new JAXBElement<GetPageAllMenuServicewsResponse>(_GetPageAllMenuServicewsResponse_QNAME, GetPageAllMenuServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchMenuServicews")
    public JAXBElement<SearchMenuServicews> createSearchMenuServicews(SearchMenuServicews value) {
        return new JAXBElement<SearchMenuServicews>(_SearchMenuServicews_QNAME, SearchMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "createMenuServicewsResponse")
    public JAXBElement<CreateMenuServicewsResponse> createCreateMenuServicewsResponse(CreateMenuServicewsResponse value) {
        return new JAXBElement<CreateMenuServicewsResponse>(_CreateMenuServicewsResponse_QNAME, CreateMenuServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPageMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchPageMenuServicewsResponse")
    public JAXBElement<SearchPageMenuServicewsResponse> createSearchPageMenuServicewsResponse(SearchPageMenuServicewsResponse value) {
        return new JAXBElement<SearchPageMenuServicewsResponse>(_SearchPageMenuServicewsResponse_QNAME, SearchPageMenuServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "searchMenuServicewsResponse")
    public JAXBElement<SearchMenuServicewsResponse> createSearchMenuServicewsResponse(SearchMenuServicewsResponse value) {
        return new JAXBElement<SearchMenuServicewsResponse>(_SearchMenuServicewsResponse_QNAME, SearchMenuServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "deleteMenuServicewsResponse")
    public JAXBElement<DeleteMenuServicewsResponse> createDeleteMenuServicewsResponse(DeleteMenuServicewsResponse value) {
        return new JAXBElement<DeleteMenuServicewsResponse>(_DeleteMenuServicewsResponse_QNAME, DeleteMenuServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageAllMenuServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getPageAllMenuServicews")
    public JAXBElement<GetPageAllMenuServicews> createGetPageAllMenuServicews(GetPageAllMenuServicews value) {
        return new JAXBElement<GetPageAllMenuServicews>(_GetPageAllMenuServicews_QNAME, GetPageAllMenuServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMenuServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.authentificationweb.sepro.org/", name = "getAllMenuServicewsResponse")
    public JAXBElement<GetAllMenuServicewsResponse> createGetAllMenuServicewsResponse(GetAllMenuServicewsResponse value) {
        return new JAXBElement<GetAllMenuServicewsResponse>(_GetAllMenuServicewsResponse_QNAME, GetAllMenuServicewsResponse.class, null, value);
    }

}
