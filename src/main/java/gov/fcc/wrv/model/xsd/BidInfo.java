package gov.fcc.wrv.model.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BidInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BidInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bipDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numBids" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidInfo", namespace = "http://model.wrv.fcc.gov", propOrder = {
		"amount", "bipDesc", "bipName", "numBids" })
public class BidInfo {

	protected Long amount;
	@XmlElement(nillable = true)
	protected String bipDesc;
	@XmlElement(nillable = true)
	protected String bipName;
	protected Integer numBids;

	/**
	 * Gets the value of the amount property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setAmount(Long value) {
		this.amount = value;
	}

	/**
	 * Gets the value of the bipDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBipDesc() {
		return bipDesc;
	}

	/**
	 * Sets the value of the bipDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBipDesc(String value) {
		this.bipDesc = value;
	}

	/**
	 * Gets the value of the bipName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBipName() {
		return bipName;
	}

	/**
	 * Sets the value of the bipName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBipName(String value) {
		this.bipName = value;
	}

	/**
	 * Gets the value of the numBids property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumBids() {
		return numBids;
	}

	/**
	 * Sets the value of the numBids property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumBids(Integer value) {
		this.numBids = value;
	}

}
