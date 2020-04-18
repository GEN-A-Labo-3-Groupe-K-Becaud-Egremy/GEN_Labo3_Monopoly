package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Player;

public abstract class Square {
    private final String name;

    /**
     * Constructor of Square.
     * @param name Name of this square.
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * Get this square's name.
     * @return Instance of String.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Abstract method to perform an action toward a player when landing on a square.
     * @param player Player landing on the square.
     */
    public abstract void landedOn(Player player);
}
