package dom.jagadish.com.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import dom.jagadish.com.dateSupport.DateHandler;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
@Document
public class Flight {
	@Id
	private ObjectId userId;
	public Flight(ObjectId userId, String flightName, String source, String destination, Date arrival, Date departure) {
		super();
		this.userId = userId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.arrival = arrival;
		Departure = departure;
	}
	private String flightName;
	private String source;
	private String destination;
	@JsonDeserialize(using =DateHandler.class)
	private Date arrival;
	@JsonDeserialize(using =DateHandler.class)
	private Date Departure;
	public ObjectId getUserId() {
		return userId;
	}
	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public Date getDeparture() {
		return Departure;
	}
	public void setDeparture(Date departure) {
		Departure = departure;
	}
	@Override
	public String toString() {
		return "Flight [userId=" + userId + ", flightName=" + flightName + ", source=" + source + ", destination="
				+ destination + ", arrival=" + arrival + ", Departure=" + Departure + "]";
	}
	
}
