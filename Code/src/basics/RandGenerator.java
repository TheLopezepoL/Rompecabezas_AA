package basics;

import java.util.Random;

public class RandGenerator {
    private static final Random RAND = new Random();

    public static int randInt(int pMin, int pMax){
        return RAND.nextInt(pMax - pMin + 1) + pMin;
    }

    public static boolean tryPercentage(double pAcceptPercentage) {
        return (randInt(0, 99) + RAND.nextDouble()) <= pAcceptPercentage;
    }

}
