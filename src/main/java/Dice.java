public class Dice {
    private int die1;
    private int die2;

    public Dice() {
        die1 = 0;
        die2 = 0;
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public boolean isDoubles() {
        return die1 == die2 && die1 != 0;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }
}
