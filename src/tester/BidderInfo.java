package tester;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BidderInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BidderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bidderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="frn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidderInfo", namespace = "http://model.wrv.fcc.gov", propOrder = {
		"bidderId", "frn", "name" })
public class BidderInfo {

	protected Integer bidderId;
	@XmlElement(nillable = true)
	protected String frn;
	@XmlElement(nillable = true)
	protected String name;

	/**
	 * Gets the value of the bidderId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getBidderId() {
		return bidderId;
	}

	/**
	 * Sets the value of the bidderId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setBidderId(Integer value) {
		this.bidderId = value;
	}

	/**
	 * Gets the value of the frn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFrn() {
		return frn;
	}

	/**
	 * Sets the value of the frn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFrn(String value) {
		this.frn = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

}
