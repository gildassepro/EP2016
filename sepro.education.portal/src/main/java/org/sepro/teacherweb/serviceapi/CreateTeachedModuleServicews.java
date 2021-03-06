
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createTeachedModuleServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createTeachedModuleServicews">
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
@XmlType(name = "createTeachedModuleServicews", propOrder = {
    "teacherModuleDto"
})
public class CreateTeachedModuleServicews {

    protected TeacherModuleDto teacherModuleDto;

    /**
     * Obtient la valeur de la propri�t� teacherModuleDto.
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
     * D�finit la valeur de la propri�t� teacherModuleDto.
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
