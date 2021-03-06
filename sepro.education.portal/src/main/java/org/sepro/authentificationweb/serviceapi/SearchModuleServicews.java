
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchModuleServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchModuleServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduleDto" type="{http://serviceapi.authentificationweb.sepro.org/}moduleDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchModuleServicews", propOrder = {
    "moduleDto"
})
public class SearchModuleServicews {

    protected ModuleDto moduleDto;

    /**
     * Obtient la valeur de la propri�t� moduleDto.
     * 
     * @return
     *     possible object is
     *     {@link ModuleDto }
     *     
     */
    public ModuleDto getModuleDto() {
        return moduleDto;
    }

    /**
     * D�finit la valeur de la propri�t� moduleDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleDto }
     *     
     */
    public void setModuleDto(ModuleDto value) {
        this.moduleDto = value;
    }

}
