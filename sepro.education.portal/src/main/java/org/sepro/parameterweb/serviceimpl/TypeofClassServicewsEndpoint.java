
package org.sepro.parameterweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.parameterweb.serviceapi.ObjectFactoryTypeofClass;
import org.sepro.parameterweb.serviceapi.TypeofClassDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TypeofClassServicewsEndpoint", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
@XmlSeeAlso({
    ObjectFactoryTypeofClass.class
})
public interface TypeofClassServicewsEndpoint {


    /**
     * 
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.TypeofClassDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "getAllTypeofClassServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllTypeofClassServicews")
    @ResponseWrapper(localName = "getAllTypeofClassServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllTypeofClassServicewsResponse")
    public List<TypeofClassDto> getAllTypeofClassServicews();

}
