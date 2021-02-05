package com.techproed.restapi01;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class SB01HelloWorldController {

	//1.Way:
	@RequestMapping(method = RequestMethod.GET, path = "/helloWorld1")
	public String helloWorld1() {
		return "Hello World!";
	}
	
	//2.Way
	@GetMapping(path = "/helloWorld2")
	public String helloWorld2() {
		return "Hello World!!!";
	}
}
