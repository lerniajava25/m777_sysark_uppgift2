package org.example;

public class SimpleNotificationService implements NotificationService {

    private final MessageService messageService;

    public SimpleNotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}



