package service.subtract.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractController {

	@RequestMapping(value="/api/v1/subtract", method = RequestMethod.GET)
	public double subtract(
			@RequestParam(value="value1", required=true) double value1,
			@RequestParam(value="value2", required=true) double value2
			) {
		return value1-value2;
	}
	
}
