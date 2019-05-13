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
 * <p>Classe Java de blockOrderUnboundWSInCompany complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="blockOrderUnboundWSInCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.cemiseguranca.cms.hpe.com/}blockOrderWSCompany"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letter" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="requesterDocumentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockOrderUnboundWSInCompany", propOrder = {
    "invoice",
    "letter",
    "requesterDocumentTypeId"
})
public class BlockOrderUnboundWSInCompany
    extends BlockOrderWSCompany
{

    protected String invoice;
    protected byte[] letter;
    protected String requesterDocumentTypeId;

    /**
     * Obtém o valor da propriedade invoice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * Define o valor da propriedade invoice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice(String value) {
        this.invoice = value;
    }

    /**
     * Obtém o valor da propriedade letter.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLetter() {
        return letter;
    }

    /**
     * Define o valor da propriedade letter.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLetter(byte[] value) {
        this.letter = value;
    }

    /**
     * Obtém o valor da propriedade requesterDocumentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterDocumentTypeId() {
        return requesterDocumentTypeId;
    }

    /**
     * Define o valor da propriedade requesterDocumentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterDocumentTypeId(String value) {
        this.requesterDocumentTypeId = value;
    }

}
