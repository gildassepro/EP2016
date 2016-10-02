
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryClasseProgramm allows you to programatically 
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
public class ObjectFactoryClasseProgramm {

    private final static QName _SearchClasseProgrammServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchClasseProgrammServicewsResponse");
    private final static QName _CreateClasseProgrammServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createClasseProgrammServicewsResponse");
    private final static QName _DeleteClasseProgrammServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteClasseProgrammServicewsResponse");
    private final static QName _DeleteClasseProgrammServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteClasseProgrammServicews");
    private final static QName _SearchClasseProgrammServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchClasseProgrammServicews");
    private final static QName _CreateClasseProgrammServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createClasseProgrammServicews");
    private final static QName _UpdateClasseProgrammServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateClasseProgrammServicews");
    private final static QName _UpdateClasseProgrammServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateClasseProgrammServicewsResponse");

    /**
     * Create a new ObjectFactoryClasseProgramm that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryClasseProgramm() {
    }

    /**
     * Create an instance of {@link ClasseProgrammDto }
     * 
     */
    public ClasseProgrammDto createClasseProgrammDto() {
        return new ClasseProgrammDto();
    }

    /**
     * Create an instance of {@link UpdateClasseProgrammServicewsResponse }
     * 
     */
    public UpdateClasseProgrammServicewsResponse createUpdateClasseProgrammServicewsResponse() {
        return new UpdateClasseProgrammServicewsResponse();
    }

    /**
     * Create an instance of {@link CreateClasseProgrammServicews }
     * 
     */
    public CreateClasseProgrammServicews createCreateClasseProgrammServicews() {
        return new CreateClasseProgrammServicews();
    }

    /**
     * Create an instance of {@link UpdateClasseProgrammServicews }
     * 
     */
    public UpdateClasseProgrammServicews createUpdateClasseProgrammServicews() {
        return new UpdateClasseProgrammServicews();
    }

    /**
     * Create an instance of {@link SearchClasseProgrammServicews }
     * 
     */
    public SearchClasseProgrammServicews createSearchClasseProgrammServicews() {
        return new SearchClasseProgrammServicews();
    }

    /**
     * Create an instance of {@link DeleteClasseProgrammServicews }
     * 
     */
    public DeleteClasseProgrammServicews createDeleteClasseProgrammServicews() {
        return new DeleteClasseProgrammServicews();
    }

    /**
     * Create an instance of {@link CreateClasseProgrammServicewsResponse }
     * 
     */
    public CreateClasseProgrammServicewsResponse createCreateClasseProgrammServicewsResponse() {
        return new CreateClasseProgrammServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteClasseProgrammServicewsResponse }
     * 
     */
    public DeleteClasseProgrammServicewsResponse createDeleteClasseProgrammServicewsResponse() {
        return new DeleteClasseProgrammServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchClasseProgrammServicewsResponse }
     * 
     */
    public SearchClasseProgrammServicewsResponse createSearchClasseProgrammServicewsResponse() {
        return new SearchClasseProgrammServicewsResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClasseProgrammServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchClasseProgrammServicewsResponse")
    public JAXBElement<SearchClasseProgrammServicewsResponse> createSearchClasseProgrammServicewsResponse(SearchClasseProgrammServicewsResponse value) {
        return new JAXBElement<SearchClasseProgrammServicewsResponse>(_SearchClasseProgrammServicewsResponse_QNAME, SearchClasseProgrammServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClasseProgrammServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createClasseProgrammServicewsResponse")
    public JAXBElement<CreateClasseProgrammServicewsResponse> createCreateClasseProgrammServicewsResponse(CreateClasseProgrammServicewsResponse value) {
        return new JAXBElement<CreateClasseProgrammServicewsResponse>(_CreateClasseProgrammServicewsResponse_QNAME, CreateClasseProgrammServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClasseProgrammServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteClasseProgrammServicewsResponse")
    public JAXBElement<DeleteClasseProgrammServicewsResponse> createDeleteClasseProgrammServicewsResponse(DeleteClasseProgrammServicewsResponse value) {
        return new JAXBElement<DeleteClasseProgrammServicewsResponse>(_DeleteClasseProgrammServicewsResponse_QNAME, DeleteClasseProgrammServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClasseProgrammServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteClasseProgrammServicews")
    public JAXBElement<DeleteClasseProgrammServicews> createDeleteClasseProgrammServicews(DeleteClasseProgrammServicews value) {
        return new JAXBElement<DeleteClasseProgrammServicews>(_DeleteClasseProgrammServicews_QNAME, DeleteClasseProgrammServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClasseProgrammServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchClasseProgrammServicews")
    public JAXBElement<SearchClasseProgrammServicews> createSearchClasseProgrammServicews(SearchClasseProgrammServicews value) {
        return new JAXBElement<SearchClasseProgrammServicews>(_SearchClasseProgrammServicews_QNAME, SearchClasseProgrammServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClasseProgrammServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createClasseProgrammServicews")
    public JAXBElement<CreateClasseProgrammServicews> createCreateClasseProgrammServicews(CreateClasseProgrammServicews value) {
        return new JAXBElement<CreateClasseProgrammServicews>(_CreateClasseProgrammServicews_QNAME, CreateClasseProgrammServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClasseProgrammServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateClasseProgrammServicews")
    public JAXBElement<UpdateClasseProgrammServicews> createUpdateClasseProgrammServicews(UpdateClasseProgrammServicews value) {
        return new JAXBElement<UpdateClasseProgrammServicews>(_UpdateClasseProgrammServicews_QNAME, UpdateClasseProgrammServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClasseProgrammServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateClasseProgrammServicewsResponse")
    public JAXBElement<UpdateClasseProgrammServicewsResponse> createUpdateClasseProgrammServicewsResponse(UpdateClasseProgrammServicewsResponse value) {
        return new JAXBElement<UpdateClasseProgrammServicewsResponse>(_UpdateClasseProgrammServicewsResponse_QNAME, UpdateClasseProgrammServicewsResponse.class, null, value);
    }

}
