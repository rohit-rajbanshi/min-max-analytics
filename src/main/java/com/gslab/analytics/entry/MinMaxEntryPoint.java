package com.gslab.analytics.entry;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.gslab.analytics.response.MinMaxResponse;

/**
 * @author Rohit Rajbanshi
 */

public class MinMaxEntryPoint {

	Logger LOG = LoggerFactory.getLogger(MinMaxEntryPoint.class);
	ObjectMapper mapper = new ObjectMapper();

	public String findMinMax(String jsonStr) throws IOException {

		List<TimeseriesData> data = mapper.readValue(jsonStr, mapper.getTypeFactory().constructCollectionType(List.class, TimeseriesData.class));
		Double minVal = 100.0;
		Double maxVal = 0.0;
		String minTS = "";
		String maxTS = "";

		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getValue() < minVal) {
				minVal = data.get(i).getValue();
				minTS = data.get(i).getTimestamp();
				LOG.info("min updated");
			}
			if (data.get(i).getValue() > maxVal) {
				maxVal = data.get(i).getValue();
				maxTS = data.get(i).getTimestamp();
				LOG.info("max updated");
			}
			LOG.info("min=" + minVal + "  max=" + maxVal);
		}
		MinMaxResponse response = new MinMaxResponse();
		response.setMax(maxVal);
		response.setMin(minVal);
		response.setMax_ts(maxTS);
		response.setMin_ts(minTS);
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		return mapper.writeValueAsString(response);
	}

}
