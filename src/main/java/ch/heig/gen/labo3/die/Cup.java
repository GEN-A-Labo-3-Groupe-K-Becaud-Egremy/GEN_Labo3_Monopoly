package ch.heig.gen.labo3.die;

import java.util.ArrayList;
import java.util.List;

public class Cup {

    private List<Die> dices;
    private int totalValues;

    /**
     * Constructor of Cup.
     * @param nbDices Number of dices in the cup.
     */
    public Cup(int nbDices) {
        this.dices = new ArrayList<>();
        for (int i = 0; i < nbDices; i++) {
            dices.add(new Die());
        }
    }

    /**
     * Roll the die to get a new face value.
     */
    public void roll() {

        totalValues = 0;

        // Get the total value of rolled dices
        System.out.print("[ ");
        for (Die die : dices) {
            die.roll();
            totalValues += die.getFaceValue();
            System.out.print(die.getFaceValue() + " ");
        }
        System.out.print("]");;
    }

    /**
     * Get the current face value.
     * @return Face value as an int.
     */
    public int getTotal() {
        return this.totalValues;
    }
}
