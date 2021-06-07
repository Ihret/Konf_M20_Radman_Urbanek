package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit Test for the Class Liquid
 * @author Mario Radman
 * @author Theresa Urbanek
 */
public class LiquidTest {

    // Needed for all functions.
    public Liquid liquid;

    /**
     * creates a object of type Tea
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        liquid = new Liquid("LiquidName", 50, 0.5);
    }

    /**
     * Tests the Constructor by testing equality of a new object
     */
    @Test
    @DisplayName("Constructor and checkVolume Test")
    public void constructorTest() {
        // EXERCISE PHASE
        Liquid newLiquid = new Liquid("LiquidName", 50, 0.5);

        // VERIFY PHASE
        assertEquals(newLiquid, liquid);
    }

    /**
     * Makes a checkVolume Test which is wrong
     * Does it by performing a setVolume
     * throws an exception because volume is zero which is not allowed
     */
    @Test
    @DisplayName("checkVolume Test - Exception Expected")
    public void constructorWithExceptionTest() {
        try {
            // EXERCISE PHASE
            liquid.setVolume(0);
        } catch (IllegalArgumentException e) {
            // VERIFY PHASE
            assertThrows(IllegalArgumentException.class, () -> {Integer.parseInt("One");});
        }
    }

    /**
     * getName Test
     */
    @Test
    @DisplayName("getName Test")
    public void getNameTest() {
        // EXERCISE PHASE
        String actual = liquid.getName();

        // VERIFY PHASE
        assertEquals("LiquidName", actual);
    }

    /**
     * setName Test
     */
    @Test
    @DisplayName("setName Test")
    public void setNameTest() {
        // EXERCISE PHASE
        liquid.setName("Correct Name");

        // VERIFY PHASE
        assertEquals("Correct Name", liquid.getName());
    }

    /**
     * setVolume Test
     */
    @Test
    @DisplayName("setVolume Test")
    public void setVolumeTest() {
        // EXERCISE PHASE
        liquid.setVolume(17);

        // VERIFY PHASE
        assertEquals(17, liquid.getVolume());
    }

    /**
     * setAlcoholPercent Test
     */
    @Test
    @DisplayName("setAlcoholPercent Test")
    public void setAlcoholPercentTest() {
        // EXERCISE PHASE
        liquid.setAlcoholPercent(13);

        // VERIFY PHASE
        assertEquals(13, liquid.getAlcoholPercent());
    }
}
