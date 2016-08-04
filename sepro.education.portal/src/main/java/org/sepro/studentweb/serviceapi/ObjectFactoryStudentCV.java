
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentCV allows you to programatically 
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
public class ObjectFactoryStudentCV {

    private final static QName _SearchStudentCVServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentCVServicewsResponse");
    private final static QName _DeleteStudentCVServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentCVServicews");
    private final static QName _SearchStudentCVServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentCVServicews");
    private final static QName _DeleteStudentCVServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentCVServicewsResponse");
    private final static QName _UpdateStudentCVServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentCVServicewsResponse");
    private final static QName _CreateStudentCVServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentCVServicews");
    private final static QName _UpdateStudentCVServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentCVServicews");
    private final static QName _CreateStudentCVServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentCVServicewsResponse");

    /**
     * Create a new ObjectFactoryStudentCV that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentCV() {
    }

    /**
     * Create an instance of {@link CreateStudentCVServicewsResponse }
     * 
     */
    public CreateStudentCVServicewsResponse createCreateStudentCVServicewsResponse() {
        return new CreateStudentCVServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateStudentCVServicews }
     * 
     */
    public CreateStudentCVServicews createCreateStudentCVServicews() {
        return new CreateStudentCVServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentCVServicews }
     * 
     */
    public UpdateStudentCVServicews createUpdateStudentCVServicews() {
        return new UpdateStudentCVServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentCVServicewsResponse }
     * 
     */
    public UpdateStudentCVServicewsResponse createUpdateStudentCVServicewsResponse() {
        return new UpdateStudentCVServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentCVServicewsResponse }
     * 
     */
    public DeleteStudentCVServicewsResponse createDeleteStudentCVServicewsResponse() {
        return new DeleteStudentCVServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentCVServicews }
     * 
     */
    public SearchStudentCVServicews createSearchStudentCVServicews() {
        return new SearchStudentCVServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentCVServicews }
     * 
     */
    public DeleteStudentCVServicews createDeleteStudentCVServicews() {
        return new DeleteStudentCVServicews();
    }

    /**
     * Create an instance of {@link SearchStudentCVServicewsResponse }
     * 
     */
    public SearchStudentCVServicewsResponse createSearchStudentCVServicewsResponse() {
        return new SearchStudentCVServicewsResponse();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link StudentCVDto }
     * 
     */
    public StudentCVDto createStudentCVDto() {
        return new StudentCVDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentCVServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentCVServicewsResponse")
    public JAXBElement<SearchStudentCVServicewsResponse> createSearchStudentCVServicewsResponse(SearchStudentCVServicewsResponse value) {
        return new JAXBElement<SearchStudentCVServicewsResponse>(_SearchStudentCVServicewsResponse_QNAME, SearchStudentCVServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentCVServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentCVServicews")
    public JAXBElement<DeleteStudentCVServicews> createDeleteStudentCVServicews(DeleteStudentCVServicews value) {
        return new JAXBElement<DeleteStudentCVServicews>(_DeleteStudentCVServicews_QNAME, DeleteStudentCVServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentCVServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentCVServicews")
    public JAXBElement<SearchStudentCVServicews> createSearchStudentCVServicews(SearchStudentCVServicews value) {
        return new JAXBElement<SearchStudentCVServicews>(_SearchStudentCVServicews_QNAME, SearchStudentCVServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentCVServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentCVServicewsResponse")
    public JAXBElement<DeleteStudentCVServicewsResponse> createDeleteStudentCVServicewsResponse(DeleteStudentCVServicewsResponse value) {
        return new JAXBElement<DeleteStudentCVServicewsResponse>(_DeleteStudentCVServicewsResponse_QNAME, DeleteStudentCVServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentCVServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentCVServicewsResponse")
    public JAXBElement<UpdateStudentCVServicewsResponse> createUpdateStudentCVServicewsResponse(UpdateStudentCVServicewsResponse value) {
        return new JAXBElement<UpdateStudentCVServicewsResponse>(_UpdateStudentCVServicewsResponse_QNAME, UpdateStudentCVServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentCVServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentCVServicews")
    public JAXBElement<CreateStudentCVServicews> createCreateStudentCVServicews(CreateStudentCVServicews value) {
        return new JAXBElement<CreateStudentCVServicews>(_CreateStudentCVServicews_QNAME, CreateStudentCVServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentCVServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentCVServicews")
    public JAXBElement<UpdateStudentCVServicews> createUpdateStudentCVServicews(UpdateStudentCVServicews value) {
        return new JAXBElement<UpdateStudentCVServicews>(_UpdateStudentCVServicews_QNAME, UpdateStudentCVServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentCVServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentCVServicewsResponse")
    public JAXBElement<CreateStudentCVServicewsResponse> createCreateStudentCVServicewsResponse(CreateStudentCVServicewsResponse value) {
        return new JAXBElement<CreateStudentCVServicewsResponse>(_CreateStudentCVServicewsResponse_QNAME, CreateStudentCVServicewsResponse.class, null, value);
    }

}
