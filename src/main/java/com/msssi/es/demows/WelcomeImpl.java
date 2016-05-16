package com.msssi.es.demows;

import javax.jws.WebService;

@WebService(endpointInterface = "com.msssi.es.demows.Welcome")
public class WelcomeImpl implements Welcome {
	
	public String getWelcomeMsg(String name){
		 return "Welcome "+name;
	 }
}