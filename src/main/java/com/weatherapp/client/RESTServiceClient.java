/**
 * RESTServiceClient.java
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
