package service;

import model.Person;

import java.util.List;

public interface PersonService {
    void savePerson(Person person);
    List<Person> getAllPerson();
    Person getPersonByName(String name);
    Person updatePersonById(Long id,Person person);
    String deletePersonById(Long id);
}
