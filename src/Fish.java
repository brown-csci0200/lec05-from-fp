package src;

public class Fish extends SizedAnimal{
    double salinity;

    public Fish(int howLong, double sal) {
        super(howLong);
        this.salinity = sal;
    }

    public boolean isNormalSize() {
        return super.isLengthWithin(5, 100);
    }
}
