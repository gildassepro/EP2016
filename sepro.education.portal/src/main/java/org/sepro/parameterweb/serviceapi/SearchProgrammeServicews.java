
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchProgrammeServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchProgrammeServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programmeDto" type="{http://serviceapi.parameterweb.sepro.org/}programmeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchProgrammeServicews", propOrder = {
    "programmeDto"
})
public class SearchProgrammeServicews {

    protected ProgrammeDto programmeDto;

    /**
     * Obtient la valeur de la propriété programmeDto.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeDto }
     *     
     */
    public ProgrammeDto getProgrammeDto() {
        return programmeDto;
    }

    /**
     * Définit la valeur de la propriété programmeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeDto }
     *     
     */
    public void setProgrammeDto(ProgrammeDto value) {
        this.programmeDto = value;
    }

}
