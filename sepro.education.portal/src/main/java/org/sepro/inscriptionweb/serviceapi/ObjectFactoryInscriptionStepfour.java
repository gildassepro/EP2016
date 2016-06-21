
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.inscriptionweb.serviceapi package. 
 * <p>An ObjectFactoryInscriptionStepfour allows you to programatically 
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
public class ObjectFactoryInscriptionStepfour {

    private final static QName _SearchInscriptionStepfourServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionStepfourServicews");
    private final static QName _CreateInscriptionStepfourServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionStepfourServicews");
    private final static QName _DeleteInscriptionStepfourServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionStepfourServicews");
    private final static QName _DeleteInscriptionStepfourServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "deleteInscriptionStepfourServicewsResponse");
    private final static QName _UpdateInscriptionStepfourServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionStepfourServicews");
    private final static QName _CreateInscriptionStepfourServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "createInscriptionStepfourServicewsResponse");
    private final static QName _SearchInscriptionStepfourServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "searchInscriptionStepfourServicewsResponse");
    private final static QName _UpdateInscriptionStepfourServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "updateInscriptionStepfourServicewsResponse");

    /**
     * Create a new ObjectFactoryInscriptionStepfour that can be used to create new instances of schema derived classes for package: org.sepro.inscriptionweb.serviceapi
     * 
     */
    public ObjectFactoryInscriptionStepfour() {
    }

    /**
     * Create an instance of {@link UpdateInscriptionStepfourServicewsResponse }
     * 
     */
    public UpdateInscriptionStepfourServicewsResponse createUpdateInscriptionStepfourServicewsResponse() {
        return new UpdateInscriptionStepfourServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateInscriptionStepfourServicewsResponse }
     * 
     */
    public CreateInscriptionStepfourServicewsResponse createCreateInscriptionStepfourServicewsResponse() {
        return new CreateInscriptionStepfourServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchInscriptionStepfourServicewsResponse }
     * 
     */
    public SearchInscriptionStepfourServicewsResponse createSearchInscriptionStepfourServicewsResponse() {
        return new SearchInscriptionStepfourServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateInscriptionStepfourServicews }
     * 
     */
    public UpdateInscriptionStepfourServicews createUpdateInscriptionStepfourServicews() {
        return new UpdateInscriptionStepfourServicews();
    }

    /**
     * Create an instance of {@link DeleteInscriptionStepfourServicewsResponse }
     * 
     */
    public DeleteInscriptionStepfourServicewsResponse createDeleteInscriptionStepfourServicewsResponse() {
        return new DeleteInscriptionStepfourServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchInscriptionStepfourServicews }
     * 
     */
    public SearchInscriptionStepfourServicews createSearchInscriptionStepfourServicews() {
        return new SearchInscriptionStepfourServicews();
    }

    /**
     * Create an instance of {@link CreateInscriptionStepfourServicews }
     * 
     */
    public CreateInscriptionStepfourServicews createCreateInscriptionStepfourServicews() {
        return new CreateInscriptionStepfourServicews();
    }

    /**
     * Create an instance of {@link DeleteInscriptionStepfourServicews }
     * 
     */
    public DeleteInscriptionStepfourServicews createDeleteInscriptionStepfourServicews() {
        return new DeleteInscriptionStepfourServicews();
    }

    /**
     * Create an instance of {@link InscriptionStepfourDto }
     * 
     */
    public InscriptionStepfourDto createInscriptionStepfourDto() {
        return new InscriptionStepfourDto();
    }

    /**
     * Create an instance of {@link InscriptionAuthentificationDto }
     * 
     */
    public InscriptionAuthentificationDto createInscriptionAuthentificationDto() {
        return new InscriptionAuthentificationDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionStepfourServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionStepfourServicews")
    public JAXBElement<SearchInscriptionStepfourServicews> createSearchInscriptionStepfourServicews(SearchInscriptionStepfourServicews value) {
        return new JAXBElement<SearchInscriptionStepfourServicews>(_SearchInscriptionStepfourServicews_QNAME, SearchInscriptionStepfourServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionStepfourServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionStepfourServicews")
    public JAXBElement<CreateInscriptionStepfourServicews> createCreateInscriptionStepfourServicews(CreateInscriptionStepfourServicews value) {
        return new JAXBElement<CreateInscriptionStepfourServicews>(_CreateInscriptionStepfourServicews_QNAME, CreateInscriptionStepfourServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionStepfourServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionStepfourServicews")
    public JAXBElement<DeleteInscriptionStepfourServicews> createDeleteInscriptionStepfourServicews(DeleteInscriptionStepfourServicews value) {
        return new JAXBElement<DeleteInscriptionStepfourServicews>(_DeleteInscriptionStepfourServicews_QNAME, DeleteInscriptionStepfourServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInscriptionStepfourServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "deleteInscriptionStepfourServicewsResponse")
    public JAXBElement<DeleteInscriptionStepfourServicewsResponse> createDeleteInscriptionStepfourServicewsResponse(DeleteInscriptionStepfourServicewsResponse value) {
        return new JAXBElement<DeleteInscriptionStepfourServicewsResponse>(_DeleteInscriptionStepfourServicewsResponse_QNAME, DeleteInscriptionStepfourServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionStepfourServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionStepfourServicews")
    public JAXBElement<UpdateInscriptionStepfourServicews> createUpdateInscriptionStepfourServicews(UpdateInscriptionStepfourServicews value) {
        return new JAXBElement<UpdateInscriptionStepfourServicews>(_UpdateInscriptionStepfourServicews_QNAME, UpdateInscriptionStepfourServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInscriptionStepfourServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "createInscriptionStepfourServicewsResponse")
    public JAXBElement<CreateInscriptionStepfourServicewsResponse> createCreateInscriptionStepfourServicewsResponse(CreateInscriptionStepfourServicewsResponse value) {
        return new JAXBElement<CreateInscriptionStepfourServicewsResponse>(_CreateInscriptionStepfourServicewsResponse_QNAME, CreateInscriptionStepfourServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInscriptionStepfourServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "searchInscriptionStepfourServicewsResponse")
    public JAXBElement<SearchInscriptionStepfourServicewsResponse> createSearchInscriptionStepfourServicewsResponse(SearchInscriptionStepfourServicewsResponse value) {
        return new JAXBElement<SearchInscriptionStepfourServicewsResponse>(_SearchInscriptionStepfourServicewsResponse_QNAME, SearchInscriptionStepfourServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInscriptionStepfourServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "updateInscriptionStepfourServicewsResponse")
    public JAXBElement<UpdateInscriptionStepfourServicewsResponse> createUpdateInscriptionStepfourServicewsResponse(UpdateInscriptionStepfourServicewsResponse value) {
        return new JAXBElement<UpdateInscriptionStepfourServicewsResponse>(_UpdateInscriptionStepfourServicewsResponse_QNAME, UpdateInscriptionStepfourServicewsResponse.class, null, value);
    }

}
