package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    // Needed for all functions.
    public SimpleDrink simpleDrink;

    @BeforeEach
    void setup() {
        // SETUP PHASE
        simpleDrink = new SimpleDrink("Drink Name", new Liquid("Liquid Name", 50, 0.5));
    }

    @Test
    @DisplayName("getVolume Test")
    public void getVolumeTest() {
        // EXERCISE PHASE
        double actual = simpleDrink.getVolume();

        // VERIFY PHASE
        assertEquals(50, actual);
    }

    @Test
    @DisplayName("getAlcoholPercent Test")
    public void getAlcoholPercentTest() {
        // EXERCISE PHASE
        double actual = simpleDrink.getAlcoholPercent();

        // VERIFY PHASE
        assertEquals(0.5, actual);
    }

    @Test
    @DisplayName("getPrice Test")
    public void getPriceTest() {
        // EXERCISE PHASE
        double actual = simpleDrink.getPrice();

        // VERIFY PHASE
        assertEquals(107.14, actual, 0.001);
    }

    @Test
    @DisplayName("getDate Test")
    public void getDateTest() {
        // EXERCISE PHASE
        Date actual = simpleDrink.getDate();

        // VERIFY PHASE
        assertEquals(new Date(System.currentTimeMillis()), actual);
    }

    @Test
    @DisplayName("isAlcoholic Test for True")
    public void isAlcoholicTrueTest() {
        // EXERCISE PHASE
        boolean actual = simpleDrink.isAlcoholic();

        // VERIFY PHASE
        assertEquals(true, actual);
    }

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

    @Test
    @DisplayName("toString Test")
    public void toStringTest() {
        // EXERCISE PHASE
        String actual = simpleDrink.toString();

        // VERIFY PHASE
        assertEquals("Simple Drink called Drink Name with 0.5 percent alcohol by volume", actual);
    }
}
