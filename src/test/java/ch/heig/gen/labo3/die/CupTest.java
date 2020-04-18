package ch.heig.gen.labo3.die;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {

    private final static int NB_DIE = 3;

    private static Cup cup;

    @BeforeAll
    public static void createDie() {
        cup = new Cup(NB_DIE);
    }

    @RepeatedTest(NB_DIE * (Die.MAX_VALUE - Die.MIN_VALUE + 1) * 2)
    public void shouldNotRollToAValueOutsideBoundary() {
        cup.roll();
        assertTrue(cup.getTotal() >= NB_DIE * Die.MIN_VALUE &&
                cup.getTotal() <= NB_DIE * Die.MAX_VALUE);
    }
}
