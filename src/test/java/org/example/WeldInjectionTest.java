package org.example;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WeldInjectionTest {

    @Test
    void shouldResolveDependenciesWithWeld() {
        Weld weld = new Weld();

        try (WeldContainer container = weld.initialize()) {
            SimpleNotificationService service =
                    container.select(SimpleNotificationService.class).get();

            assertNotNull(service);

            assertDoesNotThrow(() ->
                    service.notifyUser("Test message")
            );
        }
    }

}


