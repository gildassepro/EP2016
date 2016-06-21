
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour moduleCalendarDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="moduleCalendarDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_module" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" minOccurs="0"/>
 *         &lt;element name="coefficient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idModuleCalendar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="programmeCalendar" type="{http://serviceapi.parameterweb.sepro.org/}programmeCalendarDto" minOccurs="0"/>
 *         &lt;element name="session" type="{http://serviceapi.parameterweb.sepro.org/}sessionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moduleCalendarDto", propOrder = {
    "academicModule",
    "coefficient",
    "idModuleCalendar",
    "programmeCalendar",
    "session"
})
public class ModuleCalendarDto {

    @XmlElement(name = "academic_module")
    protected AcademicModuleDto academicModule;
    protected int coefficient;
    protected Long idModuleCalendar;
    protected ProgrammeCalendarDto programmeCalendar;
    protected SessionDto session;

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
     * Obtient la valeur de la propri�t� coefficient.
     * 
     */
    public int getCoefficient() {
        return coefficient;
    }

    /**
     * D�finit la valeur de la propri�t� coefficient.
     * 
     */
    public void setCoefficient(int value) {
        this.coefficient = value;
    }

    /**
     * Obtient la valeur de la propri�t� idModuleCalendar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdModuleCalendar() {
        return idModuleCalendar;
    }

    /**
     * D�finit la valeur de la propri�t� idModuleCalendar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdModuleCalendar(Long value) {
        this.idModuleCalendar = value;
    }

    /**
     * Obtient la valeur de la propri�t� programmeCalendar.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeCalendarDto }
     *     
     */
    public ProgrammeCalendarDto getProgrammeCalendar() {
        return programmeCalendar;
    }

    /**
     * D�finit la valeur de la propri�t� programmeCalendar.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeCalendarDto }
     *     
     */
    public void setProgrammeCalendar(ProgrammeCalendarDto value) {
        this.programmeCalendar = value;
    }

    /**
     * Obtient la valeur de la propri�t� session.
     * 
     * @return
     *     possible object is
     *     {@link SessionDto }
     *     
     */
    public SessionDto getSession() {
        return session;
    }

    /**
     * D�finit la valeur de la propri�t� session.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDto }
     *     
     */
    public void setSession(SessionDto value) {
        this.session = value;
    }

}
