
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _JuroSimplesResponse_QNAME = new QName("http://service.juros.soap.ws.gus/", "juroSimplesResponse");
    private final static QName _MontanteJuroSimples_QNAME = new QName("http://service.juros.soap.ws.gus/", "montanteJuroSimples");
    private final static QName _MontanteJuroSimplesResponse_QNAME = new QName("http://service.juros.soap.ws.gus/", "montanteJuroSimplesResponse");
    private final static QName _JuroComposto_QNAME = new QName("http://service.juros.soap.ws.gus/", "juroComposto");
    private final static QName _MontanteJuroComposto_QNAME = new QName("http://service.juros.soap.ws.gus/", "montanteJuroComposto");
    private final static QName _JuroSimples_QNAME = new QName("http://service.juros.soap.ws.gus/", "juroSimples");
    private final static QName _MontanteJuroCompostoResponse_QNAME = new QName("http://service.juros.soap.ws.gus/", "montanteJuroCompostoResponse");
    private final static QName _JuroCompostoResponse_QNAME = new QName("http://service.juros.soap.ws.gus/", "juroCompostoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JuroComposto }
     * 
     */
    public JuroComposto createJuroComposto() {
        return new JuroComposto();
    }

    /**
     * Create an instance of {@link MontanteJuroComposto }
     * 
     */
    public MontanteJuroComposto createMontanteJuroComposto() {
        return new MontanteJuroComposto();
    }

    /**
     * Create an instance of {@link JuroSimplesResponse }
     * 
     */
    public JuroSimplesResponse createJuroSimplesResponse() {
        return new JuroSimplesResponse();
    }

    /**
     * Create an instance of {@link MontanteJuroSimples }
     * 
     */
    public MontanteJuroSimples createMontanteJuroSimples() {
        return new MontanteJuroSimples();
    }

    /**
     * Create an instance of {@link MontanteJuroSimplesResponse }
     * 
     */
    public MontanteJuroSimplesResponse createMontanteJuroSimplesResponse() {
        return new MontanteJuroSimplesResponse();
    }

    /**
     * Create an instance of {@link JuroSimples }
     * 
     */
    public JuroSimples createJuroSimples() {
        return new JuroSimples();
    }

    /**
     * Create an instance of {@link MontanteJuroCompostoResponse }
     * 
     */
    public MontanteJuroCompostoResponse createMontanteJuroCompostoResponse() {
        return new MontanteJuroCompostoResponse();
    }

    /**
     * Create an instance of {@link JuroCompostoResponse }
     * 
     */
    public JuroCompostoResponse createJuroCompostoResponse() {
        return new JuroCompostoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroSimplesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "juroSimplesResponse")
    public JAXBElement<JuroSimplesResponse> createJuroSimplesResponse(JuroSimplesResponse value) {
        return new JAXBElement<JuroSimplesResponse>(_JuroSimplesResponse_QNAME, JuroSimplesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteJuroSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "montanteJuroSimples")
    public JAXBElement<MontanteJuroSimples> createMontanteJuroSimples(MontanteJuroSimples value) {
        return new JAXBElement<MontanteJuroSimples>(_MontanteJuroSimples_QNAME, MontanteJuroSimples.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteJuroSimplesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "montanteJuroSimplesResponse")
    public JAXBElement<MontanteJuroSimplesResponse> createMontanteJuroSimplesResponse(MontanteJuroSimplesResponse value) {
        return new JAXBElement<MontanteJuroSimplesResponse>(_MontanteJuroSimplesResponse_QNAME, MontanteJuroSimplesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroComposto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "juroComposto")
    public JAXBElement<JuroComposto> createJuroComposto(JuroComposto value) {
        return new JAXBElement<JuroComposto>(_JuroComposto_QNAME, JuroComposto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteJuroComposto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "montanteJuroComposto")
    public JAXBElement<MontanteJuroComposto> createMontanteJuroComposto(MontanteJuroComposto value) {
        return new JAXBElement<MontanteJuroComposto>(_MontanteJuroComposto_QNAME, MontanteJuroComposto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "juroSimples")
    public JAXBElement<JuroSimples> createJuroSimples(JuroSimples value) {
        return new JAXBElement<JuroSimples>(_JuroSimples_QNAME, JuroSimples.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteJuroCompostoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "montanteJuroCompostoResponse")
    public JAXBElement<MontanteJuroCompostoResponse> createMontanteJuroCompostoResponse(MontanteJuroCompostoResponse value) {
        return new JAXBElement<MontanteJuroCompostoResponse>(_MontanteJuroCompostoResponse_QNAME, MontanteJuroCompostoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroCompostoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.juros.soap.ws.gus/", name = "juroCompostoResponse")
    public JAXBElement<JuroCompostoResponse> createJuroCompostoResponse(JuroCompostoResponse value) {
        return new JAXBElement<JuroCompostoResponse>(_JuroCompostoResponse_QNAME, JuroCompostoResponse.class, null, value);
    }

}
