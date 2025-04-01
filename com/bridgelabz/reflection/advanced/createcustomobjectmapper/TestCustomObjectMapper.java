package com.bridgelabz.reflection.advanced.createcustomobjectmapper;

import java.util.Map;

public class TestCustomObjectMapper {
    public static void main(String[] args) {
        
        Map<String , Object> map = Map.of("name" , "Alice" 
        , "age" , 25);

        User user = CustomObjectMapper.toObject(User.class, map);

        System.out.println("User Name: " + user.getName());
        System.out.println("User Age: " + user.getAge());
        
    }
}
