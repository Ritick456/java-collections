package com.bridgelabz.reflection.advanced.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class CustomObjectMapper {


    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
          
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();
                
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Allow modification of private fields
                field.set(instance, fieldValue);
            }
          
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping properties to object", e);
        }
    }


}
