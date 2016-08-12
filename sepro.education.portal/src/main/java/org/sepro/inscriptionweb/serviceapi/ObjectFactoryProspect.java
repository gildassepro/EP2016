
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.inscriptionweb.serviceapi package. 
 * <p>An ObjectFactoryProspect allows you to programatically 
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
public class ObjectFactoryProspect {

    private final static QName _SearchProspectServicewsResponse_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "SearchProspectServicewsResponse");
    private final static QName _SearchProspectServicews_QNAME = new QName("http://serviceapi.inscriptionweb.sepro.org/", "SearchProspectServicews");

    /**
     * Create a new ObjectFactoryProspect that can be used to create new instances of schema derived classes for package: org.sepro.inscriptionweb.serviceapi
     * 
     */
    public ObjectFactoryProspect() {
    }

    /**
     * Create an instance of {@link SearchProspectServicews }
     * 
     */
    public SearchProspectServicews createSearchProspectServicews() {
        return new SearchProspectServicews();
    }

    /**
     * Create an instance of {@link SearchProspectServicewsResponse }
     * 
     */
    public SearchProspectServicewsResponse createSearchProspectServicewsResponse() {
        return new SearchProspectServicewsResponse();
    }

    /**
     * Create an instance of {@link ProspectDto }
     * 
     */
    public ProspectDto createProspectDto() {
        return new ProspectDto();
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
     * Create an instance of {@link InscriptionSteptreeDto }
     * 
     */
    public InscriptionSteptreeDto createInscriptionSteptreeDto() {
        return new InscriptionSteptreeDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProspectServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "SearchProspectServicewsResponse")
    public JAXBElement<SearchProspectServicewsResponse> createSearchProspectServicewsResponse(SearchProspectServicewsResponse value) {
        return new JAXBElement<SearchProspectServicewsResponse>(_SearchProspectServicewsResponse_QNAME, SearchProspectServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProspectServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.inscriptionweb.sepro.org/", name = "SearchProspectServicews")
    public JAXBElement<SearchProspectServicews> createSearchProspectServicews(SearchProspectServicews value) {
        return new JAXBElement<SearchProspectServicews>(_SearchProspectServicews_QNAME, SearchProspectServicews.class, null, value);
    }

}
