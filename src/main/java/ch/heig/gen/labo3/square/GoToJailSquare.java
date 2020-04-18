package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Player;

public class GoToJailSquare extends Square {

    private final Square jail;

    /**
     * Constructor of GoToJailSquare.
     * @param jail Jail square.
     */
    public GoToJailSquare(Square jail) {
        super("Go to jail");
        this.jail = jail;
    }

    /**
     * When a player land on this square, set location of player's piece to jail square.
     * @param player Player landing on the square.
     */
    @Override
    public void landedOn(Player player) {
        player.setLocation(jail);
        System.out.print("Going to jail...");
    }
}
