package com.av.dto;

import com.av.dto.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.av" )
public class MyConfig {
    @Bean
    public Employee getEmployee(){
        return new Employee();
    }
}