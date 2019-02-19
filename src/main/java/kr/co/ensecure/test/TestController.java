package kr.co.ensecure.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "Welcome to Spring MVC Project. Rest Request is succeed.";
	}

}
