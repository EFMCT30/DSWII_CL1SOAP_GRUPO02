//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.29 at 10:51:30 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pacientews complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pacientews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpaciente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nompaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apepaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docpaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechanacpaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailpaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacientews", propOrder = {
    "idpaciente",
    "nompaciente",
    "apepaciente",
    "docpaciente",
    "fechanacpaciente",
    "emailpaciente"
})
public class Pacientews {

    protected int idpaciente;
    @XmlElement(required = true)
    protected String nompaciente;
    @XmlElement(required = true)
    protected String apepaciente;
    @XmlElement(required = true)
    protected String docpaciente;
    @XmlElement(required = true)
    protected String fechanacpaciente;
    @XmlElement(required = true)
    protected String emailpaciente;

    /**
     * Gets the value of the idpaciente property.
     * 
     */
    public int getIdpaciente() {
        return idpaciente;
    }

    /**
     * Sets the value of the idpaciente property.
     * 
     */
    public void setIdpaciente(int value) {
        this.idpaciente = value;
    }

    /**
     * Gets the value of the nompaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNompaciente() {
        return nompaciente;
    }

    /**
     * Sets the value of the nompaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNompaciente(String value) {
        this.nompaciente = value;
    }

    /**
     * Gets the value of the apepaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApepaciente() {
        return apepaciente;
    }

    /**
     * Sets the value of the apepaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApepaciente(String value) {
        this.apepaciente = value;
    }

    /**
     * Gets the value of the docpaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocpaciente() {
        return docpaciente;
    }

    /**
     * Sets the value of the docpaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocpaciente(String value) {
        this.docpaciente = value;
    }

    /**
     * Gets the value of the fechanacpaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechanacpaciente() {
        return fechanacpaciente;
    }

    /**
     * Sets the value of the fechanacpaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechanacpaciente(String value) {
        this.fechanacpaciente = value;
    }

    /**
     * Gets the value of the emailpaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailpaciente() {
        return emailpaciente;
    }

    /**
     * Sets the value of the emailpaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailpaciente(String value) {
        this.emailpaciente = value;
    }

}
