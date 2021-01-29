package com.javacoding.Test.repository;

import com.javacoding.Test.modals.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface PersonRepository extends JpaRepository<Person, Id> {
    Integer deleteById(Integer id);
}
