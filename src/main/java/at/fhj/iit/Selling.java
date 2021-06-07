package at.fhj.iit;
import java.util.Date;

/**
 * Interface for sellable Objects
 */
public interface Selling {

    public double getPrice();

    public Date getDate();

    public boolean isAlcoholic();

    public double getAlcoholPercent();
}
