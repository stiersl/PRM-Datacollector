package com.stevenstier.model.Dao;

import java.time.Instant;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.stevenstier.prm.model.HistorianValue;

@Component
public class RestHistorianValueDao implements HistorianValueDAO {
	// private static final String BASE_URL =
	// "http://prm-test.herokuapp.com/api/variableHistory";
	// private static final String BASE_URL =
	// "http://192.168.100.42:8080/prm/api/variableHistory/";
	private static final String BASE_URL = "http://localhost:8080/prm/api/variableHistory/";
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public boolean insertHistorianValue(long varId, Instant sampletime, Double varValue, int quality) {

		boolean result = false;

		HistorianValue historianvalueToInsert = new HistorianValue();
		historianvalueToInsert.setVarId(varId);

		historianvalueToInsert.setTimeStamp(sampletime.toString());
		historianvalueToInsert.setVarValue(String.valueOf(varValue));
		historianvalueToInsert.setQuality(quality);

		String url = BASE_URL + "?id=" + varId;
		result = restTemplate.postForObject(url, historianvalueToInsert, Boolean.class);

		return result;
	}
}