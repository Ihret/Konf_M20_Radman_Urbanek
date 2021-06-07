package at.fhj.iit;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Liquid l = new Liquid("Wein", 0.125, 13);

        Drink d = new SimpleDrink("Rotwein", l);
        System.out.println(d);

        Drink c = new Coffee("Capuccino", 0.2, 0.025, 7);
        System.out.println(c);
        Tea t = new Tea("Winterwonderland", 0.4, 0.002, "mixed");
        System.out.println(t);

    }
}