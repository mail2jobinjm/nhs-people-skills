package com.jobin.nhs.service;

public class SkillRating {
	
	public int findRating(String skillset)   
	{  
		int rating=0;
		switch(skillset) {
		case "Expert":
			rating= 1;
		case "Practitioner":
			rating= 2;
		case "Working":
			rating= 3;
		case "Awareness":
			rating= 4; 			
		}
		return rating;}
}
