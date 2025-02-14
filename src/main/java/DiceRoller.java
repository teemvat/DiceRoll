public class DiceRoller {
    private int timesRolled;

    public DiceRoller() {
        timesRolled = 0;
    }

    public void rollDice(Dice dice) {
        dice.roll();
        timesRolled++;
    }

    public int getTimesRolled() {
        return timesRolled;
    }

    public void rollUntilDoubles(Dice dice) {
        while (!dice.isDoubles()) {
            System.out.println("Rolling the dice...");
            rollDice(dice);
            System.out.println("Die 1: " + dice.getDie1());
            System.out.println("Die 2: " + dice.getDie2());
            if (dice.isDoubles()) {
                System.out.println("Doubles!");
                System.out.println("It took " + getTimesRolled() + " rolls to get doubles.");
            } else {
                System.out.println("Not doubles.\n");
            }
        }
    }
}
