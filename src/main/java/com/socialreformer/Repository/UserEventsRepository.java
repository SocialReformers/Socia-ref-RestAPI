package main.java.com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.socialreformer.model.UserEvents;

public interface UserEventsRepository  extends JpaRepository<UserEvents, Integer>,UserEventsRepositoryCustom{

	public long countByEventId(Integer eventId);
	
}
