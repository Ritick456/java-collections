package com.bridgelabz.annotation.intermediate.maxlength;

import java.lang.reflect.Field;

public class User {
    
    @MaxLength(10)
    private String userName;


    User(String username){
        validateMaxLength(this, username);
        this.userName = username;
    }

    public String getUsername(){
        return this.userName;
    }


    public void validateMaxLength (User obj , String username){
        
        Field[] fields = obj.getClass().getDeclaredFields();

        for(Field field : fields){

            if(field.isAnnotationPresent(MaxLength.class)){

                MaxLength annotation = field.getAnnotation(MaxLength.class);

                int annotationValue = annotation.value();

                if(username.length() > annotationValue){
                    throw new IllegalArgumentException("Username not valid excedd maximum length");
                }
            }

        }

    }
}
