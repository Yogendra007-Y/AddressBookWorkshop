package com.example.demo.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bridgelabz.dto.AddressBookDTO;

import com.example.demo.bridgelabz.dto.ResponseDTO;
import com.example.demo.bridgelabz.model.AddressBookModel;

import com.example.demo.bridgelabz.service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = { "/getBook" })
	public ResponseEntity<ResponseDTO> getPersonData() {
		List<AddressBookModel> bookList = null;
		bookList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createPersonData(@RequestBody AddressBookDTO addressDTO) {
		AddressBookModel addressData = null;
		addressData = addressBookService.createPersonData(addressDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook Successfully", addressData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
