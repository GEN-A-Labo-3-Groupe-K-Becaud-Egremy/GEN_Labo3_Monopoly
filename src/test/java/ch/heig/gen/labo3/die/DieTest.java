package ch.heig.gen.labo3.die;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {

    private static Die die;

    @BeforeAll
    public static void createDie() {
        die = new Die();
    }

    @RepeatedTest(20)
    public void shouldNotRollToAValueOutsideBoundary() {
        die.roll();
        assertTrue(die.getFaceValue() >= Die.MIN_VALUE &&
                   die.getFaceValue() <= Die.MAX_VALUE);
    }
}
