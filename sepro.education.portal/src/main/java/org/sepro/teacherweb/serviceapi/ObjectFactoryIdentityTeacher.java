
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.teacherweb.serviceapi package. 
 * <p>An ObjectFactoryIdentityTeacher allows you to programatically 
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
public class ObjectFactoryIdentityTeacher {

    private final static QName _SearchIdentityTeacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchIdentityTeacherServicews");
    private final static QName _GetAllIdentityTeacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "getAllIdentityTeacherServicews");
    private final static QName _CreateIdentityTeacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createIdentityTeacherServicewsResponse");
    private final static QName _DeleteIdentityTeacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteIdentityTeacherServicewsResponse");
    private final static QName _SearchIdentityTeacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchIdentityTeacherServicewsResponse");
    private final static QName _GetAllIdentityTeacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "getAllIdentityTeacherServicewsResponse");
    private final static QName _CreateIdentityTeacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createIdentityTeacherServicews");
    private final static QName _UpdateIdentityTeacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateIdentityTeacherServicews");
    private final static QName _DeleteIdentityTeacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteIdentityTeacherServicews");
    private final static QName _UpdateIdentityTeacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateIdentityTeacherServicewsResponse");

    /**
     * Create a new ObjectFactoryIdentityTeacher that can be used to create new instances of schema derived classes for package: org.sepro.teacherweb.serviceapi
     * 
     */
    public ObjectFactoryIdentityTeacher() {
    }

    /**
     * Create an instance of {@link DeleteIdentityTeacherServicewsResponse }
     * 
     */
    public DeleteIdentityTeacherServicewsResponse createDeleteIdentityTeacherServicewsResponse() {
        return new DeleteIdentityTeacherServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchIdentityTeacherServicewsResponse }
     * 
     */
    public SearchIdentityTeacherServicewsResponse createSearchIdentityTeacherServicewsResponse() {
        return new SearchIdentityTeacherServicewsResponse();
    }

    /**
     * Create an instance of {@link GetAllIdentityTeacherServicewsResponse }
     * 
     */
    public GetAllIdentityTeacherServicewsResponse createGetAllIdentityTeacherServicewsResponse() {
        return new GetAllIdentityTeacherServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateIdentityTeacherServicewsResponse }
     * 
     */
    public CreateIdentityTeacherServicewsResponse createCreateIdentityTeacherServicewsResponse() {
        return new CreateIdentityTeacherServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchIdentityTeacherServicews }
     * 
     */
    public SearchIdentityTeacherServicews createSearchIdentityTeacherServicews() {
        return new SearchIdentityTeacherServicews();
    }

    /**
     * Create an instance of {@link GetAllIdentityTeacherServicews }
     * 
     */
    public GetAllIdentityTeacherServicews createGetAllIdentityTeacherServicews() {
        return new GetAllIdentityTeacherServicews();
    }

    /**
     * Create an instance of {@link DeleteIdentityTeacherServicews }
     * 
     */
    public DeleteIdentityTeacherServicews createDeleteIdentityTeacherServicews() {
        return new DeleteIdentityTeacherServicews();
    }

    /**
     * Create an instance of {@link UpdateIdentityTeacherServicewsResponse }
     * 
     */
    public UpdateIdentityTeacherServicewsResponse createUpdateIdentityTeacherServicewsResponse() {
        return new UpdateIdentityTeacherServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateIdentityTeacherServicews }
     * 
     */
    public CreateIdentityTeacherServicews createCreateIdentityTeacherServicews() {
        return new CreateIdentityTeacherServicews();
    }

    /**
     * Create an instance of {@link UpdateIdentityTeacherServicews }
     * 
     */
    public UpdateIdentityTeacherServicews createUpdateIdentityTeacherServicews() {
        return new UpdateIdentityTeacherServicews();
    }

    /**
     * Create an instance of {@link IdentityTeacherDto }
     * 
     */
    public IdentityTeacherDto createIdentityTeacherDto() {
        return new IdentityTeacherDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchIdentityTeacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchIdentityTeacherServicews")
    public JAXBElement<SearchIdentityTeacherServicews> createSearchIdentityTeacherServicews(SearchIdentityTeacherServicews value) {
        return new JAXBElement<SearchIdentityTeacherServicews>(_SearchIdentityTeacherServicews_QNAME, SearchIdentityTeacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentityTeacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "getAllIdentityTeacherServicews")
    public JAXBElement<GetAllIdentityTeacherServicews> createGetAllIdentityTeacherServicews(GetAllIdentityTeacherServicews value) {
        return new JAXBElement<GetAllIdentityTeacherServicews>(_GetAllIdentityTeacherServicews_QNAME, GetAllIdentityTeacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIdentityTeacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createIdentityTeacherServicewsResponse")
    public JAXBElement<CreateIdentityTeacherServicewsResponse> createCreateIdentityTeacherServicewsResponse(CreateIdentityTeacherServicewsResponse value) {
        return new JAXBElement<CreateIdentityTeacherServicewsResponse>(_CreateIdentityTeacherServicewsResponse_QNAME, CreateIdentityTeacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIdentityTeacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteIdentityTeacherServicewsResponse")
    public JAXBElement<DeleteIdentityTeacherServicewsResponse> createDeleteIdentityTeacherServicewsResponse(DeleteIdentityTeacherServicewsResponse value) {
        return new JAXBElement<DeleteIdentityTeacherServicewsResponse>(_DeleteIdentityTeacherServicewsResponse_QNAME, DeleteIdentityTeacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchIdentityTeacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchIdentityTeacherServicewsResponse")
    public JAXBElement<SearchIdentityTeacherServicewsResponse> createSearchIdentityTeacherServicewsResponse(SearchIdentityTeacherServicewsResponse value) {
        return new JAXBElement<SearchIdentityTeacherServicewsResponse>(_SearchIdentityTeacherServicewsResponse_QNAME, SearchIdentityTeacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentityTeacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "getAllIdentityTeacherServicewsResponse")
    public JAXBElement<GetAllIdentityTeacherServicewsResponse> createGetAllIdentityTeacherServicewsResponse(GetAllIdentityTeacherServicewsResponse value) {
        return new JAXBElement<GetAllIdentityTeacherServicewsResponse>(_GetAllIdentityTeacherServicewsResponse_QNAME, GetAllIdentityTeacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIdentityTeacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createIdentityTeacherServicews")
    public JAXBElement<CreateIdentityTeacherServicews> createCreateIdentityTeacherServicews(CreateIdentityTeacherServicews value) {
        return new JAXBElement<CreateIdentityTeacherServicews>(_CreateIdentityTeacherServicews_QNAME, CreateIdentityTeacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdentityTeacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateIdentityTeacherServicews")
    public JAXBElement<UpdateIdentityTeacherServicews> createUpdateIdentityTeacherServicews(UpdateIdentityTeacherServicews value) {
        return new JAXBElement<UpdateIdentityTeacherServicews>(_UpdateIdentityTeacherServicews_QNAME, UpdateIdentityTeacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIdentityTeacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteIdentityTeacherServicews")
    public JAXBElement<DeleteIdentityTeacherServicews> createDeleteIdentityTeacherServicews(DeleteIdentityTeacherServicews value) {
        return new JAXBElement<DeleteIdentityTeacherServicews>(_DeleteIdentityTeacherServicews_QNAME, DeleteIdentityTeacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdentityTeacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateIdentityTeacherServicewsResponse")
    public JAXBElement<UpdateIdentityTeacherServicewsResponse> createUpdateIdentityTeacherServicewsResponse(UpdateIdentityTeacherServicewsResponse value) {
        return new JAXBElement<UpdateIdentityTeacherServicewsResponse>(_UpdateIdentityTeacherServicewsResponse_QNAME, UpdateIdentityTeacherServicewsResponse.class, null, value);
    }

}
