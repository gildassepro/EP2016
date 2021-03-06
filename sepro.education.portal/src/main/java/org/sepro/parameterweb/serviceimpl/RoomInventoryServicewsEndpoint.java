
package org.sepro.parameterweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.parameterweb.serviceapi.ObjectFactoryRoomInventory;
import org.sepro.parameterweb.serviceapi.RoomInventoryDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RoomInventoryServicewsEndpoint", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
@XmlSeeAlso({
    ObjectFactoryRoomInventory.class
})
public interface RoomInventoryServicewsEndpoint {


    /**
     * 
     * @param roomInventoryDto
     * @return
     *     returns org.sepro.parameterweb.serviceapi.RoomInventoryDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "createRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.CreateRoomInventoryServicews")
    @ResponseWrapper(localName = "createRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.CreateRoomInventoryServicewsResponse")
    public RoomInventoryDto createRoomInventoryServicews(
        @WebParam(name = "roomInventoryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        RoomInventoryDto roomInventoryDto);

    /**
     * 
     * @param pageSize
     * @param page
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.RoomInventoryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "getPageAllRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetPageAllRoomInventoryServicews")
    @ResponseWrapper(localName = "getPageAllRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetPageAllRoomInventoryServicewsResponse")
    public List<RoomInventoryDto> getPageAllRoomInventoryServicews(
        @WebParam(name = "page", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int page,
        @WebParam(name = "pageSize", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int pageSize);

    /**
     * 
     * @param roomInventoryDto
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.RoomInventoryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "searchRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchRoomInventoryServicews")
    @ResponseWrapper(localName = "searchRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchRoomInventoryServicewsResponse")
    public List<RoomInventoryDto> searchRoomInventoryServicews(
        @WebParam(name = "roomInventoryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        RoomInventoryDto roomInventoryDto);

    /**
     * 
     * @param roomInventoryDto
     * @return
     *     returns org.sepro.parameterweb.serviceapi.RoomInventoryDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "updateRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.UpdateRoomInventoryServicews")
    @ResponseWrapper(localName = "updateRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.UpdateRoomInventoryServicewsResponse")
    public RoomInventoryDto updateRoomInventoryServicews(
        @WebParam(name = "roomInventoryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        RoomInventoryDto roomInventoryDto);

    /**
     * 
     * @param roomInventoryDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.DeleteRoomInventoryServicews")
    @ResponseWrapper(localName = "deleteRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.DeleteRoomInventoryServicewsResponse")
    public void deleteRoomInventoryServicews(
        @WebParam(name = "roomInventoryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        RoomInventoryDto roomInventoryDto);

    /**
     * 
     * @param roomInventoryDto
     * @param pageSize
     * @param page
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.RoomInventoryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "searchPageRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchPageRoomInventoryServicews")
    @ResponseWrapper(localName = "searchPageRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchPageRoomInventoryServicewsResponse")
    public List<RoomInventoryDto> searchPageRoomInventoryServicews(
        @WebParam(name = "roomInventoryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        RoomInventoryDto roomInventoryDto,
        @WebParam(name = "page", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int page,
        @WebParam(name = "pageSize", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int pageSize);

    /**
     * 
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.RoomInventoryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "getAllRoomInventoryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllRoomInventoryServicews")
    @ResponseWrapper(localName = "getAllRoomInventoryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllRoomInventoryServicewsResponse")
    public List<RoomInventoryDto> getAllRoomInventoryServicews();

}
