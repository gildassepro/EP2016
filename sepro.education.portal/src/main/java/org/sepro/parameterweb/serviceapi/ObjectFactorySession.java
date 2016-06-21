
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
public class ObjectFactorySession {

    private final static QName _CreateSessionServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createSessionServicews");
    private final static QName _SearchSessionServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchSessionServicewsResponse");
    private final static QName _UpdateSessionServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateSessionServicewsResponse");
    private final static QName _UpdateSessionServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updateSessionServicews");
    private final static QName _DeleteSessionServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteSessionServicews");
    private final static QName _GetAllSessionServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllSessionServicews");
    private final static QName _SearchSessionServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchSessionServicews");
    private final static QName _CreateSessionServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createSessionServicewsResponse");
    private final static QName _GetAllSessionServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllSessionServicewsResponse");
    private final static QName _DeleteSessionServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deleteSessionServicewsResponse");

    /**
     * Create a new ObjectFactoryRoomInventory that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactorySession() {
    }

    /**
     * Create an instance of {@link DeleteSessionServicewsResponse }
     * 
     */
    public DeleteSessionServicewsResponse createDeleteSessionServicewsResponse() {
        return new DeleteSessionServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateSessionServicewsResponse }
     * 
     */
    public CreateSessionServicewsResponse createCreateSessionServicewsResponse() {
        return new CreateSessionServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllSessionServicewsResponse }
     * 
     */
    public GetAllSessionServicewsResponse createGetAllSessionServicewsResponse() {
        return new GetAllSessionServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchSessionServicews }
     * 
     */
    public SearchSessionServicews createSearchSessionServicews() {
        return new SearchSessionServicews();
    }

    /**
     * Create an instance of {@link DeleteSessionServicews }
     * 
     */
    public DeleteSessionServicews createDeleteSessionServicews() {
        return new DeleteSessionServicews();
    }

    /**
     * Create an instance of {@link GetAllSessionServicews }
     * 
     */
    public GetAllSessionServicews createGetAllSessionServicews() {
        return new GetAllSessionServicews();
    }

    /**
     * Create an instance of {@link UpdateSessionServicews }
     * 
     */
    public UpdateSessionServicews createUpdateSessionServicews() {
        return new UpdateSessionServicews();
    }

    /**
     * Create an instance of {@link UpdateSessionServicewsResponse }
     * 
     */
    public UpdateSessionServicewsResponse createUpdateSessionServicewsResponse() {
        return new UpdateSessionServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchSessionServicewsResponse }
     * 
     */
    public SearchSessionServicewsResponse createSearchSessionServicewsResponse() {
        return new SearchSessionServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateSessionServicews }
     * 
     */
    public CreateSessionServicews createCreateSessionServicews() {
        return new CreateSessionServicews();
    }

    /**
     * Create an instance of {@link PopuplistDto }
     * 
     */
    public PopuplistDto createPopuplistDto() {
        return new PopuplistDto();
    }

    /**
     * Create an instance of {@link SessionDto }
     * 
     */
    public SessionDto createSessionDto() {
        return new SessionDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSessionServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createSessionServicews")
    public JAXBElement<CreateSessionServicews> createCreateSessionServicews(CreateSessionServicews value) {
        return new JAXBElement<CreateSessionServicews>(_CreateSessionServicews_QNAME, CreateSessionServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSessionServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchSessionServicewsResponse")
    public JAXBElement<SearchSessionServicewsResponse> createSearchSessionServicewsResponse(SearchSessionServicewsResponse value) {
        return new JAXBElement<SearchSessionServicewsResponse>(_SearchSessionServicewsResponse_QNAME, SearchSessionServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSessionServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateSessionServicewsResponse")
    public JAXBElement<UpdateSessionServicewsResponse> createUpdateSessionServicewsResponse(UpdateSessionServicewsResponse value) {
        return new JAXBElement<UpdateSessionServicewsResponse>(_UpdateSessionServicewsResponse_QNAME, UpdateSessionServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSessionServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updateSessionServicews")
    public JAXBElement<UpdateSessionServicews> createUpdateSessionServicews(UpdateSessionServicews value) {
        return new JAXBElement<UpdateSessionServicews>(_UpdateSessionServicews_QNAME, UpdateSessionServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSessionServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteSessionServicews")
    public JAXBElement<DeleteSessionServicews> createDeleteSessionServicews(DeleteSessionServicews value) {
        return new JAXBElement<DeleteSessionServicews>(_DeleteSessionServicews_QNAME, DeleteSessionServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSessionServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllSessionServicews")
    public JAXBElement<GetAllSessionServicews> createGetAllSessionServicews(GetAllSessionServicews value) {
        return new JAXBElement<GetAllSessionServicews>(_GetAllSessionServicews_QNAME, GetAllSessionServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSessionServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchSessionServicews")
    public JAXBElement<SearchSessionServicews> createSearchSessionServicews(SearchSessionServicews value) {
        return new JAXBElement<SearchSessionServicews>(_SearchSessionServicews_QNAME, SearchSessionServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSessionServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createSessionServicewsResponse")
    public JAXBElement<CreateSessionServicewsResponse> createCreateSessionServicewsResponse(CreateSessionServicewsResponse value) {
        return new JAXBElement<CreateSessionServicewsResponse>(_CreateSessionServicewsResponse_QNAME, CreateSessionServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSessionServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllSessionServicewsResponse")
    public JAXBElement<GetAllSessionServicewsResponse> createGetAllSessionServicewsResponse(GetAllSessionServicewsResponse value) {
        return new JAXBElement<GetAllSessionServicewsResponse>(_GetAllSessionServicewsResponse_QNAME, GetAllSessionServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSessionServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deleteSessionServicewsResponse")
    public JAXBElement<DeleteSessionServicewsResponse> createDeleteSessionServicewsResponse(DeleteSessionServicewsResponse value) {
        return new JAXBElement<DeleteSessionServicewsResponse>(_DeleteSessionServicewsResponse_QNAME, DeleteSessionServicewsResponse.class, null, value);
    }

}
