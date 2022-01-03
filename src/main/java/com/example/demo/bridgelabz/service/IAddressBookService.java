package com.example.demo.bridgelabz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bridgelabz.dto.AddressBookDTO;
import com.example.demo.bridgelabz.model.AddressBookModel;

@Service
public interface IAddressBookService {

	AddressBookModel createAddressBookData(AddressBookDTO bookDTO);

	AddressBookModel updateAddressBookData(int addressbookId, AddressBookDTO bookDTO);

	List<AddressBookModel> getAddressBookData();

	AddressBookModel getAddressBookDataById(int id);

	void deleteAddressBookData(int id);
}