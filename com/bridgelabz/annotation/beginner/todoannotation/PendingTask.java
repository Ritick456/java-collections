package com.bridgelabz.annotation.beginner.todoannotation;

import java.lang.reflect.Method;

public class PendingTask {

    public static void main(String[] args) {

    Method[] methods = Project.class.getDeclaredMethods();

    for(Method method : methods){

        if(method.isAnnotationPresent(Todo.class)){

            Todo annotatedMethod = method.getAnnotation(Todo.class);

            System.out.println("Method Name " + method.getName() + "Task Informaton " + annotatedMethod.assignedTo() + " " + annotatedMethod.priority() +  " " + annotatedMethod.task());

        }

    }
}
}
