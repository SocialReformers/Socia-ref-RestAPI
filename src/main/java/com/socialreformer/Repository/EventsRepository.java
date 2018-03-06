package main.java.com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.socialreformer.model.Events;

public interface EventsRepository extends JpaRepository<Events, Integer>,EventsRepositoryCustom{
	@Query("Select event from Events event where event.city=:city")
	public List<Events> searchByCityAndEventDate(@Param("city") String city);
}
