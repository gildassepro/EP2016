
package org.sepro.parameterweb.serviceimpl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.ObjectFactoryCountry;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CountryServicewsEndpoint", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
@XmlSeeAlso({
    ObjectFactoryCountry.class
})
public interface CountryServicewsEndpoint {


    /**
     * 
     * @param countryDto
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCountryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.DeleteCountryServicews")
    @ResponseWrapper(localName = "deleteCountryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.DeleteCountryServicewsResponse")
    public void deleteCountryServicews(
        @WebParam(name = "countryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CountryDto countryDto);

    /**
     * 
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.CountryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "getAllCountryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllCountryServicews")
    @ResponseWrapper(localName = "getAllCountryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetAllCountryServicewsResponse")
    public List<CountryDto> getAllCountryServicews();

    /**
     * 
     * @param countryDto
     * @return
     *     returns org.sepro.parameterweb.serviceapi.CountryDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "updateCountyServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.UpdateCountyServicews")
    @ResponseWrapper(localName = "updateCountyServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.UpdateCountyServicewsResponse")
    public CountryDto updateCountyServicews(
        @WebParam(name = "countryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CountryDto countryDto);

    /**
     * 
     * @param countryDto
     * @param pageSize
     * @param page
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.CountryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "searchPageCountryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchPageCountryServicews")
    @ResponseWrapper(localName = "searchPageCountryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchPageCountryServicewsResponse")
    public List<CountryDto> searchPageCountryServicews(
        @WebParam(name = "countryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CountryDto countryDto,
        @WebParam(name = "page", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int page,
        @WebParam(name = "pageSize", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int pageSize);

    /**
     * 
     * @param pageSize
     * @param page
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.CountryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "getPageAllCountryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetPageAllCountryServicews")
    @ResponseWrapper(localName = "getPageAllCountryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.GetPageAllCountryServicewsResponse")
    public List<CountryDto> getPageAllCountryServicews(
        @WebParam(name = "page", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int page,
        @WebParam(name = "pageSize", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        int pageSize);

    /**
     * 
     * @param countryDto
     * @return
     *     returns org.sepro.parameterweb.serviceapi.CountryDto
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "createCountryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.CreateCountryServicews")
    @ResponseWrapper(localName = "createCountryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.CreateCountryServicewsResponse")
    public CountryDto createCountryServicews(
        @WebParam(name = "countryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CountryDto countryDto);

    /**
     * 
     * @param countryDto
     * @return
     *     returns java.util.List<org.sepro.parameterweb.serviceapi.CountryDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
    @RequestWrapper(localName = "searchCountryServicews", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchCountryServicews")
    @ResponseWrapper(localName = "searchCountryServicewsResponse", targetNamespace = "http://serviceapi.parameterweb.sepro.org/", className = "org.sepro.parameterweb.serviceapi.SearchCountryServicewsResponse")
    public List<CountryDto> searchCountryServicews(
        @WebParam(name = "countryDto", targetNamespace = "http://serviceapi.parameterweb.sepro.org/")
        CountryDto countryDto);

}
