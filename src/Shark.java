package src;

public class Shark extends Fish {
    public int attacks;

    public Shark(int howLong, double sal, int a) {
        super(howLong, sal);
        this.attacks = a;
    }

    // @Override tells Java that we are replacing a method that the superclass already has
    @Override
    public boolean isNormalSize() {
        return this.isLengthWithin(50, 100);
    }
}
