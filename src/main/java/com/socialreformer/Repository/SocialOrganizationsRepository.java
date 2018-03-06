package main.java.com.socialreformer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.socialreformer.model.SocialOrganizations;

public interface SocialOrganizationsRepository extends JpaRepository<SocialOrganizations, Integer> {

@Query("Select org from SocialOrganizations org where org.cause like %:cause%  AND LOWER(org.city) = LOWER(:city)")
public List<SocialOrganizations> searchByNGOCauseAndCity(@Param("cause") String cause,@Param("city") String city);
}
