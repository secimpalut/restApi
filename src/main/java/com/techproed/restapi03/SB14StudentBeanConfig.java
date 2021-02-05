package com.techproed.restapi03;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SB14StudentBeanConfig {

	@Bean
	CommandLineRunner CommandLineRunner1(SB11StudentBeanRepository studentRepository) {
		
		return args -> {
			SB10StudentBean alican = new SB10StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002,Month.JANUARY, 21),19);
			SB10StudentBean velihan = new SB10StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000,Month.JANUARY, 21),26);
						
							studentRepository.saveAll(List.of(alican,velihan));
		};
		

	}
}
