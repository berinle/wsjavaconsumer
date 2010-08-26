package gov.fcc.wrv.model.xsd;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for WrvEvent complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WrvEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auctionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bidInfo" type="{http://model.wrv.fcc.gov}BidInfo" minOccurs="0"/>
 *         &lt;element name="bidderInfo" type="{http://model.wrv.fcc.gov}BidderInfo" minOccurs="0"/>
 *         &lt;element name="currentRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eligWaiverInfo" type="{http://model.wrv.fcc.gov}EligWavierInfo" minOccurs="0"/>
 *         &lt;element name="eventDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processInfo" type="{http://model.wrv.fcc.gov}ProcessInfo" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrvEvent", namespace = "http://model.wrv.fcc.gov", propOrder = {
		"auctionId", "bidInfo", "bidderInfo", "currentRound", "eligWaiverInfo",
		"eventDesc", "eventSender", "eventType", "processInfo", "status",
		"statusDesc", "timeStamp" })
public class WrvEvent {

	protected Integer auctionId;
	@XmlElement(nillable = true)
	protected BidInfo bidInfo;
	@XmlElement(nillable = true)
	protected BidderInfo bidderInfo;
	protected Integer currentRound;
	@XmlElement(nillable = true)
	protected EligWavierInfo eligWaiverInfo;
	@XmlElement(nillable = true)
	protected String eventDesc;
	@XmlElement(nillable = true)
	protected String eventSender;
	@XmlElement(nillable = true)
	protected String eventType;
	@XmlElement(nillable = true)
	protected ProcessInfo processInfo;
	protected Integer status;
	@XmlElement(nillable = true)
	protected String statusDesc;
	@XmlElement(type = String.class)
	@XmlJavaTypeAdapter(Adapter1.class)
	@XmlSchemaType(name = "dateTime")
	protected Calendar timeStamp;

	/**
	 * Gets the value of the auctionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAuctionId() {
		return auctionId;
	}

	/**
	 * Sets the value of the auctionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAuctionId(Integer value) {
		this.auctionId = value;
	}

	/**
	 * Gets the value of the bidInfo property.
	 * 
	 * @return possible object is {@link BidInfo }
	 * 
	 */
	public BidInfo getBidInfo() {
		return bidInfo;
	}

	/**
	 * Sets the value of the bidInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link BidInfo }
	 * 
	 */
	public void setBidInfo(BidInfo value) {
		this.bidInfo = value;
	}

	/**
	 * Gets the value of the bidderInfo property.
	 * 
	 * @return possible object is {@link BidderInfo }
	 * 
	 */
	public BidderInfo getBidderInfo() {
		return bidderInfo;
	}

	/**
	 * Sets the value of the bidderInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link BidderInfo }
	 * 
	 */
	public void setBidderInfo(BidderInfo value) {
		this.bidderInfo = value;
	}

	/**
	 * Gets the value of the currentRound property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCurrentRound() {
		return currentRound;
	}

	/**
	 * Sets the value of the currentRound property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCurrentRound(Integer value) {
		this.currentRound = value;
	}

	/**
	 * Gets the value of the eligWaiverInfo property.
	 * 
	 * @return possible object is {@link EligWavierInfo }
	 * 
	 */
	public EligWavierInfo getEligWaiverInfo() {
		return eligWaiverInfo;
	}

	/**
	 * Sets the value of the eligWaiverInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link EligWavierInfo }
	 * 
	 */
	public void setEligWaiverInfo(EligWavierInfo value) {
		this.eligWaiverInfo = value;
	}

	/**
	 * Gets the value of the eventDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventDesc() {
		return eventDesc;
	}

	/**
	 * Sets the value of the eventDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventDesc(String value) {
		this.eventDesc = value;
	}

	/**
	 * Gets the value of the eventSender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventSender() {
		return eventSender;
	}

	/**
	 * Sets the value of the eventSender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventSender(String value) {
		this.eventSender = value;
	}

	/**
	 * Gets the value of the eventType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Sets the value of the eventType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventType(String value) {
		this.eventType = value;
	}

	/**
	 * Gets the value of the processInfo property.
	 * 
	 * @return possible object is {@link ProcessInfo }
	 * 
	 */
	public ProcessInfo getProcessInfo() {
		return processInfo;
	}

	/**
	 * Sets the value of the processInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link ProcessInfo }
	 * 
	 */
	public void setProcessInfo(ProcessInfo value) {
		this.processInfo = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStatus(Integer value) {
		this.status = value;
	}

	/**
	 * Gets the value of the statusDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/**
	 * Sets the value of the statusDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatusDesc(String value) {
		this.statusDesc = value;
	}

	/**
	 * Gets the value of the timeStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public Calendar getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the timeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTimeStamp(Calendar value) {
		this.timeStamp = value;
	}

}
