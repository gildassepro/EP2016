
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentDataDto allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactoryStudentDataDto {

    private final static QName _SearchStudentDataDtoServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "SearchStudentDataDtoServicewsResponse");
    private final static QName _SearchStudentDataDtoServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "SearchStudentDataDtoServicews");

    /**
     * Create a new ObjectFactoryStudentDataDto that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentDataDto() {
    }

    /**
     * Create an instance of {@link StudentDataDto }
     * 
     */
    public StudentDataDto createStudentDataDto() {
        return new StudentDataDto();
    }

    /**
     * Create an instance of {@link SearchStudentDataDtoServicews }
     * 
     */
    public SearchStudentDataDtoServicews createSearchStudentDataDtoServicews() {
        return new SearchStudentDataDtoServicews();
    }

    /**
     * Create an instance of {@link SearchStudentDataDtoServicewsResponse }
     * 
     */
    public SearchStudentDataDtoServicewsResponse createSearchStudentDataDtoServicewsResponse() {
        return new SearchStudentDataDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link org.sepro.studentweb.serviceapi.StudentCVDto }
     * 
     */
    public org.sepro.studentweb.serviceapi.StudentCVDto createStudentCVDto() {
        return new org.sepro.studentweb.serviceapi.StudentCVDto();
    }

    /**
     * Create an instance of {@link org.sepro.studentweb.serviceapi.StudentContactDto }
     * 
     */
    public org.sepro.studentweb.serviceapi.StudentContactDto createStudentContactDto() {
        return new org.sepro.studentweb.serviceapi.StudentContactDto();
    }

    /**
     * Create an instance of {@link StudentDataDto.StudentCVDto }
     * 
     */
    public StudentDataDto.StudentCVDto createStudentDataDtoStudentCVDto() {
        return new StudentDataDto.StudentCVDto();
    }

    /**
     * Create an instance of {@link StudentDataDto.StudentContactDto }
     * 
     */
    public StudentDataDto.StudentContactDto createStudentDataDtoStudentContactDto() {
        return new StudentDataDto.StudentContactDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentDataDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "SearchStudentDataDtoServicewsResponse")
    public JAXBElement<SearchStudentDataDtoServicewsResponse> createSearchStudentDataDtoServicewsResponse(SearchStudentDataDtoServicewsResponse value) {
        return new JAXBElement<SearchStudentDataDtoServicewsResponse>(_SearchStudentDataDtoServicewsResponse_QNAME, SearchStudentDataDtoServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentDataDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "SearchStudentDataDtoServicews")
    public JAXBElement<SearchStudentDataDtoServicews> createSearchStudentDataDtoServicews(SearchStudentDataDtoServicews value) {
        return new JAXBElement<SearchStudentDataDtoServicews>(_SearchStudentDataDtoServicews_QNAME, SearchStudentDataDtoServicews.class, null, value);
    }

}
