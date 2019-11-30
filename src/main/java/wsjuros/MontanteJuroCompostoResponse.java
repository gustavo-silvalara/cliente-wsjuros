
package wsjuros;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de montanteJuroCompostoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="montanteJuroCompostoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "montanteJuroCompostoResponse", propOrder = {
    "_return"
})
public class MontanteJuroCompostoResponse {

    @XmlElement(name = "return")
    protected float _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     */
    public float getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     */
    public void setReturn(float value) {
        this._return = value;
    }

}
