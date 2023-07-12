package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        //Given
        Cat cat = new Cat("Charlie", new Date(), 0);
        String expected = "Lola";

        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        Cat cat = new Cat("Charlie", new Date(), 0);
        Date expected = null ;

        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        Cat cat = new Cat("Charlie", new Date(), 1);
        int expected = 1;

        //When
        int actual = cat.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        //Given
        Cat cat = new Cat("Charlie", new Date(), 0);
        String expected = "meow!";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        //Given
        Cat cat = new Cat("Charlie", new Date(), 0);
        Food food = new Food();
        int expected = 1;

        //When
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsMammal() {
        Mammal cat = new Cat("Charlie", null, 0);
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void testIsAnimal() {
        Animal cat = new Cat("Charlie", null, 0);
        Assert.assertTrue(cat instanceof Animal);
    }
}
