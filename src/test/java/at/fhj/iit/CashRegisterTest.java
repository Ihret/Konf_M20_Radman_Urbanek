package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit Test for the Class CashRegister.
 *
 * @author Theresa Urbanek
 */
public class CashRegisterTest {

    // Needed for all functions.
    public static List<CashRegister> cashRegisterList = CashRegister.getCashRegisterList();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");

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

    @AfterEach
    void tearDown() {
        // TEAR DOWN PHASE
        cashRegisterList.clear();
    }

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
        assertEquals(cashRegisterList.get(cashRegisterList.size()-1), expected);
    }





//    Tea tea;
//    Coffee coffee;
//    CashRegister cashRegister;
////    CashRegister cashRegister1;
//
//
//    /**
//     * creates a object of type CashRegister which can be tea or coffee
//     */
//    @BeforeEach
//    void setup() {
//
//        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06.2021, Seller.TIM);
////        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06.2021, Seller.JOE);
//    }
//
////    @ParameterizedTest
////    @CsvSource({
////            // Underflow test
////            "-999999999,    150", "-10,           150",
////            // Expected values
////            " 1,            150", " 3,             83.333", " 6,             66.666", " 8,             62.5", " 10,  " +
////            "          60",
////            // Overflow test
////            " 20,            60", " 999999999,     60"})
//
//    @Test
//    @DisplayName("Testing sold drinks")
//    void soldDrinksTest(int amountOfSoldDrinks) {
//        // SETUP PHASE
//        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister.getAmountOfDrinks();
////        int actual = cashRegister.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(250, actual, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing sell drinks")
//    void soldDrinksTest(CashRegister cashRegister) {
//        // SETUP PHASE
//        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister.getAmountOfDrinks();
////        int actual = cashRegister.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(250, actual, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing reportNoneAlcoholicDrinks")
//    void reportNoneAlcoholicDrinksTest() {
//        // SETUP PHASE
//        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister.getAmountOfDrinks();
////        int actual = cashRegister.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(0.502, actual, 0.001);
////        assertEquals(0.502, actual2, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing reportHighAlcoholicDrinks")
//    void reportHighAlcoholicDrinksTest() {
//        // SETUP PHASE
//        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister1.getAmountOfDrinks();
////        int actual = cashRegister2.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(0.502, actual, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing reportSpecificDay")
//    void reportSpecificDayTest(int amountOfSoldDrinks) {
//        // SETUP PHASE
//        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister1.getAmountOfDrinks();
////        int actual = cashRegister2.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(0.502, actual, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing reportSpecificSeller")
//    void reportSpecificSellerTest(Seller seller) {
//        // SETUP PHASE
//        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister1.getSeller();
//
//        // VERIFY PHASE
//        assertEquals(0.502, actual, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing reportSpecificDaySeller")
//    void reportSpecificDaySellerTest(Date date, Seller seller) {
//        // SETUP PHASE
//        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister1.getAmountOfDrinks();
////        int actual = cashRegister2.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(0.502, actual, 0.001);
//    }
//
//    @Test
//    @DisplayName("Testing randomNumber")
//    void randomNumberTest(double min, double max) {
//        // SETUP PHASE
//        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
////        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);
//
//        // EXERCISE PHASE
//        int actual = cashRegister1.getAmountOfDrinks();
////        int actual = cashRegister2.getAmount();
//
//        // VERIFY PHASE
//        assertEquals(0.502, actual, 0.001);
//    }
//












}
