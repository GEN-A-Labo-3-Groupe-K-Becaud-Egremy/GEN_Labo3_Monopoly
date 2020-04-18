package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Player;

public class GoSquare extends Square{

    public final int AMOUNT  = 200;

    /**
     * Constructor of GoSquare.
     */
    public GoSquare() {
        super("GO");
    }

    /**
     * When a player land on this square, he receive an AMOUNT of cash.
     * @param player Player receiving the AMOUNT.
     */
    @Override
    public void landedOn(Player player) {
        player.addCash(AMOUNT);
        System.out.print("Receiving " + AMOUNT + " cash (sold: " + player.getNetWorth() + ").");
    }
}
