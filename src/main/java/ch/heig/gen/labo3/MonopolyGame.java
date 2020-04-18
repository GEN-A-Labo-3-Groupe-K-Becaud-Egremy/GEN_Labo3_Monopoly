package ch.heig.gen.labo3;

import ch.heig.gen.labo3.die.Cup;
import ch.heig.gen.labo3.die.Die;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonopolyGame {
    private final static int MAX_PLAYER     = 8;
    private final static int MIN_PLAYER     = 2;
    private final int        NB_ROUND       = 20;
    private final int        NB_DIE         = 2;
    private final int        MONEY_STARTING = 1500;

    private Board              board;
    private final List<Player> players;
    private Cup                cup;

    /**
     * Constructor of MonopolyGame.
     * @param nbPlayers Number of players playing (must be within boundary MIN/MAX_PLAYER).
     * @throws IllegalArgumentException If nbPlayers parameter is out of bounds.
     */
    public  MonopolyGame(int nbPlayers) throws IllegalArgumentException {
        // Check if arg is within boundary
        if (nbPlayers < MIN_PLAYER || nbPlayers > MAX_PLAYER) {
            throw new IllegalArgumentException("nbPlayers argument must be within " +
                    MIN_PLAYER + " to " +
                    MAX_PLAYER + "(given: " + nbPlayers + ").");
        }
        // Initialize MonopolyGame's attributes
        this.board = new Board();
        this.cup   = new Cup(NB_DIE);
        this.players = new ArrayList<>();
        for (int i = 0; i < nbPlayers; i++) {
            players.add(new Player("J" + (i + 1), board, cup));
            players.get(i).addCash(MONEY_STARTING);
        }
    }

    /**
     * Play the Monopoly Game.
     */
    public void playGame() {
        System.out.println("The Monopoly's game begin!");
        for (int roundCnt = 0; roundCnt < NB_ROUND; roundCnt++) {
            playRound();
        }
        System.out.println("End of the Monopoly's game.");
    }

    /**
     * Make each player play his turn.
     */
    private void playRound() {
        for (Player p : players) {
            p.takeTurn();
        }
    }

    /**
     * Main program of MonopolyGame.
     * Play a game of Monopoly with a random number of players
     * (within boundary MIN/MAX_PLAYER).
     * @param args Arguments of class (unused).
     */
    public static void main(String[] args) {
        Random r = new Random();
        MonopolyGame mGame = new MonopolyGame(r.nextInt((MAX_PLAYER + 1) - MIN_PLAYER) + MIN_PLAYER);
        mGame.playGame();
    }
}
