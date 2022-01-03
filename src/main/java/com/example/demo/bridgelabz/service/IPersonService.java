package com.example.demo.bridgelabz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bridgelabz.dto.PersonDTO;
import com.example.demo.bridgelabz.model.PersonData;

@Service
public interface IPersonService {

	List<PersonData> getPersonData();
	PersonData getPersonDataById(int id);
	
	PersonData createPersonData(PersonDTO personDTO);
	
	PersonData updatePersonData( int id,PersonDTO personDTO);
	
	void deletePersonData(int id);
}