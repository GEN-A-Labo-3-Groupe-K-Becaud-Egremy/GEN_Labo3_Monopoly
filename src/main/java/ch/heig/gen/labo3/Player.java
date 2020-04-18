package ch.heig.gen.labo3;

import ch.heig.gen.labo3.die.Cup;
import ch.heig.gen.labo3.square.Square;

public class Player {
    private final String name;
    private final Board  board;
    private final Cup    cup;
    private final Piece  piece;
    private int          money;

    /**
     * Constructor of player.
     * @param name Name of player
     * @param board Board where the piece is moved.
     * @param cup Cup of dices to play with.
     */
    public Player(String name, Board board, Cup cup) {
        this.name  = name;
        this.board = board;
        this.cup   = cup;
        this.piece = new Piece(this.name + "'s piece", board.getSquare(0));
        money      = 0;
    }

    /**
     * Read and return player's sold.
     * @return Sold of the player (only a readable indicator)
     */
    public int getNetWorth() {
        return money;
    }

    /**
     * Add cash in player's sold.
     * @param amount Amount to add.
     */
    public void addCash(int amount) {
        if (amount > 0) {
            money += amount;
        }
    }

    /**
     * Reduce cash in player's sold.
     * @param amount Amount to reduce.
     */
    public void reduceCash(int amount) {
        if (amount > 0) {
            money -= amount;
        }
    }

    /**
     * Get the location of player's piece.
     * @return square location for player's piece.
     */
    public Square getLocation() {
        return this.piece.getLocation();
    }

    /**
     * Set the location of player's piece.
     * @param square New square location for player's piece.
     */
    public void setLocation(Square square) {
        this.piece.setLocation(square);
    }

    /**
     * Make the player take a turn.
     */
    public void takeTurn() {
        Square oldLoc;
        Square newLoc;

        // Get the total value of rolled dices
        System.out.print(name + " roll the dices " );
        cup.roll();

        // Get old/new squares locations
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, cup.getTotal());
        System.out.print(". Moving " + piece.getName() + " by " + cup.getTotal() + " square(s) from \'" + oldLoc.getName() +
                "\' to \'" + newLoc.getName() + "\'. ");

        // Move piece
        setLocation(newLoc);
        newLoc.landedOn(this);
        System.out.print('\n');
    }
}
