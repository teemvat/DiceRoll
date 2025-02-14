import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll() {
        Dice dice = new Dice();
        dice.roll();
        assertNotEquals(0, dice.getDie1());
        assertNotEquals(0, dice.getDie2());
    }

    @Test
    void isDoubles() {
        Dice dice = new Dice();
        dice.roll();
        if (dice.getDie1() == dice.getDie2()) {
            assertTrue(dice.isDoubles());
        } else {
            assertFalse(dice.isDoubles());
        }
    }

    @Test
    void getDie1() {
        Dice dice = new Dice();
        assertEquals(0, dice.getDie1());
    }

    @Test
    void getDie2() {
        Dice dice = new Dice();
        assertEquals(0, dice.getDie2());
    }
}