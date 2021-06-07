package at.fhj.iit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Implements a CashRegister via ArrayList to store all sellings, a constructor for sold objects and methods for reports.
 */
public class CashRegister {

    // initiate varies variables
    private static List<CashRegister> cashRegisterList = new ArrayList<CashRegister>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
    private Selling drink;
    private int amountOfDrinks;
    private static String date;
    private static CashRegister cash;
    private Seller seller;
    private static Tea tea;
    private static Coffee coffee;


    /**
     * constructor CashRegister, creates a object with paramters: Selling drink, int amount, DAte date, Seller seller
     * @param drink represents the Selling drink, that has been sold - needs to be constructed
     * @param amountOfDrinks number of drinks consumed of this same type with this order
     * @param seller Enum Seller who sold it
     */
    public CashRegister(Selling drink, int amountOfDrinks, Seller seller) {
        this.drink = drink;
        this.amountOfDrinks = amountOfDrinks;
        this.seller = seller;
        this.date = sdf.format(drink.getDate());
    }


    /**
     * method sellDrink sells any kind of drink
     * @param cashRegister CashRegister-Objekt which has been solds and saved into the central ArrayList
     */
    public static void sellDrink(CashRegister cashRegister) {
        cashRegisterList.add(cashRegister);
    }


    /**
     * Calculates the sales volume of all non Alcoholic Drinks
     * @return double
     */
    public static double reportNoneAlcoholicDrinks() {
        double sales = 0;

        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (!cashRegisterList.get(i).getDrink().isAlcoholic()) {
                sales += cashRegisterList.get(i).getDrink().getPrice() * cashRegisterList.get(i).getAmountOfDrinks();
            }
        }

        return sales;
    }


    /**
     * Calculates the sales volume of all low Alcoholic Drinks (lower or equal 16%)
     * @return double
     */
    public static double reportLowAlcoholicDrinks() {
        double sales = 0;

        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().isAlcoholic() && cashRegisterList.get(i).getDrink().getAlcoholPercent() <= 16) {
                sales += cashRegisterList.get(i).getDrink().getPrice() * cashRegisterList.get(i).getAmountOfDrinks();
            }
        }

        return sales;
    }

    /**
     * Calculates the sales volume of all high Alcoholic Drinks (higher than 16%)
     * @return double
     */
    public static double reportHighAlcoholicDrinks() {
        double sales = 0;

        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDrink().getAlcoholPercent() > 16) {
                sales += cashRegisterList.get(i).getDrink().getPrice() * cashRegisterList.get(i).getAmountOfDrinks();
            }
        }

        return sales;
    }

    /**
     * Calculates the sales volume of all Drinks on a specific day
     * @param date is a Date for which all sellings should be calculated to sales amount
     * @return double
     */
    public static double reportSpecificDay(Date date) {
        double sales = 0;

        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getDate().equals(sdf.format(date))) {
                sales += cashRegisterList.get(i).getDrink().getPrice() * cashRegisterList.get(i).getAmountOfDrinks();
            }
        }
        return sales;
    }

    /**
     * Calculates the sales volume of all Drinks sold by a specific seller
     * @param seller enum Seller for which all sellings should be calculated to sales amount
     * @return double
     */
    public static double reportSpecificSeller(Seller seller) {
        double sales = 0;

        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getSeller().equals(seller)) {
                sales += cashRegisterList.get(i).getDrink().getPrice() * cashRegisterList.get(i).getAmountOfDrinks();
            }
        }
        return sales;
    }

    /**
     * Calculates the sales volume of all Drinks sold by a specific seller on a specific day
     * @param date is a Date for which all sellings should be calculated to sales amount
     * @param seller enum Seller for which all sellings should be calculated to sales amount
     * @return double
     */
    public static double reportSpecificDaySeller(Date date, Seller seller) {
        double sales = 0;

        for (int i = 0; i < cashRegisterList.size(); i++) {
            if (cashRegisterList.get(i).getSeller().equals(seller) && cashRegisterList.get(i).getDate().equals(sdf.format(date))) {
                sales += cashRegisterList.get(i).getDrink().getPrice() * cashRegisterList.get(i).getAmountOfDrinks();
            }
        }
        return sales;
    }


    /**
     * equals method which compares this object to anotherone of its kind
     * @param obj CashRegister object to compare with this object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        CashRegister cashRegister;

        if (obj instanceof CashRegister) {
            cashRegister = (CashRegister) obj;

            if (this.drink.equals(cashRegister.getDrink()) && this.amountOfDrinks == cashRegister.getAmountOfDrinks() && this.seller == cashRegister.getSeller())
                return true;
        }

        return false;
    }

    // GETTER AND SETTER

    static List<CashRegister> getCashRegisterList() {
        return cashRegisterList;
    }

    /**
     * method getDrink returns the kind of drink
     * @return
     */
    public Selling getDrink() {
        return drink;
    }

    /**
     * method getAmount gets the amount of a drink
     * @return amount
     */
    public int getAmountOfDrinks() {
        return amountOfDrinks;
    }

    /**
     * method getDate gets the date
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * method getSeller gets the name of the seller which is to choose from an enum list called Seller
     * @return
     */
    public Seller getSeller() {
        return seller;
    }
}
