package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit Test for the Class Tea.
 * @author Theresa Urbanek
 */
class TeaTest {
    Tea tea;

    /**
     * creates a object of type Tea
     */
    @BeforeEach
    void setup() {
        tea = new Tea("trialtea", 0.5, 0.002, "garden");
    }

    @Test
    @DisplayName("Testing volume")
    public void testVolume() {
        // EXERCISE PHASE
        double actual = tea.getVolume();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    @Test
    @DisplayName("Testing alcohol percent")
    public void testAlcoholPercent() {
        // EXERCISE PHASE
        double actual = tea.getAlcoholPercent();

        // VERIFY PHASE
        assertEquals(0.04, actual, 0.001);
    }

    @Test
    @DisplayName("Testing alcoholic")
    public void testAlcoholic() {
        // EXERCISE PHASE
        boolean actual = tea.isAlcoholic();

        // VERIFY PHASE
        assertEquals(true, actual);
    }

    @Test
    @DisplayName("Testing to String")
    public void testToString() {
        // EXERCISE PHASE
        String actual = tea.toString();

        // VERIFY PHASE
        assertEquals("Tea called " + tea.getName() + " with rum. Has in total " + tea.getAlcoholPercent() + " percent alcohol by volume.", actual);
    }

//    @Test
//    @DisplayName("Testing amountInLWater")
//    public void  testAmountInLWater() {
//        // EXERCISE PHASE
//        double actual = tea.getAmountInLWater();
//
//        // VERIFY PHASE
//        assertEquals(0.5, actual, 0.001);
//    }

//    @Test
//    @DisplayName("Testing amountInLRum")
//    public void  testAmountInLRum() {
//        // EXERCISE PHASE
//        double actual = tea.getAmountInLRum();
//
//        // VERIFY PHASE
//        assertEquals(0.002, actual, 0.001);
//    }

    @Test
    @DisplayName("Testing name")
    public void  testName() {
        // EXERCISE PHASE
        String actual = tea.getName();
        String expected = "trialtea";

        // VERIFY PHASE
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing herbs")
    public void  testHerbs() {
        // EXERCISE PHASE
        String actual = tea.getHerbs();
        String expected = "garden";

        // VERIFY PHASE
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing liquid water")
    public void  testWater() {
        // EXERCISE PHASE
        Liquid actual = tea.getWater();

        // VERIFY PHASE
        assertEquals(new Liquid("water", 0.5, 0), actual);
    }

    @Test
    @DisplayName("Testing liquid rum")
    public void  testRum() {
        // EXERCISE PHASE
        Liquid actual = tea.getRum();

        // VERIFY PHASE
        assertEquals(new Liquid("rum", 0.002, 20), actual);
    }

}