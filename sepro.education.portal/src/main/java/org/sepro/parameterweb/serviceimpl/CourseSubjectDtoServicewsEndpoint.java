
package org.sepro.parameterweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.parameterweb.serviceapi.CourseSubjectDto;
import org.sepro.parameterweb.serviceapi.ObjectFactoryCourseSubject;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CourseSubjectDtoServicewsEndpoint", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
@XmlSeeAlso({
    ObjectFactoryCourseSubject.class
})
public interface CourseSubjectDtoServicewsEndpoint {


    /**
     * 
     * @param courseSubjectDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCourseSubjectServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.DeleteCourseSubjectServicews")
    @ResponseWrapper(localName = "deleteCourseSubjectServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.DeleteCourseSubjectServicewsResponse")
    public void deleteCourseSubjectServicews(
        @WebParam(name = "courseSubjectDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CourseSubjectDto courseSubjectDto);

    /**
     * 
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.CourseSubjectDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "getAllCourseSubjectServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllCourseSubjectServicews")
    @ResponseWrapper(localName = "getAllCourseSubjectServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllCourseSubjectServicewsResponse")
    public List<CourseSubjectDto> getAllCourseSubjectServicews();

    /**
     * 
     * @param courseSubjectDto
     * @return
     *     returns org.sepro.parameterweb.serviceapi.CourseSubjectDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "updateCourseSubjectServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.UpdateCourseSubjectServicews")
    @ResponseWrapper(localName = "updateCourseSubjectServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.UpdateCourseSubjectServicewsResponse")
    public CourseSubjectDto updateCourseSubjectServicews(
        @WebParam(name = "courseSubjectDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CourseSubjectDto courseSubjectDto);

    /**
     * 
     * @param courseSubjectDto
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.CourseSubjectDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "searchCourseSubjectServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchCourseSubjectServicews")
    @ResponseWrapper(localName = "searchCourseSubjectServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchCourseSubjectServicewsResponse")
    public List<CourseSubjectDto> searchCourseSubjectServicews(
        @WebParam(name = "courseSubjectDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CourseSubjectDto courseSubjectDto);

    /**
     * 
     * @param courseSubjectDto
     * @return
     *     returns org.sepro.parameterweb.serviceapi.CourseSubjectDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "createCourseSubjectServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.CreateCourseSubjectServicews")
    @ResponseWrapper(localName = "createCourseSubjectServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.CreateCourseSubjectServicewsResponse")
    public CourseSubjectDto createCourseSubjectServicews(
        @WebParam(name = "courseSubjectDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CourseSubjectDto courseSubjectDto);

}
