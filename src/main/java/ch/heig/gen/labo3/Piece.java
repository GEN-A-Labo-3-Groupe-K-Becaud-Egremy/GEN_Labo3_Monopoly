package ch.heig.gen.labo3;

import ch.heig.gen.labo3.square.Square;

public class Piece {
    private final String name;
    private Square       location;

    /**
     * Constructor of Piece.
     * @param name Name of the piece.
     * @param location Location in a Square of the piece.
     */
    public Piece(String name, Square location) {
        this.name = name;
        setLocation(location);
    }

    /**
     * Get the location of the piece.
     * @return Instance of Square where this piece is located.
     */
    public Square getLocation() {
        return this.location;
    }

    /**
     * Set the location of the piece.
     * @param location Square where the piece wil be located.
     */
    public void setLocation(Square location) {
        this.location = location;
    }

    /**
     * Get the name of the piece.
     * @return Instance of String.
     */
    public String getName() {
        return this.name;
    }
}
