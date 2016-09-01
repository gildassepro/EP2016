
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;


/**
 * <p>Classe Java pour studentProgramDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="studentProgramDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionSteptreeDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionSteptreeDto" minOccurs="0"/>
 *         &lt;element name="studentDto" type="{http://serviceapi.studentweb.sepro.org/}studentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentProgramDto", propOrder = {
    "inscriptionSteptreeDto",
    "studentDto"
})
public class StudentProgramDto {

    protected InscriptionSteptreeDto inscriptionSteptreeDto;
    protected StudentDto studentDto;

    /**
     * Obtient la valeur de la propri�t� inscriptionSteptreeDto.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionSteptreeDto }
     *     
     */
    public InscriptionSteptreeDto getInscriptionSteptreeDto() {
        return inscriptionSteptreeDto;
    }

    /**
     * D�finit la valeur de la propri�t� inscriptionSteptreeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionSteptreeDto }
     *     
     */
    public void setInscriptionSteptreeDto(InscriptionSteptreeDto value) {
        this.inscriptionSteptreeDto = value;
    }

    /**
     * Obtient la valeur de la propri�t� studentDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentDto }
     *     
     */
    public StudentDto getStudentDto() {
        return studentDto;
    }

    /**
     * D�finit la valeur de la propri�t� studentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDto }
     *     
     */
    public void setStudentDto(StudentDto value) {
        this.studentDto = value;
    }

}
