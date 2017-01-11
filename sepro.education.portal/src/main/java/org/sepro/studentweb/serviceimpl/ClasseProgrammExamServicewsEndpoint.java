
package org.sepro.studentweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.studentweb.serviceapi.ClasseProgrammExamDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClasseProgrammExamServicewsEndpoint", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
@XmlSeeAlso({
    org.sepro.studentweb.serviceapi.ObjectFactoryClasseProgrammExam.class
})
public interface ClasseProgrammExamServicewsEndpoint {


    /**
     * 
     * @param classeProgrammExamDto
     * @return
     *     returns java.util.List<org.sepro.studentweb.serviceapi.ClasseProgrammExamDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "searchClasseProgrammExamServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchClasseProgrammExamServicews")
    @ResponseWrapper(localName = "searchClasseProgrammExamServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchClasseProgrammExamServicewsResponse")
    public List<ClasseProgrammExamDto> searchClasseProgrammExamServicews(
        @WebParam(name = "classeProgrammExamDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        ClasseProgrammExamDto classeProgrammExamDto);

    /**
     * 
     * @param classeProgrammExamDto
     * @return
     *     returns org.sepro.studentweb.serviceapi.ClasseProgrammExamDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "createClasseProgrammExamServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.CreateClasseProgrammExamServicews")
    @ResponseWrapper(localName = "createClasseProgrammExamServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.CreateClasseProgrammExamServicewsResponse")
    public ClasseProgrammExamDto createClasseProgrammExamServicews(
        @WebParam(name = "classeProgrammExamDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        ClasseProgrammExamDto classeProgrammExamDto);

    /**
     * 
     * @param classeProgrammExamDto
     * @return
     *     returns org.sepro.studentweb.serviceapi.ClasseProgrammExamDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "updateClasseProgrammExamServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.UpdateClasseProgrammExamServicews")
    @ResponseWrapper(localName = "updateClasseProgrammExamServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.UpdateClasseProgrammExamServicewsResponse")
    public ClasseProgrammExamDto updateClasseProgrammExamServicews(
        @WebParam(name = "classeProgrammExamDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        ClasseProgrammExamDto classeProgrammExamDto);

    /**
     * 
     * @param classeProgrammExamDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteClasseProgrammExamServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.DeleteClasseProgrammExamServicews")
    @ResponseWrapper(localName = "deleteClasseProgrammExamServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.DeleteClasseProgrammExamServicewsResponse")
    public void deleteClasseProgrammExamServicews(
        @WebParam(name = "classeProgrammExamDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        ClasseProgrammExamDto classeProgrammExamDto);

}
