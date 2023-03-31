/**
 * 
 */
package com.jobin.nhs;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobin.nhs.service.PeopleService;

/**
 * @author mail2
 *
 *
 */
@RestController
public class PeopleController {
	private static final String welcometemplate = "Welcome to people skill management tool";
	private final AtomicLong counter = new AtomicLong();
	//autowire the peopleService class  
	@Autowired  
	PeopleService peopleService;  
	
	@GetMapping("welcome")
	public Resourse welcome() {
		return new Resourse(counter.incrementAndGet(), String.format(welcometemplate));
	}
	
	@GetMapping("/people")  
	private List<People> getAllPeople()   
	{  
	return peopleService.getAllPeople();  
	}  
	
	//creating a get mapping that retrieves the detail of a specific people  
	@GetMapping("/people/{peopleid}")  
	private People getPeople(@PathVariable("peopleid") int peopleid)   
	{  
	return peopleService.getPeopleById(peopleid);  
	}  
	
	//creating a delete mapping that deletes a specified people  
	@DeleteMapping("/deletePeople/{peopleid}")  
	private void deletepeople(@PathVariable("peopleid") int peopleid)   
	{  
	peopleService.delete(peopleid);  
	}  
	
	//creating post mapping that post the people detail in the database  
	@PostMapping("/savePeople")  
	private int savepeople(@RequestBody People People)   
	{  
	peopleService.saveOrUpdate(People);  
	return (int) People.getPeopleid();  
	}  
	
	//creating put mapping that updates the people detail   
	@PutMapping("/savePeople")  
	private People update(@RequestBody People People)   
	{  
	peopleService.saveOrUpdate(People);  
	return People;  
	} 
	
	
}
