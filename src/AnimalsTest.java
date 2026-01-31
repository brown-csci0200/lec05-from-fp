import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
    public void testSomethingFun() {
        Boa boa1 = new Boa("slinky", 30, "apples");
        Boa boa2 = new Boa("slim", 30, "bugs");

        boa1.eats = "tofu";
        boa2 = new Boa("slim", 15, "grass");

        Boa boa3 = boa1;
        boa3.eats = "donuts";
        //boa1 = new Boa(..)

//        Boa boa4 = new Boa(boa1);
        System.out.println(boa1.eats);
        // print(boa1.eats)
    }


    @Test
    public void someAdditionalFun() {
        Boa boaA = new Boa("a", 12, "tofu");
        Boa boaB = new Boa("b", 12, "cake");

        boaA.length = boaB.length + 1;

        Boa boaC = boaA;  // boaC now points to same object as boaA
        boaA = new Boa("a", 25, "paper");     // reassign name boaA to different object!
    }






















    @Test
    public void testFun() {
        Boa boa1 = new Boa("slinky", 30, "apples");
        Boa boa2 = new Boa("slim", 30, "bugs");

        boa1.eats = "tofu";
        boa2 = new Boa("slim", 15, "grass");

        Boa boa3 = boa1;
        boa3.eats = "donuts";


        System.out.println(boa3);
    }
}
