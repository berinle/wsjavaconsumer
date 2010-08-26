package gov.fcc.wrv.client;

import gov.fcc.wrv.model.xsd.BiddingDashboardService;
import gov.fcc.wrv.model.xsd.BiddingDashboardServicePortType;
import gov.fcc.wrv.model.xsd.WrvEvent;

import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;

public class WebServiceConsumer {

	private static QName qname = new QName("http://webservice.wrv.fcc.gov", "BiddingDashboardService");
	
	public void sendEvent(WrvEvent event, List<String> uriList){
		URL baseUrl = gov.fcc.wrv.model.xsd.BiddingDashboardService.class
		.getResource(".");
		
		try {
			for (String uri : uriList) {
				System.out.println("Preparing call for " + uri);
				URL url = new URL(baseUrl, uri);
				BiddingDashboardService svc = new BiddingDashboardService(url, qname);
				System.out.println("about to retrieve service endpoint");
				BiddingDashboardServicePortType port = svc.getBiddingDashboardServiceHttpPort();
				System.out.println("done retrieving service endpoint");
				
				System.out.println("begin webservice call");
				port.sendEvent(event);
				System.out.println("done with webservice call");
				
				System.out.println("**** date: " + new Date() + "\n\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
