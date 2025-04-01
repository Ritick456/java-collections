package com.bridgelabz.reflection.advanced.generateajsonrepresentation;

import java.lang.reflect.Field;

public class JsonSerializer {
    
    public static String toJson(Object obj){
        try{

            Class<?> clazz = obj.getClass();

            StringBuilder jsonBuilder = new StringBuilder("{");

            Field[] fields = clazz.getDeclaredFields();

            for(Field field : fields){

                field.setAccessible(true);

                String key = field.getName();
                Object value = field.get(obj);

                jsonBuilder.append("\"" + key + "\": ");

                if(value instanceof String){
                    jsonBuilder.append("\"" + value + "\"");
                }
                else{
                    jsonBuilder.append(value);
                }
            }

            jsonBuilder.append("}");
            return jsonBuilder.toString();
        }
        catch(Exception e){
            throw new RuntimeException("Error serializing object to JSON", e);
        }
    }
    
}
