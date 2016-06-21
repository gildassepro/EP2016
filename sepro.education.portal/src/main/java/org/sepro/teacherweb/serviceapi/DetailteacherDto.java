
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour detailteacherDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="detailteacherDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hourRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idDetailteacher" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identityTeacher" type="{http://serviceapi.teacherweb.sepro.org/}identityTeacherDto" minOccurs="0"/>
 *         &lt;element name="numberOfHoursWorked" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startHour" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="stopHour" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="workingMonth" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailteacherDto", propOrder = {
    "hourRate",
    "idDetailteacher",
    "identityTeacher",
    "numberOfHoursWorked",
    "startHour",
    "stopHour",
    "workingMonth"
})
public class DetailteacherDto {

    protected Long hourRate;
    protected Long idDetailteacher;
    protected IdentityTeacherDto identityTeacher;
    protected Long numberOfHoursWorked;
    protected PopuplistDto startHour;
    protected PopuplistDto stopHour;
    protected PopuplistDto workingMonth;

    /**
     * Obtient la valeur de la propri�t� hourRate.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHourRate() {
        return hourRate;
    }

    /**
     * D�finit la valeur de la propri�t� hourRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHourRate(Long value) {
        this.hourRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� idDetailteacher.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDetailteacher() {
        return idDetailteacher;
    }

    /**
     * D�finit la valeur de la propri�t� idDetailteacher.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDetailteacher(Long value) {
        this.idDetailteacher = value;
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
     * Obtient la valeur de la propri�t� numberOfHoursWorked.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfHoursWorked.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfHoursWorked(Long value) {
        this.numberOfHoursWorked = value;
    }

    /**
     * Obtient la valeur de la propri�t� startHour.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStartHour() {
        return startHour;
    }

    /**
     * D�finit la valeur de la propri�t� startHour.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStartHour(PopuplistDto value) {
        this.startHour = value;
    }

    /**
     * Obtient la valeur de la propri�t� stopHour.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStopHour() {
        return stopHour;
    }

    /**
     * D�finit la valeur de la propri�t� stopHour.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStopHour(PopuplistDto value) {
        this.stopHour = value;
    }

    /**
     * Obtient la valeur de la propri�t� workingMonth.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getWorkingMonth() {
        return workingMonth;
    }

    /**
     * D�finit la valeur de la propri�t� workingMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setWorkingMonth(PopuplistDto value) {
        this.workingMonth = value;
    }

}
