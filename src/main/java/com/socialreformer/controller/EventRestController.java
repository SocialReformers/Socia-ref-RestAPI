package main.java.com.socialreformer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.socialreformer.model.Events;
import main.java.com.socialreformer.model.UserEvents;
import main.java.com.socialreformer.service.EventService;

@RestController
@RequestMapping(value="/socialReformer/events")
public class EventRestController {
	@Autowired
	EventService eventService;

	@PostMapping("/createEvent/events")
	public void createComplaint(@Valid @RequestBody Events event) {
		eventService.createEvent(event);
	}

	@PostMapping("/join/userevent")
	public  void createComplaint(@Valid @RequestBody UserEvents userEvent) {
		eventService.joinEvent(userEvent);
	}

	@RequestMapping(value="/participants",method=RequestMethod.GET)
	public long noOfParticipants(@RequestParam(value="eventId",required=true) Integer eventId) {
		return eventService.numberOfEventParticipants(eventId);
	}

}
