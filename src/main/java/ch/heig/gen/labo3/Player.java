package ch.heig.gen.labo3;

import java.util.List;

public class Player {
    private String    name;
    private Board     board;
    private List<Die> dices;
    private Piece     piece;

    /**
     * Constructor of player.
     * @param name Name of player
     * @param board Board where the piece is moved.
     * @param dices List of dices to play with.
     */
    public Player(String name, Board board, List<Die> dices) {
        this.name  = name;
        this.board = board;
        this.dices = dices;
        this.piece = new Piece(this.name + "'s piece", board.getSquare(0));
    }

    /**
     * Make the player take a turn.
     */
    public void takeTurn() {
        int    dicesTotal = 0;
        Square oldLoc;
        Square newLoc;

        System.out.print(name + " roll the dices [ " );

        // Get the total value of rolled dices
        for (Die die : dices) {
            die.roll();
            dicesTotal += die.getFaceValue();
            System.out.print(die.getFaceValue() + " ");
        }
        System.out.print("], ");

        // Get old/new squares locations
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, dicesTotal);
        System.out.println("moving " + piece.getName() + " by " + dicesTotal + " square(s) from \'" + oldLoc.getName() +
                "\' to \'" + newLoc.getName() + "\'");

        // Move piece
        piece.setLocation(newLoc);
    }
}
