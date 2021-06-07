package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;



/**
 * JUnit Test for the Class Coffee.
 * @author Mario Radman
 */
public class CoffeeTest {

    // Needed for all functions.
    public Coffee coffee;

    @BeforeEach
    void setup() {
        // SETUP PHASE
        coffee = new Coffee("Coffee Name 3! - 100%", 100, 50, 3);
    }

    /**
     * VOLUME STRENGTH Test
     * Includes Tests for Underflow and Overflow
     */
    @ParameterizedTest
    @CsvSource({
            // Underflow test
            "-999999999,    150",
            "-10,           150",
            // Expected values
            " 1,            150",
            " 3,             83.333",
            " 6,             66.666",
            " 8,             62.5",
            " 10,            60",
            // Overflow test
            " 20,            60",
            " 999999999,     60"
    })
    @DisplayName("Testing Volume with different strength")
    void volumeStrengthTest(int strength, double expected){
        // SETUP PHASE
        coffee = new Coffee("CoffeeName",100,50, strength);

        // EXERCISE PHASE
        double actual = coffee.getVolume();

        // VERIFY PHASE
        assertEquals(expected,actual,0.001);
    }

    /**
     * STRENGTH Test
     * Includes Tests for Underflow and Overflow
     */
    @ParameterizedTest
    @CsvSource({
            // Underflow test
            "-999999999,    1",
            "-10,           1",
            // Expected values
            " 1,            1",
            " 3,            3",
            " 6,            6",
            " 8,            8",
            " 10,           10",
            // Overflow test
            " 20,           10",
            " 999999999,    10"
    })
    @DisplayName("Testing Volume with different strength")
    void strengthTest(int strength, double expected){
        // SETUP PHASE
        coffee = new Coffee("CoffeeName",100,50, strength);

        // EXERCISE PHASE
        int actual = coffee.getStrength();

        // VERIFY PHASE
        assertEquals(expected,actual,0.001);
    }


    @Test
    @DisplayName("Coffee Name Test")
    void coffeeNameTest() {
        // EXERCISE PHASE
        String actual = coffee.getName();

        // VERIFY PHASE
        assertEquals("Coffee Name 3! - 100%", actual);
    }

    @Test
    @DisplayName("Alcohol percentage Test")
    void alcoholPercentageTest() {
        // EXERCISE PHASE
        double actual = coffee.getAlcoholPercent();

        // VERIFY PHASE
        assertEquals(0, actual, 0.001);
    }

    @Test
    @DisplayName("Alcohol Test")
    void alcoholTest() {
        // EXERCISE PHASE
        boolean actual = coffee.isAlcoholic();

        // VERIFY PHASE
        assertEquals(false, actual);
    }

    @Test
    @DisplayName("Water Test")
    void waterTest() {
        // EXERCISE PHASE
        Liquid actual = coffee.getWater();

        // VERIFY PHASE
        assertEquals(new Liquid("Water", 100, 0.000), actual);
    }

    @Test
    @DisplayName("Milk Test")
    void milkTest() {
        // EXERCISE PHASE
        Liquid actual = coffee.getMilk();

        // VERIFY PHASE
        assertEquals(new Liquid("Milk", 50, 0.000), actual);
    }

    @Test
    @DisplayName("toString Test")
    void toStringTest() {
        // EXERCISE PHASE
        String actual = coffee.toString();
        String expected = "A coffee called " + coffee.getName() + ". It has a volume of " + coffee.getVolume() + " liter and consists of " + coffee.getMilk().getVolume() + " liter milk.";

        // VERIFY PHASE
        assertEquals(actual, expected);
    }

    /**
     * TESTING OF EQUALS FUNCTION IN Liquid (Test Nr. 1)
     * Needed for proper Testing of Coffee.
     */
    @Test
    @DisplayName("Liquid Equals Override Test - True")
    void liquidEqualsTrueTest() {

        // EXERCISE PHASE
        Liquid liquid1 = new Liquid("LiquidName", 123, 4.56);
        Liquid liquid2 = new Liquid("LiquidName", 123, 4.56);

        // VERIFY PHASE
        assertEquals(liquid1, liquid2);
    }


    /**
     * TESTING OF EQUALS FUNCTION IN Liquid (Test Nr. 2)
     * Needed for proper Testing of Coffee.
     */
    @Test
    @DisplayName("Liquid Equals Override Test - False")
    void liquidEqualsFalseTest() {

        // EXERCISE PHASE
        Liquid liquid1 = new Liquid("LiquidName", 123, 4.56);
        Liquid liquid2 = new Liquid("LiquidName", 123, 7.89);

        // VERIFY PHASE
        assertNotEquals(liquid1,liquid2);
    }


    /**
     * TESTING FOR CORRECT DATE
     * Needed for proper Testing of Coffee.
     */
    @Test
    @DisplayName("Test for getting actual Date")
    void testDate() {

        // EXERCISE PHASE
        Date actual = coffee.getDate();
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
        double actual = coffee.getPrice();

        // VERIFY PHASE
        assertEquals(actual,2.88,0.001);
    }

    /**
     * TESTING OF EQUALS FUNCTION IN Coffee (Test Nr. 1)
     */
    @Test
    @DisplayName("Coffee Equals Override Test - True")
    void coffeeEqualsTrueTest() {

        // EXERCISE PHASE
        Coffee newCoffee = new Coffee("Coffee Name 3! - 100%", 100, 50, 3);

        // VERIFY PHASE
        assertEquals(newCoffee, coffee);
    }


    /**
     * TESTING OF EQUALS FUNCTION IN Coffee (Test Nr. 2)
     */
    @Test
    @DisplayName("Coffee Equals Override Test - False")
    void coffeeEqualsFalseTest() {

        // EXERCISE PHASE
        Coffee newCoffee = new Coffee("Coffee Name 3! - 10%", 100, 50, 3);

        // VERIFY PHASE
        assertNotEquals(newCoffee, coffee);
    }

}