package com.gslab.analytics.response;

/**
 * @author Rohit Rajbanshi
 */

public class MinMaxResponse {

	protected String min_ts;
	protected String max_ts;

	protected Double min;
	protected Double max;
	public String getMin_ts() {
		return min_ts;
	}
	public void setMin_ts(String min_ts) {
		this.min_ts = min_ts;
	}
	public String getMax_ts() {
		return max_ts;
	}
	public void setMax_ts(String max_ts) {
		this.max_ts = max_ts;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}

}
