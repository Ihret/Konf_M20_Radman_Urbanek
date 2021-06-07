package at.fhj.iit;

import java.util.Date;

/**
 * JUnit Test for the Class CashRegister.
 *
 * @author Theresa Urbanek
 */
public class CashRegisterTest {
    Tea tea;
    Coffee coffee;
    CashRegister cashRegister;
//    CashRegister cashRegister2;


    /**
     * creates a object of type CashRegister which can be tea or coffee
     */
    @BeforeEach
    void setup() {

        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06.2021, Seller.TIM);
//        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06.2021, Seller.JOE);
    }

//    @ParameterizedTest
//    @CsvSource({
//            // Underflow test
//            "-999999999,    150", "-10,           150",
//            // Expected values
//            " 1,            150", " 3,             83.333", " 6,             66.666", " 8,             62.5", " 10,  " +
//            "          60",
//            // Overflow test
//            " 20,            60", " 999999999,     60"})

    @Test
    @DisplayName("Testing sold drinks")
    void soldDrinksTest(int amountOfSoldDrinks) {
        // SETUP PHASE
        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister.getAmountOfDrinks();
//        int actual = cashRegister.getAmount();

        // VERIFY PHASE
        assertEquals(250, actual, 0.001);
    }

    @Test
    @DisplayName("Testing sell drinks")
    void soldDrinksTest(CashRegister cashRegister) {
        // SETUP PHASE
        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister.getAmountOfDrinks();
//        int actual = cashRegister.getAmount();

        // VERIFY PHASE
        assertEquals(250, actual, 0.001);
    }

    @Test
    @DisplayName("Testing reportNoneAlcoholicDrinks")
    void reportNoneAlcoholicDrinksTest() {
        // SETUP PHASE
        cashRegister = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister.getAmountOfDrinks();
//        int actual = cashRegister.getAmount();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
//        assertEquals(0.502, actual2, 0.001);
    }

    @Test
    @DisplayName("Testing reportHighAlcoholicDrinks")
    void reportHighAlcoholicDrinksTest() {
        // SETUP PHASE
        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister1.getAmountOfDrinks();
//        int actual = cashRegister2.getAmount();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    @Test
    @DisplayName("Testing reportSpecificDay")
    void reportSpecificDayTest(int amountOfSoldDrinks) {
        // SETUP PHASE
        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister1.getAmountOfDrinks();
//        int actual = cashRegister2.getAmount();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    @Test
    @DisplayName("Testing reportSpecificSeller")
    void reportSpecificSellerTest(Seller seller) {
        // SETUP PHASE
        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister1.getSeller();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    @Test
    @DisplayName("Testing reportSpecificDaySeller")
    void reportSpecificDaySellerTest(Date date, Seller seller) {
        // SETUP PHASE
        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister1.getAmountOfDrinks();
//        int actual = cashRegister2.getAmount();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

    @Test
    @DisplayName("Testing randomNumber")
    void randomNumberTest(double min, double max) {
        // SETUP PHASE
        cashRegister1 = new CashRegister(new Tea("trialtea", 0.5, 0.002, "garden"), 250, 07.06 .2021, Seller.TIM);
//        cashRegister2 = new CashRegister(new coffee("CoffeeName", 100, 50, 5), 200, 07.06 .2021, Seller.JOE);

        // EXERCISE PHASE
        int actual = cashRegister1.getAmountOfDrinks();
//        int actual = cashRegister2.getAmount();

        // VERIFY PHASE
        assertEquals(0.502, actual, 0.001);
    }

}
