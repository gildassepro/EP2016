
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchCourseSubjectServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchCourseSubjectServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courseSubjectDto" type="{http://serviceapi.parameterweb.sepro.org/}courseSubjectDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCourseSubjectServicews", propOrder = {
    "courseSubjectDto"
})
public class SearchCourseSubjectServicews {

    protected CourseSubjectDto courseSubjectDto;

    /**
     * Obtient la valeur de la propriété courseSubjectDto.
     * 
     * @return
     *     possible object is
     *     {@link CourseSubjectDto }
     *     
     */
    public CourseSubjectDto getCourseSubjectDto() {
        return courseSubjectDto;
    }

    /**
     * Définit la valeur de la propriété courseSubjectDto.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseSubjectDto }
     *     
     */
    public void setCourseSubjectDto(CourseSubjectDto value) {
        this.courseSubjectDto = value;
    }

}
