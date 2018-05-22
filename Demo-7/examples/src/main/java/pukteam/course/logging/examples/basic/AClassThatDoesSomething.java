package pukteam.course.logging.examples.basic;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AClassThatDoesSomething {

    private static Logger logger = LogManager.getLogger(AClassThatDoesSomething.class);
    private static final int TOTAL_TIMES = 1000;
    public static void foo() {
        for (int i = 0; i < TOTAL_TIMES; i++) {
            logger.log(Level.TRACE, "This is a TRACE message from foo # " + i);
            logger.log(Level.DEBUG, "This is a DEBUG message from foo # " + i);
            logger.log(Level.INFO, "This is a INFO message from foo #" + i);
            logger.log(Level.WARN, "This is a WARN message from foo #" + i);
            logger.log(Level.ERROR, "This is a ERROR message from foo #" + i);
            logger.log(Level.FATAL, "This is a FATAL message from foo #" + i);
        }
    }
}
