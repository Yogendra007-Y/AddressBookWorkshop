package com.example.demo.bridgelabz.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.demo.bridgelabz.dto.AddressBookDTO;

import lombok.Data;


@Entity
public @Data class AddressBookModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String addressBookName;
	
	
	public AddressBookModel(int bookId, String addressBookName) {
		super();
		this.bookId = bookId;
		this.addressBookName = addressBookName;
	}

	public AddressBookModel(AddressBookDTO addressDTO) {
	}

	@OneToMany(targetEntity = PersonData.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id",referencedColumnName = "bookId")
	private List<PersonData>personList;
	}


