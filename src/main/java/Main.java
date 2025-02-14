public class Main {

    public static void main(String[] args) {

        DiceRoller diceRoller = new DiceRoller();
        Dice dice = new Dice();

        diceRoller.rollUntilDoubles(dice);
    }
}
