package at.fhj.iit;

import java.util.Date;

public class Tea extends Drink implements Selling {

    Liquid water;
    Liquid rum;
    String herbs;
    String name;
    double volume;
    double alcoholPercent;
    double amountInLWater;
    double amountInLRum;

    /**
     * TEA
     *
     * @param name  name of tea (e.g. white tea with blueberries, Winterwonderland)
     * @param herbs kind of tea (e.g. herbal, black, white, fruit, mixed)
     */
    public Tea(String name, Double amountInLWater, Double amountInLRum, String herbs) {
        super(name);
        water = new Liquid("water", amountInLWater, 0);
        rum = new Liquid("rum", amountInLRum, 20);
        this.water = water;
        this.rum = rum;
        this.amountInLWater = amountInLWater;
        this.amountInLRum = amountInLRum;
        this.herbs = herbs;
        this.name = name;

        this.volume = water.getVolume() + rum.getVolume();
        this.alcoholPercent = water.getVolume() * water.getAlcoholPercent() + rum.getVolume() * rum.getAlcoholPercent();

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

    public String toString() {
        return "Tea called " + name + " with rum. Has in total " + alcoholPercent + " percent alcohol by volume.";
    }

    /**
     *
     * @return amount in L from water
     */
    public double getAmountInLWater() {
        return amountInLWater;
    }

    /**
     *
     * @return  amount in L from rum
     */
    public double getAmountInLRum() {
        return amountInLRum;
    }

    /**
     *
     * @return  name of tea
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return  name of herbs
     */
    public String getHerbs() {
        return herbs;
    }


    /**
     *
     * @return  kind of liquid: water
     */
    public Liquid getWater() {
        return water;
    }

    /**
     *
     * @return  kind of liquid: rum
     */
    Liquid getRum() {
        return rum;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public String getSeller() {
        return null;
    }
}
