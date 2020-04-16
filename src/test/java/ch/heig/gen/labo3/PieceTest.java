package ch.heig.gen.labo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {

    private static final String PIECE_NAME         = "Test's piece";
    private static final String ORIGIN_SQUARE_NAME = "Original square";

    private static Piece piece;

    @BeforeEach
    public void createPiece() {
        piece = new Piece(PIECE_NAME, new Square(ORIGIN_SQUARE_NAME));
    }

    @Test
    public void shouldHaveOriginalPieceAndSquareNames() {
        assertEquals(PIECE_NAME, piece.getName());
        assertEquals(ORIGIN_SQUARE_NAME, piece.getLocation().getName());
    }

    @Test
    public void shouldBeAbleToChangeLocation() {
        final String NEW_SQUARE_NAME = "New square";
        Square newLocation = new Square(NEW_SQUARE_NAME);
        assertEquals(ORIGIN_SQUARE_NAME, piece.getLocation().getName());
        piece.setLocation(newLocation);
        assertEquals(NEW_SQUARE_NAME, piece.getLocation().getName());
    }
}
