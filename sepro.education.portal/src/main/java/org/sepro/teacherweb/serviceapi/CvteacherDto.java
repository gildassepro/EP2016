
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour cvteacherDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cvteacherDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="idCvteacher" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identityTeacher" type="{http://serviceapi.teacherweb.sepro.org/}identityTeacherDto" minOccurs="0"/>
 *         &lt;element name="linkdiploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cvteacherDto", propOrder = {
    "diploma",
    "enDate",
    "idCvteacher",
    "identityTeacher",
    "linkdiploma",
    "startDate"
})
public class CvteacherDto {

    protected String diploma;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enDate;
    protected Long idCvteacher;
    protected IdentityTeacherDto identityTeacher;
    protected String linkdiploma;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtient la valeur de la propri�t� diploma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiploma() {
        return diploma;
    }

    /**
     * D�finit la valeur de la propri�t� diploma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiploma(String value) {
        this.diploma = value;
    }

    /**
     * Obtient la valeur de la propri�t� enDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnDate() {
        return enDate;
    }

    /**
     * D�finit la valeur de la propri�t� enDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnDate(XMLGregorianCalendar value) {
        this.enDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� idCvteacher.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCvteacher() {
        return idCvteacher;
    }

    /**
     * D�finit la valeur de la propri�t� idCvteacher.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCvteacher(Long value) {
        this.idCvteacher = value;
    }

    /**
     * Obtient la valeur de la propri�t� identityTeacher.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public IdentityTeacherDto getIdentityTeacher() {
        return identityTeacher;
    }

    /**
     * D�finit la valeur de la propri�t� identityTeacher.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public void setIdentityTeacher(IdentityTeacherDto value) {
        this.identityTeacher = value;
    }

    /**
     * Obtient la valeur de la propri�t� linkdiploma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkdiploma() {
        return linkdiploma;
    }

    /**
     * D�finit la valeur de la propri�t� linkdiploma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkdiploma(String value) {
        this.linkdiploma = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * D�finit la valeur de la propri�t� startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
