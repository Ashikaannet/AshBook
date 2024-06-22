package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/person")
public class PersonController {

    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersonList() {
        return personService.getAllPersonList();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @DeleteMapping("{id}")
    public void DeletePerson(@PathVariable("id") Integer id) {
        personService.deletePerson(id);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) throws Exception {
        return personService.updatePerson(person);
    }

}

