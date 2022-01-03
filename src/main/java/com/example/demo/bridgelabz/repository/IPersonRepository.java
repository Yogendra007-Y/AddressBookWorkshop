package com.example.demo.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bridgelabz.model.PersonData;

@Repository
public interface IPersonRepository extends JpaRepository<PersonData, Long> {

}