package com.example.SBDemo.Repository;

import com.example.SBDemo.SbDemoApplicationTests;
import com.example.SBDemo.model.entity.Person;
import com.example.SBDemo.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.util.Optional;

@WebAppConfiguration
public class PersonRepositoryTest extends SbDemoApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void create() {
        Person p = new Person();
        p.setName("hanna");
        p.setEmail("hanna@naver.com");
        p.setCreateAt(LocalDateTime.now());
        p.setCreateBy("siwon");

        System.out.println(p.toString());
        personRepository.save(p);
    }

    @Test
    public void read() {
        Optional<Person> person = personRepository.findById(1);
        Assertions.assertTrue(person.isPresent());
        person.ifPresent(p -> {
            System.out.println(p);
        });
    }
}
