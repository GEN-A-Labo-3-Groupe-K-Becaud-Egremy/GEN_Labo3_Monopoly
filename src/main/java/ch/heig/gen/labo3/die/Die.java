package ch.heig.gen.labo3.die;

import java.util.Random;

public class Die {
    public final static int MAX_VALUE = 6;
    public final static int MIN_VALUE = 1;

    private int          faceValue;
    private final Random rand;

    /**
     * Constructor of Die.
     */
    public Die() {
        faceValue = MIN_VALUE;
        rand = new Random();
    }

    /**
     * Roll the die to get a new face value.
     */
    public void roll() {
        faceValue = rand.nextInt((MAX_VALUE + 1) - MIN_VALUE) + MIN_VALUE;
    }

    /**
     * Get the current face value.
     * @return Face value as an int.
     */
    public int getFaceValue() {
        return this.faceValue;
    }
}
