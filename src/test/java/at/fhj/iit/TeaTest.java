package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit Test for the Class Tea.
 * @author Theresa Urbanek
 */
public class TeaTest {
    Tea tea;

    /**
     * creates a object of type Tea
     */
    @BeforeEach
    void setup() {
        tea = new Tea("trialtea", 0.5, 0.002, "garden");
    }

    /**
     * VOLUME TEST
     */
    @Test
    @DisplayName("Testing volume")
    public void testVolume() {
        // EXERCISE PHASE
        double actual = tea.getVolume();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    /**
     * ALCOHOL PERCENT TEST
     */
    @Test
    @DisplayName("Testing alcohol percent")
    public void testAlcoholPercent() {
        // EXERCISE PHASE
        double actual = tea.getAlcoholPercent();

        // VERIFY PHASE
        assertEquals(0.04, actual, 0.001);
    }

    /**
     * IS IT ALCOHOLIC TEST
     */
    @Test
    @DisplayName("Testing alcoholic")
    public void testAlcoholic() {
        // EXERCISE PHASE
        boolean actual = tea.isAlcoholic();

        // VERIFY PHASE
        assertEquals(true, actual);
    }

    /**
     * toString TEST
     */
    @Test
    @DisplayName("Testing to String")
    public void testToString() {
        // EXERCISE PHASE
        String actual = tea.toString();

        // VERIFY PHASE
        assertEquals("Tea called " + tea.getName() + " with rum. Has in total " + tea.getAlcoholPercent() + " percent alcohol by volume.", actual);
    }

    /**
     * CORRECT NAME TEST
     */
    @Test
    @DisplayName("Testing name")
    public void  testName() {
        // EXERCISE PHASE
        String actual = tea.getName();
        String expected = "trialtea";

        // VERIFY PHASE
        assertEquals(expected, actual);
    }

    /**
     * HERBS CORRECT NAME TEST
     */
    @Test
    @DisplayName("Testing herbs")
    public void  testHerbs() {
        // EXERCISE PHASE
        String actual = tea.getHerbs();
        String expected = "garden";

        // VERIFY PHASE
        assertEquals(expected, actual);
    }

    /**
     * LIQUID WATER TEST
     */
    @Test
    @DisplayName("Testing liquid water")
    public void  testWater() {
        // EXERCISE PHASE
        Liquid actual = tea.getWater();

        // VERIFY PHASE
        assertEquals(new Liquid("water", 0.5, 0), actual);
    }

    /**
     * LIQUID RUM TEST
     */
    @Test
    @DisplayName("Testing liquid rum")
    public void  testRum() {
        // EXERCISE PHASE
        Liquid actual = tea.getRum();

        // VERIFY PHASE
        assertEquals(new Liquid("rum", 0.002, 20), actual);
    }

    /**
     * TESTING FOR CORRECT DATE
     * Needed for proper Testing of Coffee.
     */
    @Test
    @DisplayName("Test for getting actual Date")
    void testDate() {

        // EXERCISE PHASE
        Date actual = tea.getDate();
        Date expected = new Date(System.currentTimeMillis());

        // VERIFY PHASE
        assertEquals(actual, expected);
    }


    /**
     * TEST FOR CORRECT CALCULATION OF PRIZE
     * Includes Test for correct rounding.
     */
    @Test
    @DisplayName("Correct prizing Test")
    void prizingCalculationTest(){

        // EXERCISE PHASE
        double actual = tea.getPrice();

        // VERIFY PHASE
        assertEquals(actual,7.47,0.001);
    }

}