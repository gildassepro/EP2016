
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.inscriptionweb.serviceapi package. 
 * <p>An ObjectFactoryInscriptionSteptree allows you to programatically 
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
public class ObjectFactoryInscriptionSteptree {

    private final static QName _DeleteInscriptionSteptreeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionSteptreeServicews");
    private final static QName _CreateInscriptionSteptreeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionSteptreeServicews");
    private final static QName _SearchInscriptionSteptreeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionSteptreeServicews");
    private final static QName _UpdateInscriptionSteptreeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionSteptreeServicewsResponse");
    private final static QName _UpdateInscriptionSteptreeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionSteptreeServicews");
    private final static QName _CreateInscriptionSteptreeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionSteptreeServicewsResponse");
    private final static QName _DeleteInscriptionSteptreeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionSteptreeServicewsResponse");
    private final static QName _SearchInscriptionSteptreeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionSteptreeServicewsResponse");

    /**
     * Create a new ObjectFactoryInscriptionSteptree that can be used to create new instances of schema derived classes for package: org.sepro.inscriptionweb.serviceapi
     * 
     */
    public ObjectFactoryInscriptionSteptree() {
    }

    /**
     * Create an instance of {@link SearchInscriptionSteptreeServicewsResponse }
     * 
     */
    public SearchInscriptionSteptreeServicewsResponse createSearchInscriptionSteptreeServicewsResponse() {
        return new SearchInscriptionSteptreeServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteInscriptionSteptreeServicewsResponse }
     * 
     */
    public DeleteInscriptionSteptreeServicewsResponse createDeleteInscriptionSteptreeServicewsResponse() {
        return new DeleteInscriptionSteptreeServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateInscriptionSteptreeServicewsResponse }
     * 
     */
    public CreateInscriptionSteptreeServicewsResponse createCreateInscriptionSteptreeServicewsResponse() {
        return new CreateInscriptionSteptreeServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateInscriptionSteptreeServicews }
     * 
     */
    public UpdateInscriptionSteptreeServicews createUpdateInscriptionSteptreeServicews() {
        return new UpdateInscriptionSteptreeServicews();
    }

    /**
     * Create an instance of {@link DeleteInscriptionSteptreeServicews }
     * 
     */
    public DeleteInscriptionSteptreeServicews createDeleteInscriptionSteptreeServicews() {
        return new DeleteInscriptionSteptreeServicews();
    }

    /**
     * Create an instance of {@link CreateInscriptionSteptreeServicews }
     * 
     */
    public CreateInscriptionSteptreeServicews createCreateInscriptionSteptreeServicews() {
        return new CreateInscriptionSteptreeServicews();
    }

    /**
     * Create an instance of {@link SearchInscriptionSteptreeServicews }
     * 
     */
    public SearchInscriptionSteptreeServicews createSearchInscriptionSteptreeServicews() {
        return new SearchInscriptionSteptreeServicews();
    }

    /**
     * Create an instance of {@link UpdateInscriptionSteptreeServicewsResponse }
     * 
     */
    public UpdateInscriptionSteptreeServicewsResponse createUpdateInscriptionSteptreeServicewsResponse() {
        return new UpdateInscriptionSteptreeServicewsResponse();
    }

    /**
     * Create an instance of {@link InscriptionAuthentificationDto }
     * 
     */
    public InscriptionAuthentificationDto createInscriptionAuthentificationDto() {
        return new InscriptionAuthentificationDto();
    }

    /**
     * Create an instance of {@link InscriptionSteptreeDto }
     * 
     */
    public InscriptionSteptreeDto createInscriptionSteptreeDto() {
        return new InscriptionSteptreeDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionSteptreeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionSteptreeServicews")
    public JAXBElement<DeleteInscriptionSteptreeServicews> createDeleteInscriptionSteptreeServicews(DeleteInscriptionSteptreeServicews value) {
        return new JAXBElement<DeleteInscriptionSteptreeServicews>(_DeleteInscriptionSteptreeServicews_QNAME, DeleteInscriptionSteptreeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionSteptreeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionSteptreeServicews")
    public JAXBElement<CreateInscriptionSteptreeServicews> createCreateInscriptionSteptreeServicews(CreateInscriptionSteptreeServicews value) {
        return new JAXBElement<CreateInscriptionSteptreeServicews>(_CreateInscriptionSteptreeServicews_QNAME, CreateInscriptionSteptreeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionSteptreeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionSteptreeServicews")
    public JAXBElement<SearchInscriptionSteptreeServicews> createSearchInscriptionSteptreeServicews(SearchInscriptionSteptreeServicews value) {
        return new JAXBElement<SearchInscriptionSteptreeServicews>(_SearchInscriptionSteptreeServicews_QNAME, SearchInscriptionSteptreeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionSteptreeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionSteptreeServicewsResponse")
    public JAXBElement<UpdateInscriptionSteptreeServicewsResponse> createUpdateInscriptionSteptreeServicewsResponse(UpdateInscriptionSteptreeServicewsResponse value) {
        return new JAXBElement<UpdateInscriptionSteptreeServicewsResponse>(_UpdateInscriptionSteptreeServicewsResponse_QNAME, UpdateInscriptionSteptreeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionSteptreeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionSteptreeServicews")
    public JAXBElement<UpdateInscriptionSteptreeServicews> createUpdateInscriptionSteptreeServicews(UpdateInscriptionSteptreeServicews value) {
        return new JAXBElement<UpdateInscriptionSteptreeServicews>(_UpdateInscriptionSteptreeServicews_QNAME, UpdateInscriptionSteptreeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionSteptreeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionSteptreeServicewsResponse")
    public JAXBElement<CreateInscriptionSteptreeServicewsResponse> createCreateInscriptionSteptreeServicewsResponse(CreateInscriptionSteptreeServicewsResponse value) {
        return new JAXBElement<CreateInscriptionSteptreeServicewsResponse>(_CreateInscriptionSteptreeServicewsResponse_QNAME, CreateInscriptionSteptreeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionSteptreeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionSteptreeServicewsResponse")
    public JAXBElement<DeleteInscriptionSteptreeServicewsResponse> createDeleteInscriptionSteptreeServicewsResponse(DeleteInscriptionSteptreeServicewsResponse value) {
        return new JAXBElement<DeleteInscriptionSteptreeServicewsResponse>(_DeleteInscriptionSteptreeServicewsResponse_QNAME, DeleteInscriptionSteptreeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionSteptreeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionSteptreeServicewsResponse")
    public JAXBElement<SearchInscriptionSteptreeServicewsResponse> createSearchInscriptionSteptreeServicewsResponse(SearchInscriptionSteptreeServicewsResponse value) {
        return new JAXBElement<SearchInscriptionSteptreeServicewsResponse>(_SearchInscriptionSteptreeServicewsResponse_QNAME, SearchInscriptionSteptreeServicewsResponse.class, null, value);
    }

}
