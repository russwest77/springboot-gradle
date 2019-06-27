package com.wondersgroup.springboot_gradle;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleApplication.class, args);
	}
	
	@RequestMapping("test")
	public String test() {
		return "springboot gradle example success ~";
	}

}
