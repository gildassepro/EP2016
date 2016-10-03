
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createTeacherPresenceServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createTeacherPresenceServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teacherPresenceDto" type="{http://serviceapi.studentweb.sepro.org/}teacherPresenceDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTeacherPresenceServicews", propOrder = {
    "teacherPresenceDto"
})
public class CreateTeacherPresenceServicews {

    protected TeacherPresenceDto teacherPresenceDto;

    /**
     * Obtient la valeur de la propri�t� teacherPresenceDto.
     * 
     * @return
     *     possible object is
     *     {@link TeacherPresenceDto }
     *     
     */
    public TeacherPresenceDto getTeacherPresenceDto() {
        return teacherPresenceDto;
    }

    /**
     * D�finit la valeur de la propri�t� teacherPresenceDto.
     * 
     * @param value
     *     allowed object is
     *     {@link TeacherPresenceDto }
     *     
     */
    public void setTeacherPresenceDto(TeacherPresenceDto value) {
        this.teacherPresenceDto = value;
    }

}
