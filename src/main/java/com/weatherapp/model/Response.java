/**
 * Response.java
 */
package main.java.com.weatherapp.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("response")
@JsonRootName("response")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	private String version;
	private String termsofService;
	private List<Feature> features;

	/**
	 * @return the error
	 */
	public main.java.com.weatherapp.model.Error getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(main.java.com.weatherapp.model.Error error) {
		this.error = error;
	}

	private main.java.com.weatherapp.model.Error error;

	/**
	 * @return the features
	 */
	public List<Feature> getFeatures() {
		return features;
	}

	/**
	 * @param features
	 *            the features to set
	 */
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the termsofService
	 */
	public String getTermsofService() {
		return termsofService;
	}

	/**
	 * @param termsofService
	 *            the termsofService to set
	 */
	public void setTermsofService(String termsofService) {
		this.termsofService = termsofService;
	}

	@XStreamAlias("current_observation")
	@JsonProperty("current_observation")
	private CurrentObservation currentObservation;

	/**
	 * @return the currentObservation
	 */
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	/**
	 * @param currentObservation
	 *            the currentObservation to set
	 */
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [currentObservation=" + currentObservation + "]";
	}

}
