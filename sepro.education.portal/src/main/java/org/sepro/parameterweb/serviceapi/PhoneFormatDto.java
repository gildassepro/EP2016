
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour phoneFormatDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="phoneFormatDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPhoneFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="indicatif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbr_of_digit_bloc_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbr_of_digit_bloc_9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneFormatDto", propOrder = {
    "description",
    "idPhoneFormat",
    "indicatif",
    "nbrOfDigitBloc1",
    "nbrOfDigitBloc10",
    "nbrOfDigitBloc2",
    "nbrOfDigitBloc3",
    "nbrOfDigitBloc4",
    "nbrOfDigitBloc5",
    "nbrOfDigitBloc6",
    "nbrOfDigitBloc7",
    "nbrOfDigitBloc8",
    "nbrOfDigitBloc9"
})
public class PhoneFormatDto {

    protected String description;
    protected Long idPhoneFormat;
    protected String indicatif;
    @XmlElement(name = "nbr_of_digit_bloc_1")
    protected int nbrOfDigitBloc1;
    @XmlElement(name = "nbr_of_digit_bloc_10")
    protected int nbrOfDigitBloc10;
    @XmlElement(name = "nbr_of_digit_bloc_2")
    protected int nbrOfDigitBloc2;
    @XmlElement(name = "nbr_of_digit_bloc_3")
    protected int nbrOfDigitBloc3;
    @XmlElement(name = "nbr_of_digit_bloc_4")
    protected int nbrOfDigitBloc4;
    @XmlElement(name = "nbr_of_digit_bloc_5")
    protected int nbrOfDigitBloc5;
    @XmlElement(name = "nbr_of_digit_bloc_6")
    protected int nbrOfDigitBloc6;
    @XmlElement(name = "nbr_of_digit_bloc_7")
    protected int nbrOfDigitBloc7;
    @XmlElement(name = "nbr_of_digit_bloc_8")
    protected int nbrOfDigitBloc8;
    @XmlElement(name = "nbr_of_digit_bloc_9")
    protected int nbrOfDigitBloc9;

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété idPhoneFormat.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPhoneFormat() {
        return idPhoneFormat;
    }

    /**
     * Définit la valeur de la propriété idPhoneFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPhoneFormat(Long value) {
        this.idPhoneFormat = value;
    }

    /**
     * Obtient la valeur de la propriété indicatif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatif() {
        return indicatif;
    }

    /**
     * Définit la valeur de la propriété indicatif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatif(String value) {
        this.indicatif = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc1.
     * 
     */
    public int getNbrOfDigitBloc1() {
        return nbrOfDigitBloc1;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc1.
     * 
     */
    public void setNbrOfDigitBloc1(int value) {
        this.nbrOfDigitBloc1 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc10.
     * 
     */
    public int getNbrOfDigitBloc10() {
        return nbrOfDigitBloc10;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc10.
     * 
     */
    public void setNbrOfDigitBloc10(int value) {
        this.nbrOfDigitBloc10 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc2.
     * 
     */
    public int getNbrOfDigitBloc2() {
        return nbrOfDigitBloc2;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc2.
     * 
     */
    public void setNbrOfDigitBloc2(int value) {
        this.nbrOfDigitBloc2 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc3.
     * 
     */
    public int getNbrOfDigitBloc3() {
        return nbrOfDigitBloc3;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc3.
     * 
     */
    public void setNbrOfDigitBloc3(int value) {
        this.nbrOfDigitBloc3 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc4.
     * 
     */
    public int getNbrOfDigitBloc4() {
        return nbrOfDigitBloc4;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc4.
     * 
     */
    public void setNbrOfDigitBloc4(int value) {
        this.nbrOfDigitBloc4 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc5.
     * 
     */
    public int getNbrOfDigitBloc5() {
        return nbrOfDigitBloc5;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc5.
     * 
     */
    public void setNbrOfDigitBloc5(int value) {
        this.nbrOfDigitBloc5 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc6.
     * 
     */
    public int getNbrOfDigitBloc6() {
        return nbrOfDigitBloc6;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc6.
     * 
     */
    public void setNbrOfDigitBloc6(int value) {
        this.nbrOfDigitBloc6 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc7.
     * 
     */
    public int getNbrOfDigitBloc7() {
        return nbrOfDigitBloc7;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc7.
     * 
     */
    public void setNbrOfDigitBloc7(int value) {
        this.nbrOfDigitBloc7 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc8.
     * 
     */
    public int getNbrOfDigitBloc8() {
        return nbrOfDigitBloc8;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc8.
     * 
     */
    public void setNbrOfDigitBloc8(int value) {
        this.nbrOfDigitBloc8 = value;
    }

    /**
     * Obtient la valeur de la propriété nbrOfDigitBloc9.
     * 
     */
    public int getNbrOfDigitBloc9() {
        return nbrOfDigitBloc9;
    }

    /**
     * Définit la valeur de la propriété nbrOfDigitBloc9.
     * 
     */
    public void setNbrOfDigitBloc9(int value) {
        this.nbrOfDigitBloc9 = value;
    }

}
