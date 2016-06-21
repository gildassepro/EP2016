
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
public class ObjectFactoryPopuplist {

    private final static QName _CreatePopuplistDtoServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createPopuplistDtoServicewsResponse");
    private final static QName _SearchPopuplistDtoServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchPopuplistDtoServicews");
    private final static QName _GetAllPopuplistDtoServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllPopuplistDtoServicews");
    private final static QName _UpdatePopuplistDtoServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updatePopuplistDtoServicews");
    private final static QName _CreatePopuplistDtoServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "createPopuplistDtoServicews");
    private final static QName _DeletePopuplistDtoServicews_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deletePopuplistDtoServicews");
    private final static QName _GetAllPopuplistDtoServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "getAllPopuplistDtoServicewsResponse");
    private final static QName _SearchPopuplistDtoServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "searchPopuplistDtoServicewsResponse");
    private final static QName _UpdatePopuplistDtoServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "updatePopuplistDtoServicewsResponse");
    private final static QName _DeletePopuplistDtoServicewsResponse_QNAME = new QName("http://serviceapi.parameterweb.sepro.org/", "deletePopuplistDtoServicewsResponse");

    /**
     * Create a new ObjectFactoryRoomInventory that can be used to create new instances of schema derived classes for package: org.sepro.parameterweb.serviceapi
     * 
     */
    public ObjectFactoryPopuplist() {
    }

    /**
     * Create an instance of {@link DeletePopuplistDtoServicewsResponse }
     * 
     */
    public DeletePopuplistDtoServicewsResponse createDeletePopuplistDtoServicewsResponse() {
        return new DeletePopuplistDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllPopuplistDtoServicewsResponse }
     * 
     */
    public GetAllPopuplistDtoServicewsResponse createGetAllPopuplistDtoServicewsResponse() {
        return new GetAllPopuplistDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchPopuplistDtoServicewsResponse }
     * 
     */
    public SearchPopuplistDtoServicewsResponse createSearchPopuplistDtoServicewsResponse() {
        return new SearchPopuplistDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdatePopuplistDtoServicewsResponse }
     * 
     */
    public UpdatePopuplistDtoServicewsResponse createUpdatePopuplistDtoServicewsResponse() {
        return new UpdatePopuplistDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link DeletePopuplistDtoServicews }
     * 
     */
    public DeletePopuplistDtoServicews createDeletePopuplistDtoServicews() {
        return new DeletePopuplistDtoServicews();
    }

    /**
     * Create an instance of {@link CreatePopuplistDtoServicews }
     * 
     */
    public CreatePopuplistDtoServicews createCreatePopuplistDtoServicews() {
        return new CreatePopuplistDtoServicews();
    }

    /**
     * Create an instance of {@link UpdatePopuplistDtoServicews }
     * 
     */
    public UpdatePopuplistDtoServicews createUpdatePopuplistDtoServicews() {
        return new UpdatePopuplistDtoServicews();
    }

    /**
     * Create an instance of {@link GetAllPopuplistDtoServicews }
     * 
     */
    public GetAllPopuplistDtoServicews createGetAllPopuplistDtoServicews() {
        return new GetAllPopuplistDtoServicews();
    }

    /**
     * Create an instance of {@link CreatePopuplistDtoServicewsResponse }
     * 
     */
    public CreatePopuplistDtoServicewsResponse createCreatePopuplistDtoServicewsResponse() {
        return new CreatePopuplistDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchPopuplistDtoServicews }
     * 
     */
    public SearchPopuplistDtoServicews createSearchPopuplistDtoServicews() {
        return new SearchPopuplistDtoServicews();
    }

    /**
     * Create an instance of {@link PopuplistDto }
     * 
     */
    public PopuplistDto createPopuplistDto() {
        return new PopuplistDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePopuplistDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createPopuplistDtoServicewsResponse")
    public JAXBElement<CreatePopuplistDtoServicewsResponse> createCreatePopuplistDtoServicewsResponse(CreatePopuplistDtoServicewsResponse value) {
        return new JAXBElement<CreatePopuplistDtoServicewsResponse>(_CreatePopuplistDtoServicewsResponse_QNAME, CreatePopuplistDtoServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPopuplistDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchPopuplistDtoServicews")
    public JAXBElement<SearchPopuplistDtoServicews> createSearchPopuplistDtoServicews(SearchPopuplistDtoServicews value) {
        return new JAXBElement<SearchPopuplistDtoServicews>(_SearchPopuplistDtoServicews_QNAME, SearchPopuplistDtoServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPopuplistDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllPopuplistDtoServicews")
    public JAXBElement<GetAllPopuplistDtoServicews> createGetAllPopuplistDtoServicews(GetAllPopuplistDtoServicews value) {
        return new JAXBElement<GetAllPopuplistDtoServicews>(_GetAllPopuplistDtoServicews_QNAME, GetAllPopuplistDtoServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePopuplistDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updatePopuplistDtoServicews")
    public JAXBElement<UpdatePopuplistDtoServicews> createUpdatePopuplistDtoServicews(UpdatePopuplistDtoServicews value) {
        return new JAXBElement<UpdatePopuplistDtoServicews>(_UpdatePopuplistDtoServicews_QNAME, UpdatePopuplistDtoServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePopuplistDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "createPopuplistDtoServicews")
    public JAXBElement<CreatePopuplistDtoServicews> createCreatePopuplistDtoServicews(CreatePopuplistDtoServicews value) {
        return new JAXBElement<CreatePopuplistDtoServicews>(_CreatePopuplistDtoServicews_QNAME, CreatePopuplistDtoServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePopuplistDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deletePopuplistDtoServicews")
    public JAXBElement<DeletePopuplistDtoServicews> createDeletePopuplistDtoServicews(DeletePopuplistDtoServicews value) {
        return new JAXBElement<DeletePopuplistDtoServicews>(_DeletePopuplistDtoServicews_QNAME, DeletePopuplistDtoServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPopuplistDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "getAllPopuplistDtoServicewsResponse")
    public JAXBElement<GetAllPopuplistDtoServicewsResponse> createGetAllPopuplistDtoServicewsResponse(GetAllPopuplistDtoServicewsResponse value) {
        return new JAXBElement<GetAllPopuplistDtoServicewsResponse>(_GetAllPopuplistDtoServicewsResponse_QNAME, GetAllPopuplistDtoServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPopuplistDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "searchPopuplistDtoServicewsResponse")
    public JAXBElement<SearchPopuplistDtoServicewsResponse> createSearchPopuplistDtoServicewsResponse(SearchPopuplistDtoServicewsResponse value) {
        return new JAXBElement<SearchPopuplistDtoServicewsResponse>(_SearchPopuplistDtoServicewsResponse_QNAME, SearchPopuplistDtoServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePopuplistDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "updatePopuplistDtoServicewsResponse")
    public JAXBElement<UpdatePopuplistDtoServicewsResponse> createUpdatePopuplistDtoServicewsResponse(UpdatePopuplistDtoServicewsResponse value) {
        return new JAXBElement<UpdatePopuplistDtoServicewsResponse>(_UpdatePopuplistDtoServicewsResponse_QNAME, UpdatePopuplistDtoServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePopuplistDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.parameterweb.sepro.org/", name = "deletePopuplistDtoServicewsResponse")
    public JAXBElement<DeletePopuplistDtoServicewsResponse> createDeletePopuplistDtoServicewsResponse(DeletePopuplistDtoServicewsResponse value) {
        return new JAXBElement<DeletePopuplistDtoServicewsResponse>(_DeletePopuplistDtoServicewsResponse_QNAME, DeletePopuplistDtoServicewsResponse.class, null, value);
    }

}
