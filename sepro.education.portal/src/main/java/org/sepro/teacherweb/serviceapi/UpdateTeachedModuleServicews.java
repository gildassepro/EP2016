
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateTeachedModuleServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateTeachedModuleServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teacherModuleDto" type="{http://serviceapi.teacherweb.sepro.org/}teacherModuleDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTeachedModuleServicews", propOrder = {
    "teacherModuleDto"
})
public class UpdateTeachedModuleServicews {

    protected TeacherModuleDto teacherModuleDto;

    /**
     * Obtient la valeur de la propriété teacherModuleDto.
     * 
     * @return
     *     possible object is
     *     {@link TeacherModuleDto }
     *     
     */
    public TeacherModuleDto getTeacherModuleDto() {
        return teacherModuleDto;
    }

    /**
     * Définit la valeur de la propriété teacherModuleDto.
     * 
     * @param value
     *     allowed object is
     *     {@link TeacherModuleDto }
     *     
     */
    public void setTeacherModuleDto(TeacherModuleDto value) {
        this.teacherModuleDto = value;
    }

}
