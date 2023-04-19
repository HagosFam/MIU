package jms;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CalculatorMessageListener {
    int result = 0;

    @JmsListener(destination = "calculatorQueue")
    public void recieveCalculatorMessage(final String calculatorMessage) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Calcultor calcultor = objectMapper.readValue(calculatorMessage, Calcultor.class);
            System.out.println("Recieved message " + calcultor.getOperator() + calcultor.getNumber());


            switch (calcultor.getOperator()) {
                case "+":
                    result = result + calcultor.getNumber();
                    break;
                case "-":
                    result = result - calcultor.getNumber();
                    break;
                case "*":
                    result = result * calcultor.getNumber();
                    break;
            }
            System.out.println("=================calculation result");
            System.out.println("Result " + result);

        } catch (IOException e) {
            System.out.println("Error in converting " + calculatorMessage + "into calculator object");
        }


    }

}
