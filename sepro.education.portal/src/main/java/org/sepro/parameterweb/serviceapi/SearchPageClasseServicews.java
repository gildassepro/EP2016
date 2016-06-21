
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPageClasseServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPageClasseServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classeDto" type="{http://serviceapi.parameterweb.sepro.org/}classeDto" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPageClasseServicews", propOrder = {
    "classeDto",
    "page",
    "pageSize"
})
public class SearchPageClasseServicews {

    protected ClasseDto classeDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propriété classeDto.
     * 
     * @return
     *     possible object is
     *     {@link ClasseDto }
     *     
     */
    public ClasseDto getClasseDto() {
        return classeDto;
    }

    /**
     * Définit la valeur de la propriété classeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseDto }
     *     
     */
    public void setClasseDto(ClasseDto value) {
        this.classeDto = value;
    }

    /**
     * Obtient la valeur de la propriété page.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Définit la valeur de la propriété page.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Obtient la valeur de la propriété pageSize.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Définit la valeur de la propriété pageSize.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
