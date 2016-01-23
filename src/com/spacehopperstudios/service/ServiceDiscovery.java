//
//  ServiceDiscovery.java
//  spchopr.service
//
//  Created by William Shakour on Jun 14, 2012.
//  Copyright © 2012 WillShex Limited. All rights reserved.
//
package com.spacehopperstudios.service;

import java.util.Hashtable;

/**
 * @author William Shakour
 * 
 */
public class ServiceDiscovery {
	private static Hashtable<String, IService> services;

	public static void registerService(IService service) {
		if (ServiceDiscovery.services == null) {
			ServiceDiscovery.services = new Hashtable<String, IService>();
		}

		ServiceDiscovery.services.put(service.getName(), service);
	}

	public static IService getService(String name) {
		IService service = null;

		if (ServiceDiscovery.services != null && ServiceDiscovery.services.containsKey(name)) {
			service = ServiceDiscovery.services.get(name);
		}

		return service;
	}
}
