/**
 * RESTServiceClient.java
 *
 * Created by Di007Va
 * Created on Jun 11, 2013
 *
 *
 * Copyright (c) 2013 Symbiont Softwares
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Symbiont Softwares.  You shall use it only in accordance with the terms
 * of the license agreement you entered into with Symbiont Softwares.
 *
 */
package main.java.com.weatherapp.client;

public interface RESTServiceClient {

	/**
	 *
	 * @param request
	 * @return
	 */
	public Object getXMLResponse(Object request);

	/**
	 *
	 * @param request
	 * @return
	 */
	public Object getJSONResponse(Object request);

}
