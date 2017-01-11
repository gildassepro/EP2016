
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateModuleAcademiExamServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateModuleAcademiExamServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduleAcademiExamDto" type="{http://serviceapi.studentweb.sepro.org/}moduleAcademiExamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModuleAcademiExamServicews", propOrder = {
    "moduleAcademiExamDto"
})
public class UpdateModuleAcademiExamServicews {

    protected ModuleAcademiExamDto moduleAcademiExamDto;

    /**
     * Obtient la valeur de la propriété moduleAcademiExamDto.
     * 
     * @return
     *     possible object is
     *     {@link ModuleAcademiExamDto }
     *     
     */
    public ModuleAcademiExamDto getModuleAcademiExamDto() {
        return moduleAcademiExamDto;
    }

    /**
     * Définit la valeur de la propriété moduleAcademiExamDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleAcademiExamDto }
     *     
     */
    public void setModuleAcademiExamDto(ModuleAcademiExamDto value) {
        this.moduleAcademiExamDto = value;
    }

}
