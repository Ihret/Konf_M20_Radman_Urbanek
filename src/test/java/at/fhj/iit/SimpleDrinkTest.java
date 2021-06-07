package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

/**
 * JUnit Test for the Class SimpleDrink
 * @author Mario Radman
 * @author Theresa Urbanek
 */
public class SimpleDrinkTest {

    // Needed for all functions.
    public SimpleDrink simpleDrink;

    /**
     * creates a object of type simpleDrink
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        simpleDrink = new SimpleDrink("Drink Name", new Liquid("Liquid Name", 50, 0.5));
    }

    /**
     * getVolume Test
     */
    @Test
    @DisplayName("getVolume Test")
    public void getVolumeTest() {
        // EXERCISE PHASE
        double actual = simpleDrink.getVolume();

        // VERIFY PHASE
        assertEquals(50, actual);
    }

    /**
     * getAlcoholPercent Test
     */
    @Test
    @DisplayName("getAlcoholPercent Test")
    public void getAlcoholPercentTest() {
        // EXERCISE PHASE
        double actual = simpleDrink.getAlcoholPercent();

        // VERIFY PHASE
        assertEquals(0.5, actual);
    }

    /**
     * getPrice Test
     */
    @Test
    @DisplayName("getPrice Test")
    public void getPriceTest() {
        // EXERCISE PHASE
        double actual = simpleDrink.getPrice();

        // VERIFY PHASE
        assertEquals(107.14, actual, 0.001);
    }

    /**
     * getDate Test
     */
    @Test
    @DisplayName("getDate Test")
    public void getDateTest() {
        // EXERCISE PHASE
        Date actual = simpleDrink.getDate();

        // VERIFY PHASE
        assertEquals(new Date(System.currentTimeMillis()), actual);
    }

    /**
     * isAlcoholic 1. Test
     * For alcoholic is true
     */
    @Test
    @DisplayName("isAlcoholic Test for True")
    public void isAlcoholicTrueTest() {
        // EXERCISE PHASE
        boolean actual = simpleDrink.isAlcoholic();

        // VERIFY PHASE
        assertEquals(true, actual);
    }

    /**
     * isAlcoholic 2. Test
     * For alcoholic is false
     */
    @Test
    @DisplayName("isAlcoholic Test for False")
    public void isAlcoholicFalseTest() {
        // SETUP PHASE
        SimpleDrink simpleDrinkWithoutAlc = new SimpleDrink("Drink Name", new Liquid("Liquid Name", 50, 0.0));

        // EXERCISE PHASE
        boolean actual = simpleDrinkWithoutAlc.isAlcoholic();

        // VERIFY PHASE
        assertEquals(false, actual);
    }

    /**
     * Tests the toString method
     */
    @Test
    @DisplayName("toString Test")
    public void toStringTest() {
        // EXERCISE PHASE
        String actual = simpleDrink.toString();

        // VERIFY PHASE
        assertEquals("Simple Drink called Drink Name with 0.5 percent alcohol by volume", actual);
    }
}
