package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAdd() {

        Dog dog = new Dog("Charlie", null, 1);
        DogHouse.clear();
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(dog, actual);
    }

    @Test
    public void testRemoveDog() {
        Dog dog = new Dog("Charlie", null, 1);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertNull(DogHouse.getDogById(1));
    }

    @Test
    public void testRemoveById() {
        Dog dog = new Dog("Charlie", null, 1);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(1);
        Assert.assertNull(DogHouse.getDogById(1));
    }

    @Test
    public void testGetById() {
        Dog dog = new Dog("Charlie", null, 1);
        DogHouse.clear();
        DogHouse.add(dog);
        Assert.assertEquals(dog, DogHouse.getDogById(1));
    }
}
