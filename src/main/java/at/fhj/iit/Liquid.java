package at.fhj.iit;

/**
 * represents a liquid which can be used in drinks
 */
public class Liquid {
    /**
     * name of liquid
     */
    private String name;
    /**
     * volume of liquid (in liter)
     */
    private double volume;

    /**
     * alcoholPercent of liquid (in percent eg. 42)
     */
    private double alcoholPercent;

    /**
     * Creates new liquid with given name, volume and
     * alcoholPercent
     *
     * @param name name of liquid
     * @param volume volume of liquid
     * @param alcoholPercent of liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        checkVolume(volume);

        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    private void checkVolume(double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("liquid " + name + " must have a volume > 0");
        }
    }

    /**
     * Getter for name
     *
     * @return name of liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for volume
     *
     * @return volume of liquid (in liter)
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     *
     * @param volume new volume
     */
    public void setVolume(double volume) {
        checkVolume(volume);
        this.volume = volume;
    }

    /**
     * Getter for alcoholPercent
     *
     * @return alcoholPercent (e.g. 40)
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Setter for alcoholPercent
     *
     * @param alcoholPercent new alcoholPercent
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }


    /**
     * equals method which compares this object to anotherone of its kind
     * @param obj Liquid object to compare with this object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        Liquid liquid;

        if (obj instanceof Liquid) {
            liquid = (Liquid)obj;

            if (this.volume == liquid.getVolume() && this.alcoholPercent == liquid.getAlcoholPercent() && this.name == liquid.name)
                return true;
        }

        return false;
    }
}
