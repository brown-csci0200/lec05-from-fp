package src;

public class FruitFly implements IAnimal{
    // No fields, no data

    // Still needs to go in a Zoo

    // By implementing IAnimal directly,
    // we can avoid keeping track of a "size" field we don't want or need

    // If instead we extend SizedAnimal,
    // we have to carry around a "size" field that's functionally useless to us

    public FruitFly() {
    }

    public boolean isNormalSize() {
        return true;
    }
}
