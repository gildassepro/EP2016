
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.inscriptionweb.serviceapi package. 
 * <p>An ObjectFactoryInscriptionAuth allows you to programatically 
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
public class ObjectFactoryInscriptionAuth {

    private final static QName _SearchInscriptionAuthServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionAuthServicews");
    private final static QName _DeleteInscriptionAuthServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionAuthServicewsResponse");
    private final static QName _DeleteInscriptionAuthServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionAuthServicews");
    private final static QName _SearchInscriptionAuthServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionAuthServicewsResponse");
    private final static QName _CreateInscriptionAuthServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionAuthServicews");
    private final static QName _UpdateInscriptionAuthServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionAuthServicewsResponse");
    private final static QName _UpdateInscriptionAuthServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionAuthServicews");
    private final static QName _CreateInscriptionAuthServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionAuthServicewsResponse");

    /**
     * Create a new ObjectFactoryInscriptionAuth that can be used to create new instances of schema derived classes for package: org.sepro.inscriptionweb.serviceapi
     * 
     */
    public ObjectFactoryInscriptionAuth() {
    }

    /**
     * Create an instance of {@link CreateInscriptionAuthServicewsResponse }
     * 
     */
    public CreateInscriptionAuthServicewsResponse createCreateInscriptionAuthServicewsResponse() {
        return new CreateInscriptionAuthServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateInscriptionAuthServicews }
     * 
     */
    public UpdateInscriptionAuthServicews createUpdateInscriptionAuthServicews() {
        return new UpdateInscriptionAuthServicews();
    }

    /**
     * Create an instance of {@link CreateInscriptionAuthServicews }
     * 
     */
    public CreateInscriptionAuthServicews createCreateInscriptionAuthServicews() {
        return new CreateInscriptionAuthServicews();
    }

    /**
     * Create an instance of {@link UpdateInscriptionAuthServicewsResponse }
     * 
     */
    public UpdateInscriptionAuthServicewsResponse createUpdateInscriptionAuthServicewsResponse() {
        return new UpdateInscriptionAuthServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteInscriptionAuthServicews }
     * 
     */
    public DeleteInscriptionAuthServicews createDeleteInscriptionAuthServicews() {
        return new DeleteInscriptionAuthServicews();
    }

    /**
     * Create an instance of {@link SearchInscriptionAuthServicewsResponse }
     * 
     */
    public SearchInscriptionAuthServicewsResponse createSearchInscriptionAuthServicewsResponse() {
        return new SearchInscriptionAuthServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteInscriptionAuthServicewsResponse }
     * 
     */
    public DeleteInscriptionAuthServicewsResponse createDeleteInscriptionAuthServicewsResponse() {
        return new DeleteInscriptionAuthServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchInscriptionAuthServicews }
     * 
     */
    public SearchInscriptionAuthServicews createSearchInscriptionAuthServicews() {
        return new SearchInscriptionAuthServicews();
    }

    /**
     * Create an instance of {@link InscriptionAuthentificationDto }
     * 
     */
    public InscriptionAuthentificationDto createInscriptionAuthentificationDto() {
        return new InscriptionAuthentificationDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionAuthServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionAuthServicews")
    public JAXBElement<SearchInscriptionAuthServicews> createSearchInscriptionAuthServicews(SearchInscriptionAuthServicews value) {
        return new JAXBElement<SearchInscriptionAuthServicews>(_SearchInscriptionAuthServicews_QNAME, SearchInscriptionAuthServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionAuthServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionAuthServicewsResponse")
    public JAXBElement<DeleteInscriptionAuthServicewsResponse> createDeleteInscriptionAuthServicewsResponse(DeleteInscriptionAuthServicewsResponse value) {
        return new JAXBElement<DeleteInscriptionAuthServicewsResponse>(_DeleteInscriptionAuthServicewsResponse_QNAME, DeleteInscriptionAuthServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionAuthServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionAuthServicews")
    public JAXBElement<DeleteInscriptionAuthServicews> createDeleteInscriptionAuthServicews(DeleteInscriptionAuthServicews value) {
        return new JAXBElement<DeleteInscriptionAuthServicews>(_DeleteInscriptionAuthServicews_QNAME, DeleteInscriptionAuthServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionAuthServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionAuthServicewsResponse")
    public JAXBElement<SearchInscriptionAuthServicewsResponse> createSearchInscriptionAuthServicewsResponse(SearchInscriptionAuthServicewsResponse value) {
        return new JAXBElement<SearchInscriptionAuthServicewsResponse>(_SearchInscriptionAuthServicewsResponse_QNAME, SearchInscriptionAuthServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionAuthServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionAuthServicews")
    public JAXBElement<CreateInscriptionAuthServicews> createCreateInscriptionAuthServicews(CreateInscriptionAuthServicews value) {
        return new JAXBElement<CreateInscriptionAuthServicews>(_CreateInscriptionAuthServicews_QNAME, CreateInscriptionAuthServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionAuthServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionAuthServicewsResponse")
    public JAXBElement<UpdateInscriptionAuthServicewsResponse> createUpdateInscriptionAuthServicewsResponse(UpdateInscriptionAuthServicewsResponse value) {
        return new JAXBElement<UpdateInscriptionAuthServicewsResponse>(_UpdateInscriptionAuthServicewsResponse_QNAME, UpdateInscriptionAuthServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionAuthServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionAuthServicews")
    public JAXBElement<UpdateInscriptionAuthServicews> createUpdateInscriptionAuthServicews(UpdateInscriptionAuthServicews value) {
        return new JAXBElement<UpdateInscriptionAuthServicews>(_UpdateInscriptionAuthServicews_QNAME, UpdateInscriptionAuthServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionAuthServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionAuthServicewsResponse")
    public JAXBElement<CreateInscriptionAuthServicewsResponse> createCreateInscriptionAuthServicewsResponse(CreateInscriptionAuthServicewsResponse value) {
        return new JAXBElement<CreateInscriptionAuthServicewsResponse>(_CreateInscriptionAuthServicewsResponse_QNAME, CreateInscriptionAuthServicewsResponse.class, null, value);
    }

}
