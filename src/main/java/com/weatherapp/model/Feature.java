/**
 * Feature.java
 */
package main.java.com.weatherapp.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("feature")
public class Feature {
	private String feature;

	/**
	 * @return the feature
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * @param feature
	 *            the feature to set
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}

}
