package service.impl;

import dao.daoImpl.PersonDaoImpl;
import model.Person;
import service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    PersonDaoImpl personDao = new PersonDaoImpl();

    @Override
    public void savePerson(Person person) {
        personDao.savePerson(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return personDao.getAllPerson();
    }

    @Override
    public Person getPersonByName(String name) {
        return personDao.getPersonByName(name);
    }

    @Override
    public Person updatePersonById(Long id, Person person) {
        return personDao.updatePersonById(id, person);
    }

    @Override
    public String deletePersonById(Long id) {
        return personDao.deletePersonById(id);
    }
}

