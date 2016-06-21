
package org.sepro.authentificationweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.authentificationweb.serviceapi.ObjectFactoryRole;
import org.sepro.authentificationweb.serviceapi.RoleDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RoleServicewsEndpoint", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
@XmlSeeAlso({
    ObjectFactoryRole.class
})
public interface RoleServicewsEndpoint {


    /**
     * 
     * @param roleDto
     * @return
     *     returns java.util.List<org.sepro.authentificationweb.serviceapi.RoleDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
    @RequestWrapper(localName = "searchRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.SearchRoleServicews")
    @ResponseWrapper(localName = "searchRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.SearchRoleServicewsResponse")
    public List<RoleDto> searchRoleServicews(
        @WebParam(name = "roleDto", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        RoleDto roleDto);

    /**
     * 
     * @param roleDto
     * @return
     *     returns org.sepro.authentificationweb.serviceapi.RoleDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
    @RequestWrapper(localName = "updateRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.UpdateRoleServicews")
    @ResponseWrapper(localName = "updateRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.UpdateRoleServicewsResponse")
    public RoleDto updateRoleServicews(
        @WebParam(name = "roleDto", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        RoleDto roleDto);

    /**
     * 
     * @param roleDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.DeleteRoleServicews")
    @ResponseWrapper(localName = "deleteRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.DeleteRoleServicewsResponse")
    public void deleteRoleServicews(
        @WebParam(name = "roleDto", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        RoleDto roleDto);

    /**
     * 
     * @return
     *     returns java.util.List<org.sepro.authentificationweb.serviceapi.RoleDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
    @RequestWrapper(localName = "getAllRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.GetAllRoleServicews")
    @ResponseWrapper(localName = "getAllRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.GetAllRoleServicewsResponse")
    public List<RoleDto> getAllRoleServicews();

    /**
     * 
     * @param pageSize
     * @param page
     * @return
     *     returns java.util.List<org.sepro.authentificationweb.serviceapi.RoleDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
    @RequestWrapper(localName = "getPageAllRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.GetPageAllRoleServicews")
    @ResponseWrapper(localName = "getPageAllRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.GetPageAllRoleServicewsResponse")
    public List<RoleDto> getPageAllRoleServicews(
        @WebParam(name = "page", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        int page,
        @WebParam(name = "pageSize", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        int pageSize);

    /**
     * 
     * @param roleDto
     * @param pageSize
     * @param page
     * @return
     *     returns java.util.List<org.sepro.authentificationweb.serviceapi.RoleDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
    @RequestWrapper(localName = "searchPageRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.SearchPageRoleServicews")
    @ResponseWrapper(localName = "searchPageRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.SearchPageRoleServicewsResponse")
    public List<RoleDto> searchPageRoleServicews(
        @WebParam(name = "roleDto", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        RoleDto roleDto,
        @WebParam(name = "page", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        int page,
        @WebParam(name = "pageSize", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        int pageSize);

    /**
     * 
     * @param roleDto
     * @return
     *     returns org.sepro.authentificationweb.serviceapi.RoleDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
    @RequestWrapper(localName = "createRoleServicews", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.CreateRoleServicews")
    @ResponseWrapper(localName = "createRoleServicewsResponse", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/", className = "org.sepro.authentificationweb.serviceapi.CreateRoleServicewsResponse")
    public RoleDto createRoleServicews(
        @WebParam(name = "roleDto", targetNamespace = "http://serviceapi.authentificationweb.sepro.org/")
        RoleDto roleDto);

}
