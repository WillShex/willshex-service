//
//  ServiceType.java
//  spchopr.service
//
//  Created by William Shakour on Jun 14, 2012.
//  Copyright © 2012 SPACEHOPPER STUDIOS LTD. All rights reserved.
//
package com.spacehopperstudios.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author William Shakour
 * 
 */
public enum ServiceType {
	ServiceTypeLogging("logging");
	
	private String value;
	private static Map<String, ServiceType> valueLookup = null;

	private ServiceType(String value) {
		this.value = value;
	}

	public String toString() {
		return "service." + value;
	}
	
	public static ServiceType fromString(String value) {
		if (valueLookup == null) {
			valueLookup = new HashMap<String, ServiceType>();
			for (ServiceType currentServiceType : ServiceType.values()) {
				valueLookup.put(currentServiceType.value, currentServiceType);
			}
		}
		return valueLookup.get(value);
	}
}
