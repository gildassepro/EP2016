
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour teacherModuleDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="teacherModuleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academicModule" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" minOccurs="0"/>
 *         &lt;element name="academic_sector" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academique_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="detailteacher" type="{http://serviceapi.teacherweb.sepro.org/}detailteacherDto" minOccurs="0"/>
 *         &lt;element name="idTeacherModule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teacherModuleDto", propOrder = {
    "academicModule",
    "academicSector",
    "academiqueYear",
    "detailteacher",
    "idTeacherModule",
    "priority"
})
public class TeacherModuleDto {

    protected AcademicModuleDto academicModule;
    @XmlElement(name = "academic_sector")
    protected PopuplistDto academicSector;
    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    protected DetailteacherDto detailteacher;
    protected Long idTeacherModule;
    protected PopuplistDto priority;

    /**
     * Obtient la valeur de la propri�t� academicModule.
     * 
     * @return
     *     possible object is
     *     {@link AcademicModuleDto }
     *     
     */
    public AcademicModuleDto getAcademicModule() {
        return academicModule;
    }

    /**
     * D�finit la valeur de la propri�t� academicModule.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicModuleDto }
     *     
     */
    public void setAcademicModule(AcademicModuleDto value) {
        this.academicModule = value;
    }

    /**
     * Obtient la valeur de la propri�t� academicSector.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getAcademicSector() {
        return academicSector;
    }

    /**
     * D�finit la valeur de la propri�t� academicSector.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setAcademicSector(PopuplistDto value) {
        this.academicSector = value;
    }

    /**
     * Obtient la valeur de la propri�t� academiqueYear.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getAcademiqueYear() {
        return academiqueYear;
    }

    /**
     * D�finit la valeur de la propri�t� academiqueYear.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setAcademiqueYear(PopuplistDto value) {
        this.academiqueYear = value;
    }

    /**
     * Obtient la valeur de la propri�t� detailteacher.
     * 
     * @return
     *     possible object is
     *     {@link DetailteacherDto }
     *     
     */
    public DetailteacherDto getDetailteacher() {
        return detailteacher;
    }

    /**
     * D�finit la valeur de la propri�t� detailteacher.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailteacherDto }
     *     
     */
    public void setDetailteacher(DetailteacherDto value) {
        this.detailteacher = value;
    }

    /**
     * Obtient la valeur de la propri�t� idTeacherModule.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTeacherModule() {
        return idTeacherModule;
    }

    /**
     * D�finit la valeur de la propri�t� idTeacherModule.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTeacherModule(Long value) {
        this.idTeacherModule = value;
    }

    /**
     * Obtient la valeur de la propri�t� priority.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getPriority() {
        return priority;
    }

    /**
     * D�finit la valeur de la propri�t� priority.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setPriority(PopuplistDto value) {
        this.priority = value;
    }

}
