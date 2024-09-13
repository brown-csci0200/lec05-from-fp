public class Shark extends Fish{

    public int attacks;

    public Shark(int len, double sal, int attacks) {
        super(len, sal); // Values for Fish's constructor
        this.attacks = attacks;

    }

    @Override // Replace the superclass's version of isNormalSize with this one
    public boolean isNormalSize() {
        return this.isLengthWithin(50, 200);
    }
}
