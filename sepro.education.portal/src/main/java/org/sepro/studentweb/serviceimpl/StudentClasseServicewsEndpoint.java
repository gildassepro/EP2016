
package org.sepro.studentweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.studentweb.serviceapi.StudentClasseDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentClasseServicewsEndpoint", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
@XmlSeeAlso({
    org.sepro.studentweb.serviceapi.ObjectFactoryStudentClasse.class
})
public interface StudentClasseServicewsEndpoint {


    /**
     * 
     * @param studentClasseDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteStudentClasseServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.DeleteStudentClasseServicews")
    @ResponseWrapper(localName = "deleteStudentClasseServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.DeleteStudentClasseServicewsResponse")
    public void deleteStudentClasseServicews(
        @WebParam(name = "studentClasseDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        StudentClasseDto studentClasseDto);

    /**
     * 
     * @param studentClasseDto
     * @return
     *     returns org.sepro.studentweb.serviceapi.StudentClasseDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "createStudentClasseServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.CreateStudentClasseServicews")
    @ResponseWrapper(localName = "createStudentClasseServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.CreateStudentClasseServicewsResponse")
    public StudentClasseDto createStudentClasseServicews(
        @WebParam(name = "studentClasseDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        StudentClasseDto studentClasseDto);

    /**
     * 
     * @param studentClasseDto
     * @return
     *     returns java.util.List<org.sepro.studentweb.serviceapi.StudentClasseDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "searchStudentClasseServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchStudentClasseServicews")
    @ResponseWrapper(localName = "searchStudentClasseServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchStudentClasseServicewsResponse")
    public List<StudentClasseDto> searchStudentClasseServicews(
        @WebParam(name = "studentClasseDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        StudentClasseDto studentClasseDto);

}