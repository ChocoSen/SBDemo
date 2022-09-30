package com.example.SBDemo.repository;

import com.example.SBDemo.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer >{
}