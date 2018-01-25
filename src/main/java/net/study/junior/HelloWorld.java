package net.study.junior;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class HelloWorld {
    private static final Logger log = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) throws InterruptedException {
        while (true) {

            Thread.sleep(1000);
            log.debug("Debugging Message");
            log.info("Informational message");
            log.warn("Warning Message");
        }
    }
}
