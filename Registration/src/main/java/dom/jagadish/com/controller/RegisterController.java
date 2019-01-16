package dom.jagadish.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dom.jagadish.com.model.Registration;
import dom.jagadish.com.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@RequestMapping(method = RequestMethod.POST, value = "/regRepository")
	public void addUser(@RequestBody Registration reg) {
		registerService.addUser(reg);

	}
	@RequestMapping(method = RequestMethod.GET, value = "/regRepository")
	public String User() {
		return "hello";
	}

}
