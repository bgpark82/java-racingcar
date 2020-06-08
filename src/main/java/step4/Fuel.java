package step4;

import java.util.Random;

public class Fuel {

    private static int MAXIMUM_NUMBER = 9;
    private int fuel;

    public Fuel() {
        this.fuel = getRandom();
    }


    private int getRandom() {
        return new Random(MAXIMUM_NUMBER).nextInt();
    }

    public boolean equals(Object o) {
        Fuel f = (Fuel) o;
        return getClass().equals(f.getClass());
    }


}
