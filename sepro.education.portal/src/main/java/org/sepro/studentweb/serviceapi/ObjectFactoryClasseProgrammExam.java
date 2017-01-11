
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryClasseProgrammExam allows you to programatically 
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
public class ObjectFactoryClasseProgrammExam {

    private final static QName _SearchClasseProgrammExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchClasseProgrammExamServicewsResponse");
    private final static QName _CreateClasseProgrammExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createClasseProgrammExamServicewsResponse");
    private final static QName _UpdateClasseProgrammExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateClasseProgrammExamServicews");
    private final static QName _DeleteClasseProgrammExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteClasseProgrammExamServicews");
    private final static QName _DeleteClasseProgrammExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteClasseProgrammExamServicewsResponse");
    private final static QName _UpdateClasseProgrammExamServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateClasseProgrammExamServicewsResponse");
    private final static QName _CreateClasseProgrammExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createClasseProgrammExamServicews");
    private final static QName _SearchClasseProgrammExamServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchClasseProgrammExamServicews");

    /**
     * Create a new ObjectFactoryClasseProgrammExam that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryClasseProgrammExam() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link SearchClasseProgrammExamServicews }
     * 
     */
    public SearchClasseProgrammExamServicews createSearchClasseProgrammExamServicews() {
        return new SearchClasseProgrammExamServicews();
    }

    /**
     * Create an instance of {@link CreateClasseProgrammExamServicews }
     * 
     */
    public CreateClasseProgrammExamServicews createCreateClasseProgrammExamServicews() {
        return new CreateClasseProgrammExamServicews();
    }

    /**
     * Create an instance of {@link DeleteClasseProgrammExamServicewsResponse }
     * 
     */
    public DeleteClasseProgrammExamServicewsResponse createDeleteClasseProgrammExamServicewsResponse() {
        return new DeleteClasseProgrammExamServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateClasseProgrammExamServicewsResponse }
     * 
     */
    public UpdateClasseProgrammExamServicewsResponse createUpdateClasseProgrammExamServicewsResponse() {
        return new UpdateClasseProgrammExamServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteClasseProgrammExamServicews }
     * 
     */
    public DeleteClasseProgrammExamServicews createDeleteClasseProgrammExamServicews() {
        return new DeleteClasseProgrammExamServicews();
    }

    /**
     * Create an instance of {@link UpdateClasseProgrammExamServicews }
     * 
     */
    public UpdateClasseProgrammExamServicews createUpdateClasseProgrammExamServicews() {
        return new UpdateClasseProgrammExamServicews();
    }

    /**
     * Create an instance of {@link CreateClasseProgrammExamServicewsResponse }
     * 
     */
    public CreateClasseProgrammExamServicewsResponse createCreateClasseProgrammExamServicewsResponse() {
        return new CreateClasseProgrammExamServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchClasseProgrammExamServicewsResponse }
     * 
     */
    public SearchClasseProgrammExamServicewsResponse createSearchClasseProgrammExamServicewsResponse() {
        return new SearchClasseProgrammExamServicewsResponse();
    }

    /**
     * Create an instance of {@link ClasseProgrammExamDto }
     * 
     */
    public ClasseProgrammExamDto createClasseProgrammExamDto() {
        return new ClasseProgrammExamDto();
    }

    /**
     * Create an instance of {@link StudentDto }
     * 
     */
    public StudentDto createStudentDto() {
        return new StudentDto();
    }

    /**
     * Create an instance of {@link ClasseProgrammDto.ProgrammeCalendar }
     * 
     */
    public ClasseProgrammDto.ProgrammeCalendar createClasseProgrammDtoProgrammeCalendar() {
        return new ClasseProgrammDto.ProgrammeCalendar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClasseProgrammExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchClasseProgrammExamServicewsResponse")
    public JAXBElement<SearchClasseProgrammExamServicewsResponse> createSearchClasseProgrammExamServicewsResponse(SearchClasseProgrammExamServicewsResponse value) {
        return new JAXBElement<SearchClasseProgrammExamServicewsResponse>(_SearchClasseProgrammExamServicewsResponse_QNAME, SearchClasseProgrammExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClasseProgrammExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createClasseProgrammExamServicewsResponse")
    public JAXBElement<CreateClasseProgrammExamServicewsResponse> createCreateClasseProgrammExamServicewsResponse(CreateClasseProgrammExamServicewsResponse value) {
        return new JAXBElement<CreateClasseProgrammExamServicewsResponse>(_CreateClasseProgrammExamServicewsResponse_QNAME, CreateClasseProgrammExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClasseProgrammExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateClasseProgrammExamServicews")
    public JAXBElement<UpdateClasseProgrammExamServicews> createUpdateClasseProgrammExamServicews(UpdateClasseProgrammExamServicews value) {
        return new JAXBElement<UpdateClasseProgrammExamServicews>(_UpdateClasseProgrammExamServicews_QNAME, UpdateClasseProgrammExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClasseProgrammExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteClasseProgrammExamServicews")
    public JAXBElement<DeleteClasseProgrammExamServicews> createDeleteClasseProgrammExamServicews(DeleteClasseProgrammExamServicews value) {
        return new JAXBElement<DeleteClasseProgrammExamServicews>(_DeleteClasseProgrammExamServicews_QNAME, DeleteClasseProgrammExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClasseProgrammExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteClasseProgrammExamServicewsResponse")
    public JAXBElement<DeleteClasseProgrammExamServicewsResponse> createDeleteClasseProgrammExamServicewsResponse(DeleteClasseProgrammExamServicewsResponse value) {
        return new JAXBElement<DeleteClasseProgrammExamServicewsResponse>(_DeleteClasseProgrammExamServicewsResponse_QNAME, DeleteClasseProgrammExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClasseProgrammExamServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateClasseProgrammExamServicewsResponse")
    public JAXBElement<UpdateClasseProgrammExamServicewsResponse> createUpdateClasseProgrammExamServicewsResponse(UpdateClasseProgrammExamServicewsResponse value) {
        return new JAXBElement<UpdateClasseProgrammExamServicewsResponse>(_UpdateClasseProgrammExamServicewsResponse_QNAME, UpdateClasseProgrammExamServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClasseProgrammExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createClasseProgrammExamServicews")
    public JAXBElement<CreateClasseProgrammExamServicews> createCreateClasseProgrammExamServicews(CreateClasseProgrammExamServicews value) {
        return new JAXBElement<CreateClasseProgrammExamServicews>(_CreateClasseProgrammExamServicews_QNAME, CreateClasseProgrammExamServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClasseProgrammExamServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchClasseProgrammExamServicews")
    public JAXBElement<SearchClasseProgrammExamServicews> createSearchClasseProgrammExamServicews(SearchClasseProgrammExamServicews value) {
        return new JAXBElement<SearchClasseProgrammExamServicews>(_SearchClasseProgrammExamServicews_QNAME, SearchClasseProgrammExamServicews.class, null, value);
    }

}
