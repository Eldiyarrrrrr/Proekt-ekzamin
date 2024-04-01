package dao.daoImpl;

import dao.PesonDao;
import database.DataBase;
import model.Person;

import java.util.List;

public class PersonDaoImpl implements PesonDao {


    @Override
    public void savePerson(Person person) {
        DataBase.people.add(person);
        System.out.println("successfully added");
    }

    @Override
    public List<Person> getAllPerson() {
        return DataBase.people;
    }

    @Override
    public Person getPersonByName(String name) {
        for (Person person : DataBase.people) {
            if (person.getFirstName().equals(name)) {
                return person;
            }
        }
        throw new RuntimeException("Person not found");
    }

    @Override
    public Person updatePersonById(Long id, Person person) {
        for (Person person1 : DataBase.people) {
            if (person1.getId().equals(id)) {
                person1.setFirstName(person.getFirstName());
                person1.setLastName(person.getLastName());
                person1.setAge(person.getAge());
                person1.setEmail(person.getEmail());
                return person1;
            }
        }
        throw new RuntimeException("Person mot found");
    }

    @Override
    public String deletePersonById(Long id) {
        for (Person person : DataBase.people) {
            if (person.getId().equals(id)) {
                DataBase.people.remove(person);
                return "person successfully deleted";
            }
        }
        throw new RuntimeException("Person mot found");
    }

}

