package com.hopcroft.example.cxf;

import com.sun.tools.xjc.XJCFacade;

public class Generator {
	public static void main(String[] args) throws Throwable {
		XJCFacade.main(new String[] {
			"-d", "src/main/java", "src/main/resources/car.xsd"	
		});
	}
}
