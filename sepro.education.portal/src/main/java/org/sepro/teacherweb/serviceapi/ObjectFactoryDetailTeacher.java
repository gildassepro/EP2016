
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.teacherweb.serviceapi package. 
 * <p>An ObjectFactoryDetailTeacher allows you to programatically 
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
public class ObjectFactoryDetailTeacher {

    private final static QName _CreateDetailteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createDetailteacherServicews");
    private final static QName _UpdateDetailteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateDetailteacherServicewsResponse");
    private final static QName _DeleteDetailteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteDetailteacherServicews");
    private final static QName _SearchDetailteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchDetailteacherServicewsResponse");
    private final static QName _CreateDetailteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createDetailteacherServicewsResponse");
    private final static QName _SearchDetailteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchDetailteacherServicews");
    private final static QName _DeleteDetailteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteDetailteacherServicewsResponse");
    private final static QName _UpdateDetailteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateDetailteacherServicews");

    /**
     * Create a new ObjectFactoryDetailTeacher that can be used to create new instances of schema derived classes for package: org.sepro.teacherweb.serviceapi
     * 
     */
    public ObjectFactoryDetailTeacher() {
    }

    /**
     * Create an instance of {@link SearchDetailteacherServicewsResponse }
     * 
     */
    public SearchDetailteacherServicewsResponse createSearchDetailteacherServicewsResponse() {
        return new SearchDetailteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateDetailteacherServicewsResponse }
     * 
     */
    public CreateDetailteacherServicewsResponse createCreateDetailteacherServicewsResponse() {
        return new CreateDetailteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteDetailteacherServicews }
     * 
     */
    public DeleteDetailteacherServicews createDeleteDetailteacherServicews() {
        return new DeleteDetailteacherServicews();
    }

    /**
     * Create an instance of {@link CreateDetailteacherServicews }
     * 
     */
    public CreateDetailteacherServicews createCreateDetailteacherServicews() {
        return new CreateDetailteacherServicews();
    }

    /**
     * Create an instance of {@link UpdateDetailteacherServicewsResponse }
     * 
     */
    public UpdateDetailteacherServicewsResponse createUpdateDetailteacherServicewsResponse() {
        return new UpdateDetailteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateDetailteacherServicews }
     * 
     */
    public UpdateDetailteacherServicews createUpdateDetailteacherServicews() {
        return new UpdateDetailteacherServicews();
    }

    /**
     * Create an instance of {@link DeleteDetailteacherServicewsResponse }
     * 
     */
    public DeleteDetailteacherServicewsResponse createDeleteDetailteacherServicewsResponse() {
        return new DeleteDetailteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchDetailteacherServicews }
     * 
     */
    public SearchDetailteacherServicews createSearchDetailteacherServicews() {
        return new SearchDetailteacherServicews();
    }

    /**
     * Create an instance of {@link IdentityTeacherDto }
     * 
     */
    public IdentityTeacherDto createIdentityTeacherDto() {
        return new IdentityTeacherDto();
    }

    /**
     * Create an instance of {@link DetailteacherDto }
     * 
     */
    public DetailteacherDto createDetailteacherDto() {
        return new DetailteacherDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDetailteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createDetailteacherServicews")
    public JAXBElement<CreateDetailteacherServicews> createCreateDetailteacherServicews(CreateDetailteacherServicews value) {
        return new JAXBElement<CreateDetailteacherServicews>(_CreateDetailteacherServicews_QNAME, CreateDetailteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDetailteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateDetailteacherServicewsResponse")
    public JAXBElement<UpdateDetailteacherServicewsResponse> createUpdateDetailteacherServicewsResponse(UpdateDetailteacherServicewsResponse value) {
        return new JAXBElement<UpdateDetailteacherServicewsResponse>(_UpdateDetailteacherServicewsResponse_QNAME, UpdateDetailteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDetailteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteDetailteacherServicews")
    public JAXBElement<DeleteDetailteacherServicews> createDeleteDetailteacherServicews(DeleteDetailteacherServicews value) {
        return new JAXBElement<DeleteDetailteacherServicews>(_DeleteDetailteacherServicews_QNAME, DeleteDetailteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDetailteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchDetailteacherServicewsResponse")
    public JAXBElement<SearchDetailteacherServicewsResponse> createSearchDetailteacherServicewsResponse(SearchDetailteacherServicewsResponse value) {
        return new JAXBElement<SearchDetailteacherServicewsResponse>(_SearchDetailteacherServicewsResponse_QNAME, SearchDetailteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDetailteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createDetailteacherServicewsResponse")
    public JAXBElement<CreateDetailteacherServicewsResponse> createCreateDetailteacherServicewsResponse(CreateDetailteacherServicewsResponse value) {
        return new JAXBElement<CreateDetailteacherServicewsResponse>(_CreateDetailteacherServicewsResponse_QNAME, CreateDetailteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDetailteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchDetailteacherServicews")
    public JAXBElement<SearchDetailteacherServicews> createSearchDetailteacherServicews(SearchDetailteacherServicews value) {
        return new JAXBElement<SearchDetailteacherServicews>(_SearchDetailteacherServicews_QNAME, SearchDetailteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDetailteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteDetailteacherServicewsResponse")
    public JAXBElement<DeleteDetailteacherServicewsResponse> createDeleteDetailteacherServicewsResponse(DeleteDetailteacherServicewsResponse value) {
        return new JAXBElement<DeleteDetailteacherServicewsResponse>(_DeleteDetailteacherServicewsResponse_QNAME, DeleteDetailteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDetailteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateDetailteacherServicews")
    public JAXBElement<UpdateDetailteacherServicews> createUpdateDetailteacherServicews(UpdateDetailteacherServicews value) {
        return new JAXBElement<UpdateDetailteacherServicews>(_UpdateDetailteacherServicews_QNAME, UpdateDetailteacherServicews.class, null, value);
    }

}
