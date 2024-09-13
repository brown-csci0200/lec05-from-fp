public class Fish extends SizedAnimal {

    public double salinity;

    public Fish(int len, double salinity) {
        super(len); // Set up SizedAnimal
        this.salinity = salinity;
    }

    public boolean isNormalSize() {
        return this.isLengthWithin(5, 100);
    }
}
