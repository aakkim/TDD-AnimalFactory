package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        String expectedName = "Charlie";
        Date expectedBday = new Date();
        Dog dog = AnimalFactory.createDog(expectedName, expectedBday);

        String actualName = dog.getName();
        Date actualBday = dog.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBday, actualBday);

    }

    @Test
    public void createCatTest() {
        String expectedName = "Charlie";
        Date expectedBday = new Date();
        Cat cat = AnimalFactory.createCat(expectedName, expectedBday);

        String actualName = cat.getName();
        Date actualBday = cat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBday, actualBday);
    }


}
