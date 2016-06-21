
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPagePhoneFormatServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPagePhoneFormatServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneFormatDto" type="{http://serviceapi.parameterweb.sepro.org/}phoneFormatDto" minOccurs="0"/>
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
@XmlType(name = "searchPagePhoneFormatServicews", propOrder = {
    "phoneFormatDto",
    "page",
    "pageSize"
})
public class SearchPagePhoneFormatServicews {

    protected PhoneFormatDto phoneFormatDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propriété phoneFormatDto.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFormatDto }
     *     
     */
    public PhoneFormatDto getPhoneFormatDto() {
        return phoneFormatDto;
    }

    /**
     * Définit la valeur de la propriété phoneFormatDto.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFormatDto }
     *     
     */
    public void setPhoneFormatDto(PhoneFormatDto value) {
        this.phoneFormatDto = value;
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
