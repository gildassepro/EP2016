
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentProgram allows you to programatically 
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
public class ObjectFactoryStudentProgram {

    private final static QName _SearchStudentProgramDtoServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "SearchStudentProgramDtoServicews");
    private final static QName _SearchStudentProgramDtoServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "SearchStudentProgramDtoServicewsResponse");

    /**
     * Create a new ObjectFactoryStudentProgram that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentProgram() {
    }

    /**
     * Create an instance of {@link SearchStudentProgramDtoServicewsResponse }
     * 
     */
    public SearchStudentProgramDtoServicewsResponse createSearchStudentProgramDtoServicewsResponse() {
        return new SearchStudentProgramDtoServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentProgramDtoServicews }
     * 
     */
    public SearchStudentProgramDtoServicews createSearchStudentProgramDtoServicews() {
        return new SearchStudentProgramDtoServicews();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link StudentProgramDto }
     * 
     */
    public StudentProgramDto createStudentProgramDto() {
        return new StudentProgramDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentProgramDtoServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "SearchStudentProgramDtoServicews")
    public JAXBElement<SearchStudentProgramDtoServicews> createSearchStudentProgramDtoServicews(SearchStudentProgramDtoServicews value) {
        return new JAXBElement<SearchStudentProgramDtoServicews>(_SearchStudentProgramDtoServicews_QNAME, SearchStudentProgramDtoServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentProgramDtoServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "SearchStudentProgramDtoServicewsResponse")
    public JAXBElement<SearchStudentProgramDtoServicewsResponse> createSearchStudentProgramDtoServicewsResponse(SearchStudentProgramDtoServicewsResponse value) {
        return new JAXBElement<SearchStudentProgramDtoServicewsResponse>(_SearchStudentProgramDtoServicewsResponse_QNAME, SearchStudentProgramDtoServicewsResponse.class, null, value);
    }

}
