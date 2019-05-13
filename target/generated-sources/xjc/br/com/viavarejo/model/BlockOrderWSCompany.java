//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.12 às 11:14:55 PM BRT 
//


package br.com.viavarejo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de blockOrderWSCompany complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="blockOrderWSCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blockImeiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="massiveData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="occurCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occurState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policeDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requesterDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockOrderWSCompany", propOrder = {
    "blockImeiNumber",
    "blockReason",
    "blockTypeId",
    "contactPhone",
    "deviceModel",
    "manufacturer",
    "massiveData",
    "occurCity",
    "occurDate",
    "occurState",
    "ownerDocumentNumber",
    "policeDept",
    "policeId",
    "requesterDocumentNumber"
})
@XmlSeeAlso({
    BlockOrderUnboundWSInCompany.class
})
public class BlockOrderWSCompany {

    protected String blockImeiNumber;
    protected String blockReason;
    protected String blockTypeId;
    protected String contactPhone;
    protected String deviceModel;
    protected String manufacturer;
    protected byte[] massiveData;
    protected String occurCity;
    protected String occurDate;
    protected String occurState;
    protected String ownerDocumentNumber;
    protected String policeDept;
    protected String policeId;
    protected String requesterDocumentNumber;

    /**
     * Obtém o valor da propriedade blockImeiNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockImeiNumber() {
        return blockImeiNumber;
    }

    /**
     * Define o valor da propriedade blockImeiNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockImeiNumber(String value) {
        this.blockImeiNumber = value;
    }

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
     * Obtém o valor da propriedade blockTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockTypeId() {
        return blockTypeId;
    }

    /**
     * Define o valor da propriedade blockTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockTypeId(String value) {
        this.blockTypeId = value;
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
     * Obtém o valor da propriedade deviceModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * Define o valor da propriedade deviceModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceModel(String value) {
        this.deviceModel = value;
    }

    /**
     * Obtém o valor da propriedade manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define o valor da propriedade manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtém o valor da propriedade massiveData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMassiveData() {
        return massiveData;
    }

    /**
     * Define o valor da propriedade massiveData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMassiveData(byte[] value) {
        this.massiveData = value;
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

}
