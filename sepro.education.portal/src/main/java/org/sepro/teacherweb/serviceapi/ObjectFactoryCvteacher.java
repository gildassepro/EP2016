
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.teacherweb.serviceapi package. 
 * <p>An ObjectFactoryCvteacher allows you to programatically 
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
public class ObjectFactoryCvteacher {

    private final static QName _DeleteCvteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteCvteacherServicewsResponse");
    private final static QName _SearchCvteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchCvteacherServicews");
    private final static QName _UpdateCvteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateCvteacherServicewsResponse");
    private final static QName _UpdateCvteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "updateCvteacherServicews");
    private final static QName _CreateCvteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createCvteacherServicewsResponse");
    private final static QName _DeleteCvteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "deleteCvteacherServicews");
    private final static QName _CreateCvteacherServicews_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "createCvteacherServicews");
    private final static QName _SearchCvteacherServicewsResponse_QNAME = new QName("http://serviceapi.teacherweb.sepro.org/", "searchCvteacherServicewsResponse");

    /**
     * Create a new ObjectFactoryCvteacher that can be used to create new instances of schema derived classes for package: org.sepro.teacherweb.serviceapi
     * 
     */
    public ObjectFactoryCvteacher() {
    }

    /**
     * Create an instance of {@link UpdateCvteacherServicews }
     * 
     */
    public UpdateCvteacherServicews createUpdateCvteacherServicews() {
        return new UpdateCvteacherServicews();
    }

    /**
     * Create an instance of {@link UpdateCvteacherServicewsResponse }
     * 
     */
    public UpdateCvteacherServicewsResponse createUpdateCvteacherServicewsResponse() {
        return new UpdateCvteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteCvteacherServicewsResponse }
     * 
     */
    public DeleteCvteacherServicewsResponse createDeleteCvteacherServicewsResponse() {
        return new DeleteCvteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchCvteacherServicews }
     * 
     */
    public SearchCvteacherServicews createSearchCvteacherServicews() {
        return new SearchCvteacherServicews();
    }

    /**
     * Create an instance of {@link CreateCvteacherServicews }
     * 
     */
    public CreateCvteacherServicews createCreateCvteacherServicews() {
        return new CreateCvteacherServicews();
    }

    /**
     * Create an instance of {@link SearchCvteacherServicewsResponse }
     * 
     */
    public SearchCvteacherServicewsResponse createSearchCvteacherServicewsResponse() {
        return new SearchCvteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateCvteacherServicewsResponse }
     * 
     */
    public CreateCvteacherServicewsResponse createCreateCvteacherServicewsResponse() {
        return new CreateCvteacherServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteCvteacherServicews }
     * 
     */
    public DeleteCvteacherServicews createDeleteCvteacherServicews() {
        return new DeleteCvteacherServicews();
    }

    /**
     * Create an instance of {@link IdentityTeacherDto }
     * 
     */
    public IdentityTeacherDto createIdentityTeacherDto() {
        return new IdentityTeacherDto();
    }

    /**
     * Create an instance of {@link CvteacherDto }
     * 
     */
    public CvteacherDto createCvteacherDto() {
        return new CvteacherDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCvteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteCvteacherServicewsResponse")
    public JAXBElement<DeleteCvteacherServicewsResponse> createDeleteCvteacherServicewsResponse(DeleteCvteacherServicewsResponse value) {
        return new JAXBElement<DeleteCvteacherServicewsResponse>(_DeleteCvteacherServicewsResponse_QNAME, DeleteCvteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCvteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchCvteacherServicews")
    public JAXBElement<SearchCvteacherServicews> createSearchCvteacherServicews(SearchCvteacherServicews value) {
        return new JAXBElement<SearchCvteacherServicews>(_SearchCvteacherServicews_QNAME, SearchCvteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCvteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateCvteacherServicewsResponse")
    public JAXBElement<UpdateCvteacherServicewsResponse> createUpdateCvteacherServicewsResponse(UpdateCvteacherServicewsResponse value) {
        return new JAXBElement<UpdateCvteacherServicewsResponse>(_UpdateCvteacherServicewsResponse_QNAME, UpdateCvteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCvteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "updateCvteacherServicews")
    public JAXBElement<UpdateCvteacherServicews> createUpdateCvteacherServicews(UpdateCvteacherServicews value) {
        return new JAXBElement<UpdateCvteacherServicews>(_UpdateCvteacherServicews_QNAME, UpdateCvteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCvteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createCvteacherServicewsResponse")
    public JAXBElement<CreateCvteacherServicewsResponse> createCreateCvteacherServicewsResponse(CreateCvteacherServicewsResponse value) {
        return new JAXBElement<CreateCvteacherServicewsResponse>(_CreateCvteacherServicewsResponse_QNAME, CreateCvteacherServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCvteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "deleteCvteacherServicews")
    public JAXBElement<DeleteCvteacherServicews> createDeleteCvteacherServicews(DeleteCvteacherServicews value) {
        return new JAXBElement<DeleteCvteacherServicews>(_DeleteCvteacherServicews_QNAME, DeleteCvteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCvteacherServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "createCvteacherServicews")
    public JAXBElement<CreateCvteacherServicews> createCreateCvteacherServicews(CreateCvteacherServicews value) {
        return new JAXBElement<CreateCvteacherServicews>(_CreateCvteacherServicews_QNAME, CreateCvteacherServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCvteacherServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.teacherweb.sepro.org/", name = "searchCvteacherServicewsResponse")
    public JAXBElement<SearchCvteacherServicewsResponse> createSearchCvteacherServicewsResponse(SearchCvteacherServicewsResponse value) {
        return new JAXBElement<SearchCvteacherServicewsResponse>(_SearchCvteacherServicewsResponse_QNAME, SearchCvteacherServicewsResponse.class, null, value);
    }

}
