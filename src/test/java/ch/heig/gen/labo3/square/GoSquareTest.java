package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Board;
import ch.heig.gen.labo3.Player;
import ch.heig.gen.labo3.die.Cup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {
    @Test
    public void shouldAddCashToPlayerLandingOnTheSquare() {
        Player player = new Player("J1", new Board(), new Cup(1));
        GoSquare go = new GoSquare();
        go.landedOn(player);
        assertEquals(go.AMOUNT, player.getNetWorth());
    }
}
