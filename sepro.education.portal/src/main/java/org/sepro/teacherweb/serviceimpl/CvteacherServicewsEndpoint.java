
package org.sepro.teacherweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.teacherweb.serviceapi.CvteacherDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CvteacherServicewsEndpoint", targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
@XmlSeeAlso({
    org.sepro.teacherweb.serviceapi.ObjectFactoryCvteacher.class
})
public interface CvteacherServicewsEndpoint {


    /**
     * 
     * @param cvteacherDto
     * @return
     *     returns java.util.List<org.sepro.teacherweb.serviceapi.CvteacherDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
    @RequestWrapper(localName = "searchCvteacherServicews", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.SearchCvteacherServicews")
    @ResponseWrapper(localName = "searchCvteacherServicewsResponse", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.SearchCvteacherServicewsResponse")
    public List<CvteacherDto> searchCvteacherServicews(
        @WebParam(name = "cvteacherDto", targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
        CvteacherDto cvteacherDto);

    /**
     * 
     * @param cvteacherDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCvteacherServicews", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.DeleteCvteacherServicews")
    @ResponseWrapper(localName = "deleteCvteacherServicewsResponse", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.DeleteCvteacherServicewsResponse")
    public void deleteCvteacherServicews(
        @WebParam(name = "cvteacherDto", targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
        CvteacherDto cvteacherDto);

    /**
     * 
     * @param cvteacherDto
     * @return
     *     returns org.sepro.teacherweb.serviceapi.CvteacherDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
    @RequestWrapper(localName = "updateCvteacherServicews", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.UpdateCvteacherServicews")
    @ResponseWrapper(localName = "updateCvteacherServicewsResponse", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.UpdateCvteacherServicewsResponse")
    public CvteacherDto updateCvteacherServicews(
        @WebParam(name = "cvteacherDto", targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
        CvteacherDto cvteacherDto);

    /**
     * 
     * @param cvteacherDto
     * @return
     *     returns org.sepro.teacherweb.serviceapi.CvteacherDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
    @RequestWrapper(localName = "createCvteacherServicews", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.CreateCvteacherServicews")
    @ResponseWrapper(localName = "createCvteacherServicewsResponse", targetNamespace = "http://serviceapi.teacherweb.sepro.org/", className = "org.sepro.teacherweb.serviceapi.CreateCvteacherServicewsResponse")
    public CvteacherDto createCvteacherServicews(
        @WebParam(name = "cvteacherDto", targetNamespace = "http://serviceapi.teacherweb.sepro.org/")
        CvteacherDto cvteacherDto);

}
