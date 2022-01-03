package com.example.demo.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	/**
	 * create address book
	 */
	@PostMapping("/Create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO bookDTO) {
		AddressBookModel createBook = null;
		createBook = addressBookService.createAddressBookData(bookDTO);
		ResponseDTO respDTO = new ResponseDTO("created address book successfully", createBook);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	/**
	 * update address book by addressbookId
	 * @param : addressbookId, AddressBookDTO
	 */
	@PutMapping("Update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestParam int addressbookId,@RequestBody AddressBookDTO bookDTO) {
		AddressBookModel createBook = null;
		createBook = addressBookService.updateAddressBookData(addressbookId,bookDTO);
		ResponseDTO respDTO = new ResponseDTO("created address book successfully", createBook);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * get all address book
	 */
	@RequestMapping("/getAll")
	public ResponseEntity<ResponseDTO> getAllAddressBookData() {
		List<AddressBookModel> addressBookList = null;
		addressBookList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get call success", addressBookList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * get address book by addressbookId
	 * @param : addressbookId
	 */
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAddressBookData(@RequestParam int addressbookId) {
		AddressBookModel contactDetails = null;
		contactDetails = addressBookService.getAddressBookDataById(addressbookId);
		ResponseDTO respDTO = new ResponseDTO("Get call success for id:" + addressbookId, contactDetails);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * delete address book by addressbookId
	 * 
	 * @param : addressbookId
	 */
	@DeleteMapping("/Delete")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@RequestParam int addressbookId) {
		addressBookService.deleteAddressBookData(addressbookId);
		ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook data Successfully", "deleted addressbookId is :" + addressbookId);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}