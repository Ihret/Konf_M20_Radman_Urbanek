package at.fhj.iit;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CashRegister {

    // initiate varies variables
    private static List<CashRegister> cashRegisterList = new ArrayList<CashRegister>();
    Selling drink;
    private int amount;
    private static Date date;
    private static CashRegister cash;
    private Seller seller;
    private static Tea tea;
    private static Coffee coffee;

    // -----------------GETTERandSETTER--------------------

    /**
     * method getDrink returns the kind of drink
     * @return
     */
    public Selling getDrink() {
        return drink;
    }

    /**
     * method setDrink sets the kind of drink
     * @param drink
     */
    public void setDrink(Selling drink) {
        this.drink = drink;
    }

    /**
     * method getAmount gets the amount of a drink
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * method setAmount sets the amount of a drink
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * method getDate gets the date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * method setDate sets a date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * method getSeller gets the name of the seller which is to choose from an enum list called Seller
     * @return
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * method setSeller sets the name of the seller which is to choose from an enum list called Seller
     * @param seller
     */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    /**
     * constructor CashRegister, creates a object with paramters: Selling drink, int amount, DAte date, Seller seller
     * @param drink
     * @param amount
     * @param date
     * @param seller
     */
    public CashRegister(Selling drink, int amount, Date date, Seller seller) {
        this.drink = drink;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }


    /**
     * method soldDrinks creates a list of sold drinks with random numbers
     * @param amountOfSoldDrinks
     */
    public static void soldDrinks(int amountOfSoldDrinks) {

        for (int i = amountOfSoldDrinks; i >= 0; i--) {
            if (i % 2 == 0) {
                tea = new Tea("tea", randomNumber(1, 250), randomNumber(1, 50), "none");
                cash = new CashRegister(tea, (int) randomNumber(1, 10), tea.getDate(), Seller.TIM);
            } else {
                coffee = new Coffee("coffee", randomNumber(1, 150), randomNumber(0, 50), (int) randomNumber(1, 10));
                cash = new CashRegister(coffee, (int) randomNumber(1, 10), coffee.getDate(), Seller.JOE);
            }
            cashRegisterList.add(cash);
        }
    }

    /**
     * method reportNoneAlcoholicDrinks returns a String where due to the amount of alcohol in this case 0 a report is written/calculated
     * @return
     */
    public static String reportNoneAlcoholicDrinks() {
        double totalSales = 0;
        int amount = 0;
        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().isAlcoholic() == true) {
                totalSales += cashRegisterList.get(i).getDrink().getPrice();
               amount += cashRegisterList.get(i).getAmount();
            }
        }
        return ("Total sales of none alcoholic drinks: " + totalSales + " currency unit, " + amount + " drinks (tea and coffee variations).");
    }


    /**
     * method reportLowAlcoholicDrinks returns a String where due to the amount of alcohol in this case smaller or equals 16% a report is written/calculated
     * @return
     */
    public static String reportLowAlcoholicDrinks() {
        double totalSales = 0;
        int amount = 0;
        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().getAlcoholPercent() <= 16) {
                totalSales += cashRegisterList.get(i).getDrink().getPrice();
                amount += cashRegisterList.get(i).getAmount();
            }
        }
        return ("Total sales of low alcoholic drinks (<=16%): " + totalSales + " currency unit, " + amount + " drinks (tea and coffee variations).");
    }

    /**
     * method reportHighAlcoholicDrinks returns a String where due to the amount of alcohol in this case >16% a report is written/calculated
     * @return
     */
    public static String reportHighAlcoholicDrinks() {
        double totalSales = 0;
        int amount = 0;
        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().getAlcoholPercent() > 16) {
                totalSales += cashRegisterList.get(i).getDrink().getPrice();
                amount += cashRegisterList.get(i).getAmount();
            }
        }
        return ("Total sales of high alcoholic drinks (>16%): " + totalSales + " currency unit, " + amount + " drinks (tea and coffee variations).");
    }

    /**
     * method reportSpecificDay returns a String where due to a specific date a report is written/calculated
     * @param date
     * @return
     */
    public static String reportSpecificDay(Date date) {
        double totalSales = 0;
        int amount = 0;
        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDate().equals(date)) {
                totalSales += cashRegisterList.get(i).getDrink().getPrice();
                amount += cashRegisterList.get(i).getAmount();
            }
        }
        return ("Total sales of " + date + ": " + totalSales + " currency unit, " + amount + " drinks (tea and coffee variations).");
    }

    /**
     * method reportSpecificSeller returns a String where due to a specific seller a report is written/calculated
     * @param seller
     * @return
     */
    public static String reportSpecificSeller(Seller seller) {
        double totalSales = 0;
        int amount = 0;
        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().getAlcoholPercent() > 16) {
                totalSales += cashRegisterList.get(i).getDrink().getPrice();
                amount += cashRegisterList.get(i).getAmount();
            }
        }
        return ("Total sales of seller " + seller + ": "  + totalSales + " currency unit, " + amount + " drinks (tea and coffee variations).");
    }

    /**
     * method reportSpecificDaySeller returns a String where due to a specific date and seller a report is written/calculated
     * @param date
     * @param seller
     * @return
     */
    public static String reportSpecificDaySeller(Date date, Seller seller) {
        double totalSales = 0;
        int amount = 0;
        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().getAlcoholPercent() > 16) {
                totalSales += cashRegisterList.get(i).getDrink().getPrice();
                amount += cashRegisterList.get(i).getAmount();
            }
        }
        return ("Total sales of seller " + seller + " on " + date + ": " + totalSales + " currency unit, " + amount + " drinks (tea and coffee variations).");
    }


    /**
     * method randomNumber gives back a random number in a given range
     * @param min
     * @param max
     * @return
     */
    public static double randomNumber(double min, double max) {
        double randomNum;
        randomNum = (int) ((Math.random() * (max - min)) + min);
        return randomNum;
    }
}
