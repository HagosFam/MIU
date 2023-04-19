package com.example.TaxService;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TaxServiceListener {

    @JmsListener(destination = "bankSender")
    public void receiveBankMessage(final String message) {
            System.out.println("Receieving message from bank " + message );
    }

}
