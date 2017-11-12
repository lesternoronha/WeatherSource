/**
 * ResponseWrapper.java
 */
package main.java.com.weatherapp.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonSetter;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseWrapper {

	private ResponseJSON response;

	/**
	 * @return the response
	 */
	public ResponseJSON getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(ResponseJSON response) {
		this.response = response;
	}

	@JsonProperty("error")
	private ErrorJSON error;

	@JsonProperty("current_observation")
	private CurrentObservationJSON currentObservation;

	/**
	 * @return the currentObservation
	 */
	public CurrentObservationJSON getCurrentObservation() {
		return currentObservation;
	}

	/**
	 * @param currentObservation
	 *            the currentObservation to set
	 */
	public void setCurrentObservation(CurrentObservationJSON currentObservation) {
		this.currentObservation = currentObservation;
	}

	/**
	 * @return the error
	 */
	public ErrorJSON getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	@JsonSetter
	public void setError(ErrorJSON error) {
		this.error = error;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseWrapper [response=" + response + ", error=" + error
				+ ", currentObservation=" + currentObservation + "]";
	}

}
