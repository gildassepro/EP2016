
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
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété academicModule.
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
     * Définit la valeur de la propriété academicModule.
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
     * Obtient la valeur de la propriété academicSector.
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
     * Définit la valeur de la propriété academicSector.
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
     * Obtient la valeur de la propriété academiqueYear.
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
     * Définit la valeur de la propriété academiqueYear.
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
     * Obtient la valeur de la propriété detailteacher.
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
     * Définit la valeur de la propriété detailteacher.
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
     * Obtient la valeur de la propriété idTeacherModule.
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
     * Définit la valeur de la propriété idTeacherModule.
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
     * Obtient la valeur de la propriété priority.
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
     * Définit la valeur de la propriété priority.
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
