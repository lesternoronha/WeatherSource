/**
 * ApplicationUtil.java
 */
package main.java.com.weatherapp.util;

import main.java.com.weatherapp.model.Response;
import main.java.com.weatherapp.model.ResponseWrapper;
import main.java.com.weatherapp.model.Weather;

public class ApplicationUtil {

	/**
	 * @param weatherResponse
	 * @param weather
	 */
	public static void assemble(Response weatherResponse, Weather weather) {

		if (null != weatherResponse.getError()
				&& null != weatherResponse.getError().getDescription()) {
			weather.setErrorDesc(weatherResponse.getError().getDescription());
		} else {
			weather.setCity(weatherResponse.getCurrentObservation()
					.getDisplayLocation().getCity());
			weather.setCurrentTempF(weatherResponse.getCurrentObservation()
					.getTempF());
			weather.setState(weatherResponse.getCurrentObservation()
					.getObservationLocation().getState());
			weather.setCurrentTempC(weatherResponse.getCurrentObservation()
					.getTempC());
			weather.setWeather(weatherResponse.getCurrentObservation()
					.getWeather());
			weather.setWindKPH(weatherResponse.getCurrentObservation()
					.getWindKPH());
			weather.setObservationTime(weatherResponse.getCurrentObservation()
					.getObservationTime());

		}
	}

	/**
	 * @param weatherResponse
	 * @param weather
	 */
	public static void assembleJSON(ResponseWrapper weatherResponse,
			Weather weather) {
		System.out.println(" weatherResponse.getError() :: "
				+ weatherResponse.getResponse().getError() + " ! !!!!  ! !");
		if (null != weatherResponse.getResponse().getError()
				&& null != weatherResponse.getResponse().getError().getDescription()) {
			weather.setErrorDesc(weatherResponse.getResponse().getError().getDescription());
		} else {
			weather.setCity(weatherResponse.getCurrentObservation()
					.getDisplayLocation().getCity());
			weather.setCurrentTempF(weatherResponse.getCurrentObservation()
					.getTempF());
			weather.setState(weatherResponse.getCurrentObservation()
					.getObservationLocation().getState());
			weather.setCurrentTempC(weatherResponse.getCurrentObservation()
					.getTempC());
			weather.setWeather(weatherResponse.getCurrentObservation()
					.getWeather());
			weather.setWindKPH(weatherResponse.getCurrentObservation()
					.getWindKPH());
			weather.setObservationTime(weatherResponse.getCurrentObservation()
					.getObservationTime());

		}
	}

}
