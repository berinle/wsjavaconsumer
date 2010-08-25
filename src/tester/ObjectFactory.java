package tester;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the tester package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: tester
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link VerifyWSResponse }
	 * 
	 */
	public VerifyWSResponse createVerifyWSResponse() {
		return new VerifyWSResponse();
	}

	/**
	 * Create an instance of {@link EligWavierInfo }
	 * 
	 */
	public EligWavierInfo createEligWavierInfo() {
		return new EligWavierInfo();
	}

	/**
	 * Create an instance of {@link VerifyWS }
	 * 
	 */
	public VerifyWS createVerifyWS() {
		return new VerifyWS();
	}

	/**
	 * Create an instance of {@link BidderInfo }
	 * 
	 */
	public BidderInfo createBidderInfo() {
		return new BidderInfo();
	}

	/**
	 * Create an instance of {@link ProcessInfo }
	 * 
	 */
	public ProcessInfo createProcessInfo() {
		return new ProcessInfo();
	}

	/**
	 * Create an instance of {@link WrvEvent }
	 * 
	 */
	public WrvEvent createWrvEvent() {
		return new WrvEvent();
	}

	/**
	 * Create an instance of {@link BidInfo }
	 * 
	 */
	public BidInfo createBidInfo() {
		return new BidInfo();
	}

	/**
	 * Create an instance of {@link SendTestEventResponse }
	 * 
	 */
	public SendTestEventResponse createSendTestEventResponse() {
		return new SendTestEventResponse();
	}

	/**
	 * Create an instance of {@link SendTestEvent }
	 * 
	 */
	public SendTestEvent createSendTestEvent() {
		return new SendTestEvent();
	}

	/**
	 * Create an instance of {@link SendEventResponse }
	 * 
	 */
	public SendEventResponse createSendEventResponse() {
		return new SendEventResponse();
	}

	/**
	 * Create an instance of {@link SendEvent }
	 * 
	 */
	public SendEvent createSendEvent() {
		return new SendEvent();
	}

}
