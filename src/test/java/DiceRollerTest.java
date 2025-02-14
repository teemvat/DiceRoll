import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollerTest {

    @Test
    void rollDice() {
        Dice dice = new Dice();
        DiceRoller diceRoller = new DiceRoller();
        diceRoller.rollDice(dice);
        assertNotEquals(0, dice.getDie1());
    }

    @Test
    void getTimesRolled() {
        Dice dice = new Dice();
        DiceRoller diceRoller = new DiceRoller();
        diceRoller.rollDice(dice);
        assertEquals(1, diceRoller.getTimesRolled());
    }

    @Test
    void rollUntilDoubles() {
        Dice dice = new Dice();
        DiceRoller diceRoller = new DiceRoller();
        diceRoller.rollUntilDoubles(dice);
        assertTrue(dice.isDoubles());
    }
}