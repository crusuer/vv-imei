//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.12 às 11:14:55 PM BRT 
//


package br.com.viavarejo.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.viavarejo.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateBlockOrderUnboundService_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "createBlockOrderUnboundService");
    private final static QName _CreateBlockOrderUnboundServiceResponse_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "createBlockOrderUnboundServiceResponse");
    private final static QName _GetStatusIMEI_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "getStatusIMEI");
    private final static QName _GetStatusIMEIResponse_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "getStatusIMEIResponse");
    private final static QName _GetStatusService_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "getStatusService");
    private final static QName _GetStatusServiceResponse_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "getStatusServiceResponse");
    private final static QName _UnlockBlockOrderService_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "unlockBlockOrderService");
    private final static QName _UnlockBlockOrderServiceResponse_QNAME = new QName("http://ws.cemiseguranca.cms.hpe.com/", "unlockBlockOrderServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.viavarejo.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBlockOrderUnboundService }
     * 
     */
    public CreateBlockOrderUnboundService createCreateBlockOrderUnboundService() {
        return new CreateBlockOrderUnboundService();
    }

    /**
     * Create an instance of {@link CreateBlockOrderUnboundServiceResponse }
     * 
     */
    public CreateBlockOrderUnboundServiceResponse createCreateBlockOrderUnboundServiceResponse() {
        return new CreateBlockOrderUnboundServiceResponse();
    }

    /**
     * Create an instance of {@link GetStatusIMEI }
     * 
     */
    public GetStatusIMEI createGetStatusIMEI() {
        return new GetStatusIMEI();
    }

    /**
     * Create an instance of {@link GetStatusIMEIResponse }
     * 
     */
    public GetStatusIMEIResponse createGetStatusIMEIResponse() {
        return new GetStatusIMEIResponse();
    }

    /**
     * Create an instance of {@link GetStatusService }
     * 
     */
    public GetStatusService createGetStatusService() {
        return new GetStatusService();
    }

    /**
     * Create an instance of {@link GetStatusServiceResponse }
     * 
     */
    public GetStatusServiceResponse createGetStatusServiceResponse() {
        return new GetStatusServiceResponse();
    }

    /**
     * Create an instance of {@link UnlockBlockOrderService }
     * 
     */
    public UnlockBlockOrderService createUnlockBlockOrderService() {
        return new UnlockBlockOrderService();
    }

    /**
     * Create an instance of {@link UnlockBlockOrderServiceResponse }
     * 
     */
    public UnlockBlockOrderServiceResponse createUnlockBlockOrderServiceResponse() {
        return new UnlockBlockOrderServiceResponse();
    }

    /**
     * Create an instance of {@link ImeiStatusIn }
     * 
     */
    public ImeiStatusIn createImeiStatusIn() {
        return new ImeiStatusIn();
    }

    /**
     * Create an instance of {@link ImeiStatusOut }
     * 
     */
    public ImeiStatusOut createImeiStatusOut() {
        return new ImeiStatusOut();
    }

    /**
     * Create an instance of {@link CemisspSearchInCompany }
     * 
     */
    public CemisspSearchInCompany createCemisspSearchInCompany() {
        return new CemisspSearchInCompany();
    }

    /**
     * Create an instance of {@link CemisspSearchOutCompany }
     * 
     */
    public CemisspSearchOutCompany createCemisspSearchOutCompany() {
        return new CemisspSearchOutCompany();
    }

    /**
     * Create an instance of {@link CemisspWSOut }
     * 
     */
    public CemisspWSOut createCemisspWSOut() {
        return new CemisspWSOut();
    }

    /**
     * Create an instance of {@link UnlockWSInCompany }
     * 
     */
    public UnlockWSInCompany createUnlockWSInCompany() {
        return new UnlockWSInCompany();
    }

    /**
     * Create an instance of {@link BlockOrderWSOut }
     * 
     */
    public BlockOrderWSOut createBlockOrderWSOut() {
        return new BlockOrderWSOut();
    }

    /**
     * Create an instance of {@link BlockOrderUnboundWSInCompany }
     * 
     */
    public BlockOrderUnboundWSInCompany createBlockOrderUnboundWSInCompany() {
        return new BlockOrderUnboundWSInCompany();
    }

    /**
     * Create an instance of {@link BlockOrderWSCompany }
     * 
     */
    public BlockOrderWSCompany createBlockOrderWSCompany() {
        return new BlockOrderWSCompany();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBlockOrderUnboundService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBlockOrderUnboundService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "createBlockOrderUnboundService")
    public JAXBElement<CreateBlockOrderUnboundService> createCreateBlockOrderUnboundService(CreateBlockOrderUnboundService value) {
        return new JAXBElement<CreateBlockOrderUnboundService>(_CreateBlockOrderUnboundService_QNAME, CreateBlockOrderUnboundService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBlockOrderUnboundServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBlockOrderUnboundServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "createBlockOrderUnboundServiceResponse")
    public JAXBElement<CreateBlockOrderUnboundServiceResponse> createCreateBlockOrderUnboundServiceResponse(CreateBlockOrderUnboundServiceResponse value) {
        return new JAXBElement<CreateBlockOrderUnboundServiceResponse>(_CreateBlockOrderUnboundServiceResponse_QNAME, CreateBlockOrderUnboundServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusIMEI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusIMEI }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "getStatusIMEI")
    public JAXBElement<GetStatusIMEI> createGetStatusIMEI(GetStatusIMEI value) {
        return new JAXBElement<GetStatusIMEI>(_GetStatusIMEI_QNAME, GetStatusIMEI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusIMEIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusIMEIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "getStatusIMEIResponse")
    public JAXBElement<GetStatusIMEIResponse> createGetStatusIMEIResponse(GetStatusIMEIResponse value) {
        return new JAXBElement<GetStatusIMEIResponse>(_GetStatusIMEIResponse_QNAME, GetStatusIMEIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "getStatusService")
    public JAXBElement<GetStatusService> createGetStatusService(GetStatusService value) {
        return new JAXBElement<GetStatusService>(_GetStatusService_QNAME, GetStatusService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "getStatusServiceResponse")
    public JAXBElement<GetStatusServiceResponse> createGetStatusServiceResponse(GetStatusServiceResponse value) {
        return new JAXBElement<GetStatusServiceResponse>(_GetStatusServiceResponse_QNAME, GetStatusServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockBlockOrderService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnlockBlockOrderService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "unlockBlockOrderService")
    public JAXBElement<UnlockBlockOrderService> createUnlockBlockOrderService(UnlockBlockOrderService value) {
        return new JAXBElement<UnlockBlockOrderService>(_UnlockBlockOrderService_QNAME, UnlockBlockOrderService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockBlockOrderServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnlockBlockOrderServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cemiseguranca.cms.hpe.com/", name = "unlockBlockOrderServiceResponse")
    public JAXBElement<UnlockBlockOrderServiceResponse> createUnlockBlockOrderServiceResponse(UnlockBlockOrderServiceResponse value) {
        return new JAXBElement<UnlockBlockOrderServiceResponse>(_UnlockBlockOrderServiceResponse_QNAME, UnlockBlockOrderServiceResponse.class, null, value);
    }

}
