package com.keizen.service.demo;

import java.util.ArrayList;
import java.util.List;

public class welcomeService {
	
	public List<String> getMessage(String name)
	{
		List<String> welcomeMessage = new ArrayList<>();
		welcomeMessage.add("Welcome to the Spring world ! "+ name);
		return welcomeMessage;
	}

}
