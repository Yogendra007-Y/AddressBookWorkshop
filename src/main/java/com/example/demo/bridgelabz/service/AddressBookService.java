package com.example.demo.bridgelabz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bridgelabz.dto.AddressBookDTO;
import com.example.demo.bridgelabz.model.AddressBookModel;
import com.example.demo.bridgelabz.repository.IAddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {
	@Autowired
	private IAddressBookRepository addressBookRepositoty;
	
	@Override
	public List<AddressBookModel> getAddressBookData() {
		return addressBookRepositoty.findAll();
	}

	@Override
	public AddressBookModel createPersonData(AddressBookDTO addressDTO) {
		AddressBookModel addressData = null;
		addressData  = new AddressBookModel(addressDTO);
		return addressBookRepositoty.save(addressData );
	}



}