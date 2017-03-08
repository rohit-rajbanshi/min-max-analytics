package com.gslab.analytics;

import java.io.IOException;

import com.gslab.analytics.entry.MinMaxEntryPoint;

public class MinMaxAnalyticsFinalApplicationTests {

	public static void main(String[] args) throws IOException{
		MinMaxEntryPoint pt = new MinMaxEntryPoint();
		String res = pt.findMinMax(
				"[\r\n\t{\r\n\t\t\"timestamp\": \"1488704460881\",\r\n\t\t\"value\": 35.126\r\n\t},\r\n\t{\r\n\t\"timestamp\": \"1488704460981\",\r\n\t\"value\": 31.126\r\n\t},\r\n\t{\r\n\t\t\"timestamp\":\"1488704460991\",\r\n\t\t\"value\":30.126\r\n\t},\r\n\t{\r\n\t\t\"timestamp\":\"1488704460995\",\r\n\t\t\"value\":32.126\r\n\t},\r\n\t{\r\n\t\t\"timestamp\":\"1488704460999\",\r\n\t\t\"value\":33.126\r\n\t}\r\n]\r\n\r\n");
		System.out.println(res);
	}

}
