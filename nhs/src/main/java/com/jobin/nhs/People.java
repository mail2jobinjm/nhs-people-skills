package com.jobin.nhs;
import java.util.Map;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class People {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long peopleid;
	  private String firstName;
	  private String lastName;
	  private Map<String, Integer> skillLevel;//can add multiple skills with levels
	  private int orgId;
	  private Integer skillRating; //default 0 when adding details
	  

	  public long getPeopleid() {
		return peopleid;
	}

	public void setPeopleid(long peopleid) {
		this.peopleid = peopleid;
	}

	public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	public Map<String, Integer> getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Map<String, Integer> skillLevel) {
		this.skillLevel = skillLevel;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, orgId, peopleid, skillLevel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& orgId == other.orgId && peopleid == other.peopleid && Objects.equals(skillLevel, other.skillLevel);
	}

	public Integer getSkillRating() {
		return skillRating;
	}

	public void setSkillRating(Integer skillRating) {
		this.skillRating = skillRating;
	}


	  
}
