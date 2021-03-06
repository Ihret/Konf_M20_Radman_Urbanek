package at.fhj.iit;

import java.util.Date;

/**
 * TEA
 * Represents all types of alcoholic and nonalcoholic Teas.
 */
public class Tea extends Drink implements Selling {

    Liquid water;
    Liquid rum;
    String herbs;
    String name;
    double volume;
    double alcoholPercent;

    /**
     * TEA
     * @param name  name of tea (e.g. white tea with blueberries, Winterwonderland)
     * @param herbs kind of tea (e.g. herbal, black, white, fruit, mixed)
     */
    public Tea(String name, Double amountInLWater, Double amountInLRum, String herbs) {
        super(name);
        water = new Liquid("water", amountInLWater, 0);
        rum = amountInLRum <= 0 ? null : new Liquid("rum", amountInLRum, 20);
        this.herbs = herbs;
        this.name = name;

        this.volume = water.getVolume() + rum.getVolume();
        this.alcoholPercent = water.getVolume() * water.getAlcoholPercent() + rum.getVolume() * rum.getAlcoholPercent();

    }

    /**
     * equals method which compares this object to anotherone of its kind
     * @param obj Tea object to compare with this object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        Tea tea;

        if (obj instanceof Tea) {
            tea = (Tea) obj;

            if (this.name == tea.getName() && this.herbs == tea.getHerbs() && this.volume == tea.getVolume() && this.alcoholPercent == tea.getAlcoholPercent() &&
                    this.water.equals(tea.getWater()) && this.rum.equals(tea.getRum()))
                return true;
        }

        return false;
    }


    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return this.volume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    /**
     * toString-Method implements information about volume of rum and alcohol percent.
     * @return String
     */
    public String toString() {
        return "Tea called " + name + " with rum. Has in total " + alcoholPercent + " percent alcohol by volume.";
    }

    /**
     * method getName returns the name of the tea
     * @return  name of tea
     */
    public String getName() {
        return name;
    }

    /**
     * method getHerbs returns the name of the used herbs in the tea
     * @return  name of herbs
     */
    public String getHerbs() {
        return herbs;
    }


    /**
     * method getWWater returns the liquid water
     * @return  kind of liquid: water
     */
    public Liquid getWater() {
        return water;
    }

    /**
     * method getRum returns the liquid rum
     * @return  kind of liquid: rum
     */
    public Liquid getRum() {
        return rum;
    }

    /**
     * Calculates the price through informations in the member variables
     * @return double
     */
    @Override
    public double getPrice() {
        return ((double)((int)((water.getVolume() * 14.5455 + rum.getVolume() * 100)*100)))/100;
    }

    /**
     * calculates the current date
     * @return Date
     */
    @Override
    public Date getDate() {
        return new Date(System.currentTimeMillis());
    }
}

