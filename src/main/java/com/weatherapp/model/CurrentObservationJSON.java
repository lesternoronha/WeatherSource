/**
 * CurrentObservation.java
 */
package main.java.com.weatherapp.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class CurrentObservationJSON {

	private ObservationLocationJSON observationLocation;
	private DisplayLocationJSON displayLocation;
	@JsonProperty("temp_f")
	private String tempF;
	@JsonProperty("temp_c")
	private String tempC;
	@JsonProperty("weather")
	private String weather;
	@JsonProperty("wind_kph")
	private String windKPH;
	@JsonProperty("observation_time")
	private String observationTime;

	/**
	 * @return the observationLocation
	 */
	public ObservationLocationJSON getObservationLocation() {
		return observationLocation;
	}

	/**
	 * @param observationLocation
	 *            the observationLocation to set
	 */

	@JsonProperty("observation_location")
	public void setObservationLocation(ObservationLocationJSON observationLocation) {
		this.observationLocation = observationLocation;
	}

	/**
	 * @return the displayLocation
	 */
	public DisplayLocationJSON getDisplayLocation() {
		return displayLocation;
	}

	/**
	 * @param displayLocation
	 *            the displayLocation to set
	 */
	@JsonProperty("display_location")
	public void setDisplayLocation(DisplayLocationJSON displayLocation) {
		this.displayLocation = displayLocation;
	}

	/**
	 * @return the tempF
	 */
	public String getTempF() {
		return tempF;
	}

	/**
	 * @param tempF
	 *            the tempF to set
	 */
	public void setTempF(String tempF) {
		this.tempF = tempF;
	}

	/**
	 * @return the tempC
	 */
	public String getTempC() {
		return tempC;
	}

	/**
	 * @param tempC
	 *            the tempC to set
	 */
	public void setTempC(String tempC) {
		this.tempC = tempC;
	}

	/**
	 * @return the weather
	 */
	public String getWeather() {
		return weather;
	}

	/**
	 * @param weather
	 *            the weather to set
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}

	/**
	 * @return the wind_kph
	 */
	public String getWindKPH() {
		return windKPH;
	}

	/**
	 * @param wind_kph the wind_kph to set
	 */
	public void setWindKPH(String windKPH) {
		this.windKPH = windKPH;
	}

	/**
	 * @return the observation_time
	 */
	public String getObservationTime() {
		return observationTime;
	}

	/**
	 * @param observation_time
	 *            the observation_time to set
	 */
	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CurrentObservation [observationLocation=" + observationLocation
				+ ", tempF=" + tempF + ", tempC=" + tempC + "]";
	}

}
