package com.stevenstier;

import java.time.Instant;
import java.time.LocalDateTime;

import com.stevenstier.model.Dao.HistorianValueDAO;
import com.stevenstier.model.Dao.RestHistorianValueDao;

public class App {

  public static void main(String[] args) {
    HistorianValueDAO historianValueDAO = new RestHistorianValueDao();
    
    long varId = 2;

    // Get the current time
    Instant sampletime = Instant.now();
    System.out.println(sampletime);
    
    Double varValue = 99.123d;
    int Quality = 192;
    
    historianValueDAO.insertHistorianValue(varId, sampletime, varValue, Quality);

  }

}
