
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryStudentPayment allows you to programatically 
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
public class ObjectFactoryStudentPayment {

    private final static QName _UpdateStudentPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentPaymentServicewsResponse");
    private final static QName _CreateStudentPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentPaymentServicews");
    private final static QName _DeleteStudentPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentPaymentServicews");
    private final static QName _DeleteStudentPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteStudentPaymentServicewsResponse");
    private final static QName _SearchStudentPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentPaymentServicewsResponse");
    private final static QName _UpdateStudentPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateStudentPaymentServicews");
    private final static QName _SearchStudentPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchStudentPaymentServicews");
    private final static QName _CreateStudentPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createStudentPaymentServicewsResponse");

    /**
     * Create a new ObjectFactoryStudentPayment that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryStudentPayment() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link CreateStudentPaymentServicewsResponse }
     * 
     */
    public CreateStudentPaymentServicewsResponse createCreateStudentPaymentServicewsResponse() {
        return new CreateStudentPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentPaymentServicews }
     * 
     */
    public SearchStudentPaymentServicews createSearchStudentPaymentServicews() {
        return new SearchStudentPaymentServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentPaymentServicews }
     * 
     */
    public UpdateStudentPaymentServicews createUpdateStudentPaymentServicews() {
        return new UpdateStudentPaymentServicews();
    }

    /**
     * Create an instance of {@link DeleteStudentPaymentServicewsResponse }
     * 
     */
    public DeleteStudentPaymentServicewsResponse createDeleteStudentPaymentServicewsResponse() {
        return new DeleteStudentPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchStudentPaymentServicewsResponse }
     * 
     */
    public SearchStudentPaymentServicewsResponse createSearchStudentPaymentServicewsResponse() {
        return new SearchStudentPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteStudentPaymentServicews }
     * 
     */
    public DeleteStudentPaymentServicews createDeleteStudentPaymentServicews() {
        return new DeleteStudentPaymentServicews();
    }

    /**
     * Create an instance of {@link CreateStudentPaymentServicews }
     * 
     */
    public CreateStudentPaymentServicews createCreateStudentPaymentServicews() {
        return new CreateStudentPaymentServicews();
    }

    /**
     * Create an instance of {@link UpdateStudentPaymentServicewsResponse }
     * 
     */
    public UpdateStudentPaymentServicewsResponse createUpdateStudentPaymentServicewsResponse() {
        return new UpdateStudentPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link StudentPaymentDto }
     * 
     */
    public StudentPaymentDto createStudentPaymentDto() {
        return new StudentPaymentDto();
    }

    /**
     * Create an instance of {@link ClassPaymentDto }
     * 
     */
    public ClassPaymentDto createClassPaymentDto() {
        return new ClassPaymentDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentPaymentServicewsResponse")
    public JAXBElement<UpdateStudentPaymentServicewsResponse> createUpdateStudentPaymentServicewsResponse(UpdateStudentPaymentServicewsResponse value) {
        return new JAXBElement<UpdateStudentPaymentServicewsResponse>(_UpdateStudentPaymentServicewsResponse_QNAME, UpdateStudentPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentPaymentServicews")
    public JAXBElement<CreateStudentPaymentServicews> createCreateStudentPaymentServicews(CreateStudentPaymentServicews value) {
        return new JAXBElement<CreateStudentPaymentServicews>(_CreateStudentPaymentServicews_QNAME, CreateStudentPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentPaymentServicews")
    public JAXBElement<DeleteStudentPaymentServicews> createDeleteStudentPaymentServicews(DeleteStudentPaymentServicews value) {
        return new JAXBElement<DeleteStudentPaymentServicews>(_DeleteStudentPaymentServicews_QNAME, DeleteStudentPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteStudentPaymentServicewsResponse")
    public JAXBElement<DeleteStudentPaymentServicewsResponse> createDeleteStudentPaymentServicewsResponse(DeleteStudentPaymentServicewsResponse value) {
        return new JAXBElement<DeleteStudentPaymentServicewsResponse>(_DeleteStudentPaymentServicewsResponse_QNAME, DeleteStudentPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentPaymentServicewsResponse")
    public JAXBElement<SearchStudentPaymentServicewsResponse> createSearchStudentPaymentServicewsResponse(SearchStudentPaymentServicewsResponse value) {
        return new JAXBElement<SearchStudentPaymentServicewsResponse>(_SearchStudentPaymentServicewsResponse_QNAME, SearchStudentPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateStudentPaymentServicews")
    public JAXBElement<UpdateStudentPaymentServicews> createUpdateStudentPaymentServicews(UpdateStudentPaymentServicews value) {
        return new JAXBElement<UpdateStudentPaymentServicews>(_UpdateStudentPaymentServicews_QNAME, UpdateStudentPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchStudentPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchStudentPaymentServicews")
    public JAXBElement<SearchStudentPaymentServicews> createSearchStudentPaymentServicews(SearchStudentPaymentServicews value) {
        return new JAXBElement<SearchStudentPaymentServicews>(_SearchStudentPaymentServicews_QNAME, SearchStudentPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStudentPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createStudentPaymentServicewsResponse")
    public JAXBElement<CreateStudentPaymentServicewsResponse> createCreateStudentPaymentServicewsResponse(CreateStudentPaymentServicewsResponse value) {
        return new JAXBElement<CreateStudentPaymentServicewsResponse>(_CreateStudentPaymentServicewsResponse_QNAME, CreateStudentPaymentServicewsResponse.class, null, value);
    }

}
