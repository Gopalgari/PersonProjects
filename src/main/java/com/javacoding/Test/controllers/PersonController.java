package com.javacoding.Test.controllers;

import com.javacoding.Test.modals.Person;
import com.javacoding.Test.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping(value = "/save")
    public Person savePerson(@RequestBody Person person) {
            return personRepository.save(person);


    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/allPersons")
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @DeleteMapping("/delete")
    public String deletePerson(@RequestParam(value = "id") Integer id) {
      return ((personRepository.deleteById(id)>0)?"Person deleted successfull":"Failed to delete the person");
    }
    @GetMapping("/count")
    public long countPersons() {
        return personRepository.count();
    }


}
