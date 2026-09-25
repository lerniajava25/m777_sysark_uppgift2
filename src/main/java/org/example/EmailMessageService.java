package org.example;

public class EmailMessageService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
