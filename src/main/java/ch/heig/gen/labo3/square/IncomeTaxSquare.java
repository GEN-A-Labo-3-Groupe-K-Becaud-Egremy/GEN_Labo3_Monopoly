package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Player;
import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {

    /**
     * Constructor of IncomeTaxSquare.
     */
    public IncomeTaxSquare() {
        super("Income Tax");
    }

    /**
     * When a player land on this square, perform a tax on player's cash.
     * @param player Player landing on the square.
     */
    @Override
    public void landedOn(Player player) {
        int tax = min(200, (int) (player.getNetWorth() * 0.1));
        player.reduceCash(tax);
        System.out.print("Paying " + tax + " cash of tax (sold: " + player.getNetWorth() + ").");
    }
}
