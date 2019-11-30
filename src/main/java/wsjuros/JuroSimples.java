
package wsjuros;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de juroSimples complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="juroSimples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "juroSimples", propOrder = {
    "capital",
    "taxa",
    "periodo"
})
public class JuroSimples {

    protected float capital;
    protected float taxa;
    protected int periodo;

    /**
     * Obtém o valor da propriedade capital.
     * 
     */
    public float getCapital() {
        return capital;
    }

    /**
     * Define o valor da propriedade capital.
     * 
     */
    public void setCapital(float value) {
        this.capital = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     */
    public float getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     */
    public void setTaxa(float value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade periodo.
     * 
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     */
    public void setPeriodo(int value) {
        this.periodo = value;
    }

}
