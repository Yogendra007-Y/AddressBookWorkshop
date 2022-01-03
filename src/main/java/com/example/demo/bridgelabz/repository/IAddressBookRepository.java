package com.example.demo.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bridgelabz.model.AddressBookModel;


public interface IAddressBookRepository extends JpaRepository<AddressBookModel, Integer>{

}
