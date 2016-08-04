
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudent allows you to programatically 
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
public class ObjectFactoryStudent {

    private final static QName _UpdateStudentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentServicews");
    private final static QName _DeleteStudentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentServicews");
    private final static QName _DeleteStudentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentServicewsResponse");
    private final static QName _UpdateStudentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentServicewsResponse");
    private final static QName _CreateStudentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentServicews");
    private final static QName _CreateStudentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentServicewsResponse");
    private final static QName _SearchStudentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentServicewsResponse");
    private final static QName _SearchStudentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentServicews");

    /**
     * Create a new ObjectFactoryStudent that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudent() {
    }

    /**
     * Create an instance of {@link SearchStudentServicews }
     * 
     */
    public SearchStudentServicews createSearchStudentServicews() {
        return new SearchStudentServicews();
    }

    /**
     * Create an instance of {@link CreateStudentServicewsResponse }
     * 
     */
    public CreateStudentServicewsResponse createCreateStudentServicewsResponse() {
        return new CreateStudentServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentServicewsResponse }
     * 
     */
    public SearchStudentServicewsResponse createSearchStudentServicewsResponse() {
        return new SearchStudentServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateStudentServicews }
     * 
     */
    public CreateStudentServicews createCreateStudentServicews() {
        return new CreateStudentServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentServicewsResponse }
     * 
     */
    public UpdateStudentServicewsResponse createUpdateStudentServicewsResponse() {
        return new UpdateStudentServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentServicews }
     * 
     */
    public DeleteStudentServicews createDeleteStudentServicews() {
        return new DeleteStudentServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentServicewsResponse }
     * 
     */
    public DeleteStudentServicewsResponse createDeleteStudentServicewsResponse() {
        return new DeleteStudentServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateStudentServicews }
     * 
     */
    public UpdateStudentServicews createUpdateStudentServicews() {
        return new UpdateStudentServicews();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentServicews")
    public JAXBElement<UpdateStudentServicews> createUpdateStudentServicews(UpdateStudentServicews value) {
        return new JAXBElement<UpdateStudentServicews>(_UpdateStudentServicews_QNAME, UpdateStudentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentServicews")
    public JAXBElement<DeleteStudentServicews> createDeleteStudentServicews(DeleteStudentServicews value) {
        return new JAXBElement<DeleteStudentServicews>(_DeleteStudentServicews_QNAME, DeleteStudentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentServicewsResponse")
    public JAXBElement<DeleteStudentServicewsResponse> createDeleteStudentServicewsResponse(DeleteStudentServicewsResponse value) {
        return new JAXBElement<DeleteStudentServicewsResponse>(_DeleteStudentServicewsResponse_QNAME, DeleteStudentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentServicewsResponse")
    public JAXBElement<UpdateStudentServicewsResponse> createUpdateStudentServicewsResponse(UpdateStudentServicewsResponse value) {
        return new JAXBElement<UpdateStudentServicewsResponse>(_UpdateStudentServicewsResponse_QNAME, UpdateStudentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentServicews")
    public JAXBElement<CreateStudentServicews> createCreateStudentServicews(CreateStudentServicews value) {
        return new JAXBElement<CreateStudentServicews>(_CreateStudentServicews_QNAME, CreateStudentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentServicewsResponse")
    public JAXBElement<CreateStudentServicewsResponse> createCreateStudentServicewsResponse(CreateStudentServicewsResponse value) {
        return new JAXBElement<CreateStudentServicewsResponse>(_CreateStudentServicewsResponse_QNAME, CreateStudentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentServicewsResponse")
    public JAXBElement<SearchStudentServicewsResponse> createSearchStudentServicewsResponse(SearchStudentServicewsResponse value) {
        return new JAXBElement<SearchStudentServicewsResponse>(_SearchStudentServicewsResponse_QNAME, SearchStudentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentServicews")
    public JAXBElement<SearchStudentServicews> createSearchStudentServicews(SearchStudentServicews value) {
        return new JAXBElement<SearchStudentServicews>(_SearchStudentServicews_QNAME, SearchStudentServicews.class, null, value);
    }

}
