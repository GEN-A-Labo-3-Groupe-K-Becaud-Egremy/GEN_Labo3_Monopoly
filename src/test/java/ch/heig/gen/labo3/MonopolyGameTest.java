package ch.heig.gen.labo3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class MonopolyGameTest {
    private final static int MAX_PLAYER = 8;
    private final static int MIN_PLAYER = 2;

    @ParameterizedTest
    @ValueSource(ints = {-1, MIN_PLAYER - 1, MAX_PLAYER + 1})
    public void shouldThrowExceptionWhenNbPlayersParameterIsOutOfBoundary(int nbPlayers) {
        assertThrows(IllegalArgumentException.class, () -> {
            new MonopolyGame(nbPlayers);
        });
    }

    @Test
    public void shouldBeAbleToPlayAGameOfMonopoly() {
        try {
            (new MonopolyGame(MIN_PLAYER)).playGame();
        } catch (Exception ex) {
            ex.getCause();
            fail();
        }
    }
}
