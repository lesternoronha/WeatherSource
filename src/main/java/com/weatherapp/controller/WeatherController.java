package main.java.com.weatherapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.weatherapp.client.RESTServiceClient;
import main.java.com.weatherapp.model.Response;
import main.java.com.weatherapp.model.ResponseWrapper;
import main.java.com.weatherapp.model.Weather;
import main.java.com.weatherapp.util.ApplicationUtil;

@Controller
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	RESTServiceClient serviceClient;

	/**
	 *
	 * @param weather
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/retrieve/json", method = RequestMethod.POST)
	public String getWeatherJSON(@Valid Weather weather, BindingResult result) {

		if (result.hasErrors()) {
			return "WeatherForm";
		} else {
			// hit the api service to find the weather data
			@SuppressWarnings("unchecked")
			ResponseEntity<ResponseWrapper> responseEntity = (ResponseEntity<ResponseWrapper>) serviceClient
					.getJSONResponse(weather);
			ResponseWrapper weatherResponse = responseEntity.getBody();
			System.out.println("weatherResponse --> " + weatherResponse
					+ "\n Status COde : " + responseEntity.getStatusCode()
					+ "\n Content Type : "
					+ responseEntity.getHeaders().getContentType());
			ApplicationUtil.assembleJSON(weatherResponse, weather);

			if (HttpStatus.OK != responseEntity.getStatusCode()
					|| null != weather.getErrorDesc()) {
				result.rejectValue("City", "NotFound.weather.City",
						"City not found.");
			}
			return "WeatherForm";
		}

	}

	/**
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String displayWeatherForm(ModelMap model) {

		model.addAttribute("weather", new Weather());
		return "WeatherForm";

	}

}
