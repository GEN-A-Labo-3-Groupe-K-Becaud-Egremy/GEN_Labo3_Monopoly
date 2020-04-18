package ch.heig.gen.labo3;

import ch.heig.gen.labo3.die.Cup;
import ch.heig.gen.labo3.square.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {

    private static Player player;

    /**
     * Fake Cup class. Always return a total of 2.
     */
    private class FakeCup extends Cup {

        public FakeCup() {
            super(1);
        }

        @Override
        public void roll() {};

        @Override
        public int getTotal() {
            return 2;
        }
    }

    @BeforeEach
    public void createPlayer() {
        player = new Player("J1", new Board(), new FakeCup());
    }

    @Test
    public void shouldBeAbleToAddAndReduceCash() {
        player.addCash(100);
        assertEquals(100, player.getNetWorth());
        player.reduceCash(40);
        assertEquals(60, player.getNetWorth());
    }

    @Test
    public void shouldBeAbleToTakeTurn() {
        player.takeTurn();
        assertNotNull(player.getLocation());
        assertEquals(player.getLocation().getName(), "Square 2");
    }
}
