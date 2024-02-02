package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    // example test data
    Dillo babyDillo = new Dillo(5,false);
    Dillo otherDillo = new Dillo(100, true);


    Zoo myZoo = new Zoo(babyDillo, otherDillo);
    Zoo myZoo2 = new Zoo(babyDillo, new Dillo(50, false));

    // A new Zoo containing a Dillo and a Boa
    Zoo myZoo3 = new Zoo(otherDillo, new Boa("slinky", 20, "lettuce"));

    // ??? aaa = new SizedAnimal(12); // This is not meaningful!

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(1+1, 2);
    }
    @Test
    public void testMakeDillo() {
        Assert.assertEquals(5, babyDillo.length);
    }

    @Test
    public void testCanShelter() {

        Assert.assertEquals(false, babyDillo.canShelter());

        // We can also make objects inside test methods
        // these objects live ONLY inside the method in which they're declared
        Dillo medDillo = new Dillo(20, false);
        Assert.assertEquals(false, medDillo.canShelter());
    }

    @Test
    public void testFunStuff() {
        Shark shark1 = new Shark(100, 0.5, 0);
        Shark shark2 = new Shark(80, 0.5, 0);

        shark2 = new Shark(65, 0.5, 0);
        System.out.println(shark2.length);

        Shark shark3 = shark1;
        shark3.attacks = 1;
        System.out.println(shark1.attacks);

    }

}
