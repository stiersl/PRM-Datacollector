package com.stevenstier.model.Dao;

import java.time.Instant;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public interface HistorianValueDAO {

  public boolean insertHistorianValue(long varId, Instant sampletime, Double varValue, int Quality);
}
