package com.example.app.repository;

import com.example.app.entity.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends ReactiveCrudRepository<Person,Integer> {
}
