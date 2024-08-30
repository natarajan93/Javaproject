package com.login360.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login360.dto.Users;

@RestController
public class HomeController {

	@PostMapping("/save")
	public String saveAll(@RequestBody Users user) {
		if (user.getUsername().equals("raj")) {
			return "valid username";
		}

		return "invalid";

	}

//	@GetMapping("/user")
//	public String getUser() {
//		return "hi Spring";
//	}
////	portnumber/swagger-ui/index.html   valu= 
//
//	@GetMapping("/add")
//	public int getAdd(@RequestParam("num1") int a, @RequestParam("num2") int b) {
//		return a + b;
//	}
//
//	@GetMapping("/sub")
//	public int getSub(@RequestParam("num1") int a, @RequestParam("num2") int b) {
//		return a - b;
//	}
//
//	@GetMapping("/mul/{num1}/{num2}")
//	public int getMul(@PathVariable("num1") int a, @PathVariable("num2") int b) {
//		return a * b;
//	}
//
//	@GetMapping("/FindVoteEligible")
//	public String getAge(@RequestParam("Enter Your Age") int age) {
//		if (age > 18) {
//			return "Eligible";
//		} else {
//			return "Not Eligible";
//		}
//
//	}
//}

}
