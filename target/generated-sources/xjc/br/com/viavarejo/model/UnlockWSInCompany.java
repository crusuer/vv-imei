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
 * <p>Classe Java de unlockWSInCompany complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="unlockWSInCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="massiveData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="protocolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unlockReasonDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unlockReasonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unlockWSInCompany", propOrder = {
    "imei",
    "massiveData",
    "protocolNumber",
    "unlockReasonDetail",
    "unlockReasonId"
})
public class UnlockWSInCompany {

    protected String imei;
    protected byte[] massiveData;
    protected String protocolNumber;
    protected String unlockReasonDetail;
    protected String unlockReasonId;

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
     * Obtém o valor da propriedade unlockReasonDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlockReasonDetail() {
        return unlockReasonDetail;
    }

    /**
     * Define o valor da propriedade unlockReasonDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlockReasonDetail(String value) {
        this.unlockReasonDetail = value;
    }

    /**
     * Obtém o valor da propriedade unlockReasonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlockReasonId() {
        return unlockReasonId;
    }

    /**
     * Define o valor da propriedade unlockReasonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlockReasonId(String value) {
        this.unlockReasonId = value;
    }

}
