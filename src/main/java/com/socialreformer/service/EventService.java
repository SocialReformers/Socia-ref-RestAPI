package main.java.com.socialreformer.service;

import main.java.com.socialreformer.model.Events;
import main.java.com.socialreformer.model.UserEvents;



public interface EventService{
	
	public Events createEvent(Events event);
	public UserEvents joinEvent(UserEvents userEvents);
	public long numberOfEventParticipants(Integer eventId);
	public List<Events> retrieveEventsNearYou(String city);
}
