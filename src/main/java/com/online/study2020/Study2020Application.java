package com.online.study2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.online.study2020.mapper")
public class Study2020Application {

	public static void main(String[] args) {
		SpringApplication.run(Study2020Application.class, args);
	}

}
