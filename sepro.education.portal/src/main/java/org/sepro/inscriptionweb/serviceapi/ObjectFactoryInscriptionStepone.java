
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.inscriptionweb.serviceapi package. 
 * <p>An ObjectFactoryInscriptionStepone allows you to programatically 
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
public class ObjectFactoryInscriptionStepone {

    private final static QName _DeleteInscriptionSteponeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionSteponeServicews");
    private final static QName _UpdateInscriptionSteponeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionSteponeServicewsResponse");
    private final static QName _DeleteInscriptionSteponeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionSteponeServicewsResponse");
    private final static QName _SearchInscriptionSteponeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionSteponeServicewsResponse");
    private final static QName _CreateInscriptionSteponeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionSteponeServicews");
    private final static QName _CreateInscriptionSteponeServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionSteponeServicewsResponse");
    private final static QName _SearchInscriptionSteponeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionSteponeServicews");
    private final static QName _UpdateInscriptionSteponeServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionSteponeServicews");

    /**
     * Create a new ObjectFactoryInscriptionStepone that can be used to create new instances of schema derived classes for package: org.sepro.inscriptionweb.serviceapi
     * 
     */
    public ObjectFactoryInscriptionStepone() {
    }

    /**
     * Create an instance of {@link SearchInscriptionSteponeServicews }
     * 
     */
    public SearchInscriptionSteponeServicews createSearchInscriptionSteponeServicews() {
        return new SearchInscriptionSteponeServicews();
    }

    /**
     * Create an instance of {@link UpdateInscriptionSteponeServicews }
     * 
     */
    public UpdateInscriptionSteponeServicews createUpdateInscriptionSteponeServicews() {
        return new UpdateInscriptionSteponeServicews();
    }

    /**
     * Create an instance of {@link CreateInscriptionSteponeServicews }
     * 
     */
    public CreateInscriptionSteponeServicews createCreateInscriptionSteponeServicews() {
        return new CreateInscriptionSteponeServicews();
    }

    /**
     * Create an instance of {@link CreateInscriptionSteponeServicewsResponse }
     * 
     */
    public CreateInscriptionSteponeServicewsResponse createCreateInscriptionSteponeServicewsResponse() {
        return new CreateInscriptionSteponeServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchInscriptionSteponeServicewsResponse }
     * 
     */
    public SearchInscriptionSteponeServicewsResponse createSearchInscriptionSteponeServicewsResponse() {
        return new SearchInscriptionSteponeServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteInscriptionSteponeServicewsResponse }
     * 
     */
    public DeleteInscriptionSteponeServicewsResponse createDeleteInscriptionSteponeServicewsResponse() {
        return new DeleteInscriptionSteponeServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteInscriptionSteponeServicews }
     * 
     */
    public DeleteInscriptionSteponeServicews createDeleteInscriptionSteponeServicews() {
        return new DeleteInscriptionSteponeServicews();
    }

    /**
     * Create an instance of {@link UpdateInscriptionSteponeServicewsResponse }
     * 
     */
    public UpdateInscriptionSteponeServicewsResponse createUpdateInscriptionSteponeServicewsResponse() {
        return new UpdateInscriptionSteponeServicewsResponse();
    }

    /**
     * Create an instance of {@link InscriptionAuthentificationDto }
     * 
     */
    public InscriptionAuthentificationDto createInscriptionAuthentificationDto() {
        return new InscriptionAuthentificationDto();
    }

    /**
     * Create an instance of {@link InscriptionSteponeDto }
     * 
     */
    public InscriptionSteponeDto createInscriptionSteponeDto() {
        return new InscriptionSteponeDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionSteponeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionSteponeServicews")
    public JAXBElement<DeleteInscriptionSteponeServicews> createDeleteInscriptionSteponeServicews(DeleteInscriptionSteponeServicews value) {
        return new JAXBElement<DeleteInscriptionSteponeServicews>(_DeleteInscriptionSteponeServicews_QNAME, DeleteInscriptionSteponeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionSteponeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionSteponeServicewsResponse")
    public JAXBElement<UpdateInscriptionSteponeServicewsResponse> createUpdateInscriptionSteponeServicewsResponse(UpdateInscriptionSteponeServicewsResponse value) {
        return new JAXBElement<UpdateInscriptionSteponeServicewsResponse>(_UpdateInscriptionSteponeServicewsResponse_QNAME, UpdateInscriptionSteponeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionSteponeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionSteponeServicewsResponse")
    public JAXBElement<DeleteInscriptionSteponeServicewsResponse> createDeleteInscriptionSteponeServicewsResponse(DeleteInscriptionSteponeServicewsResponse value) {
        return new JAXBElement<DeleteInscriptionSteponeServicewsResponse>(_DeleteInscriptionSteponeServicewsResponse_QNAME, DeleteInscriptionSteponeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionSteponeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionSteponeServicewsResponse")
    public JAXBElement<SearchInscriptionSteponeServicewsResponse> createSearchInscriptionSteponeServicewsResponse(SearchInscriptionSteponeServicewsResponse value) {
        return new JAXBElement<SearchInscriptionSteponeServicewsResponse>(_SearchInscriptionSteponeServicewsResponse_QNAME, SearchInscriptionSteponeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionSteponeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionSteponeServicews")
    public JAXBElement<CreateInscriptionSteponeServicews> createCreateInscriptionSteponeServicews(CreateInscriptionSteponeServicews value) {
        return new JAXBElement<CreateInscriptionSteponeServicews>(_CreateInscriptionSteponeServicews_QNAME, CreateInscriptionSteponeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionSteponeServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionSteponeServicewsResponse")
    public JAXBElement<CreateInscriptionSteponeServicewsResponse> createCreateInscriptionSteponeServicewsResponse(CreateInscriptionSteponeServicewsResponse value) {
        return new JAXBElement<CreateInscriptionSteponeServicewsResponse>(_CreateInscriptionSteponeServicewsResponse_QNAME, CreateInscriptionSteponeServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionSteponeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionSteponeServicews")
    public JAXBElement<SearchInscriptionSteponeServicews> createSearchInscriptionSteponeServicews(SearchInscriptionSteponeServicews value) {
        return new JAXBElement<SearchInscriptionSteponeServicews>(_SearchInscriptionSteponeServicews_QNAME, SearchInscriptionSteponeServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionSteponeServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionSteponeServicews")
    public JAXBElement<UpdateInscriptionSteponeServicews> createUpdateInscriptionSteponeServicews(UpdateInscriptionSteponeServicews value) {
        return new JAXBElement<UpdateInscriptionSteponeServicews>(_UpdateInscriptionSteponeServicews_QNAME, UpdateInscriptionSteponeServicews.class, null, value);
    }

}
