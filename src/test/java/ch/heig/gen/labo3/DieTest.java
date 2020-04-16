package ch.heig.gen.labo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    private final int MAX_VALUE = 6;
    private final int MIN_VALUE = 1;

    private static Die die;

    @BeforeAll
    public static void createDie() {
        die = new Die();
    }

    @RepeatedTest(20)
    public void shouldNotRollToAValueOutsideBoundary() {
        die.roll();
        assertTrue(die.getFaceValue() >= MIN_VALUE &&
                   die.getFaceValue() <= MAX_VALUE);
    }
}
