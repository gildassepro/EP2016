
package org.sepro.parameterweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour classeDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="classeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildiing" type="{http://serviceapi.parameterweb.sepro.org/}buildingDto" minOccurs="0"/>
 *         &lt;element name="dayofweek" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dayofweek" type="{http://serviceapi.parameterweb.sepro.org/}daysofWeekDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ending_hour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idClass" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_of_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_of_seats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="starting_hour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subestablishment" type="{http://serviceapi.parameterweb.sepro.org/}subEstablishmentDto" minOccurs="0"/>
 *         &lt;element name="telephone_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type_of_class" type="{http://serviceapi.parameterweb.sepro.org/}typeofClassDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classeDto", propOrder = {
    "buildiing",
    "dayofweek",
    "endingHour",
    "idClass",
    "location",
    "nameOfClass",
    "numberOfSeats",
    "startingHour",
    "subestablishment",
    "telephoneNumber",
    "typeOfClass"
})
public class ClasseDto {

    protected BuildingDto buildiing;
    protected ClasseDto.Dayofweek dayofweek;
    @XmlElement(name = "ending_hour")
    protected String endingHour;
    protected Long idClass;
    protected String location;
    @XmlElement(name = "name_of_class")
    protected String nameOfClass;
    @XmlElement(name = "number_of_seats")
    protected int numberOfSeats;
    @XmlElement(name = "starting_hour")
    protected String startingHour;
    protected SubEstablishmentDto subestablishment;
    @XmlElement(name = "telephone_number")
    protected int telephoneNumber;
    @XmlElement(name = "type_of_class")
    protected TypeofClassDto typeOfClass;

    /**
     * Obtient la valeur de la propri�t� buildiing.
     * 
     * @return
     *     possible object is
     *     {@link BuildingDto }
     *     
     */
    public BuildingDto getBuildiing() {
        return buildiing;
    }

    /**
     * D�finit la valeur de la propri�t� buildiing.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingDto }
     *     
     */
    public void setBuildiing(BuildingDto value) {
        this.buildiing = value;
    }

    /**
     * Obtient la valeur de la propri�t� dayofweek.
     * 
     * @return
     *     possible object is
     *     {@link ClasseDto.Dayofweek }
     *     
     */
    public ClasseDto.Dayofweek getDayofweek() {
        return dayofweek;
    }

    /**
     * D�finit la valeur de la propri�t� dayofweek.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseDto.Dayofweek }
     *     
     */
    public void setDayofweek(ClasseDto.Dayofweek value) {
        this.dayofweek = value;
    }

    /**
     * Obtient la valeur de la propri�t� endingHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingHour() {
        return endingHour;
    }

    /**
     * D�finit la valeur de la propri�t� endingHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingHour(String value) {
        this.endingHour = value;
    }

    /**
     * Obtient la valeur de la propri�t� idClass.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdClass() {
        return idClass;
    }

    /**
     * D�finit la valeur de la propri�t� idClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdClass(Long value) {
        this.idClass = value;
    }

    /**
     * Obtient la valeur de la propri�t� location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * D�finit la valeur de la propri�t� location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtient la valeur de la propri�t� nameOfClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClass() {
        return nameOfClass;
    }

    /**
     * D�finit la valeur de la propri�t� nameOfClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClass(String value) {
        this.nameOfClass = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfSeats.
     * 
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfSeats.
     * 
     */
    public void setNumberOfSeats(int value) {
        this.numberOfSeats = value;
    }

    /**
     * Obtient la valeur de la propri�t� startingHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingHour() {
        return startingHour;
    }

    /**
     * D�finit la valeur de la propri�t� startingHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingHour(String value) {
        this.startingHour = value;
    }

    /**
     * Obtient la valeur de la propri�t� subestablishment.
     * 
     * @return
     *     possible object is
     *     {@link SubEstablishmentDto }
     *     
     */
    public SubEstablishmentDto getSubestablishment() {
        return subestablishment;
    }

    /**
     * D�finit la valeur de la propri�t� subestablishment.
     * 
     * @param value
     *     allowed object is
     *     {@link SubEstablishmentDto }
     *     
     */
    public void setSubestablishment(SubEstablishmentDto value) {
        this.subestablishment = value;
    }

    /**
     * Obtient la valeur de la propri�t� telephoneNumber.
     * 
     */
    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * D�finit la valeur de la propri�t� telephoneNumber.
     * 
     */
    public void setTelephoneNumber(int value) {
        this.telephoneNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeOfClass.
     * 
     * @return
     *     possible object is
     *     {@link TypeofClassDto }
     *     
     */
    public TypeofClassDto getTypeOfClass() {
        return typeOfClass;
    }

    /**
     * D�finit la valeur de la propri�t� typeOfClass.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeofClassDto }
     *     
     */
    public void setTypeOfClass(TypeofClassDto value) {
        this.typeOfClass = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dayofweek" type="{http://serviceapi.parameterweb.sepro.org/}daysofWeekDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dayofweek"
    })
    public static class Dayofweek {

        protected List<DaysofWeekDto> dayofweek;

        /**
         * Gets the value of the dayofweek property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayofweek property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayofweek().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DaysofWeekDto }
         * 
         * 
         */
        public List<DaysofWeekDto> getDayofweek() {
            if (dayofweek == null) {
                dayofweek = new ArrayList<DaysofWeekDto>();
            }
            return this.dayofweek;
        }

    }

}
