package main.java.com.socialreformer.Repository;
import java.util.Date;
import java.util.List;

import main.java.com.socialreformer.model.Events;

public interface EventsRepositoryCustom {
	
	public List<Events> retrieveEventDetails(Date eventDate,String city);

}
