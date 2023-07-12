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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        Cat cat = new Cat("Charlie", null, 1);
        CatHouse.clear();
        CatHouse.add(cat);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd() {

        Cat cat = new Cat("Charlie", null, 1);
        CatHouse.clear();
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(cat, actual);
    }

    @Test
    public void testRemoveCat() {
        Cat cat = new Cat("Charlie", null, 1);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertNull(CatHouse.getCatById(1));
    }

    @Test
    public void testRemoveById() {
        Cat cat = new Cat("Charlie", null, 1);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(1);
        Assert.assertNull(CatHouse.getCatById(1));
    }

    @Test
    public void testGetById() {
        Cat cat = new Cat("Charlie", null, 1);
        CatHouse.clear();
        CatHouse.add(cat);
        Assert.assertEquals(cat, CatHouse.getCatById(1));
    }
}
