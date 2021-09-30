package stepik.basiccourse.all.logging43.task1;

import java.util.Arrays;
import java.util.logging.*;

public class MainDemo {
    private static final Logger LOGGER = Logger.getLogger(MainDemo.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Stared with arguments: {0}", Arrays.toString(args));

        try {
            ramdomlyFailingAlgorithm();
        } catch (IllegalStateException e) {
            LOGGER.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }

        LOGGER.log(Level.FINE, "Finished successfully");
    }

    private static void ramdomlyFailingAlgorithm() {
        double randomeNumber = Math.random();
        LOGGER.log(Level.FINE, "Generated random number: {0}", randomeNumber);
        if (randomeNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of Moon");
        }
    }
}
