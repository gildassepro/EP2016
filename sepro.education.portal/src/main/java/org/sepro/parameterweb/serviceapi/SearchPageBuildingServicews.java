
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPageBuildingServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPageBuildingServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildingDto" type="{http://serviceapi.parameterweb.sepro.org/}buildingDto" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPageBuildingServicews", propOrder = {
    "buildingDto",
    "page",
    "pageSize"
})
public class SearchPageBuildingServicews {

    protected BuildingDto buildingDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propri�t� buildingDto.
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
     * D�finit la valeur de la propri�t� buildingDto.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingDto }
     *     
     */
    public void setBuildingDto(BuildingDto value) {
        this.buildingDto = value;
    }

    /**
     * Obtient la valeur de la propri�t� page.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * D�finit la valeur de la propri�t� page.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Obtient la valeur de la propri�t� pageSize.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * D�finit la valeur de la propri�t� pageSize.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
