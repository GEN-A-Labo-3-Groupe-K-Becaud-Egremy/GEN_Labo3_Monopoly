package ch.heig.gen.labo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardTest {

    private static Board board;

    @BeforeAll
    static void createBoard() {
        board = new Board();
    }

    @Test
    public void shouldReturnTheExpectedSquareWithIndexUse() {
        assertEquals("GO", board.getSquare(0).getName());
        assertEquals("Square 5", board.getSquare(5).getName());
    }

    @Test
    public void shouldReturnTheExpectedSquareWithOffsetUse() {
        assertEquals("Square 10",
                board.getSquare(
                        board.getSquare(5), 5).getName());
    }

    @Test
    public void shouldThrowExceptionWhenTryingToAccessOutOfRangeSquare() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            board.getSquare(100);
        });
    }
}