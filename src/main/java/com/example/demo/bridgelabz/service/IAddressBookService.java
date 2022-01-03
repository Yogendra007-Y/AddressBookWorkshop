package com.example.demo.bridgelabz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bridgelabz.dto.AddressBookDTO;
import com.example.demo.bridgelabz.model.AddressBookModel;

@Service
public interface IAddressBookService {


	List<AddressBookModel> getAddressBookData();

	AddressBookModel createPersonData(AddressBookDTO addressDTO);
}