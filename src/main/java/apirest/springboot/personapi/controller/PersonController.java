package apirest.springboot.personapi.controller;

import apirest.springboot.personapi.entity.Person;
import apirest.springboot.personapi.repository.PersonRepository;
import apirest.springboot.personapi.dto.MessageResponseDTO;
import apirest.springboot.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people") /* Caminho principal da API*/
public class PersonController {

    private PersonRepository personRepository;

    private PersonService personService;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus. CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
