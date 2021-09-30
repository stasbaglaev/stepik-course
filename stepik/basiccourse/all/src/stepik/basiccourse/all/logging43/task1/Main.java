package stepik.basiccourse.all.logging43.task1;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getName());
        configureLogging();
    }

    private static void configureLogging() {
        Logger loggerClassA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerClassA.setLevel(Level.ALL);
        Logger loggerClassB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerClassB.setLevel(Level.WARNING);
        Logger logger = Logger.getLogger("org.stepic.java");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new XMLFormatter());
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
    }
}
