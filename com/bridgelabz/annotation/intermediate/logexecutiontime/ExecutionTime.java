package com.bridgelabz.annotation.intermediate.logexecutiontime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecutionTime {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{

        TaskProcessor processor = new TaskProcessor();

        Method[] methods = TaskProcessor.class.getDeclaredMethods();

        for(Method method : methods){

            if(method.isAnnotationPresent(LogExecutionTime.class)){
                long startTime = System.nanoTime();


                method.invoke(processor);

                long endTime = System.nanoTime();

                long duration  = endTime - startTime;

                System.out.println("Execution Time : "  + duration + " " + method.getName());
            }
        }
    }
}
