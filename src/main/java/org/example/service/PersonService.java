package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Person;
import org.example.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {
    private PersonRepository personRepository;

    public List<Person> getAllPersonList() {
        return personRepository.findAll();
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(Integer id) {
       personRepository.deleteById(id);
    }

    public Person updatePerson(Person person) throws Exception {
        Optional<Person> personOptional = personRepository.findById(person.getId());
        if(personOptional.isPresent()) {
            return personRepository.save(person);
        } else {
            throw new Exception("ID Does not exist");
        }
    }
}
