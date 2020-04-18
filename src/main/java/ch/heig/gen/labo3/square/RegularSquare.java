package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Player;

public class RegularSquare extends Square {

    /**
     * Constructor of RegularSquare.
     * @param name Name of the square
     */
    public RegularSquare(String name) {
        super(name);
    }

    /**
     * When a player land on this square, do nothing.
     * @param player Player landing on the square.
     */
    @Override
    public void landedOn(Player player) {
        // Nothing implemented for a regular square.
    }
}
