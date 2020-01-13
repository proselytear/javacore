package ua.epam.javacore.lesson_15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    public static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("TEST INFO");
        logger.trace("TEST TRACE");
        logger.warn("TEST WARN");
        logger.debug("TEST DEBUG");
        logger.error("TEST ERROR");
    }
}