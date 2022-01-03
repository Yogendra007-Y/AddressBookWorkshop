package com.example.demo.bridgelabz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bridgelabz.dto.PersonDTO;
import com.example.demo.bridgelabz.model.PersonData;

@Service
public interface IPersonService {

	PersonData updatePersonDta(int adddressbookId, int personId, PersonDTO personDTO);

	List<PersonData> getPersonData();

	PersonData getPersonDataById(int addressbookId,int personId);

	void deletePersonData(int addressbookId, int id);

	PersonData createPersonData(int adddressbookId, PersonDTO personDTO);
}