package org.example;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class SimpleNotificationService implements NotificationService {

    private final MessageService messageService;

    @Inject
    public SimpleNotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}



