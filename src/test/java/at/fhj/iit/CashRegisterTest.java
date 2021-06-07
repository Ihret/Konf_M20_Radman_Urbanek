package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * JUnit Test for the Class CashRegister.
 * @author Mario Radman
 * @author Theresa Urbanek
 */
public class CashRegisterTest {

    // Needed for all functions.
    public static List<CashRegister> cashRegisterList = CashRegister.getCashRegisterList();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");

    /**
     * Fills the cashRegisterList (which is referred to the same List in CashRegister) with dummy-information
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        cashRegisterList.add(new CashRegister(new Tea("NameOfLowAlcoholicTea0", 0.4, 0.002, "mixed"),2, Seller.TIM));
        cashRegisterList.add(new CashRegister(new Tea("NameOfNonAlcoholicTea1", 0.6, 0.1, "normal"),1, Seller.JOE));
        cashRegisterList.add(new CashRegister(new Tea("NameOfHighAlcoholicTea2", 0.2, 16.1, "mixed"),2, Seller.TIM));
        cashRegisterList.add(new CashRegister(new Tea("NameOfLowAlcoholicTea3", 0.8, 16.0, "mixed-new"),4, Seller.TIM));
        cashRegisterList.add(new CashRegister(new Tea("NameOfHighAlcoholicTea4", 0.2, 20.0, "mixed"),3, Seller.JOE));
        cashRegisterList.add(new CashRegister(new Coffee("NameOfNonAlcoholicCoffee5", 0.3, 0.05, 5), 3, Seller.JOE));
    }

    /**
     * Needs a tear down, because the list would fill with every new setup with more and more entries and make results wrong
     */
    @AfterEach
    void tearDown() {
        // TEAR DOWN PHASE
        cashRegisterList.clear();
    }

    /**
     * Tests if the Method for adding a newly selled Dring to the ArrayList works
     */
    @Test
    @DisplayName("Sell Drinks Test")
    public void testSellDrinks() {
        // SETUP PHASE
        String drinkName = "newTeaDrink";
        double amountWater = 0.3;
        double amountRum = 0.02;
        String herbs = "herbsForDrink";
        int amountOfDrinks = 3;
        Seller seller = Seller.JOE;
        String Date = sdf.format(new Date(System.currentTimeMillis()));

        // EXERCISE PHASE
        CashRegister expected = new CashRegister(new Tea(drinkName, amountWater, amountRum, herbs), amountOfDrinks, seller);
        CashRegister.sellDrink(new CashRegister(new Tea(drinkName, amountWater, amountRum, herbs), amountOfDrinks, seller));

        // VERIFY PHASE
        assertEquals(expected, cashRegisterList.get(cashRegisterList.size()-1));
    }

    /**
     * Tests the nonalcoholic Drinks report
     */
    @Test
    @DisplayName("Nonalcoholic Drinks Report Test")
    public void reportNonAlcoholicDrinksTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportNoneAlcoholicDrinks();

        // VERIFY PHASE
        assertEquals(2.4, actual, 0.001);
    }

    /**
     * Tests the Low alcoholic drinks report
     */
    @Test
    @DisplayName("Low alcoholic Drinks Report Test")
    public void reportLowAlcoholicDrinksTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportLowAlcoholicDrinks();

        // VERIFY PHASE
        assertEquals(30.74, actual, 0.001);
    }

    /**
     * Tests the high alcoholic drinks report
     */
    @Test
    @DisplayName("High alcoholic Drinks Report Test")
    public void reportHighAlcoholicDrinksTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportHighAlcoholicDrinks();

        // VERIFY PHASE
        assertEquals(15681.02, actual, 0.001);
    }

    /**
     * Tests the Day report
     */
    @Test
    @DisplayName("Day Report Test")
    public void reportSpecificDayTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificDay(new Date(System.currentTimeMillis()));

        // VERIFY PHASE
        assertEquals(15714.16, actual, 0.001);
    }

    /**
     * Tests the seller report
     */
    @Test
    @DisplayName("Seller Report Test")
    public void reportSpecificSellerTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificSeller(Seller.JOE);

        // VERIFY PHASE
        assertEquals(6029.82, actual, 0.001);
    }

    /**
     * Test the report for a specific seller AND specific day in once
     */
    @Test
    @DisplayName("Report for spec. Seller on spec. Day Test")
    public void reportSpecificDaySellerTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificDaySeller(new Date(System.currentTimeMillis()), Seller.JOE);

        // VERIFY PHASE
        assertEquals(6029.82, actual, 0.001);
    }

    /**
     * Day Report test, but expects no entries and therefore 0 as return
     * @throws ParseException
     */
    @Test
    @DisplayName("Day Report Test - Null")
    public void reportSpecificDayNullTest() throws ParseException {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificDay(sdf.parse("13-06-2020"));

        // VERIFY PHASE
        assertEquals(0.0, actual, 0.001);
    }

    /**
     * Seller Report test, but expects no entries and therefore 0 as return
     */
    @Test
    @DisplayName("Seller Report Test - Null")
    public void reportSpecificSellerNullTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificSeller(Seller.MIKE);

        // VERIFY PHASE
        assertEquals(0.0, actual, 0.001);
    }

    /**
     * Specific Day AND Seller Report test, but expects no entries and therefore 0 as return
     * No entries for this seller
     */
    @Test
    @DisplayName("Report for spec. Seller on spec. Day Test - Null for Seller")
    public void reportSpecificDaySellerNullSellerTest() {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificDaySeller(new Date(System.currentTimeMillis()), Seller.MIKE);

        // VERIFY PHASE
        assertEquals(0, actual, 0.001);
    }

    /**
     * Day Report test, but expects no entries and therefore 0 as return
     * No entries for this date
     * @throws ParseException
     */
    @Test
    @DisplayName("Report for spec. Seller on spec. Day Test - Null for Date")
    public void reportSpecificDaySellerNullDateTest() throws ParseException {
        // EXERCISE PHASE
        double actual = CashRegister.reportSpecificDaySeller(sdf.parse("13-06-2020"), Seller.JOE);

        // VERIFY PHASE
        assertEquals(0, actual, 0.001);
    }

    /**
     * TESTING OF EQUALS FUNCTION IN CashRegister (Test Nr. 1)
     */
    @Test
    @DisplayName("CashRegister Equals Override Test - True")
    void coffeeEqualsTrueTest() {

        // EXERCISE PHASE
        CashRegister newCashRegister = new CashRegister(new Tea("NameOfLowAlcoholicTea0", 0.4, 0.002, "mixed"),2, Seller.TIM);

        // VERIFY PHASE
        assertEquals(cashRegisterList.get(0), newCashRegister);
    }


    /**
     * TESTING OF EQUALS FUNCTION IN CashRegister (Test Nr. 2)
     */
    @Test
    @DisplayName("CashRegister Equals Override Test - False")
    void coffeeEqualsFalseTest() {

        // EXERCISE PHASE
        CashRegister newCashRegister = new CashRegister(new Tea("NameOfLowAlcoholicTeaWRONG", 0.4, 0.002, "mixed"),2, Seller.TIM);

        // VERIFY PHASE
        assertNotEquals(cashRegisterList.get(0), newCashRegister);
    }

}
