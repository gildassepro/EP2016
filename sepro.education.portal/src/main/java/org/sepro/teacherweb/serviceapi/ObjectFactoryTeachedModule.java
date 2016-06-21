
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.teacherweb.serviceapi package. 
 * <p>An ObjectFactoryTeachedModule allows you to programatically 
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
public class ObjectFactoryTeachedModule {

    private final static QName _UpdateTeachedModuleServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateTeachedModuleServicewsResponse");
    private final static QName _SearchTeachedModuleServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchTeachedModuleServicews");
    private final static QName _CreateTeachedModuleServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createTeachedModuleServicewsResponse");
    private final static QName _SearchTeachedModuleServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchTeachedModuleServicewsResponse");
    private final static QName _CreateTeachedModuleServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createTeachedModuleServicews");
    private final static QName _UpdateTeachedModuleServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateTeachedModuleServicews");
    private final static QName _DeleteTeachedModuleServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteTeachedModuleServicews");
    private final static QName _DeleteTeachedModuleServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteTeachedModuleServicewsResponse");

    /**
     * Create a new ObjectFactoryTeachedModule that can be used to create new instances of schema derived classes for package: org.sepro.teacherweb.serviceapi
     * 
     */
    public ObjectFactoryTeachedModule() {
    }

    /**
     * Create an instance of {@link CreateTeachedModuleServicewsResponse }
     * 
     */
    public CreateTeachedModuleServicewsResponse createCreateTeachedModuleServicewsResponse() {
        return new CreateTeachedModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchTeachedModuleServicewsResponse }
     * 
     */
    public SearchTeachedModuleServicewsResponse createSearchTeachedModuleServicewsResponse() {
        return new SearchTeachedModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchTeachedModuleServicews }
     * 
     */
    public SearchTeachedModuleServicews createSearchTeachedModuleServicews() {
        return new SearchTeachedModuleServicews();
    }

    /**
     * Create an instance of {@link UpdateTeachedModuleServicewsResponse }
     * 
     */
    public UpdateTeachedModuleServicewsResponse createUpdateTeachedModuleServicewsResponse() {
        return new UpdateTeachedModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteTeachedModuleServicews }
     * 
     */
    public DeleteTeachedModuleServicews createDeleteTeachedModuleServicews() {
        return new DeleteTeachedModuleServicews();
    }

    /**
     * Create an instance of {@link DeleteTeachedModuleServicewsResponse }
     * 
     */
    public DeleteTeachedModuleServicewsResponse createDeleteTeachedModuleServicewsResponse() {
        return new DeleteTeachedModuleServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateTeachedModuleServicews }
     * 
     */
    public CreateTeachedModuleServicews createCreateTeachedModuleServicews() {
        return new CreateTeachedModuleServicews();
    }

    /**
     * Create an instance of {@link UpdateTeachedModuleServicews }
     * 
     */
    public UpdateTeachedModuleServicews createUpdateTeachedModuleServicews() {
        return new UpdateTeachedModuleServicews();
    }

    /**
     * Create an instance of {@link IdentityTeacherDto }
     * 
     */
    public IdentityTeacherDto createIdentityTeacherDto() {
        return new IdentityTeacherDto();
    }

    /**
     * Create an instance of {@link TeacherModuleDto }
     * 
     */
    public TeacherModuleDto createTeacherModuleDto() {
        return new TeacherModuleDto();
    }

    /**
     * Create an instance of {@link DetailteacherDto }
     * 
     */
    public DetailteacherDto createDetailteacherDto() {
        return new DetailteacherDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeachedModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateTeachedModuleServicewsResponse")
    public JAXBElement<UpdateTeachedModuleServicewsResponse> createUpdateTeachedModuleServicewsResponse(UpdateTeachedModuleServicewsResponse value) {
        return new JAXBElement<UpdateTeachedModuleServicewsResponse>(_UpdateTeachedModuleServicewsResponse_QNAME, UpdateTeachedModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTeachedModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchTeachedModuleServicews")
    public JAXBElement<SearchTeachedModuleServicews> createSearchTeachedModuleServicews(SearchTeachedModuleServicews value) {
        return new JAXBElement<SearchTeachedModuleServicews>(_SearchTeachedModuleServicews_QNAME, SearchTeachedModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTeachedModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createTeachedModuleServicewsResponse")
    public JAXBElement<CreateTeachedModuleServicewsResponse> createCreateTeachedModuleServicewsResponse(CreateTeachedModuleServicewsResponse value) {
        return new JAXBElement<CreateTeachedModuleServicewsResponse>(_CreateTeachedModuleServicewsResponse_QNAME, CreateTeachedModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTeachedModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchTeachedModuleServicewsResponse")
    public JAXBElement<SearchTeachedModuleServicewsResponse> createSearchTeachedModuleServicewsResponse(SearchTeachedModuleServicewsResponse value) {
        return new JAXBElement<SearchTeachedModuleServicewsResponse>(_SearchTeachedModuleServicewsResponse_QNAME, SearchTeachedModuleServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTeachedModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createTeachedModuleServicews")
    public JAXBElement<CreateTeachedModuleServicews> createCreateTeachedModuleServicews(CreateTeachedModuleServicews value) {
        return new JAXBElement<CreateTeachedModuleServicews>(_CreateTeachedModuleServicews_QNAME, CreateTeachedModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeachedModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateTeachedModuleServicews")
    public JAXBElement<UpdateTeachedModuleServicews> createUpdateTeachedModuleServicews(UpdateTeachedModuleServicews value) {
        return new JAXBElement<UpdateTeachedModuleServicews>(_UpdateTeachedModuleServicews_QNAME, UpdateTeachedModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeachedModuleServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteTeachedModuleServicews")
    public JAXBElement<DeleteTeachedModuleServicews> createDeleteTeachedModuleServicews(DeleteTeachedModuleServicews value) {
        return new JAXBElement<DeleteTeachedModuleServicews>(_DeleteTeachedModuleServicews_QNAME, DeleteTeachedModuleServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeachedModuleServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteTeachedModuleServicewsResponse")
    public JAXBElement<DeleteTeachedModuleServicewsResponse> createDeleteTeachedModuleServicewsResponse(DeleteTeachedModuleServicewsResponse value) {
        return new JAXBElement<DeleteTeachedModuleServicewsResponse>(_DeleteTeachedModuleServicewsResponse_QNAME, DeleteTeachedModuleServicewsResponse.class, null, value);
    }

}
