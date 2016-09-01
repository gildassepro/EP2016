
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentClasse allows you to programatically 
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
public class ObjectFactoryStudentClasse {

    private final static QName _CreateStudentClasseServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentClasseServicews");
    private final static QName _DeleteStudentClasseServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentClasseServicews");
    private final static QName _CreateStudentClasseServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentClasseServicewsResponse");
    private final static QName _SearchStudentClasseServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentClasseServicewsResponse");
    private final static QName _SearchStudentClasseServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentClasseServicews");
    private final static QName _DeleteStudentClasseServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentClasseServicewsResponse");

    /**
     * Create a new ObjectFactoryStudentClasse that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentClasse() {
    }

    /**
     * Create an instance of {@link DeleteStudentClasseServicewsResponse }
     * 
     */
    public DeleteStudentClasseServicewsResponse createDeleteStudentClasseServicewsResponse() {
        return new DeleteStudentClasseServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentClasseServicews }
     * 
     */
    public SearchStudentClasseServicews createSearchStudentClasseServicews() {
        return new SearchStudentClasseServicews();
    }

    /**
     * Create an instance of {@link CreateStudentClasseServicewsResponse }
     * 
     */
    public CreateStudentClasseServicewsResponse createCreateStudentClasseServicewsResponse() {
        return new CreateStudentClasseServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentClasseServicewsResponse }
     * 
     */
    public SearchStudentClasseServicewsResponse createSearchStudentClasseServicewsResponse() {
        return new SearchStudentClasseServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentClasseServicews }
     * 
     */
    public DeleteStudentClasseServicews createDeleteStudentClasseServicews() {
        return new DeleteStudentClasseServicews();
    }

    /**
     * Create an instance of {@link CreateStudentClasseServicews }
     * 
     */
    public CreateStudentClasseServicews createCreateStudentClasseServicews() {
        return new CreateStudentClasseServicews();
    }

    /**
     * Create an instance of {@link StudentClasseDto }
     * 
     */
    public StudentClasseDto createStudentClasseDto() {
        return new StudentClasseDto();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentClasseServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentClasseServicews")
    public JAXBElement<CreateStudentClasseServicews> createCreateStudentClasseServicews(CreateStudentClasseServicews value) {
        return new JAXBElement<CreateStudentClasseServicews>(_CreateStudentClasseServicews_QNAME, CreateStudentClasseServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentClasseServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentClasseServicews")
    public JAXBElement<DeleteStudentClasseServicews> createDeleteStudentClasseServicews(DeleteStudentClasseServicews value) {
        return new JAXBElement<DeleteStudentClasseServicews>(_DeleteStudentClasseServicews_QNAME, DeleteStudentClasseServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentClasseServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentClasseServicewsResponse")
    public JAXBElement<CreateStudentClasseServicewsResponse> createCreateStudentClasseServicewsResponse(CreateStudentClasseServicewsResponse value) {
        return new JAXBElement<CreateStudentClasseServicewsResponse>(_CreateStudentClasseServicewsResponse_QNAME, CreateStudentClasseServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentClasseServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentClasseServicewsResponse")
    public JAXBElement<SearchStudentClasseServicewsResponse> createSearchStudentClasseServicewsResponse(SearchStudentClasseServicewsResponse value) {
        return new JAXBElement<SearchStudentClasseServicewsResponse>(_SearchStudentClasseServicewsResponse_QNAME, SearchStudentClasseServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentClasseServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentClasseServicews")
    public JAXBElement<SearchStudentClasseServicews> createSearchStudentClasseServicews(SearchStudentClasseServicews value) {
        return new JAXBElement<SearchStudentClasseServicews>(_SearchStudentClasseServicews_QNAME, SearchStudentClasseServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentClasseServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentClasseServicewsResponse")
    public JAXBElement<DeleteStudentClasseServicewsResponse> createDeleteStudentClasseServicewsResponse(DeleteStudentClasseServicewsResponse value) {
        return new JAXBElement<DeleteStudentClasseServicewsResponse>(_DeleteStudentClasseServicewsResponse_QNAME, DeleteStudentClasseServicewsResponse.class, null, value);
    }

}
