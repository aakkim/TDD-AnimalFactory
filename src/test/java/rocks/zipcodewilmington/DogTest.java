package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        Dog dog = new Dog("Charlie", null, 0);
        Date expected = null ;

        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        Dog dog = new Dog("Charlie", null, 1);
        int expected = 1;

        //When
        int actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        //Given
        Dog dog = new Dog("Charlie", null, 0);
        String expected = "bark!";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        //Given
        Dog dog = new Dog("Charlie", null, 0);
        Food food = new Food();
        int expected = 1;

        //When
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Mammal dog = new Dog("Charlie", null, 0);
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testImplementation() {
        Mammal dog = new Dog("Charlie", null, 0);
        Assert.assertTrue(dog instanceof Animal);
    }
}
