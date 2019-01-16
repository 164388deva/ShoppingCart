package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.Flight;
import dom.jagadish.com.model.Registration;

public interface FlightRepository extends MongoRepository<Flight, String> {

}
