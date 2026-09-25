package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ManualInjectionTest {

    @Test
    void shouldCreateNotificationServiceWithDependency() {
        MessageService messageService = new EmailMessageService();
        NotificationService notificationService =
                new SimpleNotificationService(messageService);

        assertDoesNotThrow(() ->
                notificationService.notifyUser("Test message")
        );
    }
}




