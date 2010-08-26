package driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import gov.fcc.wrv.client.WebServiceConsumer;
import gov.fcc.wrv.model.xsd.WrvEvent;

public class Util {

	public static void main(String[] args) throws Exception {
		WebServiceConsumer client = new WebServiceConsumer();
		List<String> uriList = new ArrayList<String>();
		uriList.add("http://localhost:7777/wrv/services/DashboardService?wsdl");
		uriList.add("http://salcha.fcc.gov:8074/axis2/services/EventInterfaceService?wsdl");
		
		WrvEvent event = new WrvEvent();
		event.setAuctionId(2009);
		event.setCurrentRound(99);
		event.setStatusDesc("testing");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date()); //set time to something meaning full
		//XMLGregorianCalendar xc = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		event.setTimeStamp(c);
		
		
		client.sendEvent(event, uriList);
	}
}
