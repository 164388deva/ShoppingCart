package dom.jagadish.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dom.jagadish.com.model.Flight;
import dom.jagadish.com.service.FlightService;

public class FlightController {
@Autowired	
FlightService flightService;
@RequestMapping(method = RequestMethod.POST, value = "/flight/create")
public void create(@RequestBody Flight fli) {
	flightService.addFlight(fli);

}
@RequestMapping("/flights")
public  List<Flight> FlightsList(){
	return flightService.getAllFlights();
	
}
@RequestMapping("/flights/{flight}")
public  Flight Flight(@PathVariable String Name){

	return flightService.getFlight(Name);
}

}
