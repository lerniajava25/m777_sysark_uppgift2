package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Weld weld = new Weld();

        try (WeldContainer container = weld.initialize()) {
            SimpleNotificationService notificationService =
                    container.select(SimpleNotificationService.class).get();

            notificationService.notifyUser("Hello from Weld CDI!");
        }
    }

}



