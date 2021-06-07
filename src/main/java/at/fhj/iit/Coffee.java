package at.fhj.iit;

import java.util.Date;

/**
 * COFFEE
 * Represents all types of nonalcoholic Coffee.
 */
public class Coffee extends Drink implements Selling {

    Liquid water;
    Liquid milk;
    int strength;
    double volume;


    /**
     * COFFEE Constructor
     * @param name
     * @param literWater
     * @param literMilk
     * @param strength From 1-10, where 1 ist the weak and 10 is strong. Over- or underflow will be set to 10 resp. 1.
     */
    public Coffee(String name, double literWater, double literMilk, int strength) {
        super(name);
        this.water = new Liquid("Water",literWater,0.00);
        this.milk = new Liquid("Milk",literMilk,0.00);

        if (strength > 10)
            this.strength = 10;
        else if (strength < 1)
            this.strength = 1;
        else
            this.strength = strength;

        this.volume = (1.00/this.strength) * water.getVolume() + milk.getVolume();
        // Rounding without Math
        this.volume = ((double)((int)(this.volume*1000)))/1000;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Coffee coffee;

        if (obj instanceof Coffee) {
            coffee = (Coffee) obj;

            if (this.name == coffee.getName() && this.strength == coffee.getStrength() && this.volume == coffee.getVolume() &&
                    this.water.equals(coffee.getWater()) && this.milk.equals(coffee.getMilk()))
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
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }

    public String toString() {
        return "A coffee called " + this.name + ". It has a volume of " + this.volume + " liter and consists of " + this.milk.getVolume() + " liter milk.";
    }

    int getStrength() {
        return this.strength;
    }

    Liquid getWater() {
        return this.water;
    }

    Liquid getMilk() {
        return this.milk;
    }

    @Override
    public double getPrice() {
        return ((double)((int)(((this.water.getVolume() + this.milk.getVolume()) * 0.016 + this.strength * 0.16)*100)))/100;
    }

    @Override
    public Date getDate() {
        return new Date(System.currentTimeMillis());
    }
}
