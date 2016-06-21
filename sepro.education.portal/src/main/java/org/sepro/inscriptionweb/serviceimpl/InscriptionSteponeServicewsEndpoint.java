
package org.sepro.inscriptionweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InscriptionSteponeServicewsEndpoint", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
@XmlSeeAlso({
    org.sepro.inscriptionweb.serviceapi.ObjectFactoryInscriptionStepone.class
})
public interface InscriptionSteponeServicewsEndpoint {


    /**
     * 
     * @param inscriptionSteponeDto
     * @return
     *     returns org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
    @RequestWrapper(localName = "createInscriptionSteponeServicews", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.CreateInscriptionSteponeServicews")
    @ResponseWrapper(localName = "createInscriptionSteponeServicewsResponse", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.CreateInscriptionSteponeServicewsResponse")
    public InscriptionSteponeDto createInscriptionSteponeServicews(
        @WebParam(name = "inscriptionSteponeDto", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
        InscriptionSteponeDto inscriptionSteponeDto);

    /**
     * 
     * @param inscriptionSteponeDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteInscriptionSteponeServicews", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.DeleteInscriptionSteponeServicews")
    @ResponseWrapper(localName = "deleteInscriptionSteponeServicewsResponse", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.DeleteInscriptionSteponeServicewsResponse")
    public void deleteInscriptionSteponeServicews(
        @WebParam(name = "inscriptionSteponeDto", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
        InscriptionSteponeDto inscriptionSteponeDto);

    /**
     * 
     * @param inscriptionSteponeDto
     * @return
     *     returns java.util.List<org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
    @RequestWrapper(localName = "searchInscriptionSteponeServicews", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.SearchInscriptionSteponeServicews")
    @ResponseWrapper(localName = "searchInscriptionSteponeServicewsResponse", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.SearchInscriptionSteponeServicewsResponse")
    public List<InscriptionSteponeDto> searchInscriptionSteponeServicews(
        @WebParam(name = "inscriptionSteponeDto", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
        InscriptionSteponeDto inscriptionSteponeDto);

    /**
     * 
     * @param inscriptionSteponeDto
     * @return
     *     returns org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
    @RequestWrapper(localName = "updateInscriptionSteponeServicews", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.UpdateInscriptionSteponeServicews")
    @ResponseWrapper(localName = "updateInscriptionSteponeServicewsResponse", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/", className = "org.sepro.inscriptionweb.serviceapi.UpdateInscriptionSteponeServicewsResponse")
    public InscriptionSteponeDto updateInscriptionSteponeServicews(
        @WebParam(name = "inscriptionSteponeDto", targetNamespace = "http://serviceapi.inscriptionweb.sepro.org/")
        InscriptionSteponeDto inscriptionSteponeDto);

}
