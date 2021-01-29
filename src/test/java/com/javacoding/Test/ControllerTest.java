package com.javacoding.Test;

import com.javacoding.Test.controllers.PersonController;
import com.javacoding.Test.modals.Person;
import com.javacoding.Test.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {

    @Mock
    private PersonController personController;

    @Mock
    private PersonRepository personRepository;
    @Mock
    private Person personM;

    @Mock
    private List<Person> persons;

    @Test
    public void testSaveMethod() {
        Person person = new Person();
        person.setFirstName("Gopalgari");
        person.setSurName("Sreenivasulu");

        Mockito.when(personController.savePerson(personM)).thenReturn(person);
        Mockito.when(personController.getAllPersons()).thenReturn(persons);
        Mockito.when(personController.countPersons()).thenReturn(1l);
        Mockito.when(personController.deletePerson(1)).thenReturn("Deleted Sucessfully");
        Mockito.when(personController.updatePerson(personM)).thenReturn(person);


    }
}
