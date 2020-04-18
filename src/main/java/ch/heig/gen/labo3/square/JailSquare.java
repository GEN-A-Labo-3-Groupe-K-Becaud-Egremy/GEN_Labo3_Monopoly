package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Player;

public class JailSquare extends Square {

    /**
     * Constructor of JailSquare.
     */
    public JailSquare() {
        super("Jail");
    }

    /**
     * When a player land on this square, visit the jail (nothing particular).
     * @param player Player landing on the square.
     */
    @Override
    public void landedOn(Player player) {
        // Visit the jail.
    }
}
