
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPageLanguageServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPageLanguageServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageDto" type="{http://serviceapi.parameterweb.sepro.org/}languageDto" minOccurs="0"/>
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
@XmlType(name = "searchPageLanguageServicews", propOrder = {
    "languageDto",
    "page",
    "pageSize"
})
public class SearchPageLanguageServicews {

    protected LanguageDto languageDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propri�t� languageDto.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDto }
     *     
     */
    public LanguageDto getLanguageDto() {
        return languageDto;
    }

    /**
     * D�finit la valeur de la propri�t� languageDto.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDto }
     *     
     */
    public void setLanguageDto(LanguageDto value) {
        this.languageDto = value;
    }

    /**
     * Obtient la valeur de la propri�t� page.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * D�finit la valeur de la propri�t� page.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Obtient la valeur de la propri�t� pageSize.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * D�finit la valeur de la propri�t� pageSize.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
