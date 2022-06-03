package com.co.sofkau.utilities.message;

import org.jboss.logging.Logger;

public class Message {

    private static final Logger logger = Logger.getLogger(Message.class);

    public static Message getInstance() {
        return new Message();
    }

    public void showWelcome() {
        logger.info("Esta es una calculadora en Java bajo el paradigma de POO");
    }
}
