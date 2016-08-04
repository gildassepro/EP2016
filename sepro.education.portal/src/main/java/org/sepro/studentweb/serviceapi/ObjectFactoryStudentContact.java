
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentContact allows you to programatically 
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
public class ObjectFactoryStudentContact {

    private final static QName _CreateStudentContactServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentContactServicews");
    private final static QName _DeleteStudentContactServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentContactServicews");
    private final static QName _SearchStudentContactServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentContactServicews");
    private final static QName _UpdateStudentContactServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentContactServicewsResponse");
    private final static QName _UpdateStudentContactServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentContactServicews");
    private final static QName _CreateStudentContactServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentContactServicewsResponse");
    private final static QName _SearchStudentContactServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentContactServicewsResponse");
    private final static QName _DeleteStudentContactServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentContactServicewsResponse");

    /**
     * Create a new ObjectFactoryStudentContact that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentContact() {
    }

    /**
     * Create an instance of {@link DeleteStudentContactServicewsResponse }
     * 
     */
    public DeleteStudentContactServicewsResponse createDeleteStudentContactServicewsResponse() {
        return new DeleteStudentContactServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentContactServicewsResponse }
     * 
     */
    public SearchStudentContactServicewsResponse createSearchStudentContactServicewsResponse() {
        return new SearchStudentContactServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateStudentContactServicewsResponse }
     * 
     */
    public CreateStudentContactServicewsResponse createCreateStudentContactServicewsResponse() {
        return new CreateStudentContactServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateStudentContactServicews }
     * 
     */
    public UpdateStudentContactServicews createUpdateStudentContactServicews() {
        return new UpdateStudentContactServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentContactServicewsResponse }
     * 
     */
    public UpdateStudentContactServicewsResponse createUpdateStudentContactServicewsResponse() {
        return new UpdateStudentContactServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentContactServicews }
     * 
     */
    public SearchStudentContactServicews createSearchStudentContactServicews() {
        return new SearchStudentContactServicews();
    }

    /**
     * Create an instance of {@link CreateStudentContactServicews }
     * 
     */
    public CreateStudentContactServicews createCreateStudentContactServicews() {
        return new CreateStudentContactServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentContactServicews }
     * 
     */
    public DeleteStudentContactServicews createDeleteStudentContactServicews() {
        return new DeleteStudentContactServicews();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link StudentContactDto }
     * 
     */
    public StudentContactDto createStudentContactDto() {
        return new StudentContactDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentContactServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentContactServicews")
    public JAXBElement<CreateStudentContactServicews> createCreateStudentContactServicews(CreateStudentContactServicews value) {
        return new JAXBElement<CreateStudentContactServicews>(_CreateStudentContactServicews_QNAME, CreateStudentContactServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentContactServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentContactServicews")
    public JAXBElement<DeleteStudentContactServicews> createDeleteStudentContactServicews(DeleteStudentContactServicews value) {
        return new JAXBElement<DeleteStudentContactServicews>(_DeleteStudentContactServicews_QNAME, DeleteStudentContactServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentContactServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentContactServicews")
    public JAXBElement<SearchStudentContactServicews> createSearchStudentContactServicews(SearchStudentContactServicews value) {
        return new JAXBElement<SearchStudentContactServicews>(_SearchStudentContactServicews_QNAME, SearchStudentContactServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentContactServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentContactServicewsResponse")
    public JAXBElement<UpdateStudentContactServicewsResponse> createUpdateStudentContactServicewsResponse(UpdateStudentContactServicewsResponse value) {
        return new JAXBElement<UpdateStudentContactServicewsResponse>(_UpdateStudentContactServicewsResponse_QNAME, UpdateStudentContactServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentContactServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentContactServicews")
    public JAXBElement<UpdateStudentContactServicews> createUpdateStudentContactServicews(UpdateStudentContactServicews value) {
        return new JAXBElement<UpdateStudentContactServicews>(_UpdateStudentContactServicews_QNAME, UpdateStudentContactServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentContactServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentContactServicewsResponse")
    public JAXBElement<CreateStudentContactServicewsResponse> createCreateStudentContactServicewsResponse(CreateStudentContactServicewsResponse value) {
        return new JAXBElement<CreateStudentContactServicewsResponse>(_CreateStudentContactServicewsResponse_QNAME, CreateStudentContactServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentContactServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentContactServicewsResponse")
    public JAXBElement<SearchStudentContactServicewsResponse> createSearchStudentContactServicewsResponse(SearchStudentContactServicewsResponse value) {
        return new JAXBElement<SearchStudentContactServicewsResponse>(_SearchStudentContactServicewsResponse_QNAME, SearchStudentContactServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentContactServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentContactServicewsResponse")
    public JAXBElement<DeleteStudentContactServicewsResponse> createDeleteStudentContactServicewsResponse(DeleteStudentContactServicewsResponse value) {
        return new JAXBElement<DeleteStudentContactServicewsResponse>(_DeleteStudentContactServicewsResponse_QNAME, DeleteStudentContactServicewsResponse.class, null, value);
    }

}
