
package org.sepro.parameterweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour buildingDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="buildingDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cleaning_hours" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cleaning_hour" type="{http://serviceapi.parameterweb.sepro.org/}cleanHoursDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="establishment" type="{http://serviceapi.parameterweb.sepro.org/}establishmentDto" minOccurs="0"/>
 *         &lt;element name="geographical_location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idBuilding" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name_building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_of_blocks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_classrooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_floors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_laboratories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_machinerooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_offices" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subestablishment" type="{http://serviceapi.parameterweb.sepro.org/}subEstablishmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buildingDto", propOrder = {
    "cleaningHours",
    "establishment",
    "geographicalLocation",
    "idBuilding",
    "nameBuilding",
    "numberOfBlocks",
    "numberOfClassrooms",
    "numberOfFloors",
    "numberOfLaboratories",
    "numberOfMachinerooms",
    "numberOfOffices",
    "subestablishment"
})
public class BuildingDto {

    @XmlElement(name = "cleaning_hours")
    protected BuildingDto.CleaningHours cleaningHours;
    protected EstablishmentDto establishment;
    @XmlElement(name = "geographical_location")
    protected String geographicalLocation;
    protected Long idBuilding;
    @XmlElement(name = "name_building")
    protected String nameBuilding;
    @XmlElement(name = "number_of_blocks")
    protected int numberOfBlocks;
    @XmlElement(name = "number_of_classrooms")
    protected int numberOfClassrooms;
    @XmlElement(name = "number_of_floors")
    protected int numberOfFloors;
    @XmlElement(name = "number_of_laboratories")
    protected int numberOfLaboratories;
    @XmlElement(name = "number_of_machinerooms")
    protected int numberOfMachinerooms;
    @XmlElement(name = "number_of_offices")
    protected int numberOfOffices;
    protected SubEstablishmentDto subestablishment;

    /**
     * Obtient la valeur de la propri�t� cleaningHours.
     * 
     * @return
     *     possible object is
     *     {@link BuildingDto.CleaningHours }
     *     
     */
    public BuildingDto.CleaningHours getCleaningHours() {
        return cleaningHours;
    }

    /**
     * D�finit la valeur de la propri�t� cleaningHours.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingDto.CleaningHours }
     *     
     */
    public void setCleaningHours(BuildingDto.CleaningHours value) {
        this.cleaningHours = value;
    }

    /**
     * Obtient la valeur de la propri�t� establishment.
     * 
     * @return
     *     possible object is
     *     {@link EstablishmentDto }
     *     
     */
    public EstablishmentDto getEstablishment() {
        return establishment;
    }

    /**
     * D�finit la valeur de la propri�t� establishment.
     * 
     * @param value
     *     allowed object is
     *     {@link EstablishmentDto }
     *     
     */
    public void setEstablishment(EstablishmentDto value) {
        this.establishment = value;
    }

    /**
     * Obtient la valeur de la propri�t� geographicalLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicalLocation() {
        return geographicalLocation;
    }

    /**
     * D�finit la valeur de la propri�t� geographicalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicalLocation(String value) {
        this.geographicalLocation = value;
    }

    /**
     * Obtient la valeur de la propri�t� idBuilding.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdBuilding() {
        return idBuilding;
    }

    /**
     * D�finit la valeur de la propri�t� idBuilding.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdBuilding(Long value) {
        this.idBuilding = value;
    }

    /**
     * Obtient la valeur de la propri�t� nameBuilding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameBuilding() {
        return nameBuilding;
    }

    /**
     * D�finit la valeur de la propri�t� nameBuilding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameBuilding(String value) {
        this.nameBuilding = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfBlocks.
     * 
     */
    public int getNumberOfBlocks() {
        return numberOfBlocks;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfBlocks.
     * 
     */
    public void setNumberOfBlocks(int value) {
        this.numberOfBlocks = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfClassrooms.
     * 
     */
    public int getNumberOfClassrooms() {
        return numberOfClassrooms;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfClassrooms.
     * 
     */
    public void setNumberOfClassrooms(int value) {
        this.numberOfClassrooms = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfFloors.
     * 
     */
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfFloors.
     * 
     */
    public void setNumberOfFloors(int value) {
        this.numberOfFloors = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfLaboratories.
     * 
     */
    public int getNumberOfLaboratories() {
        return numberOfLaboratories;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfLaboratories.
     * 
     */
    public void setNumberOfLaboratories(int value) {
        this.numberOfLaboratories = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfMachinerooms.
     * 
     */
    public int getNumberOfMachinerooms() {
        return numberOfMachinerooms;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfMachinerooms.
     * 
     */
    public void setNumberOfMachinerooms(int value) {
        this.numberOfMachinerooms = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfOffices.
     * 
     */
    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfOffices.
     * 
     */
    public void setNumberOfOffices(int value) {
        this.numberOfOffices = value;
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cleaning_hour" type="{http://serviceapi.parameterweb.sepro.org/}cleanHoursDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "cleaningHour"
    })
    public static class CleaningHours {

        @XmlElement(name = "cleaning_hour")
        protected List<CleanHoursDto> cleaningHour;

        /**
         * Gets the value of the cleaningHour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cleaningHour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCleaningHour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CleanHoursDto }
         * 
         * 
         */
        public List<CleanHoursDto> getCleaningHour() {
            if (cleaningHour == null) {
                cleaningHour = new ArrayList<CleanHoursDto>();
            }
            return this.cleaningHour;
        }

    }

}
