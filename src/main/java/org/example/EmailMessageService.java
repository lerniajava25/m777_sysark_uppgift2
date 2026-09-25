package org.example;

import jakarta.enterprise.context.Dependent;

@Dependent
public class EmailMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}



