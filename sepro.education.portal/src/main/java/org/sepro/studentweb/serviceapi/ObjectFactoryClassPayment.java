
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryClassPayment allows you to programatically 
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
public class ObjectFactoryClassPayment {

    private final static QName _SearchClassPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchClassPaymentServicewsResponse");
    private final static QName _UpdateClassPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateClassPaymentServicewsResponse");
    private final static QName _SearchClassPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchClassPaymentServicews");
    private final static QName _CreateClassPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createClassPaymentServicews");
    private final static QName _DeleteClassPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteClassPaymentServicewsResponse");
    private final static QName _DeleteClassPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteClassPaymentServicews");
    private final static QName _CreateClassPaymentServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createClassPaymentServicewsResponse");
    private final static QName _UpdateClassPaymentServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateClassPaymentServicews");

    /**
     * Create a new ObjectFactoryClassPayment that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryClassPayment() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link UpdateClassPaymentServicews }
     * 
     */
    public UpdateClassPaymentServicews createUpdateClassPaymentServicews() {
        return new UpdateClassPaymentServicews();
    }

    /**
     * Create an instance of {@link CreateClassPaymentServicewsResponse }
     * 
     */
    public CreateClassPaymentServicewsResponse createCreateClassPaymentServicewsResponse() {
        return new CreateClassPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteClassPaymentServicews }
     * 
     */
    public DeleteClassPaymentServicews createDeleteClassPaymentServicews() {
        return new DeleteClassPaymentServicews();
    }

    /**
     * Create an instance of {@link CreateClassPaymentServicews }
     * 
     */
    public CreateClassPaymentServicews createCreateClassPaymentServicews() {
        return new CreateClassPaymentServicews();
    }

    /**
     * Create an instance of {@link DeleteClassPaymentServicewsResponse }
     * 
     */
    public DeleteClassPaymentServicewsResponse createDeleteClassPaymentServicewsResponse() {
        return new DeleteClassPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchClassPaymentServicews }
     * 
     */
    public SearchClassPaymentServicews createSearchClassPaymentServicews() {
        return new SearchClassPaymentServicews();
    }

    /**
     * Create an instance of {@link UpdateClassPaymentServicewsResponse }
     * 
     */
    public UpdateClassPaymentServicewsResponse createUpdateClassPaymentServicewsResponse() {
        return new UpdateClassPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchClassPaymentServicewsResponse }
     * 
     */
    public SearchClassPaymentServicewsResponse createSearchClassPaymentServicewsResponse() {
        return new SearchClassPaymentServicewsResponse();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClassPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchClassPaymentServicewsResponse")
    public JAXBElement<SearchClassPaymentServicewsResponse> createSearchClassPaymentServicewsResponse(SearchClassPaymentServicewsResponse value) {
        return new JAXBElement<SearchClassPaymentServicewsResponse>(_SearchClassPaymentServicewsResponse_QNAME, SearchClassPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClassPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateClassPaymentServicewsResponse")
    public JAXBElement<UpdateClassPaymentServicewsResponse> createUpdateClassPaymentServicewsResponse(UpdateClassPaymentServicewsResponse value) {
        return new JAXBElement<UpdateClassPaymentServicewsResponse>(_UpdateClassPaymentServicewsResponse_QNAME, UpdateClassPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClassPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchClassPaymentServicews")
    public JAXBElement<SearchClassPaymentServicews> createSearchClassPaymentServicews(SearchClassPaymentServicews value) {
        return new JAXBElement<SearchClassPaymentServicews>(_SearchClassPaymentServicews_QNAME, SearchClassPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClassPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createClassPaymentServicews")
    public JAXBElement<CreateClassPaymentServicews> createCreateClassPaymentServicews(CreateClassPaymentServicews value) {
        return new JAXBElement<CreateClassPaymentServicews>(_CreateClassPaymentServicews_QNAME, CreateClassPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClassPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteClassPaymentServicewsResponse")
    public JAXBElement<DeleteClassPaymentServicewsResponse> createDeleteClassPaymentServicewsResponse(DeleteClassPaymentServicewsResponse value) {
        return new JAXBElement<DeleteClassPaymentServicewsResponse>(_DeleteClassPaymentServicewsResponse_QNAME, DeleteClassPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClassPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteClassPaymentServicews")
    public JAXBElement<DeleteClassPaymentServicews> createDeleteClassPaymentServicews(DeleteClassPaymentServicews value) {
        return new JAXBElement<DeleteClassPaymentServicews>(_DeleteClassPaymentServicews_QNAME, DeleteClassPaymentServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClassPaymentServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createClassPaymentServicewsResponse")
    public JAXBElement<CreateClassPaymentServicewsResponse> createCreateClassPaymentServicewsResponse(CreateClassPaymentServicewsResponse value) {
        return new JAXBElement<CreateClassPaymentServicewsResponse>(_CreateClassPaymentServicewsResponse_QNAME, CreateClassPaymentServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClassPaymentServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateClassPaymentServicews")
    public JAXBElement<UpdateClassPaymentServicews> createUpdateClassPaymentServicews(UpdateClassPaymentServicews value) {
        return new JAXBElement<UpdateClassPaymentServicews>(_UpdateClassPaymentServicews_QNAME, UpdateClassPaymentServicews.class, null, value);
    }

}
