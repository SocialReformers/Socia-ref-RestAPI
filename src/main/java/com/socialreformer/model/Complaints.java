package main.java.com.socialreformer.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPLAINTS")
public class Complaints {

	@Id
    @Column(name="COMPLAINT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="CAUSE_ID")
    private Integer causeId;
    
    @Column(name="SOCIAL_ID")
    private Integer socialId;
    
    private String locality;
    
    private String description;
    
    public Integer getId() {
          return id;
    }

    public void setId(Integer id) {
          this.id = id;
    }

    public Integer getCauseId() {
          return causeId;
    }

    public void setCauseId(Integer causeId) {
          this.causeId = causeId;
    }

    public Integer getSocialId() {
          return socialId;
    }

    public void setSocialId(Integer socialId) {
          this.socialId = socialId;
    }

    public String getLocality() {
          return locality;
    }

    public void setLocality(String locality) {
          this.locality = locality;
    }

    public String getDescription() {
          return description;
    }

    public void setDescription(String description) {
          this.description = description;
    }



	
}
