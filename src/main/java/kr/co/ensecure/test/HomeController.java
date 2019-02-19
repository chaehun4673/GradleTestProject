package kr.co.ensecure.test;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public void consoleTest(Locale locale) {
		logger.info("---- Welcome to Spring Project. The Client locale is {}.", locale);
	}

}
