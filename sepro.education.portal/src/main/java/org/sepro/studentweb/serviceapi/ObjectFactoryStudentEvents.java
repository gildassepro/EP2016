
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentEvents allows you to programatically 
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
public class ObjectFactoryStudentEvents {

    private final static QName _CreateStudentEventsServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentEventsServicews");
    private final static QName _UpdateStudentEventsServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentEventsServicewsResponse");
    private final static QName _DeleteStudentEventsServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentEventsServicewsResponse");
    private final static QName _UpdateStudentEventsServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentEventsServicews");
    private final static QName _DeleteStudentEventsServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentEventsServicews");
    private final static QName _CreateStudentEventsServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentEventsServicewsResponse");
    private final static QName _SearchStudentEventsServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentEventsServicewsResponse");
    private final static QName _SearchStudentEventsServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentEventsServicews");

    /**
     * Create a new ObjectFactoryStudentEvents that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentEvents() {
    }

    /**
     * Create an instance of {@link SearchStudentEventsServicews }
     * 
     */
    public SearchStudentEventsServicews createSearchStudentEventsServicews() {
        return new SearchStudentEventsServicews();
    }

    /**
     * Create an instance of {@link CreateStudentEventsServicewsResponse }
     * 
     */
    public CreateStudentEventsServicewsResponse createCreateStudentEventsServicewsResponse() {
        return new CreateStudentEventsServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentEventsServicewsResponse }
     * 
     */
    public SearchStudentEventsServicewsResponse createSearchStudentEventsServicewsResponse() {
        return new SearchStudentEventsServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentEventsServicews }
     * 
     */
    public DeleteStudentEventsServicews createDeleteStudentEventsServicews() {
        return new DeleteStudentEventsServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentEventsServicews }
     * 
     */
    public UpdateStudentEventsServicews createUpdateStudentEventsServicews() {
        return new UpdateStudentEventsServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentEventsServicewsResponse }
     * 
     */
    public DeleteStudentEventsServicewsResponse createDeleteStudentEventsServicewsResponse() {
        return new DeleteStudentEventsServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateStudentEventsServicews }
     * 
     */
    public CreateStudentEventsServicews createCreateStudentEventsServicews() {
        return new CreateStudentEventsServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentEventsServicewsResponse }
     * 
     */
    public UpdateStudentEventsServicewsResponse createUpdateStudentEventsServicewsResponse() {
        return new UpdateStudentEventsServicewsResponse();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link StudentEventsDto }
     * 
     */
    public StudentEventsDto createStudentEventsDto() {
        return new StudentEventsDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentEventsServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentEventsServicews")
    public JAXBElement<CreateStudentEventsServicews> createCreateStudentEventsServicews(CreateStudentEventsServicews value) {
        return new JAXBElement<CreateStudentEventsServicews>(_CreateStudentEventsServicews_QNAME, CreateStudentEventsServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentEventsServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentEventsServicewsResponse")
    public JAXBElement<UpdateStudentEventsServicewsResponse> createUpdateStudentEventsServicewsResponse(UpdateStudentEventsServicewsResponse value) {
        return new JAXBElement<UpdateStudentEventsServicewsResponse>(_UpdateStudentEventsServicewsResponse_QNAME, UpdateStudentEventsServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentEventsServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentEventsServicewsResponse")
    public JAXBElement<DeleteStudentEventsServicewsResponse> createDeleteStudentEventsServicewsResponse(DeleteStudentEventsServicewsResponse value) {
        return new JAXBElement<DeleteStudentEventsServicewsResponse>(_DeleteStudentEventsServicewsResponse_QNAME, DeleteStudentEventsServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentEventsServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentEventsServicews")
    public JAXBElement<UpdateStudentEventsServicews> createUpdateStudentEventsServicews(UpdateStudentEventsServicews value) {
        return new JAXBElement<UpdateStudentEventsServicews>(_UpdateStudentEventsServicews_QNAME, UpdateStudentEventsServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentEventsServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentEventsServicews")
    public JAXBElement<DeleteStudentEventsServicews> createDeleteStudentEventsServicews(DeleteStudentEventsServicews value) {
        return new JAXBElement<DeleteStudentEventsServicews>(_DeleteStudentEventsServicews_QNAME, DeleteStudentEventsServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentEventsServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentEventsServicewsResponse")
    public JAXBElement<CreateStudentEventsServicewsResponse> createCreateStudentEventsServicewsResponse(CreateStudentEventsServicewsResponse value) {
        return new JAXBElement<CreateStudentEventsServicewsResponse>(_CreateStudentEventsServicewsResponse_QNAME, CreateStudentEventsServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentEventsServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentEventsServicewsResponse")
    public JAXBElement<SearchStudentEventsServicewsResponse> createSearchStudentEventsServicewsResponse(SearchStudentEventsServicewsResponse value) {
        return new JAXBElement<SearchStudentEventsServicewsResponse>(_SearchStudentEventsServicewsResponse_QNAME, SearchStudentEventsServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentEventsServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentEventsServicews")
    public JAXBElement<SearchStudentEventsServicews> createSearchStudentEventsServicews(SearchStudentEventsServicews value) {
        return new JAXBElement<SearchStudentEventsServicews>(_SearchStudentEventsServicews_QNAME, SearchStudentEventsServicews.class, null, value);
    }

}
