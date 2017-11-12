package main.java.com.weatherapp.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;


public class Weather {

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weather [zipCode=" + zipCode + ", city=" + city + ", state="
				+ state + ", currentTemp=" + currentTempF + "]";
	}

	Integer zipCode;

	/**
	 * @return the zipCode
	 */
	public Integer getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	String city;

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the currentTemp
	 */
	public String getCurrentTempF() {
		return currentTempF;
	}

	/**
	 * @param currentTemp
	 *            the currentTemp to set
	 */
	public void setCurrentTempF(String currentTemp) {
		this.currentTempF = currentTemp;
	}

	String state;
	String currentTempF;
	private String currentTempC;

	/**
	 * @return the currentTempC
	 */
	public String getCurrentTempC() {
		return currentTempC;
	}

	/**
	 * @param currentTempC
	 *            the currentTempC to set
	 */
	public void setCurrentTempC(String currentTempC) {
		this.currentTempC = currentTempC;
	}

	String weather;
	String windKPH;
	String observationTime;

	/**
	 * @return the currentTempC
	 */
	public String getWeather() {
		return weather;
	}

	/**
	 * @param currentTempC
	 *            the currentTempC to set
	 */
	public void setWeather(String weather) {
		this.weather = weather;
	}

	/**
	 * @return the currentTempC
	 */
	public String getWindKPH() {
		return windKPH;
	}

	/**
	 * @param currentTempC
	 *            the currentTempC to set
	 */
	public void setWindKPH(String windKPH) {
		this.windKPH = windKPH;
	}

	/**
	 * @return the currentTempC
	 */
	public String getObservationTime() {
		return observationTime;
	}

	/**
	 * @param currentTempC
	 *            the currentTempC to set
	 */
	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}
	private String errorDesc;

	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}

	/**
	 * @param description
	 */
	public void setErrorDesc(String description) {
		this.errorDesc = description;
	}
}