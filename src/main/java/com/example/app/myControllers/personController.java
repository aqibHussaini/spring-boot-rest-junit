package com.example.app.myControllers;

import com.example.app.entity.Person;
import com.example.app.repository.personRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class personController {
    WebClient client = WebClient.create("http://localhost:8080");
    @Autowired
    personRepository personRepository;
    @GetMapping("/save-person")
public Mono<Person> save()
{
    Person person=new Person();
    person.name="ali";

   return personRepository.save(person);
}
@GetMapping("/get-person")
public Flux<Person> getPersons()
{
   return personRepository.findAll();
}
@GetMapping("/get-person/{id}")
public Mono<Person> getPerson(@PathVariable int id)
{
   return personRepository.findById(id);
}
@GetMapping("/delete-person/{id}")
public Mono<Void> deletePerson(@PathVariable int id)
{
   return personRepository.deleteById(id);
}
    @GetMapping("/call-person")
    public Flux<Person> callAPi() {
        Flux<Person> personFlux = client.get()
                .uri("http://localhost:8080/get-person")
                .retrieve()
                .bodyToFlux(Person.class);
        return personFlux;
    }
}
