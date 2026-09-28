package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ContainerTest {

    @Test
    void shouldResolveDependenciesRecursively() {
        Container container = new Container();

        SimpleNotificationService service =
                container.getInstance(SimpleNotificationService.class);

        assertNotNull(service);

        assertDoesNotThrow(() ->
                service.notifyUser("Test message")
        );
    }

}



