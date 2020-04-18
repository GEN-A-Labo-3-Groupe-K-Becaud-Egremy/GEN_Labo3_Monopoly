package ch.heig.gen.labo3.square;

import ch.heig.gen.labo3.Board;
import ch.heig.gen.labo3.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxSquareTest {
    @Test
    public void shouldTax10PourcentAPlayerWhenLandedOn() {
        Player player = new Player("J1", new Board(), null);
        IncomeTaxSquare taxSquare = new IncomeTaxSquare();
        player.addCash(4000);
        taxSquare.landedOn(player);
        assertEquals(3800, player.getNetWorth());
    }

    @Test
    public void shouldTaxMax200CashAPlayerWhenLandedOn() {
        Player player = new Player("J1", new Board(), null);
        IncomeTaxSquare taxSquare = new IncomeTaxSquare();
        player.addCash(1000);
        taxSquare.landedOn(player);
        assertEquals(900, player.getNetWorth());
    }
}
