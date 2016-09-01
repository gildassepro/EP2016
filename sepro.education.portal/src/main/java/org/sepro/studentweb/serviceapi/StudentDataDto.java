
package org.sepro.studentweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour studentDataDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="studentDataDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classeProgrammDto" type="{http://serviceapi.studentweb.sepro.org/}classeProgrammDto" minOccurs="0"/>
 *         &lt;element name="studentCVDto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="studentCVDto" type="{http://serviceapi.studentweb.sepro.org/}studentCVDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="studentContactDto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="studentContactDto" type="{http://serviceapi.studentweb.sepro.org/}studentContactDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "studentDataDto", propOrder = {
    "classeProgrammDto",
    "studentCVDto",
    "studentContactDto",
    "studentDto"
})
public class StudentDataDto {

    protected ClasseProgrammDto classeProgrammDto;
    protected StudentDataDto.StudentCVDto studentCVDto;
    protected StudentDataDto.StudentContactDto studentContactDto;
    protected StudentDto studentDto;

    /**
     * Obtient la valeur de la propriété classeProgrammDto.
     * 
     * @return
     *     possible object is
     *     {@link ClasseProgrammDto }
     *     
     */
    public ClasseProgrammDto getClasseProgrammDto() {
        return classeProgrammDto;
    }

    /**
     * Définit la valeur de la propriété classeProgrammDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseProgrammDto }
     *     
     */
    public void setClasseProgrammDto(ClasseProgrammDto value) {
        this.classeProgrammDto = value;
    }

    /**
     * Obtient la valeur de la propriété studentCVDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentDataDto.StudentCVDto }
     *     
     */
    public StudentDataDto.StudentCVDto getStudentCVDto() {
        return studentCVDto;
    }

    /**
     * Définit la valeur de la propriété studentCVDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDataDto.StudentCVDto }
     *     
     */
    public void setStudentCVDto(StudentDataDto.StudentCVDto value) {
        this.studentCVDto = value;
    }

    /**
     * Obtient la valeur de la propriété studentContactDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentDataDto.StudentContactDto }
     *     
     */
    public StudentDataDto.StudentContactDto getStudentContactDto() {
        return studentContactDto;
    }

    /**
     * Définit la valeur de la propriété studentContactDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDataDto.StudentContactDto }
     *     
     */
    public void setStudentContactDto(StudentDataDto.StudentContactDto value) {
        this.studentContactDto = value;
    }

    /**
     * Obtient la valeur de la propriété studentDto.
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
     * Définit la valeur de la propriété studentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDto }
     *     
     */
    public void setStudentDto(StudentDto value) {
        this.studentDto = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="studentCVDto" type="{http://serviceapi.studentweb.sepro.org/}studentCVDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "studentCVDto"
    })
    public static class StudentCVDto {

        protected List<org.sepro.studentweb.serviceapi.StudentCVDto> studentCVDto;

        /**
         * Gets the value of the studentCVDto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studentCVDto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudentCVDto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link org.sepro.studentweb.serviceapi.StudentCVDto }
         * 
         * 
         */
        public List<org.sepro.studentweb.serviceapi.StudentCVDto> getStudentCVDto() {
            if (studentCVDto == null) {
                studentCVDto = new ArrayList<org.sepro.studentweb.serviceapi.StudentCVDto>();
            }
            return this.studentCVDto;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="studentContactDto" type="{http://serviceapi.studentweb.sepro.org/}studentContactDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "studentContactDto"
    })
    public static class StudentContactDto {

        protected List<org.sepro.studentweb.serviceapi.StudentContactDto> studentContactDto;

        /**
         * Gets the value of the studentContactDto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studentContactDto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudentContactDto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link org.sepro.studentweb.serviceapi.StudentContactDto }
         * 
         * 
         */
        public List<org.sepro.studentweb.serviceapi.StudentContactDto> getStudentContactDto() {
            if (studentContactDto == null) {
                studentContactDto = new ArrayList<org.sepro.studentweb.serviceapi.StudentContactDto>();
            }
            return this.studentContactDto;
        }

    }

}
