
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createBuildingServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createBuildingServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildingDto" type="{http://serviceapi.parameterweb.sepro.org/}buildingDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBuildingServicews", propOrder = {
    "buildingDto"
})
public class CreateBuildingServicews {

    protected BuildingDto buildingDto;

    /**
     * Obtient la valeur de la propriété buildingDto.
     * 
     * @return
     *     possible object is
     *     {@link BuildingDto }
     *     
     */
    public BuildingDto getBuildingDto() {
        return buildingDto;
    }

    /**
     * Définit la valeur de la propriété buildingDto.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingDto }
     *     
     */
    public void setBuildingDto(BuildingDto value) {
        this.buildingDto = value;
    }

}
