package com.assignment.logistics;

import com.assignment.logistics.repository.LogisticRepository;
import com.assignment.logistics.service.LogisticService;
import com.assignment.logistics.service.LogisticServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LogisticsApplication {

   
	public static void main(String[] args) {
		SpringApplication.run(LogisticsApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper() {
		return new ModelMapper();
	}

	@Bean
	public LogisticService getLogisticSerive(){
		return new LogisticServiceImpl();
	}

}
