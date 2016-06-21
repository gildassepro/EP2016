
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPageMenuServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPageMenuServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="menuDto" type="{http://serviceapi.authentificationweb.sepro.org/}menuDto" minOccurs="0"/>
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
@XmlType(name = "searchPageMenuServicews", propOrder = {
    "menuDto",
    "page",
    "pageSize"
})
public class SearchPageMenuServicews {

    protected MenuDto menuDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propri�t� menuDto.
     * 
     * @return
     *     possible object is
     *     {@link MenuDto }
     *     
     */
    public MenuDto getMenuDto() {
        return menuDto;
    }

    /**
     * D�finit la valeur de la propri�t� menuDto.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuDto }
     *     
     */
    public void setMenuDto(MenuDto value) {
        this.menuDto = value;
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
