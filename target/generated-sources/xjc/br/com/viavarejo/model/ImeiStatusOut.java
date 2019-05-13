//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.12 às 11:14:55 PM BRT 
//


package br.com.viavarejo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de imeiStatusOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="imeiStatusOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lockDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imeiStatusOut", propOrder = {
    "entityName",
    "imei",
    "lockDate",
    "returnedMessage"
})
public class ImeiStatusOut {

    protected String entityName;
    protected String imei;
    protected String lockDate;
    protected String returnedMessage;

    /**
     * Obtém o valor da propriedade entityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Define o valor da propriedade entityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Obtém o valor da propriedade imei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Define o valor da propriedade imei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Obtém o valor da propriedade lockDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockDate() {
        return lockDate;
    }

    /**
     * Define o valor da propriedade lockDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockDate(String value) {
        this.lockDate = value;
    }

    /**
     * Obtém o valor da propriedade returnedMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnedMessage() {
        return returnedMessage;
    }

    /**
     * Define o valor da propriedade returnedMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnedMessage(String value) {
        this.returnedMessage = value;
    }

}
