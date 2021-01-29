package com.javacoding.Test;

import com.javacoding.Test.modals.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PersonTest {

    @Mock
    Person person;

    @Test
    public void personTest(){
        Person person1 = new Person();
        person1.setId(11);
        person1.setFirstName("Gopalgari");
        person1.setSurName("Sreenivasulu");
        Assert.assertNotNull(person);

        Mockito.when(person.getFirstName()).thenReturn("Gopalgari");
        Mockito.when(person.getSurName()).thenReturn("Sreenivasulu");
        Mockito.when(person.getId()).thenReturn(11);

        Assert.assertEquals(person.getFirstName(),"Gopalgari");
        Assert.assertEquals(person.getSurName(),"Sreenivasulu");
        Assert.assertTrue(person.getId()==11);
    }
}
