package dom.jagadish.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.Flight;
import dom.jagadish.com.model.Registration;
import dom.jagadish.com.repository.FlightRepository;
import dom.jagadish.com.repository.RegisterRepository;

@Service
public class FlightService {
	@Autowired
	FlightRepository flightRepository;

	public FlightRepository getFlightRepository() {
		return flightRepository;
	}

	public void setFlightRepository(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	Flight flight;
	public void addFlight(Flight flight) {
		

			flightRepository.save(flight);
		
	}
	
	public List<Flight> getAllFlights() {
	return flightRepository.findAll();	
	}
	public Flight getFlight(String Name) {
		List<Flight> flights=flightRepository.findAll();
		for (Flight list1 : flights) {

			if (list1.getFlightName().equals(Name)) {
				return list1;
			}
		}
		return null;
		}
	
	


}
