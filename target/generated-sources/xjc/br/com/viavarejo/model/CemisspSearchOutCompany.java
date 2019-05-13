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
 * <p>Classe Java de cemisspSearchOutCompany complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cemisspSearchOutCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.cemiseguranca.cms.hpe.com/}cemisspWSOut"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blockReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policeDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protocolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requesterDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requesterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cemisspSearchOutCompany", propOrder = {
    "blockReason",
    "blockType",
    "contactPhone",
    "lastUpdate",
    "occurCity",
    "occurDate",
    "occurState",
    "orderStatus",
    "ownerDocumentNumber",
    "ownerName",
    "policeDept",
    "policeId",
    "protocolNumber",
    "requesterDocumentNumber",
    "requesterName"
})
public class CemisspSearchOutCompany
    extends CemisspWSOut
{

    protected String blockReason;
    protected String blockType;
    protected String contactPhone;
    protected String lastUpdate;
    protected String occurCity;
    protected String occurDate;
    protected String occurState;
    protected String orderStatus;
    protected String ownerDocumentNumber;
    protected String ownerName;
    protected String policeDept;
    protected String policeId;
    protected String protocolNumber;
    protected String requesterDocumentNumber;
    protected String requesterName;

    /**
     * Obtém o valor da propriedade blockReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockReason() {
        return blockReason;
    }

    /**
     * Define o valor da propriedade blockReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockReason(String value) {
        this.blockReason = value;
    }

    /**
     * Obtém o valor da propriedade blockType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockType() {
        return blockType;
    }

    /**
     * Define o valor da propriedade blockType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockType(String value) {
        this.blockType = value;
    }

    /**
     * Obtém o valor da propriedade contactPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Define o valor da propriedade contactPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Obtém o valor da propriedade lastUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Define o valor da propriedade lastUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

    /**
     * Obtém o valor da propriedade occurCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurCity() {
        return occurCity;
    }

    /**
     * Define o valor da propriedade occurCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurCity(String value) {
        this.occurCity = value;
    }

    /**
     * Obtém o valor da propriedade occurDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurDate() {
        return occurDate;
    }

    /**
     * Define o valor da propriedade occurDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurDate(String value) {
        this.occurDate = value;
    }

    /**
     * Obtém o valor da propriedade occurState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurState() {
        return occurState;
    }

    /**
     * Define o valor da propriedade occurState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurState(String value) {
        this.occurState = value;
    }

    /**
     * Obtém o valor da propriedade orderStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Define o valor da propriedade orderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Obtém o valor da propriedade ownerDocumentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerDocumentNumber() {
        return ownerDocumentNumber;
    }

    /**
     * Define o valor da propriedade ownerDocumentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerDocumentNumber(String value) {
        this.ownerDocumentNumber = value;
    }

    /**
     * Obtém o valor da propriedade ownerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Define o valor da propriedade ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Obtém o valor da propriedade policeDept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceDept() {
        return policeDept;
    }

    /**
     * Define o valor da propriedade policeDept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceDept(String value) {
        this.policeDept = value;
    }

    /**
     * Obtém o valor da propriedade policeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliceId() {
        return policeId;
    }

    /**
     * Define o valor da propriedade policeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliceId(String value) {
        this.policeId = value;
    }

    /**
     * Obtém o valor da propriedade protocolNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Define o valor da propriedade protocolNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumber(String value) {
        this.protocolNumber = value;
    }

    /**
     * Obtém o valor da propriedade requesterDocumentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterDocumentNumber() {
        return requesterDocumentNumber;
    }

    /**
     * Define o valor da propriedade requesterDocumentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterDocumentNumber(String value) {
        this.requesterDocumentNumber = value;
    }

    /**
     * Obtém o valor da propriedade requesterName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterName() {
        return requesterName;
    }

    /**
     * Define o valor da propriedade requesterName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterName(String value) {
        this.requesterName = value;
    }

}
