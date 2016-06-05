/**
 * Coding Zombies, LLC 2016
 */
package com.codingzombies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Printer zombiePrinter() {
        return new Printer("ZombiePrinter");
    }

    @Bean
    public PrinterService printerService() {
        return new PrinterService();
    }

}
