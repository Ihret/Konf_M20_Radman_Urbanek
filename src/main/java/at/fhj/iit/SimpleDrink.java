package at.fhj.iit;

import java.util.Date;

/**
 * represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink extends Drink implements Selling {

    /**
     * uses only one liquid
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    /**
     * toString-Method implements information about alcohol and name.
     * @return String
     */
    public String toString(){
        return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }

    /**
     * Calculates the price through informations in the member variables
     * @return double
     */
    @Override
    public double getPrice() {
        return ((double)((int)(((1 + l.getAlcoholPercent()) / 0.7) * getVolume()*100)))/100;
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
