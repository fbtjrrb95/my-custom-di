package me.screw.di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService {

    public static <T> T getObject(Class<T> classType) {
        try {
            T instance = classType.getConstructor().newInstance();
            Arrays.stream(classType.getDeclaredFields()).forEach(f -> {
                Autowired annotation = f.getAnnotation(Autowired.class);
                if (annotation != null) {
                    try {
                        Object fieldInstance = f.getType().getConstructor().newInstance();
                        f.setAccessible(true);
                        f.set(instance, fieldInstance);
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                        throw new RuntimeException();
                    }
                }
            });
            return instance;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException();
        }
    }

}
