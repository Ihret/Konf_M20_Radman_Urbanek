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
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
    Selling drink;
    private int amountOfDrinks;
    private static String date;
    private static CashRegister cash;
    private Seller seller;
    private static Tea tea;
    private static Coffee coffee;


    /**
     * constructor CashRegister, creates a object with paramters: Selling drink, int amount, DAte date, Seller seller
     * @param drink
     * @param amountOfDrinks
     * @param seller
     */
    public CashRegister(Selling drink, int amountOfDrinks, Seller seller) {
        this.drink = drink;
        this.amountOfDrinks = amountOfDrinks;
        this.seller = seller;
        this.date = sdf.format(drink.getDate());
    }


    /**
     * method sellDrink sells one kind of drink
     * @param cashRegister
     */
    public static void sellDrink(CashRegister cashRegister) {
        cashRegisterList.add(cashRegister);
    }


    /**
     * Calculates the sales volume of all non Alcoholic Drinks
     * @return
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
     * @return
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
     * @return
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
     * @param date
     * @return
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
     * @param seller
     * @return
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
     * @param date
     * @param seller
     * @return
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
     *
     * @param obj
     * @return
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
    public int getAmountOfDrinks() {
        return amountOfDrinks;
    }


    /**
     * method setAmount sets the amount of a drink
     * @param amountOfDrinks
     */
    public void setAmountOfDrinks(int amountOfDrinks) {
        this.amountOfDrinks = amountOfDrinks;
    }

    /**
     * method getDate gets the date
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * method setDate sets a date via SimpleDateFormat with only the day without time
     * @param date
     */
    public void setDate(Date date) {
        this.date = sdf.format(date);
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


    static List<CashRegister> getCashRegisterList() {
        return cashRegisterList;
    }

    static void setCashRegisterList(List<CashRegister> cashRegisterList) {
        CashRegister.cashRegisterList = cashRegisterList;
    }
}
