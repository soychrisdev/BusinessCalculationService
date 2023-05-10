package com.exercise.businesscalculationservice;

import com.exercise.businesscalculationservice.business.BusinessCalculationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.exercise.businesscalculationservice.business")
public class BusinessCalculationServiceApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceApplication.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }

}
