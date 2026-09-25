package org.example;

import java.lang.reflect.Constructor;

public class Container {

    public <T> T getInstance(Class<T> type) {
        try {
            if (type == MessageService.class) {
                return type.cast(new EmailMessageService());
            }

            Constructor<?> constructor = type.getDeclaredConstructors()[0];

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] dependencies = new Object[parameterTypes.length];

            for (int i = 0; i < parameterTypes.length; i++) {
                dependencies[i] = getInstance(parameterTypes[i]);
            }

            return type.cast(constructor.newInstance(dependencies));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



