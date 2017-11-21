package com.luffy.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SellApplication {


	@RequestMapping("/")
	public String index(){
      return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(SellApplication.class, args);
	}
}
