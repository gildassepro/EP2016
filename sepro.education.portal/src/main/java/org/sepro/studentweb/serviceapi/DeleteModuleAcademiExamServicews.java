
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteModuleAcademiExamServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteModuleAcademiExamServicews">
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
@XmlType(name = "deleteModuleAcademiExamServicews", propOrder = {
    "moduleAcademiExamDto"
})
public class DeleteModuleAcademiExamServicews {

    protected ModuleAcademiExamDto moduleAcademiExamDto;

    /**
     * Obtient la valeur de la propri�t� moduleAcademiExamDto.
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
     * D�finit la valeur de la propri�t� moduleAcademiExamDto.
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
