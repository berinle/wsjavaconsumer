package gov.fcc.wrv.model.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EligWavierInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EligWavierInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentElig" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="eligReduced" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="initialElig" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numWaivers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="openElig" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rmngWaivers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligWavierInfo", namespace = "http://model.wrv.fcc.gov", propOrder = {
		"currentElig", "eligReduced", "initialElig", "numWaivers", "openElig",
		"rmngWaivers" })
public class EligWavierInfo {

	protected Long currentElig;
	protected Long eligReduced;
	protected Long initialElig;
	protected Integer numWaivers;
	protected Long openElig;
	protected Integer rmngWaivers;

	/**
	 * Gets the value of the currentElig property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCurrentElig() {
		return currentElig;
	}

	/**
	 * Sets the value of the currentElig property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCurrentElig(Long value) {
		this.currentElig = value;
	}

	/**
	 * Gets the value of the eligReduced property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getEligReduced() {
		return eligReduced;
	}

	/**
	 * Sets the value of the eligReduced property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setEligReduced(Long value) {
		this.eligReduced = value;
	}

	/**
	 * Gets the value of the initialElig property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getInitialElig() {
		return initialElig;
	}

	/**
	 * Sets the value of the initialElig property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setInitialElig(Long value) {
		this.initialElig = value;
	}

	/**
	 * Gets the value of the numWaivers property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumWaivers() {
		return numWaivers;
	}

	/**
	 * Sets the value of the numWaivers property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumWaivers(Integer value) {
		this.numWaivers = value;
	}

	/**
	 * Gets the value of the openElig property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getOpenElig() {
		return openElig;
	}

	/**
	 * Sets the value of the openElig property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setOpenElig(Long value) {
		this.openElig = value;
	}

	/**
	 * Gets the value of the rmngWaivers property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRmngWaivers() {
		return rmngWaivers;
	}

	/**
	 * Sets the value of the rmngWaivers property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRmngWaivers(Integer value) {
		this.rmngWaivers = value;
	}

}
