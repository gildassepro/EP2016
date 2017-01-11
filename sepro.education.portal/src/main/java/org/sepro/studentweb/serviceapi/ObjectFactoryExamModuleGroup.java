
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sepro.studentweb.serviceapi package. 
 * <p>An ObjectFactoryExamModuleGroup allows you to programatically 
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
public class ObjectFactoryExamModuleGroup {

    private final static QName _UpdateExamModuleGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateExamModuleGroupServicewsResponse");
    private final static QName _DeleteExamModuleGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteExamModuleGroupServicews");
    private final static QName _DeleteExamModuleGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "deleteExamModuleGroupServicewsResponse");
    private final static QName _UpdateExamModuleGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "updateExamModuleGroupServicews");
    private final static QName _SearchExamModuleGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchExamModuleGroupServicewsResponse");
    private final static QName _CreateExamModuleGroupServicewsResponse_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createExamModuleGroupServicewsResponse");
    private final static QName _CreateExamModuleGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "createExamModuleGroupServicews");
    private final static QName _SearchExamModuleGroupServicews_QNAME = new QName("http://serviceapi.studentweb.sepro.org/", "searchExamModuleGroupServicews");

    /**
     * Create a new ObjectFactoryExamModuleGroup that can be used to create new instances of schema derived classes for package: org.sepro.studentweb.serviceapi
     * 
     */
    public ObjectFactoryExamModuleGroup() {
    }

    /**
     * Create an instance of {@link CreateExamModuleGroupServicews }
     * 
     */
    public CreateExamModuleGroupServicews createCreateExamModuleGroupServicews() {
        return new CreateExamModuleGroupServicews();
    }

    /**
     * Create an instance of {@link SearchExamModuleGroupServicews }
     * 
     */
    public SearchExamModuleGroupServicews createSearchExamModuleGroupServicews() {
        return new SearchExamModuleGroupServicews();
    }

    /**
     * Create an instance of {@link CreateExamModuleGroupServicewsResponse }
     * 
     */
    public CreateExamModuleGroupServicewsResponse createCreateExamModuleGroupServicewsResponse() {
        return new CreateExamModuleGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link SearchExamModuleGroupServicewsResponse }
     * 
     */
    public SearchExamModuleGroupServicewsResponse createSearchExamModuleGroupServicewsResponse() {
        return new SearchExamModuleGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link DeleteExamModuleGroupServicews }
     * 
     */
    public DeleteExamModuleGroupServicews createDeleteExamModuleGroupServicews() {
        return new DeleteExamModuleGroupServicews();
    }

    /**
     * Create an instance of {@link DeleteExamModuleGroupServicewsResponse }
     * 
     */
    public DeleteExamModuleGroupServicewsResponse createDeleteExamModuleGroupServicewsResponse() {
        return new DeleteExamModuleGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link UpdateExamModuleGroupServicews }
     * 
     */
    public UpdateExamModuleGroupServicews createUpdateExamModuleGroupServicews() {
        return new UpdateExamModuleGroupServicews();
    }

    /**
     * Create an instance of {@link UpdateExamModuleGroupServicewsResponse }
     * 
     */
    public UpdateExamModuleGroupServicewsResponse createUpdateExamModuleGroupServicewsResponse() {
        return new UpdateExamModuleGroupServicewsResponse();
    }

    /**
     * Create an instance of {@link ExamModuleGroupDto }
     * 
     */
    public ExamModuleGroupDto createExamModuleGroupDto() {
        return new ExamModuleGroupDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExamModuleGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateExamModuleGroupServicewsResponse")
    public JAXBElement<UpdateExamModuleGroupServicewsResponse> createUpdateExamModuleGroupServicewsResponse(UpdateExamModuleGroupServicewsResponse value) {
        return new JAXBElement<UpdateExamModuleGroupServicewsResponse>(_UpdateExamModuleGroupServicewsResponse_QNAME, UpdateExamModuleGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExamModuleGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteExamModuleGroupServicews")
    public JAXBElement<DeleteExamModuleGroupServicews> createDeleteExamModuleGroupServicews(DeleteExamModuleGroupServicews value) {
        return new JAXBElement<DeleteExamModuleGroupServicews>(_DeleteExamModuleGroupServicews_QNAME, DeleteExamModuleGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExamModuleGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "deleteExamModuleGroupServicewsResponse")
    public JAXBElement<DeleteExamModuleGroupServicewsResponse> createDeleteExamModuleGroupServicewsResponse(DeleteExamModuleGroupServicewsResponse value) {
        return new JAXBElement<DeleteExamModuleGroupServicewsResponse>(_DeleteExamModuleGroupServicewsResponse_QNAME, DeleteExamModuleGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExamModuleGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "updateExamModuleGroupServicews")
    public JAXBElement<UpdateExamModuleGroupServicews> createUpdateExamModuleGroupServicews(UpdateExamModuleGroupServicews value) {
        return new JAXBElement<UpdateExamModuleGroupServicews>(_UpdateExamModuleGroupServicews_QNAME, UpdateExamModuleGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchExamModuleGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchExamModuleGroupServicewsResponse")
    public JAXBElement<SearchExamModuleGroupServicewsResponse> createSearchExamModuleGroupServicewsResponse(SearchExamModuleGroupServicewsResponse value) {
        return new JAXBElement<SearchExamModuleGroupServicewsResponse>(_SearchExamModuleGroupServicewsResponse_QNAME, SearchExamModuleGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExamModuleGroupServicewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createExamModuleGroupServicewsResponse")
    public JAXBElement<CreateExamModuleGroupServicewsResponse> createCreateExamModuleGroupServicewsResponse(CreateExamModuleGroupServicewsResponse value) {
        return new JAXBElement<CreateExamModuleGroupServicewsResponse>(_CreateExamModuleGroupServicewsResponse_QNAME, CreateExamModuleGroupServicewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateExamModuleGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "createExamModuleGroupServicews")
    public JAXBElement<CreateExamModuleGroupServicews> createCreateExamModuleGroupServicews(CreateExamModuleGroupServicews value) {
        return new JAXBElement<CreateExamModuleGroupServicews>(_CreateExamModuleGroupServicews_QNAME, CreateExamModuleGroupServicews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchExamModuleGroupServicews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceapi.studentweb.sepro.org/", name = "searchExamModuleGroupServicews")
    public JAXBElement<SearchExamModuleGroupServicews> createSearchExamModuleGroupServicews(SearchExamModuleGroupServicews value) {
        return new JAXBElement<SearchExamModuleGroupServicews>(_SearchExamModuleGroupServicews_QNAME, SearchExamModuleGroupServicews.class, null, value);
    }

}
