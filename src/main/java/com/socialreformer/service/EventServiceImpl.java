package main.java.com.socialreformer.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.socialreformer.Repository.CauseRepository;
import main.java.com.socialreformer.Repository.EventsRepository;
import main.java.com.socialreformer.Repository.UserEventsRepository;
import main.java.com.socialreformer.model.Cause;
import main.java.com.socialreformer.model.Events;
import main.java.com.socialreformer.model.UserEvents;

@Service
public class EventServiceImpl implements EventService{
	
	@Resource
	EventsRepository eventRepository;
	@Resource
	UserEventsRepository userEventRepository;

	public Events createEvent(Events event){
		return eventRepository.save(event);
	}
	
	public UserEvents joinEvent(UserEvents userEvents){
		return userEventRepository.save(userEvents);
	}
	
	public long numberOfEventParticipants(Integer eventId){
		return userEventRepository.countByEventId(eventId);
	}
	
	public List<Events> retrieveEventsNearYou(String city){
		return eventRepository.searchByCityAndEventDate(city);
	}
}
