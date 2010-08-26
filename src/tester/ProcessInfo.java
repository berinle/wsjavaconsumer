package tester;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ProcessInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changedParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessInfo", namespace = "http://model.wrv.fcc.gov", propOrder = {
		"changedParams", "changedValue" })
public class ProcessInfo {

	@XmlElement(nillable = true)
	protected String changedParams;
	@XmlElement(nillable = true)
	protected String changedValue;

	/**
	 * Gets the value of the changedParams property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChangedParams() {
		return changedParams;
	}

	/**
	 * Sets the value of the changedParams property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChangedParams(String value) {
		this.changedParams = value;
	}

	/**
	 * Gets the value of the changedValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChangedValue() {
		return changedValue;
	}

	/**
	 * Sets the value of the changedValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChangedValue(String value) {
		this.changedValue = value;
	}

}
