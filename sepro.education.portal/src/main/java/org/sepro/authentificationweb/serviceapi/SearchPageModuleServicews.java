
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPageModuleServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPageModuleServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduleDto" type="{http://serviceapi.authentificationweb.sepro.org/}moduleDto" minOccurs="0"/>
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
@XmlType(name = "searchPageModuleServicews", propOrder = {
    "moduleDto",
    "page",
    "pageSize"
})
public class SearchPageModuleServicews {

    protected ModuleDto moduleDto;
    protected int page;
    protected int pageSize;

    /**
     * Obtient la valeur de la propriété moduleDto.
     * 
     * @return
     *     possible object is
     *     {@link ModuleDto }
     *     
     */
    public ModuleDto getModuleDto() {
        return moduleDto;
    }

    /**
     * Définit la valeur de la propriété moduleDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleDto }
     *     
     */
    public void setModuleDto(ModuleDto value) {
        this.moduleDto = value;
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
