
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createProgrammeCalendarervicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createProgrammeCalendarervicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programmeCalendarDto" type="{http://serviceapi.parameterweb.sepro.org/}programmeCalendarDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createProgrammeCalendarervicews", propOrder = {
    "programmeCalendarDto"
})
public class CreateProgrammeCalendarervicews {

    protected ProgrammeCalendarDto programmeCalendarDto;

    /**
     * Obtient la valeur de la propriété programmeCalendarDto.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeCalendarDto }
     *     
     */
    public ProgrammeCalendarDto getProgrammeCalendarDto() {
        return programmeCalendarDto;
    }

    /**
     * Définit la valeur de la propriété programmeCalendarDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeCalendarDto }
     *     
     */
    public void setProgrammeCalendarDto(ProgrammeCalendarDto value) {
        this.programmeCalendarDto = value;
    }

}
