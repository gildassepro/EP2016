
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateModuleCalendarServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateModuleCalendarServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduleCalendarDto" type="{http://serviceapi.parameterweb.sepro.org/}moduleCalendarDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModuleCalendarServicews", propOrder = {
    "moduleCalendarDto"
})
public class UpdateModuleCalendarServicews {

    protected ModuleCalendarDto moduleCalendarDto;

    /**
     * Obtient la valeur de la propriété moduleCalendarDto.
     * 
     * @return
     *     possible object is
     *     {@link ModuleCalendarDto }
     *     
     */
    public ModuleCalendarDto getModuleCalendarDto() {
        return moduleCalendarDto;
    }

    /**
     * Définit la valeur de la propriété moduleCalendarDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleCalendarDto }
     *     
     */
    public void setModuleCalendarDto(ModuleCalendarDto value) {
        this.moduleCalendarDto = value;
    }

}
