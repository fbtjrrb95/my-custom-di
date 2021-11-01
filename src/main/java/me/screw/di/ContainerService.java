package me.screw.di;

import java.lang.reflect.InvocationTargetException;

public class ContainerService {

    public static <T> T getObject(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException();
        }
    }

}
