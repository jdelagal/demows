package com.msssi.es.demows;

import javax.xml.ws.Endpoint;
import com.msssi.es.demows.WelcomeImpl;

public class WelcomeMsgPublisher  {
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9001/WebServiceDemo/Welcome", new WelcomeImpl());	
	}
}