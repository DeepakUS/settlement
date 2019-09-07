package com.test.settlement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * 
 * @author deepak.udyawar
 * 
 *         Settlement Transaction Service
 * 
 *         MicroService based mocked service to Implement Settlement based
 *         Queries.
 * 
 *         {@link SecurityAutoConfiguration} is excluded for this mock to skip
 *         the default Security based configuration which would not ask for the
 *         default login credentials
 *
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SettlementApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SettlementApplication.class,
                              args);
    }

}
