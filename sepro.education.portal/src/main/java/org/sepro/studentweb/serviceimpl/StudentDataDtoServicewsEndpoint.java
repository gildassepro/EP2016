
package org.sepro.studentweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.studentweb.serviceapi.StudentDataDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentDataDtoServicewsEndpoint", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
@XmlSeeAlso({
    org.sepro.studentweb.serviceapi.ObjectFactoryStudentDataDto.class
})
public interface StudentDataDtoServicewsEndpoint {


    /**
     * 
     * @return
     *     returns java.util.List<org.sepro.studentweb.serviceapi.StudentDataDto>
     */
    @WebMethod(operationName = "SearchStudentDataDtoServicews")
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "SearchStudentDataDtoServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchStudentDataDtoServicews")
    @ResponseWrapper(localName = "SearchStudentDataDtoServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchStudentDataDtoServicewsResponse")
    public List<StudentDataDto> searchStudentDataDtoServicews();

}