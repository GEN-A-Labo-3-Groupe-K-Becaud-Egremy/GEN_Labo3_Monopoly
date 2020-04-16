package ch.heig.gen.labo3;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int NB_SQUARE = 40;

    private final List<Square> squares;

    /**
     * Constructor of Board. Initialize all squares
     */
    public Board() {
        squares = new ArrayList<>();
        squares.add(new Square("GO"));
        for (int i = 1; i < NB_SQUARE; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    /**
     * Get a square next to given Square parameter.
     * @param currentSquare Square of origin.
     * @param offset Offset to find the neighbour square.
     * @return Neighbour square.
     */
    public Square getSquare(Square currentSquare, int offset) {
        return getSquare((squares.indexOf(currentSquare) + offset) % NB_SQUARE);
    }

    /**
     * Get a square with an index.
     * @param index Index to find a Square in the list.
     * @return Instance of Square.
     * @throws ArrayIndexOutOfBoundsException if currentSquare + offset are out of bounds.
     */
    public Square getSquare(int index) throws ArrayIndexOutOfBoundsException{
        if (index >= NB_SQUARE) {
            throw new ArrayIndexOutOfBoundsException(
                    "The square you're trying to access is out of bound " +
                            "(given index: " + index + ").");
        }
        return squares.get(index);
    }
}
