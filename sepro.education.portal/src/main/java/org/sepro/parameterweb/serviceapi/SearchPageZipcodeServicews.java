
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPageZipcodeServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPageZipcodeServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zipcodeDto" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
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
@XmlType(name = "searchPageZipcodeServicews", propOrder = {
    "zipcodeDto",
    "page",
    "pageSize"
})
public class SearchPageZipcodeServicews {

    protected ZipcodeDto zipcodeDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propriété zipcodeDto.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getZipcodeDto() {
        return zipcodeDto;
    }

    /**
     * Définit la valeur de la propriété zipcodeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setZipcodeDto(ZipcodeDto value) {
        this.zipcodeDto = value;
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
