package com.example.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    Logger logger = LoggerFactory.getLogger(HomeService.class);

    @Value("${custom.value1}")
    private int value1;

    @Value("${custom.value2}")
    private int value2;

    public Double calculateExponent(){
        try {
            logger.info("Start of calculation with: {} {}", value1, value2);
            return Math.pow(value1, value2);
        } finally {
            logger.info("The calculation is finished");
        }
    }
}
