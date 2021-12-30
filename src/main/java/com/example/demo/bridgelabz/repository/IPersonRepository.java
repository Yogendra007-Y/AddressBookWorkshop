package com.example.demo.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bridgelabz.model.PersonData;

public interface IPersonRepository extends JpaRepository<PersonData, Long> {

}