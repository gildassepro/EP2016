
package org.sepro.studentweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.studentweb.serviceapi.TeacherPresenceDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TeacherPresenceServicewsEndpoint", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
@XmlSeeAlso({
    org.sepro.studentweb.serviceapi.ObjectFactoryTeacherPresence.class
})
public interface TeacherPresenceServicewsEndpoint {


    /**
     * 
     * @param teacherPresenceDto
     * @return
     *     returns java.util.List<org.sepro.studentweb.serviceapi.TeacherPresenceDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "searchTeacherPresenceServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchTeacherPresenceServicews")
    @ResponseWrapper(localName = "searchTeacherPresenceServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.SearchTeacherPresenceServicewsResponse")
    public List<TeacherPresenceDto> searchTeacherPresenceServicews(
        @WebParam(name = "teacherPresenceDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        TeacherPresenceDto teacherPresenceDto);

    /**
     * 
     * @param teacherPresenceDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteTeacherPresenceServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.DeleteTeacherPresenceServicews")
    @ResponseWrapper(localName = "deleteTeacherPresenceServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.DeleteTeacherPresenceServicewsResponse")
    public void deleteTeacherPresenceServicews(
        @WebParam(name = "teacherPresenceDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        TeacherPresenceDto teacherPresenceDto);

    /**
     * 
     * @param teacherPresenceDto
     * @return
     *     returns org.sepro.studentweb.serviceapi.TeacherPresenceDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "updateTeacherPresenceServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.UpdateTeacherPresenceServicews")
    @ResponseWrapper(localName = "updateTeacherPresenceServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.UpdateTeacherPresenceServicewsResponse")
    public TeacherPresenceDto updateTeacherPresenceServicews(
        @WebParam(name = "teacherPresenceDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        TeacherPresenceDto teacherPresenceDto);

    /**
     * 
     * @param teacherPresenceDto
     * @return
     *     returns org.sepro.studentweb.serviceapi.TeacherPresenceDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.studentweb.sepro.org/")
    @RequestWrapper(localName = "createTeacherPresenceServicews", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.CreateTeacherPresenceServicews")
    @ResponseWrapper(localName = "createTeacherPresenceServicewsResponse", targetNamespace = "http://serviceapi.studentweb.sepro.org/", className = "org.sepro.studentweb.serviceapi.CreateTeacherPresenceServicewsResponse")
    public TeacherPresenceDto createTeacherPresenceServicews(
        @WebParam(name = "teacherPresenceDto", targetNamespace = "http://serviceapi.studentweb.sepro.org/")
        TeacherPresenceDto teacherPresenceDto);

}
