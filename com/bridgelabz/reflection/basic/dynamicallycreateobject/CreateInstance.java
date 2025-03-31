package com.bridgelabz.reflection.basic.dynamicallycreateobject;


import java.lang.reflect.Constructor;

public class CreateInstance {
    public static void main(String[] args) throws Exception {
        

        Class<?> cls = Student.class;

        Constructor<?> constructor = cls.getConstructor(String.class);

        Student student = (Student) constructor.newInstance("Ritick");

        student.display();



    }
}
