package driver;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import tester.BiddingDashboardService;
import tester.BiddingDashboardServicePortType;
import tester.WrvEvent;

public class Consumer {
	public static void main(String[] args) throws Exception {
		BiddingDashboardService bds = new BiddingDashboardService();
		BiddingDashboardServicePortType port = bds.getBiddingDashboardServiceHttpPort();
		System.out.println(" start call ");
		port.verifyWS();
		
		WrvEvent event = new WrvEvent();
		event.setAuctionId(2009);
		event.setCurrentRound(99);
		event.setStatusDesc("testing");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date()); //set time to something meaning full
		XMLGregorianCalendar xc = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		event.setTimeStamp(xc);
		
		port.sendTestEvent(event);
		
		System.out.println(" done ");
	}
}
