package com.bridgelabz.annotation.beginner.markimportantmethod;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        
        Method[] methods = TaskManager.class.getDeclaredMethods();

        for(Method method : methods){


            if(method.isAnnotationPresent(MarkImportantMethod.class)){

                MarkImportantMethod markedmethod = method.getAnnotation(MarkImportantMethod.class);

                System.out.println("Method Name " + method.getName() + "Level :" + markedmethod.level());

            }
        }


    }
}
