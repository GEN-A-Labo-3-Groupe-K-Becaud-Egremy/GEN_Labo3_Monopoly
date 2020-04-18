package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Board;
import ch.heig.gen.labo3.Player;
import ch.heig.gen.labo3.die.Cup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoToJailSquareTest {
    @Test
    public void shouldMovePlayerToJail() {
        Player player = new Player("J1", new Board(), new Cup(1));
        JailSquare jail = new JailSquare();
        GoToJailSquare goToJail = new GoToJailSquare(jail);
        goToJail.landedOn(player);
        assertEquals(player.getLocation(), jail);
    }
}
